package omi.cboe.c1options.flex.pitch.v1_1_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.ComplexInstrumentIdField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.ComplexInstrumentTypeField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.LegCountField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.MessageCountField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.MessageLegCountField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.MessageNumberField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.TimeOffsetField;
import omi.cboe.c1options.flex.pitch.v1_1_30.fields.UnderlyingField;
import omi.cboe.c1options.flex.pitch.v1_1_30.groups.ComplexFlexLegEntry;
import omi.cboe.c1options.flex.pitch.v1_1_30.groups.ComplexFlexLegList;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.Field;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.Message;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.PrintOptions;

/**
 * Represents the ComplexFlexInstrumentDefinitionMessage message from the Flex protocol.
 *
 * <p>A Complex FLEX Instrument Definition message represents a complex instrument that is available to place orders.</p>
 */
public final class ComplexFlexInstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Flex Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument ID right padded with spaces.
     */
    private final ComplexInstrumentIdField complexInstrumentId = new ComplexInstrumentIdField();

    /**
     * Symbol of underlying equity right padded with spaces. All spaces if not available or not applicable.
     */
    private final UnderlyingField underlying = new UnderlyingField();

    /**
     * 4 character field. Character 1: Complex Option Type. Characters 2-4: Reserved.
     */
    private final ComplexInstrumentTypeField complexInstrumentType = new ComplexInstrumentTypeField();

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 100.
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * Number of messages required to define the complex instrument.
     */
    private final MessageCountField messageCount = new MessageCountField();

    /**
     * Message number of the message count, e.g. 1 of 5.
     */
    private final MessageNumberField messageNumber = new MessageNumberField();

    /**
     * The number of legs in this message.
     */
    private final MessageLegCountField messageLegCount = new MessageLegCountField();

    /**
     * Repeating leg definition for complex FLEX instruments. Repeats Message Leg Count times.
     */
    private final ComplexFlexLegList complexFlexLeg = new ComplexFlexLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentId, underlying, complexInstrumentType, legCount, messageCount, messageNumber, messageLegCount);

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
     * Complex Instrument ID right padded with spaces.
     *
     * @return the ComplexInstrumentId field
     */
    public ComplexInstrumentIdField complexInstrumentId() {
        return complexInstrumentId;
    }

    /**
     * Symbol of underlying equity right padded with spaces. All spaces if not available or not applicable.
     *
     * @return the Underlying field
     */
    public UnderlyingField underlying() {
        return underlying;
    }

    /**
     * 4 character field. Character 1: Complex Option Type. Characters 2-4: Reserved.
     *
     * @return the ComplexInstrumentType field
     */
    public ComplexInstrumentTypeField complexInstrumentType() {
        return complexInstrumentType;
    }

    /**
     * The number of legs in the complex instrument. The maximum number of legs is 100.
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * Number of messages required to define the complex instrument.
     *
     * @return the MessageCount field
     */
    public MessageCountField messageCount() {
        return messageCount;
    }

    /**
     * Message number of the message count, e.g. 1 of 5.
     *
     * @return the MessageNumber field
     */
    public MessageNumberField messageNumber() {
        return messageNumber;
    }

    /**
     * The number of legs in this message.
     *
     * @return the MessageLegCount field
     */
    public MessageLegCountField messageLegCount() {
        return messageLegCount;
    }

    /**
     * Repeating leg definition for complex FLEX instruments. Repeats Message Leg Count times.
     *
     * <p>Encode writes this list's size to the MessageLegCount field.</p>
     *
     * @return the ComplexFlexLeg entries
     */
    public ComplexFlexLegList complexFlexLeg() {
        return complexFlexLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexFlexLeg.byteLength();
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
        if (!underlying.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingField.BYTE_LENGTH;
        if (!complexInstrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentTypeField.BYTE_LENGTH;
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!messageCount.parse(data, cursor)) {
            return false;
        }
        cursor += MessageCountField.BYTE_LENGTH;
        if (!messageNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MessageNumberField.BYTE_LENGTH;
        if (!messageLegCount.parse(data, cursor)) {
            return false;
        }
        cursor += MessageLegCountField.BYTE_LENGTH;
        if (!complexFlexLeg.parse(data, cursor, end, messageLegCount.value())) {
            return false;
        }
        cursor += complexFlexLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexFlexLeg.size() > 255) {
            throw new IllegalStateException("complexFlexLeg holds " + complexFlexLeg.size() + " entries, more than its count field can state");
        }
        messageLegCount.value((short) complexFlexLeg.size());
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentId.encode(data, cursor);
        cursor = underlying.encode(data, cursor);
        cursor = complexInstrumentType.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = messageCount.encode(data, cursor);
        cursor = messageNumber.encode(data, cursor);
        cursor = messageLegCount.encode(data, cursor);
        cursor = complexFlexLeg.encode(data, cursor);
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
        complexFlexLeg.clear();
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
            if (field != messageLegCount && !field.isRecognized()) {
                return false;
            }
        }
        return complexFlexLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != messageLegCount && !field.isValid()) {
                return false;
            }
        }
        if (!complexFlexLeg.isValid()) {
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
        if (!underlying.isDecoded()) {
            return Optional.of(underlying);
        }
        if (!complexInstrumentType.isDecoded()) {
            return Optional.of(complexInstrumentType);
        }
        if (!legCount.isDecoded()) {
            return Optional.of(legCount);
        }
        if (!messageCount.isDecoded()) {
            return Optional.of(messageCount);
        }
        if (!messageNumber.isDecoded()) {
            return Optional.of(messageNumber);
        }
        if (!messageLegCount.isDecoded()) {
            return Optional.of(messageLegCount);
        }
        if (!complexFlexLeg.isDecoded()) {
            return Optional.of(complexFlexLeg.failedEntry().flatMap(ComplexFlexLegEntry::failedAt).orElse(messageLegCount));
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
            case "Underlying" -> Optional.of(underlying);
            case "ComplexInstrumentType" -> Optional.of(complexInstrumentType);
            case "LegCount" -> Optional.of(legCount);
            case "MessageCount" -> Optional.of(messageCount);
            case "MessageNumber" -> Optional.of(messageNumber);
            case "MessageLegCount" -> Optional.of(messageLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexFlexInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexFlexLeg.diffFields(message.complexFlexLeg));
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
            complexFlexLeg.toFormattedString(builder, options);
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
        complexFlexLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexFlexInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexFlexLeg.equals(message.complexFlexLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexFlexLeg);
    }
}
