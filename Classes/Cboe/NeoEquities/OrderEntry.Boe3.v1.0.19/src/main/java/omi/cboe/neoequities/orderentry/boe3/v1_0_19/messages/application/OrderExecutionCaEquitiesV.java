package omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BaseLiquidityIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ContraBrokerField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExDestinationField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExecIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.FeeCodeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.IsSelfTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LastPxField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LastSharesField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeavesQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.MatchingPriorityField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NoTradeFeatField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.NoTradeKeyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrderIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.PrincipalTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ShortMarkingExemptField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SideField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SymbolField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TradeDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TransactionTimeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.WashTradeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Field;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.PrintOptions;

/**
 * Represents the OrderExecutionCaEquitiesV message from the OrderEntry protocol.
 *
 * <p>Order Execution message sent for each fill on an order</p>
 */
public final class OrderExecutionCaEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 99;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution Ca Equities V";

    /**
     * Time of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Client order identifier
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Day-unique id of execution message
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quantity of shares on this fill
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * OrderID supplied by Cboe Canada on the order acknowledgement
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Symbol (upper case)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Business date for the trade
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Quantity of shares still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Broker ID of the contra party on this fill
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Trade added or removed liquidity indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Identifies the broker
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * Broker executed a Principal trade indicator
     */
    private final PrincipalTradeField principalTrade = new PrincipalTradeField();

    /**
     * Broker executed a Wash trade indicator
     */
    private final WashTradeField washTrade = new WashTradeField();

    /**
     * Defines how to prevent a self-trade
     */
    private final NoTradeFeatField noTradeFeat = new NoTradeFeatField();

    /**
     * Identifier for self-trade prevention
     */
    private final NoTradeKeyField noTradeKey = new NoTradeKeyField();

    /**
     * Used by regulators to identify directional neutral accounts
     */
    private final ShortMarkingExemptField shortMarkingExempt = new ShortMarkingExemptField();

    /**
     * The type of priority used to match an order in a trade
     */
    private final MatchingPriorityField matchingPriority = new MatchingPriorityField();

    /**
     * Self-trade indicator
     */
    private final IsSelfTradeField isSelfTrade = new IsSelfTradeField();

    /**
     * Fee code of the transaction
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Destination book of the order
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastPx, lastShares, orderId, side, symbol, tradeDate, leavesQty, contraBroker, baseLiquidityIndicator, brokerId, principalTrade, washTrade, noTradeFeat, noTradeKey, shortMarkingExempt, matchingPriority, isSelfTrade, feeCode, exDestination);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Client order identifier
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Day-unique id of execution message
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
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
     * Quantity of shares on this fill
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * OrderID supplied by Cboe Canada on the order acknowledgement
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Symbol (upper case)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Business date for the trade
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Quantity of shares still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Broker ID of the contra party on this fill
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Trade added or removed liquidity indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Identifies the broker
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * Broker executed a Principal trade indicator
     *
     * @return the PrincipalTrade field
     */
    public PrincipalTradeField principalTrade() {
        return principalTrade;
    }

    /**
     * Broker executed a Wash trade indicator
     *
     * @return the WashTrade field
     */
    public WashTradeField washTrade() {
        return washTrade;
    }

    /**
     * Defines how to prevent a self-trade
     *
     * @return the NoTradeFeat field
     */
    public NoTradeFeatField noTradeFeat() {
        return noTradeFeat;
    }

    /**
     * Identifier for self-trade prevention
     *
     * @return the NoTradeKey field
     */
    public NoTradeKeyField noTradeKey() {
        return noTradeKey;
    }

    /**
     * Used by regulators to identify directional neutral accounts
     *
     * @return the ShortMarkingExempt field
     */
    public ShortMarkingExemptField shortMarkingExempt() {
        return shortMarkingExempt;
    }

    /**
     * The type of priority used to match an order in a trade
     *
     * @return the MatchingPriority field
     */
    public MatchingPriorityField matchingPriority() {
        return matchingPriority;
    }

    /**
     * Self-trade indicator
     *
     * @return the IsSelfTrade field
     */
    public IsSelfTradeField isSelfTrade() {
        return isSelfTrade;
    }

    /**
     * Fee code of the transaction
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * Destination book of the order
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!principalTrade.parse(data, cursor)) {
            return false;
        }
        cursor += PrincipalTradeField.BYTE_LENGTH;
        if (!washTrade.parse(data, cursor)) {
            return false;
        }
        cursor += WashTradeField.BYTE_LENGTH;
        if (!noTradeFeat.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeFeatField.BYTE_LENGTH;
        if (!noTradeKey.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeKeyField.BYTE_LENGTH;
        if (!shortMarkingExempt.parse(data, cursor)) {
            return false;
        }
        cursor += ShortMarkingExemptField.BYTE_LENGTH;
        if (!matchingPriority.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingPriorityField.BYTE_LENGTH;
        if (!isSelfTrade.parse(data, cursor)) {
            return false;
        }
        cursor += IsSelfTradeField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        return exDestination.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = principalTrade.encode(data, cursor);
        cursor = washTrade.encode(data, cursor);
        cursor = noTradeFeat.encode(data, cursor);
        cursor = noTradeKey.encode(data, cursor);
        cursor = shortMarkingExempt.encode(data, cursor);
        cursor = matchingPriority.encode(data, cursor);
        cursor = isSelfTrade.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastShares" -> Optional.of(lastShares);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "TradeDate" -> Optional.of(tradeDate);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "BrokerId" -> Optional.of(brokerId);
            case "PrincipalTrade" -> Optional.of(principalTrade);
            case "WashTrade" -> Optional.of(washTrade);
            case "NoTradeFeat" -> Optional.of(noTradeFeat);
            case "NoTradeKey" -> Optional.of(noTradeKey);
            case "ShortMarkingExempt" -> Optional.of(shortMarkingExempt);
            case "MatchingPriority" -> Optional.of(matchingPriority);
            case "IsSelfTrade" -> Optional.of(isSelfTrade);
            case "FeeCode" -> Optional.of(feeCode);
            case "ExDestination" -> Optional.of(exDestination);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutionCaEquitiesV message)) {
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
        if (!(other instanceof OrderExecutionCaEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
