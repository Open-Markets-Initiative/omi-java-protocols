package omi.cboe.c1options.complex.pitch.v2_1_61.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.ComplexInstrumentIdShortField;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.ComplexInstrumentUnderlyingField;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.EdciSubtypeField;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.EdciTypeField;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.LegCountField;
import omi.cboe.c1options.complex.pitch.v2_1_61.fields.TimeOffsetField;
import omi.cboe.c1options.complex.pitch.v2_1_61.groups.EdcidLegEntry;
import omi.cboe.c1options.complex.pitch.v2_1_61.groups.EdcidLegList;
import omi.cboe.c1options.complex.pitch.v2_1_61.types.Field;
import omi.cboe.c1options.complex.pitch.v2_1_61.types.Message;
import omi.cboe.c1options.complex.pitch.v2_1_61.types.PrintOptions;

/**
 * Represents the ExchangeDesignatedComplexInstrumentDefinitionMessage message from the Complex protocol.
 *
 * <p>C1 Options Only. The Exchange Designated Complex Instrument Definition (EDCID) message represents supplemental information associated with an exchange-designated complex instrument and is sent as a sequenced message the first time it is sent. These messages are also sent continuously throughout the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on unsequenced EDCID messages. This message is sent in addition to a Complex Instrument Definition Expanded message for each exchange-designated complex instrument. The EDCID message contains two or more repeating groups of leg definitions. There is a limit of 16 leg definitions.</p>
 */
public final class ExchangeDesignatedComplexInstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 61;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Exchange Designated Complex Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id right padded with spaces.
     */
    private final ComplexInstrumentIdShortField complexInstrumentIdShort = new ComplexInstrumentIdShortField();

    /**
     * Complex Instrument Underlying right padded with spaces.
     */
    private final ComplexInstrumentUnderlyingField complexInstrumentUnderlying = new ComplexInstrumentUnderlyingField();

    /**
     * Exchange Designated Complex Instrument type right padded with spaces.
     */
    private final EdciTypeField edciType = new EdciTypeField();

    /**
     * Exchange Designated Complex Instrument subtype right padded with spaces.
     */
    private final EdciSubtypeField edciSubtype = new EdciSubtypeField();

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 16.
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * Repeating leg definition group inside the Exchange Designated Complex Instrument Definition message. Repeats Leg Count times.
     */
    private final EdcidLegList edcidLeg = new EdcidLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentIdShort, complexInstrumentUnderlying, edciType, edciSubtype, legCount);

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
     * Complex Instrument Id right padded with spaces.
     *
     * @return the ComplexInstrumentIdShort field
     */
    public ComplexInstrumentIdShortField complexInstrumentIdShort() {
        return complexInstrumentIdShort;
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
     * Exchange Designated Complex Instrument type right padded with spaces.
     *
     * @return the EdciType field
     */
    public EdciTypeField edciType() {
        return edciType;
    }

    /**
     * Exchange Designated Complex Instrument subtype right padded with spaces.
     *
     * @return the EdciSubtype field
     */
    public EdciSubtypeField edciSubtype() {
        return edciSubtype;
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
     * Repeating leg definition group inside the Exchange Designated Complex Instrument Definition message. Repeats Leg Count times.
     *
     * <p>Encode writes this list's size to the LegCount field.</p>
     *
     * @return the EdcidLeg entries
     */
    public EdcidLegList edcidLeg() {
        return edcidLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + edcidLeg.byteLength();
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
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 1;
        cursor += edcidLeg.byteLength();
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
        if (!complexInstrumentIdShort.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentIdShortField.BYTE_LENGTH;
        if (!complexInstrumentUnderlying.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentUnderlyingField.BYTE_LENGTH;
        if (!edciType.parse(data, cursor)) {
            return false;
        }
        cursor += EdciTypeField.BYTE_LENGTH;
        if (!edciSubtype.parse(data, cursor)) {
            return false;
        }
        cursor += EdciSubtypeField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!edcidLeg.parse(data, cursor, end, legCount.value())) {
            return false;
        }
        cursor += edcidLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (edcidLeg.size() > 255) {
            throw new IllegalStateException("edcidLeg holds " + edcidLeg.size() + " entries, more than its count field can state");
        }
        legCount.value((short) edcidLeg.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentIdShort.encode(data, cursor);
        cursor = complexInstrumentUnderlying.encode(data, cursor);
        cursor = edciType.encode(data, cursor);
        cursor = edciSubtype.encode(data, cursor);
        if (buffer != null && buffer.length >= 60) {
            System.arraycopy(buffer, 58, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = legCount.encode(data, cursor);
        cursor = edcidLeg.encode(data, cursor);
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
        edcidLeg.clear();
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
        return edcidLeg.isRecognized();
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
        if (!edcidLeg.isValid()) {
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
        if (!complexInstrumentIdShort.isDecoded()) {
            return Optional.of(complexInstrumentIdShort);
        }
        if (!complexInstrumentUnderlying.isDecoded()) {
            return Optional.of(complexInstrumentUnderlying);
        }
        if (!edciType.isDecoded()) {
            return Optional.of(edciType);
        }
        if (!edciSubtype.isDecoded()) {
            return Optional.of(edciSubtype);
        }
        if (!legCount.isDecoded()) {
            return Optional.of(legCount);
        }
        if (!edcidLeg.isDecoded()) {
            return Optional.of(edcidLeg.failedEntry().flatMap(EdcidLegEntry::failedAt).orElse(legCount));
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
            case "ComplexInstrumentIdShort" -> Optional.of(complexInstrumentIdShort);
            case "ComplexInstrumentUnderlying" -> Optional.of(complexInstrumentUnderlying);
            case "EdciType" -> Optional.of(edciType);
            case "EdciSubtype" -> Optional.of(edciSubtype);
            case "LegCount" -> Optional.of(legCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExchangeDesignatedComplexInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(edcidLeg.diffFields(message.edcidLeg));
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
            edcidLeg.toFormattedString(builder, options);
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
        edcidLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ExchangeDesignatedComplexInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && edcidLeg.equals(message.edcidLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, edcidLeg);
    }
}
