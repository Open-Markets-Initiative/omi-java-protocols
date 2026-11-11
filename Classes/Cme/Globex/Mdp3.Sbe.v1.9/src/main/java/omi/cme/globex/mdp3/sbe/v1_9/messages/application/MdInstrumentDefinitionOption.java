package omi.cme.globex.mdp3.sbe.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cme.globex.mdp3.sbe.v1_9.fields.ApplIdField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.AssetField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.CfiCodeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.ClearedVolumeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.CurrencyField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.DisplayFactorExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.HighLimitPriceExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.LastUpdateTimeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.LowLimitPriceExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MainFractionField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MarketSegmentIdField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MatchAlgorithmField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MatchEventIndicatorField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MaxTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MdSecurityTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MinCabPriceExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MinPriceIncrementAmountExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MinPriceIncrementOptionalExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.MinTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.OpenInterestQtyField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.PriceDisplayFormatField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.PutOrCallField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityExchangeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityGroupField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityTypeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SettlCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SettlPriceTypeField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.StrikeCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.StrikePriceExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SubFractionField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SymbolField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TickRuleField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TotNumReportsOptionalField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TradingReferenceDateField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TradingReferencePriceExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.UnderlyingProductField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.UnitOfMeasureField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.UnitOfMeasureQtyExField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.UserDefinedInstrumentField;
import omi.cme.globex.mdp3.sbe.v1_9.structs.EventsGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.FeedTypesGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.InstAttribGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.LotTypeRulesGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.MaturityMonthYear;
import omi.cme.globex.mdp3.sbe.v1_9.structs.OptionRelatedInstrumentsGroups;
import omi.cme.globex.mdp3.sbe.v1_9.structs.OptionUnderlyingsGroups;
import omi.cme.globex.mdp3.sbe.v1_9.types.Field;
import omi.cme.globex.mdp3.sbe.v1_9.types.Message;
import omi.cme.globex.mdp3.sbe.v1_9.types.PrintOptions;

/**
 * Represents the MdInstrumentDefinitionOption message from the Mdp3 protocol.
 *
 * <p>MDInstrumentDefinitionOption</p>
 */
