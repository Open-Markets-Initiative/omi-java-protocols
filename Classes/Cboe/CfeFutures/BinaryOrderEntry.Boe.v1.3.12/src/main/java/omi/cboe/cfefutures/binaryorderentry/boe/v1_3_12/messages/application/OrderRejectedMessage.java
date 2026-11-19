package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectReasonField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrderRejectedReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TextField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

/**
 * Represents the OrderRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Rejected Message.</p>
 */
public final class OrderRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Rejected Message";

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in CFE FIX. Unique ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe. A leading tilde (~) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by CFE and could be received as a result of a system-generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Sent to the OCC in the Order ID field. Note: CFE only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived GTC and GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for an order rejection. See ‘Section 8 – Reason Codes’ for a list of possible reasons.
     */
    private final OrderRejectReasonField orderRejectReason = new OrderRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderRejected byte 1.
     */
    private final OrderRejectedReturnBitfield1Field orderRejectedReturnBitfield1 = new OrderRejectedReturnBitfield1Field();

    /**
     * BitSet OrderRejected byte 2.
     */
    private final OrderRejectedReturnBitfield2Field orderRejectedReturnBitfield2 = new OrderRejectedReturnBitfield2Field();

    /**
     * BitSet OrderRejected byte 3.
     */
    private final OrderRejectedReturnBitfield3Field orderRejectedReturnBitfield3 = new OrderRejectedReturnBitfield3Field();

    /**
     * BitSet OrderRejected byte 4.
     */
    private final OrderRejectedReturnBitfield4Field orderRejectedReturnBitfield4 = new OrderRejectedReturnBitfield4Field();

    /**
     * BitSet OrderRejected byte 5.
     */
    private final OrderRejectedReturnBitfield5Field orderRejectedReturnBitfield5 = new OrderRejectedReturnBitfield5Field();

    /**
     * BitSet OrderRejected byte 6.
     */
    private final OrderRejectedReturnBitfield6Field orderRejectedReturnBitfield6 = new OrderRejectedReturnBitfield6Field();

    /**
     * BitSet OrderRejected byte 7.
     */
    private final OrderRejectedReturnBitfield7Field orderRejectedReturnBitfield7 = new OrderRejectedReturnBitfield7Field();

    /**
     * BitSet OrderRejected byte 8.
     */
    private final OrderRejectedReturnBitfield8Field orderRejectedReturnBitfield8 = new OrderRejectedReturnBitfield8Field();

    /**
     * BitSet OrderRejected byte 9.
     */
    private final OrderRejectedReturnBitfield9Field orderRejectedReturnBitfield9 = new OrderRejectedReturnBitfield9Field();

    /**
     * BitSet OrderRejected byte 10.
     */
    private final OrderRejectedReturnBitfield10Field orderRejectedReturnBitfield10 = new OrderRejectedReturnBitfield10Field();

    /**
     * BitSet OrderRejected byte 11.
     */
    private final OrderRejectedReturnBitfield11Field orderRejectedReturnBitfield11 = new OrderRejectedReturnBitfield11Field();

    /**
     * BitSet OrderRejected byte 12.
     */
    private final OrderRejectedReturnBitfield12Field orderRejectedReturnBitfield12 = new OrderRejectedReturnBitfield12Field();

    /**
     * BitSet OrderRejected byte 13.
     */
    private final OrderRejectedReturnBitfield13Field orderRejectedReturnBitfield13 = new OrderRejectedReturnBitfield13Field();

    /**
     * BitSet OrderRejected byte 14.
     */
    private final OrderRejectedReturnBitfield14Field orderRejectedReturnBitfield14 = new OrderRejectedReturnBitfield14Field();

    /**
     * BitSet OrderRejected byte 15.
     */
    private final OrderRejectedReturnBitfield15Field orderRejectedReturnBitfield15 = new OrderRejectedReturnBitfield15Field();

    /**
     * BitSet OrderRejected byte 16.
     */
    private final OrderRejectedReturnBitfield16Field orderRejectedReturnBitfield16 = new OrderRejectedReturnBitfield16Field();

    /**
     * BitSet OrderRejected byte 17.
     */
    private final OrderRejectedReturnBitfield17Field orderRejectedReturnBitfield17 = new OrderRejectedReturnBitfield17Field();

    /**
     * BitSet OrderRejected byte 18.
     */
    private final OrderRejectedReturnBitfield18Field orderRejectedReturnBitfield18 = new OrderRejectedReturnBitfield18Field();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderRejectReason, text, numberOfReturnBitfields, orderRejectedReturnBitfield1, orderRejectedReturnBitfield2, orderRejectedReturnBitfield3, orderRejectedReturnBitfield4, orderRejectedReturnBitfield5, orderRejectedReturnBitfield6, orderRejectedReturnBitfield7, orderRejectedReturnBitfield8, orderRejectedReturnBitfield9, orderRejectedReturnBitfield10, orderRejectedReturnBitfield11, orderRejectedReturnBitfield12, orderRejectedReturnBitfield13, orderRejectedReturnBitfield14, orderRejectedReturnBitfield15, orderRejectedReturnBitfield16, orderRejectedReturnBitfield17, orderRejectedReturnBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, frequentTraderId, custOrderHandlingInst);

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
     * Reason for an order rejection. See ‘Section 8 – Reason Codes’ for a list of possible reasons.
     *
     * @return the OrderRejectReason field
     */
    public OrderRejectReasonField orderRejectReason() {
        return orderRejectReason;
    }

    /**
     * Human readable text with more information about the reject reason.
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
     * BitSet OrderRejected byte 1.
     *
     * @return the OrderRejectedReturnBitfield1 field
     */
    public OrderRejectedReturnBitfield1Field orderRejectedReturnBitfield1() {
        return orderRejectedReturnBitfield1;
    }

    /**
     * BitSet OrderRejected byte 2.
     *
     * @return the OrderRejectedReturnBitfield2 field
     */
    public OrderRejectedReturnBitfield2Field orderRejectedReturnBitfield2() {
        return orderRejectedReturnBitfield2;
    }

    /**
     * BitSet OrderRejected byte 3.
     *
     * @return the OrderRejectedReturnBitfield3 field
     */
    public OrderRejectedReturnBitfield3Field orderRejectedReturnBitfield3() {
        return orderRejectedReturnBitfield3;
    }

    /**
     * BitSet OrderRejected byte 4.
     *
     * @return the OrderRejectedReturnBitfield4 field
     */
    public OrderRejectedReturnBitfield4Field orderRejectedReturnBitfield4() {
        return orderRejectedReturnBitfield4;
    }

    /**
     * BitSet OrderRejected byte 5.
     *
     * @return the OrderRejectedReturnBitfield5 field
     */
    public OrderRejectedReturnBitfield5Field orderRejectedReturnBitfield5() {
        return orderRejectedReturnBitfield5;
    }

    /**
     * BitSet OrderRejected byte 6.
     *
     * @return the OrderRejectedReturnBitfield6 field
     */
    public OrderRejectedReturnBitfield6Field orderRejectedReturnBitfield6() {
        return orderRejectedReturnBitfield6;
    }

    /**
     * BitSet OrderRejected byte 7.
     *
     * @return the OrderRejectedReturnBitfield7 field
     */
    public OrderRejectedReturnBitfield7Field orderRejectedReturnBitfield7() {
        return orderRejectedReturnBitfield7;
    }

    /**
     * BitSet OrderRejected byte 8.
     *
     * @return the OrderRejectedReturnBitfield8 field
     */
    public OrderRejectedReturnBitfield8Field orderRejectedReturnBitfield8() {
        return orderRejectedReturnBitfield8;
    }

    /**
     * BitSet OrderRejected byte 9.
     *
     * @return the OrderRejectedReturnBitfield9 field
     */
    public OrderRejectedReturnBitfield9Field orderRejectedReturnBitfield9() {
        return orderRejectedReturnBitfield9;
    }

    /**
     * BitSet OrderRejected byte 10.
     *
     * @return the OrderRejectedReturnBitfield10 field
     */
    public OrderRejectedReturnBitfield10Field orderRejectedReturnBitfield10() {
        return orderRejectedReturnBitfield10;
    }

    /**
     * BitSet OrderRejected byte 11.
     *
     * @return the OrderRejectedReturnBitfield11 field
     */
    public OrderRejectedReturnBitfield11Field orderRejectedReturnBitfield11() {
        return orderRejectedReturnBitfield11;
    }

    /**
     * BitSet OrderRejected byte 12.
     *
     * @return the OrderRejectedReturnBitfield12 field
     */
    public OrderRejectedReturnBitfield12Field orderRejectedReturnBitfield12() {
        return orderRejectedReturnBitfield12;
    }

    /**
     * BitSet OrderRejected byte 13.
     *
     * @return the OrderRejectedReturnBitfield13 field
     */
    public OrderRejectedReturnBitfield13Field orderRejectedReturnBitfield13() {
        return orderRejectedReturnBitfield13;
    }

    /**
     * BitSet OrderRejected byte 14.
     *
     * @return the OrderRejectedReturnBitfield14 field
     */
    public OrderRejectedReturnBitfield14Field orderRejectedReturnBitfield14() {
        return orderRejectedReturnBitfield14;
    }

    /**
     * BitSet OrderRejected byte 15.
     *
     * @return the OrderRejectedReturnBitfield15 field
     */
    public OrderRejectedReturnBitfield15Field orderRejectedReturnBitfield15() {
        return orderRejectedReturnBitfield15;
    }

    /**
     * BitSet OrderRejected byte 16.
     *
     * @return the OrderRejectedReturnBitfield16 field
     */
    public OrderRejectedReturnBitfield16Field orderRejectedReturnBitfield16() {
        return orderRejectedReturnBitfield16;
    }

    /**
     * BitSet OrderRejected byte 17.
     *
     * @return the OrderRejectedReturnBitfield17 field
     */
    public OrderRejectedReturnBitfield17Field orderRejectedReturnBitfield17() {
        return orderRejectedReturnBitfield17;
    }

    /**
     * BitSet OrderRejected byte 18.
     *
     * @return the OrderRejectedReturnBitfield18 field
     */
    public OrderRejectedReturnBitfield18Field orderRejectedReturnBitfield18() {
        return orderRejectedReturnBitfield18;
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
     * Returns whether the fields before the OrderRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield1 is on the wire
     */
    public boolean orderRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield2 is on the wire
     */
    public boolean orderRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield3 is on the wire
     */
    public boolean orderRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield4 is on the wire
     */
    public boolean orderRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield5 is on the wire
     */
    public boolean orderRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield6 is on the wire
     */
    public boolean orderRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield7 is on the wire
     */
    public boolean orderRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield8 is on the wire
     */
    public boolean orderRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield9 is on the wire
     */
    public boolean orderRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield10 is on the wire
     */
    public boolean orderRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield11 is on the wire
     */
    public boolean orderRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield12 is on the wire
     */
    public boolean orderRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield13 is on the wire
     */
    public boolean orderRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield14 is on the wire
     */
    public boolean orderRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield15 is on the wire
     */
    public boolean orderRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield16 is on the wire
     */
    public boolean orderRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield17 is on the wire
     */
    public boolean orderRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedReturnBitfield18 is on the wire
     */
    public boolean orderRejectedReturnBitfield18Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedReturnBitfield1Present() && orderRejectedReturnBitfield1.orderRejectedReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedReturnBitfield2Present() && orderRejectedReturnBitfield2.orderRejectedReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedReturnBitfield3Present() && orderRejectedReturnBitfield3.orderRejectedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderRejectedReturnBitfield4Present() && orderRejectedReturnBitfield4.orderRejectedReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderRejectedReturnBitfield8Present() && orderRejectedReturnBitfield8.orderRejectedReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedReturnBitfield9Present() && orderRejectedReturnBitfield9.orderRejectedReturnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderRejectedReturnBitfield12Present() && orderRejectedReturnBitfield12.orderRejectedReturnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderRejectedReturnBitfield12Present() && orderRejectedReturnBitfield12.orderRejectedReturnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (orderRejectedReturnBitfield12Present() && orderRejectedReturnBitfield12.orderRejectedReturnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (orderRejectedReturnBitfield16Present() && orderRejectedReturnBitfield16.orderRejectedReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderRejectedReturnBitfield17Present() && orderRejectedReturnBitfield17.orderRejectedReturnBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != orderRejectedReturnBitfield1 || orderRejectedReturnBitfield1Present()) && (field != orderRejectedReturnBitfield2 || orderRejectedReturnBitfield2Present()) && (field != orderRejectedReturnBitfield3 || orderRejectedReturnBitfield3Present()) && (field != orderRejectedReturnBitfield4 || orderRejectedReturnBitfield4Present()) && (field != orderRejectedReturnBitfield5 || orderRejectedReturnBitfield5Present()) && (field != orderRejectedReturnBitfield6 || orderRejectedReturnBitfield6Present()) && (field != orderRejectedReturnBitfield7 || orderRejectedReturnBitfield7Present()) && (field != orderRejectedReturnBitfield8 || orderRejectedReturnBitfield8Present()) && (field != orderRejectedReturnBitfield9 || orderRejectedReturnBitfield9Present()) && (field != orderRejectedReturnBitfield10 || orderRejectedReturnBitfield10Present()) && (field != orderRejectedReturnBitfield11 || orderRejectedReturnBitfield11Present()) && (field != orderRejectedReturnBitfield12 || orderRejectedReturnBitfield12Present()) && (field != orderRejectedReturnBitfield13 || orderRejectedReturnBitfield13Present()) && (field != orderRejectedReturnBitfield14 || orderRejectedReturnBitfield14Present()) && (field != orderRejectedReturnBitfield15 || orderRejectedReturnBitfield15Present()) && (field != orderRejectedReturnBitfield16 || orderRejectedReturnBitfield16Present()) && (field != orderRejectedReturnBitfield17 || orderRejectedReturnBitfield17Present()) && (field != orderRejectedReturnBitfield18 || orderRejectedReturnBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRejectedReturnBitfield1Present() ? OrderRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield2Present() ? OrderRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield3Present() ? OrderRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield4Present() ? OrderRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield5Present() ? OrderRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield6Present() ? OrderRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield7Present() ? OrderRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield8Present() ? OrderRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield9Present() ? OrderRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield10Present() ? OrderRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield11Present() ? OrderRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield12Present() ? OrderRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield13Present() ? OrderRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield14Present() ? OrderRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield15Present() ? OrderRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield16Present() ? OrderRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield17Present() ? OrderRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRejectedReturnBitfield18Present() ? OrderRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderRejectedReturnBitfield18Present()) {
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
        if (!orderRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderRejectedReturnBitfield1Present()) {
            if (end - cursor < OrderRejectedReturnBitfield1Field.BYTE_LENGTH || !orderRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield2Present()) {
            if (end - cursor < OrderRejectedReturnBitfield2Field.BYTE_LENGTH || !orderRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield3Present()) {
            if (end - cursor < OrderRejectedReturnBitfield3Field.BYTE_LENGTH || !orderRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield4Present()) {
            if (end - cursor < OrderRejectedReturnBitfield4Field.BYTE_LENGTH || !orderRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield5Present()) {
            if (end - cursor < OrderRejectedReturnBitfield5Field.BYTE_LENGTH || !orderRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield6Present()) {
            if (end - cursor < OrderRejectedReturnBitfield6Field.BYTE_LENGTH || !orderRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield7Present()) {
            if (end - cursor < OrderRejectedReturnBitfield7Field.BYTE_LENGTH || !orderRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield8Present()) {
            if (end - cursor < OrderRejectedReturnBitfield8Field.BYTE_LENGTH || !orderRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield9Present()) {
            if (end - cursor < OrderRejectedReturnBitfield9Field.BYTE_LENGTH || !orderRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield10Present()) {
            if (end - cursor < OrderRejectedReturnBitfield10Field.BYTE_LENGTH || !orderRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield11Present()) {
            if (end - cursor < OrderRejectedReturnBitfield11Field.BYTE_LENGTH || !orderRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield12Present()) {
            if (end - cursor < OrderRejectedReturnBitfield12Field.BYTE_LENGTH || !orderRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield13Present()) {
            if (end - cursor < OrderRejectedReturnBitfield13Field.BYTE_LENGTH || !orderRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield14Present()) {
            if (end - cursor < OrderRejectedReturnBitfield14Field.BYTE_LENGTH || !orderRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield15Present()) {
            if (end - cursor < OrderRejectedReturnBitfield15Field.BYTE_LENGTH || !orderRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield16Present()) {
            if (end - cursor < OrderRejectedReturnBitfield16Field.BYTE_LENGTH || !orderRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield17Present()) {
            if (end - cursor < OrderRejectedReturnBitfield17Field.BYTE_LENGTH || !orderRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedReturnBitfield18Present()) {
            if (end - cursor < OrderRejectedReturnBitfield18Field.BYTE_LENGTH || !orderRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedReturnBitfield18Field.BYTE_LENGTH;
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
        if (orderRejectedReturnBitfield1Present() != orderRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield1.hasValue() ? "orderRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield2Present() != orderRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield2.hasValue() ? "orderRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield3Present() != orderRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield3.hasValue() ? "orderRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield4Present() != orderRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield4.hasValue() ? "orderRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield5Present() != orderRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield5.hasValue() ? "orderRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield6Present() != orderRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield6.hasValue() ? "orderRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield7Present() != orderRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield7.hasValue() ? "orderRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield8Present() != orderRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield8.hasValue() ? "orderRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield9Present() != orderRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield9.hasValue() ? "orderRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield10Present() != orderRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield10.hasValue() ? "orderRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield11Present() != orderRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield11.hasValue() ? "orderRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield12Present() != orderRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield12.hasValue() ? "orderRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield13Present() != orderRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield13.hasValue() ? "orderRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield14Present() != orderRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield14.hasValue() ? "orderRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield15Present() != orderRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield15.hasValue() ? "orderRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield16Present() != orderRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield16.hasValue() ? "orderRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield17Present() != orderRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield17.hasValue() ? "orderRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedReturnBitfield18Present() != orderRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderRejectedReturnBitfield18.hasValue() ? "orderRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "orderRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
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
        cursor = orderRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderRejectedReturnBitfield1Present()) {
            cursor = orderRejectedReturnBitfield1.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield2Present()) {
            cursor = orderRejectedReturnBitfield2.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield3Present()) {
            cursor = orderRejectedReturnBitfield3.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield4Present()) {
            cursor = orderRejectedReturnBitfield4.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield5Present()) {
            cursor = orderRejectedReturnBitfield5.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield6Present()) {
            cursor = orderRejectedReturnBitfield6.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield7Present()) {
            cursor = orderRejectedReturnBitfield7.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield8Present()) {
            cursor = orderRejectedReturnBitfield8.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield9Present()) {
            cursor = orderRejectedReturnBitfield9.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield10Present()) {
            cursor = orderRejectedReturnBitfield10.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield11Present()) {
            cursor = orderRejectedReturnBitfield11.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield12Present()) {
            cursor = orderRejectedReturnBitfield12.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield13Present()) {
            cursor = orderRejectedReturnBitfield13.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield14Present()) {
            cursor = orderRejectedReturnBitfield14.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield15Present()) {
            cursor = orderRejectedReturnBitfield15.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield16Present()) {
            cursor = orderRejectedReturnBitfield16.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield17Present()) {
            cursor = orderRejectedReturnBitfield17.encode(data, cursor);
        }
        if (orderRejectedReturnBitfield18Present()) {
            cursor = orderRejectedReturnBitfield18.encode(data, cursor);
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
            case "OrderRejectReason" -> Optional.of(orderRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderRejectedReturnBitfield1" -> Optional.of(orderRejectedReturnBitfield1);
            case "OrderRejectedReturnBitfield2" -> Optional.of(orderRejectedReturnBitfield2);
            case "OrderRejectedReturnBitfield3" -> Optional.of(orderRejectedReturnBitfield3);
            case "OrderRejectedReturnBitfield4" -> Optional.of(orderRejectedReturnBitfield4);
            case "OrderRejectedReturnBitfield5" -> Optional.of(orderRejectedReturnBitfield5);
            case "OrderRejectedReturnBitfield6" -> Optional.of(orderRejectedReturnBitfield6);
            case "OrderRejectedReturnBitfield7" -> Optional.of(orderRejectedReturnBitfield7);
            case "OrderRejectedReturnBitfield8" -> Optional.of(orderRejectedReturnBitfield8);
            case "OrderRejectedReturnBitfield9" -> Optional.of(orderRejectedReturnBitfield9);
            case "OrderRejectedReturnBitfield10" -> Optional.of(orderRejectedReturnBitfield10);
            case "OrderRejectedReturnBitfield11" -> Optional.of(orderRejectedReturnBitfield11);
            case "OrderRejectedReturnBitfield12" -> Optional.of(orderRejectedReturnBitfield12);
            case "OrderRejectedReturnBitfield13" -> Optional.of(orderRejectedReturnBitfield13);
            case "OrderRejectedReturnBitfield14" -> Optional.of(orderRejectedReturnBitfield14);
            case "OrderRejectedReturnBitfield15" -> Optional.of(orderRejectedReturnBitfield15);
            case "OrderRejectedReturnBitfield16" -> Optional.of(orderRejectedReturnBitfield16);
            case "OrderRejectedReturnBitfield17" -> Optional.of(orderRejectedReturnBitfield17);
            case "OrderRejectedReturnBitfield18" -> Optional.of(orderRejectedReturnBitfield18);
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
        if (!(other instanceof OrderRejectedMessage message)) {
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
        if (!(other instanceof OrderRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
