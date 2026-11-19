package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.BaseLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
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
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderModifiedReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrigClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

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
     * Corresponds to OrigClOrdID (41) in CFE FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderModifiedReturnBitfield1, orderModifiedReturnBitfield2, orderModifiedReturnBitfield3, orderModifiedReturnBitfield4, orderModifiedReturnBitfield5, orderModifiedReturnBitfield6, orderModifiedReturnBitfield7, orderModifiedReturnBitfield8, orderModifiedReturnBitfield9, orderModifiedReturnBitfield10, orderModifiedReturnBitfield11, orderModifiedReturnBitfield12, orderModifiedReturnBitfield13, orderModifiedReturnBitfield14, orderModifiedReturnBitfield15, orderModifiedReturnBitfield16, orderModifiedReturnBitfield17, orderModifiedReturnBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, origClOrdId, leavesQty, baseLiquidityIndicator, expireTime, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, frequentTraderId, custOrderHandlingInst);

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
     * Corresponds to OrigClOrdID (41) in CFE FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
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
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderModifiedReturnBitfield2Present() && orderModifiedReturnBitfield2.orderModifiedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderModifiedReturnBitfield2Present() && orderModifiedReturnBitfield2.orderModifiedReturnBitfield2Capacity());
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderModifiedReturnBitfield4Present() && orderModifiedReturnBitfield4.orderModifiedReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderModifiedReturnBitfield4Present() && orderModifiedReturnBitfield4.orderModifiedReturnBitfield4OpenClose());
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
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderModifiedReturnBitfield9Present() && orderModifiedReturnBitfield9.orderModifiedReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderModifiedReturnBitfield12Present() && orderModifiedReturnBitfield12.orderModifiedReturnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderModifiedReturnBitfield12Present() && orderModifiedReturnBitfield12.orderModifiedReturnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderModifiedReturnBitfield12Present() && orderModifiedReturnBitfield12.orderModifiedReturnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderModifiedReturnBitfield16Present() && orderModifiedReturnBitfield16.orderModifiedReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderModifiedReturnBitfield17Present() && orderModifiedReturnBitfield17.orderModifiedReturnBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != orderModifiedReturnBitfield1 || orderModifiedReturnBitfield1Present()) && (field != orderModifiedReturnBitfield2 || orderModifiedReturnBitfield2Present()) && (field != orderModifiedReturnBitfield3 || orderModifiedReturnBitfield3Present()) && (field != orderModifiedReturnBitfield4 || orderModifiedReturnBitfield4Present()) && (field != orderModifiedReturnBitfield5 || orderModifiedReturnBitfield5Present()) && (field != orderModifiedReturnBitfield6 || orderModifiedReturnBitfield6Present()) && (field != orderModifiedReturnBitfield7 || orderModifiedReturnBitfield7Present()) && (field != orderModifiedReturnBitfield8 || orderModifiedReturnBitfield8Present()) && (field != orderModifiedReturnBitfield9 || orderModifiedReturnBitfield9Present()) && (field != orderModifiedReturnBitfield10 || orderModifiedReturnBitfield10Present()) && (field != orderModifiedReturnBitfield11 || orderModifiedReturnBitfield11Present()) && (field != orderModifiedReturnBitfield12 || orderModifiedReturnBitfield12Present()) && (field != orderModifiedReturnBitfield13 || orderModifiedReturnBitfield13Present()) && (field != orderModifiedReturnBitfield14 || orderModifiedReturnBitfield14Present()) && (field != orderModifiedReturnBitfield15 || orderModifiedReturnBitfield15Present()) && (field != orderModifiedReturnBitfield16 || orderModifiedReturnBitfield16Present()) && (field != orderModifiedReturnBitfield17 || orderModifiedReturnBitfield17Present()) && (field != orderModifiedReturnBitfield18 || orderModifiedReturnBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderModifiedReturnBitfield1Present() ? OrderModifiedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield2Present() ? OrderModifiedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield3Present() ? OrderModifiedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield4Present() ? OrderModifiedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield5Present() ? OrderModifiedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield6Present() ? OrderModifiedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield7Present() ? OrderModifiedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield8Present() ? OrderModifiedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield9Present() ? OrderModifiedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield10Present() ? OrderModifiedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield11Present() ? OrderModifiedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield12Present() ? OrderModifiedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield13Present() ? OrderModifiedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield14Present() ? OrderModifiedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield15Present() ? OrderModifiedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield16Present() ? OrderModifiedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield17Present() ? OrderModifiedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderModifiedReturnBitfield18Present() ? OrderModifiedReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (origClOrdIdPresent()) {
            cursor += 20;
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
        if (origClOrdIdPresent() != origClOrdId.hasValue()) {
            throw new IllegalStateException(origClOrdId.hasValue() ? "origClOrdId holds a value the fields before it leave off the wire" : "origClOrdId holds no value, though the fields before it put it on the wire");
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
        if (origClOrdIdPresent()) {
            cursor = origClOrdId.encode(data, cursor);
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
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
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
