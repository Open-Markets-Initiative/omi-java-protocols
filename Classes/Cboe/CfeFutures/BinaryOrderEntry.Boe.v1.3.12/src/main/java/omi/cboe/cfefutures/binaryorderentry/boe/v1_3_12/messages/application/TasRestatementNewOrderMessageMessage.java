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
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfTasRestatementBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OrigClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SecondaryExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.SymbolAlphanumericField2;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield18Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TasRestatementBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TradeDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

/**
 * Represents the TasRestatementNewOrderMessageMessage message from the BinaryOrderEntry protocol.
 *
 * <p>TAS Restatement (New Order Message) Message.</p>
 */
public final class TasRestatementNewOrderMessageMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tas Restatement New Order Message Message";

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
    private final NumberOfTasRestatementBitfieldsField numberOfTasRestatementBitfields = new NumberOfTasRestatementBitfieldsField();

    /**
     * BitSet TASRestatement byte 1.
     */
    private final TasRestatementBitfield1Field tasRestatementBitfield1 = new TasRestatementBitfield1Field();

    /**
     * BitSet TASRestatement byte 2.
     */
    private final TasRestatementBitfield2Field tasRestatementBitfield2 = new TasRestatementBitfield2Field();

    /**
     * BitSet TASRestatement byte 3.
     */
    private final TasRestatementBitfield3Field tasRestatementBitfield3 = new TasRestatementBitfield3Field();

    /**
     * BitSet TASRestatement byte 4.
     */
    private final TasRestatementBitfield4Field tasRestatementBitfield4 = new TasRestatementBitfield4Field();

    /**
     * BitSet TASRestatement byte 5.
     */
    private final TasRestatementBitfield5Field tasRestatementBitfield5 = new TasRestatementBitfield5Field();

    /**
     * BitSet TASRestatement byte 6.
     */
    private final TasRestatementBitfield6Field tasRestatementBitfield6 = new TasRestatementBitfield6Field();

    /**
     * BitSet TASRestatement byte 7.
     */
    private final TasRestatementBitfield7Field tasRestatementBitfield7 = new TasRestatementBitfield7Field();

    /**
     * BitSet TASRestatement byte 8.
     */
    private final TasRestatementBitfield8Field tasRestatementBitfield8 = new TasRestatementBitfield8Field();

    /**
     * BitSet TASRestatement byte 9.
     */
    private final TasRestatementBitfield9Field tasRestatementBitfield9 = new TasRestatementBitfield9Field();

    /**
     * BitSet TASRestatement byte 10.
     */
    private final TasRestatementBitfield10Field tasRestatementBitfield10 = new TasRestatementBitfield10Field();

    /**
     * BitSet TASRestatement byte 11.
     */
    private final TasRestatementBitfield11Field tasRestatementBitfield11 = new TasRestatementBitfield11Field();

    /**
     * BitSet TASRestatement byte 12.
     */
    private final TasRestatementBitfield12Field tasRestatementBitfield12 = new TasRestatementBitfield12Field();

    /**
     * BitSet TASRestatement byte 13.
     */
    private final TasRestatementBitfield13Field tasRestatementBitfield13 = new TasRestatementBitfield13Field();

    /**
     * BitSet TASRestatement byte 14.
     */
    private final TasRestatementBitfield14Field tasRestatementBitfield14 = new TasRestatementBitfield14Field();

    /**
     * BitSet TASRestatement byte 15.
     */
    private final TasRestatementBitfield15Field tasRestatementBitfield15 = new TasRestatementBitfield15Field();

    /**
     * BitSet TASRestatement byte 16.
     */
    private final TasRestatementBitfield16Field tasRestatementBitfield16 = new TasRestatementBitfield16Field();

    /**
     * BitSet TASRestatement byte 17.
     */
    private final TasRestatementBitfield17Field tasRestatementBitfield17 = new TasRestatementBitfield17Field();

    /**
     * BitSet TASRestatement byte 18.
     */
    private final TasRestatementBitfield18Field tasRestatementBitfield18 = new TasRestatementBitfield18Field();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, numberOfTasRestatementBitfields, tasRestatementBitfield1, tasRestatementBitfield2, tasRestatementBitfield3, tasRestatementBitfield4, tasRestatementBitfield5, tasRestatementBitfield6, tasRestatementBitfield7, tasRestatementBitfield8, tasRestatementBitfield9, tasRestatementBitfield10, tasRestatementBitfield11, tasRestatementBitfield12, tasRestatementBitfield13, tasRestatementBitfield14, tasRestatementBitfield15, tasRestatementBitfield16, tasRestatementBitfield17, tasRestatementBitfield18, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, capacity, account, clearingFirm, clearingAccount, preventMatch, maturityDate, openClose, origClOrdId, lastShares, lastPx, feeCode, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, tradeDate, clearingPrice, clearingSymbol, multilegReportingType, secondaryExecId, frequentTraderId, custOrderHandlingInst);

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
     * @return the NumberOfTasRestatementBitfields field
     */
    public NumberOfTasRestatementBitfieldsField numberOfTasRestatementBitfields() {
        return numberOfTasRestatementBitfields;
    }

    /**
     * BitSet TASRestatement byte 1.
     *
     * @return the TasRestatementBitfield1 field
     */
    public TasRestatementBitfield1Field tasRestatementBitfield1() {
        return tasRestatementBitfield1;
    }

    /**
     * BitSet TASRestatement byte 2.
     *
     * @return the TasRestatementBitfield2 field
     */
    public TasRestatementBitfield2Field tasRestatementBitfield2() {
        return tasRestatementBitfield2;
    }

    /**
     * BitSet TASRestatement byte 3.
     *
     * @return the TasRestatementBitfield3 field
     */
    public TasRestatementBitfield3Field tasRestatementBitfield3() {
        return tasRestatementBitfield3;
    }

    /**
     * BitSet TASRestatement byte 4.
     *
     * @return the TasRestatementBitfield4 field
     */
    public TasRestatementBitfield4Field tasRestatementBitfield4() {
        return tasRestatementBitfield4;
    }

    /**
     * BitSet TASRestatement byte 5.
     *
     * @return the TasRestatementBitfield5 field
     */
    public TasRestatementBitfield5Field tasRestatementBitfield5() {
        return tasRestatementBitfield5;
    }

    /**
     * BitSet TASRestatement byte 6.
     *
     * @return the TasRestatementBitfield6 field
     */
    public TasRestatementBitfield6Field tasRestatementBitfield6() {
        return tasRestatementBitfield6;
    }

    /**
     * BitSet TASRestatement byte 7.
     *
     * @return the TasRestatementBitfield7 field
     */
    public TasRestatementBitfield7Field tasRestatementBitfield7() {
        return tasRestatementBitfield7;
    }

    /**
     * BitSet TASRestatement byte 8.
     *
     * @return the TasRestatementBitfield8 field
     */
    public TasRestatementBitfield8Field tasRestatementBitfield8() {
        return tasRestatementBitfield8;
    }

    /**
     * BitSet TASRestatement byte 9.
     *
     * @return the TasRestatementBitfield9 field
     */
    public TasRestatementBitfield9Field tasRestatementBitfield9() {
        return tasRestatementBitfield9;
    }

    /**
     * BitSet TASRestatement byte 10.
     *
     * @return the TasRestatementBitfield10 field
     */
    public TasRestatementBitfield10Field tasRestatementBitfield10() {
        return tasRestatementBitfield10;
    }

    /**
     * BitSet TASRestatement byte 11.
     *
     * @return the TasRestatementBitfield11 field
     */
    public TasRestatementBitfield11Field tasRestatementBitfield11() {
        return tasRestatementBitfield11;
    }

    /**
     * BitSet TASRestatement byte 12.
     *
     * @return the TasRestatementBitfield12 field
     */
    public TasRestatementBitfield12Field tasRestatementBitfield12() {
        return tasRestatementBitfield12;
    }

    /**
     * BitSet TASRestatement byte 13.
     *
     * @return the TasRestatementBitfield13 field
     */
    public TasRestatementBitfield13Field tasRestatementBitfield13() {
        return tasRestatementBitfield13;
    }

    /**
     * BitSet TASRestatement byte 14.
     *
     * @return the TasRestatementBitfield14 field
     */
    public TasRestatementBitfield14Field tasRestatementBitfield14() {
        return tasRestatementBitfield14;
    }

    /**
     * BitSet TASRestatement byte 15.
     *
     * @return the TasRestatementBitfield15 field
     */
    public TasRestatementBitfield15Field tasRestatementBitfield15() {
        return tasRestatementBitfield15;
    }

    /**
     * BitSet TASRestatement byte 16.
     *
     * @return the TasRestatementBitfield16 field
     */
    public TasRestatementBitfield16Field tasRestatementBitfield16() {
        return tasRestatementBitfield16;
    }

    /**
     * BitSet TASRestatement byte 17.
     *
     * @return the TasRestatementBitfield17 field
     */
    public TasRestatementBitfield17Field tasRestatementBitfield17() {
        return tasRestatementBitfield17;
    }

    /**
     * BitSet TASRestatement byte 18.
     *
     * @return the TasRestatementBitfield18 field
     */
    public TasRestatementBitfield18Field tasRestatementBitfield18() {
        return tasRestatementBitfield18;
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
     * Returns whether the fields before the TasRestatementBitfield1 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield1 is on the wire
     */
    public boolean tasRestatementBitfield1Present() {
        return numberOfTasRestatementBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield2 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield2 is on the wire
     */
    public boolean tasRestatementBitfield2Present() {
        return numberOfTasRestatementBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield3 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield3 is on the wire
     */
    public boolean tasRestatementBitfield3Present() {
        return numberOfTasRestatementBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield4 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield4 is on the wire
     */
    public boolean tasRestatementBitfield4Present() {
        return numberOfTasRestatementBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield5 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield5 is on the wire
     */
    public boolean tasRestatementBitfield5Present() {
        return numberOfTasRestatementBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield6 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield6 is on the wire
     */
    public boolean tasRestatementBitfield6Present() {
        return numberOfTasRestatementBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield7 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield7 is on the wire
     */
    public boolean tasRestatementBitfield7Present() {
        return numberOfTasRestatementBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield8 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield8 is on the wire
     */
    public boolean tasRestatementBitfield8Present() {
        return numberOfTasRestatementBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield9 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield9 is on the wire
     */
    public boolean tasRestatementBitfield9Present() {
        return numberOfTasRestatementBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield10 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield10 is on the wire
     */
    public boolean tasRestatementBitfield10Present() {
        return numberOfTasRestatementBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield11 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield11 is on the wire
     */
    public boolean tasRestatementBitfield11Present() {
        return numberOfTasRestatementBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield12 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield12 is on the wire
     */
    public boolean tasRestatementBitfield12Present() {
        return numberOfTasRestatementBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield13 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield13 is on the wire
     */
    public boolean tasRestatementBitfield13Present() {
        return numberOfTasRestatementBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield14 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield14 is on the wire
     */
    public boolean tasRestatementBitfield14Present() {
        return numberOfTasRestatementBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield15 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield15 is on the wire
     */
    public boolean tasRestatementBitfield15Present() {
        return numberOfTasRestatementBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield16 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield16 is on the wire
     */
    public boolean tasRestatementBitfield16Present() {
        return numberOfTasRestatementBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield17 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield17 is on the wire
     */
    public boolean tasRestatementBitfield17Present() {
        return numberOfTasRestatementBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the TasRestatementBitfield18 put it on the wire.
     *
     * <p>Decode reads the TasRestatementBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TasRestatementBitfield18 is on the wire
     */
    public boolean tasRestatementBitfield18Present() {
        return numberOfTasRestatementBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfTasRestatementBitfields.value() >= 1L) && (tasRestatementBitfield1Present() && tasRestatementBitfield1.tasRestatementBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfTasRestatementBitfields.value() >= 1L) && (tasRestatementBitfield1Present() && tasRestatementBitfield1.tasRestatementBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfTasRestatementBitfields.value() >= 1L) && (tasRestatementBitfield1Present() && tasRestatementBitfield1.tasRestatementBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfTasRestatementBitfields.value() >= 1L) && (tasRestatementBitfield1Present() && tasRestatementBitfield1.tasRestatementBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfTasRestatementBitfields.value() >= 1L) && (tasRestatementBitfield1Present() && tasRestatementBitfield1.tasRestatementBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfTasRestatementBitfields.value() >= 2L) && (tasRestatementBitfield2Present() && tasRestatementBitfield2.tasRestatementBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfTasRestatementBitfields.value() >= 2L) && (tasRestatementBitfield2Present() && tasRestatementBitfield2.tasRestatementBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfTasRestatementBitfields.value() >= 3L) && (tasRestatementBitfield3Present() && tasRestatementBitfield3.tasRestatementBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfTasRestatementBitfields.value() >= 3L) && (tasRestatementBitfield3Present() && tasRestatementBitfield3.tasRestatementBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfTasRestatementBitfields.value() >= 3L) && (tasRestatementBitfield3Present() && tasRestatementBitfield3.tasRestatementBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfTasRestatementBitfields.value() >= 3L) && (tasRestatementBitfield3Present() && tasRestatementBitfield3.tasRestatementBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfTasRestatementBitfields.value() >= 4L) && (tasRestatementBitfield4Present() && tasRestatementBitfield4.tasRestatementBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfTasRestatementBitfields.value() >= 4L) && (tasRestatementBitfield4Present() && tasRestatementBitfield4.tasRestatementBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfTasRestatementBitfields.value() >= 5L) && (tasRestatementBitfield5Present() && tasRestatementBitfield5.tasRestatementBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfTasRestatementBitfields.value() >= 5L) && (tasRestatementBitfield5Present() && tasRestatementBitfield5.tasRestatementBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPx put it on the wire.
     *
     * <p>Decode reads the LastPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPx is on the wire
     */
    public boolean lastPxPresent() {
        return (numberOfTasRestatementBitfields.value() >= 5L) && (tasRestatementBitfield5Present() && tasRestatementBitfield5.tasRestatementBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfTasRestatementBitfields.value() >= 8L) && (tasRestatementBitfield8Present() && tasRestatementBitfield8.tasRestatementBitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfTasRestatementBitfields.value() >= 8L) && (tasRestatementBitfield8Present() && tasRestatementBitfield8.tasRestatementBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfTasRestatementBitfields.value() >= 9L) && (tasRestatementBitfield9Present() && tasRestatementBitfield9.tasRestatementBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the TradeDate put it on the wire.
     *
     * <p>Decode reads the TradeDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeDate is on the wire
     */
    public boolean tradeDatePresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12TradeDate());
    }

    /**
     * Returns whether the fields before the ClearingPrice put it on the wire.
     *
     * <p>Decode reads the ClearingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingPrice is on the wire
     */
    public boolean clearingPricePresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12ClearingPrice());
    }

    /**
     * Returns whether the fields before the ClearingSymbol put it on the wire.
     *
     * <p>Decode reads the ClearingSymbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingSymbol is on the wire
     */
    public boolean clearingSymbolPresent() {
        return (numberOfTasRestatementBitfields.value() >= 12L) && (tasRestatementBitfield12Present() && tasRestatementBitfield12.tasRestatementBitfield12ClearingSymbol());
    }

    /**
     * Returns whether the fields before the MultilegReportingType put it on the wire.
     *
     * <p>Decode reads the MultilegReportingType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultilegReportingType is on the wire
     */
    public boolean multilegReportingTypePresent() {
        return (numberOfTasRestatementBitfields.value() >= 13L) && (tasRestatementBitfield13Present() && tasRestatementBitfield13.tasRestatementBitfield13MultilegReportingType());
    }

    /**
     * Returns whether the fields before the SecondaryExecId put it on the wire.
     *
     * <p>Decode reads the SecondaryExecId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryExecId is on the wire
     */
    public boolean secondaryExecIdPresent() {
        return (numberOfTasRestatementBitfields.value() >= 14L) && (tasRestatementBitfield14Present() && tasRestatementBitfield14.tasRestatementBitfield14SecondaryExecId());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfTasRestatementBitfields.value() >= 16L) && (tasRestatementBitfield16Present() && tasRestatementBitfield16.tasRestatementBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfTasRestatementBitfields.value() >= 17L) && (tasRestatementBitfield17Present() && tasRestatementBitfield17.tasRestatementBitfield17CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != tasRestatementBitfield1 || tasRestatementBitfield1Present()) && (field != tasRestatementBitfield2 || tasRestatementBitfield2Present()) && (field != tasRestatementBitfield3 || tasRestatementBitfield3Present()) && (field != tasRestatementBitfield4 || tasRestatementBitfield4Present()) && (field != tasRestatementBitfield5 || tasRestatementBitfield5Present()) && (field != tasRestatementBitfield6 || tasRestatementBitfield6Present()) && (field != tasRestatementBitfield7 || tasRestatementBitfield7Present()) && (field != tasRestatementBitfield8 || tasRestatementBitfield8Present()) && (field != tasRestatementBitfield9 || tasRestatementBitfield9Present()) && (field != tasRestatementBitfield10 || tasRestatementBitfield10Present()) && (field != tasRestatementBitfield11 || tasRestatementBitfield11Present()) && (field != tasRestatementBitfield12 || tasRestatementBitfield12Present()) && (field != tasRestatementBitfield13 || tasRestatementBitfield13Present()) && (field != tasRestatementBitfield14 || tasRestatementBitfield14Present()) && (field != tasRestatementBitfield15 || tasRestatementBitfield15Present()) && (field != tasRestatementBitfield16 || tasRestatementBitfield16Present()) && (field != tasRestatementBitfield17 || tasRestatementBitfield17Present()) && (field != tasRestatementBitfield18 || tasRestatementBitfield18Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPx || lastPxPresent()) && (field != feeCode || feeCodePresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != tradeDate || tradeDatePresent()) && (field != clearingPrice || clearingPricePresent()) && (field != clearingSymbol || clearingSymbolPresent()) && (field != multilegReportingType || multilegReportingTypePresent()) && (field != secondaryExecId || secondaryExecIdPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (tasRestatementBitfield1Present() ? TasRestatementBitfield1Field.BYTE_LENGTH : 0) + (tasRestatementBitfield2Present() ? TasRestatementBitfield2Field.BYTE_LENGTH : 0) + (tasRestatementBitfield3Present() ? TasRestatementBitfield3Field.BYTE_LENGTH : 0) + (tasRestatementBitfield4Present() ? TasRestatementBitfield4Field.BYTE_LENGTH : 0) + (tasRestatementBitfield5Present() ? TasRestatementBitfield5Field.BYTE_LENGTH : 0) + (tasRestatementBitfield6Present() ? TasRestatementBitfield6Field.BYTE_LENGTH : 0) + (tasRestatementBitfield7Present() ? TasRestatementBitfield7Field.BYTE_LENGTH : 0) + (tasRestatementBitfield8Present() ? TasRestatementBitfield8Field.BYTE_LENGTH : 0) + (tasRestatementBitfield9Present() ? TasRestatementBitfield9Field.BYTE_LENGTH : 0) + (tasRestatementBitfield10Present() ? TasRestatementBitfield10Field.BYTE_LENGTH : 0) + (tasRestatementBitfield11Present() ? TasRestatementBitfield11Field.BYTE_LENGTH : 0) + (tasRestatementBitfield12Present() ? TasRestatementBitfield12Field.BYTE_LENGTH : 0) + (tasRestatementBitfield13Present() ? TasRestatementBitfield13Field.BYTE_LENGTH : 0) + (tasRestatementBitfield14Present() ? TasRestatementBitfield14Field.BYTE_LENGTH : 0) + (tasRestatementBitfield15Present() ? TasRestatementBitfield15Field.BYTE_LENGTH : 0) + (tasRestatementBitfield16Present() ? TasRestatementBitfield16Field.BYTE_LENGTH : 0) + (tasRestatementBitfield17Present() ? TasRestatementBitfield17Field.BYTE_LENGTH : 0) + (tasRestatementBitfield18Present() ? TasRestatementBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxPresent() ? LastPxField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (tradeDatePresent() ? TradeDateField.BYTE_LENGTH : 0) + (clearingPricePresent() ? ClearingPriceField.BYTE_LENGTH : 0) + (clearingSymbolPresent() ? ClearingSymbolField.BYTE_LENGTH : 0) + (multilegReportingTypePresent() ? MultilegReportingTypeField.BYTE_LENGTH : 0) + (secondaryExecIdPresent() ? SecondaryExecIdField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (tasRestatementBitfield1Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield2Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield3Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield4Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield5Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield6Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield7Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield8Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield9Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield10Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield11Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield12Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield13Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield14Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield15Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield16Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield17Present()) {
            cursor += 1;
        }
        if (tasRestatementBitfield18Present()) {
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
        if (!numberOfTasRestatementBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTasRestatementBitfieldsField.BYTE_LENGTH;
        if (tasRestatementBitfield1Present()) {
            if (end - cursor < TasRestatementBitfield1Field.BYTE_LENGTH || !tasRestatementBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield2Present()) {
            if (end - cursor < TasRestatementBitfield2Field.BYTE_LENGTH || !tasRestatementBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield3Present()) {
            if (end - cursor < TasRestatementBitfield3Field.BYTE_LENGTH || !tasRestatementBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield4Present()) {
            if (end - cursor < TasRestatementBitfield4Field.BYTE_LENGTH || !tasRestatementBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield5Present()) {
            if (end - cursor < TasRestatementBitfield5Field.BYTE_LENGTH || !tasRestatementBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield6Present()) {
            if (end - cursor < TasRestatementBitfield6Field.BYTE_LENGTH || !tasRestatementBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield7Present()) {
            if (end - cursor < TasRestatementBitfield7Field.BYTE_LENGTH || !tasRestatementBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield8Present()) {
            if (end - cursor < TasRestatementBitfield8Field.BYTE_LENGTH || !tasRestatementBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield9Present()) {
            if (end - cursor < TasRestatementBitfield9Field.BYTE_LENGTH || !tasRestatementBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield10Present()) {
            if (end - cursor < TasRestatementBitfield10Field.BYTE_LENGTH || !tasRestatementBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield11Present()) {
            if (end - cursor < TasRestatementBitfield11Field.BYTE_LENGTH || !tasRestatementBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield12Present()) {
            if (end - cursor < TasRestatementBitfield12Field.BYTE_LENGTH || !tasRestatementBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield13Present()) {
            if (end - cursor < TasRestatementBitfield13Field.BYTE_LENGTH || !tasRestatementBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield14Present()) {
            if (end - cursor < TasRestatementBitfield14Field.BYTE_LENGTH || !tasRestatementBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield15Present()) {
            if (end - cursor < TasRestatementBitfield15Field.BYTE_LENGTH || !tasRestatementBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield16Present()) {
            if (end - cursor < TasRestatementBitfield16Field.BYTE_LENGTH || !tasRestatementBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield17Present()) {
            if (end - cursor < TasRestatementBitfield17Field.BYTE_LENGTH || !tasRestatementBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tasRestatementBitfield18Present()) {
            if (end - cursor < TasRestatementBitfield18Field.BYTE_LENGTH || !tasRestatementBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += TasRestatementBitfield18Field.BYTE_LENGTH;
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
        if (tasRestatementBitfield1Present() != tasRestatementBitfield1.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield1.hasValue() ? "tasRestatementBitfield1 holds a value the fields before it leave off the wire" : "tasRestatementBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield2Present() != tasRestatementBitfield2.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield2.hasValue() ? "tasRestatementBitfield2 holds a value the fields before it leave off the wire" : "tasRestatementBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield3Present() != tasRestatementBitfield3.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield3.hasValue() ? "tasRestatementBitfield3 holds a value the fields before it leave off the wire" : "tasRestatementBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield4Present() != tasRestatementBitfield4.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield4.hasValue() ? "tasRestatementBitfield4 holds a value the fields before it leave off the wire" : "tasRestatementBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield5Present() != tasRestatementBitfield5.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield5.hasValue() ? "tasRestatementBitfield5 holds a value the fields before it leave off the wire" : "tasRestatementBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield6Present() != tasRestatementBitfield6.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield6.hasValue() ? "tasRestatementBitfield6 holds a value the fields before it leave off the wire" : "tasRestatementBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield7Present() != tasRestatementBitfield7.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield7.hasValue() ? "tasRestatementBitfield7 holds a value the fields before it leave off the wire" : "tasRestatementBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield8Present() != tasRestatementBitfield8.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield8.hasValue() ? "tasRestatementBitfield8 holds a value the fields before it leave off the wire" : "tasRestatementBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield9Present() != tasRestatementBitfield9.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield9.hasValue() ? "tasRestatementBitfield9 holds a value the fields before it leave off the wire" : "tasRestatementBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield10Present() != tasRestatementBitfield10.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield10.hasValue() ? "tasRestatementBitfield10 holds a value the fields before it leave off the wire" : "tasRestatementBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield11Present() != tasRestatementBitfield11.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield11.hasValue() ? "tasRestatementBitfield11 holds a value the fields before it leave off the wire" : "tasRestatementBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield12Present() != tasRestatementBitfield12.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield12.hasValue() ? "tasRestatementBitfield12 holds a value the fields before it leave off the wire" : "tasRestatementBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield13Present() != tasRestatementBitfield13.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield13.hasValue() ? "tasRestatementBitfield13 holds a value the fields before it leave off the wire" : "tasRestatementBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield14Present() != tasRestatementBitfield14.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield14.hasValue() ? "tasRestatementBitfield14 holds a value the fields before it leave off the wire" : "tasRestatementBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield15Present() != tasRestatementBitfield15.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield15.hasValue() ? "tasRestatementBitfield15 holds a value the fields before it leave off the wire" : "tasRestatementBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield16Present() != tasRestatementBitfield16.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield16.hasValue() ? "tasRestatementBitfield16 holds a value the fields before it leave off the wire" : "tasRestatementBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield17Present() != tasRestatementBitfield17.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield17.hasValue() ? "tasRestatementBitfield17 holds a value the fields before it leave off the wire" : "tasRestatementBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (tasRestatementBitfield18Present() != tasRestatementBitfield18.hasValue()) {
            throw new IllegalStateException(tasRestatementBitfield18.hasValue() ? "tasRestatementBitfield18 holds a value the fields before it leave off the wire" : "tasRestatementBitfield18 holds no value, though the fields before it put it on the wire");
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
        cursor = numberOfTasRestatementBitfields.encode(data, cursor);
        if (tasRestatementBitfield1Present()) {
            cursor = tasRestatementBitfield1.encode(data, cursor);
        }
        if (tasRestatementBitfield2Present()) {
            cursor = tasRestatementBitfield2.encode(data, cursor);
        }
        if (tasRestatementBitfield3Present()) {
            cursor = tasRestatementBitfield3.encode(data, cursor);
        }
        if (tasRestatementBitfield4Present()) {
            cursor = tasRestatementBitfield4.encode(data, cursor);
        }
        if (tasRestatementBitfield5Present()) {
            cursor = tasRestatementBitfield5.encode(data, cursor);
        }
        if (tasRestatementBitfield6Present()) {
            cursor = tasRestatementBitfield6.encode(data, cursor);
        }
        if (tasRestatementBitfield7Present()) {
            cursor = tasRestatementBitfield7.encode(data, cursor);
        }
        if (tasRestatementBitfield8Present()) {
            cursor = tasRestatementBitfield8.encode(data, cursor);
        }
        if (tasRestatementBitfield9Present()) {
            cursor = tasRestatementBitfield9.encode(data, cursor);
        }
        if (tasRestatementBitfield10Present()) {
            cursor = tasRestatementBitfield10.encode(data, cursor);
        }
        if (tasRestatementBitfield11Present()) {
            cursor = tasRestatementBitfield11.encode(data, cursor);
        }
        if (tasRestatementBitfield12Present()) {
            cursor = tasRestatementBitfield12.encode(data, cursor);
        }
        if (tasRestatementBitfield13Present()) {
            cursor = tasRestatementBitfield13.encode(data, cursor);
        }
        if (tasRestatementBitfield14Present()) {
            cursor = tasRestatementBitfield14.encode(data, cursor);
        }
        if (tasRestatementBitfield15Present()) {
            cursor = tasRestatementBitfield15.encode(data, cursor);
        }
        if (tasRestatementBitfield16Present()) {
            cursor = tasRestatementBitfield16.encode(data, cursor);
        }
        if (tasRestatementBitfield17Present()) {
            cursor = tasRestatementBitfield17.encode(data, cursor);
        }
        if (tasRestatementBitfield18Present()) {
            cursor = tasRestatementBitfield18.encode(data, cursor);
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
            case "NumberOfTasRestatementBitfields" -> Optional.of(numberOfTasRestatementBitfields);
            case "TasRestatementBitfield1" -> Optional.of(tasRestatementBitfield1);
            case "TasRestatementBitfield2" -> Optional.of(tasRestatementBitfield2);
            case "TasRestatementBitfield3" -> Optional.of(tasRestatementBitfield3);
            case "TasRestatementBitfield4" -> Optional.of(tasRestatementBitfield4);
            case "TasRestatementBitfield5" -> Optional.of(tasRestatementBitfield5);
            case "TasRestatementBitfield6" -> Optional.of(tasRestatementBitfield6);
            case "TasRestatementBitfield7" -> Optional.of(tasRestatementBitfield7);
            case "TasRestatementBitfield8" -> Optional.of(tasRestatementBitfield8);
            case "TasRestatementBitfield9" -> Optional.of(tasRestatementBitfield9);
            case "TasRestatementBitfield10" -> Optional.of(tasRestatementBitfield10);
            case "TasRestatementBitfield11" -> Optional.of(tasRestatementBitfield11);
            case "TasRestatementBitfield12" -> Optional.of(tasRestatementBitfield12);
            case "TasRestatementBitfield13" -> Optional.of(tasRestatementBitfield13);
            case "TasRestatementBitfield14" -> Optional.of(tasRestatementBitfield14);
            case "TasRestatementBitfield15" -> Optional.of(tasRestatementBitfield15);
            case "TasRestatementBitfield16" -> Optional.of(tasRestatementBitfield16);
            case "TasRestatementBitfield17" -> Optional.of(tasRestatementBitfield17);
            case "TasRestatementBitfield18" -> Optional.of(tasRestatementBitfield18);
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
            case "PreventMatch" -> Optional.of(preventMatch);
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
        if (!(other instanceof TasRestatementNewOrderMessageMessage message)) {
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
        if (!(other instanceof TasRestatementNewOrderMessageMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
