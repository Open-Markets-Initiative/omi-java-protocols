package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.NumberOfLegsField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.SourceField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.StrategyIdField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.StrategyTypeField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.TimestampField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.fields.UnderlyingSymbolField;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationEntry;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationList;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Field;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.PrintOptions;

/**
 * Represents the ComplexStrategyDirectoryMessage message from the OrderComboFeed protocol.
 *
 * <p>Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.</p>
 */
public final class ComplexStrategyDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Strategy Directory Message";

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * StrategyType value
     */
    private final StrategyTypeField strategyType = new StrategyTypeField();

    /**
     * Identifies the source of the Strategy, valid for the trading day
     */
    private final SourceField source = new SourceField();

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Number of legs in the strategy NOTE: Leg field offsets below are an equation, where “n” is the zero based leg number (0, 1, …)
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Leg information
     */
    private final LegInformationList legInformation = new LegInformationList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, strategyId, strategyType, source, underlyingSymbol, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * StrategyType value
     *
     * @return the StrategyType field
     */
    public StrategyTypeField strategyType() {
        return strategyType;
    }

    /**
     * Identifies the source of the Strategy, valid for the trading day
     *
     * @return the Source field
     */
    public SourceField source() {
        return source;
    }

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Number of legs in the strategy NOTE: Leg field offsets below are an equation, where “n” is the zero based leg number (0, 1, …)
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Leg information
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the LegInformation entries
     */
    public LegInformationList legInformation() {
        return legInformation;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legInformation.byteLength();
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!strategyType.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyTypeField.BYTE_LENGTH;
        if (!source.parse(data, cursor)) {
            return false;
        }
        cursor += SourceField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!legInformation.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += legInformation.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legInformation.size() > 255) {
            throw new IllegalStateException("legInformation holds " + legInformation.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) legInformation.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = strategyType.encode(data, cursor);
        cursor = source.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = legInformation.encode(data, cursor);
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
        legInformation.clear();
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
            if (field != numberOfLegs && !field.isRecognized()) {
                return false;
            }
        }
        return legInformation.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!legInformation.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!strategyType.isDecoded()) {
            return Optional.of(strategyType);
        }
        if (!source.isDecoded()) {
            return Optional.of(source);
        }
        if (!underlyingSymbol.isDecoded()) {
            return Optional.of(underlyingSymbol);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!legInformation.isDecoded()) {
            return Optional.of(legInformation.failedEntry().flatMap(LegInformationEntry::failedAt).orElse(numberOfLegs));
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
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "StrategyType" -> Optional.of(strategyType);
            case "Source" -> Optional.of(source);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexStrategyDirectoryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legInformation.diffFields(message.legInformation));
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
            legInformation.toFormattedString(builder, options);
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
        legInformation.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexStrategyDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legInformation.equals(message.legInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legInformation);
    }
}
