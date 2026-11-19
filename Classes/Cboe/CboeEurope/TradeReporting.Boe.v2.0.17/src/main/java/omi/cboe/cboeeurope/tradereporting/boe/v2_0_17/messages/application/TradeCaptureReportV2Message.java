package omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.AlgorithmicIndicatorField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.CurrencyField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.DeferralReasonField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.ExecutionMethodField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.GrossTradeAmtField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.IdSourceField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.LargeSizeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.LastPxField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.LastSharesField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.MatchTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.NoSidesField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.NumberOfTradeCaptureReportV2BitfieldsField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.OrderCategoryField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.PriceFormationField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SecondaryTrdTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SecurityExchangeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SecurityIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.SymbolField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeCaptureReportV2Bitfield1Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeCaptureReportV2Bitfield2Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeCaptureReportV2Bitfield3Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeCaptureReportV2Bitfield4Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeCaptureReportV2Bitfield5Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradePriceConditionField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradePublishIndicatorField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeReportIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeReportTransTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradeTimeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TradingSessionSubIdField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TransactionCategoryField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.TrdSubTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.VenueTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.fields.WaiverTypeField;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.groups.TrdCapRptSideGrpEntry;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.groups.TrdCapRptSideGrpList;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.Field;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.Message;
import omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.types.PrintOptions;

/**
 * Represents the TradeCaptureReportV2Message message from the TradeReporting protocol.
 *
 * <p>Trade Capture Report V2 Message.</p>
 */
