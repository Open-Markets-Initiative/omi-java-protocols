package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AiqStrategyField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.DecrementSharesField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.ExecutionPriceField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.LiquidityFlagField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.OrderCancelReasonField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.QuantityPreventedFromTradingField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimestampField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AiqCanceledAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AiqCanceledAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the AiqCanceledMessage message from the Orders protocol.
 *
 * <p>AIQ Canceled Message</p>
 */
public final class AiqCanceledMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Aiq Canceled Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * The number of shares just decremented from the order. This number is incremental, not cumulative.
     */
    private final DecrementSharesField decrementShares = new DecrementSharesField();

    /**
     * Reason the order was reduced or canceled. For an AIQ Cancel message, this value will always be “Q”.
     */
    private final OrderCancelReasonField orderCancelReason = new OrderCancelReasonField();

    /**
     * Shares that would have executed if the trade would have occurred. Depending on AIQ type and the sizes of orders in question the value for this field could either be the same or different than the Decrement Shares field. For “Decrement both” they are always the same. For “Cancel oldest” they will be different if the incoming order is smaller than the resting order.
     */
    private final QuantityPreventedFromTradingField quantityPreventedFromTrading = new QuantityPreventedFromTradingField();

    /**
     * Price at which the trade would have occurred
     */
    private final ExecutionPriceField executionPrice = new ExecutionPriceField();

    /**
     * Liquidity flag the order would have received.
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * AIQ strategy used on the cancelled order.
     */
    private final AiqStrategyField aiqStrategy = new AiqStrategyField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * AIQ Canceled Appendage
     */
    private final AiqCanceledAppendageList aiqCanceledAppendage = new AiqCanceledAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, decrementShares, orderCancelReason, quantityPreventedFromTrading, executionPrice, liquidityFlag, aiqStrategy, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Expressed as nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * The number of shares just decremented from the order. This number is incremental, not cumulative.
     *
     * @return the DecrementShares field
     */
    public DecrementSharesField decrementShares() {
        return decrementShares;
    }

    /**
     * Reason the order was reduced or canceled. For an AIQ Cancel message, this value will always be “Q”.
     *
     * @return the OrderCancelReason field
     */
    public OrderCancelReasonField orderCancelReason() {
        return orderCancelReason;
    }

    /**
     * Shares that would have executed if the trade would have occurred. Depending on AIQ type and the sizes of orders in question the value for this field could either be the same or different than the Decrement Shares field. For “Decrement both” they are always the same. For “Cancel oldest” they will be different if the incoming order is smaller than the resting order.
     *
     * @return the QuantityPreventedFromTrading field
     */
    public QuantityPreventedFromTradingField quantityPreventedFromTrading() {
        return quantityPreventedFromTrading;
    }

    /**
     * Price at which the trade would have occurred
     *
     * @return the ExecutionPrice field
     */
    public ExecutionPriceField executionPrice() {
        return executionPrice;
    }

    /**
     * Liquidity flag the order would have received.
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * AIQ strategy used on the cancelled order.
     *
     * @return the AiqStrategy field
     */
    public AiqStrategyField aiqStrategy() {
        return aiqStrategy;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * AIQ Canceled Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the AiqCanceledAppendage entries
     */
    public AiqCanceledAppendageList aiqCanceledAppendage() {
        return aiqCanceledAppendage;
    }

    /**
     * Returns whether the fields before the AppendageLength put it on the wire.
     *
     * <p>The AppendageLength is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the AppendageLength is on the wire
     */
    public boolean appendageLengthPresent() {
        return appendageLength.hasValue() || !aiqCanceledAppendage.isEmpty();
    }

    private boolean onWire(Field field) {
        return (field != appendageLength || appendageLengthPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (appendageLengthPresent() ? AppendageLengthField.BYTE_LENGTH : 0) + aiqCanceledAppendage.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        if (appendageLengthPresent()) {
            cursor += 2;
        }
        cursor = aiqCanceledAppendage.padding(runs, cursor);
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!decrementShares.parse(data, cursor)) {
            return false;
        }
        cursor += DecrementSharesField.BYTE_LENGTH;
        if (!orderCancelReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCancelReasonField.BYTE_LENGTH;
        if (!quantityPreventedFromTrading.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityPreventedFromTradingField.BYTE_LENGTH;
        if (!executionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPriceField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!aiqStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += AiqStrategyField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < AppendageLengthField.BYTE_LENGTH || !appendageLength.parse(data, cursor)) {
                return false;
            }
            cursor += AppendageLengthField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        long aiqCanceledAppendageBudget = appendageLengthPresent() ? appendageLength.value() : 0;
        if (aiqCanceledAppendageBudget < 0 || aiqCanceledAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!aiqCanceledAppendage.parse(data, cursor, cursor + (int) aiqCanceledAppendageBudget)) {
            return false;
        }
        cursor += aiqCanceledAppendage.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (!aiqCanceledAppendage.isEmpty() || appendageLengthPresent()) {
            if (aiqCanceledAppendage.byteLength() > 65535) {
                throw new IllegalStateException("aiqCanceledAppendage holds " + aiqCanceledAppendage.byteLength() + " bytes, more than its length field can state");
            }
            appendageLength.value((aiqCanceledAppendage.byteLength()));
        }
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = decrementShares.encode(data, cursor);
        cursor = orderCancelReason.encode(data, cursor);
        cursor = quantityPreventedFromTrading.encode(data, cursor);
        cursor = executionPrice.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = aiqStrategy.encode(data, cursor);
        if (appendageLengthPresent()) {
            cursor = appendageLength.encode(data, cursor);
        }
        cursor = aiqCanceledAppendage.encode(data, cursor);
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
        aiqCanceledAppendage.clear();
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
        for (Field field : fields()) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        if (!aiqCanceledAppendage.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!aiqCanceledAppendage.isValid()) {
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
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!decrementShares.isDecoded()) {
            return Optional.of(decrementShares);
        }
        if (!orderCancelReason.isDecoded()) {
            return Optional.of(orderCancelReason);
        }
        if (!quantityPreventedFromTrading.isDecoded()) {
            return Optional.of(quantityPreventedFromTrading);
        }
        if (!executionPrice.isDecoded()) {
            return Optional.of(executionPrice);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!aiqStrategy.isDecoded()) {
            return Optional.of(aiqStrategy);
        }
        if (appendageLengthPresent() && !appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!aiqCanceledAppendage.isDecoded()) {
            return Optional.of(aiqCanceledAppendage.failedEntry().flatMap(AiqCanceledAppendageEntry::failedAt).orElse(appendageLength));
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
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "DecrementShares" -> Optional.of(decrementShares);
            case "OrderCancelReason" -> Optional.of(orderCancelReason);
            case "QuantityPreventedFromTrading" -> Optional.of(quantityPreventedFromTrading);
            case "ExecutionPrice" -> Optional.of(executionPrice);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "AiqStrategy" -> Optional.of(aiqStrategy);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AiqCanceledMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(aiqCanceledAppendage.diffFields(message.aiqCanceledAppendage));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            aiqCanceledAppendage.toFormattedString(builder, options);
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
        aiqCanceledAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof AiqCanceledMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && aiqCanceledAppendage.equals(message.aiqCanceledAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, aiqCanceledAppendage);
    }
}
