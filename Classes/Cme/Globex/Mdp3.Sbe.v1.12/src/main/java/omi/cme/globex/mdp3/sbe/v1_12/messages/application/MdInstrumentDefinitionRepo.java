package omi.cme.globex.mdp3.sbe.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_12.fields.ApplIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.AssetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CfiCodeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.DisplayFactorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.EndDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.HighLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.InstrumentGuidField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LastUpdateTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LowLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MarketSegmentIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MarketSetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchAlgorithmField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchEventIndicatorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxNoOfSubstitutionsField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxPriceVariationField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdSecurityTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinPriceIncrementExField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MoneyOrParField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PartyRoleClearingOrgField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PriceQuoteMethodField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RepoSubTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RiskSetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityExchangeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityGroupField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SettlCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.StartDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SymbolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TermCodeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TerminationTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TotNumReportsOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TradingReferenceDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.TradingReferencePriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnderlyingProductField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnitOfMeasureField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UnitOfMeasureQtyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.UserDefinedInstrumentField;
import omi.cme.globex.mdp3.sbe.v1_12.structs.EventsGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.FeedTypesGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.InstAttribGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.LotTypeRulesGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.RepoRelatedInstrumentsGroups;
import omi.cme.globex.mdp3.sbe.v1_12.structs.RepoUnderlyingsGroups;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.Message;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * Represents the MdInstrumentDefinitionRepo message from the Mdp3 protocol.
 *
 * <p>MDInstrumentDefinitionRepo</p>
 */
