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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CancelReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CapacityField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingAccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingFirmField;
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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MinQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderCancelledReturnBitfield9Field;
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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StopPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TimeInForceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.WorkingPriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the OrderCancelledMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Cancelled Message.</p>
 */
public final class OrderCancelledMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancelled Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for the order cancellation. See Reason Codes for a list of possible reasons.
     */
    private final CancelReasonField cancelReason = new CancelReasonField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderCancelled byte 1.
     */
    private final OrderCancelledReturnBitfield1Field orderCancelledReturnBitfield1 = new OrderCancelledReturnBitfield1Field();

    /**
     * BitSet OrderCancelled byte 2.
     */
    private final OrderCancelledReturnBitfield2Field orderCancelledReturnBitfield2 = new OrderCancelledReturnBitfield2Field();

    /**
     * BitSet OrderCancelled byte 3.
     */
    private final OrderCancelledReturnBitfield3Field orderCancelledReturnBitfield3 = new OrderCancelledReturnBitfield3Field();

    /**
     * BitSet OrderCancelled byte 4.
     */
    private final OrderCancelledReturnBitfield4Field orderCancelledReturnBitfield4 = new OrderCancelledReturnBitfield4Field();

    /**
     * BitSet OrderCancelled byte 5.
     */
    private final OrderCancelledReturnBitfield5Field orderCancelledReturnBitfield5 = new OrderCancelledReturnBitfield5Field();

    /**
     * BitSet OrderCancelled byte 6.
     */
    private final OrderCancelledReturnBitfield6Field orderCancelledReturnBitfield6 = new OrderCancelledReturnBitfield6Field();

    /**
     * BitSet OrderCancelled byte 7.
     */
    private final OrderCancelledReturnBitfield7Field orderCancelledReturnBitfield7 = new OrderCancelledReturnBitfield7Field();

    /**
     * BitSet OrderCancelled byte 8.
     */
    private final OrderCancelledReturnBitfield8Field orderCancelledReturnBitfield8 = new OrderCancelledReturnBitfield8Field();

    /**
     * BitSet OrderCancelled byte 9.
     */
    private final OrderCancelledReturnBitfield9Field orderCancelledReturnBitfield9 = new OrderCancelledReturnBitfield9Field();

    /**
     * BitSet OrderCancelled byte 10.
     */
    private final OrderCancelledReturnBitfield10Field orderCancelledReturnBitfield10 = new OrderCancelledReturnBitfield10Field();

    /**
     * BitSet OrderCancelled byte 11.
     */
    private final OrderCancelledReturnBitfield11Field orderCancelledReturnBitfield11 = new OrderCancelledReturnBitfield11Field();

    /**
     * BitSet OrderCancelled byte 12.
     */
    private final OrderCancelledReturnBitfield12Field orderCancelledReturnBitfield12 = new OrderCancelledReturnBitfield12Field();

    /**
     * BitSet OrderCancelled byte 13.
     */
    private final OrderCancelledReturnBitfield13Field orderCancelledReturnBitfield13 = new OrderCancelledReturnBitfield13Field();

    /**
     * BitSet OrderCancelled byte 14.
     */
    private final OrderCancelledReturnBitfield14Field orderCancelledReturnBitfield14 = new OrderCancelledReturnBitfield14Field();

    /**
     * BitSet OrderCancelled byte 15.
     */
    private final OrderCancelledReturnBitfield15Field orderCancelledReturnBitfield15 = new OrderCancelledReturnBitfield15Field();

    /**
     * BitSet OrderCancelled byte 16.
     */
    private final OrderCancelledReturnBitfield16Field orderCancelledReturnBitfield16 = new OrderCancelledReturnBitfield16Field();

    /**
     * BitSet OrderCancelled byte 17.
     */
    private final OrderCancelledReturnBitfield17Field orderCancelledReturnBitfield17 = new OrderCancelledReturnBitfield17Field();

    /**
     * BitSet OrderCancelled byte 18.
     */
    private final OrderCancelledReturnBitfield18Field orderCancelledReturnBitfield18 = new OrderCancelledReturnBitfield18Field();

    /**
     * BitSet OrderCancelled byte 19.
     */
    private final OrderCancelledReturnBitfield19Field orderCancelledReturnBitfield19 = new OrderCancelledReturnBitfield19Field();

    /**
     * BitSet OrderCancelled byte 20.
     */
    private final OrderCancelledReturnBitfield20Field orderCancelledReturnBitfield20 = new OrderCancelledReturnBitfield20Field();

    /**
     * BitSet OrderCancelled byte 21.
     */
    private final OrderCancelledReturnBitfield21Field orderCancelledReturnBitfield21 = new OrderCancelledReturnBitfield21Field();

    /**
     * BitSet OrderCancelled byte 22.
     */
    private final OrderCancelledReturnBitfield22Field orderCancelledReturnBitfield22 = new OrderCancelledReturnBitfield22Field();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, cancelReason, numberOfReturnBitfields, orderCancelledReturnBitfield1, orderCancelledReturnBitfield2, orderCancelledReturnBitfield3, orderCancelledReturnBitfield4, orderCancelledReturnBitfield5, orderCancelledReturnBitfield6, orderCancelledReturnBitfield7, orderCancelledReturnBitfield8, orderCancelledReturnBitfield9, orderCancelledReturnBitfield10, orderCancelledReturnBitfield11, orderCancelledReturnBitfield12, orderCancelledReturnBitfield13, orderCancelledReturnBitfield14, orderCancelledReturnBitfield15, orderCancelledReturnBitfield16, orderCancelledReturnBitfield17, orderCancelledReturnBitfield18, orderCancelledReturnBitfield19, orderCancelledReturnBitfield20, orderCancelledReturnBitfield21, orderCancelledReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, attributedQuote, extExecInst, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, crossTradeFlag);

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
     * Reason for the order cancellation. See Reason Codes for a list of possible reasons.
     *
     * @return the CancelReason field
     */
    public CancelReasonField cancelReason() {
        return cancelReason;
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
     * BitSet OrderCancelled byte 1.
     *
     * @return the OrderCancelledReturnBitfield1 field
     */
    public OrderCancelledReturnBitfield1Field orderCancelledReturnBitfield1() {
        return orderCancelledReturnBitfield1;
    }

    /**
     * BitSet OrderCancelled byte 2.
     *
     * @return the OrderCancelledReturnBitfield2 field
     */
    public OrderCancelledReturnBitfield2Field orderCancelledReturnBitfield2() {
        return orderCancelledReturnBitfield2;
    }

    /**
     * BitSet OrderCancelled byte 3.
     *
     * @return the OrderCancelledReturnBitfield3 field
     */
    public OrderCancelledReturnBitfield3Field orderCancelledReturnBitfield3() {
        return orderCancelledReturnBitfield3;
    }

    /**
     * BitSet OrderCancelled byte 4.
     *
     * @return the OrderCancelledReturnBitfield4 field
     */
    public OrderCancelledReturnBitfield4Field orderCancelledReturnBitfield4() {
        return orderCancelledReturnBitfield4;
    }

    /**
     * BitSet OrderCancelled byte 5.
     *
     * @return the OrderCancelledReturnBitfield5 field
     */
    public OrderCancelledReturnBitfield5Field orderCancelledReturnBitfield5() {
        return orderCancelledReturnBitfield5;
    }

    /**
     * BitSet OrderCancelled byte 6.
     *
     * @return the OrderCancelledReturnBitfield6 field
     */
    public OrderCancelledReturnBitfield6Field orderCancelledReturnBitfield6() {
        return orderCancelledReturnBitfield6;
    }

    /**
     * BitSet OrderCancelled byte 7.
     *
     * @return the OrderCancelledReturnBitfield7 field
     */
    public OrderCancelledReturnBitfield7Field orderCancelledReturnBitfield7() {
        return orderCancelledReturnBitfield7;
    }

    /**
     * BitSet OrderCancelled byte 8.
     *
     * @return the OrderCancelledReturnBitfield8 field
     */
    public OrderCancelledReturnBitfield8Field orderCancelledReturnBitfield8() {
        return orderCancelledReturnBitfield8;
    }

    /**
     * BitSet OrderCancelled byte 9.
     *
     * @return the OrderCancelledReturnBitfield9 field
     */
    public OrderCancelledReturnBitfield9Field orderCancelledReturnBitfield9() {
        return orderCancelledReturnBitfield9;
    }

    /**
     * BitSet OrderCancelled byte 10.
     *
     * @return the OrderCancelledReturnBitfield10 field
     */
    public OrderCancelledReturnBitfield10Field orderCancelledReturnBitfield10() {
        return orderCancelledReturnBitfield10;
    }

    /**
     * BitSet OrderCancelled byte 11.
     *
     * @return the OrderCancelledReturnBitfield11 field
     */
    public OrderCancelledReturnBitfield11Field orderCancelledReturnBitfield11() {
        return orderCancelledReturnBitfield11;
    }

    /**
     * BitSet OrderCancelled byte 12.
     *
     * @return the OrderCancelledReturnBitfield12 field
     */
    public OrderCancelledReturnBitfield12Field orderCancelledReturnBitfield12() {
        return orderCancelledReturnBitfield12;
    }

    /**
     * BitSet OrderCancelled byte 13.
     *
     * @return the OrderCancelledReturnBitfield13 field
     */
    public OrderCancelledReturnBitfield13Field orderCancelledReturnBitfield13() {
        return orderCancelledReturnBitfield13;
    }

    /**
     * BitSet OrderCancelled byte 14.
     *
     * @return the OrderCancelledReturnBitfield14 field
     */
    public OrderCancelledReturnBitfield14Field orderCancelledReturnBitfield14() {
        return orderCancelledReturnBitfield14;
    }

    /**
     * BitSet OrderCancelled byte 15.
     *
     * @return the OrderCancelledReturnBitfield15 field
     */
    public OrderCancelledReturnBitfield15Field orderCancelledReturnBitfield15() {
        return orderCancelledReturnBitfield15;
    }

    /**
     * BitSet OrderCancelled byte 16.
     *
     * @return the OrderCancelledReturnBitfield16 field
     */
    public OrderCancelledReturnBitfield16Field orderCancelledReturnBitfield16() {
        return orderCancelledReturnBitfield16;
    }

    /**
     * BitSet OrderCancelled byte 17.
     *
     * @return the OrderCancelledReturnBitfield17 field
     */
    public OrderCancelledReturnBitfield17Field orderCancelledReturnBitfield17() {
        return orderCancelledReturnBitfield17;
    }

    /**
     * BitSet OrderCancelled byte 18.
     *
     * @return the OrderCancelledReturnBitfield18 field
     */
    public OrderCancelledReturnBitfield18Field orderCancelledReturnBitfield18() {
        return orderCancelledReturnBitfield18;
    }

    /**
     * BitSet OrderCancelled byte 19.
     *
     * @return the OrderCancelledReturnBitfield19 field
     */
    public OrderCancelledReturnBitfield19Field orderCancelledReturnBitfield19() {
        return orderCancelledReturnBitfield19;
    }

    /**
     * BitSet OrderCancelled byte 20.
     *
     * @return the OrderCancelledReturnBitfield20 field
     */
    public OrderCancelledReturnBitfield20Field orderCancelledReturnBitfield20() {
        return orderCancelledReturnBitfield20;
    }

    /**
     * BitSet OrderCancelled byte 21.
     *
     * @return the OrderCancelledReturnBitfield21 field
     */
    public OrderCancelledReturnBitfield21Field orderCancelledReturnBitfield21() {
        return orderCancelledReturnBitfield21;
    }

    /**
     * BitSet OrderCancelled byte 22.
     *
     * @return the OrderCancelledReturnBitfield22 field
     */
    public OrderCancelledReturnBitfield22Field orderCancelledReturnBitfield22() {
        return orderCancelledReturnBitfield22;
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
     * Returns whether the fields before the OrderCancelledReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield1 is on the wire
     */
    public boolean orderCancelledReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield2 is on the wire
     */
    public boolean orderCancelledReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield3 is on the wire
     */
    public boolean orderCancelledReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield4 is on the wire
     */
    public boolean orderCancelledReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield5 is on the wire
     */
    public boolean orderCancelledReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield6 is on the wire
     */
    public boolean orderCancelledReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield7 is on the wire
     */
    public boolean orderCancelledReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield8 is on the wire
     */
    public boolean orderCancelledReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield9 is on the wire
     */
    public boolean orderCancelledReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield10 is on the wire
     */
    public boolean orderCancelledReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield11 is on the wire
     */
    public boolean orderCancelledReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield12 is on the wire
     */
    public boolean orderCancelledReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield13 is on the wire
     */
    public boolean orderCancelledReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield14 is on the wire
     */
    public boolean orderCancelledReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield15 is on the wire
     */
    public boolean orderCancelledReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield16 is on the wire
     */
    public boolean orderCancelledReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield17 is on the wire
     */
    public boolean orderCancelledReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield18 is on the wire
     */
    public boolean orderCancelledReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield19 is on the wire
     */
    public boolean orderCancelledReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield20 is on the wire
     */
    public boolean orderCancelledReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield21 is on the wire
     */
    public boolean orderCancelledReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderCancelledReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderCancelledReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCancelledReturnBitfield22 is on the wire
     */
    public boolean orderCancelledReturnBitfield22Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderCancelledReturnBitfield1Present() && orderCancelledReturnBitfield1.orderCancelledReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderCancelledReturnBitfield2Present() && orderCancelledReturnBitfield2.orderCancelledReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderCancelledReturnBitfield2Present() && orderCancelledReturnBitfield2.orderCancelledReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderCancelledReturnBitfield2Present() && orderCancelledReturnBitfield2.orderCancelledReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderCancelledReturnBitfield3Present() && orderCancelledReturnBitfield3.orderCancelledReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderCancelledReturnBitfield5Present() && orderCancelledReturnBitfield5.orderCancelledReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderCancelledReturnBitfield6Present() && orderCancelledReturnBitfield6.orderCancelledReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderCancelledReturnBitfield6Present() && orderCancelledReturnBitfield6.orderCancelledReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderCancelledReturnBitfield6Present() && orderCancelledReturnBitfield6.orderCancelledReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderCancelledReturnBitfield8Present() && orderCancelledReturnBitfield8.orderCancelledReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the CrossTradeFlag put it on the wire.
     *
     * <p>Decode reads the CrossTradeFlag where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossTradeFlag is on the wire
     */
    public boolean crossTradeFlagPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderCancelledReturnBitfield18Present() && orderCancelledReturnBitfield18.orderCancelledReturnBitfield18CrossTradeFlag());
    }

    private boolean onWire(Field field) {
        return (field != orderCancelledReturnBitfield1 || orderCancelledReturnBitfield1Present()) && (field != orderCancelledReturnBitfield2 || orderCancelledReturnBitfield2Present()) && (field != orderCancelledReturnBitfield3 || orderCancelledReturnBitfield3Present()) && (field != orderCancelledReturnBitfield4 || orderCancelledReturnBitfield4Present()) && (field != orderCancelledReturnBitfield5 || orderCancelledReturnBitfield5Present()) && (field != orderCancelledReturnBitfield6 || orderCancelledReturnBitfield6Present()) && (field != orderCancelledReturnBitfield7 || orderCancelledReturnBitfield7Present()) && (field != orderCancelledReturnBitfield8 || orderCancelledReturnBitfield8Present()) && (field != orderCancelledReturnBitfield9 || orderCancelledReturnBitfield9Present()) && (field != orderCancelledReturnBitfield10 || orderCancelledReturnBitfield10Present()) && (field != orderCancelledReturnBitfield11 || orderCancelledReturnBitfield11Present()) && (field != orderCancelledReturnBitfield12 || orderCancelledReturnBitfield12Present()) && (field != orderCancelledReturnBitfield13 || orderCancelledReturnBitfield13Present()) && (field != orderCancelledReturnBitfield14 || orderCancelledReturnBitfield14Present()) && (field != orderCancelledReturnBitfield15 || orderCancelledReturnBitfield15Present()) && (field != orderCancelledReturnBitfield16 || orderCancelledReturnBitfield16Present()) && (field != orderCancelledReturnBitfield17 || orderCancelledReturnBitfield17Present()) && (field != orderCancelledReturnBitfield18 || orderCancelledReturnBitfield18Present()) && (field != orderCancelledReturnBitfield19 || orderCancelledReturnBitfield19Present()) && (field != orderCancelledReturnBitfield20 || orderCancelledReturnBitfield20Present()) && (field != orderCancelledReturnBitfield21 || orderCancelledReturnBitfield21Present()) && (field != orderCancelledReturnBitfield22 || orderCancelledReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != crossTradeFlag || crossTradeFlagPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderCancelledReturnBitfield1Present() ? OrderCancelledReturnBitfield1Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield2Present() ? OrderCancelledReturnBitfield2Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield3Present() ? OrderCancelledReturnBitfield3Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield4Present() ? OrderCancelledReturnBitfield4Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield5Present() ? OrderCancelledReturnBitfield5Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield6Present() ? OrderCancelledReturnBitfield6Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield7Present() ? OrderCancelledReturnBitfield7Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield8Present() ? OrderCancelledReturnBitfield8Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield9Present() ? OrderCancelledReturnBitfield9Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield10Present() ? OrderCancelledReturnBitfield10Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield11Present() ? OrderCancelledReturnBitfield11Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield12Present() ? OrderCancelledReturnBitfield12Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield13Present() ? OrderCancelledReturnBitfield13Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield14Present() ? OrderCancelledReturnBitfield14Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield15Present() ? OrderCancelledReturnBitfield15Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield16Present() ? OrderCancelledReturnBitfield16Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield17Present() ? OrderCancelledReturnBitfield17Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield18Present() ? OrderCancelledReturnBitfield18Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield19Present() ? OrderCancelledReturnBitfield19Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield20Present() ? OrderCancelledReturnBitfield20Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield21Present() ? OrderCancelledReturnBitfield21Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield22Present() ? OrderCancelledReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (crossTradeFlagPresent() ? CrossTradeFlagField.BYTE_LENGTH : 0);
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
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderCancelledReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderCancelledReturnBitfield22Present()) {
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
        if (!cancelReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelReasonField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderCancelledReturnBitfield1Present()) {
            if (end - cursor < OrderCancelledReturnBitfield1Field.BYTE_LENGTH || !orderCancelledReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield2Present()) {
            if (end - cursor < OrderCancelledReturnBitfield2Field.BYTE_LENGTH || !orderCancelledReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield3Present()) {
            if (end - cursor < OrderCancelledReturnBitfield3Field.BYTE_LENGTH || !orderCancelledReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield4Present()) {
            if (end - cursor < OrderCancelledReturnBitfield4Field.BYTE_LENGTH || !orderCancelledReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield5Present()) {
            if (end - cursor < OrderCancelledReturnBitfield5Field.BYTE_LENGTH || !orderCancelledReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield6Present()) {
            if (end - cursor < OrderCancelledReturnBitfield6Field.BYTE_LENGTH || !orderCancelledReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield7Present()) {
            if (end - cursor < OrderCancelledReturnBitfield7Field.BYTE_LENGTH || !orderCancelledReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield8Present()) {
            if (end - cursor < OrderCancelledReturnBitfield8Field.BYTE_LENGTH || !orderCancelledReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield9Present()) {
            if (end - cursor < OrderCancelledReturnBitfield9Field.BYTE_LENGTH || !orderCancelledReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield10Present()) {
            if (end - cursor < OrderCancelledReturnBitfield10Field.BYTE_LENGTH || !orderCancelledReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield11Present()) {
            if (end - cursor < OrderCancelledReturnBitfield11Field.BYTE_LENGTH || !orderCancelledReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield12Present()) {
            if (end - cursor < OrderCancelledReturnBitfield12Field.BYTE_LENGTH || !orderCancelledReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield13Present()) {
            if (end - cursor < OrderCancelledReturnBitfield13Field.BYTE_LENGTH || !orderCancelledReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield14Present()) {
            if (end - cursor < OrderCancelledReturnBitfield14Field.BYTE_LENGTH || !orderCancelledReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield15Present()) {
            if (end - cursor < OrderCancelledReturnBitfield15Field.BYTE_LENGTH || !orderCancelledReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield16Present()) {
            if (end - cursor < OrderCancelledReturnBitfield16Field.BYTE_LENGTH || !orderCancelledReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield17Present()) {
            if (end - cursor < OrderCancelledReturnBitfield17Field.BYTE_LENGTH || !orderCancelledReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield18Present()) {
            if (end - cursor < OrderCancelledReturnBitfield18Field.BYTE_LENGTH || !orderCancelledReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield19Present()) {
            if (end - cursor < OrderCancelledReturnBitfield19Field.BYTE_LENGTH || !orderCancelledReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield20Present()) {
            if (end - cursor < OrderCancelledReturnBitfield20Field.BYTE_LENGTH || !orderCancelledReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield21Present()) {
            if (end - cursor < OrderCancelledReturnBitfield21Field.BYTE_LENGTH || !orderCancelledReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCancelledReturnBitfield22Present()) {
            if (end - cursor < OrderCancelledReturnBitfield22Field.BYTE_LENGTH || !orderCancelledReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCancelledReturnBitfield22Field.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderCancelledReturnBitfield1Present() != orderCancelledReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield1.hasValue() ? "orderCancelledReturnBitfield1 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield2Present() != orderCancelledReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield2.hasValue() ? "orderCancelledReturnBitfield2 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield3Present() != orderCancelledReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield3.hasValue() ? "orderCancelledReturnBitfield3 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield4Present() != orderCancelledReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield4.hasValue() ? "orderCancelledReturnBitfield4 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield5Present() != orderCancelledReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield5.hasValue() ? "orderCancelledReturnBitfield5 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield6Present() != orderCancelledReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield6.hasValue() ? "orderCancelledReturnBitfield6 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield7Present() != orderCancelledReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield7.hasValue() ? "orderCancelledReturnBitfield7 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield8Present() != orderCancelledReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield8.hasValue() ? "orderCancelledReturnBitfield8 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield9Present() != orderCancelledReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield9.hasValue() ? "orderCancelledReturnBitfield9 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield10Present() != orderCancelledReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield10.hasValue() ? "orderCancelledReturnBitfield10 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield11Present() != orderCancelledReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield11.hasValue() ? "orderCancelledReturnBitfield11 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield12Present() != orderCancelledReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield12.hasValue() ? "orderCancelledReturnBitfield12 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield13Present() != orderCancelledReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield13.hasValue() ? "orderCancelledReturnBitfield13 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield14Present() != orderCancelledReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield14.hasValue() ? "orderCancelledReturnBitfield14 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield15Present() != orderCancelledReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield15.hasValue() ? "orderCancelledReturnBitfield15 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield16Present() != orderCancelledReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield16.hasValue() ? "orderCancelledReturnBitfield16 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield17Present() != orderCancelledReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield17.hasValue() ? "orderCancelledReturnBitfield17 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield18Present() != orderCancelledReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield18.hasValue() ? "orderCancelledReturnBitfield18 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield19Present() != orderCancelledReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield19.hasValue() ? "orderCancelledReturnBitfield19 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield20Present() != orderCancelledReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield20.hasValue() ? "orderCancelledReturnBitfield20 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield21Present() != orderCancelledReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield21.hasValue() ? "orderCancelledReturnBitfield21 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderCancelledReturnBitfield22Present() != orderCancelledReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderCancelledReturnBitfield22.hasValue() ? "orderCancelledReturnBitfield22 holds a value the fields before it leave off the wire" : "orderCancelledReturnBitfield22 holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = cancelReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 29, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderCancelledReturnBitfield1Present()) {
            cursor = orderCancelledReturnBitfield1.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield2Present()) {
            cursor = orderCancelledReturnBitfield2.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield3Present()) {
            cursor = orderCancelledReturnBitfield3.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield4Present()) {
            cursor = orderCancelledReturnBitfield4.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield5Present()) {
            cursor = orderCancelledReturnBitfield5.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield6Present()) {
            cursor = orderCancelledReturnBitfield6.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield7Present()) {
            cursor = orderCancelledReturnBitfield7.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield8Present()) {
            cursor = orderCancelledReturnBitfield8.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield9Present()) {
            cursor = orderCancelledReturnBitfield9.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield10Present()) {
            cursor = orderCancelledReturnBitfield10.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield11Present()) {
            cursor = orderCancelledReturnBitfield11.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield12Present()) {
            cursor = orderCancelledReturnBitfield12.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield13Present()) {
            cursor = orderCancelledReturnBitfield13.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield14Present()) {
            cursor = orderCancelledReturnBitfield14.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield15Present()) {
            cursor = orderCancelledReturnBitfield15.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield16Present()) {
            cursor = orderCancelledReturnBitfield16.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield17Present()) {
            cursor = orderCancelledReturnBitfield17.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield18Present()) {
            cursor = orderCancelledReturnBitfield18.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield19Present()) {
            cursor = orderCancelledReturnBitfield19.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield20Present()) {
            cursor = orderCancelledReturnBitfield20.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield21Present()) {
            cursor = orderCancelledReturnBitfield21.encode(data, cursor);
        }
        if (orderCancelledReturnBitfield22Present()) {
            cursor = orderCancelledReturnBitfield22.encode(data, cursor);
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
            case "CancelReason" -> Optional.of(cancelReason);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderCancelledReturnBitfield1" -> Optional.of(orderCancelledReturnBitfield1);
            case "OrderCancelledReturnBitfield2" -> Optional.of(orderCancelledReturnBitfield2);
            case "OrderCancelledReturnBitfield3" -> Optional.of(orderCancelledReturnBitfield3);
            case "OrderCancelledReturnBitfield4" -> Optional.of(orderCancelledReturnBitfield4);
            case "OrderCancelledReturnBitfield5" -> Optional.of(orderCancelledReturnBitfield5);
            case "OrderCancelledReturnBitfield6" -> Optional.of(orderCancelledReturnBitfield6);
            case "OrderCancelledReturnBitfield7" -> Optional.of(orderCancelledReturnBitfield7);
            case "OrderCancelledReturnBitfield8" -> Optional.of(orderCancelledReturnBitfield8);
            case "OrderCancelledReturnBitfield9" -> Optional.of(orderCancelledReturnBitfield9);
            case "OrderCancelledReturnBitfield10" -> Optional.of(orderCancelledReturnBitfield10);
            case "OrderCancelledReturnBitfield11" -> Optional.of(orderCancelledReturnBitfield11);
            case "OrderCancelledReturnBitfield12" -> Optional.of(orderCancelledReturnBitfield12);
            case "OrderCancelledReturnBitfield13" -> Optional.of(orderCancelledReturnBitfield13);
            case "OrderCancelledReturnBitfield14" -> Optional.of(orderCancelledReturnBitfield14);
            case "OrderCancelledReturnBitfield15" -> Optional.of(orderCancelledReturnBitfield15);
            case "OrderCancelledReturnBitfield16" -> Optional.of(orderCancelledReturnBitfield16);
            case "OrderCancelledReturnBitfield17" -> Optional.of(orderCancelledReturnBitfield17);
            case "OrderCancelledReturnBitfield18" -> Optional.of(orderCancelledReturnBitfield18);
            case "OrderCancelledReturnBitfield19" -> Optional.of(orderCancelledReturnBitfield19);
            case "OrderCancelledReturnBitfield20" -> Optional.of(orderCancelledReturnBitfield20);
            case "OrderCancelledReturnBitfield21" -> Optional.of(orderCancelledReturnBitfield21);
            case "OrderCancelledReturnBitfield22" -> Optional.of(orderCancelledReturnBitfield22);
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
            case "EchoText" -> Optional.of(echoText);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "RouteDeliveryMethod" -> Optional.of(routeDeliveryMethod);
            case "ExDestination" -> Optional.of(exDestination);
            case "CrossTradeFlag" -> Optional.of(crossTradeFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelledMessage message)) {
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
        if (!(other instanceof OrderCancelledMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
