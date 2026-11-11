package omi.cme.globex.mdp3.sbe.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cme.globex.mdp3.sbe.v1_12.fields.ApplIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.AssetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CfiCodeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.DisplayFactorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FixRateLocalTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FixRateLocalTimeZoneField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FxBenchmarkRateFixField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FxCurrencySymbolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.HighLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.InstrumentGuidField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.InterveningDaysField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LastUpdateTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LowLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MarketSegmentIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchAlgorithmField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchEventIndicatorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxPriceDiscretionOffsetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxPriceVariationField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdSecurityTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinPriceIncrementExField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinQuoteLifeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PricePrecisionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PriceQuoteCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RateSourceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityExchangeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityGroupField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SettlCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SettlTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SettlementLocaleField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SymbolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TotNumReportsOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingProductField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnitOfMeasureField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnitOfMeasureQtyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UserDefinedInstrumentField;
import omi.cme.globex.mdp3.sbe.v1_12.structs.EventsGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.FeedTypesGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.FxLotTypeRulesGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.InstAttribGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.MaturityMonthYear;
import omi.cme.globex.mdp3.sbe.v1_12.structs.TradingSessionsGroups;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.Message;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * Represents the MdInstrumentDefinitionFx message from the Mdp3 protocol.
 *
 * <p>MDInstrumentDefinitionFX</p>
 */
