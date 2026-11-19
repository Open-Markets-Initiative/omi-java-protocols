package omi.databento.marketdata.normalized.dbn.v3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v3.fields.ActivationField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ApplIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.AssetField;
import omi.databento.marketdata.normalized.dbn.v3.fields.CfiField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ChannelField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ContractMultiplierField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ContractMultiplierUnitField;
import omi.databento.marketdata.normalized.dbn.v3.fields.CurrencyField;
import omi.databento.marketdata.normalized.dbn.v3.fields.DecayQuantityField;
import omi.databento.marketdata.normalized.dbn.v3.fields.DecayStartDateField;
import omi.databento.marketdata.normalized.dbn.v3.fields.DisplayFactorField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ExchangeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.ExpirationField;
import omi.databento.marketdata.normalized.dbn.v3.fields.FlowScheduleTypeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.GroupField;
import omi.databento.marketdata.normalized.dbn.v3.fields.HighLimitPriceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.InstAttribValueField;
import omi.databento.marketdata.normalized.dbn.v3.fields.InstrumentClassField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegCountField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegDeltaField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegIndexField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegInstrumentClassField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegInstrumentIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegPriceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegRatioPriceDenominatorField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegRatioPriceNumeratorField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegRatioQtyDenominatorField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegRatioQtyNumeratorField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegRawSymbolField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegSideField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LegUnderlyingIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.LowLimitPriceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MainFractionField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MarketDepthField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MarketDepthImpliedField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MarketSegmentIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MatchAlgorithmField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaturityDayField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaturityMonthField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaturityWeekField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaturityYearField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaxPriceVariationField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MaxTradeVolField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinLotSizeBlockField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinLotSizeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinLotSizeRoundLotField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinPriceIncrementAmountField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinPriceIncrementField;
import omi.databento.marketdata.normalized.dbn.v3.fields.MinTradeVolField;
import omi.databento.marketdata.normalized.dbn.v3.fields.OriginalContractSizeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.PriceDisplayFormatField;
import omi.databento.marketdata.normalized.dbn.v3.fields.PriceRatioField;
import omi.databento.marketdata.normalized.dbn.v3.fields.RawInstrumentIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.RawSymbolField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SecsubtypeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SecurityTypeField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SecurityUpdateActionField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SettlCurrencyField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StrikePriceCurrencyField;
import omi.databento.marketdata.normalized.dbn.v3.fields.StrikePriceField;
import omi.databento.marketdata.normalized.dbn.v3.fields.SubFractionField;
import omi.databento.marketdata.normalized.dbn.v3.fields.TickRuleField;
import omi.databento.marketdata.normalized.dbn.v3.fields.TsRecvField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UnderlyingField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UnderlyingIdField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UnderlyingProductField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UnitOfMeasureField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UnitOfMeasureQtyField;
import omi.databento.marketdata.normalized.dbn.v3.fields.UserDefinedInstrumentField;
import omi.databento.marketdata.normalized.dbn.v3.types.Field;
import omi.databento.marketdata.normalized.dbn.v3.types.Message;
import omi.databento.marketdata.normalized.dbn.v3.types.PrintOptions;

/**
 * Represents the InstrumentDefMsg message from the Normalized protocol.
 *
 * <p>A definition of an instrument; the record of the definition schema</p>
 */
