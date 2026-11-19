package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CancelReasonField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastSharesField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderCancelledReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrigClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SecondaryOrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

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
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in CFE FIX. Unique ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe. A leading tilde (~) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by CFE and could be received as a result of a system-generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Sent to the OCC in the Order ID field. Note: CFE only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived GTC and GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for the order cancellation. See ‘Section 8 – Reason Codes’ for a list of possible reasons.
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
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, cancelReason, numberOfReturnBitfields, orderCancelledReturnBitfield1, orderCancelledReturnBitfield2, orderCancelledReturnBitfield3, orderCancelledReturnBitfield4, orderCancelledReturnBitfield5, orderCancelledReturnBitfield6, orderCancelledReturnBitfield7, orderCancelledReturnBitfield8, orderCancelledReturnBitfield9, orderCancelledReturnBitfield10, orderCancelledReturnBitfield11, orderCancelledReturnBitfield12, orderCancelledReturnBitfield13, orderCancelledReturnBitfield14, orderCancelledReturnBitfield15, orderCancelledReturnBitfield16, orderCancelledReturnBitfield17, orderCancelledReturnBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, origClOrdId, leavesQty, lastShares, lastPx, expireTime, secondaryOrderId, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, frequentTraderId, custOrderHandlingInst);

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
     * Reason for the order cancellation. See ‘Section 8 – Reason Codes’ for a list of possible reasons.
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
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderCancelledReturnBitfield2Present() && orderCancelledReturnBitfield2.orderCancelledReturnBitfield2Symbol());
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderCancelledReturnBitfield4Present() && orderCancelledReturnBitfield4.orderCancelledReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderCancelledReturnBitfield4Present() && orderCancelledReturnBitfield4.orderCancelledReturnBitfield4OpenClose());
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
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderCancelledReturnBitfield9Present() && orderCancelledReturnBitfield9.orderCancelledReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderCancelledReturnBitfield12Present() && orderCancelledReturnBitfield12.orderCancelledReturnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderCancelledReturnBitfield12Present() && orderCancelledReturnBitfield12.orderCancelledReturnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderCancelledReturnBitfield12Present() && orderCancelledReturnBitfield12.orderCancelledReturnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderCancelledReturnBitfield16Present() && orderCancelledReturnBitfield16.orderCancelledReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderCancelledReturnBitfield17Present() && orderCancelledReturnBitfield17.orderCancelledReturnBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != orderCancelledReturnBitfield1 || orderCancelledReturnBitfield1Present()) && (field != orderCancelledReturnBitfield2 || orderCancelledReturnBitfield2Present()) && (field != orderCancelledReturnBitfield3 || orderCancelledReturnBitfield3Present()) && (field != orderCancelledReturnBitfield4 || orderCancelledReturnBitfield4Present()) && (field != orderCancelledReturnBitfield5 || orderCancelledReturnBitfield5Present()) && (field != orderCancelledReturnBitfield6 || orderCancelledReturnBitfield6Present()) && (field != orderCancelledReturnBitfield7 || orderCancelledReturnBitfield7Present()) && (field != orderCancelledReturnBitfield8 || orderCancelledReturnBitfield8Present()) && (field != orderCancelledReturnBitfield9 || orderCancelledReturnBitfield9Present()) && (field != orderCancelledReturnBitfield10 || orderCancelledReturnBitfield10Present()) && (field != orderCancelledReturnBitfield11 || orderCancelledReturnBitfield11Present()) && (field != orderCancelledReturnBitfield12 || orderCancelledReturnBitfield12Present()) && (field != orderCancelledReturnBitfield13 || orderCancelledReturnBitfield13Present()) && (field != orderCancelledReturnBitfield14 || orderCancelledReturnBitfield14Present()) && (field != orderCancelledReturnBitfield15 || orderCancelledReturnBitfield15Present()) && (field != orderCancelledReturnBitfield16 || orderCancelledReturnBitfield16Present()) && (field != orderCancelledReturnBitfield17 || orderCancelledReturnBitfield17Present()) && (field != orderCancelledReturnBitfield18 || orderCancelledReturnBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderCancelledReturnBitfield1Present() ? OrderCancelledReturnBitfield1Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield2Present() ? OrderCancelledReturnBitfield2Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield3Present() ? OrderCancelledReturnBitfield3Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield4Present() ? OrderCancelledReturnBitfield4Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield5Present() ? OrderCancelledReturnBitfield5Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield6Present() ? OrderCancelledReturnBitfield6Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield7Present() ? OrderCancelledReturnBitfield7Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield8Present() ? OrderCancelledReturnBitfield8Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield9Present() ? OrderCancelledReturnBitfield9Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield10Present() ? OrderCancelledReturnBitfield10Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield11Present() ? OrderCancelledReturnBitfield11Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield12Present() ? OrderCancelledReturnBitfield12Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield13Present() ? OrderCancelledReturnBitfield13Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield14Present() ? OrderCancelledReturnBitfield14Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield15Present() ? OrderCancelledReturnBitfield15Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield16Present() ? OrderCancelledReturnBitfield16Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield17Present() ? OrderCancelledReturnBitfield17Field.BYTE_LENGTH : 0) + (orderCancelledReturnBitfield18Present() ? OrderCancelledReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (lastSharesPresent()) {
            cursor += 4;
        }
        if (lastPxPresent()) {
            cursor += 8;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (secondaryOrderIdPresent()) {
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
        if (lastSharesPresent() != lastShares.hasValue()) {
            throw new IllegalStateException(lastShares.hasValue() ? "lastShares holds a value the fields before it leave off the wire" : "lastShares holds no value, though the fields before it put it on the wire");
        }
        if (lastPxPresent() != lastPx.hasValue()) {
            throw new IllegalStateException(lastPx.hasValue() ? "lastPx holds a value the fields before it leave off the wire" : "lastPx holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
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
        if (lastSharesPresent()) {
            cursor = lastShares.encode(data, cursor);
        }
        if (lastPxPresent()) {
            cursor = lastPx.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
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
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
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
