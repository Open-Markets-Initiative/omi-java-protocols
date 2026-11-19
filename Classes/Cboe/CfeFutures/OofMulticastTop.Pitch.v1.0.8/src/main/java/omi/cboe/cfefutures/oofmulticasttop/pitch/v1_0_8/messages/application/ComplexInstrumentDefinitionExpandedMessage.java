package omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.ComplexInstrumentIdField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.ComplexInstrumentTypeField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.ComplexInstrumentUnderlyingField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.LegCountField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.fields.TimeOffsetField;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.groups.OptionLegEntry;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.groups.OptionLegList;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Field;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.Message;
import omi.cboe.cfefutures.oofmulticasttop.pitch.v1_0_8.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDefinitionExpandedMessage message from the OofMulticastTop protocol.
 *
 * <p>A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. This message can be sent either as a sequenced message or as an unsequenced message. It is sent as a sequenced message at system startup upon the beginning of a trading session or if an instrument is created or modified during a trading day. A new sequenced message may also be sent for a symbol that does not visibly change any attribute. A continuous loop of unsequenced symbol mapping messages (sequence = 0) is sent throughout the day at variable rates as bandwidth allows. The Time Offset field should be ignored on unsequenced messages. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions. Complex Instrument Definition Expanded messages are included in a spin response.</p>
 */
public final class ComplexInstrumentDefinitionExpandedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 23;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Definition Expanded Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id. Six character, base 62.
     */
    private final ComplexInstrumentIdField complexInstrumentId = new ComplexInstrumentIdField();

    /**
     * Complex Instrument Underlying right padded with spaces.
     */
    private final ComplexInstrumentUnderlyingField complexInstrumentUnderlying = new ComplexInstrumentUnderlyingField();

    /**
     * 4 character field; each field describes a characteristic. Character 1: Complex Option Type O = All legs are options Characters 2-4: Reserved
     */
    private final ComplexInstrumentTypeField complexInstrumentType = new ComplexInstrumentTypeField();

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 16.
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * The following fields repeat Leg Count times for multi-leg strategies. Leg Index is zero-based.
     */
    private final OptionLegList optionLeg = new OptionLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentId, complexInstrumentUnderlying, complexInstrumentType, legCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Complex Instrument Id. Six character, base 62.
     *
     * @return the ComplexInstrumentId field
     */
    public ComplexInstrumentIdField complexInstrumentId() {
        return complexInstrumentId;
    }

    /**
     * Complex Instrument Underlying right padded with spaces.
     *
     * @return the ComplexInstrumentUnderlying field
     */
    public ComplexInstrumentUnderlyingField complexInstrumentUnderlying() {
        return complexInstrumentUnderlying;
    }

    /**
     * 4 character field; each field describes a characteristic. Character 1: Complex Option Type O = All legs are options Characters 2-4: Reserved
     *
     * @return the ComplexInstrumentType field
     */
    public ComplexInstrumentTypeField complexInstrumentType() {
        return complexInstrumentType;
    }

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 16.
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * The following fields repeat Leg Count times for multi-leg strategies. Leg Index is zero-based.
     *
     * <p>Encode writes this list's size to the LegCount field.</p>
     *
     * @return the OptionLeg entries
     */
    public OptionLegList optionLeg() {
        return optionLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + optionLeg.byteLength();
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
        if (!complexInstrumentUnderlying.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentUnderlyingField.BYTE_LENGTH;
        if (!complexInstrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentTypeField.BYTE_LENGTH;
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!optionLeg.parse(data, cursor, end, legCount.value())) {
            return false;
        }
        cursor += optionLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (optionLeg.size() > 255) {
            throw new IllegalStateException("optionLeg holds " + optionLeg.size() + " entries, more than its count field can state");
        }
        legCount.value((short) optionLeg.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentId.encode(data, cursor);
        cursor = complexInstrumentUnderlying.encode(data, cursor);
        cursor = complexInstrumentType.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = optionLeg.encode(data, cursor);
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
        optionLeg.clear();
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
        return optionLeg.isRecognized();
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
        if (!optionLeg.isValid()) {
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
        if (!complexInstrumentUnderlying.isDecoded()) {
            return Optional.of(complexInstrumentUnderlying);
        }
        if (!complexInstrumentType.isDecoded()) {
            return Optional.of(complexInstrumentType);
        }
        if (!legCount.isDecoded()) {
            return Optional.of(legCount);
        }
        if (!optionLeg.isDecoded()) {
            return Optional.of(optionLeg.failedEntry().flatMap(OptionLegEntry::failedAt).orElse(legCount));
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
            case "ComplexInstrumentUnderlying" -> Optional.of(complexInstrumentUnderlying);
            case "ComplexInstrumentType" -> Optional.of(complexInstrumentType);
            case "LegCount" -> Optional.of(legCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentDefinitionExpandedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(optionLeg.diffFields(message.optionLeg));
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
            optionLeg.toFormattedString(builder, options);
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
        optionLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexInstrumentDefinitionExpandedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && optionLeg.equals(message.optionLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionLeg);
    }
}
