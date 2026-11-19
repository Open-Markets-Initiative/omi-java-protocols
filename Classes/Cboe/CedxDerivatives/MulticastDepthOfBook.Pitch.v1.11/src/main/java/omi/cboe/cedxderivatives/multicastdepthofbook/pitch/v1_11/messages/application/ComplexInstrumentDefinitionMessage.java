package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ComplexInstrumentIdField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.LegCountField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.ReferencePriceField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.fields.TimeOffsetField;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.groups.LegGroupEntry;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.groups.LegGroupList;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.Field;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.Message;
import omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDefinitionMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>A Complex Instrument Definition message represents a complex instrument that is available to place orders</p>
 */
public final class ComplexInstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id
     */
    private final ComplexInstrumentIdField complexInstrumentId = new ComplexInstrumentIdField();

    /**
     * Collared VMIM price
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * The number of legs in the complex instrument
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * Leg
     */
    private final LegGroupList legGroup = new LegGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentId, referencePrice, legCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Complex Instrument Id
     *
     * @return the ComplexInstrumentId field
     */
    public ComplexInstrumentIdField complexInstrumentId() {
        return complexInstrumentId;
    }

    /**
     * Collared VMIM price
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * The number of legs in the complex instrument
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * Leg
     *
     * <p>Encode writes this list's size to the LegCount field.</p>
     *
     * @return the LegGroup entries
     */
    public LegGroupList legGroup() {
        return legGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legGroup.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!complexInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentIdField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!legGroup.parse(data, cursor, end, legCount.value())) {
            return false;
        }
        cursor += legGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legGroup.size() > 255) {
            throw new IllegalStateException("legGroup holds " + legGroup.size() + " entries, more than its count field can state");
        }
        legCount.value((short) legGroup.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentId.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = legGroup.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        legGroup.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCount && !field.isRecognized()) {
                return false;
            }
        }
        return legGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCount && !field.isValid()) {
                return false;
            }
        }
        if (!legGroup.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        if (!timeOffset.isDecoded()) {
            return Optional.of(timeOffset);
        }
        if (!complexInstrumentId.isDecoded()) {
            return Optional.of(complexInstrumentId);
        }
        if (!referencePrice.isDecoded()) {
            return Optional.of(referencePrice);
        }
        if (!legCount.isDecoded()) {
            return Optional.of(legCount);
        }
        if (!legGroup.isDecoded()) {
            return Optional.of(legGroup.failedEntry().flatMap(LegGroupEntry::failedAt).orElse(legCount));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TimeOffset" -> Optional.of(timeOffset);
            case "ComplexInstrumentId" -> Optional.of(complexInstrumentId);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "LegCount" -> Optional.of(legCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legGroup.diffFields(message.legGroup));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            legGroup.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        legGroup.toFormattedString(builder, nested);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplexInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legGroup.equals(message.legGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legGroup);
    }
}
