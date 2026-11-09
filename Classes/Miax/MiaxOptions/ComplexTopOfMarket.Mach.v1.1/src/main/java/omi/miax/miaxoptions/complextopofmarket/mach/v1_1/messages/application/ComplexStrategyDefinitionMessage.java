package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.ActiveOnMiaxField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.NanosecondsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.NumberOfLegsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.StrategyIdField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.UnderlyingSymbolField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.UpdateReasonField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.groups.LegDefinitionEntry;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.groups.LegDefinitionList;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Field;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.PrintOptions;

/**
 * Represents the ComplexStrategyDefinitionMessage message from the ComplexTopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate stock option strategies traded on MIAX for the current session.</p>
 */
public final class ComplexStrategyDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Strategy Definition Message";

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Stock Symbol for the option.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Indicates if this symbol is tradable on MIAX in the current session: “A” = Active (tradable) on MIAX “I” = Inactive (not tradable) on MIAX
     */
    private final ActiveOnMiaxField activeOnMiax = new ActiveOnMiaxField();

    /**
     * “N” – New strategy created
     */
    private final UpdateReasonField updateReason = new UpdateReasonField();

    /**
     * Number of Legs. Variable from 2 to 8
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Complex Strategy Number of Legs
     */
    private final LegDefinitionList legDefinition = new LegDefinitionList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, strategyId, underlyingSymbol, activeOnMiax, updateReason, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Stock Symbol for the option.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Indicates if this symbol is tradable on MIAX in the current session: “A” = Active (tradable) on MIAX “I” = Inactive (not tradable) on MIAX
     *
     * @return the ActiveOnMiax field
     */
    public ActiveOnMiaxField activeOnMiax() {
        return activeOnMiax;
    }

    /**
     * “N” – New strategy created
     *
     * @return the UpdateReason field
     */
    public UpdateReasonField updateReason() {
        return updateReason;
    }

    /**
     * Number of Legs. Variable from 2 to 8
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Complex Strategy Number of Legs
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the LegDefinition entries
     */
    public LegDefinitionList legDefinition() {
        return legDefinition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legDefinition.byteLength();
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
        cursor += 4;
        cursor += 11;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(10);
        cursor += 10;
        cursor += 1;
        cursor = legDefinition.padding(runs, cursor);
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!activeOnMiax.parse(data, cursor)) {
            return false;
        }
        cursor += ActiveOnMiaxField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!updateReason.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateReasonField.BYTE_LENGTH;
        cursor += 10; // padding
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!legDefinition.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += legDefinition.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legDefinition.size() > 255) {
            throw new IllegalStateException("legDefinition holds " + legDefinition.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) legDefinition.size());
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = activeOnMiax.encode(data, cursor);
        if (buffer != null && buffer.length >= 20 + 1) {
            System.arraycopy(buffer, 20, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = updateReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 22 + 10) {
            System.arraycopy(buffer, 22, data, cursor, 10); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 10, (byte) 0); // padding
        }
        cursor += 10;
        cursor = numberOfLegs.encode(data, cursor);
        cursor = legDefinition.encode(data, cursor);
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
        legDefinition.clear();
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
        if (!legDefinition.isRecognized()) {
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
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!legDefinition.isValid()) {
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
        if (!nanoseconds.isDecoded()) {
            return Optional.of(nanoseconds);
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!underlyingSymbol.isDecoded()) {
            return Optional.of(underlyingSymbol);
        }
        if (!activeOnMiax.isDecoded()) {
            return Optional.of(activeOnMiax);
        }
        if (!updateReason.isDecoded()) {
            return Optional.of(updateReason);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!legDefinition.isDecoded()) {
            return Optional.of(legDefinition.failedEntry().flatMap(LegDefinitionEntry::failedAt).orElse(numberOfLegs));
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "StrategyId" -> Optional.of(strategyId);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "ActiveOnMiax" -> Optional.of(activeOnMiax);
            case "UpdateReason" -> Optional.of(updateReason);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexStrategyDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legDefinition.diffFields(message.legDefinition));
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
            legDefinition.toFormattedString(builder, options);
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
        legDefinition.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexStrategyDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legDefinition.equals(message.legDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legDefinition);
    }
}
