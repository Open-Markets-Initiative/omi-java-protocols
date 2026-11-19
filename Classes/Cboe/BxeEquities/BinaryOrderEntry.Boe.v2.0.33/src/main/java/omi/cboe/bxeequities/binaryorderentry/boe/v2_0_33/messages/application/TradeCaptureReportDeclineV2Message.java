package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.AlgorithmicIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ClearingFirmField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ClientIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ClientQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ContraBrokerField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.CurrencyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.EchoTextField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ExecInstField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ExecutorIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ExecutorQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.IdSourceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.InvestorIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.InvestorQualifiedRoleField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.LargeSizeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.LastMktField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.LastPxTradePriceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.LastSharesField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.LiquidityProvisionField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.NoSidesField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.OrderOriginationField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.OrderQtyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.PriceFormationField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.ReasonField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.RptTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.SecurityExchangeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.SecurityIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.SymbolField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TextField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield10Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield11Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield12Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield13Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield14Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield1Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield2Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield3Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield4Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield5Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield6Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield7Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield8Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeCaptureReportDeclineV2ReturnBitfield9Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradePublishIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeReportIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeReportRefIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TradeReportTypeReturnField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.TransactionTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.fields.WaiverTypeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.groups.TradeCaptureReportDeclineV2TrdCapAckSideGrpEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.groups.TradeCaptureReportDeclineV2TrdCapAckSideGrpList;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.types.PrintOptions;

/**
 * Represents the TradeCaptureReportDeclineV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Capture Report Decline V2 Message.</p>
 */
