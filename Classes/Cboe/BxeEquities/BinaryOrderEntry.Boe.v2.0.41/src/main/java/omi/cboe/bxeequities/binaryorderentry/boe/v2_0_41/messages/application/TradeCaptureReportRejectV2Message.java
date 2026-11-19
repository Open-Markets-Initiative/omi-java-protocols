package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.AlgorithmicIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.ClearingFirmField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.CurrencyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.IdSourceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.NoSidesField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.OrderQtyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.PriceFormationField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.ReasonField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.RptTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.SecurityExchangeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.SecurityIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.SymbolField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TextField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield10Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield11Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield12Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield13Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield14Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield15Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield1Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield2Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield3Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield4Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield5Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield6Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield7Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield8Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeCaptureReportRejectV2ReturnBitfield9Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradePublishIndicatorField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeReportIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TradeReportTypeReturnField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.fields.TransactionTimeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.groups.TradeCaptureReportRejectV2TrdCapAckSideGrpEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.groups.TradeCaptureReportRejectV2TrdCapAckSideGrpList;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.types.Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.types.PrintOptions;

/**
 * Represents the TradeCaptureReportRejectV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Capture Report Reject V2 Message.</p>
 */
public final class TradeCaptureReportRejectV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 92;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Report Reject V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Cboe only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique. From November 9th: Cboe will enforce port level day-uniqueness.
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 103) for a list of possible reasons.
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
     * BitSet TradeCaptureReportRejectV2 byte 1.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield1Field tradeCaptureReportRejectV2ReturnBitfield1 = new TradeCaptureReportRejectV2ReturnBitfield1Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 2.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield2Field tradeCaptureReportRejectV2ReturnBitfield2 = new TradeCaptureReportRejectV2ReturnBitfield2Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 3.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield3Field tradeCaptureReportRejectV2ReturnBitfield3 = new TradeCaptureReportRejectV2ReturnBitfield3Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 4.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield4Field tradeCaptureReportRejectV2ReturnBitfield4 = new TradeCaptureReportRejectV2ReturnBitfield4Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 5.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield5Field tradeCaptureReportRejectV2ReturnBitfield5 = new TradeCaptureReportRejectV2ReturnBitfield5Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 6.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield6Field tradeCaptureReportRejectV2ReturnBitfield6 = new TradeCaptureReportRejectV2ReturnBitfield6Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 7.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield7Field tradeCaptureReportRejectV2ReturnBitfield7 = new TradeCaptureReportRejectV2ReturnBitfield7Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 8.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield8Field tradeCaptureReportRejectV2ReturnBitfield8 = new TradeCaptureReportRejectV2ReturnBitfield8Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 9.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield9Field tradeCaptureReportRejectV2ReturnBitfield9 = new TradeCaptureReportRejectV2ReturnBitfield9Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 10.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield10Field tradeCaptureReportRejectV2ReturnBitfield10 = new TradeCaptureReportRejectV2ReturnBitfield10Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 11.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield11Field tradeCaptureReportRejectV2ReturnBitfield11 = new TradeCaptureReportRejectV2ReturnBitfield11Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 12.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield12Field tradeCaptureReportRejectV2ReturnBitfield12 = new TradeCaptureReportRejectV2ReturnBitfield12Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 13.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield13Field tradeCaptureReportRejectV2ReturnBitfield13 = new TradeCaptureReportRejectV2ReturnBitfield13Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 14.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield14Field tradeCaptureReportRejectV2ReturnBitfield14 = new TradeCaptureReportRejectV2ReturnBitfield14Field();

    /**
     * BitSet TradeCaptureReportRejectV2 byte 15.
     */
    private final TradeCaptureReportRejectV2ReturnBitfield15Field tradeCaptureReportRejectV2ReturnBitfield15 = new TradeCaptureReportRejectV2ReturnBitfield15Field();

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
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
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Repeating group stated NoSides times.
     */
    private final TradeCaptureReportRejectV2TrdCapAckSideGrpList tradeCaptureReportRejectV2TrdCapAckSideGrp = new TradeCaptureReportRejectV2TrdCapAckSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradeReportId, reason, text, numberOfReturnBitfields, tradeCaptureReportRejectV2ReturnBitfield1, tradeCaptureReportRejectV2ReturnBitfield2, tradeCaptureReportRejectV2ReturnBitfield3, tradeCaptureReportRejectV2ReturnBitfield4, tradeCaptureReportRejectV2ReturnBitfield5, tradeCaptureReportRejectV2ReturnBitfield6, tradeCaptureReportRejectV2ReturnBitfield7, tradeCaptureReportRejectV2ReturnBitfield8, tradeCaptureReportRejectV2ReturnBitfield9, tradeCaptureReportRejectV2ReturnBitfield10, tradeCaptureReportRejectV2ReturnBitfield11, tradeCaptureReportRejectV2ReturnBitfield12, tradeCaptureReportRejectV2ReturnBitfield13, tradeCaptureReportRejectV2ReturnBitfield14, tradeCaptureReportRejectV2ReturnBitfield15, noSides, symbol, currency, idSource, securityId, securityExchange, clearingFirm, orderQty, tradeReportTypeReturn, tradePublishIndicator, rptTime, priceFormation, algorithmicIndicator);

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
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Cboe only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique. From November 9th: Cboe will enforce port level day-uniqueness.
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Reason for a Trade Capture Report reject or decline. See Reason Codes (§ 8, p. 103) for a list of possible reasons.
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
     * BitSet TradeCaptureReportRejectV2 byte 1.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield1 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield1Field tradeCaptureReportRejectV2ReturnBitfield1() {
        return tradeCaptureReportRejectV2ReturnBitfield1;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 2.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield2 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield2Field tradeCaptureReportRejectV2ReturnBitfield2() {
        return tradeCaptureReportRejectV2ReturnBitfield2;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 3.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield3 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield3Field tradeCaptureReportRejectV2ReturnBitfield3() {
        return tradeCaptureReportRejectV2ReturnBitfield3;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 4.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield4 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield4Field tradeCaptureReportRejectV2ReturnBitfield4() {
        return tradeCaptureReportRejectV2ReturnBitfield4;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 5.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield5 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield5Field tradeCaptureReportRejectV2ReturnBitfield5() {
        return tradeCaptureReportRejectV2ReturnBitfield5;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 6.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield6 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield6Field tradeCaptureReportRejectV2ReturnBitfield6() {
        return tradeCaptureReportRejectV2ReturnBitfield6;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 7.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield7 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield7Field tradeCaptureReportRejectV2ReturnBitfield7() {
        return tradeCaptureReportRejectV2ReturnBitfield7;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 8.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield8 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield8Field tradeCaptureReportRejectV2ReturnBitfield8() {
        return tradeCaptureReportRejectV2ReturnBitfield8;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 9.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield9 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield9Field tradeCaptureReportRejectV2ReturnBitfield9() {
        return tradeCaptureReportRejectV2ReturnBitfield9;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 10.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield10 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield10Field tradeCaptureReportRejectV2ReturnBitfield10() {
        return tradeCaptureReportRejectV2ReturnBitfield10;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 11.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield11 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield11Field tradeCaptureReportRejectV2ReturnBitfield11() {
        return tradeCaptureReportRejectV2ReturnBitfield11;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 12.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield12 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield12Field tradeCaptureReportRejectV2ReturnBitfield12() {
        return tradeCaptureReportRejectV2ReturnBitfield12;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 13.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield13 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield13Field tradeCaptureReportRejectV2ReturnBitfield13() {
        return tradeCaptureReportRejectV2ReturnBitfield13;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 14.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield14 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield14Field tradeCaptureReportRejectV2ReturnBitfield14() {
        return tradeCaptureReportRejectV2ReturnBitfield14;
    }

    /**
     * BitSet TradeCaptureReportRejectV2 byte 15.
     *
     * @return the TradeCaptureReportRejectV2ReturnBitfield15 field
     */
    public TradeCaptureReportRejectV2ReturnBitfield15Field tradeCaptureReportRejectV2ReturnBitfield15() {
        return tradeCaptureReportRejectV2ReturnBitfield15;
    }

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
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
     * Repeating group stated NoSides times.
     *
     * <p>Encode writes this list's size to the NoSides field.</p>
     *
     * @return the TradeCaptureReportRejectV2TrdCapAckSideGrp entries
     */
    public TradeCaptureReportRejectV2TrdCapAckSideGrpList tradeCaptureReportRejectV2TrdCapAckSideGrp() {
        return tradeCaptureReportRejectV2TrdCapAckSideGrp;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield1 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield2 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield3 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield4 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield5 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield6 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield7 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield8 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield9 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield10 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield11 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield12 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield13 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield14 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportRejectV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportRejectV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportRejectV2ReturnBitfield15 is on the wire
     */
    public boolean tradeCaptureReportRejectV2ReturnBitfield15Present() {
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
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportRejectV2ReturnBitfield2Present() && tradeCaptureReportRejectV2ReturnBitfield2.tradeCaptureReportRejectV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportRejectV2ReturnBitfield2Present() && tradeCaptureReportRejectV2ReturnBitfield2.tradeCaptureReportRejectV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportRejectV2ReturnBitfield2Present() && tradeCaptureReportRejectV2ReturnBitfield2.tradeCaptureReportRejectV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportRejectV2ReturnBitfield2Present() && tradeCaptureReportRejectV2ReturnBitfield2.tradeCaptureReportRejectV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCaptureReportRejectV2ReturnBitfield2Present() && tradeCaptureReportRejectV2ReturnBitfield2.tradeCaptureReportRejectV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportRejectV2ReturnBitfield3Present() && tradeCaptureReportRejectV2ReturnBitfield3.tradeCaptureReportRejectV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (tradeCaptureReportRejectV2ReturnBitfield3Present() && tradeCaptureReportRejectV2ReturnBitfield3.tradeCaptureReportRejectV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the TradeReportTypeReturn put it on the wire.
     *
     * <p>Decode reads the TradeReportTypeReturn where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTypeReturn is on the wire
     */
    public boolean tradeReportTypeReturnPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportRejectV2ReturnBitfield7Present() && tradeCaptureReportRejectV2ReturnBitfield7.tradeCaptureReportRejectV2ReturnBitfield7TradeReportTypeReturn());
    }

    /**
     * Returns whether the fields before the TradePublishIndicator put it on the wire.
     *
     * <p>Decode reads the TradePublishIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePublishIndicator is on the wire
     */
    public boolean tradePublishIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportRejectV2ReturnBitfield7Present() && tradeCaptureReportRejectV2ReturnBitfield7.tradeCaptureReportRejectV2ReturnBitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the RptTime put it on the wire.
     *
     * <p>Decode reads the RptTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RptTime is on the wire
     */
    public boolean rptTimePresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCaptureReportRejectV2ReturnBitfield7Present() && tradeCaptureReportRejectV2ReturnBitfield7.tradeCaptureReportRejectV2ReturnBitfield7TradePublishIndReturn());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (tradeCaptureReportRejectV2ReturnBitfield10Present() && tradeCaptureReportRejectV2ReturnBitfield10.tradeCaptureReportRejectV2ReturnBitfield10PriceFormation());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (tradeCaptureReportRejectV2ReturnBitfield11Present() && tradeCaptureReportRejectV2ReturnBitfield11.tradeCaptureReportRejectV2ReturnBitfield11AlgorithmicIndicator());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportRejectV2ReturnBitfield1 || tradeCaptureReportRejectV2ReturnBitfield1Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield2 || tradeCaptureReportRejectV2ReturnBitfield2Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield3 || tradeCaptureReportRejectV2ReturnBitfield3Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield4 || tradeCaptureReportRejectV2ReturnBitfield4Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield5 || tradeCaptureReportRejectV2ReturnBitfield5Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield6 || tradeCaptureReportRejectV2ReturnBitfield6Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield7 || tradeCaptureReportRejectV2ReturnBitfield7Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield8 || tradeCaptureReportRejectV2ReturnBitfield8Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield9 || tradeCaptureReportRejectV2ReturnBitfield9Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield10 || tradeCaptureReportRejectV2ReturnBitfield10Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield11 || tradeCaptureReportRejectV2ReturnBitfield11Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield12 || tradeCaptureReportRejectV2ReturnBitfield12Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield13 || tradeCaptureReportRejectV2ReturnBitfield13Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield14 || tradeCaptureReportRejectV2ReturnBitfield14Present()) && (field != tradeCaptureReportRejectV2ReturnBitfield15 || tradeCaptureReportRejectV2ReturnBitfield15Present()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQty || orderQtyPresent()) && (field != tradeReportTypeReturn || tradeReportTypeReturnPresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != rptTime || rptTimePresent()) && (field != priceFormation || priceFormationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        tradeCaptureReportRejectV2TrdCapAckSideGrp.inputs(OptionalLong.of(numberOfReturnBitfields.value()), tradeCaptureReportRejectV2ReturnBitfield1Present() ? OptionalLong.of(tradeCaptureReportRejectV2ReturnBitfield1.value()) : OptionalLong.empty(), tradeCaptureReportRejectV2ReturnBitfield2Present() ? OptionalLong.of(tradeCaptureReportRejectV2ReturnBitfield2.value()) : OptionalLong.empty(), tradeCaptureReportRejectV2ReturnBitfield3Present() ? OptionalLong.of(tradeCaptureReportRejectV2ReturnBitfield3.value()) : OptionalLong.empty(), tradeCaptureReportRejectV2ReturnBitfield4Present() ? OptionalLong.of(tradeCaptureReportRejectV2ReturnBitfield4.value()) : OptionalLong.empty(), tradeCaptureReportRejectV2ReturnBitfield6Present() ? OptionalLong.of(tradeCaptureReportRejectV2ReturnBitfield6.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportRejectV2ReturnBitfield1Present() ? TradeCaptureReportRejectV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield2Present() ? TradeCaptureReportRejectV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield3Present() ? TradeCaptureReportRejectV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield4Present() ? TradeCaptureReportRejectV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield5Present() ? TradeCaptureReportRejectV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield6Present() ? TradeCaptureReportRejectV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield7Present() ? TradeCaptureReportRejectV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield8Present() ? TradeCaptureReportRejectV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield9Present() ? TradeCaptureReportRejectV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield10Present() ? TradeCaptureReportRejectV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield11Present() ? TradeCaptureReportRejectV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield12Present() ? TradeCaptureReportRejectV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield13Present() ? TradeCaptureReportRejectV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield14Present() ? TradeCaptureReportRejectV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (tradeCaptureReportRejectV2ReturnBitfield15Present() ? TradeCaptureReportRejectV2ReturnBitfield15Field.BYTE_LENGTH : 0) + tradeCaptureReportRejectV2TrdCapAckSideGrp.byteLength() + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (tradeReportTypeReturnPresent() ? TradeReportTypeReturnField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (rptTimePresent() ? RptTimeField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0);
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
        if (tradeCaptureReportRejectV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += tradeCaptureReportRejectV2TrdCapAckSideGrp.byteLength();
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
        if (priceFormationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
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
        if (tradeCaptureReportRejectV2ReturnBitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield1Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield2Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield3Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield4Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield5Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield6Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield6Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield7Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield7Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield8Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield8Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield9Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield9Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield10Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield10Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield11Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield11Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield12Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield12Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield13Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield13Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield14Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield14Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportRejectV2ReturnBitfield15Present()) {
            if (end - 1 - cursor < TradeCaptureReportRejectV2ReturnBitfield15Field.BYTE_LENGTH || !tradeCaptureReportRejectV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportRejectV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!tradeCaptureReportRejectV2TrdCapAckSideGrp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += tradeCaptureReportRejectV2TrdCapAckSideGrp.byteLength();
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeCaptureReportRejectV2TrdCapAckSideGrp.size() > 255) {
            throw new IllegalStateException("tradeCaptureReportRejectV2TrdCapAckSideGrp holds " + tradeCaptureReportRejectV2TrdCapAckSideGrp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) tradeCaptureReportRejectV2TrdCapAckSideGrp.size());
        if (tradeCaptureReportRejectV2ReturnBitfield1Present() != tradeCaptureReportRejectV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield1.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield2Present() != tradeCaptureReportRejectV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield2.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield3Present() != tradeCaptureReportRejectV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield3.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield4Present() != tradeCaptureReportRejectV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield4.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield5Present() != tradeCaptureReportRejectV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield5.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield6Present() != tradeCaptureReportRejectV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield6.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield7Present() != tradeCaptureReportRejectV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield7.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield8Present() != tradeCaptureReportRejectV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield8.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield9Present() != tradeCaptureReportRejectV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield9.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield10Present() != tradeCaptureReportRejectV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield10.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield11Present() != tradeCaptureReportRejectV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield11.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield12Present() != tradeCaptureReportRejectV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield12.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield13Present() != tradeCaptureReportRejectV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield13.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield14Present() != tradeCaptureReportRejectV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield14.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportRejectV2ReturnBitfield15Present() != tradeCaptureReportRejectV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportRejectV2ReturnBitfield15.hasValue() ? "tradeCaptureReportRejectV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "tradeCaptureReportRejectV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
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
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (tradeCaptureReportRejectV2ReturnBitfield1Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield1.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield2Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield2.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield3Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield3.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield4Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield4.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield5Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield5.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield6Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield6.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield7Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield7.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield8Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield8.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield9Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield9.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield10Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield10.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield11Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield11.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield12Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield12.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield13Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield13.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield14Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield14.encode(data, cursor);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield15Present()) {
            cursor = tradeCaptureReportRejectV2ReturnBitfield15.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = tradeCaptureReportRejectV2TrdCapAckSideGrp.encode(data, cursor);
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
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
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
        tradeCaptureReportRejectV2TrdCapAckSideGrp.clear();
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
        return tradeCaptureReportRejectV2TrdCapAckSideGrp.isRecognized();
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
        if (!tradeCaptureReportRejectV2TrdCapAckSideGrp.isValid()) {
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
        if (!reason.isDecoded()) {
            return Optional.of(reason);
        }
        if (!text.isDecoded()) {
            return Optional.of(text);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield1Present() && !tradeCaptureReportRejectV2ReturnBitfield1.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield1);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield2Present() && !tradeCaptureReportRejectV2ReturnBitfield2.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield2);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield3Present() && !tradeCaptureReportRejectV2ReturnBitfield3.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield3);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield4Present() && !tradeCaptureReportRejectV2ReturnBitfield4.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield4);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield5Present() && !tradeCaptureReportRejectV2ReturnBitfield5.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield5);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield6Present() && !tradeCaptureReportRejectV2ReturnBitfield6.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield6);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield7Present() && !tradeCaptureReportRejectV2ReturnBitfield7.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield7);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield8Present() && !tradeCaptureReportRejectV2ReturnBitfield8.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield8);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield9Present() && !tradeCaptureReportRejectV2ReturnBitfield9.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield9);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield10Present() && !tradeCaptureReportRejectV2ReturnBitfield10.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield10);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield11Present() && !tradeCaptureReportRejectV2ReturnBitfield11.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield11);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield12Present() && !tradeCaptureReportRejectV2ReturnBitfield12.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield12);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield13Present() && !tradeCaptureReportRejectV2ReturnBitfield13.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield13);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield14Present() && !tradeCaptureReportRejectV2ReturnBitfield14.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield14);
        }
        if (tradeCaptureReportRejectV2ReturnBitfield15Present() && !tradeCaptureReportRejectV2ReturnBitfield15.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2ReturnBitfield15);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!tradeCaptureReportRejectV2TrdCapAckSideGrp.isDecoded()) {
            return Optional.of(tradeCaptureReportRejectV2TrdCapAckSideGrp.failedEntry().flatMap(TradeCaptureReportRejectV2TrdCapAckSideGrpEntry::failedAt).orElse(noSides));
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
        if (priceFormationPresent() && !priceFormation.isDecoded()) {
            return Optional.of(priceFormation);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
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
            case "Reason" -> Optional.of(reason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "TradeCaptureReportRejectV2ReturnBitfield1" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield1);
            case "TradeCaptureReportRejectV2ReturnBitfield2" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield2);
            case "TradeCaptureReportRejectV2ReturnBitfield3" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield3);
            case "TradeCaptureReportRejectV2ReturnBitfield4" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield4);
            case "TradeCaptureReportRejectV2ReturnBitfield5" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield5);
            case "TradeCaptureReportRejectV2ReturnBitfield6" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield6);
            case "TradeCaptureReportRejectV2ReturnBitfield7" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield7);
            case "TradeCaptureReportRejectV2ReturnBitfield8" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield8);
            case "TradeCaptureReportRejectV2ReturnBitfield9" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield9);
            case "TradeCaptureReportRejectV2ReturnBitfield10" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield10);
            case "TradeCaptureReportRejectV2ReturnBitfield11" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield11);
            case "TradeCaptureReportRejectV2ReturnBitfield12" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield12);
            case "TradeCaptureReportRejectV2ReturnBitfield13" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield13);
            case "TradeCaptureReportRejectV2ReturnBitfield14" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield14);
            case "TradeCaptureReportRejectV2ReturnBitfield15" -> Optional.of(tradeCaptureReportRejectV2ReturnBitfield15);
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
            case "PriceFormation" -> Optional.of(priceFormation);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureReportRejectV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeCaptureReportRejectV2TrdCapAckSideGrp.diffFields(message.tradeCaptureReportRejectV2TrdCapAckSideGrp));
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
            tradeCaptureReportRejectV2TrdCapAckSideGrp.toFormattedString(builder, options);
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
        tradeCaptureReportRejectV2TrdCapAckSideGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeCaptureReportRejectV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeCaptureReportRejectV2TrdCapAckSideGrp.equals(message.tradeCaptureReportRejectV2TrdCapAckSideGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeCaptureReportRejectV2TrdCapAckSideGrp);
    }
}
