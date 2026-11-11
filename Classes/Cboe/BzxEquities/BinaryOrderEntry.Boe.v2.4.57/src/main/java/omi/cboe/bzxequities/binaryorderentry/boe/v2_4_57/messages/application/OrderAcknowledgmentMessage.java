package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.AccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.AttributedQuoteField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CapacityField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingAccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CmcSessionsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CrossTradeFlagField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DiscretionAmountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DisplayIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DisplayPriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.EchoTextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExDestinationField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExpireTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExtExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastSharesField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LeavesQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LocateBrokerField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MinQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderAcknowledgmentReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrigClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PegDifferenceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PreventMatchField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutStrategyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RouteDeliveryMethodField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutingInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SecondaryOrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StepUpAmountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StopPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TimeInForceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.WorkingPriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the OrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Acknowledgment Message.</p>
 */
public final class OrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgment Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1 = new OrderAcknowledgmentReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2 = new OrderAcknowledgmentReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3 = new OrderAcknowledgmentReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4 = new OrderAcknowledgmentReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5 = new OrderAcknowledgmentReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6 = new OrderAcknowledgmentReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7 = new OrderAcknowledgmentReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8 = new OrderAcknowledgmentReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9 = new OrderAcknowledgmentReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10 = new OrderAcknowledgmentReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11 = new OrderAcknowledgmentReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12 = new OrderAcknowledgmentReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13 = new OrderAcknowledgmentReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14 = new OrderAcknowledgmentReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15 = new OrderAcknowledgmentReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16 = new OrderAcknowledgmentReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17 = new OrderAcknowledgmentReturnBitfield17Field();

    /**
     * BitSet OrderAcknowledgment byte 18.
     */
    private final OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18 = new OrderAcknowledgmentReturnBitfield18Field();

    /**
     * BitSet OrderAcknowledgment byte 19.
     */
    private final OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19 = new OrderAcknowledgmentReturnBitfield19Field();

    /**
     * BitSet OrderAcknowledgment byte 20.
     */
    private final OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20 = new OrderAcknowledgmentReturnBitfield20Field();

    /**
     * BitSet OrderAcknowledgment byte 21.
     */
    private final OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21 = new OrderAcknowledgmentReturnBitfield21Field();

    /**
     * BitSet OrderAcknowledgment byte 22.
     */
    private final OrderAcknowledgmentReturnBitfield22Field orderAcknowledgmentReturnBitfield22 = new OrderAcknowledgmentReturnBitfield22Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     */
    private final SideField side = new SideField();

    /**
     * Peg Difference
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Symbol Sfx
     */
    private final SymbolSfxField symbolSfx = new SymbolSfxField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Display Indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Discretion Amount
     */
    private final DiscretionAmountField discretionAmount = new DiscretionAmountField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Display Price
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * Working Price
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Rout Strategy
     */
    private final RoutStrategyField routStrategy = new RoutStrategyField();

    /**
     * Route Delivery Method
     */
    private final RouteDeliveryMethodField routeDeliveryMethod = new RouteDeliveryMethodField();

    /**
     * Ex Destination
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * Cross Trade Flag
     */
    private final CrossTradeFlagField crossTradeFlag = new CrossTradeFlagField();

    /**
     * Locate Broker
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * Cmc Sessions
     */
    private final CmcSessionsField cmcSessions = new CmcSessionsField();

    /**
     * Step Up Amount
     */
    private final StepUpAmountField stepUpAmount = new StepUpAmountField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderAcknowledgmentReturnBitfield1, orderAcknowledgmentReturnBitfield2, orderAcknowledgmentReturnBitfield3, orderAcknowledgmentReturnBitfield4, orderAcknowledgmentReturnBitfield5, orderAcknowledgmentReturnBitfield6, orderAcknowledgmentReturnBitfield7, orderAcknowledgmentReturnBitfield8, orderAcknowledgmentReturnBitfield9, orderAcknowledgmentReturnBitfield10, orderAcknowledgmentReturnBitfield11, orderAcknowledgmentReturnBitfield12, orderAcknowledgmentReturnBitfield13, orderAcknowledgmentReturnBitfield14, orderAcknowledgmentReturnBitfield15, orderAcknowledgmentReturnBitfield16, orderAcknowledgmentReturnBitfield17, orderAcknowledgmentReturnBitfield18, orderAcknowledgmentReturnBitfield19, orderAcknowledgmentReturnBitfield20, orderAcknowledgmentReturnBitfield21, orderAcknowledgmentReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, attributedQuote, extExecInst, subLiquidityIndicator, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, crossTradeFlag, locateBroker, cmcSessions, stepUpAmount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the OrderAcknowledgmentReturnBitfield1 field
     */
    public OrderAcknowledgmentReturnBitfield1Field orderAcknowledgmentReturnBitfield1() {
        return orderAcknowledgmentReturnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the OrderAcknowledgmentReturnBitfield2 field
     */
    public OrderAcknowledgmentReturnBitfield2Field orderAcknowledgmentReturnBitfield2() {
        return orderAcknowledgmentReturnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the OrderAcknowledgmentReturnBitfield3 field
     */
    public OrderAcknowledgmentReturnBitfield3Field orderAcknowledgmentReturnBitfield3() {
        return orderAcknowledgmentReturnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the OrderAcknowledgmentReturnBitfield4 field
     */
    public OrderAcknowledgmentReturnBitfield4Field orderAcknowledgmentReturnBitfield4() {
        return orderAcknowledgmentReturnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the OrderAcknowledgmentReturnBitfield5 field
     */
    public OrderAcknowledgmentReturnBitfield5Field orderAcknowledgmentReturnBitfield5() {
        return orderAcknowledgmentReturnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the OrderAcknowledgmentReturnBitfield6 field
     */
    public OrderAcknowledgmentReturnBitfield6Field orderAcknowledgmentReturnBitfield6() {
        return orderAcknowledgmentReturnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the OrderAcknowledgmentReturnBitfield7 field
     */
    public OrderAcknowledgmentReturnBitfield7Field orderAcknowledgmentReturnBitfield7() {
        return orderAcknowledgmentReturnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the OrderAcknowledgmentReturnBitfield8 field
     */
    public OrderAcknowledgmentReturnBitfield8Field orderAcknowledgmentReturnBitfield8() {
        return orderAcknowledgmentReturnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the OrderAcknowledgmentReturnBitfield9 field
     */
    public OrderAcknowledgmentReturnBitfield9Field orderAcknowledgmentReturnBitfield9() {
        return orderAcknowledgmentReturnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the OrderAcknowledgmentReturnBitfield10 field
     */
    public OrderAcknowledgmentReturnBitfield10Field orderAcknowledgmentReturnBitfield10() {
        return orderAcknowledgmentReturnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the OrderAcknowledgmentReturnBitfield11 field
     */
    public OrderAcknowledgmentReturnBitfield11Field orderAcknowledgmentReturnBitfield11() {
        return orderAcknowledgmentReturnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the OrderAcknowledgmentReturnBitfield12 field
     */
    public OrderAcknowledgmentReturnBitfield12Field orderAcknowledgmentReturnBitfield12() {
        return orderAcknowledgmentReturnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the OrderAcknowledgmentReturnBitfield13 field
     */
    public OrderAcknowledgmentReturnBitfield13Field orderAcknowledgmentReturnBitfield13() {
        return orderAcknowledgmentReturnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the OrderAcknowledgmentReturnBitfield14 field
     */
    public OrderAcknowledgmentReturnBitfield14Field orderAcknowledgmentReturnBitfield14() {
        return orderAcknowledgmentReturnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the OrderAcknowledgmentReturnBitfield15 field
     */
    public OrderAcknowledgmentReturnBitfield15Field orderAcknowledgmentReturnBitfield15() {
        return orderAcknowledgmentReturnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the OrderAcknowledgmentReturnBitfield16 field
     */
    public OrderAcknowledgmentReturnBitfield16Field orderAcknowledgmentReturnBitfield16() {
        return orderAcknowledgmentReturnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the OrderAcknowledgmentReturnBitfield17 field
     */
    public OrderAcknowledgmentReturnBitfield17Field orderAcknowledgmentReturnBitfield17() {
        return orderAcknowledgmentReturnBitfield17;
    }

    /**
     * BitSet OrderAcknowledgment byte 18.
     *
     * @return the OrderAcknowledgmentReturnBitfield18 field
     */
    public OrderAcknowledgmentReturnBitfield18Field orderAcknowledgmentReturnBitfield18() {
        return orderAcknowledgmentReturnBitfield18;
    }

    /**
     * BitSet OrderAcknowledgment byte 19.
     *
     * @return the OrderAcknowledgmentReturnBitfield19 field
     */
    public OrderAcknowledgmentReturnBitfield19Field orderAcknowledgmentReturnBitfield19() {
        return orderAcknowledgmentReturnBitfield19;
    }

    /**
     * BitSet OrderAcknowledgment byte 20.
     *
     * @return the OrderAcknowledgmentReturnBitfield20 field
     */
    public OrderAcknowledgmentReturnBitfield20Field orderAcknowledgmentReturnBitfield20() {
        return orderAcknowledgmentReturnBitfield20;
    }

    /**
     * BitSet OrderAcknowledgment byte 21.
     *
     * @return the OrderAcknowledgmentReturnBitfield21 field
     */
    public OrderAcknowledgmentReturnBitfield21Field orderAcknowledgmentReturnBitfield21() {
        return orderAcknowledgmentReturnBitfield21;
    }

    /**
     * BitSet OrderAcknowledgment byte 22.
     *
     * @return the OrderAcknowledgmentReturnBitfield22 field
     */
    public OrderAcknowledgmentReturnBitfield22Field orderAcknowledgmentReturnBitfield22() {
        return orderAcknowledgmentReturnBitfield22;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Peg Difference
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Symbol Sfx
     *
     * @return the SymbolSfx field
     */
    public SymbolSfxField symbolSfx() {
        return symbolSfx;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Display Indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Discretion Amount
     *
     * @return the DiscretionAmount field
     */
    public DiscretionAmountField discretionAmount() {
        return discretionAmount;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Last Shares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Display Price
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * Working Price
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Base Liquidity Indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Secondary Order Id
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Attributed Quote
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Echo Text
     *
     * @return the EchoText field
     */
    public EchoTextField echoText() {
        return echoText;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Routing Inst
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Rout Strategy
     *
     * @return the RoutStrategy field
     */
    public RoutStrategyField routStrategy() {
        return routStrategy;
    }

    /**
     * Route Delivery Method
     *
     * @return the RouteDeliveryMethod field
     */
    public RouteDeliveryMethodField routeDeliveryMethod() {
        return routeDeliveryMethod;
    }

    /**
     * Ex Destination
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Cross Trade Flag
     *
     * @return the CrossTradeFlag field
     */
    public CrossTradeFlagField crossTradeFlag() {
        return crossTradeFlag;
    }

    /**
     * Locate Broker
     *
     * @return the LocateBroker field
     */
    public LocateBrokerField locateBroker() {
        return locateBroker;
    }

    /**
     * Cmc Sessions
     *
     * @return the CmcSessions field
     */
    public CmcSessionsField cmcSessions() {
        return cmcSessions;
    }

    /**
     * Step Up Amount
     *
     * @return the StepUpAmount field
     */
    public StepUpAmountField stepUpAmount() {
        return stepUpAmount;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield1 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield2 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield3 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield4 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield5 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield6 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield7 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield8 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield9 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield10 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield11 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield12 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield13 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield14 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield15 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield16 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield17 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield18 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield19 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield20 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield21 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentReturnBitfield22 is on the wire
     */
    public boolean orderAcknowledgmentReturnBitfield22Present() {
        return numberOfReturnBitfields.value() >= 22L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentReturnBitfield1Present() && orderAcknowledgmentReturnBitfield1.orderAcknowledgmentReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentReturnBitfield3Present() && orderAcknowledgmentReturnBitfield3.orderAcknowledgmentReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentReturnBitfield5Present() && orderAcknowledgmentReturnBitfield5.orderAcknowledgmentReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentReturnBitfield6Present() && orderAcknowledgmentReturnBitfield6.orderAcknowledgmentReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (orderAcknowledgmentReturnBitfield7Present() && orderAcknowledgmentReturnBitfield7.orderAcknowledgmentReturnBitfield7SubLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentReturnBitfield8Present() && orderAcknowledgmentReturnBitfield8.orderAcknowledgmentReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the CrossTradeFlag put it on the wire.
     *
     * <p>Decode reads the CrossTradeFlag where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossTradeFlag is on the wire
     */
    public boolean crossTradeFlagPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderAcknowledgmentReturnBitfield18Present() && orderAcknowledgmentReturnBitfield18.orderAcknowledgmentReturnBitfield18CrossTradeFlag());
    }

    /**
     * Returns whether the fields before the LocateBroker put it on the wire.
     *
     * <p>Decode reads the LocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LocateBroker is on the wire
     */
    public boolean locateBrokerPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderAcknowledgmentReturnBitfield18Present() && orderAcknowledgmentReturnBitfield18.orderAcknowledgmentReturnBitfield18LocateBroker());
    }

    /**
     * Returns whether the fields before the CmcSessions put it on the wire.
     *
     * <p>Decode reads the CmcSessions where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmcSessions is on the wire
     */
    public boolean cmcSessionsPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderAcknowledgmentReturnBitfield19Present() && orderAcknowledgmentReturnBitfield19.orderAcknowledgmentReturnBitfield19CmcSessions());
    }

    /**
     * Returns whether the fields before the StepUpAmount put it on the wire.
     *
     * <p>Decode reads the StepUpAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StepUpAmount is on the wire
     */
    public boolean stepUpAmountPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderAcknowledgmentReturnBitfield19Present() && orderAcknowledgmentReturnBitfield19.orderAcknowledgmentReturnBitfield19StepUpAmount());
    }

    private boolean onWire(Field field) {
        return (field != orderAcknowledgmentReturnBitfield1 || orderAcknowledgmentReturnBitfield1Present()) && (field != orderAcknowledgmentReturnBitfield2 || orderAcknowledgmentReturnBitfield2Present()) && (field != orderAcknowledgmentReturnBitfield3 || orderAcknowledgmentReturnBitfield3Present()) && (field != orderAcknowledgmentReturnBitfield4 || orderAcknowledgmentReturnBitfield4Present()) && (field != orderAcknowledgmentReturnBitfield5 || orderAcknowledgmentReturnBitfield5Present()) && (field != orderAcknowledgmentReturnBitfield6 || orderAcknowledgmentReturnBitfield6Present()) && (field != orderAcknowledgmentReturnBitfield7 || orderAcknowledgmentReturnBitfield7Present()) && (field != orderAcknowledgmentReturnBitfield8 || orderAcknowledgmentReturnBitfield8Present()) && (field != orderAcknowledgmentReturnBitfield9 || orderAcknowledgmentReturnBitfield9Present()) && (field != orderAcknowledgmentReturnBitfield10 || orderAcknowledgmentReturnBitfield10Present()) && (field != orderAcknowledgmentReturnBitfield11 || orderAcknowledgmentReturnBitfield11Present()) && (field != orderAcknowledgmentReturnBitfield12 || orderAcknowledgmentReturnBitfield12Present()) && (field != orderAcknowledgmentReturnBitfield13 || orderAcknowledgmentReturnBitfield13Present()) && (field != orderAcknowledgmentReturnBitfield14 || orderAcknowledgmentReturnBitfield14Present()) && (field != orderAcknowledgmentReturnBitfield15 || orderAcknowledgmentReturnBitfield15Present()) && (field != orderAcknowledgmentReturnBitfield16 || orderAcknowledgmentReturnBitfield16Present()) && (field != orderAcknowledgmentReturnBitfield17 || orderAcknowledgmentReturnBitfield17Present()) && (field != orderAcknowledgmentReturnBitfield18 || orderAcknowledgmentReturnBitfield18Present()) && (field != orderAcknowledgmentReturnBitfield19 || orderAcknowledgmentReturnBitfield19Present()) && (field != orderAcknowledgmentReturnBitfield20 || orderAcknowledgmentReturnBitfield20Present()) && (field != orderAcknowledgmentReturnBitfield21 || orderAcknowledgmentReturnBitfield21Present()) && (field != orderAcknowledgmentReturnBitfield22 || orderAcknowledgmentReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != crossTradeFlag || crossTradeFlagPresent()) && (field != locateBroker || locateBrokerPresent()) && (field != cmcSessions || cmcSessionsPresent()) && (field != stepUpAmount || stepUpAmountPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderAcknowledgmentReturnBitfield1Present() ? OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield2Present() ? OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield3Present() ? OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield4Present() ? OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield5Present() ? OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield6Present() ? OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield7Present() ? OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield8Present() ? OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield9Present() ? OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield10Present() ? OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield11Present() ? OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield12Present() ? OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield13Present() ? OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield14Present() ? OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield15Present() ? OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield16Present() ? OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield17Present() ? OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield18Present() ? OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield19Present() ? OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield20Present() ? OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield21Present() ? OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield22Present() ? OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (crossTradeFlagPresent() ? CrossTradeFlagField.BYTE_LENGTH : 0) + (locateBrokerPresent() ? LocateBrokerField.BYTE_LENGTH : 0) + (cmcSessionsPresent() ? CmcSessionsField.BYTE_LENGTH : 0) + (stepUpAmountPresent() ? StepUpAmountField.BYTE_LENGTH : 0);
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
        cursor += 20;
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderAcknowledgmentReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentReturnBitfield22Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pegDifferencePresent()) {
            cursor += 8;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (execInstPresent()) {
            cursor += 1;
        }
        if (ordTypePresent()) {
            cursor += 1;
        }
        if (timeInForcePresent()) {
            cursor += 1;
        }
        if (minQtyPresent()) {
            cursor += 4;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (symbolSfxPresent()) {
            cursor += 8;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (accountPresent()) {
            cursor += 16;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (clearingAccountPresent()) {
            cursor += 4;
        }
        if (displayIndicatorPresent()) {
            cursor += 1;
        }
        if (maxFloorPresent()) {
            cursor += 4;
        }
        if (discretionAmountPresent()) {
            cursor += 2;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (origClOrdIdPresent()) {
            cursor += 20;
        }
        if (leavesQtyPresent()) {
            cursor += 4;
        }
        if (lastSharesPresent()) {
            cursor += 4;
        }
        if (lastPxPresent()) {
            cursor += 8;
        }
        if (displayPricePresent()) {
            cursor += 8;
        }
        if (workingPricePresent()) {
            cursor += 8;
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (secondaryOrderIdPresent()) {
            cursor += 8;
        }
        if (attributedQuotePresent()) {
            cursor += 1;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (subLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (echoTextPresent()) {
            cursor += 64;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (routingInstPresent()) {
            cursor += 4;
        }
        if (routStrategyPresent()) {
            cursor += 6;
        }
        if (routeDeliveryMethodPresent()) {
            cursor += 3;
        }
        if (exDestinationPresent()) {
            cursor += 1;
        }
        if (crossTradeFlagPresent()) {
            cursor += 1;
        }
        if (locateBrokerPresent()) {
            cursor += 4;
        }
        if (cmcSessionsPresent()) {
            cursor += 2;
        }
        if (stepUpAmountPresent()) {
            cursor += 8;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderAcknowledgmentReturnBitfield1Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentReturnBitfield22Present()) {
            if (end - cursor < OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH || !orderAcknowledgmentReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentReturnBitfield22Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pegDifferencePresent()) {
            if (end - cursor < PegDifferenceField.BYTE_LENGTH || !pegDifference.parse(data, cursor)) {
                return false;
            }
            cursor += PegDifferenceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pricePresent()) {
            if (end - cursor < PriceField.BYTE_LENGTH || !price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (minQtyPresent()) {
            if (end - cursor < MinQtyField.BYTE_LENGTH || !minQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolSfxPresent()) {
            if (end - cursor < SymbolSfxField.BYTE_LENGTH || !symbolSfx.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolSfxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayIndicatorPresent()) {
            if (end - cursor < DisplayIndicatorField.BYTE_LENGTH || !displayIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (discretionAmountPresent()) {
            if (end - cursor < DiscretionAmountField.BYTE_LENGTH || !discretionAmount.parse(data, cursor)) {
                return false;
            }
            cursor += DiscretionAmountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (origClOrdIdPresent()) {
            if (end - cursor < OrigClOrdIdField.BYTE_LENGTH || !origClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += OrigClOrdIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (leavesQtyPresent()) {
            if (end - cursor < LeavesQtyField.BYTE_LENGTH || !leavesQty.parse(data, cursor)) {
                return false;
            }
            cursor += LeavesQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastSharesPresent()) {
            if (end - cursor < LastSharesField.BYTE_LENGTH || !lastShares.parse(data, cursor)) {
                return false;
            }
            cursor += LastSharesField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastPxPresent()) {
            if (end - cursor < LastPxField.BYTE_LENGTH || !lastPx.parse(data, cursor)) {
                return false;
            }
            cursor += LastPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayPricePresent()) {
            if (end - cursor < DisplayPriceField.BYTE_LENGTH || !displayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (workingPricePresent()) {
            if (end - cursor < WorkingPriceField.BYTE_LENGTH || !workingPrice.parse(data, cursor)) {
                return false;
            }
            cursor += WorkingPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (baseLiquidityIndicatorPresent()) {
            if (end - cursor < BaseLiquidityIndicatorField.BYTE_LENGTH || !baseLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (expireTimePresent()) {
            if (end - cursor < ExpireTimeField.BYTE_LENGTH || !expireTime.parse(data, cursor)) {
                return false;
            }
            cursor += ExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryOrderIdPresent()) {
            if (end - cursor < SecondaryOrderIdField.BYTE_LENGTH || !secondaryOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryOrderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (attributedQuotePresent()) {
            if (end - cursor < AttributedQuoteField.BYTE_LENGTH || !attributedQuote.parse(data, cursor)) {
                return false;
            }
            cursor += AttributedQuoteField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (echoTextPresent()) {
            if (end - cursor < EchoTextField.BYTE_LENGTH || !echoText.parse(data, cursor)) {
                return false;
            }
            cursor += EchoTextField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingInstPresent()) {
            if (end - cursor < RoutingInstField.BYTE_LENGTH || !routingInst.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routStrategyPresent()) {
            if (end - cursor < RoutStrategyField.BYTE_LENGTH || !routStrategy.parse(data, cursor)) {
                return false;
            }
            cursor += RoutStrategyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routeDeliveryMethodPresent()) {
            if (end - cursor < RouteDeliveryMethodField.BYTE_LENGTH || !routeDeliveryMethod.parse(data, cursor)) {
                return false;
            }
            cursor += RouteDeliveryMethodField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (exDestinationPresent()) {
            if (end - cursor < ExDestinationField.BYTE_LENGTH || !exDestination.parse(data, cursor)) {
                return false;
            }
            cursor += ExDestinationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossTradeFlagPresent()) {
            if (end - cursor < CrossTradeFlagField.BYTE_LENGTH || !crossTradeFlag.parse(data, cursor)) {
                return false;
            }
            cursor += CrossTradeFlagField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (locateBrokerPresent()) {
            if (end - cursor < LocateBrokerField.BYTE_LENGTH || !locateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += LocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmcSessionsPresent()) {
            if (end - cursor < CmcSessionsField.BYTE_LENGTH || !cmcSessions.parse(data, cursor)) {
                return false;
            }
            cursor += CmcSessionsField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stepUpAmountPresent()) {
            if (end - cursor < StepUpAmountField.BYTE_LENGTH || !stepUpAmount.parse(data, cursor)) {
                return false;
            }
            cursor += StepUpAmountField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderAcknowledgmentReturnBitfield1Present() != orderAcknowledgmentReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield1.hasValue() ? "orderAcknowledgmentReturnBitfield1 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield2Present() != orderAcknowledgmentReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield2.hasValue() ? "orderAcknowledgmentReturnBitfield2 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield3Present() != orderAcknowledgmentReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield3.hasValue() ? "orderAcknowledgmentReturnBitfield3 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield4Present() != orderAcknowledgmentReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield4.hasValue() ? "orderAcknowledgmentReturnBitfield4 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield5Present() != orderAcknowledgmentReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield5.hasValue() ? "orderAcknowledgmentReturnBitfield5 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield6Present() != orderAcknowledgmentReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield6.hasValue() ? "orderAcknowledgmentReturnBitfield6 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield7Present() != orderAcknowledgmentReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield7.hasValue() ? "orderAcknowledgmentReturnBitfield7 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield8Present() != orderAcknowledgmentReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield8.hasValue() ? "orderAcknowledgmentReturnBitfield8 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield9Present() != orderAcknowledgmentReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield9.hasValue() ? "orderAcknowledgmentReturnBitfield9 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield10Present() != orderAcknowledgmentReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield10.hasValue() ? "orderAcknowledgmentReturnBitfield10 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield11Present() != orderAcknowledgmentReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield11.hasValue() ? "orderAcknowledgmentReturnBitfield11 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield12Present() != orderAcknowledgmentReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield12.hasValue() ? "orderAcknowledgmentReturnBitfield12 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield13Present() != orderAcknowledgmentReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield13.hasValue() ? "orderAcknowledgmentReturnBitfield13 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield14Present() != orderAcknowledgmentReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield14.hasValue() ? "orderAcknowledgmentReturnBitfield14 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield15Present() != orderAcknowledgmentReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield15.hasValue() ? "orderAcknowledgmentReturnBitfield15 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield16Present() != orderAcknowledgmentReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield16.hasValue() ? "orderAcknowledgmentReturnBitfield16 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield17Present() != orderAcknowledgmentReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield17.hasValue() ? "orderAcknowledgmentReturnBitfield17 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield18Present() != orderAcknowledgmentReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield18.hasValue() ? "orderAcknowledgmentReturnBitfield18 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield19Present() != orderAcknowledgmentReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield19.hasValue() ? "orderAcknowledgmentReturnBitfield19 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield20Present() != orderAcknowledgmentReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield20.hasValue() ? "orderAcknowledgmentReturnBitfield20 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield21Present() != orderAcknowledgmentReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield21.hasValue() ? "orderAcknowledgmentReturnBitfield21 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentReturnBitfield22Present() != orderAcknowledgmentReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentReturnBitfield22.hasValue() ? "orderAcknowledgmentReturnBitfield22 holds a value the fields before it leave off the wire" : "orderAcknowledgmentReturnBitfield22 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pegDifferencePresent() != pegDifference.hasValue()) {
            throw new IllegalStateException(pegDifference.hasValue() ? "pegDifference holds a value the fields before it leave off the wire" : "pegDifference holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (minQtyPresent() != minQty.hasValue()) {
            throw new IllegalStateException(minQty.hasValue() ? "minQty holds a value the fields before it leave off the wire" : "minQty holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (symbolSfxPresent() != symbolSfx.hasValue()) {
            throw new IllegalStateException(symbolSfx.hasValue() ? "symbolSfx holds a value the fields before it leave off the wire" : "symbolSfx holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (displayIndicatorPresent() != displayIndicator.hasValue()) {
            throw new IllegalStateException(displayIndicator.hasValue() ? "displayIndicator holds a value the fields before it leave off the wire" : "displayIndicator holds no value, though the fields before it put it on the wire");
        }
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (discretionAmountPresent() != discretionAmount.hasValue()) {
            throw new IllegalStateException(discretionAmount.hasValue() ? "discretionAmount holds a value the fields before it leave off the wire" : "discretionAmount holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (origClOrdIdPresent() != origClOrdId.hasValue()) {
            throw new IllegalStateException(origClOrdId.hasValue() ? "origClOrdId holds a value the fields before it leave off the wire" : "origClOrdId holds no value, though the fields before it put it on the wire");
        }
        if (leavesQtyPresent() != leavesQty.hasValue()) {
            throw new IllegalStateException(leavesQty.hasValue() ? "leavesQty holds a value the fields before it leave off the wire" : "leavesQty holds no value, though the fields before it put it on the wire");
        }
        if (lastSharesPresent() != lastShares.hasValue()) {
            throw new IllegalStateException(lastShares.hasValue() ? "lastShares holds a value the fields before it leave off the wire" : "lastShares holds no value, though the fields before it put it on the wire");
        }
        if (lastPxPresent() != lastPx.hasValue()) {
            throw new IllegalStateException(lastPx.hasValue() ? "lastPx holds a value the fields before it leave off the wire" : "lastPx holds no value, though the fields before it put it on the wire");
        }
        if (displayPricePresent() != displayPrice.hasValue()) {
            throw new IllegalStateException(displayPrice.hasValue() ? "displayPrice holds a value the fields before it leave off the wire" : "displayPrice holds no value, though the fields before it put it on the wire");
        }
        if (workingPricePresent() != workingPrice.hasValue()) {
            throw new IllegalStateException(workingPrice.hasValue() ? "workingPrice holds a value the fields before it leave off the wire" : "workingPrice holds no value, though the fields before it put it on the wire");
        }
        if (baseLiquidityIndicatorPresent() != baseLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(baseLiquidityIndicator.hasValue() ? "baseLiquidityIndicator holds a value the fields before it leave off the wire" : "baseLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
        }
        if (routStrategyPresent() != routStrategy.hasValue()) {
            throw new IllegalStateException(routStrategy.hasValue() ? "routStrategy holds a value the fields before it leave off the wire" : "routStrategy holds no value, though the fields before it put it on the wire");
        }
        if (routeDeliveryMethodPresent() != routeDeliveryMethod.hasValue()) {
            throw new IllegalStateException(routeDeliveryMethod.hasValue() ? "routeDeliveryMethod holds a value the fields before it leave off the wire" : "routeDeliveryMethod holds no value, though the fields before it put it on the wire");
        }
        if (exDestinationPresent() != exDestination.hasValue()) {
            throw new IllegalStateException(exDestination.hasValue() ? "exDestination holds a value the fields before it leave off the wire" : "exDestination holds no value, though the fields before it put it on the wire");
        }
        if (crossTradeFlagPresent() != crossTradeFlag.hasValue()) {
            throw new IllegalStateException(crossTradeFlag.hasValue() ? "crossTradeFlag holds a value the fields before it leave off the wire" : "crossTradeFlag holds no value, though the fields before it put it on the wire");
        }
        if (locateBrokerPresent() != locateBroker.hasValue()) {
            throw new IllegalStateException(locateBroker.hasValue() ? "locateBroker holds a value the fields before it leave off the wire" : "locateBroker holds no value, though the fields before it put it on the wire");
        }
        if (cmcSessionsPresent() != cmcSessions.hasValue()) {
            throw new IllegalStateException(cmcSessions.hasValue() ? "cmcSessions holds a value the fields before it leave off the wire" : "cmcSessions holds no value, though the fields before it put it on the wire");
        }
        if (stepUpAmountPresent() != stepUpAmount.hasValue()) {
            throw new IllegalStateException(stepUpAmount.hasValue() ? "stepUpAmount holds a value the fields before it leave off the wire" : "stepUpAmount holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderAcknowledgmentReturnBitfield1Present()) {
            cursor = orderAcknowledgmentReturnBitfield1.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield2Present()) {
            cursor = orderAcknowledgmentReturnBitfield2.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield3Present()) {
            cursor = orderAcknowledgmentReturnBitfield3.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield4Present()) {
            cursor = orderAcknowledgmentReturnBitfield4.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield5Present()) {
            cursor = orderAcknowledgmentReturnBitfield5.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield6Present()) {
            cursor = orderAcknowledgmentReturnBitfield6.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield7Present()) {
            cursor = orderAcknowledgmentReturnBitfield7.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield8Present()) {
            cursor = orderAcknowledgmentReturnBitfield8.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield9Present()) {
            cursor = orderAcknowledgmentReturnBitfield9.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield10Present()) {
            cursor = orderAcknowledgmentReturnBitfield10.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield11Present()) {
            cursor = orderAcknowledgmentReturnBitfield11.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield12Present()) {
            cursor = orderAcknowledgmentReturnBitfield12.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield13Present()) {
            cursor = orderAcknowledgmentReturnBitfield13.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield14Present()) {
            cursor = orderAcknowledgmentReturnBitfield14.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield15Present()) {
            cursor = orderAcknowledgmentReturnBitfield15.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield16Present()) {
            cursor = orderAcknowledgmentReturnBitfield16.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield17Present()) {
            cursor = orderAcknowledgmentReturnBitfield17.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield18Present()) {
            cursor = orderAcknowledgmentReturnBitfield18.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield19Present()) {
            cursor = orderAcknowledgmentReturnBitfield19.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield20Present()) {
            cursor = orderAcknowledgmentReturnBitfield20.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield21Present()) {
            cursor = orderAcknowledgmentReturnBitfield21.encode(data, cursor);
        }
        if (orderAcknowledgmentReturnBitfield22Present()) {
            cursor = orderAcknowledgmentReturnBitfield22.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pegDifferencePresent()) {
            cursor = pegDifference.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (minQtyPresent()) {
            cursor = minQty.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (symbolSfxPresent()) {
            cursor = symbolSfx.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (displayIndicatorPresent()) {
            cursor = displayIndicator.encode(data, cursor);
        }
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (discretionAmountPresent()) {
            cursor = discretionAmount.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (origClOrdIdPresent()) {
            cursor = origClOrdId.encode(data, cursor);
        }
        if (leavesQtyPresent()) {
            cursor = leavesQty.encode(data, cursor);
        }
        if (lastSharesPresent()) {
            cursor = lastShares.encode(data, cursor);
        }
        if (lastPxPresent()) {
            cursor = lastPx.encode(data, cursor);
        }
        if (displayPricePresent()) {
            cursor = displayPrice.encode(data, cursor);
        }
        if (workingPricePresent()) {
            cursor = workingPrice.encode(data, cursor);
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor = baseLiquidityIndicator.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
        }
        if (routStrategyPresent()) {
            cursor = routStrategy.encode(data, cursor);
        }
        if (routeDeliveryMethodPresent()) {
            cursor = routeDeliveryMethod.encode(data, cursor);
        }
        if (exDestinationPresent()) {
            cursor = exDestination.encode(data, cursor);
        }
        if (crossTradeFlagPresent()) {
            cursor = crossTradeFlag.encode(data, cursor);
        }
        if (locateBrokerPresent()) {
            cursor = locateBroker.encode(data, cursor);
        }
        if (cmcSessionsPresent()) {
            cursor = cmcSessions.encode(data, cursor);
        }
        if (stepUpAmountPresent()) {
            cursor = stepUpAmount.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderAcknowledgmentReturnBitfield1" -> Optional.of(orderAcknowledgmentReturnBitfield1);
            case "OrderAcknowledgmentReturnBitfield2" -> Optional.of(orderAcknowledgmentReturnBitfield2);
            case "OrderAcknowledgmentReturnBitfield3" -> Optional.of(orderAcknowledgmentReturnBitfield3);
            case "OrderAcknowledgmentReturnBitfield4" -> Optional.of(orderAcknowledgmentReturnBitfield4);
            case "OrderAcknowledgmentReturnBitfield5" -> Optional.of(orderAcknowledgmentReturnBitfield5);
            case "OrderAcknowledgmentReturnBitfield6" -> Optional.of(orderAcknowledgmentReturnBitfield6);
            case "OrderAcknowledgmentReturnBitfield7" -> Optional.of(orderAcknowledgmentReturnBitfield7);
            case "OrderAcknowledgmentReturnBitfield8" -> Optional.of(orderAcknowledgmentReturnBitfield8);
            case "OrderAcknowledgmentReturnBitfield9" -> Optional.of(orderAcknowledgmentReturnBitfield9);
            case "OrderAcknowledgmentReturnBitfield10" -> Optional.of(orderAcknowledgmentReturnBitfield10);
            case "OrderAcknowledgmentReturnBitfield11" -> Optional.of(orderAcknowledgmentReturnBitfield11);
            case "OrderAcknowledgmentReturnBitfield12" -> Optional.of(orderAcknowledgmentReturnBitfield12);
            case "OrderAcknowledgmentReturnBitfield13" -> Optional.of(orderAcknowledgmentReturnBitfield13);
            case "OrderAcknowledgmentReturnBitfield14" -> Optional.of(orderAcknowledgmentReturnBitfield14);
            case "OrderAcknowledgmentReturnBitfield15" -> Optional.of(orderAcknowledgmentReturnBitfield15);
            case "OrderAcknowledgmentReturnBitfield16" -> Optional.of(orderAcknowledgmentReturnBitfield16);
            case "OrderAcknowledgmentReturnBitfield17" -> Optional.of(orderAcknowledgmentReturnBitfield17);
            case "OrderAcknowledgmentReturnBitfield18" -> Optional.of(orderAcknowledgmentReturnBitfield18);
            case "OrderAcknowledgmentReturnBitfield19" -> Optional.of(orderAcknowledgmentReturnBitfield19);
            case "OrderAcknowledgmentReturnBitfield20" -> Optional.of(orderAcknowledgmentReturnBitfield20);
            case "OrderAcknowledgmentReturnBitfield21" -> Optional.of(orderAcknowledgmentReturnBitfield21);
            case "OrderAcknowledgmentReturnBitfield22" -> Optional.of(orderAcknowledgmentReturnBitfield22);
            case "Side" -> Optional.of(side);
            case "PegDifference" -> Optional.of(pegDifference);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "DiscretionAmount" -> Optional.of(discretionAmount);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "EchoText" -> Optional.of(echoText);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            case "CrossTradeFlag" -> Optional.of(crossTradeFlag);
            case "LocateBroker" -> Optional.of(locateBroker);
            case "CmcSessions" -> Optional.of(cmcSessions);
            case "StepUpAmount" -> Optional.of(stepUpAmount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
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
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
