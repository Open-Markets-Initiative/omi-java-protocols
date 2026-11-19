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
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayAvgPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayCumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.DayOrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderAcknowledgmentReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SubLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

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
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in CFE FIX. Unique ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe. A leading tilde (~) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by CFE and could be received as a result of a system-generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Sent to the OCC in the Order ID field. Note: CFE only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived GTC and GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in CFE FIX. Order identifier supplied by CFE. This identifier corresponds to the identifiers used in CFE market data products. Sent to the OCC in the Exchange Data field.
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
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderAcknowledgmentReturnBitfield1, orderAcknowledgmentReturnBitfield2, orderAcknowledgmentReturnBitfield3, orderAcknowledgmentReturnBitfield4, orderAcknowledgmentReturnBitfield5, orderAcknowledgmentReturnBitfield6, orderAcknowledgmentReturnBitfield7, orderAcknowledgmentReturnBitfield8, orderAcknowledgmentReturnBitfield9, orderAcknowledgmentReturnBitfield10, orderAcknowledgmentReturnBitfield11, orderAcknowledgmentReturnBitfield12, orderAcknowledgmentReturnBitfield13, orderAcknowledgmentReturnBitfield14, orderAcknowledgmentReturnBitfield15, orderAcknowledgmentReturnBitfield16, orderAcknowledgmentReturnBitfield17, orderAcknowledgmentReturnBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, leavesQty, baseLiquidityIndicator, expireTime, subLiquidityIndicator, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, cumQty, dayOrderQty, dayCumQty, avgPx, dayAvgPx, frequentTraderId, custOrderHandlingInst);

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
     * Corresponds to OrderID (37) in CFE FIX. Order identifier supplied by CFE. This identifier corresponds to the identifiers used in CFE market data products. Sent to the OCC in the Exchange Data field.
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
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentReturnBitfield2Present() && orderAcknowledgmentReturnBitfield2.orderAcknowledgmentReturnBitfield2Symbol());
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentReturnBitfield4Present() && orderAcknowledgmentReturnBitfield4.orderAcknowledgmentReturnBitfield4OpenClose());
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
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentReturnBitfield9Present() && orderAcknowledgmentReturnBitfield9.orderAcknowledgmentReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderAcknowledgmentReturnBitfield12Present() && orderAcknowledgmentReturnBitfield12.orderAcknowledgmentReturnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderAcknowledgmentReturnBitfield12Present() && orderAcknowledgmentReturnBitfield12.orderAcknowledgmentReturnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderAcknowledgmentReturnBitfield12Present() && orderAcknowledgmentReturnBitfield12.orderAcknowledgmentReturnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the CumQty put it on the wire.
     *
     * <p>Decode reads the CumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CumQty is on the wire
     */
    public boolean cumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13CumQty());
    }

    /**
     * Returns whether the fields before the DayOrderQty put it on the wire.
     *
     * <p>Decode reads the DayOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayOrderQty is on the wire
     */
    public boolean dayOrderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13DayOrderQty());
    }

    /**
     * Returns whether the fields before the DayCumQty put it on the wire.
     *
     * <p>Decode reads the DayCumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayCumQty is on the wire
     */
    public boolean dayCumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13DayCumQty());
    }

    /**
     * Returns whether the fields before the AvgPx put it on the wire.
     *
     * <p>Decode reads the AvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AvgPx is on the wire
     */
    public boolean avgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13AvgPx());
    }

    /**
     * Returns whether the fields before the DayAvgPx put it on the wire.
     *
     * <p>Decode reads the DayAvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayAvgPx is on the wire
     */
    public boolean dayAvgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentReturnBitfield13Present() && orderAcknowledgmentReturnBitfield13.orderAcknowledgmentReturnBitfield13DayAvgPx());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderAcknowledgmentReturnBitfield16Present() && orderAcknowledgmentReturnBitfield16.orderAcknowledgmentReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderAcknowledgmentReturnBitfield17Present() && orderAcknowledgmentReturnBitfield17.orderAcknowledgmentReturnBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != orderAcknowledgmentReturnBitfield1 || orderAcknowledgmentReturnBitfield1Present()) && (field != orderAcknowledgmentReturnBitfield2 || orderAcknowledgmentReturnBitfield2Present()) && (field != orderAcknowledgmentReturnBitfield3 || orderAcknowledgmentReturnBitfield3Present()) && (field != orderAcknowledgmentReturnBitfield4 || orderAcknowledgmentReturnBitfield4Present()) && (field != orderAcknowledgmentReturnBitfield5 || orderAcknowledgmentReturnBitfield5Present()) && (field != orderAcknowledgmentReturnBitfield6 || orderAcknowledgmentReturnBitfield6Present()) && (field != orderAcknowledgmentReturnBitfield7 || orderAcknowledgmentReturnBitfield7Present()) && (field != orderAcknowledgmentReturnBitfield8 || orderAcknowledgmentReturnBitfield8Present()) && (field != orderAcknowledgmentReturnBitfield9 || orderAcknowledgmentReturnBitfield9Present()) && (field != orderAcknowledgmentReturnBitfield10 || orderAcknowledgmentReturnBitfield10Present()) && (field != orderAcknowledgmentReturnBitfield11 || orderAcknowledgmentReturnBitfield11Present()) && (field != orderAcknowledgmentReturnBitfield12 || orderAcknowledgmentReturnBitfield12Present()) && (field != orderAcknowledgmentReturnBitfield13 || orderAcknowledgmentReturnBitfield13Present()) && (field != orderAcknowledgmentReturnBitfield14 || orderAcknowledgmentReturnBitfield14Present()) && (field != orderAcknowledgmentReturnBitfield15 || orderAcknowledgmentReturnBitfield15Present()) && (field != orderAcknowledgmentReturnBitfield16 || orderAcknowledgmentReturnBitfield16Present()) && (field != orderAcknowledgmentReturnBitfield17 || orderAcknowledgmentReturnBitfield17Present()) && (field != orderAcknowledgmentReturnBitfield18 || orderAcknowledgmentReturnBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != leavesQty || leavesQtyPresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != cumQty || cumQtyPresent()) && (field != dayOrderQty || dayOrderQtyPresent()) && (field != dayCumQty || dayCumQtyPresent()) && (field != avgPx || avgPxPresent()) && (field != dayAvgPx || dayAvgPxPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderAcknowledgmentReturnBitfield1Present() ? OrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield2Present() ? OrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield3Present() ? OrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield4Present() ? OrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield5Present() ? OrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield6Present() ? OrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield7Present() ? OrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield8Present() ? OrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield9Present() ? OrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield10Present() ? OrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield11Present() ? OrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield12Present() ? OrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield13Present() ? OrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield14Present() ? OrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield15Present() ? OrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield16Present() ? OrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield17Present() ? OrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH : 0) + (orderAcknowledgmentReturnBitfield18Present() ? OrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (cumQtyPresent() ? CumQtyField.BYTE_LENGTH : 0) + (dayOrderQtyPresent() ? DayOrderQtyField.BYTE_LENGTH : 0) + (dayCumQtyPresent() ? DayCumQtyField.BYTE_LENGTH : 0) + (avgPxPresent() ? AvgPxField.BYTE_LENGTH : 0) + (dayAvgPxPresent() ? DayAvgPxField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (leavesQtyPresent()) {
            cursor += 4;
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (subLiquidityIndicatorPresent()) {
            cursor += 1;
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
        if (leavesQtyPresent()) {
            if (end - cursor < LeavesQtyField.BYTE_LENGTH || !leavesQty.parse(data, cursor)) {
                return false;
            }
            cursor += LeavesQtyField.BYTE_LENGTH;
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
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
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
        if (leavesQtyPresent() != leavesQty.hasValue()) {
            throw new IllegalStateException(leavesQty.hasValue() ? "leavesQty holds a value the fields before it leave off the wire" : "leavesQty holds no value, though the fields before it put it on the wire");
        }
        if (baseLiquidityIndicatorPresent() != baseLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(baseLiquidityIndicator.hasValue() ? "baseLiquidityIndicator holds a value the fields before it leave off the wire" : "baseLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
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
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
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
        if (leavesQtyPresent()) {
            cursor = leavesQty.encode(data, cursor);
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor = baseLiquidityIndicator.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
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
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "CumQty" -> Optional.of(cumQty);
            case "DayOrderQty" -> Optional.of(dayOrderQty);
            case "DayCumQty" -> Optional.of(dayCumQty);
            case "AvgPx" -> Optional.of(avgPx);
            case "DayAvgPx" -> Optional.of(dayAvgPx);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
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
