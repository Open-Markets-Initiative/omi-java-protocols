package omi.cboe.c1options.complex.pitch.v2_1_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c1options.complex.pitch.v2_1_18.fields.ComplexInstrumentIdField2;
import omi.cboe.c1options.complex.pitch.v2_1_18.fields.ComplexInstrumentTypeField;
import omi.cboe.c1options.complex.pitch.v2_1_18.fields.ComplexInstrumentUnderlyingField;
import omi.cboe.c1options.complex.pitch.v2_1_18.fields.LegCountField;
import omi.cboe.c1options.complex.pitch.v2_1_18.fields.TimeOffsetField;
import omi.cboe.c1options.complex.pitch.v2_1_18.groups.ComplexInstrumentLegEntry;
import omi.cboe.c1options.complex.pitch.v2_1_18.groups.ComplexInstrumentLegList;
import omi.cboe.c1options.complex.pitch.v2_1_18.types.Field;
import omi.cboe.c1options.complex.pitch.v2_1_18.types.Message;
import omi.cboe.c1options.complex.pitch.v2_1_18.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDefinitionExpandedMessage message from the Complex protocol.
 *
 * <p>A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders.</p>
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
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id right padded with spaces.
     */
    private final ComplexInstrumentIdField2 complexInstrumentId = new ComplexInstrumentIdField2();

    /**
     * Complex Instrument Underlying right padded with spaces.
     */
    private final ComplexInstrumentUnderlyingField complexInstrumentUnderlying = new ComplexInstrumentUnderlyingField();

    /**
     * 4 character field; each field describes a characteristic.
     */
    private final ComplexInstrumentTypeField complexInstrumentType = new ComplexInstrumentTypeField();

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 12.
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * Leg for multi-leg strategies
     */
    private final ComplexInstrumentLegList complexInstrumentLeg = new ComplexInstrumentLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentId, complexInstrumentUnderlying, complexInstrumentType, legCount);

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
     * Complex Instrument Id right padded with spaces.
     *
     * @return the ComplexInstrumentId field
     */
    public ComplexInstrumentIdField2 complexInstrumentId() {
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
     * 4 character field; each field describes a characteristic.
     *
     * @return the ComplexInstrumentType field
     */
    public ComplexInstrumentTypeField complexInstrumentType() {
        return complexInstrumentType;
    }

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 12.
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * Leg for multi-leg strategies
     *
     * <p>Encode writes this list's size to the LegCount field.</p>
     *
     * @return the ComplexInstrumentLeg entries
     */
    public ComplexInstrumentLegList complexInstrumentLeg() {
        return complexInstrumentLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexInstrumentLeg.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 6;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor = complexInstrumentLeg.padding(runs, cursor);
        return cursor;
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
        cursor += ComplexInstrumentIdField2.BYTE_LENGTH;
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
        if (!complexInstrumentLeg.parse(data, cursor, end, legCount.value())) {
            return false;
        }
        cursor += complexInstrumentLeg.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexInstrumentLeg.size() > 255) {
            throw new IllegalStateException("complexInstrumentLeg holds " + complexInstrumentLeg.size() + " entries, more than its count field can state");
        }
        legCount.value((short) complexInstrumentLeg.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentId.encode(data, cursor);
        cursor = complexInstrumentUnderlying.encode(data, cursor);
        cursor = complexInstrumentType.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = complexInstrumentLeg.encode(data, cursor);
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
        complexInstrumentLeg.clear();
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
        if (!complexInstrumentLeg.isRecognized()) {
            return false;
        }
        return true;
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
        if (!complexInstrumentLeg.isValid()) {
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
        if (!complexInstrumentLeg.isDecoded()) {
            return Optional.of(complexInstrumentLeg.failedEntry().flatMap(ComplexInstrumentLegEntry::failedAt).orElse(legCount));
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
        changed.addAll(complexInstrumentLeg.diffFields(message.complexInstrumentLeg));
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
            complexInstrumentLeg.toFormattedString(builder, options);
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
        complexInstrumentLeg.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && complexInstrumentLeg.equals(message.complexInstrumentLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexInstrumentLeg);
    }
}
