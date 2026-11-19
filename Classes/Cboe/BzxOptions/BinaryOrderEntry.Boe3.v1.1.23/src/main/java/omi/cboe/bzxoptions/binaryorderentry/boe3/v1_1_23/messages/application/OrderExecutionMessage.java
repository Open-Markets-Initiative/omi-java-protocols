package omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ContraBrokerField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ContraCapacityField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ContraTraderField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.CrossExclusionIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.EquityExDestinationField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ExDestinationField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.ExecIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.FeeCodeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.FloorTradeTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.FloorTraderAcronymField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.InFlightField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.LastPxField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.LastSharesField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.LeavesQtyField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.MarketingFeeCodeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.MultilegReportingTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.PriceTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.RoutingFirmIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.SecondaryExecIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.SenderLocationIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.TradeDateField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.TradeThroughAlertTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the OrderExecutionMessage message from the BinaryOrderEntry protocol.
 *
 * <p>An Order Execution message is sent for each fill on an order</p>
 */
public final class OrderExecutionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 116;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Execution ID
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Executed share quantity
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Additional information about an execution
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Internally matched simple executions will identify the OCC clearing number of the contra on the execution
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Only present on local book trades, not present on routed trades
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Capacity of the contra for this execution
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * Indicates fee associated with an execution
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * MarketingFeeCode
     */
    private final MarketingFeeCodeField marketingFeeCode = new MarketingFeeCodeField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * CrossExclusionIndicator
     */
    private final CrossExclusionIndicatorField crossExclusionIndicator = new CrossExclusionIndicatorField();

    /**
     * TradeDate
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Indicates the type of Order Execution message
     */
    private final MultilegReportingTypeField multilegReportingType = new MultilegReportingTypeField();

    /**
     * Indicates whether a fill or partial fill is a complex instrument fill or a single leg fill that comprises a complex execution
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * PriceType
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Indication of a type of trade through
     */
    private final TradeThroughAlertTypeField tradeThroughAlertType = new TradeThroughAlertTypeField();

    /**
     * Sender Location Id
     */
    private final SenderLocationIdField senderLocationId = new SenderLocationIdField();

    /**
     * Floor Acronym of member submitting trade
     */
    private final FloorTraderAcronymField floorTraderAcronym = new FloorTraderAcronymField();

    /**
     * Trade time reported by the trading floor
     */
    private final FloorTradeTimeField floorTradeTime = new FloorTradeTimeField();

    /**
     * Used to specify the designated away venue
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * Valid when an equity symbol is present in the complex instrument
     */
    private final EquityExDestinationField equityExDestination = new EquityExDestinationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, clOrdId, execId, lastShares, lastPx, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, contraBroker, side, symbol, contraTrader, clearingFirm, contraCapacity, feeCode, marketingFeeCode, routingFirmId, crossExclusionIndicator, tradeDate, multilegReportingType, secondaryExecId, priceType, tradeThroughAlertType, senderLocationId, floorTraderAcronym, floorTradeTime, exDestination, equityExDestination);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages "in-flight" from the port
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * The exchange timestamp of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Execution ID
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Executed share quantity
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
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
     * Quantity still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Additional information about an execution
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Internally matched simple executions will identify the OCC clearing number of the contra on the execution
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Only present on local book trades, not present on routed trades
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Capacity of the contra for this execution
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
    }

    /**
     * Indicates fee associated with an execution
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * MarketingFeeCode
     *
     * @return the MarketingFeeCode field
     */
    public MarketingFeeCodeField marketingFeeCode() {
        return marketingFeeCode;
    }

    /**
     * Used to optionally convey the routing firm of the order
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * CrossExclusionIndicator
     *
     * @return the CrossExclusionIndicator field
     */
    public CrossExclusionIndicatorField crossExclusionIndicator() {
        return crossExclusionIndicator;
    }

    /**
     * TradeDate
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Indicates the type of Order Execution message
     *
     * @return the MultilegReportingType field
     */
    public MultilegReportingTypeField multilegReportingType() {
        return multilegReportingType;
    }

    /**
     * Indicates whether a fill or partial fill is a complex instrument fill or a single leg fill that comprises a complex execution
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * PriceType
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Indication of a type of trade through
     *
     * @return the TradeThroughAlertType field
     */
    public TradeThroughAlertTypeField tradeThroughAlertType() {
        return tradeThroughAlertType;
    }

    /**
     * Sender Location Id
     *
     * @return the SenderLocationId field
     */
    public SenderLocationIdField senderLocationId() {
        return senderLocationId;
    }

    /**
     * Floor Acronym of member submitting trade
     *
     * @return the FloorTraderAcronym field
     */
    public FloorTraderAcronymField floorTraderAcronym() {
        return floorTraderAcronym;
    }

    /**
     * Trade time reported by the trading floor
     *
     * @return the FloorTradeTime field
     */
    public FloorTradeTimeField floorTradeTime() {
        return floorTradeTime;
    }

    /**
     * Used to specify the designated away venue
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Valid when an equity symbol is present in the complex instrument
     *
     * @return the EquityExDestination field
     */
    public EquityExDestinationField equityExDestination() {
        return equityExDestination;
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
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
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!contraCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCapacityField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        if (!marketingFeeCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketingFeeCodeField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!crossExclusionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossExclusionIndicatorField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!multilegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegReportingTypeField.BYTE_LENGTH;
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!tradeThroughAlertType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeThroughAlertTypeField.BYTE_LENGTH;
        if (!senderLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationIdField.BYTE_LENGTH;
        if (!floorTraderAcronym.parse(data, cursor)) {
            return false;
        }
        cursor += FloorTraderAcronymField.BYTE_LENGTH;
        if (!floorTradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += FloorTradeTimeField.BYTE_LENGTH;
        if (!exDestination.parse(data, cursor)) {
            return false;
        }
        cursor += ExDestinationField.BYTE_LENGTH;
        return equityExDestination.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = contraCapacity.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = marketingFeeCode.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = crossExclusionIndicator.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = multilegReportingType.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = tradeThroughAlertType.encode(data, cursor);
        cursor = senderLocationId.encode(data, cursor);
        cursor = floorTraderAcronym.encode(data, cursor);
        cursor = floorTradeTime.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
        cursor = equityExDestination.encode(data, cursor);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "ContraTrader" -> Optional.of(contraTrader);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "FeeCode" -> Optional.of(feeCode);
            case "MarketingFeeCode" -> Optional.of(marketingFeeCode);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "CrossExclusionIndicator" -> Optional.of(crossExclusionIndicator);
            case "TradeDate" -> Optional.of(tradeDate);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "PriceType" -> Optional.of(priceType);
            case "TradeThroughAlertType" -> Optional.of(tradeThroughAlertType);
            case "SenderLocationId" -> Optional.of(senderLocationId);
            case "FloorTraderAcronym" -> Optional.of(floorTraderAcronym);
            case "FloorTradeTime" -> Optional.of(floorTradeTime);
            case "ExDestination" -> Optional.of(exDestination);
            case "EquityExDestination" -> Optional.of(equityExDestination);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutionMessage message)) {
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
        if (!(other instanceof OrderExecutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
