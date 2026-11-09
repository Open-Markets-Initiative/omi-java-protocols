package omi.cme.globex.mdp3.sbe.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cme.globex.mdp3.sbe.v1_12.fields.ApplIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.AssetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CfiCodeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CountryOfIssueField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CouponDayCountField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CouponFrequencyPeriodField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CouponFrequencyUnitField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CouponRateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.CurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.DatedDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.DisplayFactorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.HighLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.InstrumentGuidField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.IssueDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.IssuerField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LastUpdateTimeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.LowLimitPriceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MainFractionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MarketSegmentIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MarketSetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchAlgorithmField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MatchEventIndicatorField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaturityDateField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxPriceVariationField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MaxTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdSecurityTradingStatusField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinPriceIncrementAmountField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinPriceIncrementOptionalExField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MinTradeVolField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.ParValueField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PartyRoleClearingOrgField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PriceDisplayFormatField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.PriceQuoteMethodField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RiskSetField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityAltIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityAltIdSourceField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityExchangeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityGroupField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityTypeField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SettlCurrencyField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SubFractionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SymbolField;
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
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.Message;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * Represents the MdInstrumentDefinitionFixedIncome message from the Mdp3 protocol.
 *
 * <p>MDInstrumentDefinitionFixedIncome</p>
 */
