package omi.nasdaq.iseoptions.cti.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.ActionField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.NanosecondsField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.NumberOfLegsField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.SecondsField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.StrategyIdField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.UnderlyingSymbolField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.fields.VersionField;
import omi.nasdaq.iseoptions.cti.itch.v3_0.groups.StrategyLegsEntry;
import omi.nasdaq.iseoptions.cti.itch.v3_0.groups.StrategyLegsList;
import omi.nasdaq.iseoptions.cti.itch.v3_0.types.Field;
import omi.nasdaq.iseoptions.cti.itch.v3_0.types.Message;
import omi.nasdaq.iseoptions.cti.itch.v3_0.types.PrintOptions;

/**
 * Represents the ComplexOrderStrategyMessage message from the Cti protocol.
 *
 * <p>The strategy associated to a complex order (PHLX, ISE and MRX only). The Strategy ID assigned for a new complex strategy is unique for a particular complex instrument for a trading session, however Strategy IDs are independent of session Option IDs and uniqueness across complex and simple options is not guaranteed.</p>
 */
public final class ComplexOrderStrategyMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 44;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Strategy Message";

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     */
    private final SecondsField seconds = new SecondsField();

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     */
    private final VersionField version = new VersionField();

    /**
     * Strategy id assigned daily
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * State of the strategy: A = Add, D = Delete
     */
    private final ActionField action = new ActionField();

    /**
     * Number of legs in the strategy
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Leg information of the Complex Order Strategy message, 32 bytes per leg at offset 32n + 45
     */
    private final StrategyLegsList strategyLegs = new StrategyLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seconds, nanoseconds, version, strategyId, underlyingSymbol, action, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     *
     * @return the Seconds field
     */
    public SecondsField seconds() {
        return seconds;
    }

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * Strategy id assigned daily
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * State of the strategy: A = Add, D = Delete
     *
     * @return the Action field
     */
    public ActionField action() {
        return action;
    }

    /**
     * Number of legs in the strategy
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Leg information of the Complex Order Strategy message, 32 bytes per leg at offset 32n + 45
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the StrategyLegs entries
     */
    public StrategyLegsList strategyLegs() {
        return strategyLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategyLegs.byteLength();
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
        cursor += 1;
        cursor += 4;
        cursor += 13;
        cursor += 1;
        runs.add(cursor).add(16);
        cursor += 16;
        cursor += 1;
        cursor = strategyLegs.padding(runs, cursor);
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
        if (!seconds.parse(data, cursor)) {
            return false;
        }
        cursor += SecondsField.BYTE_LENGTH;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!version.parse(data, cursor)) {
            return false;
        }
        cursor += VersionField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!action.parse(data, cursor)) {
            return false;
        }
        cursor += ActionField.BYTE_LENGTH;
        cursor += 16; // padding
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!strategyLegs.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += strategyLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (strategyLegs.size() > 255) {
            throw new IllegalStateException("strategyLegs holds " + strategyLegs.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) strategyLegs.size());
        int cursor = offset;
        cursor = seconds.encode(data, cursor);
        cursor = nanoseconds.encode(data, cursor);
        cursor = version.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = action.encode(data, cursor);
        if (buffer != null && buffer.length >= 43) {
            System.arraycopy(buffer, 27, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
        cursor = numberOfLegs.encode(data, cursor);
        cursor = strategyLegs.encode(data, cursor);
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
        strategyLegs.clear();
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
        return strategyLegs.isRecognized();
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
        if (!strategyLegs.isValid()) {
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
        if (!seconds.isDecoded()) {
            return Optional.of(seconds);
        }
        if (!nanoseconds.isDecoded()) {
            return Optional.of(nanoseconds);
        }
        if (!version.isDecoded()) {
            return Optional.of(version);
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!underlyingSymbol.isDecoded()) {
            return Optional.of(underlyingSymbol);
        }
        if (!action.isDecoded()) {
            return Optional.of(action);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!strategyLegs.isDecoded()) {
            return Optional.of(strategyLegs.failedEntry().flatMap(StrategyLegsEntry::failedAt).orElse(numberOfLegs));
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
            case "Seconds" -> Optional.of(seconds);
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "Version" -> Optional.of(version);
            case "StrategyId" -> Optional.of(strategyId);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "Action" -> Optional.of(action);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderStrategyMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strategyLegs.diffFields(message.strategyLegs));
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
            strategyLegs.toFormattedString(builder, options);
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
        strategyLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexOrderStrategyMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strategyLegs.equals(message.strategyLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strategyLegs);
    }
}
