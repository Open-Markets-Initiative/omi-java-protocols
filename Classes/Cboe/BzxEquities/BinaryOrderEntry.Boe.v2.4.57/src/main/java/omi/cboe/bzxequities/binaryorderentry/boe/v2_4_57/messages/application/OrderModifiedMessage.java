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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LocateBrokerField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MinQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderModifiedReturnBitfield9Field;
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
 * Represents the OrderModifiedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Modified Message.</p>
 */
public final class OrderModifiedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Message";

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
     * BitSet OrderModified byte 1.
     */
    private final OrderModifiedReturnBitfield1Field orderModifiedReturnBitfield1 = new OrderModifiedReturnBitfield1Field();

    /**
     * BitSet OrderModified byte 2.
     */
    private final OrderModifiedReturnBitfield2Field orderModifiedReturnBitfield2 = new OrderModifiedReturnBitfield2Field();

    /**
     * BitSet OrderModified byte 3.
     */
    private final OrderModifiedReturnBitfield3Field orderModifiedReturnBitfield3 = new OrderModifiedReturnBitfield3Field();

    /**
     * BitSet OrderModified byte 4.
     */
    private final OrderModifiedReturnBitfield4Field orderModifiedReturnBitfield4 = new OrderModifiedReturnBitfield4Field();

    /**
     * BitSet OrderModified byte 5.
     */
    private final OrderModifiedReturnBitfield5Field orderModifiedReturnBitfield5 = new OrderModifiedReturnBitfield5Field();

    /**
     * BitSet OrderModified byte 6.
     */
    private final OrderModifiedReturnBitfield6Field orderModifiedReturnBitfield6 = new OrderModifiedReturnBitfield6Field();

    /**
     * BitSet OrderModified byte 7.
     */
    private final OrderModifiedReturnBitfield7Field orderModifiedReturnBitfield7 = new OrderModifiedReturnBitfield7Field();

    /**
     * BitSet OrderModified byte 8.
     */
    private final OrderModifiedReturnBitfield8Field orderModifiedReturnBitfield8 = new OrderModifiedReturnBitfield8Field();

    /**
     * BitSet OrderModified byte 9.
     */
    private final OrderModifiedReturnBitfield9Field orderModifiedReturnBitfield9 = new OrderModifiedReturnBitfield9Field();

    /**
     * BitSet OrderModified byte 10.
     */
    private final OrderModifiedReturnBitfield10Field orderModifiedReturnBitfield10 = new OrderModifiedReturnBitfield10Field();

    /**
     * BitSet OrderModified byte 11.
     */
    private final OrderModifiedReturnBitfield11Field orderModifiedReturnBitfield11 = new OrderModifiedReturnBitfield11Field();

    /**
     * BitSet OrderModified byte 12.
     */
    private final OrderModifiedReturnBitfield12Field orderModifiedReturnBitfield12 = new OrderModifiedReturnBitfield12Field();

    /**
     * BitSet OrderModified byte 13.
     */
    private final OrderModifiedReturnBitfield13Field orderModifiedReturnBitfield13 = new OrderModifiedReturnBitfield13Field();

    /**
     * BitSet OrderModified byte 14.
     */
    private final OrderModifiedReturnBitfield14Field orderModifiedReturnBitfield14 = new OrderModifiedReturnBitfield14Field();

    /**
     * BitSet OrderModified byte 15.
     */
    private final OrderModifiedReturnBitfield15Field orderModifiedReturnBitfield15 = new OrderModifiedReturnBitfield15Field();

    /**
     * BitSet OrderModified byte 16.
     */
    private final OrderModifiedReturnBitfield16Field orderModifiedReturnBitfield16 = new OrderModifiedReturnBitfield16Field();

    /**
     * BitSet OrderModified byte 17.
     */
    private final OrderModifiedReturnBitfield17Field orderModifiedReturnBitfield17 = new OrderModifiedReturnBitfield17Field();

    /**
     * BitSet OrderModified byte 18.
     */
    private final OrderModifiedReturnBitfield18Field orderModifiedReturnBitfield18 = new OrderModifiedReturnBitfield18Field();

    /**
     * BitSet OrderModified byte 19.
     */
    private final OrderModifiedReturnBitfield19Field orderModifiedReturnBitfield19 = new OrderModifiedReturnBitfield19Field();

    /**
     * BitSet OrderModified byte 20.
     */
    private final OrderModifiedReturnBitfield20Field orderModifiedReturnBitfield20 = new OrderModifiedReturnBitfield20Field();

    /**
     * BitSet OrderModified byte 21.
     */
    private final OrderModifiedReturnBitfield21Field orderModifiedReturnBitfield21 = new OrderModifiedReturnBitfield21Field();

    /**
     * BitSet OrderModified byte 22.
     */
    private final OrderModifiedReturnBitfield22Field orderModifiedReturnBitfield22 = new OrderModifiedReturnBitfield22Field();

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
     * Locate Broker
     */
    private final LocateBrokerField locateBroker = new LocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderModifiedReturnBitfield1, orderModifiedReturnBitfield2, orderModifiedReturnBitfield3, orderModifiedReturnBitfield4, orderModifiedReturnBitfield5, orderModifiedReturnBitfield6, orderModifiedReturnBitfield7, orderModifiedReturnBitfield8, orderModifiedReturnBitfield9, orderModifiedReturnBitfield10, orderModifiedReturnBitfield11, orderModifiedReturnBitfield12, orderModifiedReturnBitfield13, orderModifiedReturnBitfield14, orderModifiedReturnBitfield15, orderModifiedReturnBitfield16, orderModifiedReturnBitfield17, orderModifiedReturnBitfield18, orderModifiedReturnBitfield19, orderModifiedReturnBitfield20, orderModifiedReturnBitfield21, orderModifiedReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, origClOrdId, leavesQty, lastShares, lastPx, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, attributedQuote, extExecInst, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, crossTradeFlag, locateBroker);

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
     * BitSet OrderModified byte 1.
     *
     * @return the OrderModifiedReturnBitfield1 field
     */
    public OrderModifiedReturnBitfield1Field orderModifiedReturnBitfield1() {
        return orderModifiedReturnBitfield1;
    }

    /**
     * BitSet OrderModified byte 2.
     *
     * @return the OrderModifiedReturnBitfield2 field
     */
    public OrderModifiedReturnBitfield2Field orderModifiedReturnBitfield2() {
        return orderModifiedReturnBitfield2;
    }

    /**
     * BitSet OrderModified byte 3.
     *
     * @return the OrderModifiedReturnBitfield3 field
     */
    public OrderModifiedReturnBitfield3Field orderModifiedReturnBitfield3() {
        return orderModifiedReturnBitfield3;
    }

    /**
     * BitSet OrderModified byte 4.
     *
     * @return the OrderModifiedReturnBitfield4 field
     */
    public OrderModifiedReturnBitfield4Field orderModifiedReturnBitfield4() {
        return orderModifiedReturnBitfield4;
    }

    /**
     * BitSet OrderModified byte 5.
     *
     * @return the OrderModifiedReturnBitfield5 field
     */
    public OrderModifiedReturnBitfield5Field orderModifiedReturnBitfield5() {
        return orderModifiedReturnBitfield5;
    }

    /**
     * BitSet OrderModified byte 6.
     *
     * @return the OrderModifiedReturnBitfield6 field
     */
    public OrderModifiedReturnBitfield6Field orderModifiedReturnBitfield6() {
        return orderModifiedReturnBitfield6;
    }

    /**
     * BitSet OrderModified byte 7.
     *
     * @return the OrderModifiedReturnBitfield7 field
     */
    public OrderModifiedReturnBitfield7Field orderModifiedReturnBitfield7() {
        return orderModifiedReturnBitfield7;
    }

    /**
     * BitSet OrderModified byte 8.
     *
     * @return the OrderModifiedReturnBitfield8 field
     */
    public OrderModifiedReturnBitfield8Field orderModifiedReturnBitfield8() {
        return orderModifiedReturnBitfield8;
    }

    /**
     * BitSet OrderModified byte 9.
     *
     * @return the OrderModifiedReturnBitfield9 field
     */
    public OrderModifiedReturnBitfield9Field orderModifiedReturnBitfield9() {
        return orderModifiedReturnBitfield9;
    }

    /**
     * BitSet OrderModified byte 10.
     *
     * @return the OrderModifiedReturnBitfield10 field
     */
    public OrderModifiedReturnBitfield10Field orderModifiedReturnBitfield10() {
        return orderModifiedReturnBitfield10;
    }

    /**
     * BitSet OrderModified byte 11.
     *
     * @return the OrderModifiedReturnBitfield11 field
     */
    public OrderModifiedReturnBitfield11Field orderModifiedReturnBitfield11() {
        return orderModifiedReturnBitfield11;
    }

    /**
     * BitSet OrderModified byte 12.
     *
     * @return the OrderModifiedReturnBitfield12 field
     */
    public OrderModifiedReturnBitfield12Field orderModifiedReturnBitfield12() {
        return orderModifiedReturnBitfield12;
    }

    /**
     * BitSet OrderModified byte 13.
     *
     * @return the OrderModifiedReturnBitfield13 field
     */
    public OrderModifiedReturnBitfield13Field orderModifiedReturnBitfield13() {
        return orderModifiedReturnBitfield13;
    }

    /**
     * BitSet OrderModified byte 14.
     *
     * @return the OrderModifiedReturnBitfield14 field
     */
    public OrderModifiedReturnBitfield14Field orderModifiedReturnBitfield14() {
        return orderModifiedReturnBitfield14;
    }

    /**
     * BitSet OrderModified byte 15.
     *
     * @return the OrderModifiedReturnBitfield15 field
     */
    public OrderModifiedReturnBitfield15Field orderModifiedReturnBitfield15() {
        return orderModifiedReturnBitfield15;
    }

    /**
     * BitSet OrderModified byte 16.
     *
     * @return the OrderModifiedReturnBitfield16 field
     */
    public OrderModifiedReturnBitfield16Field orderModifiedReturnBitfield16() {
        return orderModifiedReturnBitfield16;
    }

    /**
     * BitSet OrderModified byte 17.
     *
     * @return the OrderModifiedReturnBitfield17 field
     */
    public OrderModifiedReturnBitfield17Field orderModifiedReturnBitfield17() {
        return orderModifiedReturnBitfield17;
    }

    /**
     * BitSet OrderModified byte 18.
     *
     * @return the OrderModifiedReturnBitfield18 field
     */
    public OrderModifiedReturnBitfield18Field orderModifiedReturnBitfield18() {
        return orderModifiedReturnBitfield18;
    }

    /**
     * BitSet OrderModified byte 19.
     *
     * @return the OrderModifiedReturnBitfield19 field
     */
    public OrderModifiedReturnBitfield19Field orderModifiedReturnBitfield19() {
        return orderModifiedReturnBitfield19;
    }

    /**
     * BitSet OrderModified byte 20.
     *
     * @return the OrderModifiedReturnBitfield20 field
     */
    public OrderModifiedReturnBitfield20Field orderModifiedReturnBitfield20() {
        return orderModifiedReturnBitfield20;
    }

    /**
     * BitSet OrderModified byte 21.
     *
     * @return the OrderModifiedReturnBitfield21 field
     */
    public OrderModifiedReturnBitfield21Field orderModifiedReturnBitfield21() {
        return orderModifiedReturnBitfield21;
    }

    /**
     * BitSet OrderModified byte 22.
     *
     * @return the OrderModifiedReturnBitfield22 field
     */
    public OrderModifiedReturnBitfield22Field orderModifiedReturnBitfield22() {
        return orderModifiedReturnBitfield22;
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
     * Locate Broker
     *
     * @return the LocateBroker field
     */
    public LocateBrokerField locateBroker() {
        return locateBroker;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield1 is on the wire
     */
    public boolean orderModifiedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield2 is on the wire
     */
    public boolean orderModifiedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield3 is on the wire
     */
    public boolean orderModifiedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield4 is on the wire
     */
    public boolean orderModifiedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield5 is on the wire
     */
    public boolean orderModifiedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield6 is on the wire
     */
    public boolean orderModifiedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield7 is on the wire
     */
    public boolean orderModifiedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield8 is on the wire
     */
    public boolean orderModifiedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield9 is on the wire
     */
    public boolean orderModifiedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield10 is on the wire
     */
    public boolean orderModifiedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield11 is on the wire
     */
    public boolean orderModifiedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield12 is on the wire
     */
    public boolean orderModifiedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield13 is on the wire
     */
    public boolean orderModifiedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield14 is on the wire
     */
    public boolean orderModifiedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield15 is on the wire
     */
    public boolean orderModifiedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield16 is on the wire
     */
    public boolean orderModifiedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield17 is on the wire
     */
    public boolean orderModifiedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield18 is on the wire
     */
    public boolean orderModifiedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield19 is on the wire
     */
    public boolean orderModifiedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield20 is on the wire
     */
    public boolean orderModifiedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield21 is on the wire
     */
    public boolean orderModifiedReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderModifiedReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedReturnBitfield22 is on the wire
     */
    public boolean orderModifiedReturnBitfield22Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedReturnBitfield1Present() && orderModifiedReturnBitfield1.orderModifiedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderModifiedReturnBitfield2Present() && orderModifiedReturnBitfield2.orderModifiedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderModifiedReturnBitfield2Present() && orderModifiedReturnBitfield2.orderModifiedReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedReturnBitfield3Present() && orderModifiedReturnBitfield3.orderModifiedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedReturnBitfield5Present() && orderModifiedReturnBitfield5.orderModifiedReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderModifiedReturnBitfield6Present() && orderModifiedReturnBitfield6.orderModifiedReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderModifiedReturnBitfield6Present() && orderModifiedReturnBitfield6.orderModifiedReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderModifiedReturnBitfield6Present() && orderModifiedReturnBitfield6.orderModifiedReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderModifiedReturnBitfield8Present() && orderModifiedReturnBitfield8.orderModifiedReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the CrossTradeFlag put it on the wire.
     *
     * <p>Decode reads the CrossTradeFlag where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossTradeFlag is on the wire
     */
    public boolean crossTradeFlagPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderModifiedReturnBitfield18Present() && orderModifiedReturnBitfield18.orderModifiedReturnBitfield18CrossTradeFlag());
    }

    /**
     * Returns whether the fields before the LocateBroker put it on the wire.
     *
     * <p>Decode reads the LocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LocateBroker is on the wire
     */
    public boolean locateBrokerPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderModifiedReturnBitfield18Present() && orderModifiedReturnBitfield18.orderModifiedReturnBitfield18LocateBroker());
    }

    private boolean onWire(Field field) {
        return (field != orderModifiedReturnBitfield1 || orderModifiedReturnBitfield1Present()) && (field != orderModifiedReturnBitfield2 || orderModifiedReturnBitfield2Present()) && (field != orderModifiedReturnBitfield3 || orderModifiedReturnBitfield3Present()) && (field != orderModifiedReturnBitfield4 || orderModifiedReturnBitfield4Present()) && (field != orderModifiedReturnBitfield5 || orderModifiedReturnBitfield5Present()) && (field != orderModifiedReturnBitfield6 || orderModifiedReturnBitfield6Present()) && (field != orderModifiedReturnBitfield7 || orderModifiedReturnBitfield7Present()) && (field != orderModifiedReturnBitfield8 || orderModifiedReturnBitfield8Present()) && (field != orderModifiedReturnBitfield9 || orderModifiedReturnBitfield9Present()) && (field != orderModifiedReturnBitfield10 || orderModifiedReturnBitfield10Present()) && (field != orderModifiedReturnBitfield11 || orderModifiedReturnBitfield11Present()) && (field != orderModifiedReturnBitfield12 || orderModifiedReturnBitfield12Present()) && (field != orderModifiedReturnBitfield13 || orderModifiedReturnBitfield13Present()) && (field != orderModifiedReturnBitfield14 || orderModifiedReturnBitfield14Present()) && (field != orderModifiedReturnBitfield15 || orderModifiedReturnBitfield15Present()) && (field != orderModifiedReturnBitfield16 || orderModifiedReturnBitfield16Present()) && (field != orderModifiedReturnBitfield17 || orderModifiedReturnBitfield17Present()) && (field != orderModifiedReturnBitfield18 || orderModifiedReturnBitfield18Present()) && (field != orderModifiedReturnBitfield19 || orderModifiedReturnBitfield19Present()) && (field != orderModifiedReturnBitfield20 || orderModifiedReturnBitfield20Present()) && (field != orderModifiedReturnBitfield21 || orderModifiedReturnBitfield21Present()) && (field != orderModifiedReturnBitfield22 || orderModifiedReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != crossTradeFlag || crossTradeFlagPresent()) && (field != locateBroker || locateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderModifiedReturnBitfield1Present() ? OrderModifiedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield2Present() ? OrderModifiedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield3Present() ? OrderModifiedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield4Present() ? OrderModifiedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield5Present() ? OrderModifiedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield6Present() ? OrderModifiedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield7Present() ? OrderModifiedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield8Present() ? OrderModifiedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield9Present() ? OrderModifiedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield10Present() ? OrderModifiedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield11Present() ? OrderModifiedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield12Present() ? OrderModifiedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield13Present() ? OrderModifiedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield14Present() ? OrderModifiedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield15Present() ? OrderModifiedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield16Present() ? OrderModifiedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield17Present() ? OrderModifiedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield18Present() ? OrderModifiedReturnBitfield18Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield19Present() ? OrderModifiedReturnBitfield19Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield20Present() ? OrderModifiedReturnBitfield20Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield21Present() ? OrderModifiedReturnBitfield21Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield22Present() ? OrderModifiedReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (crossTradeFlagPresent() ? CrossTradeFlagField.BYTE_LENGTH : 0) + (locateBrokerPresent() ? LocateBrokerField.BYTE_LENGTH : 0);
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
        if (orderModifiedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderModifiedReturnBitfield22Present()) {
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
        if (locateBrokerPresent()) {
            cursor += 4;
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
        if (orderModifiedReturnBitfield1Present()) {
            if (end - cursor < OrderModifiedReturnBitfield1Field.BYTE_LENGTH || !orderModifiedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield2Present()) {
            if (end - cursor < OrderModifiedReturnBitfield2Field.BYTE_LENGTH || !orderModifiedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield3Present()) {
            if (end - cursor < OrderModifiedReturnBitfield3Field.BYTE_LENGTH || !orderModifiedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield4Present()) {
            if (end - cursor < OrderModifiedReturnBitfield4Field.BYTE_LENGTH || !orderModifiedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield5Present()) {
            if (end - cursor < OrderModifiedReturnBitfield5Field.BYTE_LENGTH || !orderModifiedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield6Present()) {
            if (end - cursor < OrderModifiedReturnBitfield6Field.BYTE_LENGTH || !orderModifiedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield7Present()) {
            if (end - cursor < OrderModifiedReturnBitfield7Field.BYTE_LENGTH || !orderModifiedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield8Present()) {
            if (end - cursor < OrderModifiedReturnBitfield8Field.BYTE_LENGTH || !orderModifiedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield9Present()) {
            if (end - cursor < OrderModifiedReturnBitfield9Field.BYTE_LENGTH || !orderModifiedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield10Present()) {
            if (end - cursor < OrderModifiedReturnBitfield10Field.BYTE_LENGTH || !orderModifiedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield11Present()) {
            if (end - cursor < OrderModifiedReturnBitfield11Field.BYTE_LENGTH || !orderModifiedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield12Present()) {
            if (end - cursor < OrderModifiedReturnBitfield12Field.BYTE_LENGTH || !orderModifiedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield13Present()) {
            if (end - cursor < OrderModifiedReturnBitfield13Field.BYTE_LENGTH || !orderModifiedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield14Present()) {
            if (end - cursor < OrderModifiedReturnBitfield14Field.BYTE_LENGTH || !orderModifiedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield15Present()) {
            if (end - cursor < OrderModifiedReturnBitfield15Field.BYTE_LENGTH || !orderModifiedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield16Present()) {
            if (end - cursor < OrderModifiedReturnBitfield16Field.BYTE_LENGTH || !orderModifiedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield17Present()) {
            if (end - cursor < OrderModifiedReturnBitfield17Field.BYTE_LENGTH || !orderModifiedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield18Present()) {
            if (end - cursor < OrderModifiedReturnBitfield18Field.BYTE_LENGTH || !orderModifiedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield19Present()) {
            if (end - cursor < OrderModifiedReturnBitfield19Field.BYTE_LENGTH || !orderModifiedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield20Present()) {
            if (end - cursor < OrderModifiedReturnBitfield20Field.BYTE_LENGTH || !orderModifiedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield21Present()) {
            if (end - cursor < OrderModifiedReturnBitfield21Field.BYTE_LENGTH || !orderModifiedReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedReturnBitfield22Present()) {
            if (end - cursor < OrderModifiedReturnBitfield22Field.BYTE_LENGTH || !orderModifiedReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedReturnBitfield22Field.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (locateBrokerPresent()) {
            if (end - cursor < LocateBrokerField.BYTE_LENGTH || !locateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += LocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderModifiedReturnBitfield1Present() != orderModifiedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield1.hasValue() ? "orderModifiedReturnBitfield1 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield2Present() != orderModifiedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield2.hasValue() ? "orderModifiedReturnBitfield2 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield3Present() != orderModifiedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield3.hasValue() ? "orderModifiedReturnBitfield3 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield4Present() != orderModifiedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield4.hasValue() ? "orderModifiedReturnBitfield4 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield5Present() != orderModifiedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield5.hasValue() ? "orderModifiedReturnBitfield5 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield6Present() != orderModifiedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield6.hasValue() ? "orderModifiedReturnBitfield6 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield7Present() != orderModifiedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield7.hasValue() ? "orderModifiedReturnBitfield7 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield8Present() != orderModifiedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield8.hasValue() ? "orderModifiedReturnBitfield8 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield9Present() != orderModifiedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield9.hasValue() ? "orderModifiedReturnBitfield9 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield10Present() != orderModifiedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield10.hasValue() ? "orderModifiedReturnBitfield10 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield11Present() != orderModifiedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield11.hasValue() ? "orderModifiedReturnBitfield11 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield12Present() != orderModifiedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield12.hasValue() ? "orderModifiedReturnBitfield12 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield13Present() != orderModifiedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield13.hasValue() ? "orderModifiedReturnBitfield13 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield14Present() != orderModifiedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield14.hasValue() ? "orderModifiedReturnBitfield14 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield15Present() != orderModifiedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield15.hasValue() ? "orderModifiedReturnBitfield15 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield16Present() != orderModifiedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield16.hasValue() ? "orderModifiedReturnBitfield16 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield17Present() != orderModifiedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield17.hasValue() ? "orderModifiedReturnBitfield17 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield18Present() != orderModifiedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield18.hasValue() ? "orderModifiedReturnBitfield18 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield19Present() != orderModifiedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield19.hasValue() ? "orderModifiedReturnBitfield19 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield20Present() != orderModifiedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield20.hasValue() ? "orderModifiedReturnBitfield20 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield21Present() != orderModifiedReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield21.hasValue() ? "orderModifiedReturnBitfield21 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedReturnBitfield22Present() != orderModifiedReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderModifiedReturnBitfield22.hasValue() ? "orderModifiedReturnBitfield22 holds a value the fields before it leave off the wire" : "orderModifiedReturnBitfield22 holds no value, though the fields before it put it on the wire");
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
        if (locateBrokerPresent() != locateBroker.hasValue()) {
            throw new IllegalStateException(locateBroker.hasValue() ? "locateBroker holds a value the fields before it leave off the wire" : "locateBroker holds no value, though the fields before it put it on the wire");
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
        if (orderModifiedReturnBitfield1Present()) {
            cursor = orderModifiedReturnBitfield1.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield2Present()) {
            cursor = orderModifiedReturnBitfield2.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield3Present()) {
            cursor = orderModifiedReturnBitfield3.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield4Present()) {
            cursor = orderModifiedReturnBitfield4.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield5Present()) {
            cursor = orderModifiedReturnBitfield5.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield6Present()) {
            cursor = orderModifiedReturnBitfield6.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield7Present()) {
            cursor = orderModifiedReturnBitfield7.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield8Present()) {
            cursor = orderModifiedReturnBitfield8.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield9Present()) {
            cursor = orderModifiedReturnBitfield9.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield10Present()) {
            cursor = orderModifiedReturnBitfield10.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield11Present()) {
            cursor = orderModifiedReturnBitfield11.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield12Present()) {
            cursor = orderModifiedReturnBitfield12.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield13Present()) {
            cursor = orderModifiedReturnBitfield13.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield14Present()) {
            cursor = orderModifiedReturnBitfield14.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield15Present()) {
            cursor = orderModifiedReturnBitfield15.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield16Present()) {
            cursor = orderModifiedReturnBitfield16.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield17Present()) {
            cursor = orderModifiedReturnBitfield17.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield18Present()) {
            cursor = orderModifiedReturnBitfield18.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield19Present()) {
            cursor = orderModifiedReturnBitfield19.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield20Present()) {
            cursor = orderModifiedReturnBitfield20.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield21Present()) {
            cursor = orderModifiedReturnBitfield21.encode(data, cursor);
        }
        if (orderModifiedReturnBitfield22Present()) {
            cursor = orderModifiedReturnBitfield22.encode(data, cursor);
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
        if (locateBrokerPresent()) {
            cursor = locateBroker.encode(data, cursor);
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
            case "OrderModifiedReturnBitfield1" -> Optional.of(orderModifiedReturnBitfield1);
            case "OrderModifiedReturnBitfield2" -> Optional.of(orderModifiedReturnBitfield2);
            case "OrderModifiedReturnBitfield3" -> Optional.of(orderModifiedReturnBitfield3);
            case "OrderModifiedReturnBitfield4" -> Optional.of(orderModifiedReturnBitfield4);
            case "OrderModifiedReturnBitfield5" -> Optional.of(orderModifiedReturnBitfield5);
            case "OrderModifiedReturnBitfield6" -> Optional.of(orderModifiedReturnBitfield6);
            case "OrderModifiedReturnBitfield7" -> Optional.of(orderModifiedReturnBitfield7);
            case "OrderModifiedReturnBitfield8" -> Optional.of(orderModifiedReturnBitfield8);
            case "OrderModifiedReturnBitfield9" -> Optional.of(orderModifiedReturnBitfield9);
            case "OrderModifiedReturnBitfield10" -> Optional.of(orderModifiedReturnBitfield10);
            case "OrderModifiedReturnBitfield11" -> Optional.of(orderModifiedReturnBitfield11);
            case "OrderModifiedReturnBitfield12" -> Optional.of(orderModifiedReturnBitfield12);
            case "OrderModifiedReturnBitfield13" -> Optional.of(orderModifiedReturnBitfield13);
            case "OrderModifiedReturnBitfield14" -> Optional.of(orderModifiedReturnBitfield14);
            case "OrderModifiedReturnBitfield15" -> Optional.of(orderModifiedReturnBitfield15);
            case "OrderModifiedReturnBitfield16" -> Optional.of(orderModifiedReturnBitfield16);
            case "OrderModifiedReturnBitfield17" -> Optional.of(orderModifiedReturnBitfield17);
            case "OrderModifiedReturnBitfield18" -> Optional.of(orderModifiedReturnBitfield18);
            case "OrderModifiedReturnBitfield19" -> Optional.of(orderModifiedReturnBitfield19);
            case "OrderModifiedReturnBitfield20" -> Optional.of(orderModifiedReturnBitfield20);
            case "OrderModifiedReturnBitfield21" -> Optional.of(orderModifiedReturnBitfield21);
            case "OrderModifiedReturnBitfield22" -> Optional.of(orderModifiedReturnBitfield22);
            case "Side" -> Optional.of(side);
            case "PegDifference" -> Optional.of(pegDifference);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
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
            case "LocateBroker" -> Optional.of(locateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedMessage message)) {
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
        if (!(other instanceof OrderModifiedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