public final class MdInstrumentDefinitionFixedIncome implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 350;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Md Instrument Definition Fixed Income";

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
     * Minimum constant tick for the instrument
     */
    private final MinPriceIncrementOptionalExField minPriceIncrementOptionalEx = new MinPriceIncrementOptionalExField();

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     */
    private final DisplayFactorField displayFactor = new DisplayFactorField();

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
     * Monetary value equivalent to the minimum price fluctuation
     */
    private final MinPriceIncrementAmountField minPriceIncrementAmount = new MinPriceIncrementAmountField();

    /**
     * Issue Date
     */
    private final IssueDateField issueDate = new IssueDateField();

    /**
     * Dated Date
     */
    private final DatedDateField datedDate = new DatedDateField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * The rate of interest that, when multiplied by the principal, par value, or face value of a bond, provides the currency amount of the periodic interest payment
     */
    private final CouponRateField couponRate = new CouponRateField();

    /**
     * Par value
     */
    private final ParValueField parValue = new ParValueField();

    /**
     * Time unit associated with the frequency of the bond's coupon payment
     */
    private final CouponFrequencyUnitField couponFrequencyUnit = new CouponFrequencyUnitField();

    /**
     * Time unit multiplier for the frequency of the bond's coupon payment
     */
    private final CouponFrequencyPeriodField couponFrequencyPeriod = new CouponFrequencyPeriodField();

    /**
     * The day count convention used in interest calculations for a bond or an interest bearing security
     */
    private final CouponDayCountField couponDayCount = new CouponDayCountField();

    /**
     * Country of Origin, ISO alpha-2 country code
     */
    private final CountryOfIssueField countryOfIssue = new CountryOfIssueField();

    /**
     * Name of security issuer or the Legal Entity Identifier (LEI - the International ISO standard 17442)
     */
    private final IssuerField issuer = new IssuerField();

    /**
     * Long name of the instrument
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Expanded instrument description. Will contain either ISIN or CUSIP
     */
    private final SecurityAltIdField securityAltId = new SecurityAltIdField();

    /**
     * Identifies class or source of the SecurityAltID (455) value
     */
    private final SecurityAltIdSourceField securityAltIdSource = new SecurityAltIdSourceField();

    /**
     * Price quotation method
     */
    private final PriceQuoteMethodField priceQuoteMethod = new PriceQuoteMethodField();

    /**
     * Clearing organization
     */
    private final PartyRoleClearingOrgField partyRoleClearingOrg = new PartyRoleClearingOrgField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(matchEventIndicator, totNumReportsOptional, securityUpdateAction, lastUpdateTime, mdSecurityTradingStatus, applId, marketSegmentId, underlyingProduct, securityExchange, securityGroup, asset, symbol, securityId, securityType, cfiCode, currency, settlCurrency, matchAlgorithm, minTradeVol, maxTradeVol, minPriceIncrementOptionalEx, displayFactor, mainFraction, subFraction, priceDisplayFormat, unitOfMeasure, unitOfMeasureQty, tradingReferencePrice, tradingReferenceDate, highLimitPrice, lowLimitPrice, maxPriceVariation, minPriceIncrementAmount, issueDate, datedDate, maturityDate, couponRate, parValue, couponFrequencyUnit, couponFrequencyPeriod, couponDayCount, countryOfIssue, issuer, financialInstrumentFullName, securityAltId, securityAltIdSource, priceQuoteMethod, partyRoleClearingOrg, userDefinedInstrument, riskSet, marketSet, instrumentGuid);

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
     * Minimum constant tick for the instrument
     *
     * @return the MinPriceIncrementOptionalEx field
     */
    public MinPriceIncrementOptionalExField minPriceIncrementOptionalEx() {
        return minPriceIncrementOptionalEx;
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
     * Monetary value equivalent to the minimum price fluctuation
     *
     * @return the MinPriceIncrementAmount field
     */
    public MinPriceIncrementAmountField minPriceIncrementAmount() {
        return minPriceIncrementAmount;
    }

    /**
     * Issue Date
     *
     * @return the IssueDate field
     */
    public IssueDateField issueDate() {
        return issueDate;
    }

    /**
     * Dated Date
     *
     * @return the DatedDate field
     */
    public DatedDateField datedDate() {
        return datedDate;
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
     * The rate of interest that, when multiplied by the principal, par value, or face value of a bond, provides the currency amount of the periodic interest payment
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
    }

    /**
     * Par value
     *
     * @return the ParValue field
     */
    public ParValueField parValue() {
        return parValue;
    }

    /**
     * Time unit associated with the frequency of the bond's coupon payment
     *
     * @return the CouponFrequencyUnit field
     */
    public CouponFrequencyUnitField couponFrequencyUnit() {
        return couponFrequencyUnit;
    }

    /**
     * Time unit multiplier for the frequency of the bond's coupon payment
     *
     * @return the CouponFrequencyPeriod field
     */
    public CouponFrequencyPeriodField couponFrequencyPeriod() {
        return couponFrequencyPeriod;
    }

    /**
     * The day count convention used in interest calculations for a bond or an interest bearing security
     *
     * @return the CouponDayCount field
     */
    public CouponDayCountField couponDayCount() {
        return couponDayCount;
    }

    /**
     * Country of Origin, ISO alpha-2 country code
     *
     * @return the CountryOfIssue field
     */
    public CountryOfIssueField countryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Name of security issuer or the Legal Entity Identifier (LEI - the International ISO standard 17442)
     *
     * @return the Issuer field
     */
    public IssuerField issuer() {
        return issuer;
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
     * Expanded instrument description. Will contain either ISIN or CUSIP
     *
     * @return the SecurityAltId field
     */
    public SecurityAltIdField securityAltId() {
        return securityAltId;
    }

    /**
     * Identifies class or source of the SecurityAltID (455) value
     *
     * @return the SecurityAltIdSource field
     */
    public SecurityAltIdSourceField securityAltIdSource() {
        return securityAltIdSource;
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
     * Clearing organization
     *
     * @return the PartyRoleClearingOrg field
     */
    public PartyRoleClearingOrgField partyRoleClearingOrg() {
        return partyRoleClearingOrg;
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

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + eventsGroups.byteLength() - EventsGroups.MINIMUM_BYTE_LENGTH + feedTypesGroups.byteLength() - FeedTypesGroups.MINIMUM_BYTE_LENGTH + instAttribGroups.byteLength() - InstAttribGroups.MINIMUM_BYTE_LENGTH + lotTypeRulesGroups.byteLength() - LotTypeRulesGroups.MINIMUM_BYTE_LENGTH;
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
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 6;
        cursor += 6;
        cursor += 20;
        cursor += 4;
        cursor += 6;
        cursor += 6;
        cursor += 3;
        cursor += 3;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 30;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 3;
        cursor += 2;
        cursor += 20;
        cursor += 2;
        cursor += 25;
        cursor += 35;
        cursor += 12;
        cursor += 1;
        cursor += 5;
        cursor += 5;
        cursor += 1;
        cursor += 6;
        cursor += 6;
        cursor += 8;
        cursor = eventsGroups.padding(runs, cursor);
        cursor = feedTypesGroups.padding(runs, cursor);
        cursor = instAttribGroups.padding(runs, cursor);
        cursor = lotTypeRulesGroups.padding(runs, cursor);
        return cursor;
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
        if (!minPriceIncrementOptionalEx.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementOptionalExField.BYTE_LENGTH;
        if (!displayFactor.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayFactorField.BYTE_LENGTH;
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
        if (!minPriceIncrementAmount.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementAmountField.BYTE_LENGTH;
        if (!issueDate.parse(data, cursor)) {
            return false;
        }
        cursor += IssueDateField.BYTE_LENGTH;
        if (!datedDate.parse(data, cursor)) {
            return false;
        }
        cursor += DatedDateField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!couponRate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponRateField.BYTE_LENGTH;
        if (!parValue.parse(data, cursor)) {
            return false;
        }
        cursor += ParValueField.BYTE_LENGTH;
        if (!couponFrequencyUnit.parse(data, cursor)) {
            return false;
        }
        cursor += CouponFrequencyUnitField.BYTE_LENGTH;
        if (!couponFrequencyPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += CouponFrequencyPeriodField.BYTE_LENGTH;
        if (!couponDayCount.parse(data, cursor)) {
            return false;
        }
        cursor += CouponDayCountField.BYTE_LENGTH;
        if (!countryOfIssue.parse(data, cursor)) {
            return false;
        }
        cursor += CountryOfIssueField.BYTE_LENGTH;
        if (!issuer.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerField.BYTE_LENGTH;
        if (!financialInstrumentFullName.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        if (!securityAltId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityAltIdField.BYTE_LENGTH;
        if (!securityAltIdSource.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityAltIdSourceField.BYTE_LENGTH;
        if (!priceQuoteMethod.parse(data, cursor)) {
            return false;
        }
        cursor += PriceQuoteMethodField.BYTE_LENGTH;
        if (!partyRoleClearingOrg.parse(data, cursor)) {
            return false;
        }
        cursor += PartyRoleClearingOrgField.BYTE_LENGTH;
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
        if (!eventsGroups.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += eventsGroups.byteLength();
        if (end - cursor < 9) {
            return false;
        }
        if (!feedTypesGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += feedTypesGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!instAttribGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += instAttribGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!lotTypeRulesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += lotTypeRulesGroups.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
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
        cursor = minPriceIncrementOptionalEx.encode(data, cursor);
        cursor = displayFactor.encode(data, cursor);
        cursor = mainFraction.encode(data, cursor);
        cursor = subFraction.encode(data, cursor);
        cursor = priceDisplayFormat.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQty.encode(data, cursor);
        cursor = tradingReferencePrice.encode(data, cursor);
        cursor = tradingReferenceDate.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = maxPriceVariation.encode(data, cursor);
        cursor = minPriceIncrementAmount.encode(data, cursor);
        cursor = issueDate.encode(data, cursor);
        cursor = datedDate.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        cursor = parValue.encode(data, cursor);
        cursor = couponFrequencyUnit.encode(data, cursor);
        cursor = couponFrequencyPeriod.encode(data, cursor);
        cursor = couponDayCount.encode(data, cursor);
        cursor = countryOfIssue.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = financialInstrumentFullName.encode(data, cursor);
        cursor = securityAltId.encode(data, cursor);
        cursor = securityAltIdSource.encode(data, cursor);
        cursor = priceQuoteMethod.encode(data, cursor);
        cursor = partyRoleClearingOrg.encode(data, cursor);
        cursor = userDefinedInstrument.encode(data, cursor);
        cursor = riskSet.encode(data, cursor);
        cursor = marketSet.encode(data, cursor);
        cursor = instrumentGuid.encode(data, cursor);
        cursor = eventsGroups.encode(data, cursor);
        cursor = feedTypesGroups.encode(data, cursor);
        cursor = instAttribGroups.encode(data, cursor);
        cursor = lotTypeRulesGroups.encode(data, cursor);
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
        return true;
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
        if (!minPriceIncrementOptionalEx.isDecoded()) {
            return Optional.of(minPriceIncrementOptionalEx);
        }
        if (!displayFactor.isDecoded()) {
            return Optional.of(displayFactor);
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
        if (!minPriceIncrementAmount.isDecoded()) {
            return Optional.of(minPriceIncrementAmount);
        }
        if (!issueDate.isDecoded()) {
            return Optional.of(issueDate);
        }
        if (!datedDate.isDecoded()) {
            return Optional.of(datedDate);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!couponRate.isDecoded()) {
            return Optional.of(couponRate);
        }
        if (!parValue.isDecoded()) {
            return Optional.of(parValue);
        }
        if (!couponFrequencyUnit.isDecoded()) {
            return Optional.of(couponFrequencyUnit);
        }
        if (!couponFrequencyPeriod.isDecoded()) {
            return Optional.of(couponFrequencyPeriod);
        }
        if (!couponDayCount.isDecoded()) {
            return Optional.of(couponDayCount);
        }
        if (!countryOfIssue.isDecoded()) {
            return Optional.of(countryOfIssue);
        }
        if (!issuer.isDecoded()) {
            return Optional.of(issuer);
        }
        if (!financialInstrumentFullName.isDecoded()) {
            return Optional.of(financialInstrumentFullName);
        }
        if (!securityAltId.isDecoded()) {
            return Optional.of(securityAltId);
        }
        if (!securityAltIdSource.isDecoded()) {
            return Optional.of(securityAltIdSource);
        }
        if (!priceQuoteMethod.isDecoded()) {
            return Optional.of(priceQuoteMethod);
        }
        if (!partyRoleClearingOrg.isDecoded()) {
            return Optional.of(partyRoleClearingOrg);
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
            case "MinPriceIncrementOptionalEx" -> Optional.of(minPriceIncrementOptionalEx);
            case "DisplayFactor" -> Optional.of(displayFactor);
            case "MainFraction" -> Optional.of(mainFraction);
            case "SubFraction" -> Optional.of(subFraction);
            case "PriceDisplayFormat" -> Optional.of(priceDisplayFormat);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQty" -> Optional.of(unitOfMeasureQty);
            case "TradingReferencePrice" -> Optional.of(tradingReferencePrice);
            case "TradingReferenceDate" -> Optional.of(tradingReferenceDate);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "MaxPriceVariation" -> Optional.of(maxPriceVariation);
            case "MinPriceIncrementAmount" -> Optional.of(minPriceIncrementAmount);
            case "IssueDate" -> Optional.of(issueDate);
            case "DatedDate" -> Optional.of(datedDate);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "CouponRate" -> Optional.of(couponRate);
            case "ParValue" -> Optional.of(parValue);
            case "CouponFrequencyUnit" -> Optional.of(couponFrequencyUnit);
            case "CouponFrequencyPeriod" -> Optional.of(couponFrequencyPeriod);
            case "CouponDayCount" -> Optional.of(couponDayCount);
            case "CountryOfIssue" -> Optional.of(countryOfIssue);
            case "Issuer" -> Optional.of(issuer);
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "SecurityAltId" -> Optional.of(securityAltId);
            case "SecurityAltIdSource" -> Optional.of(securityAltIdSource);
            case "PriceQuoteMethod" -> Optional.of(priceQuoteMethod);
            case "PartyRoleClearingOrg" -> Optional.of(partyRoleClearingOrg);
            case "UserDefinedInstrument" -> Optional.of(userDefinedInstrument);
            case "RiskSet" -> Optional.of(riskSet);
            case "MarketSet" -> Optional.of(marketSet);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MdInstrumentDefinitionFixedIncome message)) {
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
        if (!(other instanceof MdInstrumentDefinitionFixedIncome message)) {
            return false;
        }
        return fields.equals(message.fields) && eventsGroups.equals(message.eventsGroups) && feedTypesGroups.equals(message.feedTypesGroups) && instAttribGroups.equals(message.instAttribGroups) && lotTypeRulesGroups.equals(message.lotTypeRulesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, eventsGroups, feedTypesGroups, instAttribGroups, lotTypeRulesGroups);
    }
}
