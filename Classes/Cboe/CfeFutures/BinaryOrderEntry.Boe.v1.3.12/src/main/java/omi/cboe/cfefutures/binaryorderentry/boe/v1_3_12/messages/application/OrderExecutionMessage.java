package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.AvgPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.BaseLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingSizeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ContraBrokerField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayAvgPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayCumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayOrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FeeCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastSharesField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MultilegReportingTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderExecutionReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PendingStatusField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SecondaryExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SubLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TradeDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

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
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in CFE FIX. Unique ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe. A leading tilde (~) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by CFE and could be received as a result of a system-generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Sent to the OCC in the Order ID field. Note: CFE only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived GTC and GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to ExecID (17) in CFE FIX. Sent to the OCC in the Trade ID field. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as base 36 ASCII. Example conversion: Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
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
     * Corresponds to ContraBroker (375) in CFE FIX. Value always set to “CFE”
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
     * Corresponds to Side (54) in CFE FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

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
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

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
     * Corresponds to OrderQty (38) in CFE FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Cti Code
     */
    private final CtiCodeField ctiCode = new CtiCodeField();

    /**
     * Manual Order Indicator
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Oeoid
     */
    private final OeoidField oeoid = new OeoidField();

    /**
     * Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Clearing Size
     */
    private final ClearingSizeField clearingSize = new ClearingSizeField();

    /**
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Day Order Qty
     */
    private final DayOrderQtyField dayOrderQty = new DayOrderQtyField();

    /**
     * Day Cum Qty
     */
    private final DayCumQtyField dayCumQty = new DayCumQtyField();

    /**
     * Avg Px
     */
    private final AvgPxField avgPx = new AvgPxField();

    /**
     * Day Avg Px
     */
    private final DayAvgPxField dayAvgPx = new DayAvgPxField();

    /**
     * Pending Status
     */
    private final PendingStatusField pendingStatus = new PendingStatusField();

    /**
     * Multileg Reporting Type
     */
    private final MultilegReportingTypeField multilegReportingType = new MultilegReportingTypeField();

    /**
     * Secondary Exec Id
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastShares, lastPx, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, contraBroker, numberOfReturnBitfields, orderExecutionReturnBitfield1, orderExecutionReturnBitfield2, orderExecutionReturnBitfield3, orderExecutionReturnBitfield4, orderExecutionReturnBitfield5, orderExecutionReturnBitfield6, orderExecutionReturnBitfield7, orderExecutionReturnBitfield8, orderExecutionReturnBitfield9, orderExecutionReturnBitfield10, orderExecutionReturnBitfield11, orderExecutionReturnBitfield12, orderExecutionReturnBitfield13, orderExecutionReturnBitfield14, orderExecutionReturnBitfield15, orderExecutionReturnBitfield16, orderExecutionReturnBitfield17, orderExecutionReturnBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, expireTime, feeCode, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, tradeDate, clearingSize, cumQty, dayOrderQty, dayCumQty, avgPx, dayAvgPx, pendingStatus, multilegReportingType, secondaryExecId, frequentTraderId, custOrderHandlingInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in CFE FIX. Unique ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe. A leading tilde (~) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by CFE and could be received as a result of a system-generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Sent to the OCC in the Order ID field. Note: CFE only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived GTC and GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to ExecID (17) in CFE FIX. Sent to the OCC in the Trade ID field. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be represented on ODROP and FIXDROP ports as base 36 ASCII. Example conversion: Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
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
     * Corresponds to ContraBroker (375) in CFE FIX. Value always set to “CFE”
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
     * Corresponds to Side (54) in CFE FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Corresponds to OrderQty (38) in CFE FIX. Order quantity. System limit is 999,999 contracts.
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
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
     * Fee Code
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
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
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Cti Code
     *
     * @return the CtiCode field
     */
    public CtiCodeField ctiCode() {
        return ctiCode;
    }

    /**
     * Manual Order Indicator
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Oeoid
     *
     * @return the Oeoid field
     */
    public OeoidField oeoid() {
        return oeoid;
    }

    /**
     * Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Clearing Size
     *
     * @return the ClearingSize field
     */
    public ClearingSizeField clearingSize() {
        return clearingSize;
    }

    /**
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Day Order Qty
     *
     * @return the DayOrderQty field
     */
    public DayOrderQtyField dayOrderQty() {
        return dayOrderQty;
    }

    /**
     * Day Cum Qty
     *
     * @return the DayCumQty field
     */
    public DayCumQtyField dayCumQty() {
        return dayCumQty;
    }

    /**
     * Avg Px
     *
     * @return the AvgPx field
     */
    public AvgPxField avgPx() {
        return avgPx;
    }

    /**
     * Day Avg Px
     *
     * @return the DayAvgPx field
     */
    public DayAvgPxField dayAvgPx() {
        return dayAvgPx;
    }

    /**
     * Pending Status
     *
     * @return the PendingStatus field
     */
    public PendingStatusField pendingStatus() {
        return pendingStatus;
    }

    /**
     * Multileg Reporting Type
     *
     * @return the MultilegReportingType field
     */
    public MultilegReportingTypeField multilegReportingType() {
        return multilegReportingType;
    }

    /**
     * Secondary Exec Id
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
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
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionReturnBitfield2Present() && orderExecutionReturnBitfield2.orderExecutionReturnBitfield2Symbol());
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderExecutionReturnBitfield4Present() && orderExecutionReturnBitfield4.orderExecutionReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderExecutionReturnBitfield5Present() && orderExecutionReturnBitfield5.orderExecutionReturnBitfield5ExpireTime());
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
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionReturnBitfield9Present() && orderExecutionReturnBitfield9.orderExecutionReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the TradeDate put it on the wire.
     *
     * <p>Decode reads the TradeDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeDate is on the wire
     */
    public boolean tradeDatePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12TradeDate());
    }

    /**
     * Returns whether the fields before the ClearingSize put it on the wire.
     *
     * <p>Decode reads the ClearingSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingSize is on the wire
     */
    public boolean clearingSizePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderExecutionReturnBitfield12Present() && orderExecutionReturnBitfield12.orderExecutionReturnBitfield12ClearingSize());
    }

    /**
     * Returns whether the fields before the CumQty put it on the wire.
     *
     * <p>Decode reads the CumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CumQty is on the wire
     */
    public boolean cumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13CumQty());
    }

    /**
     * Returns whether the fields before the DayOrderQty put it on the wire.
     *
     * <p>Decode reads the DayOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayOrderQty is on the wire
     */
    public boolean dayOrderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayOrderQty());
    }

    /**
     * Returns whether the fields before the DayCumQty put it on the wire.
     *
     * <p>Decode reads the DayCumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayCumQty is on the wire
     */
    public boolean dayCumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayCumQty());
    }

    /**
     * Returns whether the fields before the AvgPx put it on the wire.
     *
     * <p>Decode reads the AvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AvgPx is on the wire
     */
    public boolean avgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13AvgPx());
    }

    /**
     * Returns whether the fields before the DayAvgPx put it on the wire.
     *
     * <p>Decode reads the DayAvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayAvgPx is on the wire
     */
    public boolean dayAvgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13DayAvgPx());
    }

    /**
     * Returns whether the fields before the PendingStatus put it on the wire.
     *
     * <p>Decode reads the PendingStatus where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PendingStatus is on the wire
     */
    public boolean pendingStatusPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13PendingStatus());
    }

    /**
     * Returns whether the fields before the MultilegReportingType put it on the wire.
     *
     * <p>Decode reads the MultilegReportingType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultilegReportingType is on the wire
     */
    public boolean multilegReportingTypePresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderExecutionReturnBitfield13Present() && orderExecutionReturnBitfield13.orderExecutionReturnBitfield13MultilegReportingType());
    }

    /**
     * Returns whether the fields before the SecondaryExecId put it on the wire.
     *
     * <p>Decode reads the SecondaryExecId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryExecId is on the wire
     */
    public boolean secondaryExecIdPresent() {
        return (numberOfReturnBitfields.value() >= 14L) && (orderExecutionReturnBitfield14Present() && orderExecutionReturnBitfield14.orderExecutionReturnBitfield14SecondaryExecId());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderExecutionReturnBitfield16Present() && orderExecutionReturnBitfield16.orderExecutionReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderExecutionReturnBitfield17Present() && orderExecutionReturnBitfield17.orderExecutionReturnBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != orderExecutionReturnBitfield1 || orderExecutionReturnBitfield1Present()) && (field != orderExecutionReturnBitfield2 || orderExecutionReturnBitfield2Present()) && (field != orderExecutionReturnBitfield3 || orderExecutionReturnBitfield3Present()) && (field != orderExecutionReturnBitfield4 || orderExecutionReturnBitfield4Present()) && (field != orderExecutionReturnBitfield5 || orderExecutionReturnBitfield5Present()) && (field != orderExecutionReturnBitfield6 || orderExecutionReturnBitfield6Present()) && (field != orderExecutionReturnBitfield7 || orderExecutionReturnBitfield7Present()) && (field != orderExecutionReturnBitfield8 || orderExecutionReturnBitfield8Present()) && (field != orderExecutionReturnBitfield9 || orderExecutionReturnBitfield9Present()) && (field != orderExecutionReturnBitfield10 || orderExecutionReturnBitfield10Present()) && (field != orderExecutionReturnBitfield11 || orderExecutionReturnBitfield11Present()) && (field != orderExecutionReturnBitfield12 || orderExecutionReturnBitfield12Present()) && (field != orderExecutionReturnBitfield13 || orderExecutionReturnBitfield13Present()) && (field != orderExecutionReturnBitfield14 || orderExecutionReturnBitfield14Present()) && (field != orderExecutionReturnBitfield15 || orderExecutionReturnBitfield15Present()) && (field != orderExecutionReturnBitfield16 || orderExecutionReturnBitfield16Present()) && (field != orderExecutionReturnBitfield17 || orderExecutionReturnBitfield17Present()) && (field != orderExecutionReturnBitfield18 || orderExecutionReturnBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != expireTime || expireTimePresent()) && (field != feeCode || feeCodePresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != tradeDate || tradeDatePresent()) && (field != clearingSize || clearingSizePresent()) && (field != cumQty || cumQtyPresent()) && (field != dayOrderQty || dayOrderQtyPresent()) && (field != dayCumQty || dayCumQtyPresent()) && (field != avgPx || avgPxPresent()) && (field != dayAvgPx || dayAvgPxPresent()) && (field != pendingStatus || pendingStatusPresent()) && (field != multilegReportingType || multilegReportingTypePresent()) && (field != secondaryExecId || secondaryExecIdPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderExecutionReturnBitfield1Present() ? OrderExecutionReturnBitfield1Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield2Present() ? OrderExecutionReturnBitfield2Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield3Present() ? OrderExecutionReturnBitfield3Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield4Present() ? OrderExecutionReturnBitfield4Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield5Present() ? OrderExecutionReturnBitfield5Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield6Present() ? OrderExecutionReturnBitfield6Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield7Present() ? OrderExecutionReturnBitfield7Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield8Present() ? OrderExecutionReturnBitfield8Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield9Present() ? OrderExecutionReturnBitfield9Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield10Present() ? OrderExecutionReturnBitfield10Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield11Present() ? OrderExecutionReturnBitfield11Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield12Present() ? OrderExecutionReturnBitfield12Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield13Present() ? OrderExecutionReturnBitfield13Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield14Present() ? OrderExecutionReturnBitfield14Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield15Present() ? OrderExecutionReturnBitfield15Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield16Present() ? OrderExecutionReturnBitfield16Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield17Present() ? OrderExecutionReturnBitfield17Field.BYTE_LENGTH : 0) + (orderExecutionReturnBitfield18Present() ? OrderExecutionReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (tradeDatePresent() ? TradeDateField.BYTE_LENGTH : 0) + (clearingSizePresent() ? ClearingSizeField.BYTE_LENGTH : 0) + (cumQtyPresent() ? CumQtyField.BYTE_LENGTH : 0) + (dayOrderQtyPresent() ? DayOrderQtyField.BYTE_LENGTH : 0) + (dayCumQtyPresent() ? DayCumQtyField.BYTE_LENGTH : 0) + (avgPxPresent() ? AvgPxField.BYTE_LENGTH : 0) + (dayAvgPxPresent() ? DayAvgPxField.BYTE_LENGTH : 0) + (pendingStatusPresent() ? PendingStatusField.BYTE_LENGTH : 0) + (multilegReportingTypePresent() ? MultilegReportingTypeField.BYTE_LENGTH : 0) + (secondaryExecIdPresent() ? SecondaryExecIdField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (sidePresent()) {
            cursor += 1;
        }
        if (pricePresent()) {
            cursor += 8;
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
        if (symbolAlphanumericPresent()) {
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
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (maturityDatePresent()) {
            cursor += 4;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (feeCodePresent()) {
            cursor += 2;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (cmtaNumberPresent()) {
            cursor += 4;
        }
        if (ctiCodePresent()) {
            cursor += 1;
        }
        if (manualOrderIndicatorPresent()) {
            cursor += 1;
        }
        if (oeoidPresent()) {
            cursor += 18;
        }
        if (tradeDatePresent()) {
            cursor += 4;
        }
        if (clearingSizePresent()) {
            cursor += 4;
        }
        if (cumQtyPresent()) {
            cursor += 4;
        }
        if (dayOrderQtyPresent()) {
            cursor += 4;
        }
        if (dayCumQtyPresent()) {
            cursor += 4;
        }
        if (avgPxPresent()) {
            cursor += 8;
        }
        if (dayAvgPxPresent()) {
            cursor += 8;
        }
        if (pendingStatusPresent()) {
            cursor += 1;
        }
        if (multilegReportingTypePresent()) {
            cursor += 1;
        }
        if (secondaryExecIdPresent()) {
            cursor += 8;
        }
        if (frequentTraderIdPresent()) {
            cursor += 6;
        }
        if (custOrderHandlingInstPresent()) {
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
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
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
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
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
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
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
        if (feeCodePresent()) {
            if (end - cursor < FeeCodeField.BYTE_LENGTH || !feeCode.parse(data, cursor)) {
                return false;
            }
            cursor += FeeCodeField.BYTE_LENGTH;
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
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ctiCodePresent()) {
            if (end - cursor < CtiCodeField.BYTE_LENGTH || !ctiCode.parse(data, cursor)) {
                return false;
            }
            cursor += CtiCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (manualOrderIndicatorPresent()) {
            if (end - cursor < ManualOrderIndicatorField.BYTE_LENGTH || !manualOrderIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (oeoidPresent()) {
            if (end - cursor < OeoidField.BYTE_LENGTH || !oeoid.parse(data, cursor)) {
                return false;
            }
            cursor += OeoidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeDatePresent()) {
            if (end - cursor < TradeDateField.BYTE_LENGTH || !tradeDate.parse(data, cursor)) {
                return false;
            }
            cursor += TradeDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingSizePresent()) {
            if (end - cursor < ClearingSizeField.BYTE_LENGTH || !clearingSize.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cumQtyPresent()) {
            if (end - cursor < CumQtyField.BYTE_LENGTH || !cumQty.parse(data, cursor)) {
                return false;
            }
            cursor += CumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayOrderQtyPresent()) {
            if (end - cursor < DayOrderQtyField.BYTE_LENGTH || !dayOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayCumQtyPresent()) {
            if (end - cursor < DayCumQtyField.BYTE_LENGTH || !dayCumQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayCumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (avgPxPresent()) {
            if (end - cursor < AvgPxField.BYTE_LENGTH || !avgPx.parse(data, cursor)) {
                return false;
            }
            cursor += AvgPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayAvgPxPresent()) {
            if (end - cursor < DayAvgPxField.BYTE_LENGTH || !dayAvgPx.parse(data, cursor)) {
                return false;
            }
            cursor += DayAvgPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pendingStatusPresent()) {
            if (end - cursor < PendingStatusField.BYTE_LENGTH || !pendingStatus.parse(data, cursor)) {
                return false;
            }
            cursor += PendingStatusField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (multilegReportingTypePresent()) {
            if (end - cursor < MultilegReportingTypeField.BYTE_LENGTH || !multilegReportingType.parse(data, cursor)) {
                return false;
            }
            cursor += MultilegReportingTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryExecIdPresent()) {
            if (end - cursor < SecondaryExecIdField.BYTE_LENGTH || !secondaryExecId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryExecIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (custOrderHandlingInstPresent()) {
            if (end - cursor < CustOrderHandlingInstField.BYTE_LENGTH || !custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
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
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
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
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
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
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (ctiCodePresent() != ctiCode.hasValue()) {
            throw new IllegalStateException(ctiCode.hasValue() ? "ctiCode holds a value the fields before it leave off the wire" : "ctiCode holds no value, though the fields before it put it on the wire");
        }
        if (manualOrderIndicatorPresent() != manualOrderIndicator.hasValue()) {
            throw new IllegalStateException(manualOrderIndicator.hasValue() ? "manualOrderIndicator holds a value the fields before it leave off the wire" : "manualOrderIndicator holds no value, though the fields before it put it on the wire");
        }
        if (oeoidPresent() != oeoid.hasValue()) {
            throw new IllegalStateException(oeoid.hasValue() ? "oeoid holds a value the fields before it leave off the wire" : "oeoid holds no value, though the fields before it put it on the wire");
        }
        if (tradeDatePresent() != tradeDate.hasValue()) {
            throw new IllegalStateException(tradeDate.hasValue() ? "tradeDate holds a value the fields before it leave off the wire" : "tradeDate holds no value, though the fields before it put it on the wire");
        }
        if (clearingSizePresent() != clearingSize.hasValue()) {
            throw new IllegalStateException(clearingSize.hasValue() ? "clearingSize holds a value the fields before it leave off the wire" : "clearingSize holds no value, though the fields before it put it on the wire");
        }
        if (cumQtyPresent() != cumQty.hasValue()) {
            throw new IllegalStateException(cumQty.hasValue() ? "cumQty holds a value the fields before it leave off the wire" : "cumQty holds no value, though the fields before it put it on the wire");
        }
        if (dayOrderQtyPresent() != dayOrderQty.hasValue()) {
            throw new IllegalStateException(dayOrderQty.hasValue() ? "dayOrderQty holds a value the fields before it leave off the wire" : "dayOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (dayCumQtyPresent() != dayCumQty.hasValue()) {
            throw new IllegalStateException(dayCumQty.hasValue() ? "dayCumQty holds a value the fields before it leave off the wire" : "dayCumQty holds no value, though the fields before it put it on the wire");
        }
        if (avgPxPresent() != avgPx.hasValue()) {
            throw new IllegalStateException(avgPx.hasValue() ? "avgPx holds a value the fields before it leave off the wire" : "avgPx holds no value, though the fields before it put it on the wire");
        }
        if (dayAvgPxPresent() != dayAvgPx.hasValue()) {
            throw new IllegalStateException(dayAvgPx.hasValue() ? "dayAvgPx holds a value the fields before it leave off the wire" : "dayAvgPx holds no value, though the fields before it put it on the wire");
        }
        if (pendingStatusPresent() != pendingStatus.hasValue()) {
            throw new IllegalStateException(pendingStatus.hasValue() ? "pendingStatus holds a value the fields before it leave off the wire" : "pendingStatus holds no value, though the fields before it put it on the wire");
        }
        if (multilegReportingTypePresent() != multilegReportingType.hasValue()) {
            throw new IllegalStateException(multilegReportingType.hasValue() ? "multilegReportingType holds a value the fields before it leave off the wire" : "multilegReportingType holds no value, though the fields before it put it on the wire");
        }
        if (secondaryExecIdPresent() != secondaryExecId.hasValue()) {
            throw new IllegalStateException(secondaryExecId.hasValue() ? "secondaryExecId holds a value the fields before it leave off the wire" : "secondaryExecId holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
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
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
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
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
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
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (ctiCodePresent()) {
            cursor = ctiCode.encode(data, cursor);
        }
        if (manualOrderIndicatorPresent()) {
            cursor = manualOrderIndicator.encode(data, cursor);
        }
        if (oeoidPresent()) {
            cursor = oeoid.encode(data, cursor);
        }
        if (tradeDatePresent()) {
            cursor = tradeDate.encode(data, cursor);
        }
        if (clearingSizePresent()) {
            cursor = clearingSize.encode(data, cursor);
        }
        if (cumQtyPresent()) {
            cursor = cumQty.encode(data, cursor);
        }
        if (dayOrderQtyPresent()) {
            cursor = dayOrderQty.encode(data, cursor);
        }
        if (dayCumQtyPresent()) {
            cursor = dayCumQty.encode(data, cursor);
        }
        if (avgPxPresent()) {
            cursor = avgPx.encode(data, cursor);
        }
        if (dayAvgPxPresent()) {
            cursor = dayAvgPx.encode(data, cursor);
        }
        if (pendingStatusPresent()) {
            cursor = pendingStatus.encode(data, cursor);
        }
        if (multilegReportingTypePresent()) {
            cursor = multilegReportingType.encode(data, cursor);
        }
        if (secondaryExecIdPresent()) {
            cursor = secondaryExecId.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
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
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OpenClose" -> Optional.of(openClose);
            case "ExpireTime" -> Optional.of(expireTime);
            case "FeeCode" -> Optional.of(feeCode);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ClearingSize" -> Optional.of(clearingSize);
            case "CumQty" -> Optional.of(cumQty);
            case "DayOrderQty" -> Optional.of(dayOrderQty);
            case "DayCumQty" -> Optional.of(dayCumQty);
            case "AvgPx" -> Optional.of(avgPx);
            case "DayAvgPx" -> Optional.of(dayAvgPx);
            case "PendingStatus" -> Optional.of(pendingStatus);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
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