public final class TradeCaptureReportV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Report V 2 Message";

    /**
     * Corresponds to TradeReportID (571) in Bats FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Bats only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique.
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Corresponds to LastShares (32) in Bats FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Corresponds to LastPx (31) in Bats FIX. Price of this fill. A value of zero or an indicative price may be used if the price is pending, as denoted by PriceFormation
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfTradeCaptureReportV2BitfieldsField numberOfTradeCaptureReportV2Bitfields = new NumberOfTradeCaptureReportV2BitfieldsField();

    /**
     * BitSet TradeCaptureReportV2 byte 1.
     */
    private final TradeCaptureReportV2Bitfield1Field tradeCaptureReportV2Bitfield1 = new TradeCaptureReportV2Bitfield1Field();

    /**
     * BitSet TradeCaptureReportV2 byte 2.
     */
    private final TradeCaptureReportV2Bitfield2Field tradeCaptureReportV2Bitfield2 = new TradeCaptureReportV2Bitfield2Field();

    /**
     * BitSet TradeCaptureReportV2 byte 3.
     */
    private final TradeCaptureReportV2Bitfield3Field tradeCaptureReportV2Bitfield3 = new TradeCaptureReportV2Bitfield3Field();

    /**
     * BitSet TradeCaptureReportV2 byte 4.
     */
    private final TradeCaptureReportV2Bitfield4Field tradeCaptureReportV2Bitfield4 = new TradeCaptureReportV2Bitfield4Field();

    /**
     * BitSet TradeCaptureReportV2 byte 5.
     */
    private final TradeCaptureReportV2Bitfield5Field tradeCaptureReportV2Bitfield5 = new TradeCaptureReportV2Bitfield5Field();

    /**
     * Corresponds to NoSides (552) in Bats FIX. Indicates the number of repeating groups to fol- low. Currently, can be 1 or 2.
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
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Trade Time
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * Trade Report Trans Type
     */
    private final TradeReportTransTypeField tradeReportTransType = new TradeReportTransTypeField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Venue Type
     */
    private final VenueTypeField venueType = new VenueTypeField();

    /**
     * Trading Session Sub Id
     */
    private final TradingSessionSubIdField tradingSessionSubId = new TradingSessionSubIdField();

    /**
     * Match Type
     */
    private final MatchTypeField matchType = new MatchTypeField();

    /**
     * Trd Sub Type
     */
    private final TrdSubTypeField trdSubType = new TrdSubTypeField();

    /**
     * Secondary Trd Type
     */
    private final SecondaryTrdTypeField secondaryTrdType = new SecondaryTrdTypeField();

    /**
     * Trade Price Condition
     */
    private final TradePriceConditionField tradePriceCondition = new TradePriceConditionField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Large Size
     */
    private final LargeSizeField largeSize = new LargeSizeField();

    /**
     * Execution Method
     */
    private final ExecutionMethodField executionMethod = new ExecutionMethodField();

    /**
     * Gross Trade Amt
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Waiver Type
     */
    private final WaiverTypeField waiverType = new WaiverTypeField();

    /**
     * Deferral Reason
     */
    private final DeferralReasonField deferralReason = new DeferralReasonField();

    /**
     * Repeating group stated NoSides times.
     */
    private final TrdCapRptSideGrpList trdCapRptSideGrp = new TrdCapRptSideGrpList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradeReportId, lastShares, lastPx, numberOfTradeCaptureReportV2Bitfields, tradeCaptureReportV2Bitfield1, tradeCaptureReportV2Bitfield2, tradeCaptureReportV2Bitfield3, tradeCaptureReportV2Bitfield4, tradeCaptureReportV2Bitfield5, noSides, symbol, currency, idSource, securityId, securityExchange, transactionCategory, tradeTime, tradeReportTransType, tradeId, venueType, tradingSessionSubId, matchType, trdSubType, secondaryTrdType, tradePriceCondition, tradePublishIndicator, largeSize, executionMethod, grossTradeAmt, orderCategory, priceFormation, algorithmicIndicator, waiverType, deferralReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to TradeReportID (571) in Bats FIX. Day-unique ID chosen by client. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate. Note: Bats only enforces the uniqueness of TradeReportID values among currently live trade reports. However, we strongly rec- ommend that you keep your TradeReportID values day unique.
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
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
     * Corresponds to LastPx (31) in Bats FIX. Price of this fill. A value of zero or an indicative price may be used if the price is pending, as denoted by PriceFormation
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfTradeCaptureReportV2Bitfields field
     */
    public NumberOfTradeCaptureReportV2BitfieldsField numberOfTradeCaptureReportV2Bitfields() {
        return numberOfTradeCaptureReportV2Bitfields;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 1.
     *
     * @return the TradeCaptureReportV2Bitfield1 field
     */
    public TradeCaptureReportV2Bitfield1Field tradeCaptureReportV2Bitfield1() {
        return tradeCaptureReportV2Bitfield1;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 2.
     *
     * @return the TradeCaptureReportV2Bitfield2 field
     */
    public TradeCaptureReportV2Bitfield2Field tradeCaptureReportV2Bitfield2() {
        return tradeCaptureReportV2Bitfield2;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 3.
     *
     * @return the TradeCaptureReportV2Bitfield3 field
     */
    public TradeCaptureReportV2Bitfield3Field tradeCaptureReportV2Bitfield3() {
        return tradeCaptureReportV2Bitfield3;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 4.
     *
     * @return the TradeCaptureReportV2Bitfield4 field
     */
    public TradeCaptureReportV2Bitfield4Field tradeCaptureReportV2Bitfield4() {
        return tradeCaptureReportV2Bitfield4;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 5.
     *
     * @return the TradeCaptureReportV2Bitfield5 field
     */
    public TradeCaptureReportV2Bitfield5Field tradeCaptureReportV2Bitfield5() {
        return tradeCaptureReportV2Bitfield5;
    }

    /**
     * Corresponds to NoSides (552) in Bats FIX. Indicates the number of repeating groups to fol- low. Currently, can be 1 or 2.
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
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Trade Time
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
    }

    /**
     * Trade Report Trans Type
     *
     * @return the TradeReportTransType field
     */
    public TradeReportTransTypeField tradeReportTransType() {
        return tradeReportTransType;
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
     * Venue Type
     *
     * @return the VenueType field
     */
    public VenueTypeField venueType() {
        return venueType;
    }

    /**
     * Trading Session Sub Id
     *
     * @return the TradingSessionSubId field
     */
    public TradingSessionSubIdField tradingSessionSubId() {
        return tradingSessionSubId;
    }

    /**
     * Match Type
     *
     * @return the MatchType field
     */
    public MatchTypeField matchType() {
        return matchType;
    }

    /**
     * Trd Sub Type
     *
     * @return the TrdSubType field
     */
    public TrdSubTypeField trdSubType() {
        return trdSubType;
    }

    /**
     * Secondary Trd Type
     *
     * @return the SecondaryTrdType field
     */
    public SecondaryTrdTypeField secondaryTrdType() {
        return secondaryTrdType;
    }

    /**
     * Trade Price Condition
     *
     * @return the TradePriceCondition field
     */
    public TradePriceConditionField tradePriceCondition() {
        return tradePriceCondition;
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
     * Large Size
     *
     * @return the LargeSize field
     */
    public LargeSizeField largeSize() {
        return largeSize;
    }

    /**
     * Execution Method
     *
     * @return the ExecutionMethod field
     */
    public ExecutionMethodField executionMethod() {
        return executionMethod;
    }

    /**
     * Gross Trade Amt
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
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
     * Waiver Type
     *
     * @return the WaiverType field
     */
    public WaiverTypeField waiverType() {
        return waiverType;
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
     * @return the TrdCapRptSideGrp entries
     */
    public TrdCapRptSideGrpList trdCapRptSideGrp() {
        return trdCapRptSideGrp;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield1 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield1Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield2 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield2Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield3 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield3Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield4 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield4Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield5 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield5Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1SecurityExchange());
    }

    /**
     * Returns whether the fields before the TransactionCategory put it on the wire.
     *
     * <p>Decode reads the TransactionCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TransactionCategory is on the wire
     */
    public boolean transactionCategoryPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TransactionCategory());
    }

    /**
     * Returns whether the fields before the TradeTime put it on the wire.
     *
     * <p>Decode reads the TradeTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeTime is on the wire
     */
    public boolean tradeTimePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeTime());
    }

    /**
     * Returns whether the fields before the TradeReportTransType put it on the wire.
     *
     * <p>Decode reads the TradeReportTransType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTransType is on the wire
     */
    public boolean tradeReportTransTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeReportTransType());
    }

    /**
     * Returns whether the fields before the TradeId put it on the wire.
     *
     * <p>Decode reads the TradeId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeId is on the wire
     */
    public boolean tradeIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeId());
    }

    /**
     * Returns whether the fields before the VenueType put it on the wire.
     *
     * <p>Decode reads the VenueType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VenueType is on the wire
     */
    public boolean venueTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2VenueType());
    }

    /**
     * Returns whether the fields before the TradingSessionSubId put it on the wire.
     *
     * <p>Decode reads the TradingSessionSubId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradingSessionSubId is on the wire
     */
    public boolean tradingSessionSubIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TradingSessionSubId());
    }

    /**
     * Returns whether the fields before the MatchType put it on the wire.
     *
     * <p>Decode reads the MatchType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MatchType is on the wire
     */
    public boolean matchTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3MatchType());
    }

    /**
     * Returns whether the fields before the TrdSubType put it on the wire.
     *
     * <p>Decode reads the TrdSubType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TrdSubType is on the wire
     */
    public boolean trdSubTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TrdSubType());
    }

    /**
     * Returns whether the fields before the SecondaryTrdType put it on the wire.
     *
     * <p>Decode reads the SecondaryTrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryTrdType is on the wire
     */
    public boolean secondaryTrdTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3SecondaryTrdType());
    }

    /**
     * Returns whether the fields before the TradePriceCondition put it on the wire.
     *
     * <p>Decode reads the TradePriceCondition where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePriceCondition is on the wire
     */
    public boolean tradePriceConditionPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TradePriceCondition());
    }

    /**
     * Returns whether the fields before the TradePublishIndicator put it on the wire.
     *
     * <p>Decode reads the TradePublishIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePublishIndicator is on the wire
     */
    public boolean tradePublishIndicatorPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TradePublishIndicator());
    }

    /**
     * Returns whether the fields before the LargeSize put it on the wire.
     *
     * <p>Decode reads the LargeSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LargeSize is on the wire
     */
    public boolean largeSizePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3LargeSize());
    }

    /**
     * Returns whether the fields before the ExecutionMethod put it on the wire.
     *
     * <p>Decode reads the ExecutionMethod where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutionMethod is on the wire
     */
    public boolean executionMethodPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3ExecutionMethod());
    }

    /**
     * Returns whether the fields before the GrossTradeAmt put it on the wire.
     *
     * <p>Decode reads the GrossTradeAmt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GrossTradeAmt is on the wire
     */
    public boolean grossTradeAmtPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4GrossTradeAmt());
    }

    /**
     * Returns whether the fields before the OrderCategory put it on the wire.
     *
     * <p>Decode reads the OrderCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCategory is on the wire
     */
    public boolean orderCategoryPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4OrderCategory());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5PriceFormation());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5WaiverType());
    }

    /**
     * Returns whether the fields before the DeferralReason put it on the wire.
     *
     * <p>Decode reads the DeferralReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DeferralReason is on the wire
     */
    public boolean deferralReasonPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5DeferralReason());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportV2Bitfield1 || tradeCaptureReportV2Bitfield1Present()) && (field != tradeCaptureReportV2Bitfield2 || tradeCaptureReportV2Bitfield2Present()) && (field != tradeCaptureReportV2Bitfield3 || tradeCaptureReportV2Bitfield3Present()) && (field != tradeCaptureReportV2Bitfield4 || tradeCaptureReportV2Bitfield4Present()) && (field != tradeCaptureReportV2Bitfield5 || tradeCaptureReportV2Bitfield5Present()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != transactionCategory || transactionCategoryPresent()) && (field != tradeTime || tradeTimePresent()) && (field != tradeReportTransType || tradeReportTransTypePresent()) && (field != tradeId || tradeIdPresent()) && (field != venueType || venueTypePresent()) && (field != tradingSessionSubId || tradingSessionSubIdPresent()) && (field != matchType || matchTypePresent()) && (field != trdSubType || trdSubTypePresent()) && (field != secondaryTrdType || secondaryTrdTypePresent()) && (field != tradePriceCondition || tradePriceConditionPresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != largeSize || largeSizePresent()) && (field != executionMethod || executionMethodPresent()) && (field != grossTradeAmt || grossTradeAmtPresent()) && (field != orderCategory || orderCategoryPresent()) && (field != priceFormation || priceFormationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != waiverType || waiverTypePresent()) && (field != deferralReason || deferralReasonPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        trdCapRptSideGrp.inputs(OptionalLong.of(numberOfTradeCaptureReportV2Bitfields.value()), tradeCaptureReportV2Bitfield2Present() ? OptionalLong.of(tradeCaptureReportV2Bitfield2.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportV2Bitfield1Present() ? TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield2Present() ? TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield3Present() ? TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield4Present() ? TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield5Present() ? TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH : 0) + trdCapRptSideGrp.byteLength() + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (transactionCategoryPresent() ? TransactionCategoryField.BYTE_LENGTH : 0) + (tradeTimePresent() ? TradeTimeField.BYTE_LENGTH : 0) + (tradeReportTransTypePresent() ? TradeReportTransTypeField.BYTE_LENGTH : 0) + (tradeIdPresent() ? TradeIdField.BYTE_LENGTH : 0) + (venueTypePresent() ? VenueTypeField.BYTE_LENGTH : 0) + (tradingSessionSubIdPresent() ? TradingSessionSubIdField.BYTE_LENGTH : 0) + (matchTypePresent() ? MatchTypeField.BYTE_LENGTH : 0) + (trdSubTypePresent() ? TrdSubTypeField.BYTE_LENGTH : 0) + (secondaryTrdTypePresent() ? SecondaryTrdTypeField.BYTE_LENGTH : 0) + (tradePriceConditionPresent() ? TradePriceConditionField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (largeSizePresent() ? LargeSizeField.BYTE_LENGTH : 0) + (executionMethodPresent() ? ExecutionMethodField.BYTE_LENGTH : 0) + (grossTradeAmtPresent() ? GrossTradeAmtField.BYTE_LENGTH : 0) + (orderCategoryPresent() ? OrderCategoryField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (deferralReasonPresent() ? DeferralReasonField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(tradeTime.value());
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
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!numberOfTradeCaptureReportV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradeCaptureReportV2BitfieldsField.BYTE_LENGTH;
        if (tradeCaptureReportV2Bitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        giveEntryInputs();
        if (!trdCapRptSideGrp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += trdCapRptSideGrp.byteLength();
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
        if (transactionCategoryPresent()) {
            if (end - cursor < TransactionCategoryField.BYTE_LENGTH || !transactionCategory.parse(data, cursor)) {
                return false;
            }
            cursor += TransactionCategoryField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeTimePresent()) {
            if (end - cursor < TradeTimeField.BYTE_LENGTH || !tradeTime.parse(data, cursor)) {
                return false;
            }
            cursor += TradeTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportTransTypePresent()) {
            if (end - cursor < TradeReportTransTypeField.BYTE_LENGTH || !tradeReportTransType.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportTransTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeIdPresent()) {
            if (end - cursor < TradeIdField.BYTE_LENGTH || !tradeId.parse(data, cursor)) {
                return false;
            }
            cursor += TradeIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (venueTypePresent()) {
            if (end - cursor < VenueTypeField.BYTE_LENGTH || !venueType.parse(data, cursor)) {
                return false;
            }
            cursor += VenueTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradingSessionSubIdPresent()) {
            if (end - cursor < TradingSessionSubIdField.BYTE_LENGTH || !tradingSessionSubId.parse(data, cursor)) {
                return false;
            }
            cursor += TradingSessionSubIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (matchTypePresent()) {
            if (end - cursor < MatchTypeField.BYTE_LENGTH || !matchType.parse(data, cursor)) {
                return false;
            }
            cursor += MatchTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (trdSubTypePresent()) {
            if (end - cursor < TrdSubTypeField.BYTE_LENGTH || !trdSubType.parse(data, cursor)) {
                return false;
            }
            cursor += TrdSubTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryTrdTypePresent()) {
            if (end - cursor < SecondaryTrdTypeField.BYTE_LENGTH || !secondaryTrdType.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryTrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradePriceConditionPresent()) {
            if (end - cursor < TradePriceConditionField.BYTE_LENGTH || !tradePriceCondition.parse(data, cursor)) {
                return false;
            }
            cursor += TradePriceConditionField.BYTE_LENGTH;
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
        if (largeSizePresent()) {
            if (end - cursor < LargeSizeField.BYTE_LENGTH || !largeSize.parse(data, cursor)) {
                return false;
            }
            cursor += LargeSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executionMethodPresent()) {
            if (end - cursor < ExecutionMethodField.BYTE_LENGTH || !executionMethod.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutionMethodField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (grossTradeAmtPresent()) {
            if (end - cursor < GrossTradeAmtField.BYTE_LENGTH || !grossTradeAmt.parse(data, cursor)) {
                return false;
            }
            cursor += GrossTradeAmtField.BYTE_LENGTH;
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
        if (waiverTypePresent()) {
            if (end - cursor < WaiverTypeField.BYTE_LENGTH || !waiverType.parse(data, cursor)) {
                return false;
            }
            cursor += WaiverTypeField.BYTE_LENGTH;
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
        if (trdCapRptSideGrp.size() > 255) {
            throw new IllegalStateException("trdCapRptSideGrp holds " + trdCapRptSideGrp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) trdCapRptSideGrp.size());
        if (tradeCaptureReportV2Bitfield1Present() != tradeCaptureReportV2Bitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield1.hasValue() ? "tradeCaptureReportV2Bitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield2Present() != tradeCaptureReportV2Bitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield2.hasValue() ? "tradeCaptureReportV2Bitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield3Present() != tradeCaptureReportV2Bitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield3.hasValue() ? "tradeCaptureReportV2Bitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield4Present() != tradeCaptureReportV2Bitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield4.hasValue() ? "tradeCaptureReportV2Bitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield5Present() != tradeCaptureReportV2Bitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield5.hasValue() ? "tradeCaptureReportV2Bitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield5 holds no value, though the fields before it put it on the wire");
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
        if (transactionCategoryPresent() != transactionCategory.hasValue()) {
            throw new IllegalStateException(transactionCategory.hasValue() ? "transactionCategory holds a value the fields before it leave off the wire" : "transactionCategory holds no value, though the fields before it put it on the wire");
        }
        if (tradeTimePresent() != tradeTime.hasValue()) {
            throw new IllegalStateException(tradeTime.hasValue() ? "tradeTime holds a value the fields before it leave off the wire" : "tradeTime holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportTransTypePresent() != tradeReportTransType.hasValue()) {
            throw new IllegalStateException(tradeReportTransType.hasValue() ? "tradeReportTransType holds a value the fields before it leave off the wire" : "tradeReportTransType holds no value, though the fields before it put it on the wire");
        }
        if (tradeIdPresent() != tradeId.hasValue()) {
            throw new IllegalStateException(tradeId.hasValue() ? "tradeId holds a value the fields before it leave off the wire" : "tradeId holds no value, though the fields before it put it on the wire");
        }
        if (venueTypePresent() != venueType.hasValue()) {
            throw new IllegalStateException(venueType.hasValue() ? "venueType holds a value the fields before it leave off the wire" : "venueType holds no value, though the fields before it put it on the wire");
        }
        if (tradingSessionSubIdPresent() != tradingSessionSubId.hasValue()) {
            throw new IllegalStateException(tradingSessionSubId.hasValue() ? "tradingSessionSubId holds a value the fields before it leave off the wire" : "tradingSessionSubId holds no value, though the fields before it put it on the wire");
        }
        if (matchTypePresent() != matchType.hasValue()) {
            throw new IllegalStateException(matchType.hasValue() ? "matchType holds a value the fields before it leave off the wire" : "matchType holds no value, though the fields before it put it on the wire");
        }
        if (trdSubTypePresent() != trdSubType.hasValue()) {
            throw new IllegalStateException(trdSubType.hasValue() ? "trdSubType holds a value the fields before it leave off the wire" : "trdSubType holds no value, though the fields before it put it on the wire");
        }
        if (secondaryTrdTypePresent() != secondaryTrdType.hasValue()) {
            throw new IllegalStateException(secondaryTrdType.hasValue() ? "secondaryTrdType holds a value the fields before it leave off the wire" : "secondaryTrdType holds no value, though the fields before it put it on the wire");
        }
        if (tradePriceConditionPresent() != tradePriceCondition.hasValue()) {
            throw new IllegalStateException(tradePriceCondition.hasValue() ? "tradePriceCondition holds a value the fields before it leave off the wire" : "tradePriceCondition holds no value, though the fields before it put it on the wire");
        }
        if (tradePublishIndicatorPresent() != tradePublishIndicator.hasValue()) {
            throw new IllegalStateException(tradePublishIndicator.hasValue() ? "tradePublishIndicator holds a value the fields before it leave off the wire" : "tradePublishIndicator holds no value, though the fields before it put it on the wire");
        }
        if (largeSizePresent() != largeSize.hasValue()) {
            throw new IllegalStateException(largeSize.hasValue() ? "largeSize holds a value the fields before it leave off the wire" : "largeSize holds no value, though the fields before it put it on the wire");
        }
        if (executionMethodPresent() != executionMethod.hasValue()) {
            throw new IllegalStateException(executionMethod.hasValue() ? "executionMethod holds a value the fields before it leave off the wire" : "executionMethod holds no value, though the fields before it put it on the wire");
        }
        if (grossTradeAmtPresent() != grossTradeAmt.hasValue()) {
            throw new IllegalStateException(grossTradeAmt.hasValue() ? "grossTradeAmt holds a value the fields before it leave off the wire" : "grossTradeAmt holds no value, though the fields before it put it on the wire");
        }
        if (orderCategoryPresent() != orderCategory.hasValue()) {
            throw new IllegalStateException(orderCategory.hasValue() ? "orderCategory holds a value the fields before it leave off the wire" : "orderCategory holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (waiverTypePresent() != waiverType.hasValue()) {
            throw new IllegalStateException(waiverType.hasValue() ? "waiverType holds a value the fields before it leave off the wire" : "waiverType holds no value, though the fields before it put it on the wire");
        }
        if (deferralReasonPresent() != deferralReason.hasValue()) {
            throw new IllegalStateException(deferralReason.hasValue() ? "deferralReason holds a value the fields before it leave off the wire" : "deferralReason holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = tradeReportId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = numberOfTradeCaptureReportV2Bitfields.encode(data, cursor);
        if (tradeCaptureReportV2Bitfield1Present()) {
            cursor = tradeCaptureReportV2Bitfield1.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield2Present()) {
            cursor = tradeCaptureReportV2Bitfield2.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield3Present()) {
            cursor = tradeCaptureReportV2Bitfield3.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield4Present()) {
            cursor = tradeCaptureReportV2Bitfield4.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield5Present()) {
            cursor = tradeCaptureReportV2Bitfield5.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        cursor = trdCapRptSideGrp.encode(data, cursor);
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
        if (transactionCategoryPresent()) {
            cursor = transactionCategory.encode(data, cursor);
        }
        if (tradeTimePresent()) {
            cursor = tradeTime.encode(data, cursor);
        }
        if (tradeReportTransTypePresent()) {
            cursor = tradeReportTransType.encode(data, cursor);
        }
        if (tradeIdPresent()) {
            cursor = tradeId.encode(data, cursor);
        }
        if (venueTypePresent()) {
            cursor = venueType.encode(data, cursor);
        }
        if (tradingSessionSubIdPresent()) {
            cursor = tradingSessionSubId.encode(data, cursor);
        }
        if (matchTypePresent()) {
            cursor = matchType.encode(data, cursor);
        }
        if (trdSubTypePresent()) {
            cursor = trdSubType.encode(data, cursor);
        }
        if (secondaryTrdTypePresent()) {
            cursor = secondaryTrdType.encode(data, cursor);
        }
        if (tradePriceConditionPresent()) {
            cursor = tradePriceCondition.encode(data, cursor);
        }
        if (tradePublishIndicatorPresent()) {
            cursor = tradePublishIndicator.encode(data, cursor);
        }
        if (largeSizePresent()) {
            cursor = largeSize.encode(data, cursor);
        }
        if (executionMethodPresent()) {
            cursor = executionMethod.encode(data, cursor);
        }
        if (grossTradeAmtPresent()) {
            cursor = grossTradeAmt.encode(data, cursor);
        }
        if (orderCategoryPresent()) {
            cursor = orderCategory.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (waiverTypePresent()) {
            cursor = waiverType.encode(data, cursor);
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
        trdCapRptSideGrp.clear();
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
        return trdCapRptSideGrp.isRecognized();
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
        if (!trdCapRptSideGrp.isValid()) {
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
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!lastShares.isDecoded()) {
            return Optional.of(lastShares);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!numberOfTradeCaptureReportV2Bitfields.isDecoded()) {
            return Optional.of(numberOfTradeCaptureReportV2Bitfields);
        }
        if (tradeCaptureReportV2Bitfield1Present() && !tradeCaptureReportV2Bitfield1.isDecoded()) {
            return Optional.of(tradeCaptureReportV2Bitfield1);
        }
        if (tradeCaptureReportV2Bitfield2Present() && !tradeCaptureReportV2Bitfield2.isDecoded()) {
            return Optional.of(tradeCaptureReportV2Bitfield2);
        }
        if (tradeCaptureReportV2Bitfield3Present() && !tradeCaptureReportV2Bitfield3.isDecoded()) {
            return Optional.of(tradeCaptureReportV2Bitfield3);
        }
        if (tradeCaptureReportV2Bitfield4Present() && !tradeCaptureReportV2Bitfield4.isDecoded()) {
            return Optional.of(tradeCaptureReportV2Bitfield4);
        }
        if (tradeCaptureReportV2Bitfield5Present() && !tradeCaptureReportV2Bitfield5.isDecoded()) {
            return Optional.of(tradeCaptureReportV2Bitfield5);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!trdCapRptSideGrp.isDecoded()) {
            return Optional.of(trdCapRptSideGrp.failedEntry().flatMap(TrdCapRptSideGrpEntry::failedAt).orElse(noSides));
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
        if (transactionCategoryPresent() && !transactionCategory.isDecoded()) {
            return Optional.of(transactionCategory);
        }
        if (tradeTimePresent() && !tradeTime.isDecoded()) {
            return Optional.of(tradeTime);
        }
        if (tradeReportTransTypePresent() && !tradeReportTransType.isDecoded()) {
            return Optional.of(tradeReportTransType);
        }
        if (tradeIdPresent() && !tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (venueTypePresent() && !venueType.isDecoded()) {
            return Optional.of(venueType);
        }
        if (tradingSessionSubIdPresent() && !tradingSessionSubId.isDecoded()) {
            return Optional.of(tradingSessionSubId);
        }
        if (matchTypePresent() && !matchType.isDecoded()) {
            return Optional.of(matchType);
        }
        if (trdSubTypePresent() && !trdSubType.isDecoded()) {
            return Optional.of(trdSubType);
        }
        if (secondaryTrdTypePresent() && !secondaryTrdType.isDecoded()) {
            return Optional.of(secondaryTrdType);
        }
        if (tradePriceConditionPresent() && !tradePriceCondition.isDecoded()) {
            return Optional.of(tradePriceCondition);
        }
        if (tradePublishIndicatorPresent() && !tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (largeSizePresent() && !largeSize.isDecoded()) {
            return Optional.of(largeSize);
        }
        if (executionMethodPresent() && !executionMethod.isDecoded()) {
            return Optional.of(executionMethod);
        }
        if (grossTradeAmtPresent() && !grossTradeAmt.isDecoded()) {
            return Optional.of(grossTradeAmt);
        }
        if (orderCategoryPresent() && !orderCategory.isDecoded()) {
            return Optional.of(orderCategory);
        }
        if (priceFormationPresent() && !priceFormation.isDecoded()) {
            return Optional.of(priceFormation);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
        }
        if (waiverTypePresent() && !waiverType.isDecoded()) {
            return Optional.of(waiverType);
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
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "NumberOfTradeCaptureReportV2Bitfields" -> Optional.of(numberOfTradeCaptureReportV2Bitfields);
            case "TradeCaptureReportV2Bitfield1" -> Optional.of(tradeCaptureReportV2Bitfield1);
            case "TradeCaptureReportV2Bitfield2" -> Optional.of(tradeCaptureReportV2Bitfield2);
            case "TradeCaptureReportV2Bitfield3" -> Optional.of(tradeCaptureReportV2Bitfield3);
            case "TradeCaptureReportV2Bitfield4" -> Optional.of(tradeCaptureReportV2Bitfield4);
            case "TradeCaptureReportV2Bitfield5" -> Optional.of(tradeCaptureReportV2Bitfield5);
            case "NoSides" -> Optional.of(noSides);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "TradeTime" -> Optional.of(tradeTime);
            case "TradeReportTransType" -> Optional.of(tradeReportTransType);
            case "TradeId" -> Optional.of(tradeId);
            case "VenueType" -> Optional.of(venueType);
            case "TradingSessionSubId" -> Optional.of(tradingSessionSubId);
            case "MatchType" -> Optional.of(matchType);
            case "TrdSubType" -> Optional.of(trdSubType);
            case "SecondaryTrdType" -> Optional.of(secondaryTrdType);
            case "TradePriceCondition" -> Optional.of(tradePriceCondition);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "LargeSize" -> Optional.of(largeSize);
            case "ExecutionMethod" -> Optional.of(executionMethod);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "WaiverType" -> Optional.of(waiverType);
            case "DeferralReason" -> Optional.of(deferralReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureReportV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(trdCapRptSideGrp.diffFields(message.trdCapRptSideGrp));
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
            trdCapRptSideGrp.toFormattedString(builder, options);
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
        trdCapRptSideGrp.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeCaptureReportV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && trdCapRptSideGrp.equals(message.trdCapRptSideGrp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, trdCapRptSideGrp);
    }
}