public final class MdInstrumentDefinitionRepo implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 293;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Md Instrument Definition Repo";

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
     * Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     */
    private final UnitOfMeasureQtyField unitOfMeasureQty = new UnitOfMeasureQtyField();

    /**
     * Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     */
    private final TradingReferencePriceField tradingReferencePrice = new TradingReferencePriceField();

    /**
     * Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice
     */
    private final TradingReferenceDateField tradingReferenceDate = new TradingReferenceDateField();

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
     * Long name of the instrument
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Clearing organization
     */
    private final PartyRoleClearingOrgField partyRoleClearingOrg = new PartyRoleClearingOrgField();

    /**
     * Start date of a financing deal, i.e. the date the buyer pays the seller cash and takes control of the collateral
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * End date of a financing deal, i.e. the date the seller reimburses the buyer and takes back control of the collateral
     */
    private final EndDateField endDate = new EndDateField();

    /**
     * For Repos the timing or method for terminating the agreement. Term code
     */
    private final TerminationTypeField terminationType = new TerminationTypeField();

    /**
     * Repo Sub Security Type
     */
    private final RepoSubTypeField repoSubType = new RepoSubTypeField();

    /**
     * Money or Par indicates if the GC is filled by par amount or by money amount
     */
    private final MoneyOrParField moneyOrPar = new MoneyOrParField();

    /**
     * Max number of substitutions allowed. The value of 0 indicates that substitutions are not allowed
     */
    private final MaxNoOfSubstitutionsField maxNoOfSubstitutions = new MaxNoOfSubstitutionsField();

    /**
     * Price quotation method
     */
    private final PriceQuoteMethodField priceQuoteMethod = new PriceQuoteMethodField();

    /**
     * User-defined instruments flag
     */
    private final UserDefinedInstrumentField userDefinedInstrument = new UserDefinedInstrumentField();

    /**
     * Risk Set identifies the list of instruments sharing credit limits set up
     */
    private final RiskSetField riskSet = new RiskSetField();

    /**
     * Market Set defines the bilateral relationship and Self Match Prevention configuration for eligible markets
     */
    private final MarketSetField marketSet = new MarketSetField();

    /**
     * External unique instrument ID
     */
    private final InstrumentGuidField instrumentGuid = new InstrumentGuidField();

    /**
     * Full Repo Term Code
     */
    private final TermCodeField termCode = new TermCodeField();

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
    private final RepoUnderlyingsGroups repoUnderlyingsGroups = new RepoUnderlyingsGroups();

    /**
     * NoRelatedInstruments Block
     */
    private final RepoRelatedInstrumentsGroups repoRelatedInstrumentsGroups = new RepoRelatedInstrumentsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(matchEventIndicator, totNumReportsOptional, securityUpdateAction, lastUpdateTime, mdSecurityTradingStatus, applId, marketSegmentId, underlyingProduct, securityExchange, securityGroup, asset, symbol, securityId, securityType, cfiCode, currency, settlCurrency, matchAlgorithm, minTradeVol, maxTradeVol, minPriceIncrementEx, displayFactor, unitOfMeasure, unitOfMeasureQty, tradingReferencePrice, tradingReferenceDate, highLimitPrice, lowLimitPrice, maxPriceVariation, financialInstrumentFullName, partyRoleClearingOrg, startDate, endDate, terminationType, repoSubType, moneyOrPar, maxNoOfSubstitutions, priceQuoteMethod, userDefinedInstrument, riskSet, marketSet, instrumentGuid, termCode);

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
     * Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     *
     * @return the TradingReferencePrice field
     */
    public TradingReferencePriceField tradingReferencePrice() {
        return tradingReferencePrice;
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
     * Long name of the instrument
     *
     * @return the FinancialInstrumentFullName field
     */
    public FinancialInstrumentFullNameField financialInstrumentFullName() {
        return financialInstrumentFullName;
    }

    /**
     * Clearing organization
     *
     * @return the PartyRoleClearingOrg field
     */
    public PartyRoleClearingOrgField partyRoleClearingOrg() {
        return partyRoleClearingOrg;
    }

    /**
     * Start date of a financing deal, i.e. the date the buyer pays the seller cash and takes control of the collateral
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * End date of a financing deal, i.e. the date the seller reimburses the buyer and takes back control of the collateral
     *
     * @return the EndDate field
     */
    public EndDateField endDate() {
        return endDate;
    }

    /**
     * For Repos the timing or method for terminating the agreement. Term code
     *
     * @return the TerminationType field
     */
    public TerminationTypeField terminationType() {
        return terminationType;
    }

    /**
     * Repo Sub Security Type
     *
     * @return the RepoSubType field
     */
    public RepoSubTypeField repoSubType() {
        return repoSubType;
    }

    /**
     * Money or Par indicates if the GC is filled by par amount or by money amount
     *
     * @return the MoneyOrPar field
     */
    public MoneyOrParField moneyOrPar() {
        return moneyOrPar;
    }

    /**
     * Max number of substitutions allowed. The value of 0 indicates that substitutions are not allowed
     *
     * @return the MaxNoOfSubstitutions field
     */
    public MaxNoOfSubstitutionsField maxNoOfSubstitutions() {
        return maxNoOfSubstitutions;
    }

    /**
     * Price quotation method
     *
     * @return the PriceQuoteMethod field
     */
    public PriceQuoteMethodField priceQuoteMethod() {
        return priceQuoteMethod;
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
     * Risk Set identifies the list of instruments sharing credit limits set up
     *
     * @return the RiskSet field
     */
    public RiskSetField riskSet() {
        return riskSet;
    }

    /**
     * Market Set defines the bilateral relationship and Self Match Prevention configuration for eligible markets
     *
     * @return the MarketSet field
     */
    public MarketSetField marketSet() {
        return marketSet;
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
     * Full Repo Term Code
     *
     * @return the TermCode field
     */
    public TermCodeField termCode() {
        return termCode;
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
     * @return the RepoUnderlyingsGroups record
     */
    public RepoUnderlyingsGroups repoUnderlyingsGroups() {
        return repoUnderlyingsGroups;
    }

    /**
     * NoRelatedInstruments Block
     *
     * @return the RepoRelatedInstrumentsGroups record
     */
    public RepoRelatedInstrumentsGroups repoRelatedInstrumentsGroups() {
        return repoRelatedInstrumentsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + eventsGroups.byteLength() - EventsGroups.MINIMUM_BYTE_LENGTH + feedTypesGroups.byteLength() - FeedTypesGroups.MINIMUM_BYTE_LENGTH + instAttribGroups.byteLength() - InstAttribGroups.MINIMUM_BYTE_LENGTH + lotTypeRulesGroups.byteLength() - LotTypeRulesGroups.MINIMUM_BYTE_LENGTH + repoUnderlyingsGroups.byteLength() - RepoUnderlyingsGroups.MINIMUM_BYTE_LENGTH + repoRelatedInstrumentsGroups.byteLength() - RepoRelatedInstrumentsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!unitOfMeasureQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQtyField.BYTE_LENGTH;
        if (!tradingReferencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferencePriceField.BYTE_LENGTH;
        if (!tradingReferenceDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradingReferenceDateField.BYTE_LENGTH;
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
        if (!financialInstrumentFullName.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        if (!partyRoleClearingOrg.parse(data, cursor)) {
            return false;
        }
        cursor += PartyRoleClearingOrgField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!endDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndDateField.BYTE_LENGTH;
        if (!terminationType.parse(data, cursor)) {
            return false;
        }
        cursor += TerminationTypeField.BYTE_LENGTH;
        if (!repoSubType.parse(data, cursor)) {
            return false;
        }
        cursor += RepoSubTypeField.BYTE_LENGTH;
        if (!moneyOrPar.parse(data, cursor)) {
            return false;
        }
        cursor += MoneyOrParField.BYTE_LENGTH;
        if (!maxNoOfSubstitutions.parse(data, cursor)) {
            return false;
        }
        cursor += MaxNoOfSubstitutionsField.BYTE_LENGTH;
        if (!priceQuoteMethod.parse(data, cursor)) {
            return false;
        }
        cursor += PriceQuoteMethodField.BYTE_LENGTH;
        if (!userDefinedInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += UserDefinedInstrumentField.BYTE_LENGTH;
        if (!riskSet.parse(data, cursor)) {
            return false;
        }
        cursor += RiskSetField.BYTE_LENGTH;
        if (!marketSet.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSetField.BYTE_LENGTH;
        if (!instrumentGuid.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentGuidField.BYTE_LENGTH;
        if (!termCode.parse(data, cursor)) {
            return false;
        }
        cursor += TermCodeField.BYTE_LENGTH;
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
        if (!repoUnderlyingsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += repoUnderlyingsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!repoRelatedInstrumentsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += repoRelatedInstrumentsGroups.byteLength();

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
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = maxTradeVol.encode(data, cursor);
        cursor = minPriceIncrementEx.encode(data, cursor);
        cursor = displayFactor.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQty.encode(data, cursor);
        cursor = tradingReferencePrice.encode(data, cursor);
        cursor = tradingReferenceDate.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = maxPriceVariation.encode(data, cursor);
        cursor = financialInstrumentFullName.encode(data, cursor);
        cursor = partyRoleClearingOrg.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = terminationType.encode(data, cursor);
        cursor = repoSubType.encode(data, cursor);
        cursor = moneyOrPar.encode(data, cursor);
        cursor = maxNoOfSubstitutions.encode(data, cursor);
        cursor = priceQuoteMethod.encode(data, cursor);
        cursor = userDefinedInstrument.encode(data, cursor);
        cursor = riskSet.encode(data, cursor);
        cursor = marketSet.encode(data, cursor);
        cursor = instrumentGuid.encode(data, cursor);
        cursor = termCode.encode(data, cursor);
        cursor = eventsGroups.encode(data, cursor);
        cursor = feedTypesGroups.encode(data, cursor);
        cursor = instAttribGroups.encode(data, cursor);
        cursor = lotTypeRulesGroups.encode(data, cursor);
        cursor = repoUnderlyingsGroups.encode(data, cursor);
        cursor = repoRelatedInstrumentsGroups.encode(data, cursor);
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
        eventsGroups.clear();
        feedTypesGroups.clear();
        instAttribGroups.clear();
        lotTypeRulesGroups.clear();
        repoUnderlyingsGroups.clear();
        repoRelatedInstrumentsGroups.clear();
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
        if (!repoUnderlyingsGroups.isRecognized()) {
            return false;
        }
        return repoRelatedInstrumentsGroups.isRecognized();
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
        if (!repoUnderlyingsGroups.isValid()) {
            return false;
        }
        if (!repoRelatedInstrumentsGroups.isValid()) {
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
        if (!unitOfMeasure.isDecoded()) {
            return Optional.of(unitOfMeasure);
        }
        if (!unitOfMeasureQty.isDecoded()) {
            return Optional.of(unitOfMeasureQty);
        }
        if (!tradingReferencePrice.isDecoded()) {
            return Optional.of(tradingReferencePrice);
        }
        if (!tradingReferenceDate.isDecoded()) {
            return Optional.of(tradingReferenceDate);
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
        if (!financialInstrumentFullName.isDecoded()) {
            return Optional.of(financialInstrumentFullName);
        }
        if (!partyRoleClearingOrg.isDecoded()) {
            return Optional.of(partyRoleClearingOrg);
        }
        if (!startDate.isDecoded()) {
            return Optional.of(startDate);
        }
        if (!endDate.isDecoded()) {
            return Optional.of(endDate);
        }
        if (!terminationType.isDecoded()) {
            return Optional.of(terminationType);
        }
        if (!repoSubType.isDecoded()) {
            return Optional.of(repoSubType);
        }
        if (!moneyOrPar.isDecoded()) {
            return Optional.of(moneyOrPar);
        }
        if (!maxNoOfSubstitutions.isDecoded()) {
            return Optional.of(maxNoOfSubstitutions);
        }
        if (!priceQuoteMethod.isDecoded()) {
            return Optional.of(priceQuoteMethod);
        }
        if (!userDefinedInstrument.isDecoded()) {
            return Optional.of(userDefinedInstrument);
        }
        if (!riskSet.isDecoded()) {
            return Optional.of(riskSet);
        }
        if (!marketSet.isDecoded()) {
            return Optional.of(marketSet);
        }
        if (!instrumentGuid.isDecoded()) {
            return Optional.of(instrumentGuid);
        }
        if (!termCode.isDecoded()) {
            return Optional.of(termCode);
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
        if (!repoUnderlyingsGroups.isDecoded()) {
            return repoUnderlyingsGroups.failedAt();
        }
        if (!repoRelatedInstrumentsGroups.isDecoded()) {
            return repoRelatedInstrumentsGroups.failedAt();
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
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "MaxTradeVol" -> Optional.of(maxTradeVol);
            case "MinPriceIncrementEx" -> Optional.of(minPriceIncrementEx);
            case "DisplayFactor" -> Optional.of(displayFactor);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQty" -> Optional.of(unitOfMeasureQty);
            case "TradingReferencePrice" -> Optional.of(tradingReferencePrice);
            case "TradingReferenceDate" -> Optional.of(tradingReferenceDate);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "MaxPriceVariation" -> Optional.of(maxPriceVariation);
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "PartyRoleClearingOrg" -> Optional.of(partyRoleClearingOrg);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "TerminationType" -> Optional.of(terminationType);
            case "RepoSubType" -> Optional.of(repoSubType);
            case "MoneyOrPar" -> Optional.of(moneyOrPar);
            case "MaxNoOfSubstitutions" -> Optional.of(maxNoOfSubstitutions);
            case "PriceQuoteMethod" -> Optional.of(priceQuoteMethod);
            case "UserDefinedInstrument" -> Optional.of(userDefinedInstrument);
            case "RiskSet" -> Optional.of(riskSet);
            case "MarketSet" -> Optional.of(marketSet);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            case "TermCode" -> Optional.of(termCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MdInstrumentDefinitionRepo message)) {
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
        changed.addAll(repoUnderlyingsGroups.diffFields(message.repoUnderlyingsGroups));
        changed.addAll(repoRelatedInstrumentsGroups.diffFields(message.repoRelatedInstrumentsGroups));
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
            repoUnderlyingsGroups.toFormattedString(builder, options);
            builder.append(", ");
            repoRelatedInstrumentsGroups.toFormattedString(builder, options);
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
        repoUnderlyingsGroups.toFormattedString(builder, nested);
        repoRelatedInstrumentsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MdInstrumentDefinitionRepo message)) {
            return false;
        }
        return fields.equals(message.fields) && eventsGroups.equals(message.eventsGroups) && feedTypesGroups.equals(message.feedTypesGroups) && instAttribGroups.equals(message.instAttribGroups) && lotTypeRulesGroups.equals(message.lotTypeRulesGroups) && repoUnderlyingsGroups.equals(message.repoUnderlyingsGroups) && repoRelatedInstrumentsGroups.equals(message.repoRelatedInstrumentsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, eventsGroups, feedTypesGroups, instAttribGroups, lotTypeRulesGroups, repoUnderlyingsGroups, repoRelatedInstrumentsGroups);
    }
}
