package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketHoursStateField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SessionTradingStateField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TradingSessionStatusOperationalHaltReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TradingSessionStatusPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TradingSessionStatusRegulatoryHaltReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the TradingSessionStatusMessage message from the Seed protocol.
 *
 * <p>Market-wide status representing the overall state of the trading session.</p>
 */
public final class TradingSessionStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'i';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 11;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Session Status Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final TradingSessionStatusPresenceBitsField tradingSessionStatusPresenceBits = new TradingSessionStatusPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Enum MarketHoursState.
     */
    private final MarketHoursStateField marketHoursState = new MarketHoursStateField();

    /**
     * Enum SessionTradingState.
     */
    private final SessionTradingStateField sessionTradingState = new SessionTradingStateField();

    /**
     * Enum TradingSessionStatusOperationalHaltReason.
     */
    private final TradingSessionStatusOperationalHaltReasonField tradingSessionStatusOperationalHaltReason = new TradingSessionStatusOperationalHaltReasonField();

    /**
     * Enum TradingSessionStatusRegulatoryHaltReason.
     */
    private final TradingSessionStatusRegulatoryHaltReasonField tradingSessionStatusRegulatoryHaltReason = new TradingSessionStatusRegulatoryHaltReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingSessionStatusPresenceBits, transactTime, marketHoursState, sessionTradingState, tradingSessionStatusOperationalHaltReason, tradingSessionStatusRegulatoryHaltReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the TradingSessionStatusPresenceBits field
     */
    public TradingSessionStatusPresenceBitsField tradingSessionStatusPresenceBits() {
        return tradingSessionStatusPresenceBits;
    }

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Enum MarketHoursState.
     *
     * @return the MarketHoursState field
     */
    public MarketHoursStateField marketHoursState() {
        return marketHoursState;
    }

    /**
     * Enum SessionTradingState.
     *
     * @return the SessionTradingState field
     */
    public SessionTradingStateField sessionTradingState() {
        return sessionTradingState;
    }

    /**
     * Enum TradingSessionStatusOperationalHaltReason.
     *
     * @return the TradingSessionStatusOperationalHaltReason field
     */
    public TradingSessionStatusOperationalHaltReasonField tradingSessionStatusOperationalHaltReason() {
        return tradingSessionStatusOperationalHaltReason;
    }

    /**
     * Enum TradingSessionStatusRegulatoryHaltReason.
     *
     * @return the TradingSessionStatusRegulatoryHaltReason field
     */
    public TradingSessionStatusRegulatoryHaltReasonField tradingSessionStatusRegulatoryHaltReason() {
        return tradingSessionStatusRegulatoryHaltReason;
    }

    /**
     * Returns whether the fields before the TradingSessionStatusOperationalHaltReason put it on the wire.
     *
     * <p>Decode reads the TradingSessionStatusOperationalHaltReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradingSessionStatusOperationalHaltReason is on the wire
     */
    public boolean tradingSessionStatusOperationalHaltReasonPresent() {
        return tradingSessionStatusPresenceBits.hasTradingSessionStatusOperationalHaltReason();
    }

    /**
     * Returns whether the fields before the TradingSessionStatusRegulatoryHaltReason put it on the wire.
     *
     * <p>Decode reads the TradingSessionStatusRegulatoryHaltReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradingSessionStatusRegulatoryHaltReason is on the wire
     */
    public boolean tradingSessionStatusRegulatoryHaltReasonPresent() {
        return tradingSessionStatusPresenceBits.hasTradingSessionStatusRegulatoryHaltReason();
    }

    private boolean onWire(Field field) {
        return (field != tradingSessionStatusOperationalHaltReason || tradingSessionStatusOperationalHaltReasonPresent()) && (field != tradingSessionStatusRegulatoryHaltReason || tradingSessionStatusRegulatoryHaltReasonPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (tradingSessionStatusOperationalHaltReasonPresent() ? TradingSessionStatusOperationalHaltReasonField.BYTE_LENGTH : 0) + (tradingSessionStatusRegulatoryHaltReasonPresent() ? TradingSessionStatusRegulatoryHaltReasonField.BYTE_LENGTH : 0);
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
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        if (tradingSessionStatusOperationalHaltReasonPresent()) {
            cursor += 1;
        }
        if (tradingSessionStatusRegulatoryHaltReasonPresent()) {
            cursor += 1;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactTime.value());
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
        if (!tradingSessionStatusPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionStatusPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!marketHoursState.parse(data, cursor)) {
            return false;
        }
        cursor += MarketHoursStateField.BYTE_LENGTH;
        if (!sessionTradingState.parse(data, cursor)) {
            return false;
        }
        cursor += SessionTradingStateField.BYTE_LENGTH;
        if (tradingSessionStatusOperationalHaltReasonPresent()) {
            if (end - cursor < TradingSessionStatusOperationalHaltReasonField.BYTE_LENGTH || !tradingSessionStatusOperationalHaltReason.parse(data, cursor)) {
                return false;
            }
            cursor += TradingSessionStatusOperationalHaltReasonField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradingSessionStatusRegulatoryHaltReasonPresent()) {
            if (end - cursor < TradingSessionStatusRegulatoryHaltReasonField.BYTE_LENGTH || !tradingSessionStatusRegulatoryHaltReason.parse(data, cursor)) {
                return false;
            }
            cursor += TradingSessionStatusRegulatoryHaltReasonField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradingSessionStatusOperationalHaltReasonPresent() != tradingSessionStatusOperationalHaltReason.hasValue()) {
            throw new IllegalStateException(tradingSessionStatusOperationalHaltReason.hasValue() ? "tradingSessionStatusOperationalHaltReason holds a value the fields before it leave off the wire" : "tradingSessionStatusOperationalHaltReason holds no value, though the fields before it put it on the wire");
        }
        if (tradingSessionStatusRegulatoryHaltReasonPresent() != tradingSessionStatusRegulatoryHaltReason.hasValue()) {
            throw new IllegalStateException(tradingSessionStatusRegulatoryHaltReason.hasValue() ? "tradingSessionStatusRegulatoryHaltReason holds a value the fields before it leave off the wire" : "tradingSessionStatusRegulatoryHaltReason holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = tradingSessionStatusPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = marketHoursState.encode(data, cursor);
        cursor = sessionTradingState.encode(data, cursor);
        if (tradingSessionStatusOperationalHaltReasonPresent()) {
            cursor = tradingSessionStatusOperationalHaltReason.encode(data, cursor);
        }
        if (tradingSessionStatusRegulatoryHaltReasonPresent()) {
            cursor = tradingSessionStatusRegulatoryHaltReason.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TradingSessionStatusPresenceBits" -> Optional.of(tradingSessionStatusPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "MarketHoursState" -> Optional.of(marketHoursState);
            case "SessionTradingState" -> Optional.of(sessionTradingState);
            case "TradingSessionStatusOperationalHaltReason" -> Optional.of(tradingSessionStatusOperationalHaltReason);
            case "TradingSessionStatusRegulatoryHaltReason" -> Optional.of(tradingSessionStatusRegulatoryHaltReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingSessionStatusMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
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
        if (!(other instanceof TradingSessionStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
