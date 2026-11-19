package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.AlgorithmicIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ClearingFirmField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ClientIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ClientQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ContraBrokerField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.CorrectedSizeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.CurrencyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.DeferralReasonField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.EchoTextField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ExecInstField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ExecutorIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.ExecutorQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.FeeCodeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.IdSourceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.InvestorIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.InvestorQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.LargeSizeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.LastMktField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.LastPxTradePriceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.LastSharesField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.LiquidityProvisionField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.NoSidesField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.NumberOfTradeCaptureConfirmV2BitfieldsField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.OrderCategoryField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.OrderOriginationField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.OrderQtyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.PriceFormationField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.RptTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.SecurityExchangeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.SecurityIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.SymbolField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TextField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield10Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield11Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield12Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield13Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield14Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield1Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield2Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield3Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield4Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield5Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield6Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield7Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield8Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeCaptureConfirmV2Bitfield9Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradePublishIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeReportIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeReportRefIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TradeReportTypeReturnField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.TransactionTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.fields.WaiverTypeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.groups.TradeCaptureConfirmV2TrdCapAckSideGrpEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.groups.TradeCaptureConfirmV2TrdCapAckSideGrpList;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.types.Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.types.PrintOptions;

/**
 * Represents the TradeCaptureConfirmV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Capture Confirm V2 Message.</p>
 */
