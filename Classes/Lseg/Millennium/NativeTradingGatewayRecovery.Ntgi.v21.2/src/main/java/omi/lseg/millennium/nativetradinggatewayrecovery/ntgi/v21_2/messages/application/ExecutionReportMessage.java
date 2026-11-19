package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.AppIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.CounterpartyField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.DisplayQtyField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecTypeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutedPriceField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutedQtyField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionReportOrderStatusField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionReportPeggedExecInstField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutionReportRefIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.LastMarketField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.LeavesQtyField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.MinimumQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OrderIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OrderRejectCodeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OwnerTypeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.PublicOrderIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RestatementReasonField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SequenceNoField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.TradeLiquidityIndicatorField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.TradeMatchIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.TypeOfTradeField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.WaiverFlagsPostTradeFlagsField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.structs.TransactTime;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the ExecutionReportMessage message from the NativeTradingGatewayRecovery protocol.
 *
 * <p>Indicates order accepted, rejected, executed, expired, cancelled, cancel/replaced, restated or suspended, or a trade cancel.</p>
 */
public final class ExecutionReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '8';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 151;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 96, 7, 134, 1 };

    /**
     * App ID this message relates to.
     */
    private final AppIdField appId = new AppIdField();

    /**
     * Sequence number of the message.
     */
    private final SequenceNoField sequenceNo = new SequenceNoField();

    /**
     * Unique ID of the Execution Report.
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Unique identifier of the order assigned by the matching system.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * The reason the Execution Report is being sent.
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Reference to the trade being cancelled or corrected.
     */
    private final ExecutionReportRefIdField executionReportRefId = new ExecutionReportRefIdField();

    /**
     * The status of the order.
     */
    private final ExecutionReportOrderStatusField executionReportOrderStatus = new ExecutionReportOrderStatusField();

    /**
     * Code specifying the reason for the reject or the expiry.
     */
    private final OrderRejectCodeField orderRejectCode = new OrderRejectCodeField();

    /**
     * Value of this fill.
     */
    private final ExecutedPriceField executedPrice = new ExecutedPriceField();

    /**
     * Quantity that was executed in this fill.
     */
    private final ExecutedQtyField executedQty = new ExecutedQtyField();

    /**
     * Quantity available for further execution.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Pre-trade waiver and post trade flags
     */
    private final WaiverFlagsPostTradeFlagsField waiverFlagsPostTradeFlags = new WaiverFlagsPostTradeFlagsField();

    /**
     * Current visible quantity.
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Identifier of the instrument the Execution Report is sent for.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Reason order was restated or cancelled.
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * The instruction for permissioning to trade against mid-priced pegged orders.
     */
    private final ExecutionReportPeggedExecInstField executionReportPeggedExecInst = new ExecutionReportPeggedExecInstField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Not applicable for Quotes.
     */
    private final OwnerTypeField ownerType = new OwnerTypeField();

    /**
     * Counterparty Firm.
     */
    private final CounterpartyField counterparty = new CounterpartyField();

    /**
     * Whether the order added or removed liquidity.
     */
    private final TradeLiquidityIndicatorField tradeLiquidityIndicator = new TradeLiquidityIndicatorField();

    /**
     * Identifier of the trade.
     */
    private final TradeMatchIdField tradeMatchId = new TradeMatchIdField();

    /**
     * Market (Segment MIC) where execution took place.
     */
    private final LastMarketField lastMarket = new LastMarketField();

    /**
     * Indicates whether the executed portion of a passive order during continuous trading session is visible or hidden.
     */
    private final TypeOfTradeField typeOfTrade = new TypeOfTradeField();

    /**
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Maintained by matching engine, will be unique for each replenishment of a particular iceberg order.
     */
    private final PublicOrderIdField publicOrderId = new PublicOrderIdField();

    /**
     * Minimum Execution Size (MES) specified on a pegged order.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Composite
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(appId), List.<Field>of(sequenceNo), List.<Field>of(executionId), List.<Field>of(clientOrderId), List.<Field>of(orderId), List.<Field>of(execType), List.<Field>of(executionReportRefId), List.<Field>of(executionReportOrderStatus), List.<Field>of(orderRejectCode), List.<Field>of(executedPrice), List.<Field>of(executedQty), List.<Field>of(leavesQty), List.<Field>of(waiverFlagsPostTradeFlags), List.<Field>of(displayQty), List.<Field>of(instrumentId), List.<Field>of(restatementReason), List.<Field>of(executionReportPeggedExecInst), List.<Field>of(side), List.<Field>of(ownerType), List.<Field>of(counterparty), List.<Field>of(tradeLiquidityIndicator), List.<Field>of(tradeMatchId), transactTime.fields(), List.<Field>of(lastMarket), List.<Field>of(typeOfTrade), List.<Field>of(capacity), List.<Field>of(publicOrderId), List.<Field>of(minimumQuantity)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * App ID this message relates to.
     *
     * @return the AppId field
     */
    public AppIdField appId() {
        return appId;
    }

    /**
     * Sequence number of the message.
     *
     * @return the SequenceNo field
     */
    public SequenceNoField sequenceNo() {
        return sequenceNo;
    }

    /**
     * Unique ID of the Execution Report.
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * Client specified identifier of the rejected message if it is available.
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Unique identifier of the order assigned by the matching system.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * The reason the Execution Report is being sent.
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
    }

    /**
     * Reference to the trade being cancelled or corrected.
     *
     * @return the ExecutionReportRefId field
     */
    public ExecutionReportRefIdField executionReportRefId() {
        return executionReportRefId;
    }

    /**
     * The status of the order.
     *
     * @return the ExecutionReportOrderStatus field
     */
    public ExecutionReportOrderStatusField executionReportOrderStatus() {
        return executionReportOrderStatus;
    }

    /**
     * Code specifying the reason for the reject or the expiry.
     *
     * @return the OrderRejectCode field
     */
    public OrderRejectCodeField orderRejectCode() {
        return orderRejectCode;
    }

    /**
     * Value of this fill.
     *
     * @return the ExecutedPrice field
     */
    public ExecutedPriceField executedPrice() {
        return executedPrice;
    }

    /**
     * Quantity that was executed in this fill.
     *
     * @return the ExecutedQty field
     */
    public ExecutedQtyField executedQty() {
        return executedQty;
    }

    /**
     * Quantity available for further execution.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Pre-trade waiver and post trade flags
     *
     * @return the WaiverFlagsPostTradeFlags field
     */
    public WaiverFlagsPostTradeFlagsField waiverFlagsPostTradeFlags() {
        return waiverFlagsPostTradeFlags;
    }

    /**
     * Current visible quantity.
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Identifier of the instrument the Execution Report is sent for.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Reason order was restated or cancelled.
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
    }

    /**
     * The instruction for permissioning to trade against mid-priced pegged orders.
     *
     * @return the ExecutionReportPeggedExecInst field
     */
    public ExecutionReportPeggedExecInstField executionReportPeggedExecInst() {
        return executionReportPeggedExecInst;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Not applicable for Quotes.
     *
     * @return the OwnerType field
     */
    public OwnerTypeField ownerType() {
        return ownerType;
    }

    /**
     * Counterparty Firm.
     *
     * @return the Counterparty field
     */
    public CounterpartyField counterparty() {
        return counterparty;
    }

    /**
     * Whether the order added or removed liquidity.
     *
     * @return the TradeLiquidityIndicator field
     */
    public TradeLiquidityIndicatorField tradeLiquidityIndicator() {
        return tradeLiquidityIndicator;
    }

    /**
     * Identifier of the trade.
     *
     * @return the TradeMatchId field
     */
    public TradeMatchIdField tradeMatchId() {
        return tradeMatchId;
    }

    /**
     * Market (Segment MIC) where execution took place.
     *
     * @return the LastMarket field
     */
    public LastMarketField lastMarket() {
        return lastMarket;
    }

    /**
     * Indicates whether the executed portion of a passive order during continuous trading session is visible or hidden.
     *
     * @return the TypeOfTrade field
     */
    public TypeOfTradeField typeOfTrade() {
        return typeOfTrade;
    }

    /**
     * Capacity of the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Maintained by matching engine, will be unique for each replenishment of a particular iceberg order.
     *
     * @return the PublicOrderId field
     */
    public PublicOrderIdField publicOrderId() {
        return publicOrderId;
    }

    /**
     * Minimum Execution Size (MES) specified on a pegged order.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Composite
     *
     * @return the TransactTime record
     */
    public TransactTime transactTime() {
        return transactTime;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!appId.parse(data, cursor)) {
            return false;
        }
        cursor += AppIdField.BYTE_LENGTH;
        if (!sequenceNo.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNoField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!executionReportRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionReportRefIdField.BYTE_LENGTH;
        if (!executionReportOrderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionReportOrderStatusField.BYTE_LENGTH;
        if (!orderRejectCode.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRejectCodeField.BYTE_LENGTH;
        if (!executedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedPriceField.BYTE_LENGTH;
        if (!executedQty.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQtyField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!waiverFlagsPostTradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += WaiverFlagsPostTradeFlagsField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!restatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += RestatementReasonField.BYTE_LENGTH;
        if (!executionReportPeggedExecInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionReportPeggedExecInstField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ownerType.parse(data, cursor)) {
            return false;
        }
        cursor += OwnerTypeField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!counterparty.parse(data, cursor)) {
            return false;
        }
        cursor += CounterpartyField.BYTE_LENGTH;
        if (!tradeLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLiquidityIndicatorField.BYTE_LENGTH;
        if (!tradeMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeMatchIdField.BYTE_LENGTH;
        if (!transactTime.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += transactTime.byteLength();
        if (!lastMarket.parse(data, cursor)) {
            return false;
        }
        cursor += LastMarketField.BYTE_LENGTH;
        if (!typeOfTrade.parse(data, cursor)) {
            return false;
        }
        cursor += TypeOfTradeField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!publicOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += PublicOrderIdField.BYTE_LENGTH;
        return minimumQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = appId.encode(data, cursor);
        cursor = sequenceNo.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = executionReportRefId.encode(data, cursor);
        cursor = executionReportOrderStatus.encode(data, cursor);
        cursor = orderRejectCode.encode(data, cursor);
        cursor = executedPrice.encode(data, cursor);
        cursor = executedQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = waiverFlagsPostTradeFlags.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
        cursor = executionReportPeggedExecInst.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ownerType.encode(data, cursor);
        if (buffer != null && buffer.length >= 103) {
            System.arraycopy(buffer, 96, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = counterparty.encode(data, cursor);
        cursor = tradeLiquidityIndicator.encode(data, cursor);
        cursor = tradeMatchId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = lastMarket.encode(data, cursor);
        cursor = typeOfTrade.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 135) {
            System.arraycopy(buffer, 134, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = publicOrderId.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
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
        transactTime.clear();
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
            case "AppId" -> Optional.of(appId);
            case "SequenceNo" -> Optional.of(sequenceNo);
            case "ExecutionId" -> Optional.of(executionId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrderId" -> Optional.of(orderId);
            case "ExecType" -> Optional.of(execType);
            case "ExecutionReportRefId" -> Optional.of(executionReportRefId);
            case "ExecutionReportOrderStatus" -> Optional.of(executionReportOrderStatus);
            case "OrderRejectCode" -> Optional.of(orderRejectCode);
            case "ExecutedPrice" -> Optional.of(executedPrice);
            case "ExecutedQty" -> Optional.of(executedQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "WaiverFlagsPostTradeFlags" -> Optional.of(waiverFlagsPostTradeFlags);
            case "DisplayQty" -> Optional.of(displayQty);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "RestatementReason" -> Optional.of(restatementReason);
            case "ExecutionReportPeggedExecInst" -> Optional.of(executionReportPeggedExecInst);
            case "Side" -> Optional.of(side);
            case "OwnerType" -> Optional.of(ownerType);
            case "Counterparty" -> Optional.of(counterparty);
            case "TradeLiquidityIndicator" -> Optional.of(tradeLiquidityIndicator);
            case "TradeMatchId" -> Optional.of(tradeMatchId);
            case "LastMarket" -> Optional.of(lastMarket);
            case "TypeOfTrade" -> Optional.of(typeOfTrade);
            case "Capacity" -> Optional.of(capacity);
            case "PublicOrderId" -> Optional.of(publicOrderId);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportMessage message)) {
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
        if (!(other instanceof ExecutionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
