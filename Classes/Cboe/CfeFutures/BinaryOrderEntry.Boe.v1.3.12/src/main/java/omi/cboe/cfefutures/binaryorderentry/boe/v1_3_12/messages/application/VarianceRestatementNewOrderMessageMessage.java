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
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingPriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingSizeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingSymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FeeCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.LastSharesField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MultilegReportingTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfVarianceRestatementBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrigClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventParticipantMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SecondaryExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TradeDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.VarianceRestatementBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

/**
 * Represents the VarianceRestatementNewOrderMessageMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Variance Restatement (New Order Message) Message.</p>
 */
public final class VarianceRestatementNewOrderMessageMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Variance Restatement New Order Message Message";

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
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfVarianceRestatementBitfieldsField numberOfVarianceRestatementBitfields = new NumberOfVarianceRestatementBitfieldsField();

    /**
     * BitSet VarianceRestatement byte 1.
     */
    private final VarianceRestatementBitfield1Field varianceRestatementBitfield1 = new VarianceRestatementBitfield1Field();

    /**
     * BitSet VarianceRestatement byte 2.
     */
    private final VarianceRestatementBitfield2Field varianceRestatementBitfield2 = new VarianceRestatementBitfield2Field();

    /**
     * BitSet VarianceRestatement byte 3.
     */
    private final VarianceRestatementBitfield3Field varianceRestatementBitfield3 = new VarianceRestatementBitfield3Field();

    /**
     * BitSet VarianceRestatement byte 4.
     */
    private final VarianceRestatementBitfield4Field varianceRestatementBitfield4 = new VarianceRestatementBitfield4Field();

    /**
     * BitSet VarianceRestatement byte 5.
     */
    private final VarianceRestatementBitfield5Field varianceRestatementBitfield5 = new VarianceRestatementBitfield5Field();

    /**
     * BitSet VarianceRestatement byte 6.
     */
    private final VarianceRestatementBitfield6Field varianceRestatementBitfield6 = new VarianceRestatementBitfield6Field();

    /**
     * BitSet VarianceRestatement byte 7.
     */
    private final VarianceRestatementBitfield7Field varianceRestatementBitfield7 = new VarianceRestatementBitfield7Field();

    /**
     * BitSet VarianceRestatement byte 8.
     */
    private final VarianceRestatementBitfield8Field varianceRestatementBitfield8 = new VarianceRestatementBitfield8Field();

    /**
     * BitSet VarianceRestatement byte 9.
     */
    private final VarianceRestatementBitfield9Field varianceRestatementBitfield9 = new VarianceRestatementBitfield9Field();

    /**
     * BitSet VarianceRestatement byte 10.
     */
    private final VarianceRestatementBitfield10Field varianceRestatementBitfield10 = new VarianceRestatementBitfield10Field();

    /**
     * BitSet VarianceRestatement byte 11.
     */
    private final VarianceRestatementBitfield11Field varianceRestatementBitfield11 = new VarianceRestatementBitfield11Field();

    /**
     * BitSet VarianceRestatement byte 12.
     */
    private final VarianceRestatementBitfield12Field varianceRestatementBitfield12 = new VarianceRestatementBitfield12Field();

    /**
     * BitSet VarianceRestatement byte 13.
     */
    private final VarianceRestatementBitfield13Field varianceRestatementBitfield13 = new VarianceRestatementBitfield13Field();

    /**
     * BitSet VarianceRestatement byte 14.
     */
    private final VarianceRestatementBitfield14Field varianceRestatementBitfield14 = new VarianceRestatementBitfield14Field();

    /**
     * BitSet VarianceRestatement byte 15.
     */
    private final VarianceRestatementBitfield15Field varianceRestatementBitfield15 = new VarianceRestatementBitfield15Field();

    /**
     * BitSet VarianceRestatement byte 16.
     */
    private final VarianceRestatementBitfield16Field varianceRestatementBitfield16 = new VarianceRestatementBitfield16Field();

    /**
     * BitSet VarianceRestatement byte 17.
     */
    private final VarianceRestatementBitfield17Field varianceRestatementBitfield17 = new VarianceRestatementBitfield17Field();

    /**
     * BitSet VarianceRestatement byte 18.
     */
    private final VarianceRestatementBitfield18Field varianceRestatementBitfield18 = new VarianceRestatementBitfield18Field();

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
     * Prevent Participant Match
     */
    private final PreventParticipantMatchField preventParticipantMatch = new PreventParticipantMatchField();

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
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

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
     * Clearing Price
     */
    private final ClearingPriceField clearingPrice = new ClearingPriceField();

    /**
     * Clearing Size
     */
    private final ClearingSizeField clearingSize = new ClearingSizeField();

    /**
     * Clearing Symbol
     */
    private final ClearingSymbolField clearingSymbol = new ClearingSymbolField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, numberOfVarianceRestatementBitfields, varianceRestatementBitfield1, varianceRestatementBitfield2, varianceRestatementBitfield3, varianceRestatementBitfield4, varianceRestatementBitfield5, varianceRestatementBitfield6, varianceRestatementBitfield7, varianceRestatementBitfield8, varianceRestatementBitfield9, varianceRestatementBitfield10, varianceRestatementBitfield11, varianceRestatementBitfield12, varianceRestatementBitfield13, varianceRestatementBitfield14, varianceRestatementBitfield15, varianceRestatementBitfield16, varianceRestatementBitfield17, varianceRestatementBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, preventParticipantMatch, maturityDate, openClose, origClOrdId, lastShares, lastPx, feeCode, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, tradeDate, clearingPrice, clearingSize, clearingSymbol, multilegReportingType, secondaryExecId, frequentTraderId, custOrderHandlingInst);

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
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfVarianceRestatementBitfields field
     */
    public NumberOfVarianceRestatementBitfieldsField numberOfVarianceRestatementBitfields() {
        return numberOfVarianceRestatementBitfields;
    }

    /**
     * BitSet VarianceRestatement byte 1.
     *
     * @return the VarianceRestatementBitfield1 field
     */
    public VarianceRestatementBitfield1Field varianceRestatementBitfield1() {
        return varianceRestatementBitfield1;
    }

    /**
     * BitSet VarianceRestatement byte 2.
     *
     * @return the VarianceRestatementBitfield2 field
     */
    public VarianceRestatementBitfield2Field varianceRestatementBitfield2() {
        return varianceRestatementBitfield2;
    }

    /**
     * BitSet VarianceRestatement byte 3.
     *
     * @return the VarianceRestatementBitfield3 field
     */
    public VarianceRestatementBitfield3Field varianceRestatementBitfield3() {
        return varianceRestatementBitfield3;
    }

    /**
     * BitSet VarianceRestatement byte 4.
     *
     * @return the VarianceRestatementBitfield4 field
     */
    public VarianceRestatementBitfield4Field varianceRestatementBitfield4() {
        return varianceRestatementBitfield4;
    }

    /**
     * BitSet VarianceRestatement byte 5.
     *
     * @return the VarianceRestatementBitfield5 field
     */
    public VarianceRestatementBitfield5Field varianceRestatementBitfield5() {
        return varianceRestatementBitfield5;
    }

    /**
     * BitSet VarianceRestatement byte 6.
     *
     * @return the VarianceRestatementBitfield6 field
     */
    public VarianceRestatementBitfield6Field varianceRestatementBitfield6() {
        return varianceRestatementBitfield6;
    }

    /**
     * BitSet VarianceRestatement byte 7.
     *
     * @return the VarianceRestatementBitfield7 field
     */
    public VarianceRestatementBitfield7Field varianceRestatementBitfield7() {
        return varianceRestatementBitfield7;
    }

    /**
     * BitSet VarianceRestatement byte 8.
     *
     * @return the VarianceRestatementBitfield8 field
     */
    public VarianceRestatementBitfield8Field varianceRestatementBitfield8() {
        return varianceRestatementBitfield8;
    }

    /**
     * BitSet VarianceRestatement byte 9.
     *
     * @return the VarianceRestatementBitfield9 field
     */
    public VarianceRestatementBitfield9Field varianceRestatementBitfield9() {
        return varianceRestatementBitfield9;
    }

    /**
     * BitSet VarianceRestatement byte 10.
     *
     * @return the VarianceRestatementBitfield10 field
     */
    public VarianceRestatementBitfield10Field varianceRestatementBitfield10() {
        return varianceRestatementBitfield10;
    }

    /**
     * BitSet VarianceRestatement byte 11.
     *
     * @return the VarianceRestatementBitfield11 field
     */
    public VarianceRestatementBitfield11Field varianceRestatementBitfield11() {
        return varianceRestatementBitfield11;
    }

    /**
     * BitSet VarianceRestatement byte 12.
     *
     * @return the VarianceRestatementBitfield12 field
     */
    public VarianceRestatementBitfield12Field varianceRestatementBitfield12() {
        return varianceRestatementBitfield12;
    }

    /**
     * BitSet VarianceRestatement byte 13.
     *
     * @return the VarianceRestatementBitfield13 field
     */
    public VarianceRestatementBitfield13Field varianceRestatementBitfield13() {
        return varianceRestatementBitfield13;
    }

    /**
     * BitSet VarianceRestatement byte 14.
     *
     * @return the VarianceRestatementBitfield14 field
     */
    public VarianceRestatementBitfield14Field varianceRestatementBitfield14() {
        return varianceRestatementBitfield14;
    }

    /**
     * BitSet VarianceRestatement byte 15.
     *
     * @return the VarianceRestatementBitfield15 field
     */
    public VarianceRestatementBitfield15Field varianceRestatementBitfield15() {
        return varianceRestatementBitfield15;
    }

    /**
     * BitSet VarianceRestatement byte 16.
     *
     * @return the VarianceRestatementBitfield16 field
     */
    public VarianceRestatementBitfield16Field varianceRestatementBitfield16() {
        return varianceRestatementBitfield16;
    }

    /**
     * BitSet VarianceRestatement byte 17.
     *
     * @return the VarianceRestatementBitfield17 field
     */
    public VarianceRestatementBitfield17Field varianceRestatementBitfield17() {
        return varianceRestatementBitfield17;
    }

    /**
     * BitSet VarianceRestatement byte 18.
     *
     * @return the VarianceRestatementBitfield18 field
     */
    public VarianceRestatementBitfield18Field varianceRestatementBitfield18() {
        return varianceRestatementBitfield18;
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
     * Prevent Participant Match
     *
     * @return the PreventParticipantMatch field
     */
    public PreventParticipantMatchField preventParticipantMatch() {
        return preventParticipantMatch;
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
     * Clearing Price
     *
     * @return the ClearingPrice field
     */
    public ClearingPriceField clearingPrice() {
        return clearingPrice;
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
     * Clearing Symbol
     *
     * @return the ClearingSymbol field
     */
    public ClearingSymbolField clearingSymbol() {
        return clearingSymbol;
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
     * Returns whether the fields before the VarianceRestatementBitfield1 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield1 is on the wire
     */
    public boolean varianceRestatementBitfield1Present() {
        return numberOfVarianceRestatementBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield2 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield2 is on the wire
     */
    public boolean varianceRestatementBitfield2Present() {
        return numberOfVarianceRestatementBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield3 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield3 is on the wire
     */
    public boolean varianceRestatementBitfield3Present() {
        return numberOfVarianceRestatementBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield4 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield4 is on the wire
     */
    public boolean varianceRestatementBitfield4Present() {
        return numberOfVarianceRestatementBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield5 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield5 is on the wire
     */
    public boolean varianceRestatementBitfield5Present() {
        return numberOfVarianceRestatementBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield6 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield6 is on the wire
     */
    public boolean varianceRestatementBitfield6Present() {
        return numberOfVarianceRestatementBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield7 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield7 is on the wire
     */
    public boolean varianceRestatementBitfield7Present() {
        return numberOfVarianceRestatementBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield8 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield8 is on the wire
     */
    public boolean varianceRestatementBitfield8Present() {
        return numberOfVarianceRestatementBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield9 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield9 is on the wire
     */
    public boolean varianceRestatementBitfield9Present() {
        return numberOfVarianceRestatementBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield10 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield10 is on the wire
     */
    public boolean varianceRestatementBitfield10Present() {
        return numberOfVarianceRestatementBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield11 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield11 is on the wire
     */
    public boolean varianceRestatementBitfield11Present() {
        return numberOfVarianceRestatementBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield12 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield12 is on the wire
     */
    public boolean varianceRestatementBitfield12Present() {
        return numberOfVarianceRestatementBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield13 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield13 is on the wire
     */
    public boolean varianceRestatementBitfield13Present() {
        return numberOfVarianceRestatementBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield14 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield14 is on the wire
     */
    public boolean varianceRestatementBitfield14Present() {
        return numberOfVarianceRestatementBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield15 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield15 is on the wire
     */
    public boolean varianceRestatementBitfield15Present() {
        return numberOfVarianceRestatementBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield16 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield16 is on the wire
     */
    public boolean varianceRestatementBitfield16Present() {
        return numberOfVarianceRestatementBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield17 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield17 is on the wire
     */
    public boolean varianceRestatementBitfield17Present() {
        return numberOfVarianceRestatementBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the VarianceRestatementBitfield18 put it on the wire.
     *
     * <p>Decode reads the VarianceRestatementBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VarianceRestatementBitfield18 is on the wire
     */
    public boolean varianceRestatementBitfield18Present() {
        return numberOfVarianceRestatementBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 1L) && (varianceRestatementBitfield1Present() && varianceRestatementBitfield1.varianceRestatementBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 1L) && (varianceRestatementBitfield1Present() && varianceRestatementBitfield1.varianceRestatementBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 1L) && (varianceRestatementBitfield1Present() && varianceRestatementBitfield1.varianceRestatementBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 1L) && (varianceRestatementBitfield1Present() && varianceRestatementBitfield1.varianceRestatementBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 1L) && (varianceRestatementBitfield1Present() && varianceRestatementBitfield1.varianceRestatementBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 2L) && (varianceRestatementBitfield2Present() && varianceRestatementBitfield2.varianceRestatementBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 2L) && (varianceRestatementBitfield2Present() && varianceRestatementBitfield2.varianceRestatementBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 3L) && (varianceRestatementBitfield3Present() && varianceRestatementBitfield3.varianceRestatementBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 3L) && (varianceRestatementBitfield3Present() && varianceRestatementBitfield3.varianceRestatementBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 3L) && (varianceRestatementBitfield3Present() && varianceRestatementBitfield3.varianceRestatementBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the PreventParticipantMatch put it on the wire.
     *
     * <p>Decode reads the PreventParticipantMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventParticipantMatch is on the wire
     */
    public boolean preventParticipantMatchPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 3L) && (varianceRestatementBitfield3Present() && varianceRestatementBitfield3.varianceRestatementBitfield3PreventParticipantMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 4L) && (varianceRestatementBitfield4Present() && varianceRestatementBitfield4.varianceRestatementBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 4L) && (varianceRestatementBitfield4Present() && varianceRestatementBitfield4.varianceRestatementBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 5L) && (varianceRestatementBitfield5Present() && varianceRestatementBitfield5.varianceRestatementBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 5L) && (varianceRestatementBitfield5Present() && varianceRestatementBitfield5.varianceRestatementBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 5L) && (varianceRestatementBitfield5Present() && varianceRestatementBitfield5.varianceRestatementBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 8L) && (varianceRestatementBitfield8Present() && varianceRestatementBitfield8.varianceRestatementBitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 8L) && (varianceRestatementBitfield8Present() && varianceRestatementBitfield8.varianceRestatementBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 9L) && (varianceRestatementBitfield9Present() && varianceRestatementBitfield9.varianceRestatementBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the TradeDate put it on the wire.
     *
     * <p>Decode reads the TradeDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeDate is on the wire
     */
    public boolean tradeDatePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12TradeDate());
    }

    /**
     * Returns whether the fields before the ClearingPrice put it on the wire.
     *
     * <p>Decode reads the ClearingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingPrice is on the wire
     */
    public boolean clearingPricePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12ClearingPrice());
    }

    /**
     * Returns whether the fields before the ClearingSize put it on the wire.
     *
     * <p>Decode reads the ClearingSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingSize is on the wire
     */
    public boolean clearingSizePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12ClearingSize());
    }

    /**
     * Returns whether the fields before the ClearingSymbol put it on the wire.
     *
     * <p>Decode reads the ClearingSymbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingSymbol is on the wire
     */
    public boolean clearingSymbolPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 12L) && (varianceRestatementBitfield12Present() && varianceRestatementBitfield12.varianceRestatementBitfield12ClearingSymbol());
    }

    /**
     * Returns whether the fields before the MultilegReportingType put it on the wire.
     *
     * <p>Decode reads the MultilegReportingType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultilegReportingType is on the wire
     */
    public boolean multilegReportingTypePresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 13L) && (varianceRestatementBitfield13Present() && varianceRestatementBitfield13.varianceRestatementBitfield13MultilegReportingType());
    }

    /**
     * Returns whether the fields before the SecondaryExecId put it on the wire.
     *
     * <p>Decode reads the SecondaryExecId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryExecId is on the wire
     */
    public boolean secondaryExecIdPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 14L) && (varianceRestatementBitfield14Present() && varianceRestatementBitfield14.varianceRestatementBitfield14SecondaryExecId());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 16L) && (varianceRestatementBitfield16Present() && varianceRestatementBitfield16.varianceRestatementBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfVarianceRestatementBitfields.value() >= 17L) && (varianceRestatementBitfield17Present() && varianceRestatementBitfield17.varianceRestatementBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != varianceRestatementBitfield1 || varianceRestatementBitfield1Present()) && (field != varianceRestatementBitfield2 || varianceRestatementBitfield2Present()) && (field != varianceRestatementBitfield3 || varianceRestatementBitfield3Present()) && (field != varianceRestatementBitfield4 || varianceRestatementBitfield4Present()) && (field != varianceRestatementBitfield5 || varianceRestatementBitfield5Present()) && (field != varianceRestatementBitfield6 || varianceRestatementBitfield6Present()) && (field != varianceRestatementBitfield7 || varianceRestatementBitfield7Present()) && (field != varianceRestatementBitfield8 || varianceRestatementBitfield8Present()) && (field != varianceRestatementBitfield9 || varianceRestatementBitfield9Present()) && (field != varianceRestatementBitfield10 || varianceRestatementBitfield10Present()) && (field != varianceRestatementBitfield11 || varianceRestatementBitfield11Present()) && (field != varianceRestatementBitfield12 || varianceRestatementBitfield12Present()) && (field != varianceRestatementBitfield13 || varianceRestatementBitfield13Present()) && (field != varianceRestatementBitfield14 || varianceRestatementBitfield14Present()) && (field != varianceRestatementBitfield15 || varianceRestatementBitfield15Present()) && (field != varianceRestatementBitfield16 || varianceRestatementBitfield16Present()) && (field != varianceRestatementBitfield17 || varianceRestatementBitfield17Present()) && (field != varianceRestatementBitfield18 || varianceRestatementBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != preventParticipantMatch || preventParticipantMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != feeCode || feeCodePresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != tradeDate || tradeDatePresent()) && (field != clearingPrice || clearingPricePresent()) && (field != clearingSize || clearingSizePresent()) && (field != clearingSymbol || clearingSymbolPresent()) && (field != multilegReportingType || multilegReportingTypePresent()) && (field != secondaryExecId || secondaryExecIdPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (varianceRestatementBitfield1Present() ? VarianceRestatementBitfield1Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield2Present() ? VarianceRestatementBitfield2Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield3Present() ? VarianceRestatementBitfield3Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield4Present() ? VarianceRestatementBitfield4Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield5Present() ? VarianceRestatementBitfield5Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield6Present() ? VarianceRestatementBitfield6Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield7Present() ? VarianceRestatementBitfield7Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield8Present() ? VarianceRestatementBitfield8Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield9Present() ? VarianceRestatementBitfield9Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield10Present() ? VarianceRestatementBitfield10Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield11Present() ? VarianceRestatementBitfield11Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield12Present() ? VarianceRestatementBitfield12Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield13Present() ? VarianceRestatementBitfield13Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield14Present() ? VarianceRestatementBitfield14Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield15Present() ? VarianceRestatementBitfield15Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield16Present() ? VarianceRestatementBitfield16Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield17Present() ? VarianceRestatementBitfield17Field.BYTE_LENGTH : 0) + (varianceRestatementBitfield18Present() ? VarianceRestatementBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (preventParticipantMatchPresent() ? PreventParticipantMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (tradeDatePresent() ? TradeDateField.BYTE_LENGTH : 0) + (clearingPricePresent() ? ClearingPriceField.BYTE_LENGTH : 0) + (clearingSizePresent() ? ClearingSizeField.BYTE_LENGTH : 0) + (clearingSymbolPresent() ? ClearingSymbolField.BYTE_LENGTH : 0) + (multilegReportingTypePresent() ? MultilegReportingTypeField.BYTE_LENGTH : 0) + (secondaryExecIdPresent() ? SecondaryExecIdField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (varianceRestatementBitfield1Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield2Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield3Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield4Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield5Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield6Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield7Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield8Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield9Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield10Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield11Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield12Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield13Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield14Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield15Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield16Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield17Present()) {
            cursor += 1;
        }
        if (varianceRestatementBitfield18Present()) {
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
        if (preventParticipantMatchPresent()) {
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
        if (lastSharesPresent()) {
            cursor += 4;
        }
        if (lastPxPresent()) {
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
        if (clearingPricePresent()) {
            cursor += 8;
        }
        if (clearingSizePresent()) {
            cursor += 4;
        }
        if (clearingSymbolPresent()) {
            cursor += 8;
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
        cursor += 1; // padding
        if (!numberOfVarianceRestatementBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfVarianceRestatementBitfieldsField.BYTE_LENGTH;
        if (varianceRestatementBitfield1Present()) {
            if (end - cursor < VarianceRestatementBitfield1Field.BYTE_LENGTH || !varianceRestatementBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield2Present()) {
            if (end - cursor < VarianceRestatementBitfield2Field.BYTE_LENGTH || !varianceRestatementBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield3Present()) {
            if (end - cursor < VarianceRestatementBitfield3Field.BYTE_LENGTH || !varianceRestatementBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield4Present()) {
            if (end - cursor < VarianceRestatementBitfield4Field.BYTE_LENGTH || !varianceRestatementBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield5Present()) {
            if (end - cursor < VarianceRestatementBitfield5Field.BYTE_LENGTH || !varianceRestatementBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield6Present()) {
            if (end - cursor < VarianceRestatementBitfield6Field.BYTE_LENGTH || !varianceRestatementBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield7Present()) {
            if (end - cursor < VarianceRestatementBitfield7Field.BYTE_LENGTH || !varianceRestatementBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield8Present()) {
            if (end - cursor < VarianceRestatementBitfield8Field.BYTE_LENGTH || !varianceRestatementBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield9Present()) {
            if (end - cursor < VarianceRestatementBitfield9Field.BYTE_LENGTH || !varianceRestatementBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield10Present()) {
            if (end - cursor < VarianceRestatementBitfield10Field.BYTE_LENGTH || !varianceRestatementBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield11Present()) {
            if (end - cursor < VarianceRestatementBitfield11Field.BYTE_LENGTH || !varianceRestatementBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield12Present()) {
            if (end - cursor < VarianceRestatementBitfield12Field.BYTE_LENGTH || !varianceRestatementBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield13Present()) {
            if (end - cursor < VarianceRestatementBitfield13Field.BYTE_LENGTH || !varianceRestatementBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield14Present()) {
            if (end - cursor < VarianceRestatementBitfield14Field.BYTE_LENGTH || !varianceRestatementBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield15Present()) {
            if (end - cursor < VarianceRestatementBitfield15Field.BYTE_LENGTH || !varianceRestatementBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield16Present()) {
            if (end - cursor < VarianceRestatementBitfield16Field.BYTE_LENGTH || !varianceRestatementBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield17Present()) {
            if (end - cursor < VarianceRestatementBitfield17Field.BYTE_LENGTH || !varianceRestatementBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (varianceRestatementBitfield18Present()) {
            if (end - cursor < VarianceRestatementBitfield18Field.BYTE_LENGTH || !varianceRestatementBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += VarianceRestatementBitfield18Field.BYTE_LENGTH;
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
        if (preventParticipantMatchPresent()) {
            if (end - cursor < PreventParticipantMatchField.BYTE_LENGTH || !preventParticipantMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventParticipantMatchField.BYTE_LENGTH;
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
        if (clearingPricePresent()) {
            if (end - cursor < ClearingPriceField.BYTE_LENGTH || !clearingPrice.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingPriceField.BYTE_LENGTH;
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
        if (clearingSymbolPresent()) {
            if (end - cursor < ClearingSymbolField.BYTE_LENGTH || !clearingSymbol.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingSymbolField.BYTE_LENGTH;
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
        if (varianceRestatementBitfield1Present() != varianceRestatementBitfield1.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield1.hasValue() ? "varianceRestatementBitfield1 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield2Present() != varianceRestatementBitfield2.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield2.hasValue() ? "varianceRestatementBitfield2 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield3Present() != varianceRestatementBitfield3.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield3.hasValue() ? "varianceRestatementBitfield3 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield4Present() != varianceRestatementBitfield4.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield4.hasValue() ? "varianceRestatementBitfield4 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield5Present() != varianceRestatementBitfield5.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield5.hasValue() ? "varianceRestatementBitfield5 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield6Present() != varianceRestatementBitfield6.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield6.hasValue() ? "varianceRestatementBitfield6 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield7Present() != varianceRestatementBitfield7.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield7.hasValue() ? "varianceRestatementBitfield7 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield8Present() != varianceRestatementBitfield8.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield8.hasValue() ? "varianceRestatementBitfield8 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield9Present() != varianceRestatementBitfield9.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield9.hasValue() ? "varianceRestatementBitfield9 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield10Present() != varianceRestatementBitfield10.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield10.hasValue() ? "varianceRestatementBitfield10 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield11Present() != varianceRestatementBitfield11.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield11.hasValue() ? "varianceRestatementBitfield11 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield12Present() != varianceRestatementBitfield12.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield12.hasValue() ? "varianceRestatementBitfield12 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield13Present() != varianceRestatementBitfield13.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield13.hasValue() ? "varianceRestatementBitfield13 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield14Present() != varianceRestatementBitfield14.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield14.hasValue() ? "varianceRestatementBitfield14 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield15Present() != varianceRestatementBitfield15.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield15.hasValue() ? "varianceRestatementBitfield15 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield16Present() != varianceRestatementBitfield16.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield16.hasValue() ? "varianceRestatementBitfield16 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield17Present() != varianceRestatementBitfield17.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield17.hasValue() ? "varianceRestatementBitfield17 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (varianceRestatementBitfield18Present() != varianceRestatementBitfield18.hasValue()) {
            throw new IllegalStateException(varianceRestatementBitfield18.hasValue() ? "varianceRestatementBitfield18 holds a value the fields before it leave off the wire" : "varianceRestatementBitfield18 holds no value, though the fields before it put it on the wire");
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
        if (preventParticipantMatchPresent() != preventParticipantMatch.hasValue()) {
            throw new IllegalStateException(preventParticipantMatch.hasValue() ? "preventParticipantMatch holds a value the fields before it leave off the wire" : "preventParticipantMatch holds no value, though the fields before it put it on the wire");
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
        if (lastSharesPresent() != lastShares.hasValue()) {
            throw new IllegalStateException(lastShares.hasValue() ? "lastShares holds a value the fields before it leave off the wire" : "lastShares holds no value, though the fields before it put it on the wire");
        }
        if (lastPxPresent() != lastPx.hasValue()) {
            throw new IllegalStateException(lastPx.hasValue() ? "lastPx holds a value the fields before it leave off the wire" : "lastPx holds no value, though the fields before it put it on the wire");
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
        if (clearingPricePresent() != clearingPrice.hasValue()) {
            throw new IllegalStateException(clearingPrice.hasValue() ? "clearingPrice holds a value the fields before it leave off the wire" : "clearingPrice holds no value, though the fields before it put it on the wire");
        }
        if (clearingSizePresent() != clearingSize.hasValue()) {
            throw new IllegalStateException(clearingSize.hasValue() ? "clearingSize holds a value the fields before it leave off the wire" : "clearingSize holds no value, though the fields before it put it on the wire");
        }
        if (clearingSymbolPresent() != clearingSymbol.hasValue()) {
            throw new IllegalStateException(clearingSymbol.hasValue() ? "clearingSymbol holds a value the fields before it leave off the wire" : "clearingSymbol holds no value, though the fields before it put it on the wire");
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
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfVarianceRestatementBitfields.encode(data, cursor);
        if (varianceRestatementBitfield1Present()) {
            cursor = varianceRestatementBitfield1.encode(data, cursor);
        }
        if (varianceRestatementBitfield2Present()) {
            cursor = varianceRestatementBitfield2.encode(data, cursor);
        }
        if (varianceRestatementBitfield3Present()) {
            cursor = varianceRestatementBitfield3.encode(data, cursor);
        }
        if (varianceRestatementBitfield4Present()) {
            cursor = varianceRestatementBitfield4.encode(data, cursor);
        }
        if (varianceRestatementBitfield5Present()) {
            cursor = varianceRestatementBitfield5.encode(data, cursor);
        }
        if (varianceRestatementBitfield6Present()) {
            cursor = varianceRestatementBitfield6.encode(data, cursor);
        }
        if (varianceRestatementBitfield7Present()) {
            cursor = varianceRestatementBitfield7.encode(data, cursor);
        }
        if (varianceRestatementBitfield8Present()) {
            cursor = varianceRestatementBitfield8.encode(data, cursor);
        }
        if (varianceRestatementBitfield9Present()) {
            cursor = varianceRestatementBitfield9.encode(data, cursor);
        }
        if (varianceRestatementBitfield10Present()) {
            cursor = varianceRestatementBitfield10.encode(data, cursor);
        }
        if (varianceRestatementBitfield11Present()) {
            cursor = varianceRestatementBitfield11.encode(data, cursor);
        }
        if (varianceRestatementBitfield12Present()) {
            cursor = varianceRestatementBitfield12.encode(data, cursor);
        }
        if (varianceRestatementBitfield13Present()) {
            cursor = varianceRestatementBitfield13.encode(data, cursor);
        }
        if (varianceRestatementBitfield14Present()) {
            cursor = varianceRestatementBitfield14.encode(data, cursor);
        }
        if (varianceRestatementBitfield15Present()) {
            cursor = varianceRestatementBitfield15.encode(data, cursor);
        }
        if (varianceRestatementBitfield16Present()) {
            cursor = varianceRestatementBitfield16.encode(data, cursor);
        }
        if (varianceRestatementBitfield17Present()) {
            cursor = varianceRestatementBitfield17.encode(data, cursor);
        }
        if (varianceRestatementBitfield18Present()) {
            cursor = varianceRestatementBitfield18.encode(data, cursor);
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
        if (preventParticipantMatchPresent()) {
            cursor = preventParticipantMatch.encode(data, cursor);
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
        if (lastSharesPresent()) {
            cursor = lastShares.encode(data, cursor);
        }
        if (lastPxPresent()) {
            cursor = lastPx.encode(data, cursor);
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
        if (clearingPricePresent()) {
            cursor = clearingPrice.encode(data, cursor);
        }
        if (clearingSizePresent()) {
            cursor = clearingSize.encode(data, cursor);
        }
        if (clearingSymbolPresent()) {
            cursor = clearingSymbol.encode(data, cursor);
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
            case "NumberOfVarianceRestatementBitfields" -> Optional.of(numberOfVarianceRestatementBitfields);
            case "VarianceRestatementBitfield1" -> Optional.of(varianceRestatementBitfield1);
            case "VarianceRestatementBitfield2" -> Optional.of(varianceRestatementBitfield2);
            case "VarianceRestatementBitfield3" -> Optional.of(varianceRestatementBitfield3);
            case "VarianceRestatementBitfield4" -> Optional.of(varianceRestatementBitfield4);
            case "VarianceRestatementBitfield5" -> Optional.of(varianceRestatementBitfield5);
            case "VarianceRestatementBitfield6" -> Optional.of(varianceRestatementBitfield6);
            case "VarianceRestatementBitfield7" -> Optional.of(varianceRestatementBitfield7);
            case "VarianceRestatementBitfield8" -> Optional.of(varianceRestatementBitfield8);
            case "VarianceRestatementBitfield9" -> Optional.of(varianceRestatementBitfield9);
            case "VarianceRestatementBitfield10" -> Optional.of(varianceRestatementBitfield10);
            case "VarianceRestatementBitfield11" -> Optional.of(varianceRestatementBitfield11);
            case "VarianceRestatementBitfield12" -> Optional.of(varianceRestatementBitfield12);
            case "VarianceRestatementBitfield13" -> Optional.of(varianceRestatementBitfield13);
            case "VarianceRestatementBitfield14" -> Optional.of(varianceRestatementBitfield14);
            case "VarianceRestatementBitfield15" -> Optional.of(varianceRestatementBitfield15);
            case "VarianceRestatementBitfield16" -> Optional.of(varianceRestatementBitfield16);
            case "VarianceRestatementBitfield17" -> Optional.of(varianceRestatementBitfield17);
            case "VarianceRestatementBitfield18" -> Optional.of(varianceRestatementBitfield18);
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
            case "PreventParticipantMatch" -> Optional.of(preventParticipantMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OpenClose" -> Optional.of(openClose);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "FeeCode" -> Optional.of(feeCode);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ClearingPrice" -> Optional.of(clearingPrice);
            case "ClearingSize" -> Optional.of(clearingSize);
            case "ClearingSymbol" -> Optional.of(clearingSymbol);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof VarianceRestatementNewOrderMessageMessage message)) {
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
        if (!(other instanceof VarianceRestatementNewOrderMessageMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