public final class TradeCaptureConfirmV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 75;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Confirm V 2 Message";

    /**
     * The time the event occurred in the Bats match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to TradeReportID (571) in Bats FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Bats only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique.
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Trade Report Ref Id
     */
    private final TradeReportRefIdField tradeReportRefId = new TradeReportRefIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Corresponds to LastShares (32) in Bats FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Corresponds to LastPx (31) in Bats FIX. Price of this fill.
     */
    private final LastPxTradePriceField lastPxTradePrice = new LastPxTradePriceField();

    /**
     * Corresponds to ContraBroker (375) in Bats FIX. Indicates the market of execution. A value of LP identifies an execution from an external liquidity provider, all other markets are identified by their ISO Market Identification Code (MIC)12
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfTradeCaptureConfirmV2BitfieldsField numberOfTradeCaptureConfirmV2Bitfields = new NumberOfTradeCaptureConfirmV2BitfieldsField();

    /**
     * BitSet TradeCaptureConfirmV2 byte 1.
     */
    private final TradeCaptureConfirmV2Bitfield1Field tradeCaptureConfirmV2Bitfield1 = new TradeCaptureConfirmV2Bitfield1Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 2.
     */
    private final TradeCaptureConfirmV2Bitfield2Field tradeCaptureConfirmV2Bitfield2 = new TradeCaptureConfirmV2Bitfield2Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 3.
     */
    private final TradeCaptureConfirmV2Bitfield3Field tradeCaptureConfirmV2Bitfield3 = new TradeCaptureConfirmV2Bitfield3Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 4.
     */
    private final TradeCaptureConfirmV2Bitfield4Field tradeCaptureConfirmV2Bitfield4 = new TradeCaptureConfirmV2Bitfield4Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 5.
     */
    private final TradeCaptureConfirmV2Bitfield5Field tradeCaptureConfirmV2Bitfield5 = new TradeCaptureConfirmV2Bitfield5Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 6.
     */
    private final TradeCaptureConfirmV2Bitfield6Field tradeCaptureConfirmV2Bitfield6 = new TradeCaptureConfirmV2Bitfield6Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 7.
     */
    private final TradeCaptureConfirmV2Bitfield7Field tradeCaptureConfirmV2Bitfield7 = new TradeCaptureConfirmV2Bitfield7Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 8.
     */
    private final TradeCaptureConfirmV2Bitfield8Field tradeCaptureConfirmV2Bitfield8 = new TradeCaptureConfirmV2Bitfield8Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 9.
     */
    private final TradeCaptureConfirmV2Bitfield9Field tradeCaptureConfirmV2Bitfield9 = new TradeCaptureConfirmV2Bitfield9Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 10.
     */
    private final TradeCaptureConfirmV2Bitfield10Field tradeCaptureConfirmV2Bitfield10 = new TradeCaptureConfirmV2Bitfield10Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 11.
     */
    private final TradeCaptureConfirmV2Bitfield11Field tradeCaptureConfirmV2Bitfield11 = new TradeCaptureConfirmV2Bitfield11Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 12.
     */
    private final TradeCaptureConfirmV2Bitfield12Field tradeCaptureConfirmV2Bitfield12 = new TradeCaptureConfirmV2Bitfield12Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 13.
     */
    private final TradeCaptureConfirmV2Bitfield13Field tradeCaptureConfirmV2Bitfield13 = new TradeCaptureConfirmV2Bitfield13Field();

    /**
     * BitSet TradeCaptureConfirmV2 byte 14.
     */
    private final TradeCaptureConfirmV2Bitfield14Field tradeCaptureConfirmV2Bitfield14 = new TradeCaptureConfirmV2Bitfield14Field();

    /**
     * Corresponds to NoSides (552) in Bats FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     */
    private final NoSidesField noSides = new NoSidesField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OrderQty (38) in Bats FIX. Order quantity. System limit is 99,999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Corrected Size
     */
    private final CorrectedSizeField correctedSize = new CorrectedSizeField();

    /**
     * Trade Report Type Return
     */
    private final TradeReportTypeReturnField tradeReportTypeReturn = new TradeReportTypeReturnField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Rpt Time
     */
    private final RptTimeField rptTime = new RptTimeField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Large Size
     */
    private final LargeSizeField largeSize = new LargeSizeField();

    /**
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

    /**
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Waiver Type
     */
    private final WaiverTypeField waiverType = new WaiverTypeField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

    /**
     * Client Id
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Investor Id
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * Executor Id
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Deferral Reason
     */
    private final DeferralReasonField deferralReason = new DeferralReasonField();

    /**
     * Investor Qualified Role
     */
    private final InvestorQualifiedRoleField investorQualifiedRole = new InvestorQualifiedRoleField();

    /**
     * Executor Qualified Role
     */
    private final ExecutorQualifiedRoleField executorQualifiedRole = new ExecutorQualifiedRoleField();

    /**
     * Repeating group stated NoSides times.
     */
    private final TradeCaptureConfirmV2TrdCapAckSideGrpList tradeCaptureConfirmV2TrdCapAckSideGrp = new TradeCaptureConfirmV2TrdCapAckSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradeReportId, tradeReportRefId, tradeId, lastShares, lastPxTradePrice, contraBroker, numberOfTradeCaptureConfirmV2Bitfields, tradeCaptureConfirmV2Bitfield1, tradeCaptureConfirmV2Bitfield2, tradeCaptureConfirmV2Bitfield3, tradeCaptureConfirmV2Bitfield4, tradeCaptureConfirmV2Bitfield5, tradeCaptureConfirmV2Bitfield6, tradeCaptureConfirmV2Bitfield7, tradeCaptureConfirmV2Bitfield8, tradeCaptureConfirmV2Bitfield9, tradeCaptureConfirmV2Bitfield10, tradeCaptureConfirmV2Bitfield11, tradeCaptureConfirmV2Bitfield12, tradeCaptureConfirmV2Bitfield13, tradeCaptureConfirmV2Bitfield14, noSides, execInst, symbol, currency, idSource, securityId, securityExchange, clearingFirm, orderQty, correctedSize, tradeReportTypeReturn, tradePublishIndicator, rptTime, text, largeSize, lastMkt, feeCode, echoText, orderCategory, liquidityProvision, waiverType, priceFormation, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, deferralReason, investorQualifiedRole, executorQualifiedRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Bats match- ing engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to TradeReportID (571) in Bats FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Bats only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique.
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Trade Report Ref Id
     *
     * @return the TradeReportRefId field
     */
    public TradeReportRefIdField tradeReportRefId() {
        return tradeReportRefId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Corresponds to LastShares (32) in Bats FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Corresponds to LastPx (31) in Bats FIX. Price of this fill.
     *
     * @return the LastPxTradePrice field
     */
    public LastPxTradePriceField lastPxTradePrice() {
        return lastPxTradePrice;
    }

    /**
     * Corresponds to ContraBroker (375) in Bats FIX. Indicates the market of execution. A value of LP identifies an execution from an external liquidity provider, all other markets are identified by their ISO Market Identification Code (MIC)12
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfTradeCaptureConfirmV2Bitfields field
     */
    public NumberOfTradeCaptureConfirmV2BitfieldsField numberOfTradeCaptureConfirmV2Bitfields() {
        return numberOfTradeCaptureConfirmV2Bitfields;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 1.
     *
     * @return the TradeCaptureConfirmV2Bitfield1 field
     */
    public TradeCaptureConfirmV2Bitfield1Field tradeCaptureConfirmV2Bitfield1() {
        return tradeCaptureConfirmV2Bitfield1;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 2.
     *
     * @return the TradeCaptureConfirmV2Bitfield2 field
     */
    public TradeCaptureConfirmV2Bitfield2Field tradeCaptureConfirmV2Bitfield2() {
        return tradeCaptureConfirmV2Bitfield2;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 3.
     *
     * @return the TradeCaptureConfirmV2Bitfield3 field
     */
    public TradeCaptureConfirmV2Bitfield3Field tradeCaptureConfirmV2Bitfield3() {
        return tradeCaptureConfirmV2Bitfield3;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 4.
     *
     * @return the TradeCaptureConfirmV2Bitfield4 field
     */
    public TradeCaptureConfirmV2Bitfield4Field tradeCaptureConfirmV2Bitfield4() {
        return tradeCaptureConfirmV2Bitfield4;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 5.
     *
     * @return the TradeCaptureConfirmV2Bitfield5 field
     */
    public TradeCaptureConfirmV2Bitfield5Field tradeCaptureConfirmV2Bitfield5() {
        return tradeCaptureConfirmV2Bitfield5;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 6.
     *
     * @return the TradeCaptureConfirmV2Bitfield6 field
     */
    public TradeCaptureConfirmV2Bitfield6Field tradeCaptureConfirmV2Bitfield6() {
        return tradeCaptureConfirmV2Bitfield6;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 7.
     *
     * @return the TradeCaptureConfirmV2Bitfield7 field
     */
    public TradeCaptureConfirmV2Bitfield7Field tradeCaptureConfirmV2Bitfield7() {
        return tradeCaptureConfirmV2Bitfield7;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 8.
     *
     * @return the TradeCaptureConfirmV2Bitfield8 field
     */
    public TradeCaptureConfirmV2Bitfield8Field tradeCaptureConfirmV2Bitfield8() {
        return tradeCaptureConfirmV2Bitfield8;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 9.
     *
     * @return the TradeCaptureConfirmV2Bitfield9 field
     */
    public TradeCaptureConfirmV2Bitfield9Field tradeCaptureConfirmV2Bitfield9() {
        return tradeCaptureConfirmV2Bitfield9;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 10.
     *
     * @return the TradeCaptureConfirmV2Bitfield10 field
     */
    public TradeCaptureConfirmV2Bitfield10Field tradeCaptureConfirmV2Bitfield10() {
        return tradeCaptureConfirmV2Bitfield10;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 11.
     *
     * @return the TradeCaptureConfirmV2Bitfield11 field
     */
    public TradeCaptureConfirmV2Bitfield11Field tradeCaptureConfirmV2Bitfield11() {
        return tradeCaptureConfirmV2Bitfield11;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 12.
     *
     * @return the TradeCaptureConfirmV2Bitfield12 field
     */
    public TradeCaptureConfirmV2Bitfield12Field tradeCaptureConfirmV2Bitfield12() {
        return tradeCaptureConfirmV2Bitfield12;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 13.
     *
     * @return the TradeCaptureConfirmV2Bitfield13 field
     */
    public TradeCaptureConfirmV2Bitfield13Field tradeCaptureConfirmV2Bitfield13() {
        return tradeCaptureConfirmV2Bitfield13;
    }

    /**
     * BitSet TradeCaptureConfirmV2 byte 14.
     *
     * @return the TradeCaptureConfirmV2Bitfield14 field
     */
    public TradeCaptureConfirmV2Bitfield14Field tradeCaptureConfirmV2Bitfield14() {
        return tradeCaptureConfirmV2Bitfield14;
    }

    /**
     * Corresponds to NoSides (552) in Bats FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
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
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
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
     * Corresponds to OrderQty (38) in Bats FIX. Order quantity. System limit is 99,999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Corrected Size
     *
     * @return the CorrectedSize field
     */
    public CorrectedSizeField correctedSize() {
        return correctedSize;
    }

    /**
     * Trade Report Type Return
     *
     * @return the TradeReportTypeReturn field
     */
    public TradeReportTypeReturnField tradeReportTypeReturn() {
        return tradeReportTypeReturn;
    }

    /**
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * Rpt Time
     *
     * @return the RptTime field
     */
    public RptTimeField rptTime() {
        return rptTime;
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
     * Large Size
     *
     * @return the LargeSize field
     */
    public LargeSizeField largeSize() {
        return largeSize;
    }

    /**
     * Last Mkt
     *
     * @return the LastMkt field
     */
    public LastMktField lastMkt() {
        return lastMkt;
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
     * Order Category
     *
     * @return the OrderCategory field
     */
    public OrderCategoryField orderCategory() {
        return orderCategory;
    }

    /**
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Waiver Type
     *
     * @return the WaiverType field
     */
    public WaiverTypeField waiverType() {
        return waiverType;
    }

    /**
     * Price Formation
     *
     * @return the PriceFormation field
     */
    public PriceFormationField priceFormation() {
        return priceFormation;
    }

    /**
     * Client Qualified Role
     *
     * @return the ClientQualifiedRole field
     */
    public ClientQualifiedRoleField clientQualifiedRole() {
        return clientQualifiedRole;
    }

    /**
     * Client Id
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Investor Id
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * Executor Id
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Deferral Reason
     *
     * @return the DeferralReason field
     */
    public DeferralReasonField deferralReason() {
        return deferralReason;
    }

    /**
     * Investor Qualified Role
     *
     * @return the InvestorQualifiedRole field
     */
    public InvestorQualifiedRoleField investorQualifiedRole() {
        return investorQualifiedRole;
    }

    /**
     * Executor Qualified Role
     *
     * @return the ExecutorQualifiedRole field
     */
    public ExecutorQualifiedRoleField executorQualifiedRole() {
        return executorQualifiedRole;
    }

    /**
     * Repeating group stated NoSides times.
     *
     * <p>Encode writes this list's size to the NoSides field.</p>
     *
     * @return the TradeCaptureConfirmV2TrdCapAckSideGrp entries
     */
    public TradeCaptureConfirmV2TrdCapAckSideGrpList tradeCaptureConfirmV2TrdCapAckSideGrp() {
        return tradeCaptureConfirmV2TrdCapAckSideGrp;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield1 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield1Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield2 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield2Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield3 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield3Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield4 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield4Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield5 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield5Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield6 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield6Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield7 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield7Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield8 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield8Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield9 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield9Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield10 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield10Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield11 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield11Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield12 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield12Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield13 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield13Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCaptureConfirmV2Bitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureConfirmV2Bitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureConfirmV2Bitfield14 is on the wire
     */
    public boolean tradeCaptureConfirmV2Bitfield14Present() {
        return numberOfTradeCaptureConfirmV2Bitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 1L) && (tradeCaptureConfirmV2Bitfield1Present() && tradeCaptureConfirmV2Bitfield1.tradeCaptureConfirmV2Bitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L) && (tradeCaptureConfirmV2Bitfield2Present() && tradeCaptureConfirmV2Bitfield2.tradeCaptureConfirmV2Bitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L) && (tradeCaptureConfirmV2Bitfield2Present() && tradeCaptureConfirmV2Bitfield2.tradeCaptureConfirmV2Bitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L) && (tradeCaptureConfirmV2Bitfield2Present() && tradeCaptureConfirmV2Bitfield2.tradeCaptureConfirmV2Bitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L) && (tradeCaptureConfirmV2Bitfield2Present() && tradeCaptureConfirmV2Bitfield2.tradeCaptureConfirmV2Bitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 2L) && (tradeCaptureConfirmV2Bitfield2Present() && tradeCaptureConfirmV2Bitfield2.tradeCaptureConfirmV2Bitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 3L) && (tradeCaptureConfirmV2Bitfield3Present() && tradeCaptureConfirmV2Bitfield3.tradeCaptureConfirmV2Bitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 3L) && (tradeCaptureConfirmV2Bitfield3Present() && tradeCaptureConfirmV2Bitfield3.tradeCaptureConfirmV2Bitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 4L) && (tradeCaptureConfirmV2Bitfield4Present() && tradeCaptureConfirmV2Bitfield4.tradeCaptureConfirmV2Bitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the TradeReportTypeReturn put it on the wire.
     *
     * <p>Decode reads the TradeReportTypeReturn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTypeReturn is on the wire
     */
    public boolean tradeReportTypeReturnPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7TradeReportTypeReturn());
    }

    /**
     * Returns whether the fields before the TradePublishIndicator put it on the wire.
     *
     * <p>Decode reads the TradePublishIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePublishIndicator is on the wire
     */
    public boolean tradePublishIndicatorPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the RptTime put it on the wire.
     *
     * <p>Decode reads the RptTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RptTime is on the wire
     */
    public boolean rptTimePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the Text put it on the wire.
     *
     * <p>Decode reads the Text where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Text is on the wire
     */
    public boolean textPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7Text());
    }

    /**
     * Returns whether the fields before the LargeSize put it on the wire.
     *
     * <p>Decode reads the LargeSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LargeSize is on the wire
     */
    public boolean largeSizePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7LargeSize());
    }

    /**
     * Returns whether the fields before the LastMkt put it on the wire.
     *
     * <p>Decode reads the LastMkt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastMkt is on the wire
     */
    public boolean lastMktPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 7L) && (tradeCaptureConfirmV2Bitfield7Present() && tradeCaptureConfirmV2Bitfield7.tradeCaptureConfirmV2Bitfield7LastMkt());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 8L) && (tradeCaptureConfirmV2Bitfield8Present() && tradeCaptureConfirmV2Bitfield8.tradeCaptureConfirmV2Bitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 8L) && (tradeCaptureConfirmV2Bitfield8Present() && tradeCaptureConfirmV2Bitfield8.tradeCaptureConfirmV2Bitfield8EchoText());
    }

    /**
     * Returns whether the fields before the OrderCategory put it on the wire.
     *
     * <p>Decode reads the OrderCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCategory is on the wire
     */
    public boolean orderCategoryPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 9L) && (tradeCaptureConfirmV2Bitfield9Present() && tradeCaptureConfirmV2Bitfield9.tradeCaptureConfirmV2Bitfield9OrderCategory());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 9L) && (tradeCaptureConfirmV2Bitfield9Present() && tradeCaptureConfirmV2Bitfield9.tradeCaptureConfirmV2Bitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 10L) && (tradeCaptureConfirmV2Bitfield10Present() && tradeCaptureConfirmV2Bitfield10.tradeCaptureConfirmV2Bitfield10WaiverType());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 10L) && (tradeCaptureConfirmV2Bitfield10Present() && tradeCaptureConfirmV2Bitfield10.tradeCaptureConfirmV2Bitfield10PriceFormation());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 10L) && (tradeCaptureConfirmV2Bitfield10Present() && tradeCaptureConfirmV2Bitfield10.tradeCaptureConfirmV2Bitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the DeferralReason put it on the wire.
     *
     * <p>Decode reads the DeferralReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DeferralReason is on the wire
     */
    public boolean deferralReasonPresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11DeferralReason());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfTradeCaptureConfirmV2Bitfields.value() >= 11L) && (tradeCaptureConfirmV2Bitfield11Present() && tradeCaptureConfirmV2Bitfield11.tradeCaptureConfirmV2Bitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureConfirmV2Bitfield1 || tradeCaptureConfirmV2Bitfield1Present()) && (field != tradeCaptureConfirmV2Bitfield2 || tradeCaptureConfirmV2Bitfield2Present()) && (field != tradeCaptureConfirmV2Bitfield3 || tradeCaptureConfirmV2Bitfield3Present()) && (field != tradeCaptureConfirmV2Bitfield4 || tradeCaptureConfirmV2Bitfield4Present()) && (field != tradeCaptureConfirmV2Bitfield5 || tradeCaptureConfirmV2Bitfield5Present()) && (field != tradeCaptureConfirmV2Bitfield6 || tradeCaptureConfirmV2Bitfield6Present()) && (field != tradeCaptureConfirmV2Bitfield7 || tradeCaptureConfirmV2Bitfield7Present()) && (field != tradeCaptureConfirmV2Bitfield8 || tradeCaptureConfirmV2Bitfield8Present()) && (field != tradeCaptureConfirmV2Bitfield9 || tradeCaptureConfirmV2Bitfield9Present()) && (field != tradeCaptureConfirmV2Bitfield10 || tradeCaptureConfirmV2Bitfield10Present()) && (field != tradeCaptureConfirmV2Bitfield11 || tradeCaptureConfirmV2Bitfield11Present()) && (field != tradeCaptureConfirmV2Bitfield12 || tradeCaptureConfirmV2Bitfield12Present()) && (field != tradeCaptureConfirmV2Bitfield13 || tradeCaptureConfirmV2Bitfield13Present()) && (field != tradeCaptureConfirmV2Bitfield14 || tradeCaptureConfirmV2Bitfield14Present()) && (field != execInst || execInstPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQty || orderQtyPresent()) && (field != correctedSize || correctedSizePresent()) && (field != tradeReportTypeReturn || tradeReportTypeReturnPresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != rptTime || rptTimePresent()) && (field != text || textPresent()) && (field != largeSize || largeSizePresent()) && (field != lastMkt || lastMktPresent()) && (field != feeCode || feeCodePresent()) && (field != echoText || echoTextPresent()) && (field != orderCategory || orderCategoryPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != waiverType || waiverTypePresent()) && (field != priceFormation || priceFormationPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != deferralReason || deferralReasonPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        tradeCaptureConfirmV2TrdCapAckSideGrp.inputs(OptionalLong.of(numberOfTradeCaptureConfirmV2Bitfields.value()), tradeCaptureConfirmV2Bitfield1Present() ? OptionalLong.of(tradeCaptureConfirmV2Bitfield1.value()) : OptionalLong.empty(), tradeCaptureConfirmV2Bitfield2Present() ? OptionalLong.of(tradeCaptureConfirmV2Bitfield2.value()) : OptionalLong.empty(), tradeCaptureConfirmV2Bitfield3Present() ? OptionalLong.of(tradeCaptureConfirmV2Bitfield3.value()) : OptionalLong.empty(), tradeCaptureConfirmV2Bitfield4Present() ? OptionalLong.of(tradeCaptureConfirmV2Bitfield4.value()) : OptionalLong.empty(), tradeCaptureConfirmV2Bitfield6Present() ? OptionalLong.of(tradeCaptureConfirmV2Bitfield6.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (tradeCaptureConfirmV2Bitfield1Present() ? TradeCaptureConfirmV2Bitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield2Present() ? TradeCaptureConfirmV2Bitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield3Present() ? TradeCaptureConfirmV2Bitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield4Present() ? TradeCaptureConfirmV2Bitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield5Present() ? TradeCaptureConfirmV2Bitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield6Present() ? TradeCaptureConfirmV2Bitfield6Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield7Present() ? TradeCaptureConfirmV2Bitfield7Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield8Present() ? TradeCaptureConfirmV2Bitfield8Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield9Present() ? TradeCaptureConfirmV2Bitfield9Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield10Present() ? TradeCaptureConfirmV2Bitfield10Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield11Present() ? TradeCaptureConfirmV2Bitfield11Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield12Present() ? TradeCaptureConfirmV2Bitfield12Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield13Present() ? TradeCaptureConfirmV2Bitfield13Field.BYTE_LENGTH : 0) + (tradeCaptureConfirmV2Bitfield14Present() ? TradeCaptureConfirmV2Bitfield14Field.BYTE_LENGTH : 0) + tradeCaptureConfirmV2TrdCapAckSideGrp.byteLength() + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (tradeReportTypeReturnPresent() ? TradeReportTypeReturnField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (rptTimePresent() ? RptTimeField.BYTE_LENGTH : 0) + (textPresent() ? TextField.BYTE_LENGTH : 0) + (largeSizePresent() ? LargeSizeField.BYTE_LENGTH : 0) + (lastMktPresent() ? LastMktField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (orderCategoryPresent() ? OrderCategoryField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (deferralReasonPresent() ? DeferralReasonField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        cursor += 20;
        cursor += 8;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (tradeCaptureConfirmV2Bitfield1Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield2Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield3Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield4Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield5Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield6Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield7Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield8Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield9Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield10Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield11Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield12Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield13Present()) {
            cursor += 1;
        }
        if (tradeCaptureConfirmV2Bitfield14Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += tradeCaptureConfirmV2TrdCapAckSideGrp.byteLength();
        if (execInstPresent()) {
            cursor += 1;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (currencyPresent()) {
            cursor += 3;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (securityExchangePresent()) {
            cursor += 4;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (correctedSizePresent()) {
            cursor += 4;
        }
        if (tradeReportTypeReturnPresent()) {
            cursor += 2;
        }
        if (tradePublishIndicatorPresent()) {
            cursor += 1;
        }
        if (rptTimePresent()) {
            cursor += 8;
        }
        if (textPresent()) {
            cursor += 60;
        }
        if (largeSizePresent()) {
            cursor += 8;
        }
        if (lastMktPresent()) {
            cursor += 4;
        }
        if (feeCodePresent()) {
            cursor += 2;
        }
        if (echoTextPresent()) {
            cursor += 64;
        }
        if (orderCategoryPresent()) {
            cursor += 1;
        }
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (waiverTypePresent()) {
            cursor += 1;
        }
        if (priceFormationPresent()) {
            cursor += 1;
        }
        if (clientQualifiedRolePresent()) {
            cursor += 1;
        }
        if (clientIdPresent()) {
            cursor += 4;
        }
        if (investorIdPresent()) {
            cursor += 4;
        }
        if (executorIdPresent()) {
            cursor += 4;
        }
        if (orderOriginationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
            cursor += 1;
        }
        if (deferralReasonPresent()) {
            cursor += 1;
        }
        if (investorQualifiedRolePresent()) {
            cursor += 1;
        }
        if (executorQualifiedRolePresent()) {
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
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!tradeReportRefId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportRefIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPxTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxTradePriceField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfTradeCaptureConfirmV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradeCaptureConfirmV2BitfieldsField.BYTE_LENGTH;
        if (tradeCaptureConfirmV2Bitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield1Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield2Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield3Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield4Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield5Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield6Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield6Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield7Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield7Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield8Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield8Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield9Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield9Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield10Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield10Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield11Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield11Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield12Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield12Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield13Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield13Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureConfirmV2Bitfield14Present()) {
            if (end - 1 - cursor < TradeCaptureConfirmV2Bitfield14Field.BYTE_LENGTH || !tradeCaptureConfirmV2Bitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureConfirmV2Bitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!tradeCaptureConfirmV2TrdCapAckSideGrp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += tradeCaptureConfirmV2TrdCapAckSideGrp.byteLength();
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
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (currencyPresent()) {
            if (end - cursor < CurrencyField.BYTE_LENGTH || !currency.parse(data, cursor)) {
                return false;
            }
            cursor += CurrencyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityExchangePresent()) {
            if (end - cursor < SecurityExchangeField.BYTE_LENGTH || !securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
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
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (correctedSizePresent()) {
            if (end - cursor < CorrectedSizeField.BYTE_LENGTH || !correctedSize.parse(data, cursor)) {
                return false;
            }
            cursor += CorrectedSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportTypeReturnPresent()) {
            if (end - cursor < TradeReportTypeReturnField.BYTE_LENGTH || !tradeReportTypeReturn.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportTypeReturnField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradePublishIndicatorPresent()) {
            if (end - cursor < TradePublishIndicatorField.BYTE_LENGTH || !tradePublishIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += TradePublishIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (rptTimePresent()) {
            if (end - cursor < RptTimeField.BYTE_LENGTH || !rptTime.parse(data, cursor)) {
                return false;
            }
            cursor += RptTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (textPresent()) {
            if (end - cursor < TextField.BYTE_LENGTH || !text.parse(data, cursor)) {
                return false;
            }
            cursor += TextField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (largeSizePresent()) {
            if (end - cursor < LargeSizeField.BYTE_LENGTH || !largeSize.parse(data, cursor)) {
                return false;
            }
            cursor += LargeSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastMktPresent()) {
            if (end - cursor < LastMktField.BYTE_LENGTH || !lastMkt.parse(data, cursor)) {
                return false;
            }
            cursor += LastMktField.BYTE_LENGTH;
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
        if (orderCategoryPresent()) {
            if (end - cursor < OrderCategoryField.BYTE_LENGTH || !orderCategory.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCategoryField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (waiverTypePresent()) {
            if (end - cursor < WaiverTypeField.BYTE_LENGTH || !waiverType.parse(data, cursor)) {
                return false;
            }
            cursor += WaiverTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceFormationPresent()) {
            if (end - cursor < PriceFormationField.BYTE_LENGTH || !priceFormation.parse(data, cursor)) {
                return false;
            }
            cursor += PriceFormationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientQualifiedRolePresent()) {
            if (end - cursor < ClientQualifiedRoleField.BYTE_LENGTH || !clientQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ClientQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientIdPresent()) {
            if (end - cursor < ClientIdField.BYTE_LENGTH || !clientId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (investorIdPresent()) {
            if (end - cursor < InvestorIdField.BYTE_LENGTH || !investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorIdPresent()) {
            if (end - cursor < ExecutorIdField.BYTE_LENGTH || !executorId.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderOriginationPresent()) {
            if (end - cursor < OrderOriginationField.BYTE_LENGTH || !orderOrigination.parse(data, cursor)) {
                return false;
            }
            cursor += OrderOriginationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (algorithmicIndicatorPresent()) {
            if (end - cursor < AlgorithmicIndicatorField.BYTE_LENGTH || !algorithmicIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (deferralReasonPresent()) {
            if (end - cursor < DeferralReasonField.BYTE_LENGTH || !deferralReason.parse(data, cursor)) {
                return false;
            }
            cursor += DeferralReasonField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (investorQualifiedRolePresent()) {
            if (end - cursor < InvestorQualifiedRoleField.BYTE_LENGTH || !investorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorQualifiedRolePresent()) {
            if (end - cursor < ExecutorQualifiedRoleField.BYTE_LENGTH || !executorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorQualifiedRoleField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeCaptureConfirmV2TrdCapAckSideGrp.size() > 255) {
            throw new IllegalStateException("tradeCaptureConfirmV2TrdCapAckSideGrp holds " + tradeCaptureConfirmV2TrdCapAckSideGrp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) tradeCaptureConfirmV2TrdCapAckSideGrp.size());
        if (tradeCaptureConfirmV2Bitfield1Present() != tradeCaptureConfirmV2Bitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield1.hasValue() ? "tradeCaptureConfirmV2Bitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield2Present() != tradeCaptureConfirmV2Bitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield2.hasValue() ? "tradeCaptureConfirmV2Bitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield3Present() != tradeCaptureConfirmV2Bitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield3.hasValue() ? "tradeCaptureConfirmV2Bitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield4Present() != tradeCaptureConfirmV2Bitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield4.hasValue() ? "tradeCaptureConfirmV2Bitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield5Present() != tradeCaptureConfirmV2Bitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield5.hasValue() ? "tradeCaptureConfirmV2Bitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield6Present() != tradeCaptureConfirmV2Bitfield6.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield6.hasValue() ? "tradeCaptureConfirmV2Bitfield6 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield7Present() != tradeCaptureConfirmV2Bitfield7.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield7.hasValue() ? "tradeCaptureConfirmV2Bitfield7 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield8Present() != tradeCaptureConfirmV2Bitfield8.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield8.hasValue() ? "tradeCaptureConfirmV2Bitfield8 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield9Present() != tradeCaptureConfirmV2Bitfield9.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield9.hasValue() ? "tradeCaptureConfirmV2Bitfield9 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield10Present() != tradeCaptureConfirmV2Bitfield10.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield10.hasValue() ? "tradeCaptureConfirmV2Bitfield10 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield11Present() != tradeCaptureConfirmV2Bitfield11.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield11.hasValue() ? "tradeCaptureConfirmV2Bitfield11 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield12Present() != tradeCaptureConfirmV2Bitfield12.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield12.hasValue() ? "tradeCaptureConfirmV2Bitfield12 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield13Present() != tradeCaptureConfirmV2Bitfield13.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield13.hasValue() ? "tradeCaptureConfirmV2Bitfield13 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureConfirmV2Bitfield14Present() != tradeCaptureConfirmV2Bitfield14.hasValue()) {
            throw new IllegalStateException(tradeCaptureConfirmV2Bitfield14.hasValue() ? "tradeCaptureConfirmV2Bitfield14 holds a value the fields before it leave off the wire" : "tradeCaptureConfirmV2Bitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (currencyPresent() != currency.hasValue()) {
            throw new IllegalStateException(currency.hasValue() ? "currency holds a value the fields before it leave off the wire" : "currency holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (securityExchangePresent() != securityExchange.hasValue()) {
            throw new IllegalStateException(securityExchange.hasValue() ? "securityExchange holds a value the fields before it leave off the wire" : "securityExchange holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (correctedSizePresent() != correctedSize.hasValue()) {
            throw new IllegalStateException(correctedSize.hasValue() ? "correctedSize holds a value the fields before it leave off the wire" : "correctedSize holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportTypeReturnPresent() != tradeReportTypeReturn.hasValue()) {
            throw new IllegalStateException(tradeReportTypeReturn.hasValue() ? "tradeReportTypeReturn holds a value the fields before it leave off the wire" : "tradeReportTypeReturn holds no value, though the fields before it put it on the wire");
        }
        if (tradePublishIndicatorPresent() != tradePublishIndicator.hasValue()) {
            throw new IllegalStateException(tradePublishIndicator.hasValue() ? "tradePublishIndicator holds a value the fields before it leave off the wire" : "tradePublishIndicator holds no value, though the fields before it put it on the wire");
        }
        if (rptTimePresent() != rptTime.hasValue()) {
            throw new IllegalStateException(rptTime.hasValue() ? "rptTime holds a value the fields before it leave off the wire" : "rptTime holds no value, though the fields before it put it on the wire");
        }
        if (textPresent() != text.hasValue()) {
            throw new IllegalStateException(text.hasValue() ? "text holds a value the fields before it leave off the wire" : "text holds no value, though the fields before it put it on the wire");
        }
        if (largeSizePresent() != largeSize.hasValue()) {
            throw new IllegalStateException(largeSize.hasValue() ? "largeSize holds a value the fields before it leave off the wire" : "largeSize holds no value, though the fields before it put it on the wire");
        }
        if (lastMktPresent() != lastMkt.hasValue()) {
            throw new IllegalStateException(lastMkt.hasValue() ? "lastMkt holds a value the fields before it leave off the wire" : "lastMkt holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
        }
        if (orderCategoryPresent() != orderCategory.hasValue()) {
            throw new IllegalStateException(orderCategory.hasValue() ? "orderCategory holds a value the fields before it leave off the wire" : "orderCategory holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (waiverTypePresent() != waiverType.hasValue()) {
            throw new IllegalStateException(waiverType.hasValue() ? "waiverType holds a value the fields before it leave off the wire" : "waiverType holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (clientQualifiedRolePresent() != clientQualifiedRole.hasValue()) {
            throw new IllegalStateException(clientQualifiedRole.hasValue() ? "clientQualifiedRole holds a value the fields before it leave off the wire" : "clientQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (clientIdPresent() != clientId.hasValue()) {
            throw new IllegalStateException(clientId.hasValue() ? "clientId holds a value the fields before it leave off the wire" : "clientId holds no value, though the fields before it put it on the wire");
        }
        if (investorIdPresent() != investorId.hasValue()) {
            throw new IllegalStateException(investorId.hasValue() ? "investorId holds a value the fields before it leave off the wire" : "investorId holds no value, though the fields before it put it on the wire");
        }
        if (executorIdPresent() != executorId.hasValue()) {
            throw new IllegalStateException(executorId.hasValue() ? "executorId holds a value the fields before it leave off the wire" : "executorId holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginationPresent() != orderOrigination.hasValue()) {
            throw new IllegalStateException(orderOrigination.hasValue() ? "orderOrigination holds a value the fields before it leave off the wire" : "orderOrigination holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (deferralReasonPresent() != deferralReason.hasValue()) {
            throw new IllegalStateException(deferralReason.hasValue() ? "deferralReason holds a value the fields before it leave off the wire" : "deferralReason holds no value, though the fields before it put it on the wire");
        }
        if (investorQualifiedRolePresent() != investorQualifiedRole.hasValue()) {
            throw new IllegalStateException(investorQualifiedRole.hasValue() ? "investorQualifiedRole holds a value the fields before it leave off the wire" : "investorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (executorQualifiedRolePresent() != executorQualifiedRole.hasValue()) {
            throw new IllegalStateException(executorQualifiedRole.hasValue() ? "executorQualifiedRole holds a value the fields before it leave off the wire" : "executorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = tradeReportRefId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPxTradePrice.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 73) {
            System.arraycopy(buffer, 72, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfTradeCaptureConfirmV2Bitfields.encode(data, cursor);
        if (tradeCaptureConfirmV2Bitfield1Present()) {
            cursor = tradeCaptureConfirmV2Bitfield1.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield2Present()) {
            cursor = tradeCaptureConfirmV2Bitfield2.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield3Present()) {
            cursor = tradeCaptureConfirmV2Bitfield3.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield4Present()) {
            cursor = tradeCaptureConfirmV2Bitfield4.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield5Present()) {
            cursor = tradeCaptureConfirmV2Bitfield5.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield6Present()) {
            cursor = tradeCaptureConfirmV2Bitfield6.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield7Present()) {
            cursor = tradeCaptureConfirmV2Bitfield7.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield8Present()) {
            cursor = tradeCaptureConfirmV2Bitfield8.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield9Present()) {
            cursor = tradeCaptureConfirmV2Bitfield9.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield10Present()) {
            cursor = tradeCaptureConfirmV2Bitfield10.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield11Present()) {
            cursor = tradeCaptureConfirmV2Bitfield11.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield12Present()) {
            cursor = tradeCaptureConfirmV2Bitfield12.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield13Present()) {
            cursor = tradeCaptureConfirmV2Bitfield13.encode(data, cursor);
        }
        if (tradeCaptureConfirmV2Bitfield14Present()) {
            cursor = tradeCaptureConfirmV2Bitfield14.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = tradeCaptureConfirmV2TrdCapAckSideGrp.encode(data, cursor);
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (currencyPresent()) {
            cursor = currency.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (securityExchangePresent()) {
            cursor = securityExchange.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (correctedSizePresent()) {
            cursor = correctedSize.encode(data, cursor);
        }
        if (tradeReportTypeReturnPresent()) {
            cursor = tradeReportTypeReturn.encode(data, cursor);
        }
        if (tradePublishIndicatorPresent()) {
            cursor = tradePublishIndicator.encode(data, cursor);
        }
        if (rptTimePresent()) {
            cursor = rptTime.encode(data, cursor);
        }
        if (textPresent()) {
            cursor = text.encode(data, cursor);
        }
        if (largeSizePresent()) {
            cursor = largeSize.encode(data, cursor);
        }
        if (lastMktPresent()) {
            cursor = lastMkt.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
        }
        if (orderCategoryPresent()) {
            cursor = orderCategory.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (waiverTypePresent()) {
            cursor = waiverType.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (clientQualifiedRolePresent()) {
            cursor = clientQualifiedRole.encode(data, cursor);
        }
        if (clientIdPresent()) {
            cursor = clientId.encode(data, cursor);
        }
        if (investorIdPresent()) {
            cursor = investorId.encode(data, cursor);
        }
        if (executorIdPresent()) {
            cursor = executorId.encode(data, cursor);
        }
        if (orderOriginationPresent()) {
            cursor = orderOrigination.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (deferralReasonPresent()) {
            cursor = deferralReason.encode(data, cursor);
        }
        if (investorQualifiedRolePresent()) {
            cursor = investorQualifiedRole.encode(data, cursor);
        }
        if (executorQualifiedRolePresent()) {
            cursor = executorQualifiedRole.encode(data, cursor);
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
        tradeCaptureConfirmV2TrdCapAckSideGrp.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noSides && !field.isRecognized()) {
                return false;
            }
        }
        return tradeCaptureConfirmV2TrdCapAckSideGrp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noSides && !field.isValid()) {
                return false;
            }
        }
        if (!tradeCaptureConfirmV2TrdCapAckSideGrp.isValid()) {
            return false;
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
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!tradeReportRefId.isDecoded()) {
            return Optional.of(tradeReportRefId);
        }
        if (!tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (!lastShares.isDecoded()) {
            return Optional.of(lastShares);
        }
        if (!lastPxTradePrice.isDecoded()) {
            return Optional.of(lastPxTradePrice);
        }
        if (!contraBroker.isDecoded()) {
            return Optional.of(contraBroker);
        }
        if (!numberOfTradeCaptureConfirmV2Bitfields.isDecoded()) {
            return Optional.of(numberOfTradeCaptureConfirmV2Bitfields);
        }
        if (tradeCaptureConfirmV2Bitfield1Present() && !tradeCaptureConfirmV2Bitfield1.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield1);
        }
        if (tradeCaptureConfirmV2Bitfield2Present() && !tradeCaptureConfirmV2Bitfield2.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield2);
        }
        if (tradeCaptureConfirmV2Bitfield3Present() && !tradeCaptureConfirmV2Bitfield3.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield3);
        }
        if (tradeCaptureConfirmV2Bitfield4Present() && !tradeCaptureConfirmV2Bitfield4.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield4);
        }
        if (tradeCaptureConfirmV2Bitfield5Present() && !tradeCaptureConfirmV2Bitfield5.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield5);
        }
        if (tradeCaptureConfirmV2Bitfield6Present() && !tradeCaptureConfirmV2Bitfield6.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield6);
        }
        if (tradeCaptureConfirmV2Bitfield7Present() && !tradeCaptureConfirmV2Bitfield7.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield7);
        }
        if (tradeCaptureConfirmV2Bitfield8Present() && !tradeCaptureConfirmV2Bitfield8.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield8);
        }
        if (tradeCaptureConfirmV2Bitfield9Present() && !tradeCaptureConfirmV2Bitfield9.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield9);
        }
        if (tradeCaptureConfirmV2Bitfield10Present() && !tradeCaptureConfirmV2Bitfield10.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield10);
        }
        if (tradeCaptureConfirmV2Bitfield11Present() && !tradeCaptureConfirmV2Bitfield11.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield11);
        }
        if (tradeCaptureConfirmV2Bitfield12Present() && !tradeCaptureConfirmV2Bitfield12.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield12);
        }
        if (tradeCaptureConfirmV2Bitfield13Present() && !tradeCaptureConfirmV2Bitfield13.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield13);
        }
        if (tradeCaptureConfirmV2Bitfield14Present() && !tradeCaptureConfirmV2Bitfield14.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2Bitfield14);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!tradeCaptureConfirmV2TrdCapAckSideGrp.isDecoded()) {
            return Optional.of(tradeCaptureConfirmV2TrdCapAckSideGrp.failedEntry().flatMap(TradeCaptureConfirmV2TrdCapAckSideGrpEntry::failedAt).orElse(noSides));
        }
        if (execInstPresent() && !execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (symbolPresent() && !symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (currencyPresent() && !currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (idSourcePresent() && !idSource.isDecoded()) {
            return Optional.of(idSource);
        }
        if (securityIdPresent() && !securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (securityExchangePresent() && !securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (orderQtyPresent() && !orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (correctedSizePresent() && !correctedSize.isDecoded()) {
            return Optional.of(correctedSize);
        }
        if (tradeReportTypeReturnPresent() && !tradeReportTypeReturn.isDecoded()) {
            return Optional.of(tradeReportTypeReturn);
        }
        if (tradePublishIndicatorPresent() && !tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (rptTimePresent() && !rptTime.isDecoded()) {
            return Optional.of(rptTime);
        }
        if (textPresent() && !text.isDecoded()) {
            return Optional.of(text);
        }
        if (largeSizePresent() && !largeSize.isDecoded()) {
            return Optional.of(largeSize);
        }
        if (lastMktPresent() && !lastMkt.isDecoded()) {
            return Optional.of(lastMkt);
        }
        if (feeCodePresent() && !feeCode.isDecoded()) {
            return Optional.of(feeCode);
        }
        if (echoTextPresent() && !echoText.isDecoded()) {
            return Optional.of(echoText);
        }
        if (orderCategoryPresent() && !orderCategory.isDecoded()) {
            return Optional.of(orderCategory);
        }
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (waiverTypePresent() && !waiverType.isDecoded()) {
            return Optional.of(waiverType);
        }
        if (priceFormationPresent() && !priceFormation.isDecoded()) {
            return Optional.of(priceFormation);
        }
        if (clientQualifiedRolePresent() && !clientQualifiedRole.isDecoded()) {
            return Optional.of(clientQualifiedRole);
        }
        if (clientIdPresent() && !clientId.isDecoded()) {
            return Optional.of(clientId);
        }
        if (investorIdPresent() && !investorId.isDecoded()) {
            return Optional.of(investorId);
        }
        if (executorIdPresent() && !executorId.isDecoded()) {
            return Optional.of(executorId);
        }
        if (orderOriginationPresent() && !orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
        }
        if (deferralReasonPresent() && !deferralReason.isDecoded()) {
            return Optional.of(deferralReason);
        }
        if (investorQualifiedRolePresent() && !investorQualifiedRole.isDecoded()) {
            return Optional.of(investorQualifiedRole);
        }
        if (executorQualifiedRolePresent() && !executorQualifiedRole.isDecoded()) {
            return Optional.of(executorQualifiedRole);
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
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "TradeReportRefId" -> Optional.of(tradeReportRefId);
            case "TradeId" -> Optional.of(tradeId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPxTradePrice" -> Optional.of(lastPxTradePrice);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "NumberOfTradeCaptureConfirmV2Bitfields" -> Optional.of(numberOfTradeCaptureConfirmV2Bitfields);
            case "TradeCaptureConfirmV2Bitfield1" -> Optional.of(tradeCaptureConfirmV2Bitfield1);
            case "TradeCaptureConfirmV2Bitfield2" -> Optional.of(tradeCaptureConfirmV2Bitfield2);
            case "TradeCaptureConfirmV2Bitfield3" -> Optional.of(tradeCaptureConfirmV2Bitfield3);
            case "TradeCaptureConfirmV2Bitfield4" -> Optional.of(tradeCaptureConfirmV2Bitfield4);
            case "TradeCaptureConfirmV2Bitfield5" -> Optional.of(tradeCaptureConfirmV2Bitfield5);
            case "TradeCaptureConfirmV2Bitfield6" -> Optional.of(tradeCaptureConfirmV2Bitfield6);
            case "TradeCaptureConfirmV2Bitfield7" -> Optional.of(tradeCaptureConfirmV2Bitfield7);
            case "TradeCaptureConfirmV2Bitfield8" -> Optional.of(tradeCaptureConfirmV2Bitfield8);
            case "TradeCaptureConfirmV2Bitfield9" -> Optional.of(tradeCaptureConfirmV2Bitfield9);
            case "TradeCaptureConfirmV2Bitfield10" -> Optional.of(tradeCaptureConfirmV2Bitfield10);
            case "TradeCaptureConfirmV2Bitfield11" -> Optional.of(tradeCaptureConfirmV2Bitfield11);
            case "TradeCaptureConfirmV2Bitfield12" -> Optional.of(tradeCaptureConfirmV2Bitfield12);
            case "TradeCaptureConfirmV2Bitfield13" -> Optional.of(tradeCaptureConfirmV2Bitfield13);
            case "TradeCaptureConfirmV2Bitfield14" -> Optional.of(tradeCaptureConfirmV2Bitfield14);
            case "NoSides" -> Optional.of(noSides);
            case "ExecInst" -> Optional.of(execInst);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrderQty" -> Optional.of(orderQty);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "TradeReportTypeReturn" -> Optional.of(tradeReportTypeReturn);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "RptTime" -> Optional.of(rptTime);
            case "Text" -> Optional.of(text);
            case "LargeSize" -> Optional.of(largeSize);
            case "LastMkt" -> Optional.of(lastMkt);
            case "FeeCode" -> Optional.of(feeCode);
            case "EchoText" -> Optional.of(echoText);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "WaiverType" -> Optional.of(waiverType);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "DeferralReason" -> Optional.of(deferralReason);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureConfirmV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeCaptureConfirmV2TrdCapAckSideGrp.diffFields(message.tradeCaptureConfirmV2TrdCapAckSideGrp));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            tradeCaptureConfirmV2TrdCapAckSideGrp.toFormattedString(builder, options);
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
        tradeCaptureConfirmV2TrdCapAckSideGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeCaptureConfirmV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeCaptureConfirmV2TrdCapAckSideGrp.equals(message.tradeCaptureConfirmV2TrdCapAckSideGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeCaptureConfirmV2TrdCapAckSideGrp);
    }
}