public final class MdInstrumentDefinitionOption implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 231;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Md Instrument Definition Option";

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
     * Timestamp of when the instrument was last added, modified or deleted
     */
    private final LastUpdateTimeField lastUpdateTime = new LastUpdateTimeField();

    /**
     * Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only
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
     * The underlying asset code also known as Product Code
     */
    private final AssetField asset = new AssetField();

    /**
     * Instrument Name or Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Unique instrument ID
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
     * Indicates whether an option instrument is a put or call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Identifies currency used for price
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Strike Price for an option instrument
     */
    private final StrikePriceExField strikePriceEx = new StrikePriceExField();

    /**
     * Currency in which the StrikePrice is denominated
     */
    private final StrikeCurrencyField strikeCurrency = new StrikeCurrencyField();

    /**
     * Identifies currency used for settlement, if different from trading currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * Defines cabinet price for outright options products
     */
    private final MinCabPriceExField minCabPriceEx = new MinCabPriceExField();

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
     * Minimum constant tick for the instrument
     */
    private final MinPriceIncrementOptionalExField minPriceIncrementOptionalEx = new MinPriceIncrementOptionalExField();

    /**
     * Monetary value equivalent to the minimum price fluctuation
     */
    private final MinPriceIncrementAmountExField minPriceIncrementAmountEx = new MinPriceIncrementAmountExField();

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     */
    private final DisplayFactorExField displayFactorEx = new DisplayFactorExField();

    /**
     * Tick Rule
     */
    private final TickRuleField tickRule = new TickRuleField();

    /**
     * Price Denominator of Main Fraction
     */
    private final MainFractionField mainFraction = new MainFractionField();

    /**
     * Price Denominator of Sub Fraction
     */
    private final SubFractionField subFraction = new SubFractionField();

    /**
     * Number of decimals in fractional display price
     */
    private final PriceDisplayFormatField priceDisplayFormat = new PriceDisplayFormatField();

    /**
     * Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     */
    private final UnitOfMeasureQtyExField unitOfMeasureQtyEx = new UnitOfMeasureQtyExField();

    /**
     * Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     */
    private final TradingReferencePriceExField tradingReferencePriceEx = new TradingReferencePriceExField();

    /**
     * SettlPriceType bit set
     */
    private final SettlPriceTypeField settlPriceType = new SettlPriceTypeField();

    /**
     * The total cleared volume of instrument traded during the prior trading session.
     */
    private final ClearedVolumeField clearedVolume = new ClearedVolumeField();

    /**
     * The total open interest for the market at the close of the prior trading session.
     */
    private final OpenInterestQtyField openInterestQty = new OpenInterestQtyField();

    /**
     * Lower price threshold for the instrument
     */
    private final LowLimitPriceExField lowLimitPriceEx = new LowLimitPriceExField();

    /**
     * Upper price threshold for the instrument
     */
    private final HighLimitPriceExField highLimitPriceEx = new HighLimitPriceExField();

    /**
     * User-defined instruments flag
     */
    private final UserDefinedInstrumentField userDefinedInstrument = new UserDefinedInstrumentField();

    /**
     * Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice
     */
    private final TradingReferenceDateField tradingReferenceDate = new TradingReferenceDateField();

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
    private final LotTypeRulesGroups lotTypeRulesGroups = new LotTypeRulesGroups();

    /**
     * NoUnderlyings Block
     */
    private final OptionUnderlyingsGroups optionUnderlyingsGroups = new OptionUnderlyingsGroups();

    /**
     * NoRelatedInstruments Block
     */
    private final OptionRelatedInstrumentsGroups optionRelatedInstrumentsGroups = new OptionRelatedInstrumentsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(matchEventIndicator), List.<Field>of(totNumReportsOptional), List.<Field>of(securityUpdateAction), List.<Field>of(lastUpdateTime), List.<Field>of(mdSecurityTradingStatus), List.<Field>of(applId), List.<Field>of(marketSegmentId), List.<Field>of(underlyingProduct), List.<Field>of(securityExchange), List.<Field>of(securityGroup), List.<Field>of(asset), List.<Field>of(symbol), List.<Field>of(securityId), List.<Field>of(securityType), List.<Field>of(cfiCode), List.<Field>of(putOrCall), maturityMonthYear.fields(), List.<Field>of(currency), List.<Field>of(strikePriceEx), List.<Field>of(strikeCurrency), List.<Field>of(settlCurrency), List.<Field>of(minCabPriceEx), List.<Field>of(matchAlgorithm), List.<Field>of(minTradeVol), List.<Field>of(maxTradeVol), List.<Field>of(minPriceIncrementOptionalEx), List.<Field>of(minPriceIncrementAmountEx), List.<Field>of(displayFactorEx), List.<Field>of(tickRule), List.<Field>of(mainFraction), List.<Field>of(subFraction), List.<Field>of(priceDisplayFormat), List.<Field>of(unitOfMeasure), List.<Field>of(unitOfMeasureQtyEx), List.<Field>of(tradingReferencePriceEx), List.<Field>of(settlPriceType), List.<Field>of(clearedVolume), List.<Field>of(openInterestQty), List.<Field>of(lowLimitPriceEx), List.<Field>of(highLimitPriceEx), List.<Field>of(userDefinedInstrument), List.<Field>of(tradingReferenceDate)).flatMap(List::stream).toList();

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
     * Timestamp of when the instrument was last added, modified or deleted
     *
     * @return the LastUpdateTime field
     */
    public LastUpdateTimeField lastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only
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
     * The underlying asset code also known as Product Code
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
     * Unique instrument ID
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
     * Indicates whether an option instrument is a put or call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
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
     * Strike Price for an option instrument
     *
     * @return the StrikePriceEx field
     */
    public StrikePriceExField strikePriceEx() {
        return strikePriceEx;
    }

    /**
     * Currency in which the StrikePrice is denominated
     *
     * @return the StrikeCurrency field
     */
    public StrikeCurrencyField strikeCurrency() {
        return strikeCurrency;
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
     * Defines cabinet price for outright options products
     *
     * @return the MinCabPriceEx field
     */
    public MinCabPriceExField minCabPriceEx() {
        return minCabPriceEx;
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
     * Minimum constant tick for the instrument
     *
     * @return the MinPriceIncrementOptionalEx field
     */
    public MinPriceIncrementOptionalExField minPriceIncrementOptionalEx() {
        return minPriceIncrementOptionalEx;
    }

    /**
     * Monetary value equivalent to the minimum price fluctuation
     *
     * @return the MinPriceIncrementAmountEx field
     */
    public MinPriceIncrementAmountExField minPriceIncrementAmountEx() {
        return minPriceIncrementAmountEx;
    }

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     *
     * @return the DisplayFactorEx field
     */
    public DisplayFactorExField displayFactorEx() {
        return displayFactorEx;
    }

    /**
     * Tick Rule
     *
     * @return the TickRule field
     */
    public TickRuleField tickRule() {
        return tickRule;
    }

    /**
     * Price Denominator of Main Fraction
     *
     * @return the MainFraction field
     */
    public MainFractionField mainFraction() {
        return mainFraction;
    }

    /**
     * Price Denominator of Sub Fraction
     *
     * @return the SubFraction field
     */
    public SubFractionField subFraction() {
        return subFraction;
    }

    /**
     * Number of decimals in fractional display price
     *
     * @return the PriceDisplayFormat field
     */
    public PriceDisplayFormatField priceDisplayFormat() {
        return priceDisplayFormat;
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
     * @return the UnitOfMeasureQtyEx field
     */
    public UnitOfMeasureQtyExField unitOfMeasureQtyEx() {
        return unitOfMeasureQtyEx;
    }

    /**
     * Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     *
     * @return the TradingReferencePriceEx field
     */
    public TradingReferencePriceExField tradingReferencePriceEx() {
        return tradingReferencePriceEx;
    }

    /**
     * SettlPriceType bit set
     *
     * @return the SettlPriceType field
     */
    public SettlPriceTypeField settlPriceType() {
        return settlPriceType;
    }

    /**
     * The total cleared volume of instrument traded during the prior trading session.
     *
     * @return the ClearedVolume field
     */
    public ClearedVolumeField clearedVolume() {
        return clearedVolume;
    }

    /**
     * The total open interest for the market at the close of the prior trading session.
     *
     * @return the OpenInterestQty field
     */
    public OpenInterestQtyField openInterestQty() {
        return openInterestQty;
    }

    /**
     * Lower price threshold for the instrument
     *
     * @return the LowLimitPriceEx field
     */
    public LowLimitPriceExField lowLimitPriceEx() {
        return lowLimitPriceEx;
    }

    /**
     * Upper price threshold for the instrument
     *
     * @return the HighLimitPriceEx field
     */
    public HighLimitPriceExField highLimitPriceEx() {
        return highLimitPriceEx;
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
     * Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice
     *
     * @return the TradingReferenceDate field
     */
    public TradingReferenceDateField tradingReferenceDate() {
        return tradingReferenceDate;
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
     * @return the LotTypeRulesGroups record
     */
    public LotTypeRulesGroups lotTypeRulesGroups() {
        return lotTypeRulesGroups;
    }

    /**
     * NoUnderlyings Block
     *
     * @return the OptionUnderlyingsGroups record
     */
    public OptionUnderlyingsGroups optionUnderlyingsGroups() {
        return optionUnderlyingsGroups;
    }

    /**
     * NoRelatedInstruments Block
     *
     * @return the OptionRelatedInstrumentsGroups record
     */
    public OptionRelatedInstrumentsGroups optionRelatedInstrumentsGroups() {
        return optionRelatedInstrumentsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + eventsGroups.byteLength() - EventsGroups.MINIMUM_BYTE_LENGTH + feedTypesGroups.byteLength() - FeedTypesGroups.MINIMUM_BYTE_LENGTH + instAttribGroups.byteLength() - InstAttribGroups.MINIMUM_BYTE_LENGTH + lotTypeRulesGroups.byteLength() - LotTypeRulesGroups.MINIMUM_BYTE_LENGTH + optionUnderlyingsGroups.byteLength() - OptionUnderlyingsGroups.MINIMUM_BYTE_LENGTH + optionRelatedInstrumentsGroups.byteLength() - OptionRelatedInstrumentsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!maturityMonthYear.parseFrom(data, cursor, end - 154)) {
            return false;
        }
        cursor += maturityMonthYear.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!strikePriceEx.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceExField.BYTE_LENGTH;
        if (!strikeCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeCurrencyField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!minCabPriceEx.parse(data, cursor)) {
            return false;
        }
        cursor += MinCabPriceExField.BYTE_LENGTH;
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
        if (!minPriceIncrementOptionalEx.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementOptionalExField.BYTE_LENGTH;
        if (!minPriceIncrementAmountEx.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementAmountExField.BYTE_LENGTH;
        if (!displayFactorEx.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayFactorExField.BYTE_LENGTH;
        if (!tickRule.parse(data, cursor)) {
            return false;
        }
        cursor += TickRuleField.BYTE_LENGTH;
        if (!mainFraction.parse(data, cursor)) {
            return false;
        }
        cursor += MainFractionField.BYTE_LENGTH;
        if (!subFraction.parse(data, cursor)) {
            return false;
        }
        cursor += SubFractionField.BYTE_LENGTH;
        if (!priceDisplayFormat.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisplayFormatField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!unitOfMeasureQtyEx.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQtyExField.BYTE_LENGTH;
        if (!tradingReferencePriceEx.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferencePriceExField.BYTE_LENGTH;
        if (!settlPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlPriceTypeField.BYTE_LENGTH;
        if (!clearedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ClearedVolumeField.BYTE_LENGTH;
        if (!openInterestQty.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestQtyField.BYTE_LENGTH;
        if (!lowLimitPriceEx.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceExField.BYTE_LENGTH;
        if (!highLimitPriceEx.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceExField.BYTE_LENGTH;
        if (!userDefinedInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += UserDefinedInstrumentField.BYTE_LENGTH;
        if (!tradingReferenceDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferenceDateField.BYTE_LENGTH;
        if (!eventsGroups.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += eventsGroups.byteLength();
        if (end - cursor < 15) {
            return false;
        }
        if (!feedTypesGroups.parseFrom(data, cursor, end - 12)) {
            return false;
        }
        cursor += feedTypesGroups.byteLength();
        if (end - cursor < 12) {
            return false;
        }
        if (!instAttribGroups.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += instAttribGroups.byteLength();
        if (end - cursor < 9) {
            return false;
        }
        if (!lotTypeRulesGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += lotTypeRulesGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!optionUnderlyingsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += optionUnderlyingsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!optionRelatedInstrumentsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += optionRelatedInstrumentsGroups.byteLength();

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
        cursor = putOrCall.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = strikePriceEx.encode(data, cursor);
        cursor = strikeCurrency.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = minCabPriceEx.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = maxTradeVol.encode(data, cursor);
        cursor = minPriceIncrementOptionalEx.encode(data, cursor);
        cursor = minPriceIncrementAmountEx.encode(data, cursor);
        cursor = displayFactorEx.encode(data, cursor);
        cursor = tickRule.encode(data, cursor);
        cursor = mainFraction.encode(data, cursor);
        cursor = subFraction.encode(data, cursor);
        cursor = priceDisplayFormat.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQtyEx.encode(data, cursor);
        cursor = tradingReferencePriceEx.encode(data, cursor);
        cursor = settlPriceType.encode(data, cursor);
        cursor = clearedVolume.encode(data, cursor);
        cursor = openInterestQty.encode(data, cursor);
        cursor = lowLimitPriceEx.encode(data, cursor);
        cursor = highLimitPriceEx.encode(data, cursor);
        cursor = userDefinedInstrument.encode(data, cursor);
        cursor = tradingReferenceDate.encode(data, cursor);
        cursor = eventsGroups.encode(data, cursor);
        cursor = feedTypesGroups.encode(data, cursor);
        cursor = instAttribGroups.encode(data, cursor);
        cursor = lotTypeRulesGroups.encode(data, cursor);
        cursor = optionUnderlyingsGroups.encode(data, cursor);
        cursor = optionRelatedInstrumentsGroups.encode(data, cursor);
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
        lotTypeRulesGroups.clear();
        optionUnderlyingsGroups.clear();
        optionRelatedInstrumentsGroups.clear();
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
        if (!lotTypeRulesGroups.isRecognized()) {
            return false;
        }
        if (!optionUnderlyingsGroups.isRecognized()) {
            return false;
        }
        return optionRelatedInstrumentsGroups.isRecognized();
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
        if (!lotTypeRulesGroups.isValid()) {
            return false;
        }
        if (!optionUnderlyingsGroups.isValid()) {
            return false;
        }
        if (!optionRelatedInstrumentsGroups.isValid()) {
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
        if (!putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (!maturityMonthYear.isDecoded()) {
            return maturityMonthYear.failedAt();
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!strikePriceEx.isDecoded()) {
            return Optional.of(strikePriceEx);
        }
        if (!strikeCurrency.isDecoded()) {
            return Optional.of(strikeCurrency);
        }
        if (!settlCurrency.isDecoded()) {
            return Optional.of(settlCurrency);
        }
        if (!minCabPriceEx.isDecoded()) {
            return Optional.of(minCabPriceEx);
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
        if (!minPriceIncrementOptionalEx.isDecoded()) {
            return Optional.of(minPriceIncrementOptionalEx);
        }
        if (!minPriceIncrementAmountEx.isDecoded()) {
            return Optional.of(minPriceIncrementAmountEx);
        }
        if (!displayFactorEx.isDecoded()) {
            return Optional.of(displayFactorEx);
        }
        if (!tickRule.isDecoded()) {
            return Optional.of(tickRule);
        }
        if (!mainFraction.isDecoded()) {
            return Optional.of(mainFraction);
        }
        if (!subFraction.isDecoded()) {
            return Optional.of(subFraction);
        }
        if (!priceDisplayFormat.isDecoded()) {
            return Optional.of(priceDisplayFormat);
        }
        if (!unitOfMeasure.isDecoded()) {
            return Optional.of(unitOfMeasure);
        }
        if (!unitOfMeasureQtyEx.isDecoded()) {
            return Optional.of(unitOfMeasureQtyEx);
        }
        if (!tradingReferencePriceEx.isDecoded()) {
            return Optional.of(tradingReferencePriceEx);
        }
        if (!settlPriceType.isDecoded()) {
            return Optional.of(settlPriceType);
        }
        if (!clearedVolume.isDecoded()) {
            return Optional.of(clearedVolume);
        }
        if (!openInterestQty.isDecoded()) {
            return Optional.of(openInterestQty);
        }
        if (!lowLimitPriceEx.isDecoded()) {
            return Optional.of(lowLimitPriceEx);
        }
        if (!highLimitPriceEx.isDecoded()) {
            return Optional.of(highLimitPriceEx);
        }
        if (!userDefinedInstrument.isDecoded()) {
            return Optional.of(userDefinedInstrument);
        }
        if (!tradingReferenceDate.isDecoded()) {
            return Optional.of(tradingReferenceDate);
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
        if (!lotTypeRulesGroups.isDecoded()) {
            return lotTypeRulesGroups.failedAt();
        }
        if (!optionUnderlyingsGroups.isDecoded()) {
            return optionUnderlyingsGroups.failedAt();
        }
        if (!optionRelatedInstrumentsGroups.isDecoded()) {
            return optionRelatedInstrumentsGroups.failedAt();
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
            case "PutOrCall" -> Optional.of(putOrCall);
            case "Currency" -> Optional.of(currency);
            case "StrikePriceEx" -> Optional.of(strikePriceEx);
            case "StrikeCurrency" -> Optional.of(strikeCurrency);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "MinCabPriceEx" -> Optional.of(minCabPriceEx);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "MaxTradeVol" -> Optional.of(maxTradeVol);
            case "MinPriceIncrementOptionalEx" -> Optional.of(minPriceIncrementOptionalEx);
            case "MinPriceIncrementAmountEx" -> Optional.of(minPriceIncrementAmountEx);
            case "DisplayFactorEx" -> Optional.of(displayFactorEx);
            case "TickRule" -> Optional.of(tickRule);
            case "MainFraction" -> Optional.of(mainFraction);
            case "SubFraction" -> Optional.of(subFraction);
            case "PriceDisplayFormat" -> Optional.of(priceDisplayFormat);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQtyEx" -> Optional.of(unitOfMeasureQtyEx);
            case "TradingReferencePriceEx" -> Optional.of(tradingReferencePriceEx);
            case "SettlPriceType" -> Optional.of(settlPriceType);
            case "ClearedVolume" -> Optional.of(clearedVolume);
            case "OpenInterestQty" -> Optional.of(openInterestQty);
            case "LowLimitPriceEx" -> Optional.of(lowLimitPriceEx);
            case "HighLimitPriceEx" -> Optional.of(highLimitPriceEx);
            case "UserDefinedInstrument" -> Optional.of(userDefinedInstrument);
            case "TradingReferenceDate" -> Optional.of(tradingReferenceDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MdInstrumentDefinitionOption message)) {
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
        changed.addAll(lotTypeRulesGroups.diffFields(message.lotTypeRulesGroups));
        changed.addAll(optionUnderlyingsGroups.diffFields(message.optionUnderlyingsGroups));
        changed.addAll(optionRelatedInstrumentsGroups.diffFields(message.optionRelatedInstrumentsGroups));
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
            lotTypeRulesGroups.toFormattedString(builder, options);
            builder.append(", ");
            optionUnderlyingsGroups.toFormattedString(builder, options);
            builder.append(", ");
            optionRelatedInstrumentsGroups.toFormattedString(builder, options);
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
        lotTypeRulesGroups.toFormattedString(builder, nested);
        optionUnderlyingsGroups.toFormattedString(builder, nested);
        optionRelatedInstrumentsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MdInstrumentDefinitionOption message)) {
            return false;
        }
        return fields.equals(message.fields) && eventsGroups.equals(message.eventsGroups) && feedTypesGroups.equals(message.feedTypesGroups) && instAttribGroups.equals(message.instAttribGroups) && lotTypeRulesGroups.equals(message.lotTypeRulesGroups) && optionUnderlyingsGroups.equals(message.optionUnderlyingsGroups) && optionRelatedInstrumentsGroups.equals(message.optionRelatedInstrumentsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, eventsGroups, feedTypesGroups, instAttribGroups, lotTypeRulesGroups, optionUnderlyingsGroups, optionRelatedInstrumentsGroups);
    }
}
