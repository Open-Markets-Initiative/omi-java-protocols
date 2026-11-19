package omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.AlgorithmicIndicatorField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.ClearingFirmField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.ContraBrokerField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.CurrencyField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.DeferralReasonField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.IdSourceField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.LastPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.LastSharesField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.NoSidesField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.OrderQtyField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.PriceFormationField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.ReasonField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.RptTimeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.SecurityExchangeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.SecurityIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.SymbolField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TextField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield10Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield11Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield12Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield13Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield14Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield15Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield1Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield2Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield3Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield4Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield5Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield6Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield7Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield8Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeCaptureReportDeclineV2ReturnBitfield9Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradePublishIndicatorField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeReportIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeReportRefIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TradeReportTypeReturnField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.TransactionTimeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.fields.WaiverTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.groups.TradeCaptureReportDeclineV2TrdCapAckSideGrpEntry;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.groups.TradeCaptureReportDeclineV2TrdCapAckSideGrpList;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.types.Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.types.PrintOptions;

/**
 * Represents the TradeCaptureReportDeclineV2Message message from the TradeReporting protocol.
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
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
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
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Corresponds to LastPx (31) in Cboe FIX. Price of this fill. A value of zero or an indicative price may be used if the price is pending, as denoted by PriceFormation
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Indicates the market of execution. 1
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 61) for a list of possible reasons.
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
     * BitSet TradeCaptureReportDeclineV2 byte 15.
     */
    private final TradeCaptureReportDeclineV2ReturnBitfield15Field tradeCaptureReportDeclineV2ReturnBitfield15 = new TradeCaptureReportDeclineV2ReturnBitfield15Field();

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Currently, can be 1 or 2.
     */
    private final NoSidesField noSides = new NoSidesField();

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
     * Order Qty
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
     * Waiver Type
     */
    private final WaiverTypeField waiverType = new WaiverTypeField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Deferral Reason
     */
    private final DeferralReasonField deferralReason = new DeferralReasonField();

    /**
     * Repeating group stated NoSides times.
     */
    private final TradeCaptureReportDeclineV2TrdCapAckSideGrpList tradeCaptureReportDeclineV2TrdCapAckSideGrp = new TradeCaptureReportDeclineV2TrdCapAckSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradeReportId, tradeReportRefId, tradeId, lastShares, lastPx, contraBroker, reason, text, numberOfReturnBitfields, tradeCaptureReportDeclineV2ReturnBitfield1, tradeCaptureReportDeclineV2ReturnBitfield2, tradeCaptureReportDeclineV2ReturnBitfield3, tradeCaptureReportDeclineV2ReturnBitfield4, tradeCaptureReportDeclineV2ReturnBitfield5, tradeCaptureReportDeclineV2ReturnBitfield6, tradeCaptureReportDeclineV2ReturnBitfield7, tradeCaptureReportDeclineV2ReturnBitfield8, tradeCaptureReportDeclineV2ReturnBitfield9, tradeCaptureReportDeclineV2ReturnBitfield10, tradeCaptureReportDeclineV2ReturnBitfield11, tradeCaptureReportDeclineV2ReturnBitfield12, tradeCaptureReportDeclineV2ReturnBitfield13, tradeCaptureReportDeclineV2ReturnBitfield14, tradeCaptureReportDeclineV2ReturnBitfield15, noSides, symbol, currency, idSource, securityId, securityExchange, clearingFirm, orderQty, tradeReportTypeReturn, tradePublishIndicator, rptTime, waiverType, priceFormation, algorithmicIndicator, deferralReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
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
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Corresponds to LastPx (31) in Cboe FIX. Price of this fill. A value of zero or an indicative price may be used if the price is pending, as denoted by PriceFormation
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Indicates the market of execution. 1
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 61) for a list of possible reasons.
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
     * BitSet TradeCaptureReportDeclineV2 byte 15.
     *
     * @return the TradeCaptureReportDeclineV2ReturnBitfield15 field
     */
    public TradeCaptureReportDeclineV2ReturnBitfield15Field tradeCaptureReportDeclineV2ReturnBitfield15() {
        return tradeCaptureReportDeclineV2ReturnBitfield15;
    }

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Currently, can be 1 or 2.
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
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
     * Order Qty
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
     * Returns whether the fields before the TradeCaptureReportDeclineV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportDeclineV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportDeclineV2ReturnBitfield15 is on the wire
     */
    public boolean tradeCaptureReportDeclineV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
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
     * Returns whether the fields before the DeferralReason put it on the wire.
     *
     * <p>Decode reads the DeferralReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DeferralReason is on the wire
     */
    public boolean deferralReasonPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportDeclineV2ReturnBitfield11Present() && tradeCaptureReportDeclineV2ReturnBitfield11.tradeCaptureReportDeclineV2ReturnBitfield11DeferralReason());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportDeclineV2ReturnBitfield1 || tradeCaptureReportDeclineV2ReturnBitfield1Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield2 || tradeCaptureReportDeclineV2ReturnBitfield2Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield3 || tradeCaptureReportDeclineV2ReturnBitfield3Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield4 || tradeCaptureReportDeclineV2ReturnBitfield4Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield5 || tradeCaptureReportDeclineV2ReturnBitfield5Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield6 || tradeCaptureReportDeclineV2ReturnBitfield6Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield7 || tradeCaptureReportDeclineV2ReturnBitfield7Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield8 || tradeCaptureReportDeclineV2ReturnBitfield8Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield9 || tradeCaptureReportDeclineV2ReturnBitfield9Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield10 || tradeCaptureReportDeclineV2ReturnBitfield10Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield11 || tradeCaptureReportDeclineV2ReturnBitfield11Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield12 || tradeCaptureReportDeclineV2ReturnBitfield12Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield13 || tradeCaptureReportDeclineV2ReturnBitfield13Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield14 || tradeCaptureReportDeclineV2ReturnBitfield14Present()) && (field != tradeCaptureReportDeclineV2ReturnBitfield15 || tradeCaptureReportDeclineV2ReturnBitfield15Present()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQty || orderQtyPresent()) && (field != tradeReportTypeReturn || tradeReportTypeReturnPresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != rptTime || rptTimePresent()) && (field != waiverType || waiverTypePresent()) && (field != priceFormation || priceFormationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != deferralReason || deferralReasonPresent());
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
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportDeclineV2ReturnBitfield1Present() ? TradeCaptureReportDeclineV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield2Present() ? TradeCaptureReportDeclineV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield3Present() ? TradeCaptureReportDeclineV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield4Present() ? TradeCaptureReportDeclineV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield5Present() ? TradeCaptureReportDeclineV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield6Present() ? TradeCaptureReportDeclineV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield7Present() ? TradeCaptureReportDeclineV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield8Present() ? TradeCaptureReportDeclineV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield9Present() ? TradeCaptureReportDeclineV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield10Present() ? TradeCaptureReportDeclineV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield11Present() ? TradeCaptureReportDeclineV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield12Present() ? TradeCaptureReportDeclineV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield13Present() ? TradeCaptureReportDeclineV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield14Present() ? TradeCaptureReportDeclineV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (tradeCaptureReportDeclineV2ReturnBitfield15Present() ? TradeCaptureReportDeclineV2ReturnBitfield15Field.BYTE_LENGTH : 0) + tradeCaptureReportDeclineV2TrdCapAckSideGrp.byteLength() + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (tradeReportTypeReturnPresent() ? TradeReportTypeReturnField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (rptTimePresent() ? RptTimeField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (deferralReasonPresent() ? DeferralReasonField.BYTE_LENGTH : 0);
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
        if (tradeCaptureReportDeclineV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += tradeCaptureReportDeclineV2TrdCapAckSideGrp.byteLength();
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
        if (waiverTypePresent()) {
            cursor += 1;
        }
        if (priceFormationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
            cursor += 1;
        }
        if (deferralReasonPresent()) {
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
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
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
        if (tradeCaptureReportDeclineV2ReturnBitfield15Present()) {
            if (end - 1 - cursor < TradeCaptureReportDeclineV2ReturnBitfield15Field.BYTE_LENGTH || !tradeCaptureReportDeclineV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportDeclineV2ReturnBitfield15Field.BYTE_LENGTH;
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
        if (tradeCaptureReportDeclineV2ReturnBitfield15Present() != tradeCaptureReportDeclineV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportDeclineV2ReturnBitfield15.hasValue() ? "tradeCaptureReportDeclineV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "tradeCaptureReportDeclineV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
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
        if (waiverTypePresent() != waiverType.hasValue()) {
            throw new IllegalStateException(waiverType.hasValue() ? "waiverType holds a value the fields before it leave off the wire" : "waiverType holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (deferralReasonPresent() != deferralReason.hasValue()) {
            throw new IllegalStateException(deferralReason.hasValue() ? "deferralReason holds a value the fields before it leave off the wire" : "deferralReason holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = tradeReportRefId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
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
        if (tradeCaptureReportDeclineV2ReturnBitfield15Present()) {
            cursor = tradeCaptureReportDeclineV2ReturnBitfield15.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = tradeCaptureReportDeclineV2TrdCapAckSideGrp.encode(data, cursor);
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
        if (waiverTypePresent()) {
            cursor = waiverType.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (deferralReasonPresent()) {
            cursor = deferralReason.encode(data, cursor);
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
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
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
        if (tradeCaptureReportDeclineV2ReturnBitfield15Present() && !tradeCaptureReportDeclineV2ReturnBitfield15.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2ReturnBitfield15);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!tradeCaptureReportDeclineV2TrdCapAckSideGrp.isDecoded()) {
            return Optional.of(tradeCaptureReportDeclineV2TrdCapAckSideGrp.failedEntry().flatMap(TradeCaptureReportDeclineV2TrdCapAckSideGrpEntry::failedAt).orElse(noSides));
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
        if (waiverTypePresent() && !waiverType.isDecoded()) {
            return Optional.of(waiverType);
        }
        if (priceFormationPresent() && !priceFormation.isDecoded()) {
            return Optional.of(priceFormation);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
        }
        if (deferralReasonPresent() && !deferralReason.isDecoded()) {
            return Optional.of(deferralReason);
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
            case "LastPx" -> Optional.of(lastPx);
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
            case "TradeCaptureReportDeclineV2ReturnBitfield15" -> Optional.of(tradeCaptureReportDeclineV2ReturnBitfield15);
            case "NoSides" -> Optional.of(noSides);
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
            case "WaiverType" -> Optional.of(waiverType);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "DeferralReason" -> Optional.of(deferralReason);
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
