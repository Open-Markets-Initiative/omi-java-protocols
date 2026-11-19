package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.AccountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.AttributedQuoteField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.CapacityField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClOrdIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingAccountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.CmcSessionsField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.CrossTradeFlagField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.DiscretionAmountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.DisplayIndicatorField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.DisplayRangeField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ExDestinationField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ExecInstField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ExpireTimeField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ExtExecInstField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.LocateBrokerField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.LocateReqdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.MaxFloorField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.MinQtyField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.OrdTypeField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.OrderQtyField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.PegDifferenceField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.PreventMatchField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.PriceField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RiskGroupIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RoutStrategyField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RouteDeliveryMethodField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.RoutingInstField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.SideField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.StepUpAmountField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.StopPxField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.SymbolField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.TimeInForceField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the NewOrderUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Submission of a new order to Cboe</p>
 */
public final class NewOrderUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 141;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Us Equities V";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Execution instruction
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time in force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Minimum fill quantity for non-routable hidden or non-routable IOC orders which only interact with liquidity on the target Cboe Exchange
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Entire Cboe format
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Routing instruction
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Re-pricing and display options
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Two implied decimal places (e.g., 10 = $0.10)
     */
    private final DiscretionAmountField discretionAmount = new DiscretionAmountField();

    /**
     * Optional signed value added to the result of peg calculation
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Three characters: MTP Modifier, Unique ID Level and Trading Group ID
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Optional, only processed for Sell Short and Sell Short Exempt orders
     */
    private final LocateReqdField locateReqd = new LocateReqdField();

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Allows for an order to be attributed to a firm's MPID or optionally RTAL (for retail firms) in Cboe market data feeds
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Extended execution instruction
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Used for random replenishment of reserve orders
     */
    private final DisplayRangeField displayRange = new DisplayRangeField();

    /**
     * Stop price
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Routing strategy
     */
    private final RoutStrategyField routStrategy = new RoutStrategyField();

    /**
     * Route delivery method
     */
    private final RouteDeliveryMethodField routeDeliveryMethod = new RouteDeliveryMethodField();

    /**
     * Used to specify the designated away venue for RoutStrategy = DIRC and for RoutingInst = A (Post to Away)
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdField riskGroupId = new RiskGroupIdField();

    /**
     * Used to set eligibility for Periodic Auctions
     */
    private final CrossTradeFlagField crossTradeFlag = new CrossTradeFlagField();

    /**
     * Used for short sale orders to identify the broker that the short seller has identified as the source from which they will borrow the securities they are selling short
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * StepUpAmount is implicitly added to bid prices and subtracted from offer prices for Enhanced RPI (Retail Price Improvement) orders
     */
    private final StepUpAmountField stepUpAmount = new StepUpAmountField();

    /**
     * Specifies the range of CMC sessions the order is eligible to participate in
     */
    private final CmcSessionsField cmcSessions = new CmcSessionsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, side, orderQty, clearingFirm, clearingAccount, price, execInst, ordType, timeInForce, minQty, maxFloor, symbol, capacity, routingInst, account, displayIndicator, discretionAmount, pegDifference, preventMatch, locateReqd, expireTime, attributedQuote, extExecInst, displayRange, stopPx, routStrategy, routeDeliveryMethod, exDestination, riskGroupId, crossTradeFlag, locateBroker, stepUpAmount, cmcSessions);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * MPID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Supplemental identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Execution instruction
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time in force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Minimum fill quantity for non-routable hidden or non-routable IOC orders which only interact with liquidity on the target Cboe Exchange
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Entire Cboe format
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Routing instruction
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Reflected back on execution reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Re-pricing and display options
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Two implied decimal places (e.g., 10 = $0.10)
     *
     * @return the DiscretionAmount field
     */
    public DiscretionAmountField discretionAmount() {
        return discretionAmount;
    }

    /**
     * Optional signed value added to the result of peg calculation
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
    }

    /**
     * Three characters: MTP Modifier, Unique ID Level and Trading Group ID
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Optional, only processed for Sell Short and Sell Short Exempt orders
     *
     * @return the LocateReqd field
     */
    public LocateReqdField locateReqd() {
        return locateReqd;
    }

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Allows for an order to be attributed to a firm's MPID or optionally RTAL (for retail firms) in Cboe market data feeds
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * Extended execution instruction
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Used for random replenishment of reserve orders
     *
     * @return the DisplayRange field
     */
    public DisplayRangeField displayRange() {
        return displayRange;
    }

    /**
     * Stop price
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Routing strategy
     *
     * @return the RoutStrategy field
     */
    public RoutStrategyField routStrategy() {
        return routStrategy;
    }

    /**
     * Route delivery method
     *
     * @return the RouteDeliveryMethod field
     */
    public RouteDeliveryMethodField routeDeliveryMethod() {
        return routeDeliveryMethod;
    }

    /**
     * Used to specify the designated away venue for RoutStrategy = DIRC and for RoutingInst = A (Post to Away)
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Used to group orders for use in Purge Orders messages where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * @return the RiskGroupId field
     */
    public RiskGroupIdField riskGroupId() {
        return riskGroupId;
    }

    /**
     * Used to set eligibility for Periodic Auctions
     *
     * @return the CrossTradeFlag field
     */
    public CrossTradeFlagField crossTradeFlag() {
        return crossTradeFlag;
    }

    /**
     * Used for short sale orders to identify the broker that the short seller has identified as the source from which they will borrow the securities they are selling short
     *
     * @return the LocateBroker field
     */
    public LocateBrokerField locateBroker() {
        return locateBroker;
    }

    /**
     * StepUpAmount is implicitly added to bid prices and subtracted from offer prices for Enhanced RPI (Retail Price Improvement) orders
     *
     * @return the StepUpAmount field
     */
    public StepUpAmountField stepUpAmount() {
        return stepUpAmount;
    }

    /**
     * Specifies the range of CMC sessions the order is eligible to participate in
     *
     * @return the CmcSessions field
     */
    public CmcSessionsField cmcSessions() {
        return cmcSessions;
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
        return Optional.ofNullable(expireTime.value());
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        if (!discretionAmount.parse(data, cursor)) {
            return false;
        }
        cursor += DiscretionAmountField.BYTE_LENGTH;
        if (!pegDifference.parse(data, cursor)) {
            return false;
        }
        cursor += PegDifferenceField.BYTE_LENGTH;
        if (!preventMatch.parse(data, cursor)) {
            return false;
        }
        cursor += PreventMatchField.BYTE_LENGTH;
        if (!locateReqd.parse(data, cursor)) {
            return false;
        }
        cursor += LocateReqdField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!extExecInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExtExecInstField.BYTE_LENGTH;
        if (!displayRange.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayRangeField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!routStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += RoutStrategyField.BYTE_LENGTH;
        if (!routeDeliveryMethod.parse(data, cursor)) {
            return false;
        }
        cursor += RouteDeliveryMethodField.BYTE_LENGTH;
        if (!exDestination.parse(data, cursor)) {
            return false;
        }
        cursor += ExDestinationField.BYTE_LENGTH;
        if (!riskGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdField.BYTE_LENGTH;
        if (!crossTradeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTradeFlagField.BYTE_LENGTH;
        if (!locateBroker.parse(data, cursor)) {
            return false;
        }
        cursor += LocateBrokerField.BYTE_LENGTH;
        if (!stepUpAmount.parse(data, cursor)) {
            return false;
        }
        cursor += StepUpAmountField.BYTE_LENGTH;
        return cmcSessions.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = discretionAmount.encode(data, cursor);
        cursor = pegDifference.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = locateReqd.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = extExecInst.encode(data, cursor);
        cursor = displayRange.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = routStrategy.encode(data, cursor);
        cursor = routeDeliveryMethod.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
        cursor = crossTradeFlag.encode(data, cursor);
        cursor = locateBroker.encode(data, cursor);
        cursor = stepUpAmount.encode(data, cursor);
        cursor = cmcSessions.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "DiscretionAmount" -> Optional.of(discretionAmount);
            case "PegDifference" -> Optional.of(pegDifference);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "LocateReqd" -> Optional.of(locateReqd);
            case "ExpireTime" -> Optional.of(expireTime);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "DisplayRange" -> Optional.of(displayRange);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            case "RiskGroupId" -> Optional.of(riskGroupId);
            case "CrossTradeFlag" -> Optional.of(crossTradeFlag);
            case "LocateBroker" -> Optional.of(locateBroker);
            case "StepUpAmount" -> Optional.of(stepUpAmount);
            case "CmcSessions" -> Optional.of(cmcSessions);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderUsEquitiesV message)) {
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
        if (!(other instanceof NewOrderUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