public final class MdInstrumentDefinitionFx implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 324;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Md Instrument Definition Fx";

    /**
     * MatchEventIndicator bit set
     */
    private final MatchEventIndicatorField matchEventIndicator = new MatchEventIndicatorField();

    /**
     * Total number of instruments in the Replay loop. Used on Replay Feed only
     */
    private final TotNumReportsOptionalField totNumReportsOptional = new TotNumReportsOptionalField();

    /**
     * Last Security update action on Incremental feed, 'D' or 'M' is used when a mid-week deletion or modification (i.e. extension) occurs
     */
    private final SecurityUpdateActionField securityUpdateAction = new SecurityUpdateActionField();

    /**
     * UTC Date and time of last Security Definition add, update or delete on a given Market Data channel
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Identifies the current trading state of the instrument
     */
    private final MdSecurityTradingStatusField mdSecurityTradingStatus = new MdSecurityTradingStatusField();

    /**
     * The channel ID as defined in the XML Configuration file
     */
    private final ApplIdField applId = new ApplIdField();

    /**
     * Identifies the market segment, populated for all CME Globex instruments
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Product complex
     */
    private final UnderlyingProductField underlyingProduct = new UnderlyingProductField();

    /**
     * Exchange used to identify a security
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Security Group
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * Product Code within Security Group specified
     */
    private final AssetField asset = new AssetField();

    /**
     * Instrument Name or Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Security ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * ISO standard instrument categorization code
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Identifies currency used for price
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Identifies currency used for settlement, if different from trading currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * Local (counter) currency
     */
    private final PriceQuoteCurrencyField priceQuoteCurrency = new PriceQuoteCurrencyField();

    /**
     * Matching algorithm
     */
    private final MatchAlgorithmField matchAlgorithm = new MatchAlgorithmField();

    /**
     * The minimum trading volume for a security
     */
    private final MinTradeVolField minTradeVol = new MinTradeVolField();

    /**
     * The maximum trading volume for a security
     */
    private final MaxTradeVolField maxTradeVol = new MaxTradeVolField();

    /**
     * Minimum constant tick for the instrument, sent only if instrument is non-VTT (Variable Tick table) eligible
     */
    private final MinPriceIncrementExField minPriceIncrementEx = new MinPriceIncrementExField();

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     */
    private final DisplayFactorField displayFactor = new DisplayFactorField();

    /**
     * Specifies price decimal precision for EBS instrument
     */
    private final PricePrecisionField pricePrecision = new PricePrecisionField();

    /**
     * Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     */
    private final UnitOfMeasureQtyField unitOfMeasureQty = new UnitOfMeasureQtyField();

    /**
     * Upper price threshold for the instrument
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * Lower price threshold for the instrument
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * Differential value for price banding
     */
    private final MaxPriceVariationField maxPriceVariation = new MaxPriceVariationField();

    /**
     * User-defined instruments flag
     */
    private final UserDefinedInstrumentField userDefinedInstrument = new UserDefinedInstrumentField();

    /**
     * Long name of the instrument
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Base/Local. Denotes the currency pair in CCY1/CCY2 convention
     */
    private final FxCurrencySymbolField fxCurrencySymbol = new FxCurrencySymbolField();

    /**
     * For SPOTs will contain 0. For Fixed date NDFs will contain the value 'B'. For the standard NDFs tenors expressed using Dx, Mx, Wx, and Yx values, where 'x' does not denote business days, but calendar days
     */
    private final SettlTypeField settlType = new SettlTypeField();

    /**
     * For SPOT, number of business days between trade date and value (settlement) date. For NDF, number of business days between NDF valuation (fixing) and settlement
     */
    private final InterveningDaysField interveningDays = new InterveningDaysField();

    /**
     * Fixing Rate Description
     */
    private final FxBenchmarkRateFixField fxBenchmarkRateFix = new FxBenchmarkRateFixField();

    /**
     * Fixing Rate Source
     */
    private final RateSourceField rateSource = new RateSourceField();

    /**
     * Fixing Rate Local Time, denoted in HH:MM:SS format
     */
    private final FixRateLocalTimeField fixRateLocalTime = new FixRateLocalTimeField();

    /**
     * Fixing Rate Local Time Zone corresponding to Fixing Local Time.
     */
    private final FixRateLocalTimeZoneField fixRateLocalTimeZone = new FixRateLocalTimeZoneField();

    /**
     * Minimum Quote Life in number of microseconds
     */
    private final MinQuoteLifeField minQuoteLife = new MinQuoteLifeField();

    /**
     * Max allowed discretionary offset from Limit order price. When the value in this field = 0, discretionary price cannot be submitted for the instrument
     */
    private final MaxPriceDiscretionOffsetField maxPriceDiscretionOffset = new MaxPriceDiscretionOffsetField();

    /**
     * External unique instrument ID
     */
    private final InstrumentGuidField instrumentGuid = new InstrumentGuidField();

    /**
     * Settlement Locale. Optionally used to differentiate settlement location
     */
    private final SettlementLocaleField settlementLocale = new SettlementLocaleField();

    /**
     * MDInstrumentDefinitionFuture
     */
    private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear();

    /**
     * NoEvents Block
     */
    private final EventsGroups eventsGroups = new EventsGroups();

    /**
     * NoMDFeedTypes Block
     */
    private final FeedTypesGroups feedTypesGroups = new FeedTypesGroups();

    /**
     * NoInstAttrib Block
     */
    private final InstAttribGroups instAttribGroups = new InstAttribGroups();

    /**
     * NoLotTypeRules Block
     */
    private final FxLotTypeRulesGroups fxLotTypeRulesGroups = new FxLotTypeRulesGroups();

    /**
     * NoTradingSessions Block
     */
    private final TradingSessionsGroups tradingSessionsGroups = new TradingSessionsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(matchEventIndicator), List.<Field>of(totNumReportsOptional), List.<Field>of(securityUpdateAction), List.<Field>of(lastUpdateTime), List.<Field>of(mdSecurityTradingStatus), List.<Field>of(applId), List.<Field>of(marketSegmentId), List.<Field>of(underlyingProduct), List.<Field>of(securityExchange), List.<Field>of(securityGroup), List.<Field>of(asset), List.<Field>of(symbol), List.<Field>of(securityId), List.<Field>of(securityType), List.<Field>of(cfiCode), List.<Field>of(currency), List.<Field>of(settlCurrency), List.<Field>of(priceQuoteCurrency), List.<Field>of(matchAlgorithm), List.<Field>of(minTradeVol), List.<Field>of(maxTradeVol), List.<Field>of(minPriceIncrementEx), List.<Field>of(displayFactor), List.<Field>of(pricePrecision), List.<Field>of(unitOfMeasure), List.<Field>of(unitOfMeasureQty), List.<Field>of(highLimitPrice), List.<Field>of(lowLimitPrice), List.<Field>of(maxPriceVariation), List.<Field>of(userDefinedInstrument), List.<Field>of(financialInstrumentFullName), List.<Field>of(fxCurrencySymbol), List.<Field>of(settlType), List.<Field>of(interveningDays), List.<Field>of(fxBenchmarkRateFix), List.<Field>of(rateSource), List.<Field>of(fixRateLocalTime), List.<Field>of(fixRateLocalTimeZone), List.<Field>of(minQuoteLife), List.<Field>of(maxPriceDiscretionOffset), List.<Field>of(instrumentGuid), maturityMonthYear.fields(), List.<Field>of(settlementLocale)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * MatchEventIndicator bit set
     *
     * @return the MatchEventIndicator field
     */
    public MatchEventIndicatorField matchEventIndicator() {
        return matchEventIndicator;
    }

    /**
     * Total number of instruments in the Replay loop. Used on Replay Feed only
     *
     * @return the TotNumReportsOptional field
     */
    public TotNumReportsOptionalField totNumReportsOptional() {
        return totNumReportsOptional;
    }

    /**
     * Last Security update action on Incremental feed, 'D' or 'M' is used when a mid-week deletion or modification (i.e. extension) occurs
     *
     * @return the SecurityUpdateAction field
     */
    public SecurityUpdateActionField securityUpdateAction() {
        return securityUpdateAction;
    }

    /**
     * UTC Date and time of last Security Definition add, update or delete on a given Market Data channel
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Identifies the current trading state of the instrument
     *
     * @return the MdSecurityTradingStatus field
     */
    public MdSecurityTradingStatusField mdSecurityTradingStatus() {
        return mdSecurityTradingStatus;
    }

    /**
     * The channel ID as defined in the XML Configuration file
     *
     * @return the ApplId field
     */
    public ApplIdField applId() {
        return applId;
    }

    /**
     * Identifies the market segment, populated for all CME Globex instruments
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Product complex
     *
     * @return the UnderlyingProduct field
     */
    public UnderlyingProductField underlyingProduct() {
        return underlyingProduct;
    }

    /**
     * Exchange used to identify a security
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * Security Group
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * Product Code within Security Group specified
     *
     * @return the Asset field
     */
    public AssetField asset() {
        return asset;
    }

    /**
     * Instrument Name or Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Security ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Security Type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * ISO standard instrument categorization code
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Identifies currency used for price
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Identifies currency used for settlement, if different from trading currency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
    }

    /**
     * Local (counter) currency
     *
     * @return the PriceQuoteCurrency field
     */
    public PriceQuoteCurrencyField priceQuoteCurrency() {
        return priceQuoteCurrency;
    }

    /**
     * Matching algorithm
     *
     * @return the MatchAlgorithm field
     */
    public MatchAlgorithmField matchAlgorithm() {
        return matchAlgorithm;
    }

    /**
     * The minimum trading volume for a security
     *
     * @return the MinTradeVol field
     */
    public MinTradeVolField minTradeVol() {
        return minTradeVol;
    }

    /**
     * The maximum trading volume for a security
     *
     * @return the MaxTradeVol field
     */
    public MaxTradeVolField maxTradeVol() {
        return maxTradeVol;
    }

    /**
     * Minimum constant tick for the instrument, sent only if instrument is non-VTT (Variable Tick table) eligible
     *
     * @return the MinPriceIncrementEx field
     */
    public MinPriceIncrementExField minPriceIncrementEx() {
        return minPriceIncrementEx;
    }

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     *
     * @return the DisplayFactor field
     */
    public DisplayFactorField displayFactor() {
        return displayFactor;
    }

    /**
     * Specifies price decimal precision for EBS instrument
     *
     * @return the PricePrecision field
     */
    public PricePrecisionField pricePrecision() {
        return pricePrecision;
    }

    /**
     * Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     *
     * @return the UnitOfMeasureQty field
     */
    public UnitOfMeasureQtyField unitOfMeasureQty() {
        return unitOfMeasureQty;
    }

    /**
     * Upper price threshold for the instrument
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * Lower price threshold for the instrument
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * Differential value for price banding
     *
     * @return the MaxPriceVariation field
     */
    public MaxPriceVariationField maxPriceVariation() {
        return maxPriceVariation;
    }

    /**
     * User-defined instruments flag
     *
     * @return the UserDefinedInstrument field
     */
    public UserDefinedInstrumentField userDefinedInstrument() {
        return userDefinedInstrument;
    }

    /**
     * Long name of the instrument
     *
     * @return the FinancialInstrumentFullName field
     */
    public FinancialInstrumentFullNameField financialInstrumentFullName() {
        return financialInstrumentFullName;
    }

    /**
     * Base/Local. Denotes the currency pair in CCY1/CCY2 convention
     *
     * @return the FxCurrencySymbol field
     */
    public FxCurrencySymbolField fxCurrencySymbol() {
        return fxCurrencySymbol;
    }

    /**
     * For SPOTs will contain 0. For Fixed date NDFs will contain the value 'B'. For the standard NDFs tenors expressed using Dx, Mx, Wx, and Yx values, where 'x' does not denote business days, but calendar days
     *
     * @return the SettlType field
     */
    public SettlTypeField settlType() {
        return settlType;
    }

    /**
     * For SPOT, number of business days between trade date and value (settlement) date. For NDF, number of business days between NDF valuation (fixing) and settlement
     *
     * @return the InterveningDays field
     */
    public InterveningDaysField interveningDays() {
        return interveningDays;
    }

    /**
     * Fixing Rate Description
     *
     * @return the FxBenchmarkRateFix field
     */
    public FxBenchmarkRateFixField fxBenchmarkRateFix() {
        return fxBenchmarkRateFix;
    }

    /**
     * Fixing Rate Source
     *
     * @return the RateSource field
     */
    public RateSourceField rateSource() {
        return rateSource;
    }

    /**
     * Fixing Rate Local Time, denoted in HH:MM:SS format
     *
     * @return the FixRateLocalTime field
     */
    public FixRateLocalTimeField fixRateLocalTime() {
        return fixRateLocalTime;
    }

    /**
     * Fixing Rate Local Time Zone corresponding to Fixing Local Time.
     *
     * @return the FixRateLocalTimeZone field
     */
    public FixRateLocalTimeZoneField fixRateLocalTimeZone() {
        return fixRateLocalTimeZone;
    }

    /**
     * Minimum Quote Life in number of microseconds
     *
     * @return the MinQuoteLife field
     */
    public MinQuoteLifeField minQuoteLife() {
        return minQuoteLife;
    }

    /**
     * Max allowed discretionary offset from Limit order price. When the value in this field = 0, discretionary price cannot be submitted for the instrument
     *
     * @return the MaxPriceDiscretionOffset field
     */
    public MaxPriceDiscretionOffsetField maxPriceDiscretionOffset() {
        return maxPriceDiscretionOffset;
    }

    /**
     * External unique instrument ID
     *
     * @return the InstrumentGuid field
     */
    public InstrumentGuidField instrumentGuid() {
        return instrumentGuid;
    }

    /**
     * Settlement Locale. Optionally used to differentiate settlement location
     *
     * @return the SettlementLocale field
     */
    public SettlementLocaleField settlementLocale() {
        return settlementLocale;
    }

    /**
     * MDInstrumentDefinitionFuture
     *
     * @return the MaturityMonthYear record
     */
    public MaturityMonthYear maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * NoEvents Block
     *
     * @return the EventsGroups record
     */
    public EventsGroups eventsGroups() {
        return eventsGroups;
    }

    /**
     * NoMDFeedTypes Block
     *
     * @return the FeedTypesGroups record
     */
    public FeedTypesGroups feedTypesGroups() {
        return feedTypesGroups;
    }

    /**
     * NoInstAttrib Block
     *
     * @return the InstAttribGroups record
     */
    public InstAttribGroups instAttribGroups() {
        return instAttribGroups;
    }

    /**
     * NoLotTypeRules Block
     *
     * @return the FxLotTypeRulesGroups record
     */
    public FxLotTypeRulesGroups fxLotTypeRulesGroups() {
        return fxLotTypeRulesGroups;
    }

    /**
     * NoTradingSessions Block
     *
     * @return the TradingSessionsGroups record
     */
    public TradingSessionsGroups tradingSessionsGroups() {
        return tradingSessionsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + eventsGroups.byteLength() - EventsGroups.MINIMUM_BYTE_LENGTH + feedTypesGroups.byteLength() - FeedTypesGroups.MINIMUM_BYTE_LENGTH + instAttribGroups.byteLength() - InstAttribGroups.MINIMUM_BYTE_LENGTH + fxLotTypeRulesGroups.byteLength() - FxLotTypeRulesGroups.MINIMUM_BYTE_LENGTH + tradingSessionsGroups.byteLength() - TradingSessionsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(lastUpdateTime.value());
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
        if (!matchEventIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MatchEventIndicatorField.BYTE_LENGTH;
        if (!totNumReportsOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumReportsOptionalField.BYTE_LENGTH;
        if (!securityUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityUpdateActionField.BYTE_LENGTH;
        if (!lastUpdateTime.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimeField.BYTE_LENGTH;
        if (!mdSecurityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += MdSecurityTradingStatusField.BYTE_LENGTH;
        if (!applId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!underlyingProduct.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingProductField.BYTE_LENGTH;
        if (!securityExchange.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityExchangeField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!asset.parse(data, cursor)) {
            return false;
        }
        cursor += AssetField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!priceQuoteCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceQuoteCurrencyField.BYTE_LENGTH;
        if (!matchAlgorithm.parse(data, cursor)) {
            return false;
        }
        cursor += MatchAlgorithmField.BYTE_LENGTH;
        if (!minTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MinTradeVolField.BYTE_LENGTH;
        if (!maxTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MaxTradeVolField.BYTE_LENGTH;
        if (!minPriceIncrementEx.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementExField.BYTE_LENGTH;
        if (!displayFactor.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayFactorField.BYTE_LENGTH;
        if (!pricePrecision.parse(data, cursor)) {
            return false;
        }
        cursor += PricePrecisionField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!unitOfMeasureQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQtyField.BYTE_LENGTH;
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
        if (!userDefinedInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += UserDefinedInstrumentField.BYTE_LENGTH;
        if (!financialInstrumentFullName.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        if (!fxCurrencySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FxCurrencySymbolField.BYTE_LENGTH;
        if (!settlType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlTypeField.BYTE_LENGTH;
        if (!interveningDays.parse(data, cursor)) {
            return false;
        }
        cursor += InterveningDaysField.BYTE_LENGTH;
        if (!fxBenchmarkRateFix.parse(data, cursor)) {
            return false;
        }
        cursor += FxBenchmarkRateFixField.BYTE_LENGTH;
        if (!rateSource.parse(data, cursor)) {
            return false;
        }
        cursor += RateSourceField.BYTE_LENGTH;
        if (!fixRateLocalTime.parse(data, cursor)) {
            return false;
        }
        cursor += FixRateLocalTimeField.BYTE_LENGTH;
        if (!fixRateLocalTimeZone.parse(data, cursor)) {
            return false;
        }
        cursor += FixRateLocalTimeZoneField.BYTE_LENGTH;
        if (!minQuoteLife.parse(data, cursor)) {
            return false;
        }
        cursor += MinQuoteLifeField.BYTE_LENGTH;
        if (!maxPriceDiscretionOffset.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceDiscretionOffsetField.BYTE_LENGTH;
        if (!instrumentGuid.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentGuidField.BYTE_LENGTH;
        if (!maturityMonthYear.parseFrom(data, cursor, end - 23)) {
            return false;
        }
        cursor += maturityMonthYear.byteLength();
        if (!settlementLocale.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementLocaleField.BYTE_LENGTH;
        if (!eventsGroups.parseFrom(data, cursor, end - 12)) {
            return false;
        }
        cursor += eventsGroups.byteLength();
        if (end - cursor < 12) {
            return false;
        }
        if (!feedTypesGroups.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += feedTypesGroups.byteLength();
        if (end - cursor < 9) {
            return false;
        }
        if (!instAttribGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += instAttribGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!fxLotTypeRulesGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += fxLotTypeRulesGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!tradingSessionsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += tradingSessionsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = matchEventIndicator.encode(data, cursor);
        cursor = totNumReportsOptional.encode(data, cursor);
        cursor = securityUpdateAction.encode(data, cursor);
        cursor = lastUpdateTime.encode(data, cursor);
        cursor = mdSecurityTradingStatus.encode(data, cursor);
        cursor = applId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = underlyingProduct.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = asset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = priceQuoteCurrency.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = maxTradeVol.encode(data, cursor);
        cursor = minPriceIncrementEx.encode(data, cursor);
        cursor = displayFactor.encode(data, cursor);
        cursor = pricePrecision.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQty.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = maxPriceVariation.encode(data, cursor);
        cursor = userDefinedInstrument.encode(data, cursor);
        cursor = financialInstrumentFullName.encode(data, cursor);
        cursor = fxCurrencySymbol.encode(data, cursor);
        cursor = settlType.encode(data, cursor);
        cursor = interveningDays.encode(data, cursor);
        cursor = fxBenchmarkRateFix.encode(data, cursor);
        cursor = rateSource.encode(data, cursor);
        cursor = fixRateLocalTime.encode(data, cursor);
        cursor = fixRateLocalTimeZone.encode(data, cursor);
        cursor = minQuoteLife.encode(data, cursor);
        cursor = maxPriceDiscretionOffset.encode(data, cursor);
        cursor = instrumentGuid.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = settlementLocale.encode(data, cursor);
        cursor = eventsGroups.encode(data, cursor);
        cursor = feedTypesGroups.encode(data, cursor);
        cursor = instAttribGroups.encode(data, cursor);
        cursor = fxLotTypeRulesGroups.encode(data, cursor);
        cursor = tradingSessionsGroups.encode(data, cursor);
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
        maturityMonthYear.clear();
        eventsGroups.clear();
        feedTypesGroups.clear();
        instAttribGroups.clear();
        fxLotTypeRulesGroups.clear();
        tradingSessionsGroups.clear();
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!eventsGroups.isRecognized()) {
            return false;
        }
        if (!feedTypesGroups.isRecognized()) {
            return false;
        }
        if (!instAttribGroups.isRecognized()) {
            return false;
        }
        if (!fxLotTypeRulesGroups.isRecognized()) {
            return false;
        }
        return tradingSessionsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!eventsGroups.isValid()) {
            return false;
        }
        if (!feedTypesGroups.isValid()) {
            return false;
        }
        if (!instAttribGroups.isValid()) {
            return false;
        }
        if (!fxLotTypeRulesGroups.isValid()) {
            return false;
        }
        if (!tradingSessionsGroups.isValid()) {
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
        if (!matchEventIndicator.isDecoded()) {
            return Optional.of(matchEventIndicator);
        }
        if (!totNumReportsOptional.isDecoded()) {
            return Optional.of(totNumReportsOptional);
        }
        if (!securityUpdateAction.isDecoded()) {
            return Optional.of(securityUpdateAction);
        }
        if (!lastUpdateTime.isDecoded()) {
            return Optional.of(lastUpdateTime);
        }
        if (!mdSecurityTradingStatus.isDecoded()) {
            return Optional.of(mdSecurityTradingStatus);
        }
        if (!applId.isDecoded()) {
            return Optional.of(applId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!underlyingProduct.isDecoded()) {
            return Optional.of(underlyingProduct);
        }
        if (!securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
        }
        if (!securityGroup.isDecoded()) {
            return Optional.of(securityGroup);
        }
        if (!asset.isDecoded()) {
            return Optional.of(asset);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!securityType.isDecoded()) {
            return Optional.of(securityType);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!settlCurrency.isDecoded()) {
            return Optional.of(settlCurrency);
        }
        if (!priceQuoteCurrency.isDecoded()) {
            return Optional.of(priceQuoteCurrency);
        }
        if (!matchAlgorithm.isDecoded()) {
            return Optional.of(matchAlgorithm);
        }
        if (!minTradeVol.isDecoded()) {
            return Optional.of(minTradeVol);
        }
        if (!maxTradeVol.isDecoded()) {
            return Optional.of(maxTradeVol);
        }
        if (!minPriceIncrementEx.isDecoded()) {
            return Optional.of(minPriceIncrementEx);
        }
        if (!displayFactor.isDecoded()) {
            return Optional.of(displayFactor);
        }
        if (!pricePrecision.isDecoded()) {
            return Optional.of(pricePrecision);
        }
        if (!unitOfMeasure.isDecoded()) {
            return Optional.of(unitOfMeasure);
        }
        if (!unitOfMeasureQty.isDecoded()) {
            return Optional.of(unitOfMeasureQty);
        }
        if (!highLimitPrice.isDecoded()) {
            return Optional.of(highLimitPrice);
        }
        if (!lowLimitPrice.isDecoded()) {
            return Optional.of(lowLimitPrice);
        }
        if (!maxPriceVariation.isDecoded()) {
            return Optional.of(maxPriceVariation);
        }
        if (!userDefinedInstrument.isDecoded()) {
            return Optional.of(userDefinedInstrument);
        }
        if (!financialInstrumentFullName.isDecoded()) {
            return Optional.of(financialInstrumentFullName);
        }
        if (!fxCurrencySymbol.isDecoded()) {
            return Optional.of(fxCurrencySymbol);
        }
        if (!settlType.isDecoded()) {
            return Optional.of(settlType);
        }
        if (!interveningDays.isDecoded()) {
            return Optional.of(interveningDays);
        }
        if (!fxBenchmarkRateFix.isDecoded()) {
            return Optional.of(fxBenchmarkRateFix);
        }
        if (!rateSource.isDecoded()) {
            return Optional.of(rateSource);
        }
        if (!fixRateLocalTime.isDecoded()) {
            return Optional.of(fixRateLocalTime);
        }
        if (!fixRateLocalTimeZone.isDecoded()) {
            return Optional.of(fixRateLocalTimeZone);
        }
        if (!minQuoteLife.isDecoded()) {
            return Optional.of(minQuoteLife);
        }
        if (!maxPriceDiscretionOffset.isDecoded()) {
            return Optional.of(maxPriceDiscretionOffset);
        }
        if (!instrumentGuid.isDecoded()) {
            return Optional.of(instrumentGuid);
        }
        if (!maturityMonthYear.isDecoded()) {
            return maturityMonthYear.failedAt();
        }
        if (!settlementLocale.isDecoded()) {
            return Optional.of(settlementLocale);
        }
        if (!eventsGroups.isDecoded()) {
            return eventsGroups.failedAt();
        }
        if (!feedTypesGroups.isDecoded()) {
            return feedTypesGroups.failedAt();
        }
        if (!instAttribGroups.isDecoded()) {
            return instAttribGroups.failedAt();
        }
        if (!fxLotTypeRulesGroups.isDecoded()) {
            return fxLotTypeRulesGroups.failedAt();
        }
        if (!tradingSessionsGroups.isDecoded()) {
            return tradingSessionsGroups.failedAt();
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
            case "MatchEventIndicator" -> Optional.of(matchEventIndicator);
            case "TotNumReportsOptional" -> Optional.of(totNumReportsOptional);
            case "SecurityUpdateAction" -> Optional.of(securityUpdateAction);
            case "LastUpdateTime" -> Optional.of(lastUpdateTime);
            case "MdSecurityTradingStatus" -> Optional.of(mdSecurityTradingStatus);
            case "ApplId" -> Optional.of(applId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "UnderlyingProduct" -> Optional.of(underlyingProduct);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "Asset" -> Optional.of(asset);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityType" -> Optional.of(securityType);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Currency" -> Optional.of(currency);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "PriceQuoteCurrency" -> Optional.of(priceQuoteCurrency);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "MaxTradeVol" -> Optional.of(maxTradeVol);
            case "MinPriceIncrementEx" -> Optional.of(minPriceIncrementEx);
            case "DisplayFactor" -> Optional.of(displayFactor);
            case "PricePrecision" -> Optional.of(pricePrecision);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQty" -> Optional.of(unitOfMeasureQty);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "MaxPriceVariation" -> Optional.of(maxPriceVariation);
            case "UserDefinedInstrument" -> Optional.of(userDefinedInstrument);
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "FxCurrencySymbol" -> Optional.of(fxCurrencySymbol);
            case "SettlType" -> Optional.of(settlType);
            case "InterveningDays" -> Optional.of(interveningDays);
            case "FxBenchmarkRateFix" -> Optional.of(fxBenchmarkRateFix);
            case "RateSource" -> Optional.of(rateSource);
            case "FixRateLocalTime" -> Optional.of(fixRateLocalTime);
            case "FixRateLocalTimeZone" -> Optional.of(fixRateLocalTimeZone);
            case "MinQuoteLife" -> Optional.of(minQuoteLife);
            case "MaxPriceDiscretionOffset" -> Optional.of(maxPriceDiscretionOffset);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            case "SettlementLocale" -> Optional.of(settlementLocale);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MdInstrumentDefinitionFx message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(eventsGroups.diffFields(message.eventsGroups));
        changed.addAll(feedTypesGroups.diffFields(message.feedTypesGroups));
        changed.addAll(instAttribGroups.diffFields(message.instAttribGroups));
        changed.addAll(fxLotTypeRulesGroups.diffFields(message.fxLotTypeRulesGroups));
        changed.addAll(tradingSessionsGroups.diffFields(message.tradingSessionsGroups));
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            eventsGroups.toFormattedString(builder, options);
            builder.append(", ");
            feedTypesGroups.toFormattedString(builder, options);
            builder.append(", ");
            instAttribGroups.toFormattedString(builder, options);
            builder.append(", ");
            fxLotTypeRulesGroups.toFormattedString(builder, options);
            builder.append(", ");
            tradingSessionsGroups.toFormattedString(builder, options);
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
        eventsGroups.toFormattedString(builder, nested);
        feedTypesGroups.toFormattedString(builder, nested);
        instAttribGroups.toFormattedString(builder, nested);
        fxLotTypeRulesGroups.toFormattedString(builder, nested);
        tradingSessionsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MdInstrumentDefinitionFx message)) {
            return false;
        }
        return fields.equals(message.fields) && eventsGroups.equals(message.eventsGroups) && feedTypesGroups.equals(message.feedTypesGroups) && instAttribGroups.equals(message.instAttribGroups) && fxLotTypeRulesGroups.equals(message.fxLotTypeRulesGroups) && tradingSessionsGroups.equals(message.tradingSessionsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, eventsGroups, feedTypesGroups, instAttribGroups, fxLotTypeRulesGroups, tradingSessionsGroups);
    }
}
