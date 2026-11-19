package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClOrdIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExecInstField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.LeavesQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.MaxFloorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.MinQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OrderQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OrigClOrdIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.PriceField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SecondaryOrderIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellCoveredQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellLongQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellNakedQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SubLiquidityIndicatorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TradingParticipantIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TransactionTimeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.WorkingPriceField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Field;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.PrintOptions;

/**
 * Represents the OrderModifiedAuEquitiesV1 message from the BinaryOrderEntry protocol.
 *
 * <p>Order Modified messages are sent in response to a Modify Order to indicate that the order has been successfully modified</p>
 */
public final class OrderModifiedAuEquitiesV1 implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Au Equities V 1";

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * The (4 digit) trading participant identifier
     */
    private final TradingParticipantIdField tradingParticipantId = new TradingParticipantIdField();

    /**
     * Unique Id chosen by the participant
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * All values not defined below are rejected. Ignored if blank (0x00)
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Order quantity. System limit is 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * The ClOrdID of the original order
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Minimum fill quantity for orders
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Portion of OrderQty to display. Used for iceberg orders and hidden orders
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Quantity still open for further execution. If zero, the order is complete
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Alternative Cboe OrderId: contra side of a prevented match, or the displayed portion of an iceberg order
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Defines the portion of OrderQty (38) that is naked
     */
    private final ShortSellNakedQtyField shortSellNakedQty = new ShortSellNakedQtyField();

    /**
     * Defines the portion of OrderQty (38) that is covered
     */
    private final ShortSellCoveredQtyField shortSellCoveredQty = new ShortSellCoveredQtyField();

    /**
     * Defines the portion of OrderQty (38) that is owned by the participant who placed the order
     */
    private final ShortSellLongQtyField shortSellLongQty = new ShortSellLongQtyField();

    /**
     * The Price at which an order is effectively working in the book
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Additional information about the liquidity of an order
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradingParticipantId, clOrdId, execInst, orderQty, origClOrdId, price, minQty, maxFloor, leavesQty, secondaryOrderId, shortSellNakedQty, shortSellCoveredQty, shortSellLongQty, workingPrice, baseLiquidityIndicator, subLiquidityIndicator);

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
     * The (4 digit) trading participant identifier
     *
     * @return the TradingParticipantId field
     */
    public TradingParticipantIdField tradingParticipantId() {
        return tradingParticipantId;
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
     * All values not defined below are rejected. Ignored if blank (0x00)
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
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
     * The ClOrdID of the original order
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Price of the order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Minimum fill quantity for orders
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Portion of OrderQty to display. Used for iceberg orders and hidden orders
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
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
     * Alternative Cboe OrderId: contra side of a prevented match, or the displayed portion of an iceberg order
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Defines the portion of OrderQty (38) that is naked
     *
     * @return the ShortSellNakedQty field
     */
    public ShortSellNakedQtyField shortSellNakedQty() {
        return shortSellNakedQty;
    }

    /**
     * Defines the portion of OrderQty (38) that is covered
     *
     * @return the ShortSellCoveredQty field
     */
    public ShortSellCoveredQtyField shortSellCoveredQty() {
        return shortSellCoveredQty;
    }

    /**
     * Defines the portion of OrderQty (38) that is owned by the participant who placed the order
     *
     * @return the ShortSellLongQty field
     */
    public ShortSellLongQtyField shortSellLongQty() {
        return shortSellLongQty;
    }

    /**
     * The Price at which an order is effectively working in the book
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
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
     * Additional information about the liquidity of an order
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
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
        if (!tradingParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!shortSellNakedQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellNakedQtyField.BYTE_LENGTH;
        if (!shortSellCoveredQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellCoveredQtyField.BYTE_LENGTH;
        if (!shortSellLongQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellLongQtyField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        return subLiquidityIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradingParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = shortSellNakedQty.encode(data, cursor);
        cursor = shortSellCoveredQty.encode(data, cursor);
        cursor = shortSellLongQty.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
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
            case "TradingParticipantId" -> Optional.of(tradingParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecInst" -> Optional.of(execInst);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "Price" -> Optional.of(price);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "ShortSellNakedQty" -> Optional.of(shortSellNakedQty);
            case "ShortSellCoveredQty" -> Optional.of(shortSellCoveredQty);
            case "ShortSellLongQty" -> Optional.of(shortSellLongQty);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedAuEquitiesV1 message)) {
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
        if (!(other instanceof OrderModifiedAuEquitiesV1 message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
