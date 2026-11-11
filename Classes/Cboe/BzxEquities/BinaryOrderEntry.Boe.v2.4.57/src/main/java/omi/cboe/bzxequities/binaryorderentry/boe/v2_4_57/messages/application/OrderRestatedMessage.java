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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CmcMatchQtyField;
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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderRestatedReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrigClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PegDifferenceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PreventMatchField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RestatementReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutStrategyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RouteDeliveryMethodField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutingInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SecondaryOrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StepUpAmountField;
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
 * Represents the OrderRestatedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Restated Message.</p>
 */
public final class OrderRestatedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Restated Message";

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
     * The reason for this Order Restated message. C=Cboe Market Close (CMC) L=Reload P=Peg or Price Sliding Reprice Q=Liquidity Updated R=Reroute S=Reduction of OrderQty due to SWP W=Wash or MTP Decrement Cboe reserves the right to add new values as necessary without prior notice.
     */
    private final RestatementReasonField restatementReason = new RestatementReasonField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderRestated byte 1.
     */
    private final OrderRestatedReturnBitfield1Field orderRestatedReturnBitfield1 = new OrderRestatedReturnBitfield1Field();

    /**
     * BitSet OrderRestated byte 2.
     */
    private final OrderRestatedReturnBitfield2Field orderRestatedReturnBitfield2 = new OrderRestatedReturnBitfield2Field();

    /**
     * BitSet OrderRestated byte 3.
     */
    private final OrderRestatedReturnBitfield3Field orderRestatedReturnBitfield3 = new OrderRestatedReturnBitfield3Field();

    /**
     * BitSet OrderRestated byte 4.
     */
    private final OrderRestatedReturnBitfield4Field orderRestatedReturnBitfield4 = new OrderRestatedReturnBitfield4Field();

    /**
     * BitSet OrderRestated byte 5.
     */
    private final OrderRestatedReturnBitfield5Field orderRestatedReturnBitfield5 = new OrderRestatedReturnBitfield5Field();

    /**
     * BitSet OrderRestated byte 6.
     */
    private final OrderRestatedReturnBitfield6Field orderRestatedReturnBitfield6 = new OrderRestatedReturnBitfield6Field();

    /**
     * BitSet OrderRestated byte 7.
     */
    private final OrderRestatedReturnBitfield7Field orderRestatedReturnBitfield7 = new OrderRestatedReturnBitfield7Field();

    /**
     * BitSet OrderRestated byte 8.
     */
    private final OrderRestatedReturnBitfield8Field orderRestatedReturnBitfield8 = new OrderRestatedReturnBitfield8Field();

    /**
     * BitSet OrderRestated byte 9.
     */
    private final OrderRestatedReturnBitfield9Field orderRestatedReturnBitfield9 = new OrderRestatedReturnBitfield9Field();

    /**
     * BitSet OrderRestated byte 10.
     */
    private final OrderRestatedReturnBitfield10Field orderRestatedReturnBitfield10 = new OrderRestatedReturnBitfield10Field();

    /**
     * BitSet OrderRestated byte 11.
     */
    private final OrderRestatedReturnBitfield11Field orderRestatedReturnBitfield11 = new OrderRestatedReturnBitfield11Field();

    /**
     * BitSet OrderRestated byte 12.
     */
    private final OrderRestatedReturnBitfield12Field orderRestatedReturnBitfield12 = new OrderRestatedReturnBitfield12Field();

    /**
     * BitSet OrderRestated byte 13.
     */
    private final OrderRestatedReturnBitfield13Field orderRestatedReturnBitfield13 = new OrderRestatedReturnBitfield13Field();

    /**
     * BitSet OrderRestated byte 14.
     */
    private final OrderRestatedReturnBitfield14Field orderRestatedReturnBitfield14 = new OrderRestatedReturnBitfield14Field();

    /**
     * BitSet OrderRestated byte 15.
     */
    private final OrderRestatedReturnBitfield15Field orderRestatedReturnBitfield15 = new OrderRestatedReturnBitfield15Field();

    /**
     * BitSet OrderRestated byte 16.
     */
    private final OrderRestatedReturnBitfield16Field orderRestatedReturnBitfield16 = new OrderRestatedReturnBitfield16Field();

    /**
     * BitSet OrderRestated byte 17.
     */
    private final OrderRestatedReturnBitfield17Field orderRestatedReturnBitfield17 = new OrderRestatedReturnBitfield17Field();

    /**
     * BitSet OrderRestated byte 18.
     */
    private final OrderRestatedReturnBitfield18Field orderRestatedReturnBitfield18 = new OrderRestatedReturnBitfield18Field();

    /**
     * BitSet OrderRestated byte 19.
     */
    private final OrderRestatedReturnBitfield19Field orderRestatedReturnBitfield19 = new OrderRestatedReturnBitfield19Field();

    /**
     * BitSet OrderRestated byte 20.
     */
    private final OrderRestatedReturnBitfield20Field orderRestatedReturnBitfield20 = new OrderRestatedReturnBitfield20Field();

    /**
     * BitSet OrderRestated byte 21.
     */
    private final OrderRestatedReturnBitfield21Field orderRestatedReturnBitfield21 = new OrderRestatedReturnBitfield21Field();

    /**
     * BitSet OrderRestated byte 22.
     */
    private final OrderRestatedReturnBitfield22Field orderRestatedReturnBitfield22 = new OrderRestatedReturnBitfield22Field();

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
     * Cmc Match Qty
     */
    private final CmcMatchQtyField cmcMatchQty = new CmcMatchQtyField();

    /**
     * Step Up Amount
     */
    private final StepUpAmountField stepUpAmount = new StepUpAmountField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, restatementReason, numberOfReturnBitfields, orderRestatedReturnBitfield1, orderRestatedReturnBitfield2, orderRestatedReturnBitfield3, orderRestatedReturnBitfield4, orderRestatedReturnBitfield5, orderRestatedReturnBitfield6, orderRestatedReturnBitfield7, orderRestatedReturnBitfield8, orderRestatedReturnBitfield9, orderRestatedReturnBitfield10, orderRestatedReturnBitfield11, orderRestatedReturnBitfield12, orderRestatedReturnBitfield13, orderRestatedReturnBitfield14, orderRestatedReturnBitfield15, orderRestatedReturnBitfield16, orderRestatedReturnBitfield17, orderRestatedReturnBitfield18, orderRestatedReturnBitfield19, orderRestatedReturnBitfield20, orderRestatedReturnBitfield21, orderRestatedReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, attributedQuote, extExecInst, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, cmcMatchQty, stepUpAmount);

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
     * The reason for this Order Restated message. C=Cboe Market Close (CMC) L=Reload P=Peg or Price Sliding Reprice Q=Liquidity Updated R=Reroute S=Reduction of OrderQty due to SWP W=Wash or MTP Decrement Cboe reserves the right to add new values as necessary without prior notice.
     *
     * @return the RestatementReason field
     */
    public RestatementReasonField restatementReason() {
        return restatementReason;
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
     * BitSet OrderRestated byte 1.
     *
     * @return the OrderRestatedReturnBitfield1 field
     */
    public OrderRestatedReturnBitfield1Field orderRestatedReturnBitfield1() {
        return orderRestatedReturnBitfield1;
    }

    /**
     * BitSet OrderRestated byte 2.
     *
     * @return the OrderRestatedReturnBitfield2 field
     */
    public OrderRestatedReturnBitfield2Field orderRestatedReturnBitfield2() {
        return orderRestatedReturnBitfield2;
    }

    /**
     * BitSet OrderRestated byte 3.
     *
     * @return the OrderRestatedReturnBitfield3 field
     */
    public OrderRestatedReturnBitfield3Field orderRestatedReturnBitfield3() {
        return orderRestatedReturnBitfield3;
    }

    /**
     * BitSet OrderRestated byte 4.
     *
     * @return the OrderRestatedReturnBitfield4 field
     */
    public OrderRestatedReturnBitfield4Field orderRestatedReturnBitfield4() {
        return orderRestatedReturnBitfield4;
    }

    /**
     * BitSet OrderRestated byte 5.
     *
     * @return the OrderRestatedReturnBitfield5 field
     */
    public OrderRestatedReturnBitfield5Field orderRestatedReturnBitfield5() {
        return orderRestatedReturnBitfield5;
    }

    /**
     * BitSet OrderRestated byte 6.
     *
     * @return the OrderRestatedReturnBitfield6 field
     */
    public OrderRestatedReturnBitfield6Field orderRestatedReturnBitfield6() {
        return orderRestatedReturnBitfield6;
    }

    /**
     * BitSet OrderRestated byte 7.
     *
     * @return the OrderRestatedReturnBitfield7 field
     */
    public OrderRestatedReturnBitfield7Field orderRestatedReturnBitfield7() {
        return orderRestatedReturnBitfield7;
    }

    /**
     * BitSet OrderRestated byte 8.
     *
     * @return the OrderRestatedReturnBitfield8 field
     */
    public OrderRestatedReturnBitfield8Field orderRestatedReturnBitfield8() {
        return orderRestatedReturnBitfield8;
    }

    /**
     * BitSet OrderRestated byte 9.
     *
     * @return the OrderRestatedReturnBitfield9 field
     */
    public OrderRestatedReturnBitfield9Field orderRestatedReturnBitfield9() {
        return orderRestatedReturnBitfield9;
    }

    /**
     * BitSet OrderRestated byte 10.
     *
     * @return the OrderRestatedReturnBitfield10 field
     */
    public OrderRestatedReturnBitfield10Field orderRestatedReturnBitfield10() {
        return orderRestatedReturnBitfield10;
    }

    /**
     * BitSet OrderRestated byte 11.
     *
     * @return the OrderRestatedReturnBitfield11 field
     */
    public OrderRestatedReturnBitfield11Field orderRestatedReturnBitfield11() {
        return orderRestatedReturnBitfield11;
    }

    /**
     * BitSet OrderRestated byte 12.
     *
     * @return the OrderRestatedReturnBitfield12 field
     */
    public OrderRestatedReturnBitfield12Field orderRestatedReturnBitfield12() {
        return orderRestatedReturnBitfield12;
    }

    /**
     * BitSet OrderRestated byte 13.
     *
     * @return the OrderRestatedReturnBitfield13 field
     */
    public OrderRestatedReturnBitfield13Field orderRestatedReturnBitfield13() {
        return orderRestatedReturnBitfield13;
    }

    /**
     * BitSet OrderRestated byte 14.
     *
     * @return the OrderRestatedReturnBitfield14 field
     */
    public OrderRestatedReturnBitfield14Field orderRestatedReturnBitfield14() {
        return orderRestatedReturnBitfield14;
    }

    /**
     * BitSet OrderRestated byte 15.
     *
     * @return the OrderRestatedReturnBitfield15 field
     */
    public OrderRestatedReturnBitfield15Field orderRestatedReturnBitfield15() {
        return orderRestatedReturnBitfield15;
    }

    /**
     * BitSet OrderRestated byte 16.
     *
     * @return the OrderRestatedReturnBitfield16 field
     */
    public OrderRestatedReturnBitfield16Field orderRestatedReturnBitfield16() {
        return orderRestatedReturnBitfield16;
    }

    /**
     * BitSet OrderRestated byte 17.
     *
     * @return the OrderRestatedReturnBitfield17 field
     */
    public OrderRestatedReturnBitfield17Field orderRestatedReturnBitfield17() {
        return orderRestatedReturnBitfield17;
    }

    /**
     * BitSet OrderRestated byte 18.
     *
     * @return the OrderRestatedReturnBitfield18 field
     */
    public OrderRestatedReturnBitfield18Field orderRestatedReturnBitfield18() {
        return orderRestatedReturnBitfield18;
    }

    /**
     * BitSet OrderRestated byte 19.
     *
     * @return the OrderRestatedReturnBitfield19 field
     */
    public OrderRestatedReturnBitfield19Field orderRestatedReturnBitfield19() {
        return orderRestatedReturnBitfield19;
    }

    /**
     * BitSet OrderRestated byte 20.
     *
     * @return the OrderRestatedReturnBitfield20 field
     */
    public OrderRestatedReturnBitfield20Field orderRestatedReturnBitfield20() {
        return orderRestatedReturnBitfield20;
    }

    /**
     * BitSet OrderRestated byte 21.
     *
     * @return the OrderRestatedReturnBitfield21 field
     */
    public OrderRestatedReturnBitfield21Field orderRestatedReturnBitfield21() {
        return orderRestatedReturnBitfield21;
    }

    /**
     * BitSet OrderRestated byte 22.
     *
     * @return the OrderRestatedReturnBitfield22 field
     */
    public OrderRestatedReturnBitfield22Field orderRestatedReturnBitfield22() {
        return orderRestatedReturnBitfield22;
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
     * Cmc Match Qty
     *
     * @return the CmcMatchQty field
     */
    public CmcMatchQtyField cmcMatchQty() {
        return cmcMatchQty;
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
     * Returns whether the fields before the OrderRestatedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield1 is on the wire
     */
    public boolean orderRestatedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield2 is on the wire
     */
    public boolean orderRestatedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield3 is on the wire
     */
    public boolean orderRestatedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield4 is on the wire
     */
    public boolean orderRestatedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield5 is on the wire
     */
    public boolean orderRestatedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield6 is on the wire
     */
    public boolean orderRestatedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield7 is on the wire
     */
    public boolean orderRestatedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield8 is on the wire
     */
    public boolean orderRestatedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield9 is on the wire
     */
    public boolean orderRestatedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield10 is on the wire
     */
    public boolean orderRestatedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield11 is on the wire
     */
    public boolean orderRestatedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield12 is on the wire
     */
    public boolean orderRestatedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield13 is on the wire
     */
    public boolean orderRestatedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield14 is on the wire
     */
    public boolean orderRestatedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield15 is on the wire
     */
    public boolean orderRestatedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield16 is on the wire
     */
    public boolean orderRestatedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield17 is on the wire
     */
    public boolean orderRestatedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield18 is on the wire
     */
    public boolean orderRestatedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield19 is on the wire
     */
    public boolean orderRestatedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield20 is on the wire
     */
    public boolean orderRestatedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield21 is on the wire
     */
    public boolean orderRestatedReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderRestatedReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderRestatedReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRestatedReturnBitfield22 is on the wire
     */
    public boolean orderRestatedReturnBitfield22Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRestatedReturnBitfield1Present() && orderRestatedReturnBitfield1.orderRestatedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRestatedReturnBitfield2Present() && orderRestatedReturnBitfield2.orderRestatedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRestatedReturnBitfield2Present() && orderRestatedReturnBitfield2.orderRestatedReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRestatedReturnBitfield2Present() && orderRestatedReturnBitfield2.orderRestatedReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRestatedReturnBitfield3Present() && orderRestatedReturnBitfield3.orderRestatedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderRestatedReturnBitfield5Present() && orderRestatedReturnBitfield5.orderRestatedReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRestatedReturnBitfield6Present() && orderRestatedReturnBitfield6.orderRestatedReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRestatedReturnBitfield8Present() && orderRestatedReturnBitfield8.orderRestatedReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the CmcMatchQty put it on the wire.
     *
     * <p>Decode reads the CmcMatchQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmcMatchQty is on the wire
     */
    public boolean cmcMatchQtyPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderRestatedReturnBitfield19Present() && orderRestatedReturnBitfield19.orderRestatedReturnBitfield19CmcMatchQty());
    }

    /**
     * Returns whether the fields before the StepUpAmount put it on the wire.
     *
     * <p>Decode reads the StepUpAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StepUpAmount is on the wire
     */
    public boolean stepUpAmountPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (orderRestatedReturnBitfield19Present() && orderRestatedReturnBitfield19.orderRestatedReturnBitfield19StepUpAmount());
    }

    private boolean onWire(Field field) {
        return (field != orderRestatedReturnBitfield1 || orderRestatedReturnBitfield1Present()) && (field != orderRestatedReturnBitfield2 || orderRestatedReturnBitfield2Present()) && (field != orderRestatedReturnBitfield3 || orderRestatedReturnBitfield3Present()) && (field != orderRestatedReturnBitfield4 || orderRestatedReturnBitfield4Present()) && (field != orderRestatedReturnBitfield5 || orderRestatedReturnBitfield5Present()) && (field != orderRestatedReturnBitfield6 || orderRestatedReturnBitfield6Present()) && (field != orderRestatedReturnBitfield7 || orderRestatedReturnBitfield7Present()) && (field != orderRestatedReturnBitfield8 || orderRestatedReturnBitfield8Present()) && (field != orderRestatedReturnBitfield9 || orderRestatedReturnBitfield9Present()) && (field != orderRestatedReturnBitfield10 || orderRestatedReturnBitfield10Present()) && (field != orderRestatedReturnBitfield11 || orderRestatedReturnBitfield11Present()) && (field != orderRestatedReturnBitfield12 || orderRestatedReturnBitfield12Present()) && (field != orderRestatedReturnBitfield13 || orderRestatedReturnBitfield13Present()) && (field != orderRestatedReturnBitfield14 || orderRestatedReturnBitfield14Present()) && (field != orderRestatedReturnBitfield15 || orderRestatedReturnBitfield15Present()) && (field != orderRestatedReturnBitfield16 || orderRestatedReturnBitfield16Present()) && (field != orderRestatedReturnBitfield17 || orderRestatedReturnBitfield17Present()) && (field != orderRestatedReturnBitfield18 || orderRestatedReturnBitfield18Present()) && (field != orderRestatedReturnBitfield19 || orderRestatedReturnBitfield19Present()) && (field != orderRestatedReturnBitfield20 || orderRestatedReturnBitfield20Present()) && (field != orderRestatedReturnBitfield21 || orderRestatedReturnBitfield21Present()) && (field != orderRestatedReturnBitfield22 || orderRestatedReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != cmcMatchQty || cmcMatchQtyPresent()) && (field != stepUpAmount || stepUpAmountPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRestatedReturnBitfield1Present() ? OrderRestatedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield2Present() ? OrderRestatedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield3Present() ? OrderRestatedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield4Present() ? OrderRestatedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield5Present() ? OrderRestatedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield6Present() ? OrderRestatedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield7Present() ? OrderRestatedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield8Present() ? OrderRestatedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield9Present() ? OrderRestatedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield10Present() ? OrderRestatedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield11Present() ? OrderRestatedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield12Present() ? OrderRestatedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield13Present() ? OrderRestatedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield14Present() ? OrderRestatedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield15Present() ? OrderRestatedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield16Present() ? OrderRestatedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield17Present() ? OrderRestatedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield18Present() ? OrderRestatedReturnBitfield18Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield19Present() ? OrderRestatedReturnBitfield19Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield20Present() ? OrderRestatedReturnBitfield20Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield21Present() ? OrderRestatedReturnBitfield21Field.BYTE_LENGTH : 0) + (orderRestatedReturnBitfield22Present() ? OrderRestatedReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (cmcMatchQtyPresent() ? CmcMatchQtyField.BYTE_LENGTH : 0) + (stepUpAmountPresent() ? StepUpAmountField.BYTE_LENGTH : 0);
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
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderRestatedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderRestatedReturnBitfield22Present()) {
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
        if (cmcMatchQtyPresent()) {
            cursor += 4;
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
        if (!restatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += RestatementReasonField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderRestatedReturnBitfield1Present()) {
            if (end - cursor < OrderRestatedReturnBitfield1Field.BYTE_LENGTH || !orderRestatedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield2Present()) {
            if (end - cursor < OrderRestatedReturnBitfield2Field.BYTE_LENGTH || !orderRestatedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield3Present()) {
            if (end - cursor < OrderRestatedReturnBitfield3Field.BYTE_LENGTH || !orderRestatedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield4Present()) {
            if (end - cursor < OrderRestatedReturnBitfield4Field.BYTE_LENGTH || !orderRestatedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield5Present()) {
            if (end - cursor < OrderRestatedReturnBitfield5Field.BYTE_LENGTH || !orderRestatedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield6Present()) {
            if (end - cursor < OrderRestatedReturnBitfield6Field.BYTE_LENGTH || !orderRestatedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield7Present()) {
            if (end - cursor < OrderRestatedReturnBitfield7Field.BYTE_LENGTH || !orderRestatedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield8Present()) {
            if (end - cursor < OrderRestatedReturnBitfield8Field.BYTE_LENGTH || !orderRestatedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield9Present()) {
            if (end - cursor < OrderRestatedReturnBitfield9Field.BYTE_LENGTH || !orderRestatedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield10Present()) {
            if (end - cursor < OrderRestatedReturnBitfield10Field.BYTE_LENGTH || !orderRestatedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield11Present()) {
            if (end - cursor < OrderRestatedReturnBitfield11Field.BYTE_LENGTH || !orderRestatedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield12Present()) {
            if (end - cursor < OrderRestatedReturnBitfield12Field.BYTE_LENGTH || !orderRestatedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield13Present()) {
            if (end - cursor < OrderRestatedReturnBitfield13Field.BYTE_LENGTH || !orderRestatedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield14Present()) {
            if (end - cursor < OrderRestatedReturnBitfield14Field.BYTE_LENGTH || !orderRestatedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield15Present()) {
            if (end - cursor < OrderRestatedReturnBitfield15Field.BYTE_LENGTH || !orderRestatedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield16Present()) {
            if (end - cursor < OrderRestatedReturnBitfield16Field.BYTE_LENGTH || !orderRestatedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield17Present()) {
            if (end - cursor < OrderRestatedReturnBitfield17Field.BYTE_LENGTH || !orderRestatedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield18Present()) {
            if (end - cursor < OrderRestatedReturnBitfield18Field.BYTE_LENGTH || !orderRestatedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield19Present()) {
            if (end - cursor < OrderRestatedReturnBitfield19Field.BYTE_LENGTH || !orderRestatedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield20Present()) {
            if (end - cursor < OrderRestatedReturnBitfield20Field.BYTE_LENGTH || !orderRestatedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield21Present()) {
            if (end - cursor < OrderRestatedReturnBitfield21Field.BYTE_LENGTH || !orderRestatedReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRestatedReturnBitfield22Present()) {
            if (end - cursor < OrderRestatedReturnBitfield22Field.BYTE_LENGTH || !orderRestatedReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRestatedReturnBitfield22Field.BYTE_LENGTH;
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
        if (cmcMatchQtyPresent()) {
            if (end - cursor < CmcMatchQtyField.BYTE_LENGTH || !cmcMatchQty.parse(data, cursor)) {
                return false;
            }
            cursor += CmcMatchQtyField.BYTE_LENGTH;
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
        if (orderRestatedReturnBitfield1Present() != orderRestatedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield1.hasValue() ? "orderRestatedReturnBitfield1 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield2Present() != orderRestatedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield2.hasValue() ? "orderRestatedReturnBitfield2 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield3Present() != orderRestatedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield3.hasValue() ? "orderRestatedReturnBitfield3 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield4Present() != orderRestatedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield4.hasValue() ? "orderRestatedReturnBitfield4 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield5Present() != orderRestatedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield5.hasValue() ? "orderRestatedReturnBitfield5 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield6Present() != orderRestatedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield6.hasValue() ? "orderRestatedReturnBitfield6 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield7Present() != orderRestatedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield7.hasValue() ? "orderRestatedReturnBitfield7 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield8Present() != orderRestatedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield8.hasValue() ? "orderRestatedReturnBitfield8 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield9Present() != orderRestatedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield9.hasValue() ? "orderRestatedReturnBitfield9 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield10Present() != orderRestatedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield10.hasValue() ? "orderRestatedReturnBitfield10 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield11Present() != orderRestatedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield11.hasValue() ? "orderRestatedReturnBitfield11 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield12Present() != orderRestatedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield12.hasValue() ? "orderRestatedReturnBitfield12 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield13Present() != orderRestatedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield13.hasValue() ? "orderRestatedReturnBitfield13 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield14Present() != orderRestatedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield14.hasValue() ? "orderRestatedReturnBitfield14 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield15Present() != orderRestatedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield15.hasValue() ? "orderRestatedReturnBitfield15 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield16Present() != orderRestatedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield16.hasValue() ? "orderRestatedReturnBitfield16 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield17Present() != orderRestatedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield17.hasValue() ? "orderRestatedReturnBitfield17 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield18Present() != orderRestatedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield18.hasValue() ? "orderRestatedReturnBitfield18 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield19Present() != orderRestatedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield19.hasValue() ? "orderRestatedReturnBitfield19 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield20Present() != orderRestatedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield20.hasValue() ? "orderRestatedReturnBitfield20 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield21Present() != orderRestatedReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield21.hasValue() ? "orderRestatedReturnBitfield21 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderRestatedReturnBitfield22Present() != orderRestatedReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderRestatedReturnBitfield22.hasValue() ? "orderRestatedReturnBitfield22 holds a value the fields before it leave off the wire" : "orderRestatedReturnBitfield22 holds no value, though the fields before it put it on the wire");
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
        if (cmcMatchQtyPresent() != cmcMatchQty.hasValue()) {
            throw new IllegalStateException(cmcMatchQty.hasValue() ? "cmcMatchQty holds a value the fields before it leave off the wire" : "cmcMatchQty holds no value, though the fields before it put it on the wire");
        }
        if (stepUpAmountPresent() != stepUpAmount.hasValue()) {
            throw new IllegalStateException(stepUpAmount.hasValue() ? "stepUpAmount holds a value the fields before it leave off the wire" : "stepUpAmount holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = restatementReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 38) {
            System.arraycopy(buffer, 37, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderRestatedReturnBitfield1Present()) {
            cursor = orderRestatedReturnBitfield1.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield2Present()) {
            cursor = orderRestatedReturnBitfield2.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield3Present()) {
            cursor = orderRestatedReturnBitfield3.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield4Present()) {
            cursor = orderRestatedReturnBitfield4.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield5Present()) {
            cursor = orderRestatedReturnBitfield5.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield6Present()) {
            cursor = orderRestatedReturnBitfield6.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield7Present()) {
            cursor = orderRestatedReturnBitfield7.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield8Present()) {
            cursor = orderRestatedReturnBitfield8.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield9Present()) {
            cursor = orderRestatedReturnBitfield9.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield10Present()) {
            cursor = orderRestatedReturnBitfield10.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield11Present()) {
            cursor = orderRestatedReturnBitfield11.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield12Present()) {
            cursor = orderRestatedReturnBitfield12.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield13Present()) {
            cursor = orderRestatedReturnBitfield13.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield14Present()) {
            cursor = orderRestatedReturnBitfield14.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield15Present()) {
            cursor = orderRestatedReturnBitfield15.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield16Present()) {
            cursor = orderRestatedReturnBitfield16.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield17Present()) {
            cursor = orderRestatedReturnBitfield17.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield18Present()) {
            cursor = orderRestatedReturnBitfield18.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield19Present()) {
            cursor = orderRestatedReturnBitfield19.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield20Present()) {
            cursor = orderRestatedReturnBitfield20.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield21Present()) {
            cursor = orderRestatedReturnBitfield21.encode(data, cursor);
        }
        if (orderRestatedReturnBitfield22Present()) {
            cursor = orderRestatedReturnBitfield22.encode(data, cursor);
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
        if (cmcMatchQtyPresent()) {
            cursor = cmcMatchQty.encode(data, cursor);
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
            case "RestatementReason" -> Optional.of(restatementReason);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderRestatedReturnBitfield1" -> Optional.of(orderRestatedReturnBitfield1);
            case "OrderRestatedReturnBitfield2" -> Optional.of(orderRestatedReturnBitfield2);
            case "OrderRestatedReturnBitfield3" -> Optional.of(orderRestatedReturnBitfield3);
            case "OrderRestatedReturnBitfield4" -> Optional.of(orderRestatedReturnBitfield4);
            case "OrderRestatedReturnBitfield5" -> Optional.of(orderRestatedReturnBitfield5);
            case "OrderRestatedReturnBitfield6" -> Optional.of(orderRestatedReturnBitfield6);
            case "OrderRestatedReturnBitfield7" -> Optional.of(orderRestatedReturnBitfield7);
            case "OrderRestatedReturnBitfield8" -> Optional.of(orderRestatedReturnBitfield8);
            case "OrderRestatedReturnBitfield9" -> Optional.of(orderRestatedReturnBitfield9);
            case "OrderRestatedReturnBitfield10" -> Optional.of(orderRestatedReturnBitfield10);
            case "OrderRestatedReturnBitfield11" -> Optional.of(orderRestatedReturnBitfield11);
            case "OrderRestatedReturnBitfield12" -> Optional.of(orderRestatedReturnBitfield12);
            case "OrderRestatedReturnBitfield13" -> Optional.of(orderRestatedReturnBitfield13);
            case "OrderRestatedReturnBitfield14" -> Optional.of(orderRestatedReturnBitfield14);
            case "OrderRestatedReturnBitfield15" -> Optional.of(orderRestatedReturnBitfield15);
            case "OrderRestatedReturnBitfield16" -> Optional.of(orderRestatedReturnBitfield16);
            case "OrderRestatedReturnBitfield17" -> Optional.of(orderRestatedReturnBitfield17);
            case "OrderRestatedReturnBitfield18" -> Optional.of(orderRestatedReturnBitfield18);
            case "OrderRestatedReturnBitfield19" -> Optional.of(orderRestatedReturnBitfield19);
            case "OrderRestatedReturnBitfield20" -> Optional.of(orderRestatedReturnBitfield20);
            case "OrderRestatedReturnBitfield21" -> Optional.of(orderRestatedReturnBitfield21);
            case "OrderRestatedReturnBitfield22" -> Optional.of(orderRestatedReturnBitfield22);
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
            case "CmcMatchQty" -> Optional.of(cmcMatchQty);
            case "StepUpAmount" -> Optional.of(stepUpAmount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRestatedMessage message)) {
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
        if (!(other instanceof OrderRestatedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
