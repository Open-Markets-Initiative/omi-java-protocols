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
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ContraBrokerField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CrossTradeFlagField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DiscretionAmountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.DisplayIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.EchoTextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExDestinationField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExecIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExtExecInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.FeeCodeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastSharesField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LeavesQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LocateBrokerField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MaxFloorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MinQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrdTypeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderExecutionReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderQtyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PegDifferenceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PreventMatchField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutStrategyField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RouteDeliveryMethodField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RoutingInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.StopPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TimeInForceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the OrderExecutionMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Execution Message.</p>
 */
public final class OrderExecutionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. All externally matched (routed) executions will identify the away exchange. AMEX=Routed to NYSE American ARCA=Routed to NYSE Arca BEX=Routed to Nasdaq Texas CHX=Routed to NYSE Texas ICRS=Routed to Intelligent Cross (pending approval) IEX=Routed to Investors Exchange INET=Routed to Nasdaq LTSE=Routed to Long Term Stock Exchange MEMX=Routed to Members Exchange NYSE=Routed to NYSE PERL=Routed to MIAX PEARL Exchange PSX=Routed to Nasdaq PSX NSX=Routed to NYSE National DRT=Routed to DRT Pool TFXE=Routed to 24X National Exchange TXSE=Routed to Texas Stock Exchange BATS=Routed to Cboe BZX Exchange* BYXX=Routed to Cboe BYX Exchange* EDGA=Routed to Cboe EDGA Exchange* EDGX=Routed to Cboe EDGX Exchange* * Internally matched if ContraBroker matches the identifier of the local trading platform’s book.
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderExecution byte 1.
     */
    private final OrderExecutionReturnBitfield1Field orderExecutionReturnBitfield1 = new OrderExecutionReturnBitfield1Field();

    /**
     * BitSet OrderExecution byte 2.
     */
    private final OrderExecutionReturnBitfield2Field orderExecutionReturnBitfield2 = new OrderExecutionReturnBitfield2Field();

    /**
     * BitSet OrderExecution byte 3.
     */
    private final OrderExecutionReturnBitfield3Field orderExecutionReturnBitfield3 = new OrderExecutionReturnBitfield3Field();

    /**
     * BitSet OrderExecution byte 4.
     */
    private final OrderExecutionReturnBitfield4Field orderExecutionReturnBitfield4 = new OrderExecutionReturnBitfield4Field();

    /**
     * BitSet OrderExecution byte 5.
     */
    private final OrderExecutionReturnBitfield5Field orderExecutionReturnBitfield5 = new OrderExecutionReturnBitfield5Field();

    /**
     * BitSet OrderExecution byte 6.
     */
    private final OrderExecutionReturnBitfield6Field orderExecutionReturnBitfield6 = new OrderExecutionReturnBitfield6Field();

    /**
     * BitSet OrderExecution byte 7.
     */
    private final OrderExecutionReturnBitfield7Field orderExecutionReturnBitfield7 = new OrderExecutionReturnBitfield7Field();

    /**
     * BitSet OrderExecution byte 8.
     */
    private final OrderExecutionReturnBitfield8Field orderExecutionReturnBitfield8 = new OrderExecutionReturnBitfield8Field();

    /**
     * BitSet OrderExecution byte 9.
     */
    private final OrderExecutionReturnBitfield9Field orderExecutionReturnBitfield9 = new OrderExecutionReturnBitfield9Field();

    /**
     * BitSet OrderExecution byte 10.
     */
    private final OrderExecutionReturnBitfield10Field orderExecutionReturnBitfield10 = new OrderExecutionReturnBitfield10Field();

    /**
     * BitSet OrderExecution byte 11.
     */
    private final OrderExecutionReturnBitfield11Field orderExecutionReturnBitfield11 = new OrderExecutionReturnBitfield11Field();

    /**
     * BitSet OrderExecution byte 12.
     */
    private final OrderExecutionReturnBitfield12Field orderExecutionReturnBitfield12 = new OrderExecutionReturnBitfield12Field();

    /**
     * BitSet OrderExecution byte 13.
     */
    private final OrderExecutionReturnBitfield13Field orderExecutionReturnBitfield13 = new OrderExecutionReturnBitfield13Field();

    /**
     * BitSet OrderExecution byte 14.
     */
    private final OrderExecutionReturnBitfield14Field orderExecutionReturnBitfield14 = new OrderExecutionReturnBitfield14Field();

    /**
     * BitSet OrderExecution byte 15.
     */
    private final OrderExecutionReturnBitfield15Field orderExecutionReturnBitfield15 = new OrderExecutionReturnBitfield15Field();

    /**
     * BitSet OrderExecution byte 16.
     */
    private final OrderExecutionReturnBitfield16Field orderExecutionReturnBitfield16 = new OrderExecutionReturnBitfield16Field();

    /**
     * BitSet OrderExecution byte 17.
     */
    private final OrderExecutionReturnBitfield17Field orderExecutionReturnBitfield17 = new OrderExecutionReturnBitfield17Field();

    /**
     * BitSet OrderExecution byte 18.
     */
    private final OrderExecutionReturnBitfield18Field orderExecutionReturnBitfield18 = new OrderExecutionReturnBitfield18Field();

    /**
     * BitSet OrderExecution byte 19.
     */
    private final OrderExecutionReturnBitfield19Field orderExecutionReturnBitfield19 = new OrderExecutionReturnBitfield19Field();

    /**
     * BitSet OrderExecution byte 20.
     */
    private final OrderExecutionReturnBitfield20Field orderExecutionReturnBitfield20 = new OrderExecutionReturnBitfield20Field();

    /**
     * BitSet OrderExecution byte 21.
     */
    private final OrderExecutionReturnBitfield21Field orderExecutionReturnBitfield21 = new OrderExecutionReturnBitfield21Field();

    /**
     * BitSet OrderExecution byte 22.
     */
    private final OrderExecutionReturnBitfield22Field orderExecutionReturnBitfield22 = new OrderExecutionReturnBitfield22Field();

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
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastShares, lastPx, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, contraBroker, numberOfReturnBitfields, orderExecutionReturnBitfield1, orderExecutionReturnBitfield2, orderExecutionReturnBitfield3, orderExecutionReturnBitfield4, orderExecutionReturnBitfield5, orderExecutionReturnBitfield6, orderExecutionReturnBitfield7, orderExecutionReturnBitfield8, orderExecutionReturnBitfield9, orderExecutionReturnBitfield10, orderExecutionReturnBitfield11, orderExecutionReturnBitfield12, orderExecutionReturnBitfield13, orderExecutionReturnBitfield14, orderExecutionReturnBitfield15, orderExecutionReturnBitfield16, orderExecutionReturnBitfield17, orderExecutionReturnBitfield18, orderExecutionReturnBitfield19, orderExecutionReturnBitfield20, orderExecutionReturnBitfield21, orderExecutionReturnBitfield22, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, symbolSfx, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, discretionAmount, orderQty, preventMatch, attributedQuote, extExecInst, feeCode, echoText, stopPx, routingInst, routStrategy, routeDeliveryMethod, exDestination, crossTradeFlag, locateBroker);

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
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as nine character, base 36 ASCII. Leading zeros should be added if the converted base 36 value is shorter than nine characters. Table 2. Example Conversion Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. All externally matched (routed) executions will identify the away exchange. AMEX=Routed to NYSE American ARCA=Routed to NYSE Arca BEX=Routed to Nasdaq Texas CHX=Routed to NYSE Texas ICRS=Routed to Intelligent Cross (pending approval) IEX=Routed to Investors Exchange INET=Routed to Nasdaq LTSE=Routed to Long Term Stock Exchange MEMX=Routed to Members Exchange NYSE=Routed to NYSE PERL=Routed to MIAX PEARL Exchange PSX=Routed to Nasdaq PSX NSX=Routed to NYSE National DRT=Routed to DRT Pool TFXE=Routed to 24X National Exchange TXSE=Routed to Texas Stock Exchange BATS=Routed to Cboe BZX Exchange* BYXX=Routed to Cboe BYX Exchange* EDGA=Routed to Cboe EDGA Exchange* EDGX=Routed to Cboe EDGX Exchange* * Internally matched if ContraBroker matches the identifier of the local trading platform’s book.
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
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
     * BitSet OrderExecution byte 1.
     *
     * @return the OrderExecutionReturnBitfield1 field
     */
    public OrderExecutionReturnBitfield1Field orderExecutionReturnBitfield1() {
        return orderExecutionReturnBitfield1;
    }

    /**
     * BitSet OrderExecution byte 2.
     *
     * @return the OrderExecutionReturnBitfield2 field
     */
    public OrderExecutionReturnBitfield2Field orderExecutionReturnBitfield2() {
        return orderExecutionReturnBitfield2;
    }

    /**
     * BitSet OrderExecution byte 3.
     *
     * @return the OrderExecutionReturnBitfield3 field
     */
    public OrderExecutionReturnBitfield3Field orderExecutionReturnBitfield3() {
        return orderExecutionReturnBitfield3;
    }

    /**
     * BitSet OrderExecution byte 4.
     *
     * @return the OrderExecutionReturnBitfield4 field
     */
    public OrderExecutionReturnBitfield4Field orderExecutionReturnBitfield4() {
        return orderExecutionReturnBitfield4;
    }

    /**
     * BitSet OrderExecution byte 5.
     *
     * @return the OrderExecutionReturnBitfield5 field
     */
    public OrderExecutionReturnBitfield5Field orderExecutionReturnBitfield5() {
        return orderExecutionReturnBitfield5;
    }

    /**
     * BitSet OrderExecution byte 6.
     *
     * @return the OrderExecutionReturnBitfield6 field
     */
    public OrderExecutionReturnBitfield6Field orderExecutionReturnBitfield6() {
        return orderExecutionReturnBitfield6;
    }

    /**
     * BitSet OrderExecution byte 7.
     *
     * @return the OrderExecutionReturnBitfield7 field
     */
    public OrderExecutionReturnBitfield7Field orderExecutionReturnBitfield7() {
        return orderExecutionReturnBitfield7;
    }

    /**
     * BitSet OrderExecution byte 8.
     *
     * @return the OrderExecutionReturnBitfield8 field
     */
    public OrderExecutionReturnBitfield8Field orderExecutionReturnBitfield8() {
        return orderExecutionReturnBitfield8;
    }

    /**
     * BitSet OrderExecution byte 9.
     *
     * @return the OrderExecutionReturnBitfield9 field
     */
    public OrderExecutionReturnBitfield9Field orderExecutionReturnBitfield9() {
        return orderExecutionReturnBitfield9;
    }

    /**
     * BitSet OrderExecution byte 10.
     *
     * @return the OrderExecutionReturnBitfield10 field
     */
    public OrderExecutionReturnBitfield10Field orderExecutionReturnBitfield10() {
        return orderExecutionReturnBitfield10;
    }

    /**
     * BitSet OrderExecution byte 11.
     *
     * @return the OrderExecutionReturnBitfield11 field
     */
    public OrderExecutionReturnBitfield11Field orderExecutionReturnBitfield11() {
        return orderExecutionReturnBitfield11;
    }

    /**
     * BitSet OrderExecution byte 12.
     *
     * @return the OrderExecutionReturnBitfield12 field
     */
    public OrderExecutionReturnBitfield12Field orderExecutionReturnBitfield12() {
        return orderExecutionReturnBitfield12;
    }

    /**
     * BitSet OrderExecution byte 13.
     *
     * @return the OrderExecutionReturnBitfield13 field
     */
    public OrderExecutionReturnBitfield13Field orderExecutionReturnBitfield13() {
        return orderExecutionReturnBitfield13;
    }

    /**
     * BitSet OrderExecution byte 14.
     *
     * @return the OrderExecutionReturnBitfield14 field
     */
    public OrderExecutionReturnBitfield14Field orderExecutionReturnBitfield14() {
        return orderExecutionReturnBitfield14;
    }

    /**
     * BitSet OrderExecution byte 15.
     *
     * @return the OrderExecutionReturnBitfield15 field
     */
    public OrderExecutionReturnBitfield15Field orderExecutionReturnBitfield15() {
        return orderExecutionReturnBitfield15;
    }

    /**
     * BitSet OrderExecution byte 16.
     *
     * @return the OrderExecutionReturnBitfield16 field
     */
    public OrderExecutionReturnBitfield16Field orderExecutionReturnBitfield16() {
        return orderExecutionReturnBitfield16;
    }

    /**
     * BitSet OrderExecution byte 17.
     *
     * @return the OrderExecutionReturnBitfield17 field
     */
    public OrderExecutionReturnBitfield17Field orderExecutionReturnBitfield17() {
        return orderExecutionReturnBitfield17;
    }

    /**
     * BitSet OrderExecution byte 18.
     *
     * @return the OrderExecutionReturnBitfield18 field
     */
    public OrderExecutionReturnBitfield18Field orderExecutionReturnBitfield18() {
        return orderExecutionReturnBitfield18;
    }

    /**
     * BitSet OrderExecution byte 19.
     *
     * @return the OrderExecutionReturnBitfield19 field
     */
    public OrderExecutionReturnBitfield19Field orderExecutionReturnBitfield19() {
        return orderExecutionReturnBitfield19;
    }

    /**
     * BitSet OrderExecution byte 20.
     *
     * @return the OrderExecutionReturnBitfield20 field
     */
    public OrderExecutionReturnBitfield20Field orderExecutionReturnBitfield20() {
        return orderExecutionReturnBitfield20;
    }

    /**
     * BitSet OrderExecution byte 21.
     *
     * @return the OrderExecutionReturnBitfield21 field
     */
    public OrderExecutionReturnBitfield21Field orderExecutionReturnBitfield21() {
        return orderExecutionReturnBitfield21;
    }

    /**
     * BitSet OrderExecution byte 22.
     *
     * @return the OrderExecutionReturnBitfield22 field
     */
    public OrderExecutionReturnBitfield22Field orderExecutionReturnBitfield22() {
        return orderExecutionReturnBitfield22;
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
     * Fee Code
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
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
     * Returns whether the fields before the OrderExecutionReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield1 is on the wire
     */
    public boolean orderExecutionReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield2 is on the wire
     */
    public boolean orderExecutionReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield3 is on the wire
     */
    public boolean orderExecutionReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield4 is on the wire
     */
    public boolean orderExecutionReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield5 is on the wire
     */
    public boolean orderExecutionReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield6 is on the wire
     */
    public boolean orderExecutionReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield7 is on the wire
     */
    public boolean orderExecutionReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield8 is on the wire
     */
    public boolean orderExecutionReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield9 is on the wire
     */
    public boolean orderExecutionReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield10 is on the wire
     */
    public boolean orderExecutionReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield11 is on the wire
     */
    public boolean orderExecutionReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield12 is on the wire
     */
    public boolean orderExecutionReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield13 is on the wire
     */
    public boolean orderExecutionReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield14 is on the wire
     */
    public boolean orderExecutionReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield15 is on the wire
     */
    public boolean orderExecutionReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield16 is on the wire
     */
    public boolean orderExecutionReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield17 is on the wire
     */
    public boolean orderExecutionReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield18 is on the wire
     */
    public boolean orderExecutionReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield19 is on the wire
     */
    public boolean orderExecutionReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield20 is on the wire
     */
    public boolean orderExecutionReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield21 is on the wire
     */
    public boolean orderExecutionReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the OrderExecutionReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionReturnBitfield22 is on the wire
     */
    public boolean orderExecutionReturnBitfield22Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionReturnBitfield1Present() && orderExecutionReturnBitfield1.orderExecutionReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the DiscretionAmount put it on the wire.
     *
     * <p>Decode reads the DiscretionAmount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DiscretionAmount is on the wire
     */
    public boolean discretionAmountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3DiscretionAmount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionReturnBitfield3Present() && orderExecutionReturnBitfield3.orderExecutionReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionReturnBitfield6Present() && orderExecutionReturnBitfield6.orderExecutionReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionReturnBitfield6Present() && orderExecutionReturnBitfield6.orderExecutionReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the RoutStrategy put it on the wire.
     *
     * <p>Decode reads the RoutStrategy where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutStrategy is on the wire
     */
    public boolean routStrategyPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RoutStrategy());
    }

    /**
     * Returns whether the fields before the RouteDeliveryMethod put it on the wire.
     *
     * <p>Decode reads the RouteDeliveryMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RouteDeliveryMethod is on the wire
     */
    public boolean routeDeliveryMethodPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8RouteDeliveryMethod());
    }

    /**
     * Returns whether the fields before the ExDestination put it on the wire.
     *
     * <p>Decode reads the ExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExDestination is on the wire
     */
    public boolean exDestinationPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionReturnBitfield8Present() && orderExecutionReturnBitfield8.orderExecutionReturnBitfield8ExDestination());
    }

    /**
     * Returns whether the fields before the CrossTradeFlag put it on the wire.
     *
     * <p>Decode reads the CrossTradeFlag where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossTradeFlag is on the wire
     */
    public boolean crossTradeFlagPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderExecutionReturnBitfield18Present() && orderExecutionReturnBitfield18.orderExecutionReturnBitfield18CrossTradeFlag());
    }

    /**
     * Returns whether the fields before the LocateBroker put it on the wire.
     *
     * <p>Decode reads the LocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LocateBroker is on the wire
     */
    public boolean locateBrokerPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderExecutionReturnBitfield18Present() && orderExecutionReturnBitfield18.orderExecutionReturnBitfield18LocateBroker());
    }

    private boolean onWire(Field field) {
        return (field != orderExecutionReturnBitfield1 || orderExecutionReturnBitfield1Present()) && (field != orderExecutionReturnBitfield2 || orderExecutionReturnBitfield2Present()) && (field != orderExecutionReturnBitfield3 || orderExecutionReturnBitfield3Present()) && (field != orderExecutionReturnBitfield4 || orderExecutionReturnBitfield4Present()) && (field != orderExecutionReturnBitfield5 || orderExecutionReturnBitfield5Present()) && (field != orderExecutionReturnBitfield6 || orderExecutionReturnBitfield6Present()) && (field != orderExecutionReturnBitfield7 || orderExecutionReturnBitfield7Present()) && (field != orderExecutionReturnBitfield8 || orderExecutionReturnBitfield8Present()) && (field != orderExecutionReturnBitfield9 || orderExecutionReturnBitfield9Present()) && (field != orderExecutionReturnBitfield10 || orderExecutionReturnBitfield10Present()) && (field != orderExecutionReturnBitfield11 || orderExecutionReturnBitfield11Present()) && (field != orderExecutionReturnBitfield12 || orderExecutionReturnBitfield12Present()) && (field != orderExecutionReturnBitfield13 || orderExecutionReturnBitfield13Present()) && (field != orderExecutionReturnBitfield14 || orderExecutionReturnBitfield14Present()) && (field != orderExecutionReturnBitfield15 || orderExecutionReturnBitfield15Present()) && (field != orderExecutionReturnBitfield16 || orderExecutionReturnBitfield16Present()) && (field != orderExecutionReturnBitfield17 || orderExecutionReturnBitfield17Present()) && (field != orderExecutionReturnBitfield18 || orderExecutionReturnBitfield18Present()) && (field != orderExecutionReturnBitfield19 || orderExecutionReturnBitfield19Present()) && (field != orderExecutionReturnBitfield20 || orderExecutionReturnBitfield20Present()) && (field != orderExecutionReturnBitfield21 || orderExecutionReturnBitfield21Present()) && (field != orderExecutionReturnBitfield22 || orderExecutionReturnBitfield22Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != discretionAmount || discretionAmountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != extExecInst || extExecInstPresent()) && (field != feeCode || feeCodePresent()) && (field != echoText || echoTextPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != routStrategy || routStrategyPresent()) && (field != routeDeliveryMethod || routeDeliveryMethodPresent()) && (field != exDestination || exDestinationPresent()) && (field != crossTradeFlag || crossTradeFlagPresent()) && (field != locateBroker || locateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderExecutionReturnBitfield1Present() ? OrderExecutionReturnBitfield1Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield2Present() ? OrderExecutionReturnBitfield2Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield3Present() ? OrderExecutionReturnBitfield3Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield4Present() ? OrderExecutionReturnBitfield4Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield5Present() ? OrderExecutionReturnBitfield5Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield6Present() ? OrderExecutionReturnBitfield6Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield7Present() ? OrderExecutionReturnBitfield7Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield8Present() ? OrderExecutionReturnBitfield8Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield9Present() ? OrderExecutionReturnBitfield9Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield10Present() ? OrderExecutionReturnBitfield10Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield11Present() ? OrderExecutionReturnBitfield11Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield12Present() ? OrderExecutionReturnBitfield12Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield13Present() ? OrderExecutionReturnBitfield13Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield14Present() ? OrderExecutionReturnBitfield14Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield15Present() ? OrderExecutionReturnBitfield15Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield16Present() ? OrderExecutionReturnBitfield16Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield17Present() ? OrderExecutionReturnBitfield17Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield18Present() ? OrderExecutionReturnBitfield18Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield19Present() ? OrderExecutionReturnBitfield19Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield20Present() ? OrderExecutionReturnBitfield20Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield21Present() ? OrderExecutionReturnBitfield21Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield22Present() ? OrderExecutionReturnBitfield22Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (discretionAmountPresent() ? DiscretionAmountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (routStrategyPresent() ? RoutStrategyField.BYTE_LENGTH : 0) + (routeDeliveryMethodPresent() ? RouteDeliveryMethodField.BYTE_LENGTH : 0) + (exDestinationPresent() ? ExDestinationField.BYTE_LENGTH : 0) + (crossTradeFlagPresent() ? CrossTradeFlagField.BYTE_LENGTH : 0) + (locateBrokerPresent() ? LocateBrokerField.BYTE_LENGTH : 0);
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
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderExecutionReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield19Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield20Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield21Present()) {
            cursor += 1;
        }
        if (orderExecutionReturnBitfield22Present()) {
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
        if (attributedQuotePresent()) {
            cursor += 1;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (feeCodePresent()) {
            cursor += 2;
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
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderExecutionReturnBitfield1Present()) {
            if (end - cursor < OrderExecutionReturnBitfield1Field.BYTE_LENGTH || !orderExecutionReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield2Present()) {
            if (end - cursor < OrderExecutionReturnBitfield2Field.BYTE_LENGTH || !orderExecutionReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield3Present()) {
            if (end - cursor < OrderExecutionReturnBitfield3Field.BYTE_LENGTH || !orderExecutionReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield4Present()) {
            if (end - cursor < OrderExecutionReturnBitfield4Field.BYTE_LENGTH || !orderExecutionReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield5Present()) {
            if (end - cursor < OrderExecutionReturnBitfield5Field.BYTE_LENGTH || !orderExecutionReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield6Present()) {
            if (end - cursor < OrderExecutionReturnBitfield6Field.BYTE_LENGTH || !orderExecutionReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield7Present()) {
            if (end - cursor < OrderExecutionReturnBitfield7Field.BYTE_LENGTH || !orderExecutionReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield8Present()) {
            if (end - cursor < OrderExecutionReturnBitfield8Field.BYTE_LENGTH || !orderExecutionReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield9Present()) {
            if (end - cursor < OrderExecutionReturnBitfield9Field.BYTE_LENGTH || !orderExecutionReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield10Present()) {
            if (end - cursor < OrderExecutionReturnBitfield10Field.BYTE_LENGTH || !orderExecutionReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield11Present()) {
            if (end - cursor < OrderExecutionReturnBitfield11Field.BYTE_LENGTH || !orderExecutionReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield12Present()) {
            if (end - cursor < OrderExecutionReturnBitfield12Field.BYTE_LENGTH || !orderExecutionReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield13Present()) {
            if (end - cursor < OrderExecutionReturnBitfield13Field.BYTE_LENGTH || !orderExecutionReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield14Present()) {
            if (end - cursor < OrderExecutionReturnBitfield14Field.BYTE_LENGTH || !orderExecutionReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield15Present()) {
            if (end - cursor < OrderExecutionReturnBitfield15Field.BYTE_LENGTH || !orderExecutionReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield16Present()) {
            if (end - cursor < OrderExecutionReturnBitfield16Field.BYTE_LENGTH || !orderExecutionReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield17Present()) {
            if (end - cursor < OrderExecutionReturnBitfield17Field.BYTE_LENGTH || !orderExecutionReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield18Present()) {
            if (end - cursor < OrderExecutionReturnBitfield18Field.BYTE_LENGTH || !orderExecutionReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield19Present()) {
            if (end - cursor < OrderExecutionReturnBitfield19Field.BYTE_LENGTH || !orderExecutionReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield20Present()) {
            if (end - cursor < OrderExecutionReturnBitfield20Field.BYTE_LENGTH || !orderExecutionReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield21Present()) {
            if (end - cursor < OrderExecutionReturnBitfield21Field.BYTE_LENGTH || !orderExecutionReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionReturnBitfield22Present()) {
            if (end - cursor < OrderExecutionReturnBitfield22Field.BYTE_LENGTH || !orderExecutionReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionReturnBitfield22Field.BYTE_LENGTH;
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
        if (feeCodePresent()) {
            if (end - cursor < FeeCodeField.BYTE_LENGTH || !feeCode.parse(data, cursor)) {
                return false;
            }
            cursor += FeeCodeField.BYTE_LENGTH;
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
        if (orderExecutionReturnBitfield1Present() != orderExecutionReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield1.hasValue() ? "orderExecutionReturnBitfield1 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield2Present() != orderExecutionReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield2.hasValue() ? "orderExecutionReturnBitfield2 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield3Present() != orderExecutionReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield3.hasValue() ? "orderExecutionReturnBitfield3 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield4Present() != orderExecutionReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield4.hasValue() ? "orderExecutionReturnBitfield4 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield5Present() != orderExecutionReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield5.hasValue() ? "orderExecutionReturnBitfield5 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield6Present() != orderExecutionReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield6.hasValue() ? "orderExecutionReturnBitfield6 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield7Present() != orderExecutionReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield7.hasValue() ? "orderExecutionReturnBitfield7 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield8Present() != orderExecutionReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield8.hasValue() ? "orderExecutionReturnBitfield8 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield9Present() != orderExecutionReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield9.hasValue() ? "orderExecutionReturnBitfield9 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield10Present() != orderExecutionReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield10.hasValue() ? "orderExecutionReturnBitfield10 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield11Present() != orderExecutionReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield11.hasValue() ? "orderExecutionReturnBitfield11 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield12Present() != orderExecutionReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield12.hasValue() ? "orderExecutionReturnBitfield12 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield13Present() != orderExecutionReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield13.hasValue() ? "orderExecutionReturnBitfield13 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield14Present() != orderExecutionReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield14.hasValue() ? "orderExecutionReturnBitfield14 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield15Present() != orderExecutionReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield15.hasValue() ? "orderExecutionReturnBitfield15 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield16Present() != orderExecutionReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield16.hasValue() ? "orderExecutionReturnBitfield16 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield17Present() != orderExecutionReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield17.hasValue() ? "orderExecutionReturnBitfield17 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield18Present() != orderExecutionReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield18.hasValue() ? "orderExecutionReturnBitfield18 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield19Present() != orderExecutionReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield19.hasValue() ? "orderExecutionReturnBitfield19 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield20Present() != orderExecutionReturnBitfield20.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield20.hasValue() ? "orderExecutionReturnBitfield20 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield21Present() != orderExecutionReturnBitfield21.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield21.hasValue() ? "orderExecutionReturnBitfield21 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionReturnBitfield22Present() != orderExecutionReturnBitfield22.hasValue()) {
            throw new IllegalStateException(orderExecutionReturnBitfield22.hasValue() ? "orderExecutionReturnBitfield22 holds a value the fields before it leave off the wire" : "orderExecutionReturnBitfield22 holds no value, though the fields before it put it on the wire");
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
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
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
        cursor = execId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 59) {
            System.arraycopy(buffer, 58, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderExecutionReturnBitfield1Present()) {
            cursor = orderExecutionReturnBitfield1.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield2Present()) {
            cursor = orderExecutionReturnBitfield2.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield3Present()) {
            cursor = orderExecutionReturnBitfield3.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield4Present()) {
            cursor = orderExecutionReturnBitfield4.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield5Present()) {
            cursor = orderExecutionReturnBitfield5.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield6Present()) {
            cursor = orderExecutionReturnBitfield6.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield7Present()) {
            cursor = orderExecutionReturnBitfield7.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield8Present()) {
            cursor = orderExecutionReturnBitfield8.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield9Present()) {
            cursor = orderExecutionReturnBitfield9.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield10Present()) {
            cursor = orderExecutionReturnBitfield10.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield11Present()) {
            cursor = orderExecutionReturnBitfield11.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield12Present()) {
            cursor = orderExecutionReturnBitfield12.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield13Present()) {
            cursor = orderExecutionReturnBitfield13.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield14Present()) {
            cursor = orderExecutionReturnBitfield14.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield15Present()) {
            cursor = orderExecutionReturnBitfield15.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield16Present()) {
            cursor = orderExecutionReturnBitfield16.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield17Present()) {
            cursor = orderExecutionReturnBitfield17.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield18Present()) {
            cursor = orderExecutionReturnBitfield18.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield19Present()) {
            cursor = orderExecutionReturnBitfield19.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield20Present()) {
            cursor = orderExecutionReturnBitfield20.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield21Present()) {
            cursor = orderExecutionReturnBitfield21.encode(data, cursor);
        }
        if (orderExecutionReturnBitfield22Present()) {
            cursor = orderExecutionReturnBitfield22.encode(data, cursor);
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
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
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
            case "ExecId" -> Optional.of(execId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderExecutionReturnBitfield1" -> Optional.of(orderExecutionReturnBitfield1);
            case "OrderExecutionReturnBitfield2" -> Optional.of(orderExecutionReturnBitfield2);
            case "OrderExecutionReturnBitfield3" -> Optional.of(orderExecutionReturnBitfield3);
            case "OrderExecutionReturnBitfield4" -> Optional.of(orderExecutionReturnBitfield4);
            case "OrderExecutionReturnBitfield5" -> Optional.of(orderExecutionReturnBitfield5);
            case "OrderExecutionReturnBitfield6" -> Optional.of(orderExecutionReturnBitfield6);
            case "OrderExecutionReturnBitfield7" -> Optional.of(orderExecutionReturnBitfield7);
            case "OrderExecutionReturnBitfield8" -> Optional.of(orderExecutionReturnBitfield8);
            case "OrderExecutionReturnBitfield9" -> Optional.of(orderExecutionReturnBitfield9);
            case "OrderExecutionReturnBitfield10" -> Optional.of(orderExecutionReturnBitfield10);
            case "OrderExecutionReturnBitfield11" -> Optional.of(orderExecutionReturnBitfield11);
            case "OrderExecutionReturnBitfield12" -> Optional.of(orderExecutionReturnBitfield12);
            case "OrderExecutionReturnBitfield13" -> Optional.of(orderExecutionReturnBitfield13);
            case "OrderExecutionReturnBitfield14" -> Optional.of(orderExecutionReturnBitfield14);
            case "OrderExecutionReturnBitfield15" -> Optional.of(orderExecutionReturnBitfield15);
            case "OrderExecutionReturnBitfield16" -> Optional.of(orderExecutionReturnBitfield16);
            case "OrderExecutionReturnBitfield17" -> Optional.of(orderExecutionReturnBitfield17);
            case "OrderExecutionReturnBitfield18" -> Optional.of(orderExecutionReturnBitfield18);
            case "OrderExecutionReturnBitfield19" -> Optional.of(orderExecutionReturnBitfield19);
            case "OrderExecutionReturnBitfield20" -> Optional.of(orderExecutionReturnBitfield20);
            case "OrderExecutionReturnBitfield21" -> Optional.of(orderExecutionReturnBitfield21);
            case "OrderExecutionReturnBitfield22" -> Optional.of(orderExecutionReturnBitfield22);
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
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "FeeCode" -> Optional.of(feeCode);
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
