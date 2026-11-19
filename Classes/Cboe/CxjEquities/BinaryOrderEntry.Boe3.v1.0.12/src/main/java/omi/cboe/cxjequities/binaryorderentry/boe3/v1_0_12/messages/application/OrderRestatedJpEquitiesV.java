package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.ClOrdIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.LastPxField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.LastSharesField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.LeavesQtyField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrderIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrderQtyField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.PriceField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.RestatementReasonField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.SecondaryOrderIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TradingFirmField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TransactionTimeField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Field;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.PrintOptions;

/**
 * Represents the OrderRestatedJpEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>If an order is cancelled or reduced due to Self-Trade Protection instructions, the order will be restated with reductions to OrderQty and/or LeavesQty</p>
 */
public final class OrderRestatedJpEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 78;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Restated Jp Equities V";

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * The four-character identifier of the trading firm
     */
    private final TradingFirmField tradingFirm = new TradingFirmField();

    /**
     * Unique Id chosen by the participant
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe Japan
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order quantity. System limit is 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Price must be an applicable minimum trading increment
     */
    private final PriceField price = new PriceField();

    /**
     * Quantity still open for further execution. If zero, the order is complete
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Present on a Self-Trade Protection triggered restatement. Cboe OrderID of contra side of prevented match
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Executed quantity
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * The reason for this Order Restated message
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradingFirm, clOrdId, orderId, orderQty, price, leavesQty, secondaryOrderId, lastPx, lastShares, baseLiquidityIndicator, restatementReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * The four-character identifier of the trading firm
     *
     * @return the TradingFirm field
     */
    public TradingFirmField tradingFirm() {
        return tradingFirm;
    }

    /**
     * Unique Id chosen by the participant
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order identifier supplied by Cboe Japan
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order quantity. System limit is 999,999,999
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Price must be an applicable minimum trading increment
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Quantity still open for further execution. If zero, the order is complete
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Present on a Self-Trade Protection triggered restatement. Cboe OrderID of contra side of prevented match
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Price of this fill
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Executed quantity
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Indicates whether the trade added or removed liquidity
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * The reason for this Order Restated message
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!tradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TradingFirmField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        return restatementReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradingFirm.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "TradingFirm" -> Optional.of(tradingFirm);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastShares" -> Optional.of(lastShares);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "RestatementReason" -> Optional.of(restatementReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRestatedJpEquitiesV message)) {
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
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
        if (!(other instanceof OrderRestatedJpEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