public final class InstrumentDefMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0013';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 504;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Def Msg";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 487, 17 };

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     */
    private final TsRecvField tsRecv = new TsRecvField();

    /**
     * The min price increment, where every 1 unit corresponds to 1e-9
     */
    private final MinPriceIncrementField minPriceIncrement = new MinPriceIncrementField();

    /**
     * The display factor, where every 1 unit corresponds to 1e-9
     */
    private final DisplayFactorField displayFactor = new DisplayFactorField();

    /**
     * The last eligible trade time expressed as the number of nanoseconds since the UNIX epoch
     */
    private final ExpirationField expiration = new ExpirationField();

    /**
     * The time of instrument activation expressed as the number of nanoseconds since the UNIX epoch
     */
    private final ActivationField activation = new ActivationField();

    /**
     * The high limit price, where every 1 unit corresponds to 1e-9
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * The low limit price, where every 1 unit corresponds to 1e-9
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * The max price variation, where every 1 unit corresponds to 1e-9
     */
    private final MaxPriceVariationField maxPriceVariation = new MaxPriceVariationField();

    /**
     * The unit of measure qty, where every 1 unit corresponds to 1e-9
     */
    private final UnitOfMeasureQtyField unitOfMeasureQty = new UnitOfMeasureQtyField();

    /**
     * The min price increment amount, where every 1 unit corresponds to 1e-9
     */
    private final MinPriceIncrementAmountField minPriceIncrementAmount = new MinPriceIncrementAmountField();

    /**
     * The price ratio, where every 1 unit corresponds to 1e-9
     */
    private final PriceRatioField priceRatio = new PriceRatioField();

    /**
     * The strike price, where every 1 unit corresponds to 1e-9
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * The instrument ID assigned by the publisher; may be the same as instrument_id
     */
    private final RawInstrumentIdField rawInstrumentId = new RawInstrumentIdField();

    /**
     * The leg price, where every 1 unit corresponds to 1e-9
     */
    private final LegPriceField legPrice = new LegPriceField();

    /**
     * The leg delta, where every 1 unit corresponds to 1e-9
     */
    private final LegDeltaField legDelta = new LegDeltaField();

    /**
     * A bitmap of instrument eligibility attributes; venue-specific
     */
    private final InstAttribValueField instAttribValue = new InstAttribValueField();

    /**
     * The underlying id
     */
    private final UnderlyingIdField underlyingId = new UnderlyingIdField();

    /**
     * The market depth implied
     */
    private final MarketDepthImpliedField marketDepthImplied = new MarketDepthImpliedField();

    /**
     * The market depth
     */
    private final MarketDepthField marketDepth = new MarketDepthField();

    /**
     * The market segment id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * The max trade vol
     */
    private final MaxTradeVolField maxTradeVol = new MaxTradeVolField();

    /**
     * The min lot size
     */
    private final MinLotSizeField minLotSize = new MinLotSizeField();

    /**
     * The min lot size block
     */
    private final MinLotSizeBlockField minLotSizeBlock = new MinLotSizeBlockField();

    /**
     * The min lot size round lot
     */
    private final MinLotSizeRoundLotField minLotSizeRoundLot = new MinLotSizeRoundLotField();

    /**
     * The min trade vol
     */
    private final MinTradeVolField minTradeVol = new MinTradeVolField();

    /**
     * The contract multiplier
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * The decay quantity
     */
    private final DecayQuantityField decayQuantity = new DecayQuantityField();

    /**
     * The original contract size
     */
    private final OriginalContractSizeField originalContractSize = new OriginalContractSizeField();

    /**
     * The leg instrument id
     */
    private final LegInstrumentIdField legInstrumentId = new LegInstrumentIdField();

    /**
     * The leg ratio price numerator
     */
    private final LegRatioPriceNumeratorField legRatioPriceNumerator = new LegRatioPriceNumeratorField();

    /**
     * The leg ratio price denominator
     */
    private final LegRatioPriceDenominatorField legRatioPriceDenominator = new LegRatioPriceDenominatorField();

    /**
     * The leg ratio qty numerator
     */
    private final LegRatioQtyNumeratorField legRatioQtyNumerator = new LegRatioQtyNumeratorField();

    /**
     * The leg ratio qty denominator
     */
    private final LegRatioQtyDenominatorField legRatioQtyDenominator = new LegRatioQtyDenominatorField();

    /**
     * The leg underlying id
     */
    private final LegUnderlyingIdField legUnderlyingId = new LegUnderlyingIdField();

    /**
     * The appl id
     */
    private final ApplIdField applId = new ApplIdField();

    /**
     * The maturity year
     */
    private final MaturityYearField maturityYear = new MaturityYearField();

    /**
     * The decay start date
     */
    private final DecayStartDateField decayStartDate = new DecayStartDateField();

    /**
     * The channel ID assigned by Databento as an incrementing integer starting at zero
     */
    private final ChannelField channel = new ChannelField();

    /**
     * The leg count
     */
    private final LegCountField legCount = new LegCountField();

    /**
     * The leg index
     */
    private final LegIndexField legIndex = new LegIndexField();

    /**
     * The currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The settl currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * The secsubtype
     */
    private final SecsubtypeField secsubtype = new SecsubtypeField();

    /**
     * The raw symbol
     */
    private final RawSymbolField rawSymbol = new RawSymbolField();

    /**
     * The group
     */
    private final GroupField group = new GroupField();

    /**
     * The exchange
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * The asset
     */
    private final AssetField asset = new AssetField();

    /**
     * The cfi
     */
    private final CfiField cfi = new CfiField();

    /**
     * The security type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * The unit of measure
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * The underlying
     */
    private final UnderlyingField underlying = new UnderlyingField();

    /**
     * The strike price currency
     */
    private final StrikePriceCurrencyField strikePriceCurrency = new StrikePriceCurrencyField();

    /**
     * The leg raw symbol
     */
    private final LegRawSymbolField legRawSymbol = new LegRawSymbolField();

    /**
     * The classification of the instrument
     */
    private final InstrumentClassField instrumentClass = new InstrumentClassField();

    /**
     * The matching algorithm used for the instrument, typically FIFO
     */
    private final MatchAlgorithmField matchAlgorithm = new MatchAlgorithmField();

    /**
     * The main fraction
     */
    private final MainFractionField mainFraction = new MainFractionField();

    /**
     * The price display format
     */
    private final PriceDisplayFormatField priceDisplayFormat = new PriceDisplayFormatField();

    /**
     * The sub fraction
     */
    private final SubFractionField subFraction = new SubFractionField();

    /**
     * The underlying product
     */
    private final UnderlyingProductField underlyingProduct = new UnderlyingProductField();

    /**
     * Indicates if the instrument definition has been added, modified, or deleted
     */
    private final SecurityUpdateActionField securityUpdateAction = new SecurityUpdateActionField();

    /**
     * The maturity month
     */
    private final MaturityMonthField maturityMonth = new MaturityMonthField();

    /**
     * The maturity day
     */
    private final MaturityDayField maturityDay = new MaturityDayField();

    /**
     * The maturity week
     */
    private final MaturityWeekField maturityWeek = new MaturityWeekField();

    /**
     * Indicates if the instrument is user defined
     */
    private final UserDefinedInstrumentField userDefinedInstrument = new UserDefinedInstrumentField();

    /**
     * The contract multiplier unit
     */
    private final ContractMultiplierUnitField contractMultiplierUnit = new ContractMultiplierUnitField();

    /**
     * The flow schedule type
     */
    private final FlowScheduleTypeField flowScheduleType = new FlowScheduleTypeField();

    /**
     * The tick rule
     */
    private final TickRuleField tickRule = new TickRuleField();

    /**
     * The classification of the leg instrument
     */
    private final LegInstrumentClassField legInstrumentClass = new LegInstrumentClassField();

    /**
     * The side taken for the leg when purchasing the spread
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tsRecv, minPriceIncrement, displayFactor, expiration, activation, highLimitPrice, lowLimitPrice, maxPriceVariation, unitOfMeasureQty, minPriceIncrementAmount, priceRatio, strikePrice, rawInstrumentId, legPrice, legDelta, instAttribValue, underlyingId, marketDepthImplied, marketDepth, marketSegmentId, maxTradeVol, minLotSize, minLotSizeBlock, minLotSizeRoundLot, minTradeVol, contractMultiplier, decayQuantity, originalContractSize, legInstrumentId, legRatioPriceNumerator, legRatioPriceDenominator, legRatioQtyNumerator, legRatioQtyDenominator, legUnderlyingId, applId, maturityYear, decayStartDate, channel, legCount, legIndex, currency, settlCurrency, secsubtype, rawSymbol, group, exchange, asset, cfi, securityType, unitOfMeasure, underlying, strikePriceCurrency, legRawSymbol, instrumentClass, matchAlgorithm, mainFraction, priceDisplayFormat, subFraction, underlyingProduct, securityUpdateAction, maturityMonth, maturityDay, maturityWeek, userDefinedInstrument, contractMultiplierUnit, flowScheduleType, tickRule, legInstrumentClass, legSide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The capture-server-received timestamp expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the TsRecv field
     */
    public TsRecvField tsRecv() {
        return tsRecv;
    }

    /**
     * The min price increment, where every 1 unit corresponds to 1e-9
     *
     * @return the MinPriceIncrement field
     */
    public MinPriceIncrementField minPriceIncrement() {
        return minPriceIncrement;
    }

    /**
     * The display factor, where every 1 unit corresponds to 1e-9
     *
     * @return the DisplayFactor field
     */
    public DisplayFactorField displayFactor() {
        return displayFactor;
    }

    /**
     * The last eligible trade time expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the Expiration field
     */
    public ExpirationField expiration() {
        return expiration;
    }

    /**
     * The time of instrument activation expressed as the number of nanoseconds since the UNIX epoch
     *
     * @return the Activation field
     */
    public ActivationField activation() {
        return activation;
    }

    /**
     * The high limit price, where every 1 unit corresponds to 1e-9
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * The low limit price, where every 1 unit corresponds to 1e-9
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * The max price variation, where every 1 unit corresponds to 1e-9
     *
     * @return the MaxPriceVariation field
     */
    public MaxPriceVariationField maxPriceVariation() {
        return maxPriceVariation;
    }

    /**
     * The unit of measure qty, where every 1 unit corresponds to 1e-9
     *
     * @return the UnitOfMeasureQty field
     */
    public UnitOfMeasureQtyField unitOfMeasureQty() {
        return unitOfMeasureQty;
    }

    /**
     * The min price increment amount, where every 1 unit corresponds to 1e-9
     *
     * @return the MinPriceIncrementAmount field
     */
    public MinPriceIncrementAmountField minPriceIncrementAmount() {
        return minPriceIncrementAmount;
    }

    /**
     * The price ratio, where every 1 unit corresponds to 1e-9
     *
     * @return the PriceRatio field
     */
    public PriceRatioField priceRatio() {
        return priceRatio;
    }

    /**
     * The strike price, where every 1 unit corresponds to 1e-9
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * The instrument ID assigned by the publisher; may be the same as instrument_id
     *
     * @return the RawInstrumentId field
     */
    public RawInstrumentIdField rawInstrumentId() {
        return rawInstrumentId;
    }

    /**
     * The leg price, where every 1 unit corresponds to 1e-9
     *
     * @return the LegPrice field
     */
    public LegPriceField legPrice() {
        return legPrice;
    }

    /**
     * The leg delta, where every 1 unit corresponds to 1e-9
     *
     * @return the LegDelta field
     */
    public LegDeltaField legDelta() {
        return legDelta;
    }

    /**
     * A bitmap of instrument eligibility attributes; venue-specific
     *
     * @return the InstAttribValue field
     */
    public InstAttribValueField instAttribValue() {
        return instAttribValue;
    }

    /**
     * The underlying id
     *
     * @return the UnderlyingId field
     */
    public UnderlyingIdField underlyingId() {
        return underlyingId;
    }

    /**
     * The market depth implied
     *
     * @return the MarketDepthImplied field
     */
    public MarketDepthImpliedField marketDepthImplied() {
        return marketDepthImplied;
    }

    /**
     * The market depth
     *
     * @return the MarketDepth field
     */
    public MarketDepthField marketDepth() {
        return marketDepth;
    }

    /**
     * The market segment id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * The max trade vol
     *
     * @return the MaxTradeVol field
     */
    public MaxTradeVolField maxTradeVol() {
        return maxTradeVol;
    }

    /**
     * The min lot size
     *
     * @return the MinLotSize field
     */
    public MinLotSizeField minLotSize() {
        return minLotSize;
    }

    /**
     * The min lot size block
     *
     * @return the MinLotSizeBlock field
     */
    public MinLotSizeBlockField minLotSizeBlock() {
        return minLotSizeBlock;
    }

    /**
     * The min lot size round lot
     *
     * @return the MinLotSizeRoundLot field
     */
    public MinLotSizeRoundLotField minLotSizeRoundLot() {
        return minLotSizeRoundLot;
    }

    /**
     * The min trade vol
     *
     * @return the MinTradeVol field
     */
    public MinTradeVolField minTradeVol() {
        return minTradeVol;
    }

    /**
     * The contract multiplier
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * The decay quantity
     *
     * @return the DecayQuantity field
     */
    public DecayQuantityField decayQuantity() {
        return decayQuantity;
    }

    /**
     * The original contract size
     *
     * @return the OriginalContractSize field
     */
    public OriginalContractSizeField originalContractSize() {
        return originalContractSize;
    }

    /**
     * The leg instrument id
     *
     * @return the LegInstrumentId field
     */
    public LegInstrumentIdField legInstrumentId() {
        return legInstrumentId;
    }

    /**
     * The leg ratio price numerator
     *
     * @return the LegRatioPriceNumerator field
     */
    public LegRatioPriceNumeratorField legRatioPriceNumerator() {
        return legRatioPriceNumerator;
    }

    /**
     * The leg ratio price denominator
     *
     * @return the LegRatioPriceDenominator field
     */
    public LegRatioPriceDenominatorField legRatioPriceDenominator() {
        return legRatioPriceDenominator;
    }

    /**
     * The leg ratio qty numerator
     *
     * @return the LegRatioQtyNumerator field
     */
    public LegRatioQtyNumeratorField legRatioQtyNumerator() {
        return legRatioQtyNumerator;
    }

    /**
     * The leg ratio qty denominator
     *
     * @return the LegRatioQtyDenominator field
     */
    public LegRatioQtyDenominatorField legRatioQtyDenominator() {
        return legRatioQtyDenominator;
    }

    /**
     * The leg underlying id
     *
     * @return the LegUnderlyingId field
     */
    public LegUnderlyingIdField legUnderlyingId() {
        return legUnderlyingId;
    }

    /**
     * The appl id
     *
     * @return the ApplId field
     */
    public ApplIdField applId() {
        return applId;
    }

    /**
     * The maturity year
     *
     * @return the MaturityYear field
     */
    public MaturityYearField maturityYear() {
        return maturityYear;
    }

    /**
     * The decay start date
     *
     * @return the DecayStartDate field
     */
    public DecayStartDateField decayStartDate() {
        return decayStartDate;
    }

    /**
     * The channel ID assigned by Databento as an incrementing integer starting at zero
     *
     * @return the Channel field
     */
    public ChannelField channel() {
        return channel;
    }

    /**
     * The leg count
     *
     * @return the LegCount field
     */
    public LegCountField legCount() {
        return legCount;
    }

    /**
     * The leg index
     *
     * @return the LegIndex field
     */
    public LegIndexField legIndex() {
        return legIndex;
    }

    /**
     * The currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The settl currency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
    }

    /**
     * The secsubtype
     *
     * @return the Secsubtype field
     */
    public SecsubtypeField secsubtype() {
        return secsubtype;
    }

    /**
     * The raw symbol
     *
     * @return the RawSymbol field
     */
    public RawSymbolField rawSymbol() {
        return rawSymbol;
    }

    /**
     * The group
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * The exchange
     *
     * @return the Exchange field
     */
    public ExchangeField exchange() {
        return exchange;
    }

    /**
     * The asset
     *
     * @return the Asset field
     */
    public AssetField asset() {
        return asset;
    }

    /**
     * The cfi
     *
     * @return the Cfi field
     */
    public CfiField cfi() {
        return cfi;
    }

    /**
     * The security type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * The unit of measure
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * The underlying
     *
     * @return the Underlying field
     */
    public UnderlyingField underlying() {
        return underlying;
    }

    /**
     * The strike price currency
     *
     * @return the StrikePriceCurrency field
     */
    public StrikePriceCurrencyField strikePriceCurrency() {
        return strikePriceCurrency;
    }

    /**
     * The leg raw symbol
     *
     * @return the LegRawSymbol field
     */
    public LegRawSymbolField legRawSymbol() {
        return legRawSymbol;
    }

    /**
     * The classification of the instrument
     *
     * @return the InstrumentClass field
     */
    public InstrumentClassField instrumentClass() {
        return instrumentClass;
    }

    /**
     * The matching algorithm used for the instrument, typically FIFO
     *
     * @return the MatchAlgorithm field
     */
    public MatchAlgorithmField matchAlgorithm() {
        return matchAlgorithm;
    }

    /**
     * The main fraction
     *
     * @return the MainFraction field
     */
    public MainFractionField mainFraction() {
        return mainFraction;
    }

    /**
     * The price display format
     *
     * @return the PriceDisplayFormat field
     */
    public PriceDisplayFormatField priceDisplayFormat() {
        return priceDisplayFormat;
    }

    /**
     * The sub fraction
     *
     * @return the SubFraction field
     */
    public SubFractionField subFraction() {
        return subFraction;
    }

    /**
     * The underlying product
     *
     * @return the UnderlyingProduct field
     */
    public UnderlyingProductField underlyingProduct() {
        return underlyingProduct;
    }

    /**
     * Indicates if the instrument definition has been added, modified, or deleted
     *
     * @return the SecurityUpdateAction field
     */
    public SecurityUpdateActionField securityUpdateAction() {
        return securityUpdateAction;
    }

    /**
     * The maturity month
     *
     * @return the MaturityMonth field
     */
    public MaturityMonthField maturityMonth() {
        return maturityMonth;
    }

    /**
     * The maturity day
     *
     * @return the MaturityDay field
     */
    public MaturityDayField maturityDay() {
        return maturityDay;
    }

    /**
     * The maturity week
     *
     * @return the MaturityWeek field
     */
    public MaturityWeekField maturityWeek() {
        return maturityWeek;
    }

    /**
     * Indicates if the instrument is user defined
     *
     * @return the UserDefinedInstrument field
     */
    public UserDefinedInstrumentField userDefinedInstrument() {
        return userDefinedInstrument;
    }

    /**
     * The contract multiplier unit
     *
     * @return the ContractMultiplierUnit field
     */
    public ContractMultiplierUnitField contractMultiplierUnit() {
        return contractMultiplierUnit;
    }

    /**
     * The flow schedule type
     *
     * @return the FlowScheduleType field
     */
    public FlowScheduleTypeField flowScheduleType() {
        return flowScheduleType;
    }

    /**
     * The tick rule
     *
     * @return the TickRule field
     */
    public TickRuleField tickRule() {
        return tickRule;
    }

    /**
     * The classification of the leg instrument
     *
     * @return the LegInstrumentClass field
     */
    public LegInstrumentClassField legInstrumentClass() {
        return legInstrumentClass;
    }

    /**
     * The side taken for the leg when purchasing the spread
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(tsRecv.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!tsRecv.parse(data, cursor)) {
            return false;
        }
        cursor += TsRecvField.BYTE_LENGTH;
        if (!minPriceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementField.BYTE_LENGTH;
        if (!displayFactor.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayFactorField.BYTE_LENGTH;
        if (!expiration.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationField.BYTE_LENGTH;
        if (!activation.parse(data, cursor)) {
            return false;
        }
        cursor += ActivationField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!maxPriceVariation.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceVariationField.BYTE_LENGTH;
        if (!unitOfMeasureQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQtyField.BYTE_LENGTH;
        if (!minPriceIncrementAmount.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementAmountField.BYTE_LENGTH;
        if (!priceRatio.parse(data, cursor)) {
            return false;
        }
        cursor += PriceRatioField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!rawInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += RawInstrumentIdField.BYTE_LENGTH;
        if (!legPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LegPriceField.BYTE_LENGTH;
        if (!legDelta.parse(data, cursor)) {
            return false;
        }
        cursor += LegDeltaField.BYTE_LENGTH;
        if (!instAttribValue.parse(data, cursor)) {
            return false;
        }
        cursor += InstAttribValueField.BYTE_LENGTH;
        if (!underlyingId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIdField.BYTE_LENGTH;
        if (!marketDepthImplied.parse(data, cursor)) {
            return false;
        }
        cursor += MarketDepthImpliedField.BYTE_LENGTH;
        if (!marketDepth.parse(data, cursor)) {
            return false;
        }
        cursor += MarketDepthField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!maxTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MaxTradeVolField.BYTE_LENGTH;
        if (!minLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += MinLotSizeField.BYTE_LENGTH;
        if (!minLotSizeBlock.parse(data, cursor)) {
            return false;
        }
        cursor += MinLotSizeBlockField.BYTE_LENGTH;
        if (!minLotSizeRoundLot.parse(data, cursor)) {
            return false;
        }
        cursor += MinLotSizeRoundLotField.BYTE_LENGTH;
        if (!minTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MinTradeVolField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!decayQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += DecayQuantityField.BYTE_LENGTH;
        if (!originalContractSize.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalContractSizeField.BYTE_LENGTH;
        if (!legInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += LegInstrumentIdField.BYTE_LENGTH;
        if (!legRatioPriceNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioPriceNumeratorField.BYTE_LENGTH;
        if (!legRatioPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioPriceDenominatorField.BYTE_LENGTH;
        if (!legRatioQtyNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQtyNumeratorField.BYTE_LENGTH;
        if (!legRatioQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQtyDenominatorField.BYTE_LENGTH;
        if (!legUnderlyingId.parse(data, cursor)) {
            return false;
        }
        cursor += LegUnderlyingIdField.BYTE_LENGTH;
        if (!applId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplIdField.BYTE_LENGTH;
        if (!maturityYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityYearField.BYTE_LENGTH;
        if (!decayStartDate.parse(data, cursor)) {
            return false;
        }
        cursor += DecayStartDateField.BYTE_LENGTH;
        if (!channel.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelField.BYTE_LENGTH;
        if (!legCount.parse(data, cursor)) {
            return false;
        }
        cursor += LegCountField.BYTE_LENGTH;
        if (!legIndex.parse(data, cursor)) {
            return false;
        }
        cursor += LegIndexField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!secsubtype.parse(data, cursor)) {
            return false;
        }
        cursor += SecsubtypeField.BYTE_LENGTH;
        if (!rawSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RawSymbolField.BYTE_LENGTH;
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!asset.parse(data, cursor)) {
            return false;
        }
        cursor += AssetField.BYTE_LENGTH;
        if (!cfi.parse(data, cursor)) {
            return false;
        }
        cursor += CfiField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!underlying.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingField.BYTE_LENGTH;
        if (!strikePriceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceCurrencyField.BYTE_LENGTH;
        if (!legRawSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += LegRawSymbolField.BYTE_LENGTH;
        if (!instrumentClass.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentClassField.BYTE_LENGTH;
        if (!matchAlgorithm.parse(data, cursor)) {
            return false;
        }
        cursor += MatchAlgorithmField.BYTE_LENGTH;
        if (!mainFraction.parse(data, cursor)) {
            return false;
        }
        cursor += MainFractionField.BYTE_LENGTH;
        if (!priceDisplayFormat.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisplayFormatField.BYTE_LENGTH;
        if (!subFraction.parse(data, cursor)) {
            return false;
        }
        cursor += SubFractionField.BYTE_LENGTH;
        if (!underlyingProduct.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingProductField.BYTE_LENGTH;
        if (!securityUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityUpdateActionField.BYTE_LENGTH;
        if (!maturityMonth.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthField.BYTE_LENGTH;
        if (!maturityDay.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDayField.BYTE_LENGTH;
        if (!maturityWeek.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityWeekField.BYTE_LENGTH;
        if (!userDefinedInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += UserDefinedInstrumentField.BYTE_LENGTH;
        if (!contractMultiplierUnit.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierUnitField.BYTE_LENGTH;
        if (!flowScheduleType.parse(data, cursor)) {
            return false;
        }
        cursor += FlowScheduleTypeField.BYTE_LENGTH;
        if (!tickRule.parse(data, cursor)) {
            return false;
        }
        cursor += TickRuleField.BYTE_LENGTH;
        if (!legInstrumentClass.parse(data, cursor)) {
            return false;
        }
        cursor += LegInstrumentClassField.BYTE_LENGTH;
        if (!legSide.parse(data, cursor)) {
            return false;
        }
        cursor += LegSideField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tsRecv.encode(data, cursor);
        cursor = minPriceIncrement.encode(data, cursor);
        cursor = displayFactor.encode(data, cursor);
        cursor = expiration.encode(data, cursor);
        cursor = activation.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = maxPriceVariation.encode(data, cursor);
        cursor = unitOfMeasureQty.encode(data, cursor);
        cursor = minPriceIncrementAmount.encode(data, cursor);
        cursor = priceRatio.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = rawInstrumentId.encode(data, cursor);
        cursor = legPrice.encode(data, cursor);
        cursor = legDelta.encode(data, cursor);
        cursor = instAttribValue.encode(data, cursor);
        cursor = underlyingId.encode(data, cursor);
        cursor = marketDepthImplied.encode(data, cursor);
        cursor = marketDepth.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = maxTradeVol.encode(data, cursor);
        cursor = minLotSize.encode(data, cursor);
        cursor = minLotSizeBlock.encode(data, cursor);
        cursor = minLotSizeRoundLot.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = decayQuantity.encode(data, cursor);
        cursor = originalContractSize.encode(data, cursor);
        cursor = legInstrumentId.encode(data, cursor);
        cursor = legRatioPriceNumerator.encode(data, cursor);
        cursor = legRatioPriceDenominator.encode(data, cursor);
        cursor = legRatioQtyNumerator.encode(data, cursor);
        cursor = legRatioQtyDenominator.encode(data, cursor);
        cursor = legUnderlyingId.encode(data, cursor);
        cursor = applId.encode(data, cursor);
        cursor = maturityYear.encode(data, cursor);
        cursor = decayStartDate.encode(data, cursor);
        cursor = channel.encode(data, cursor);
        cursor = legCount.encode(data, cursor);
        cursor = legIndex.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = secsubtype.encode(data, cursor);
        cursor = rawSymbol.encode(data, cursor);
        cursor = group.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = asset.encode(data, cursor);
        cursor = cfi.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = underlying.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = legRawSymbol.encode(data, cursor);
        cursor = instrumentClass.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = mainFraction.encode(data, cursor);
        cursor = priceDisplayFormat.encode(data, cursor);
        cursor = subFraction.encode(data, cursor);
        cursor = underlyingProduct.encode(data, cursor);
        cursor = securityUpdateAction.encode(data, cursor);
        cursor = maturityMonth.encode(data, cursor);
        cursor = maturityDay.encode(data, cursor);
        cursor = maturityWeek.encode(data, cursor);
        cursor = userDefinedInstrument.encode(data, cursor);
        cursor = contractMultiplierUnit.encode(data, cursor);
        cursor = flowScheduleType.encode(data, cursor);
        cursor = tickRule.encode(data, cursor);
        cursor = legInstrumentClass.encode(data, cursor);
        cursor = legSide.encode(data, cursor);
        if (buffer != null && buffer.length >= 504) {
            System.arraycopy(buffer, 487, data, cursor, 17); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 17, (byte) 0); // padding
        }
        cursor += 17;
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TsRecv" -> Optional.of(tsRecv);
            case "MinPriceIncrement" -> Optional.of(minPriceIncrement);
            case "DisplayFactor" -> Optional.of(displayFactor);
            case "Expiration" -> Optional.of(expiration);
            case "Activation" -> Optional.of(activation);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "MaxPriceVariation" -> Optional.of(maxPriceVariation);
            case "UnitOfMeasureQty" -> Optional.of(unitOfMeasureQty);
            case "MinPriceIncrementAmount" -> Optional.of(minPriceIncrementAmount);
            case "PriceRatio" -> Optional.of(priceRatio);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "RawInstrumentId" -> Optional.of(rawInstrumentId);
            case "LegPrice" -> Optional.of(legPrice);
            case "LegDelta" -> Optional.of(legDelta);
            case "InstAttribValue" -> Optional.of(instAttribValue);
            case "UnderlyingId" -> Optional.of(underlyingId);
            case "MarketDepthImplied" -> Optional.of(marketDepthImplied);
            case "MarketDepth" -> Optional.of(marketDepth);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MaxTradeVol" -> Optional.of(maxTradeVol);
            case "MinLotSize" -> Optional.of(minLotSize);
            case "MinLotSizeBlock" -> Optional.of(minLotSizeBlock);
            case "MinLotSizeRoundLot" -> Optional.of(minLotSizeRoundLot);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "DecayQuantity" -> Optional.of(decayQuantity);
            case "OriginalContractSize" -> Optional.of(originalContractSize);
            case "LegInstrumentId" -> Optional.of(legInstrumentId);
            case "LegRatioPriceNumerator" -> Optional.of(legRatioPriceNumerator);
            case "LegRatioPriceDenominator" -> Optional.of(legRatioPriceDenominator);
            case "LegRatioQtyNumerator" -> Optional.of(legRatioQtyNumerator);
            case "LegRatioQtyDenominator" -> Optional.of(legRatioQtyDenominator);
            case "LegUnderlyingId" -> Optional.of(legUnderlyingId);
            case "ApplId" -> Optional.of(applId);
            case "MaturityYear" -> Optional.of(maturityYear);
            case "DecayStartDate" -> Optional.of(decayStartDate);
            case "Channel" -> Optional.of(channel);
            case "LegCount" -> Optional.of(legCount);
            case "LegIndex" -> Optional.of(legIndex);
            case "Currency" -> Optional.of(currency);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "Secsubtype" -> Optional.of(secsubtype);
            case "RawSymbol" -> Optional.of(rawSymbol);
            case "Group" -> Optional.of(group);
            case "Exchange" -> Optional.of(exchange);
            case "Asset" -> Optional.of(asset);
            case "Cfi" -> Optional.of(cfi);
            case "SecurityType" -> Optional.of(securityType);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "Underlying" -> Optional.of(underlying);
            case "StrikePriceCurrency" -> Optional.of(strikePriceCurrency);
            case "LegRawSymbol" -> Optional.of(legRawSymbol);
            case "InstrumentClass" -> Optional.of(instrumentClass);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MainFraction" -> Optional.of(mainFraction);
            case "PriceDisplayFormat" -> Optional.of(priceDisplayFormat);
            case "SubFraction" -> Optional.of(subFraction);
            case "UnderlyingProduct" -> Optional.of(underlyingProduct);
            case "SecurityUpdateAction" -> Optional.of(securityUpdateAction);
            case "MaturityMonth" -> Optional.of(maturityMonth);
            case "MaturityDay" -> Optional.of(maturityDay);
            case "MaturityWeek" -> Optional.of(maturityWeek);
            case "UserDefinedInstrument" -> Optional.of(userDefinedInstrument);
            case "ContractMultiplierUnit" -> Optional.of(contractMultiplierUnit);
            case "FlowScheduleType" -> Optional.of(flowScheduleType);
            case "TickRule" -> Optional.of(tickRule);
            case "LegInstrumentClass" -> Optional.of(legInstrumentClass);
            case "LegSide" -> Optional.of(legSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDefMsg message)) {
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
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
        if (!(other instanceof InstrumentDefMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