public final class TradeCaptureReportDeclineV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 136;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Report Decline V 2 Message";

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
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 102) for a list of possible reasons.
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 1.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield1Field tradeCaptureReportDeclineV2ReturnBitfield1 = new TradeCaptureReportDeclineV2ReturnBitfield1Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 2.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield2Field tradeCaptureReportDeclineV2ReturnBitfield2 = new TradeCaptureReportDeclineV2ReturnBitfield2Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 3.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield3Field tradeCaptureReportDeclineV2ReturnBitfield3 = new TradeCaptureReportDeclineV2ReturnBitfield3Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 4.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield4Field tradeCaptureReportDeclineV2ReturnBitfield4 = new TradeCaptureReportDeclineV2ReturnBitfield4Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 5.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield5Field tradeCaptureReportDeclineV2ReturnBitfield5 = new TradeCaptureReportDeclineV2ReturnBitfield5Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 6.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield6Field tradeCaptureReportDeclineV2ReturnBitfield6 = new TradeCaptureReportDeclineV2ReturnBitfield6Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 7.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield7Field tradeCaptureReportDeclineV2ReturnBitfield7 = new TradeCaptureReportDeclineV2ReturnBitfield7Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 8.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield8Field tradeCaptureReportDeclineV2ReturnBitfield8 = new TradeCaptureReportDeclineV2ReturnBitfield8Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 9.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield9Field tradeCaptureReportDeclineV2ReturnBitfield9 = new TradeCaptureReportDeclineV2ReturnBitfield9Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 10.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield10Field tradeCaptureReportDeclineV2ReturnBitfield10 = new TradeCaptureReportDeclineV2ReturnBitfield10Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 11.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield11Field tradeCaptureReportDeclineV2ReturnBitfield11 = new TradeCaptureReportDeclineV2ReturnBitfield11Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 12.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield12Field tradeCaptureReportDeclineV2ReturnBitfield12 = new TradeCaptureReportDeclineV2ReturnBitfield12Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 13.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield13Field tradeCaptureReportDeclineV2ReturnBitfield13 = new TradeCaptureReportDeclineV2ReturnBitfield13Field();

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 14.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield14Field tradeCaptureReportDeclineV2ReturnBitfield14 = new TradeCaptureReportDeclineV2ReturnBitfield14Field();

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
     * Large Size
     */
    private final LargeSizeField largeSize = new LargeSizeField();

    /**
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

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
    private final TradeCaptureReportDeclineV2TrdCapAckSideGrpList tradeCaptureReportDeclineV2TrdCapAckSideGrp = new TradeCaptureReportDeclineV2TrdCapAckSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradeReportId, tradeReportRefId, tradeId, lastShares, lastPxTradePrice, contraBroker, reason, text, numberOfReturnBitfields, tradeCaptureReportDeclineV2ReturnBitfield1, tradeCaptureReportDeclineV2ReturnBitfield2, tradeCaptureReportDeclineV2ReturnBitfield3, tradeCaptureReportDeclineV2ReturnBitfield4, tradeCaptureReportDeclineV2ReturnBitfield5, tradeCaptureReportDeclineV2ReturnBitfield6, tradeCaptureReportDeclineV2ReturnBitfield7, tradeCaptureReportDeclineV2ReturnBitfield8, tradeCaptureReportDeclineV2ReturnBitfield9, tradeCaptureReportDeclineV2ReturnBitfield10, tradeCaptureReportDeclineV2ReturnBitfield11, tradeCaptureReportDeclineV2ReturnBitfield12, tradeCaptureReportDeclineV2ReturnBitfield13, tradeCaptureReportDeclineV2ReturnBitfield14, noSides, execInst, symbol, currency, idSource, securityId, securityExchange, clearingFirm, orderQty, tradeReportTypeReturn, tradePublishIndicator, rptTime, largeSize, lastMkt, echoText, liquidityProvision, waiverType, priceFormation, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole);

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
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 102) for a list of possible reasons.
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
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
     * BitSet TradeCaptureReportDeclineV2 byte 1.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield1 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield1Field tradeCaptureReportDeclineV2ReturnBitfield1() {
        return tradeCaptureReportDeclineV2ReturnBitfield1;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 2.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield2 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield2Field tradeCaptureReportDeclineV2ReturnBitfield2() {
        return tradeCaptureReportDeclineV2ReturnBitfield2;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 3.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield3 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield3Field tradeCaptureReportDeclineV2ReturnBitfield3() {
        return tradeCaptureReportDeclineV2ReturnBitfield3;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 4.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield4 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield4Field tradeCaptureReportDeclineV2ReturnBitfield4() {
        return tradeCaptureReportDeclineV2ReturnBitfield4;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 5.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield5 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield5Field tradeCaptureReportDeclineV2ReturnBitfield5() {
        return tradeCaptureReportDeclineV2ReturnBitfield5;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 6.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield6 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield6Field tradeCaptureReportDeclineV2ReturnBitfield6() {
        return tradeCaptureReportDeclineV2ReturnBitfield6;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 7.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield7 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield7Field tradeCaptureReportDeclineV2ReturnBitfield7() {
        return tradeCaptureReportDeclineV2ReturnBitfield7;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 8.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield8 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield8Field tradeCaptureReportDeclineV2ReturnBitfield8() {
        return tradeCaptureReportDeclineV2ReturnBitfield8;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 9.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield9 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield9Field tradeCaptureReportDeclineV2ReturnBitfield9() {
        return tradeCaptureReportDeclineV2ReturnBitfield9;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 10.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield10 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield10Field tradeCaptureReportDeclineV2ReturnBitfield10() {
        return tradeCaptureReportDeclineV2ReturnBitfield10;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 11.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield11 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield11Field tradeCaptureReportDeclineV2ReturnBitfield11() {
        return tradeCaptureReportDeclineV2ReturnBitfield11;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 12.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield12 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield12Field tradeCaptureReportDeclineV2ReturnBitfield12() {
        return tradeCaptureReportDeclineV2ReturnBitfield12;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 13.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield13 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield13Field tradeCaptureReportDeclineV2ReturnBitfield13() {
        return tradeCaptureReportDeclineV2ReturnBitfield13;
    }

    /**
     * BitSet TradeCaptureReportDeclineV2 byte 14.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield14 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield14Field tradeCaptureReportDeclineV2ReturnBitfield14() {
        return tradeCaptureReportDeclineV2ReturnBitfield14;
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
     * Echo Text
     *
     * @return the EchoText field
     */
    public EchoTextField echoText() {
        return echoText;
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
     * @return the TradeCaptureReportDeclineV2TrdCapAckSideGrp entries
     */
    public TradeCaptureReportDeclineV2TrdCapAckSideGrpList tradeCaptureReportDeclineV2TrdCapAckSideGrp() {
        return tradeCaptureReportDeclineV2TrdCapAckSideGrp;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield1 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield2 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield3 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield4 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield5 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield6 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield7 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield8 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield9 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield10 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield11 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield12 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield13 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield14 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (tradeCaptureReportDeclineV2ReturnBitfield1Present() && tradeCaptureReportDeclineV2ReturnBitfield1.tradeCaptureReportDeclineV2ReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportDeclineV2ReturnBitfield2Present() && tradeCaptureReportDeclineV2ReturnBitfield2.tradeCaptureReportDeclineV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportDeclineV2ReturnBitfield2Present() && tradeCaptureReportDeclineV2ReturnBitfield2.tradeCaptureReportDeclineV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportDeclineV2ReturnBitfield2Present() && tradeCaptureReportDeclineV2ReturnBitfield2.tradeCaptureReportDeclineV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportDeclineV2ReturnBitfield2Present() && tradeCaptureReportDeclineV2ReturnBitfield2.tradeCaptureReportDeclineV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportDeclineV2ReturnBitfield2Present() && tradeCaptureReportDeclineV2ReturnBitfield2.tradeCaptureReportDeclineV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportDeclineV2ReturnBitfield3Present() && tradeCaptureReportDeclineV2ReturnBitfield3.tradeCaptureReportDeclineV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportDeclineV2ReturnBitfield3Present() && tradeCaptureReportDeclineV2ReturnBitfield3.tradeCaptureReportDeclineV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the TradeReportTypeReturn put it on the wire.
     *
     * <p>Decode reads the TradeReportTypeReturn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTypeReturn is on the wire
     */
    public boolean tradeReportTypeReturnPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportDeclineV2ReturnBitfield7Present() && tradeCaptureReportDeclineV2ReturnBitfield7.tradeCaptureReportDeclineV2ReturnBitfield7TradeReportTypeReturn());
    }

    /**
     * Returns whether the fields before the TradePublishIndicator put it on the wire.
     *
     * <p>Decode reads the TradePublishIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePublishIndicator is on the wire
     */
    public boolean tradePublishIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportDeclineV2ReturnBitfield7Present() && tradeCaptureReportDeclineV2ReturnBitfield7.tradeCaptureReportDeclineV2ReturnBitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the RptTime put it on the wire.
     *
     * <p>Decode reads the RptTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RptTime is on the wire
     */
    public boolean rptTimePresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportDeclineV2ReturnBitfield7Present() && tradeCaptureReportDeclineV2ReturnBitfield7.tradeCaptureReportDeclineV2ReturnBitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the LargeSize put it on the wire.
     *
     * <p>Decode reads the LargeSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LargeSize is on the wire
     */
    public boolean largeSizePresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportDeclineV2ReturnBitfield7Present() && tradeCaptureReportDeclineV2ReturnBitfield7.tradeCaptureReportDeclineV2ReturnBitfield7LargeSize());
    }

    /**
     * Returns whether the fields before the LastMkt put it on the wire.
     *
     * <p>Decode reads the LastMkt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastMkt is on the wire
     */
    public boolean lastMktPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportDeclineV2ReturnBitfield7Present() && tradeCaptureReportDeclineV2ReturnBitfield7.tradeCaptureReportDeclineV2ReturnBitfield7LastMkt());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (tradeCaptureReportDeclineV2ReturnBitfield8Present() && tradeCaptureReportDeclineV2ReturnBitfield8.tradeCaptureReportDeclineV2ReturnBitfield8EchoText());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (tradeCaptureReportDeclineV2ReturnBitfield9Present() && tradeCaptureReportDeclineV2ReturnBitfield9.tradeCaptureReportDeclineV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (tradeCaptureReportDeclineV2ReturnBitfield10Present() && tradeCaptureReportDeclineV2ReturnBitfield10.tradeCaptureReportDeclineV2ReturnBitfield10WaiverType());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (tradeCaptureReportDeclineV2ReturnBitfield10Present() && tradeCaptureReportDeclineV2ReturnBitfield10.tradeCaptureReportDeclineV2ReturnBitfield10PriceFormation());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (tradeCaptureReportDeclineV2ReturnBitfield10Present() && tradeCaptureReportDeclineV2ReturnBitfield10.tradeCaptureReportDeclineV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportDeclineV2ReturnBitfield1 || tradeCaptureReportDeclineV2ReturnBitfield1Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield2 || tradeCaptureReportDeclineV2ReturnBitfield2Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield3 || tradeCaptureReportDeclineV2ReturnBitfield3Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield4 || tradeCaptureReportDeclineV2ReturnBitfield4Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield5 || tradeCaptureReportDeclineV2ReturnBitfield5Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield6 || tradeCaptureReportDeclineV2ReturnBitfield6Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield7 || tradeCaptureReportDeclineV2ReturnBitfield7Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield8 || tradeCaptureReportDeclineV2ReturnBitfield8Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield9 || tradeCaptureReportDeclineV2ReturnBitfield9Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield10 || tradeCaptureReportDeclineV2ReturnBitfield10Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield11 || tradeCaptureReportDeclineV2ReturnBitfield11Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield12 || tradeCaptureReportDeclineV2ReturnBitfield12Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield13 || tradeCaptureReportDeclineV2ReturnBitfield13Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield14 || tradeCaptureReportDeclineV2ReturnBitfield14Present()) && (field != execInst || execInstPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQty || orderQtyPresent()) && (field != tradeReportTypeReturn || tradeReportTypeReturnPresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != rptTime || rptTimePresent()) && (field != largeSize || largeSizePresent()) && (field != lastMkt || lastMktPresent()) && (field != echoText || echoTextPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != waiverType || waiverTypePresent()) && (field != priceFormation || priceFormationPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        tradeCaptureReportDeclineV2TrdCapAckSideGrp.inputs(OptionalLong.of(numberOfReturnBitfields.value()), tradeCaptureReportDeclineV2ReturnBitfield1Present() ? OptionalLong.of(tradeCaptureReportDeclineV2ReturnBitfield1.value()) : OptionalLong.empty(), tradeCaptureReportDeclineV2ReturnBitfield2Present() ? OptionalLong.of(tradeCaptureReportDeclineV2ReturnBitfield2.value()) : OptionalLong.empty(), tradeCaptureReportDeclineV2ReturnBitfield3Present() ? OptionalLong.of(tradeCaptureReportDeclineV2ReturnBitfield3.value()) : OptionalLong.empty(), tradeCaptureReportDeclineV2ReturnBitfield4Present() ? OptionalLong.of(tradeCaptureReportDeclineV2ReturnBitfield4.value()) : OptionalLong.empty(), tradeCaptureReportDeclineV2ReturnBitfield6Present() ? OptionalLong.of(tradeCaptureReportDeclineV2ReturnBitfield6.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportDeclineV2ReturnBitfield1Present() ? TradeCaptureReportDeclineV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield2Present() ? TradeCaptureReportDeclineV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield3Present() ? TradeCaptureReportDeclineV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield4Present() ? TradeCaptureReportDeclineV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield5Present() ? TradeCaptureReportDeclineV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield6Present() ? TradeCaptureReportDeclineV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield7Present() ? TradeCaptureReportDeclineV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield8Present() ? TradeCaptureReportDeclineV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield9Present() ? TradeCaptureReportDeclineV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield10Present() ? TradeCaptureReportDeclineV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield11Present() ? TradeCaptureReportDeclineV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield12Present() ? TradeCaptureReportDeclineV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield13Present() ? TradeCaptureReportDeclineV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield14Present() ? TradeCaptureReportDeclineV2ReturnBitfield14Field.BYTE_LENGTH : 0) + tradeCaptureReportDeclineV2TrdCapAckSideGrp.byteLength() + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (tradeReportTypeReturnPresent() ? TradeReportTypeReturnField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (rptTimePresent() ? RptTimeField.BYTE_LENGTH : 0) + (largeSizePresent() ? LargeSizeField.BYTE_LENGTH : 0) + (lastMktPresent() ? LastMktField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (tradeCaptureReportDeclineV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += tradeCaptureReportDeclineV2TrdCapAckSideGrp.byteLength();
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
        if (tradeReportTypeReturnPresent()) {
            cursor += 2;
        }
        if (tradePublishIndicatorPresent()) {
            cursor += 1;
        }
        if (rptTimePresent()) {
            cursor += 8;
        }
        if (largeSizePresent()) {
            cursor += 8;
        }
        if (lastMktPresent()) {
            cursor += 4;
        }
        if (echoTextPresent()) {
            cursor += 64;
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
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (tradeCaptureReportDeclineV2ReturnBitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield1Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield2Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield3Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield4Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield5Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield6Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield6Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield7Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield7Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield8Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield8Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield9Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield9Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield10Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield10Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield11Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield11Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield12Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield12Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield13Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield13Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield14Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield14Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!tradeCaptureReportDeclineV2TrdCapAckSideGrp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += tradeCaptureReportDeclineV2TrdCapAckSideGrp.byteLength();
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
        if (echoTextPresent()) {
            if (end - cursor < EchoTextField.BYTE_LENGTH || !echoText.parse(data, cursor)) {
                return false;
            }
            cursor += EchoTextField.BYTE_LENGTH;
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
        if (tradeCaptureReportDeclineV2TrdCapAckSideGrp.size() > 255) {
            throw new IllegalStateException("tradeCaptureReportDeclineV2TrdCapAckSideGrp holds " + tradeCaptureReportDeclineV2TrdCapAckSideGrp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) tradeCaptureReportDeclineV2TrdCapAckSideGrp.size());
        if (tradeCaptureReportDeclineV2ReturnBitfield1Present() != tradeCaptureReportDeclineV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield1.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield2Present() != tradeCaptureReportDeclineV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield2.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield3Present() != tradeCaptureReportDeclineV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield3.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield4Present() != tradeCaptureReportDeclineV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield4.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield5Present() != tradeCaptureReportDeclineV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield5.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield6Present() != tradeCaptureReportDeclineV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield6.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield7Present() != tradeCaptureReportDeclineV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield7.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield8Present() != tradeCaptureReportDeclineV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield8.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield9Present() != tradeCaptureReportDeclineV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield9.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield10Present() != tradeCaptureReportDeclineV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield10.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield11Present() != tradeCaptureReportDeclineV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield11.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield12Present() != tradeCaptureReportDeclineV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield12.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield13Present() != tradeCaptureReportDeclineV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield13.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield14Present() != tradeCaptureReportDeclineV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield14.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
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
        if (tradeReportTypeReturnPresent() != tradeReportTypeReturn.hasValue()) {
            throw new IllegalStateException(tradeReportTypeReturn.hasValue() ? "tradeReportTypeReturn holds a value the fields before it leave off the wire" : "tradeReportTypeReturn holds no value, though the fields before it put it on the wire");
        }
        if (tradePublishIndicatorPresent() != tradePublishIndicator.hasValue()) {
            throw new IllegalStateException(tradePublishIndicator.hasValue() ? "tradePublishIndicator holds a value the fields before it leave off the wire" : "tradePublishIndicator holds no value, though the fields before it put it on the wire");
        }
        if (rptTimePresent() != rptTime.hasValue()) {
            throw new IllegalStateException(rptTime.hasValue() ? "rptTime holds a value the fields before it leave off the wire" : "rptTime holds no value, though the fields before it put it on the wire");
        }
        if (largeSizePresent() != largeSize.hasValue()) {
            throw new IllegalStateException(largeSize.hasValue() ? "largeSize holds a value the fields before it leave off the wire" : "largeSize holds no value, though the fields before it put it on the wire");
        }
        if (lastMktPresent() != lastMkt.hasValue()) {
            throw new IllegalStateException(lastMkt.hasValue() ? "lastMkt holds a value the fields before it leave off the wire" : "lastMkt holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
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
        cursor = reason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 134) {
            System.arraycopy(buffer, 133, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (tradeCaptureReportDeclineV2ReturnBitfield1Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield1.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield2Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield2.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield3Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield3.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield4Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield4.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield5Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield5.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield6Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield6.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield7Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield7.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield8Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield8.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield9Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield9.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield10Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield10.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield11Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield11.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield12Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield12.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield13Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield13.encode(data, cursor);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield14Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield14.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = tradeCaptureReportDeclineV2TrdCapAckSideGrp.encode(data, cursor);
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
        if (tradeReportTypeReturnPresent()) {
            cursor = tradeReportTypeReturn.encode(data, cursor);
        }
        if (tradePublishIndicatorPresent()) {
            cursor = tradePublishIndicator.encode(data, cursor);
        }
        if (rptTimePresent()) {
            cursor = rptTime.encode(data, cursor);
        }
        if (largeSizePresent()) {
            cursor = largeSize.encode(data, cursor);
        }
        if (lastMktPresent()) {
            cursor = lastMkt.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
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
        tradeCaptureReportDeclineV2TrdCapAckSideGrp.clear();
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
        return tradeCaptureReportDeclineV2TrdCapAckSideGrp.isRecognized();
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
        if (!tradeCaptureReportDeclineV2TrdCapAckSideGrp.isValid()) {
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
        if (!reason.isDecoded()) {
            return Optional.of(reason);
        }
        if (!text.isDecoded()) {
            return Optional.of(text);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield1Present() && !tradeCaptureReportDeclineV2ReturnBitfield1.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield1);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield2Present() && !tradeCaptureReportDeclineV2ReturnBitfield2.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield2);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield3Present() && !tradeCaptureReportDeclineV2ReturnBitfield3.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield3);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield4Present() && !tradeCaptureReportDeclineV2ReturnBitfield4.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield4);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield5Present() && !tradeCaptureReportDeclineV2ReturnBitfield5.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield5);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield6Present() && !tradeCaptureReportDeclineV2ReturnBitfield6.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield6);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield7Present() && !tradeCaptureReportDeclineV2ReturnBitfield7.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield7);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield8Present() && !tradeCaptureReportDeclineV2ReturnBitfield8.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield8);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield9Present() && !tradeCaptureReportDeclineV2ReturnBitfield9.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield9);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield10Present() && !tradeCaptureReportDeclineV2ReturnBitfield10.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield10);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield11Present() && !tradeCaptureReportDeclineV2ReturnBitfield11.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield11);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield12Present() && !tradeCaptureReportDeclineV2ReturnBitfield12.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield12);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield13Present() && !tradeCaptureReportDeclineV2ReturnBitfield13.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield13);
        }
        if (tradeCaptureReportDeclineV2ReturnBitfield14Present() && !tradeCaptureReportDeclineV2ReturnBitfield14.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield14);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!tradeCaptureReportDeclineV2TrdCapAckSideGrp.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2TrdCapAckSideGrp.failedEntry().flatMap(TradeCaptureReportDeclineV2TrdCapAckSideGrpEntry::failedAt).orElse(noSides));
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
        if (tradeReportTypeReturnPresent() && !tradeReportTypeReturn.isDecoded()) {
            return Optional.of(tradeReportTypeReturn);
        }
        if (tradePublishIndicatorPresent() && !tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (rptTimePresent() && !rptTime.isDecoded()) {
            return Optional.of(rptTime);
        }
        if (largeSizePresent() && !largeSize.isDecoded()) {
            return Optional.of(largeSize);
        }
        if (lastMktPresent() && !lastMkt.isDecoded()) {
            return Optional.of(lastMkt);
        }
        if (echoTextPresent() && !echoText.isDecoded()) {
            return Optional.of(echoText);
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
            case "Reason" -> Optional.of(reason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "TradeCaptureReportDeclineV2ReturnBitfield1" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield1);
            case "TradeCaptureReportDeclineV2ReturnBitfield2" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield2);
            case "TradeCaptureReportDeclineV2ReturnBitfield3" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield3);
            case "TradeCaptureReportDeclineV2ReturnBitfield4" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield4);
            case "TradeCaptureReportDeclineV2ReturnBitfield5" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield5);
            case "TradeCaptureReportDeclineV2ReturnBitfield6" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield6);
            case "TradeCaptureReportDeclineV2ReturnBitfield7" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield7);
            case "TradeCaptureReportDeclineV2ReturnBitfield8" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield8);
            case "TradeCaptureReportDeclineV2ReturnBitfield9" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield9);
            case "TradeCaptureReportDeclineV2ReturnBitfield10" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield10);
            case "TradeCaptureReportDeclineV2ReturnBitfield11" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield11);
            case "TradeCaptureReportDeclineV2ReturnBitfield12" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield12);
            case "TradeCaptureReportDeclineV2ReturnBitfield13" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield13);
            case "TradeCaptureReportDeclineV2ReturnBitfield14" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield14);
            case "NoSides" -> Optional.of(noSides);
            case "ExecInst" -> Optional.of(execInst);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrderQty" -> Optional.of(orderQty);
            case "TradeReportTypeReturn" -> Optional.of(tradeReportTypeReturn);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "RptTime" -> Optional.of(rptTime);
            case "LargeSize" -> Optional.of(largeSize);
            case "LastMkt" -> Optional.of(lastMkt);
            case "EchoText" -> Optional.of(echoText);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "WaiverType" -> Optional.of(waiverType);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureReportDeclineV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeCaptureReportDeclineV2TrdCapAckSideGrp.diffFields(message.tradeCaptureReportDeclineV2TrdCapAckSideGrp));
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
            tradeCaptureReportDeclineV2TrdCapAckSideGrp.toFormattedString(builder, options);
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
        tradeCaptureReportDeclineV2TrdCapAckSideGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeCaptureReportDeclineV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeCaptureReportDeclineV2TrdCapAckSideGrp.equals(message.tradeCaptureReportDeclineV2TrdCapAckSideGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeCaptureReportDeclineV2TrdCapAckSideGrp);
    }
}
