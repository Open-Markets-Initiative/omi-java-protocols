package omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.AgencyCrossIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.AgencyCrossTradeFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.AlgoTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.AlgorithmicIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.AmendmentFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.BenchmarkTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.CancellationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ConsecutiveAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ContingentTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.DaFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.DailyAggregatedTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.DeferralEnrichmentTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.DuplicateFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.DuplicativeIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.EffectiveDateOfTheContractField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.EmissionAllowanceTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.EsmaStandardDeferralFlagsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.EsmaSupplementaryDeferralFlagsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ExchangeForPhysicalsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.FaFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.FourWeeksAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.IndefiniteAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.InstrumentField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.InstrumentIdentificationCodeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.InstrumentIdentificationCodeTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.LdFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.LeiOfClearingHouseField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.LimitedDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.MarketClosingPriceFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.MarketMechanismField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.MatchedPrincipalTradeFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.MaturityDateOfTheContractField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.MissingPricePriceConditionsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ModificationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NegotiationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NegotiationTradeFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NonPriceContributionToDiscoveryField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NonPriceFormingTransactionsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NotationOfTheQuantityInMeasurementUnitField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NotionalAmountField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NotionalCurrencyField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NtLargeInScaleFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NtLiquidityFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NtPreTradeTransparencyFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.NtPriceConditionsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.OffBookAutomatedIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PortfolioTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PostTradeDeferralReasonField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PriceField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PriceFormationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PriceImprovementFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PriceMajorCurrencyPriceCurrencyField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PriceNotationField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PtDeferralReasonFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PtIlliquidFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.PublicationDateAndTimeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.QuantityField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.QuantityInMeasurementUnitField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ReferencePriceIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ReferencePriceTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.SourceVenueField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.SpecialDividendFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.SpecialDividendIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.SpreadField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.ThirdCountryTradingVenueOfExecutionField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TimestampField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TotalNumberOfTransactionsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TradingDateAndTimeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TradingModeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TradingSystemField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TransactionCategoryField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TransactionIdentificationCodeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.TransactionToBeClearedField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.UpfrontPaymentField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VenueBookDefinitionIdField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VenueOfExecutionField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VenueOfPublicationField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VenueTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VoFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VolumeOmissionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.fields.VolumeOmissionForSovereignDebtFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.types.Field;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.types.Message;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.types.PrintOptions;

/**
 * Represents the MifidIiTradeReportMessage message from the Mifid2PostTrade protocol.
 *
 * <p>Sent to report the MiFID compliant details of a privately negotiated trade</p>
 */
public final class MifidIiTradeReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 533;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mifid Ii Trade Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 72, 8, 334, 1 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * A unique trade identifier. The value will be right aligned.
     */
    private final TransactionIdentificationCodeField transactionIdentificationCode = new TransactionIdentificationCodeField();

    /**
     * Total Number of Transactions of aggregated trade.
     */
    private final TotalNumberOfTransactionsField totalNumberOfTransactions = new TotalNumberOfTransactionsField();

    /**
     * Venue from which market data is received for the instrument.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * The trade price, limited to a precision of {DECIMAL-19/18}. Will be set to default value (20 spaces) if there is a pending price (PNDG). In case of transactions under ESMA jurisdiction, will be set to default value (20 spaces) if price is not available (NOAP).
     */
    private final PriceField price = new PriceField();

    /**
     * The number of units of the financial instrument or the number of derivative contracts in the trade, limited to a precision of {DECIMAL-19/18}. Will be set to default value (20 spaces) if quantity is not available. In case of transactions under FCA jurisdiction, will be set to default value (20 spaces) if the traded security is a bond.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Date and time when the transaction was executed or agreed upon. If a trade is cancelled or amended, this field will contain the trading date and time of the original trade. Blank for aggregated publications: DATF, FWAF, IDAF, COAF, AGFW.
     */
    private final TradingDateAndTimeField tradingDateAndTime = new TradingDateAndTimeField();

    /**
     * Type of the instrument identification code.
     */
    private final InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType = new InstrumentIdentificationCodeTypeField();

    /**
     * Instrument identification number (UPI or ISIN code).
     */
    private final InstrumentIdentificationCodeField instrumentIdentificationCode = new InstrumentIdentificationCodeField();

    /**
     * Indicates if the price is expressed in monetary value, in percentage or yield. Will be set to default value (4 spaces) if not available.
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Major currency in which the price is expressed (applicable if the price is expressed as monetary value). Currency Code as per ISO 4217. Price Major Currency (FCA 2017/587) / Price Currency (ESMA, FCA 2017/583).
     */
    private final PriceMajorCurrencyPriceCurrencyField priceMajorCurrencyPriceCurrency = new PriceMajorCurrencyPriceCurrencyField();

    /**
     * Notional value relevant to the security, limited to a precision of {DECIMAL-19/18}.
     */
    private final NotionalAmountField notionalAmount = new NotionalAmountField();

    /**
     * Major currency in which the notional amount is denominated.
     */
    private final NotionalCurrencyField notionalCurrency = new NotionalCurrencyField();

    /**
     * Identification of the venue where the transaction was executed. XOFF = OTC, SINT = Systematic Internaliser, or the MIC corresponding to the relevant RM/MTF/OTF.
     */
    private final VenueOfExecutionField venueOfExecution = new VenueOfExecutionField();

    /**
     * Date and time when the transaction was published.
     */
    private final PublicationDateAndTimeField publicationDateAndTime = new PublicationDateAndTimeField();

    /**
     * BENC when the trade is a benchmark trade.
     */
    private final BenchmarkTransactionFlagField benchmarkTransactionFlag = new BenchmarkTransactionFlagField();

    /**
     * ACTX when the trade is an agency cross trade.
     */
    private final AgencyCrossTradeFlagField agencyCrossTradeFlag = new AgencyCrossTradeFlagField();

    /**
     * NPFT when the trade is a non-price forming trade.
     */
    private final NonPriceFormingTransactionsFlagField nonPriceFormingTransactionsFlag = new NonPriceFormingTransactionsFlagField();

    /**
     * TNCP when the trade does not contribute to the price discovery process.
     */
    private final NonPriceContributionToDiscoveryField nonPriceContributionToDiscovery = new NonPriceContributionToDiscoveryField();

    /**
     * SDIV when the trade is a special dividend trade.
     */
    private final SpecialDividendFlagField specialDividendFlag = new SpecialDividendFlagField();

    /**
     * Post trade deferral reason, SIZE or LRGS.
     */
    private final PtDeferralReasonFlagField ptDeferralReasonFlag = new PtDeferralReasonFlagField();

    /**
     * RFPT when the trade is a reference price trade.
     */
    private final ReferencePriceTransactionFlagField referencePriceTransactionFlag = new ReferencePriceTransactionFlagField();

    /**
     * Negotiated trade liquidity indication, NLIQ or OILQ.
     */
    private final NtLiquidityFlagField ntLiquidityFlag = new NtLiquidityFlagField();

    /**
     * PRIC when the negotiated trade is subject to conditions other than the current market price.
     */
    private final NtPriceConditionsFlagField ntPriceConditionsFlag = new NtPriceConditionsFlagField();

    /**
     * ALGO when the trade is an algorithmic trade.
     */
    private final AlgoTransactionFlagField algoTransactionFlag = new AlgoTransactionFlagField();

    /**
     * ILQD when publication is deferred for an illiquid instrument.
     */
    private final PtIlliquidFlagField ptIlliquidFlag = new PtIlliquidFlagField();

    /**
     * RPRI when the trade has received price improvement.
     */
    private final PriceImprovementFlagField priceImprovementFlag = new PriceImprovementFlagField();

    /**
     * CANC when the trade is a cancellation.
     */
    private final CancellationFlagField cancellationFlag = new CancellationFlagField();

    /**
     * AMND when the trade is an amendment.
     */
    private final AmendmentFlagField amendmentFlag = new AmendmentFlagField();

    /**
     * DUPL when the trade report is duplicative.
     */
    private final DuplicateFlagField duplicateFlag = new DuplicateFlagField();

    /**
     * Package or exchange for physicals trade, TPAC or XFPH.
     */
    private final ExchangeForPhysicalsFlagField exchangeForPhysicalsFlag = new ExchangeForPhysicalsFlagField();

    /**
     * LMTF when the trade is a limited details trade.
     */
    private final LimitedDetailsFlagField limitedDetailsFlag = new LimitedDetailsFlagField();

    /**
     * FULF for full details of an earlier limited details trade.
     */
    private final LdFullDetailsFlagField ldFullDetailsFlag = new LdFullDetailsFlagField();

    /**
     * DATF when the trade is a daily aggregated trade.
     */
    private final DailyAggregatedTransactionFlagField dailyAggregatedTransactionFlag = new DailyAggregatedTransactionFlagField();

    /**
     * FULA for full details of an earlier daily aggregated trade.
     */
    private final DaFullDetailsFlagField daFullDetailsFlag = new DaFullDetailsFlagField();

    /**
     * VOLO when the trade is a volume omission trade.
     */
    private final VolumeOmissionFlagField volumeOmissionFlag = new VolumeOmissionFlagField();

    /**
     * FULV for full details of an earlier volume omission trade.
     */
    private final VoFullDetailsFlagField voFullDetailsFlag = new VoFullDetailsFlagField();

    /**
     * FWAF when the trade is a four weeks aggregation trade.
     */
    private final FourWeeksAggregationFlagField fourWeeksAggregationFlag = new FourWeeksAggregationFlagField();

    /**
     * FULJ for full details of an earlier four weeks aggregation trade.
     */
    private final FaFullDetailsFlagField faFullDetailsFlag = new FaFullDetailsFlagField();

    /**
     * IDAF when the trade is an indefinite aggregation trade.
     */
    private final IndefiniteAggregationFlagField indefiniteAggregationFlag = new IndefiniteAggregationFlagField();

    /**
     * VOLW for a volume omission trade eligible for subsequent enrichment in aggregated form.
     */
    private final VolumeOmissionForSovereignDebtFlagField volumeOmissionForSovereignDebtFlag = new VolumeOmissionForSovereignDebtFlagField();

    /**
     * COAF for full details in aggregated form of an earlier volume omission trade.
     */
    private final ConsecutiveAggregationFlagField consecutiveAggregationFlag = new ConsecutiveAggregationFlagField();

    /**
     * Type sent by the venue.
     */
    private final VenueTypeField venueType = new VenueTypeField();

    /**
     * Book Definition ID sent by the venue.
     */
    private final VenueBookDefinitionIdField venueBookDefinitionId = new VenueBookDefinitionIdField();

    /**
     * Indication of measurement units used to represent the value in the Quantity in Measurement Unit.
     */
    private final NotationOfTheQuantityInMeasurementUnitField notationOfTheQuantityInMeasurementUnit = new NotationOfTheQuantityInMeasurementUnitField();

    /**
     * The Quantity in Measurement Unit, limited to a precision of IEEE 754 Double Standard.
     */
    private final QuantityInMeasurementUnitField quantityInMeasurementUnit = new QuantityInMeasurementUnitField();

    /**
     * Identifies if the firm intends to clear the transaction. ESMA field for derivatives. Blank if not applicable.
     */
    private final TransactionToBeClearedField transactionToBeCleared = new TransactionToBeClearedField();

    /**
     * Emission Allowance Type. Blank if not applicable.
     */
    private final EmissionAllowanceTypeField emissionAllowanceType = new EmissionAllowanceTypeField();

    /**
     * Identification of the regulatory regime under which the transaction was published. The value sent by the source venue is passed on. ECHO = UK APA Regulation, ECEU = EU APA Regulation, or the MIC corresponding to the relevant RM/MTF/OTF.
     */
    private final VenueOfPublicationField venueOfPublication = new VenueOfPublicationField();

    /**
     * Market mechanism on which the transaction was executed.
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Trading mode in which the transaction was executed.
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * Transaction category short code.
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Negotiation indicator short code.
     */
    private final NegotiationIndicatorField negotiationIndicator = new NegotiationIndicatorField();

    /**
     * Agency cross indicator short code.
     */
    private final AgencyCrossIndicatorField agencyCrossIndicator = new AgencyCrossIndicatorField();

    /**
     * Modification indicator short code.
     */
    private final ModificationIndicatorField modificationIndicator = new ModificationIndicatorField();

    /**
     * Reference price indicator short code.
     */
    private final ReferencePriceIndicatorField referencePriceIndicator = new ReferencePriceIndicatorField();

    /**
     * Special dividend indicator short code.
     */
    private final SpecialDividendIndicatorField specialDividendIndicator = new SpecialDividendIndicatorField();

    /**
     * Off book automated indicator.
     */
    private final OffBookAutomatedIndicatorField offBookAutomatedIndicator = new OffBookAutomatedIndicatorField();

    /**
     * Price formation indicator short code.
     */
    private final PriceFormationIndicatorField priceFormationIndicator = new PriceFormationIndicatorField();

    /**
     * Algorithmic indicator short code.
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Post trade deferral reason short code.
     */
    private final PostTradeDeferralReasonField postTradeDeferralReason = new PostTradeDeferralReasonField();

    /**
     * Deferral or enrichment type short code.
     */
    private final DeferralEnrichmentTypeField deferralEnrichmentType = new DeferralEnrichmentTypeField();

    /**
     * Duplicative indicator short code.
     */
    private final DuplicativeIndicatorField duplicativeIndicator = new DuplicativeIndicatorField();

    /**
     * Identification of the third-country trading venue where the transaction was executed.
     */
    private final ThirdCountryTradingVenueOfExecutionField thirdCountryTradingVenueOfExecution = new ThirdCountryTradingVenueOfExecutionField();

    /**
     * PORT when the trade is a portfolio trade.
     */
    private final PortfolioTransactionFlagField portfolioTransactionFlag = new PortfolioTransactionFlagField();

    /**
     * CONT when the trade is a contingent trade.
     */
    private final ContingentTransactionFlagField contingentTransactionFlag = new ContingentTransactionFlagField();

    /**
     * Missing Price (ESMA) / Price Conditions (FCA), PNDG or NOAP.
     */
    private final MissingPricePriceConditionsField missingPricePriceConditions = new MissingPricePriceConditionsField();

    /**
     * CLSE for a benchmark transaction executed at the market closing price.
     */
    private final MarketClosingPriceFlagField marketClosingPriceFlag = new MarketClosingPriceFlagField();

    /**
     * NTLS for a negotiated trade larger than LIS brought onto a venue.
     */
    private final NtLargeInScaleFlagField ntLargeInScaleFlag = new NtLargeInScaleFlagField();

    /**
     * NETW for a negotiated trade with a pre trade transparency waiver.
     */
    private final NtPreTradeTransparencyFlagField ntPreTradeTransparencyFlag = new NtPreTradeTransparencyFlagField();

    /**
     * Start date of the contract. Blank if not applicable.
     */
    private final EffectiveDateOfTheContractField effectiveDateOfTheContract = new EffectiveDateOfTheContractField();

    /**
     * Termination date of the financial instrument's contract. Blank if not applicable.
     */
    private final MaturityDateOfTheContractField maturityDateOfTheContract = new MaturityDateOfTheContractField();

    /**
     * The spread on the floating leg, limited to a precision of IEEE 754 Double Standard. Blank if not applicable.
     */
    private final SpreadField spread = new SpreadField();

    /**
     * The upfront payment exchanged as part of CDS transactions, limited to a precision of {DECIMAL-19/18}. Blank if not applicable.
     */
    private final UpfrontPaymentField upfrontPayment = new UpfrontPaymentField();

    /**
     * Clearing house which the transaction will be cleared through. Blank if not applicable.
     */
    private final LeiOfClearingHouseField leiOfClearingHouse = new LeiOfClearingHouseField();

    /**
     * MTCH when the trade is a matched principal trade.
     */
    private final MatchedPrincipalTradeFlagField matchedPrincipalTradeFlag = new MatchedPrincipalTradeFlagField();

    /**
     * ESMA standard deferral flag.
     */
    private final EsmaStandardDeferralFlagsField esmaStandardDeferralFlags = new EsmaStandardDeferralFlagsField();

    /**
     * NEGO when the trade is a negotiation trade.
     */
    private final NegotiationTradeFlagField negotiationTradeFlag = new NegotiationTradeFlagField();

    /**
     * ESMA supplementary deferral flag.
     */
    private final EsmaSupplementaryDeferralFlagsField esmaSupplementaryDeferralFlags = new EsmaSupplementaryDeferralFlagsField();

    /**
     * Type of trading system on which the transaction was executed. Blank if not specified in the underlying trade report or Venue of Execution is populated with SINT or XOFF.
     */
    private final TradingSystemField tradingSystem = new TradingSystemField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, transactionIdentificationCode, totalNumberOfTransactions, sourceVenue, price, quantity, tradingDateAndTime, instrumentIdentificationCodeType, instrumentIdentificationCode, priceNotation, priceMajorCurrencyPriceCurrency, notionalAmount, notionalCurrency, venueOfExecution, publicationDateAndTime, benchmarkTransactionFlag, agencyCrossTradeFlag, nonPriceFormingTransactionsFlag, nonPriceContributionToDiscovery, specialDividendFlag, ptDeferralReasonFlag, referencePriceTransactionFlag, ntLiquidityFlag, ntPriceConditionsFlag, algoTransactionFlag, ptIlliquidFlag, priceImprovementFlag, cancellationFlag, amendmentFlag, duplicateFlag, exchangeForPhysicalsFlag, limitedDetailsFlag, ldFullDetailsFlag, dailyAggregatedTransactionFlag, daFullDetailsFlag, volumeOmissionFlag, voFullDetailsFlag, fourWeeksAggregationFlag, faFullDetailsFlag, indefiniteAggregationFlag, volumeOmissionForSovereignDebtFlag, consecutiveAggregationFlag, venueType, venueBookDefinitionId, notationOfTheQuantityInMeasurementUnit, quantityInMeasurementUnit, transactionToBeCleared, emissionAllowanceType, venueOfPublication, marketMechanism, tradingMode, transactionCategory, negotiationIndicator, agencyCrossIndicator, modificationIndicator, referencePriceIndicator, specialDividendIndicator, offBookAutomatedIndicator, priceFormationIndicator, algorithmicIndicator, postTradeDeferralReason, deferralEnrichmentType, duplicativeIndicator, thirdCountryTradingVenueOfExecution, portfolioTransactionFlag, contingentTransactionFlag, missingPricePriceConditions, marketClosingPriceFlag, ntLargeInScaleFlag, ntPreTradeTransparencyFlag, effectiveDateOfTheContract, maturityDateOfTheContract, spread, upfrontPayment, leiOfClearingHouse, matchedPrincipalTradeFlag, esmaStandardDeferralFlags, negotiationTradeFlag, esmaSupplementaryDeferralFlags, tradingSystem);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * A unique trade identifier. The value will be right aligned.
     *
     * @return the TransactionIdentificationCode field
     */
    public TransactionIdentificationCodeField transactionIdentificationCode() {
        return transactionIdentificationCode;
    }

    /**
     * Total Number of Transactions of aggregated trade.
     *
     * @return the TotalNumberOfTransactions field
     */
    public TotalNumberOfTransactionsField totalNumberOfTransactions() {
        return totalNumberOfTransactions;
    }

    /**
     * Venue from which market data is received for the instrument.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * The trade price, limited to a precision of {DECIMAL-19/18}. Will be set to default value (20 spaces) if there is a pending price (PNDG). In case of transactions under ESMA jurisdiction, will be set to default value (20 spaces) if price is not available (NOAP).
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The number of units of the financial instrument or the number of derivative contracts in the trade, limited to a precision of {DECIMAL-19/18}. Will be set to default value (20 spaces) if quantity is not available. In case of transactions under FCA jurisdiction, will be set to default value (20 spaces) if the traded security is a bond.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Date and time when the transaction was executed or agreed upon. If a trade is cancelled or amended, this field will contain the trading date and time of the original trade. Blank for aggregated publications: DATF, FWAF, IDAF, COAF, AGFW.
     *
     * @return the TradingDateAndTime field
     */
    public TradingDateAndTimeField tradingDateAndTime() {
        return tradingDateAndTime;
    }

    /**
     * Type of the instrument identification code.
     *
     * @return the InstrumentIdentificationCodeType field
     */
    public InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType() {
        return instrumentIdentificationCodeType;
    }

    /**
     * Instrument identification number (UPI or ISIN code).
     *
     * @return the InstrumentIdentificationCode field
     */
    public InstrumentIdentificationCodeField instrumentIdentificationCode() {
        return instrumentIdentificationCode;
    }

    /**
     * Indicates if the price is expressed in monetary value, in percentage or yield. Will be set to default value (4 spaces) if not available.
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Major currency in which the price is expressed (applicable if the price is expressed as monetary value). Currency Code as per ISO 4217. Price Major Currency (FCA 2017/587) / Price Currency (ESMA, FCA 2017/583).
     *
     * @return the PriceMajorCurrencyPriceCurrency field
     */
    public PriceMajorCurrencyPriceCurrencyField priceMajorCurrencyPriceCurrency() {
        return priceMajorCurrencyPriceCurrency;
    }

    /**
     * Notional value relevant to the security, limited to a precision of {DECIMAL-19/18}.
     *
     * @return the NotionalAmount field
     */
    public NotionalAmountField notionalAmount() {
        return notionalAmount;
    }

    /**
     * Major currency in which the notional amount is denominated.
     *
     * @return the NotionalCurrency field
     */
    public NotionalCurrencyField notionalCurrency() {
        return notionalCurrency;
    }

    /**
     * Identification of the venue where the transaction was executed. XOFF = OTC, SINT = Systematic Internaliser, or the MIC corresponding to the relevant RM/MTF/OTF.
     *
     * @return the VenueOfExecution field
     */
    public VenueOfExecutionField venueOfExecution() {
        return venueOfExecution;
    }

    /**
     * Date and time when the transaction was published.
     *
     * @return the PublicationDateAndTime field
     */
    public PublicationDateAndTimeField publicationDateAndTime() {
        return publicationDateAndTime;
    }

    /**
     * BENC when the trade is a benchmark trade.
     *
     * @return the BenchmarkTransactionFlag field
     */
    public BenchmarkTransactionFlagField benchmarkTransactionFlag() {
        return benchmarkTransactionFlag;
    }

    /**
     * ACTX when the trade is an agency cross trade.
     *
     * @return the AgencyCrossTradeFlag field
     */
    public AgencyCrossTradeFlagField agencyCrossTradeFlag() {
        return agencyCrossTradeFlag;
    }

    /**
     * NPFT when the trade is a non-price forming trade.
     *
     * @return the NonPriceFormingTransactionsFlag field
     */
    public NonPriceFormingTransactionsFlagField nonPriceFormingTransactionsFlag() {
        return nonPriceFormingTransactionsFlag;
    }

    /**
     * TNCP when the trade does not contribute to the price discovery process.
     *
     * @return the NonPriceContributionToDiscovery field
     */
    public NonPriceContributionToDiscoveryField nonPriceContributionToDiscovery() {
        return nonPriceContributionToDiscovery;
    }

    /**
     * SDIV when the trade is a special dividend trade.
     *
     * @return the SpecialDividendFlag field
     */
    public SpecialDividendFlagField specialDividendFlag() {
        return specialDividendFlag;
    }

    /**
     * Post trade deferral reason, SIZE or LRGS.
     *
     * @return the PtDeferralReasonFlag field
     */
    public PtDeferralReasonFlagField ptDeferralReasonFlag() {
        return ptDeferralReasonFlag;
    }

    /**
     * RFPT when the trade is a reference price trade.
     *
     * @return the ReferencePriceTransactionFlag field
     */
    public ReferencePriceTransactionFlagField referencePriceTransactionFlag() {
        return referencePriceTransactionFlag;
    }

    /**
     * Negotiated trade liquidity indication, NLIQ or OILQ.
     *
     * @return the NtLiquidityFlag field
     */
    public NtLiquidityFlagField ntLiquidityFlag() {
        return ntLiquidityFlag;
    }

    /**
     * PRIC when the negotiated trade is subject to conditions other than the current market price.
     *
     * @return the NtPriceConditionsFlag field
     */
    public NtPriceConditionsFlagField ntPriceConditionsFlag() {
        return ntPriceConditionsFlag;
    }

    /**
     * ALGO when the trade is an algorithmic trade.
     *
     * @return the AlgoTransactionFlag field
     */
    public AlgoTransactionFlagField algoTransactionFlag() {
        return algoTransactionFlag;
    }

    /**
     * ILQD when publication is deferred for an illiquid instrument.
     *
     * @return the PtIlliquidFlag field
     */
    public PtIlliquidFlagField ptIlliquidFlag() {
        return ptIlliquidFlag;
    }

    /**
     * RPRI when the trade has received price improvement.
     *
     * @return the PriceImprovementFlag field
     */
    public PriceImprovementFlagField priceImprovementFlag() {
        return priceImprovementFlag;
    }

    /**
     * CANC when the trade is a cancellation.
     *
     * @return the CancellationFlag field
     */
    public CancellationFlagField cancellationFlag() {
        return cancellationFlag;
    }

    /**
     * AMND when the trade is an amendment.
     *
     * @return the AmendmentFlag field
     */
    public AmendmentFlagField amendmentFlag() {
        return amendmentFlag;
    }

    /**
     * DUPL when the trade report is duplicative.
     *
     * @return the DuplicateFlag field
     */
    public DuplicateFlagField duplicateFlag() {
        return duplicateFlag;
    }

    /**
     * Package or exchange for physicals trade, TPAC or XFPH.
     *
     * @return the ExchangeForPhysicalsFlag field
     */
    public ExchangeForPhysicalsFlagField exchangeForPhysicalsFlag() {
        return exchangeForPhysicalsFlag;
    }

    /**
     * LMTF when the trade is a limited details trade.
     *
     * @return the LimitedDetailsFlag field
     */
    public LimitedDetailsFlagField limitedDetailsFlag() {
        return limitedDetailsFlag;
    }

    /**
     * FULF for full details of an earlier limited details trade.
     *
     * @return the LdFullDetailsFlag field
     */
    public LdFullDetailsFlagField ldFullDetailsFlag() {
        return ldFullDetailsFlag;
    }

    /**
     * DATF when the trade is a daily aggregated trade.
     *
     * @return the DailyAggregatedTransactionFlag field
     */
    public DailyAggregatedTransactionFlagField dailyAggregatedTransactionFlag() {
        return dailyAggregatedTransactionFlag;
    }

    /**
     * FULA for full details of an earlier daily aggregated trade.
     *
     * @return the DaFullDetailsFlag field
     */
    public DaFullDetailsFlagField daFullDetailsFlag() {
        return daFullDetailsFlag;
    }

    /**
     * VOLO when the trade is a volume omission trade.
     *
     * @return the VolumeOmissionFlag field
     */
    public VolumeOmissionFlagField volumeOmissionFlag() {
        return volumeOmissionFlag;
    }

    /**
     * FULV for full details of an earlier volume omission trade.
     *
     * @return the VoFullDetailsFlag field
     */
    public VoFullDetailsFlagField voFullDetailsFlag() {
        return voFullDetailsFlag;
    }

    /**
     * FWAF when the trade is a four weeks aggregation trade.
     *
     * @return the FourWeeksAggregationFlag field
     */
    public FourWeeksAggregationFlagField fourWeeksAggregationFlag() {
        return fourWeeksAggregationFlag;
    }

    /**
     * FULJ for full details of an earlier four weeks aggregation trade.
     *
     * @return the FaFullDetailsFlag field
     */
    public FaFullDetailsFlagField faFullDetailsFlag() {
        return faFullDetailsFlag;
    }

    /**
     * IDAF when the trade is an indefinite aggregation trade.
     *
     * @return the IndefiniteAggregationFlag field
     */
    public IndefiniteAggregationFlagField indefiniteAggregationFlag() {
        return indefiniteAggregationFlag;
    }

    /**
     * VOLW for a volume omission trade eligible for subsequent enrichment in aggregated form.
     *
     * @return the VolumeOmissionForSovereignDebtFlag field
     */
    public VolumeOmissionForSovereignDebtFlagField volumeOmissionForSovereignDebtFlag() {
        return volumeOmissionForSovereignDebtFlag;
    }

    /**
     * COAF for full details in aggregated form of an earlier volume omission trade.
     *
     * @return the ConsecutiveAggregationFlag field
     */
    public ConsecutiveAggregationFlagField consecutiveAggregationFlag() {
        return consecutiveAggregationFlag;
    }

    /**
     * Type sent by the venue.
     *
     * @return the VenueType field
     */
    public VenueTypeField venueType() {
        return venueType;
    }

    /**
     * Book Definition ID sent by the venue.
     *
     * @return the VenueBookDefinitionId field
     */
    public VenueBookDefinitionIdField venueBookDefinitionId() {
        return venueBookDefinitionId;
    }

    /**
     * Indication of measurement units used to represent the value in the Quantity in Measurement Unit.
     *
     * @return the NotationOfTheQuantityInMeasurementUnit field
     */
    public NotationOfTheQuantityInMeasurementUnitField notationOfTheQuantityInMeasurementUnit() {
        return notationOfTheQuantityInMeasurementUnit;
    }

    /**
     * The Quantity in Measurement Unit, limited to a precision of IEEE 754 Double Standard.
     *
     * @return the QuantityInMeasurementUnit field
     */
    public QuantityInMeasurementUnitField quantityInMeasurementUnit() {
        return quantityInMeasurementUnit;
    }

    /**
     * Identifies if the firm intends to clear the transaction. ESMA field for derivatives. Blank if not applicable.
     *
     * @return the TransactionToBeCleared field
     */
    public TransactionToBeClearedField transactionToBeCleared() {
        return transactionToBeCleared;
    }

    /**
     * Emission Allowance Type. Blank if not applicable.
     *
     * @return the EmissionAllowanceType field
     */
    public EmissionAllowanceTypeField emissionAllowanceType() {
        return emissionAllowanceType;
    }

    /**
     * Identification of the regulatory regime under which the transaction was published. The value sent by the source venue is passed on. ECHO = UK APA Regulation, ECEU = EU APA Regulation, or the MIC corresponding to the relevant RM/MTF/OTF.
     *
     * @return the VenueOfPublication field
     */
    public VenueOfPublicationField venueOfPublication() {
        return venueOfPublication;
    }

    /**
     * Market mechanism on which the transaction was executed.
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Trading mode in which the transaction was executed.
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
    }

    /**
     * Transaction category short code.
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Negotiation indicator short code.
     *
     * @return the NegotiationIndicator field
     */
    public NegotiationIndicatorField negotiationIndicator() {
        return negotiationIndicator;
    }

    /**
     * Agency cross indicator short code.
     *
     * @return the AgencyCrossIndicator field
     */
    public AgencyCrossIndicatorField agencyCrossIndicator() {
        return agencyCrossIndicator;
    }

    /**
     * Modification indicator short code.
     *
     * @return the ModificationIndicator field
     */
    public ModificationIndicatorField modificationIndicator() {
        return modificationIndicator;
    }

    /**
     * Reference price indicator short code.
     *
     * @return the ReferencePriceIndicator field
     */
    public ReferencePriceIndicatorField referencePriceIndicator() {
        return referencePriceIndicator;
    }

    /**
     * Special dividend indicator short code.
     *
     * @return the SpecialDividendIndicator field
     */
    public SpecialDividendIndicatorField specialDividendIndicator() {
        return specialDividendIndicator;
    }

    /**
     * Off book automated indicator.
     *
     * @return the OffBookAutomatedIndicator field
     */
    public OffBookAutomatedIndicatorField offBookAutomatedIndicator() {
        return offBookAutomatedIndicator;
    }

    /**
     * Price formation indicator short code.
     *
     * @return the PriceFormationIndicator field
     */
    public PriceFormationIndicatorField priceFormationIndicator() {
        return priceFormationIndicator;
    }

    /**
     * Algorithmic indicator short code.
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Post trade deferral reason short code.
     *
     * @return the PostTradeDeferralReason field
     */
    public PostTradeDeferralReasonField postTradeDeferralReason() {
        return postTradeDeferralReason;
    }

    /**
     * Deferral or enrichment type short code.
     *
     * @return the DeferralEnrichmentType field
     */
    public DeferralEnrichmentTypeField deferralEnrichmentType() {
        return deferralEnrichmentType;
    }

    /**
     * Duplicative indicator short code.
     *
     * @return the DuplicativeIndicator field
     */
    public DuplicativeIndicatorField duplicativeIndicator() {
        return duplicativeIndicator;
    }

    /**
     * Identification of the third-country trading venue where the transaction was executed.
     *
     * @return the ThirdCountryTradingVenueOfExecution field
     */
    public ThirdCountryTradingVenueOfExecutionField thirdCountryTradingVenueOfExecution() {
        return thirdCountryTradingVenueOfExecution;
    }

    /**
     * PORT when the trade is a portfolio trade.
     *
     * @return the PortfolioTransactionFlag field
     */
    public PortfolioTransactionFlagField portfolioTransactionFlag() {
        return portfolioTransactionFlag;
    }

    /**
     * CONT when the trade is a contingent trade.
     *
     * @return the ContingentTransactionFlag field
     */
    public ContingentTransactionFlagField contingentTransactionFlag() {
        return contingentTransactionFlag;
    }

    /**
     * Missing Price (ESMA) / Price Conditions (FCA), PNDG or NOAP.
     *
     * @return the MissingPricePriceConditions field
     */
    public MissingPricePriceConditionsField missingPricePriceConditions() {
        return missingPricePriceConditions;
    }

    /**
     * CLSE for a benchmark transaction executed at the market closing price.
     *
     * @return the MarketClosingPriceFlag field
     */
    public MarketClosingPriceFlagField marketClosingPriceFlag() {
        return marketClosingPriceFlag;
    }

    /**
     * NTLS for a negotiated trade larger than LIS brought onto a venue.
     *
     * @return the NtLargeInScaleFlag field
     */
    public NtLargeInScaleFlagField ntLargeInScaleFlag() {
        return ntLargeInScaleFlag;
    }

    /**
     * NETW for a negotiated trade with a pre trade transparency waiver.
     *
     * @return the NtPreTradeTransparencyFlag field
     */
    public NtPreTradeTransparencyFlagField ntPreTradeTransparencyFlag() {
        return ntPreTradeTransparencyFlag;
    }

    /**
     * Start date of the contract. Blank if not applicable.
     *
     * @return the EffectiveDateOfTheContract field
     */
    public EffectiveDateOfTheContractField effectiveDateOfTheContract() {
        return effectiveDateOfTheContract;
    }

    /**
     * Termination date of the financial instrument's contract. Blank if not applicable.
     *
     * @return the MaturityDateOfTheContract field
     */
    public MaturityDateOfTheContractField maturityDateOfTheContract() {
        return maturityDateOfTheContract;
    }

    /**
     * The spread on the floating leg, limited to a precision of IEEE 754 Double Standard. Blank if not applicable.
     *
     * @return the Spread field
     */
    public SpreadField spread() {
        return spread;
    }

    /**
     * The upfront payment exchanged as part of CDS transactions, limited to a precision of {DECIMAL-19/18}. Blank if not applicable.
     *
     * @return the UpfrontPayment field
     */
    public UpfrontPaymentField upfrontPayment() {
        return upfrontPayment;
    }

    /**
     * Clearing house which the transaction will be cleared through. Blank if not applicable.
     *
     * @return the LeiOfClearingHouse field
     */
    public LeiOfClearingHouseField leiOfClearingHouse() {
        return leiOfClearingHouse;
    }

    /**
     * MTCH when the trade is a matched principal trade.
     *
     * @return the MatchedPrincipalTradeFlag field
     */
    public MatchedPrincipalTradeFlagField matchedPrincipalTradeFlag() {
        return matchedPrincipalTradeFlag;
    }

    /**
     * ESMA standard deferral flag.
     *
     * @return the EsmaStandardDeferralFlags field
     */
    public EsmaStandardDeferralFlagsField esmaStandardDeferralFlags() {
        return esmaStandardDeferralFlags;
    }

    /**
     * NEGO when the trade is a negotiation trade.
     *
     * @return the NegotiationTradeFlag field
     */
    public NegotiationTradeFlagField negotiationTradeFlag() {
        return negotiationTradeFlag;
    }

    /**
     * ESMA supplementary deferral flag.
     *
     * @return the EsmaSupplementaryDeferralFlags field
     */
    public EsmaSupplementaryDeferralFlagsField esmaSupplementaryDeferralFlags() {
        return esmaSupplementaryDeferralFlags;
    }

    /**
     * Type of trading system on which the transaction was executed. Blank if not specified in the underlying trade report or Venue of Execution is populated with SINT or XOFF.
     *
     * @return the TradingSystem field
     */
    public TradingSystemField tradingSystem() {
        return tradingSystem;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!transactionIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdentificationCodeField.BYTE_LENGTH;
        if (!totalNumberOfTransactions.parse(data, cursor)) {
            return false;
        }
        cursor += TotalNumberOfTransactionsField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!tradingDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradingDateAndTimeField.BYTE_LENGTH;
        if (!instrumentIdentificationCodeType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdentificationCodeTypeField.BYTE_LENGTH;
        if (!instrumentIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdentificationCodeField.BYTE_LENGTH;
        if (!priceNotation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNotationField.BYTE_LENGTH;
        if (!priceMajorCurrencyPriceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMajorCurrencyPriceCurrencyField.BYTE_LENGTH;
        if (!notionalAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalAmountField.BYTE_LENGTH;
        if (!notionalCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalCurrencyField.BYTE_LENGTH;
        if (!venueOfExecution.parse(data, cursor)) {
            return false;
        }
        cursor += VenueOfExecutionField.BYTE_LENGTH;
        if (!publicationDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationDateAndTimeField.BYTE_LENGTH;
        if (!benchmarkTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += BenchmarkTransactionFlagField.BYTE_LENGTH;
        if (!agencyCrossTradeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AgencyCrossTradeFlagField.BYTE_LENGTH;
        if (!nonPriceFormingTransactionsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NonPriceFormingTransactionsFlagField.BYTE_LENGTH;
        if (!nonPriceContributionToDiscovery.parse(data, cursor)) {
            return false;
        }
        cursor += NonPriceContributionToDiscoveryField.BYTE_LENGTH;
        if (!specialDividendFlag.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialDividendFlagField.BYTE_LENGTH;
        if (!ptDeferralReasonFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PtDeferralReasonFlagField.BYTE_LENGTH;
        if (!referencePriceTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceTransactionFlagField.BYTE_LENGTH;
        if (!ntLiquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NtLiquidityFlagField.BYTE_LENGTH;
        if (!ntPriceConditionsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NtPriceConditionsFlagField.BYTE_LENGTH;
        if (!algoTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoTransactionFlagField.BYTE_LENGTH;
        if (!ptIlliquidFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PtIlliquidFlagField.BYTE_LENGTH;
        if (!priceImprovementFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PriceImprovementFlagField.BYTE_LENGTH;
        if (!cancellationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CancellationFlagField.BYTE_LENGTH;
        if (!amendmentFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AmendmentFlagField.BYTE_LENGTH;
        if (!duplicateFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DuplicateFlagField.BYTE_LENGTH;
        if (!exchangeForPhysicalsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeForPhysicalsFlagField.BYTE_LENGTH;
        if (!limitedDetailsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LimitedDetailsFlagField.BYTE_LENGTH;
        if (!ldFullDetailsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LdFullDetailsFlagField.BYTE_LENGTH;
        if (!dailyAggregatedTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DailyAggregatedTransactionFlagField.BYTE_LENGTH;
        if (!daFullDetailsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DaFullDetailsFlagField.BYTE_LENGTH;
        if (!volumeOmissionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeOmissionFlagField.BYTE_LENGTH;
        if (!voFullDetailsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += VoFullDetailsFlagField.BYTE_LENGTH;
        if (!fourWeeksAggregationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += FourWeeksAggregationFlagField.BYTE_LENGTH;
        if (!faFullDetailsFlag.parse(data, cursor)) {
            return false;
        }
        cursor += FaFullDetailsFlagField.BYTE_LENGTH;
        if (!indefiniteAggregationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += IndefiniteAggregationFlagField.BYTE_LENGTH;
        if (!volumeOmissionForSovereignDebtFlag.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeOmissionForSovereignDebtFlagField.BYTE_LENGTH;
        if (!consecutiveAggregationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ConsecutiveAggregationFlagField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!venueType.parse(data, cursor)) {
            return false;
        }
        cursor += VenueTypeField.BYTE_LENGTH;
        if (!venueBookDefinitionId.parse(data, cursor)) {
            return false;
        }
        cursor += VenueBookDefinitionIdField.BYTE_LENGTH;
        if (!notationOfTheQuantityInMeasurementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += NotationOfTheQuantityInMeasurementUnitField.BYTE_LENGTH;
        if (!quantityInMeasurementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityInMeasurementUnitField.BYTE_LENGTH;
        if (!transactionToBeCleared.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionToBeClearedField.BYTE_LENGTH;
        if (!emissionAllowanceType.parse(data, cursor)) {
            return false;
        }
        cursor += EmissionAllowanceTypeField.BYTE_LENGTH;
        if (!venueOfPublication.parse(data, cursor)) {
            return false;
        }
        cursor += VenueOfPublicationField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!tradingMode.parse(data, cursor)) {
            return false;
        }
        cursor += TradingModeField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!negotiationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIndicatorField.BYTE_LENGTH;
        if (!agencyCrossIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AgencyCrossIndicatorField.BYTE_LENGTH;
        if (!modificationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ModificationIndicatorField.BYTE_LENGTH;
        if (!referencePriceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceIndicatorField.BYTE_LENGTH;
        if (!specialDividendIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialDividendIndicatorField.BYTE_LENGTH;
        if (!offBookAutomatedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OffBookAutomatedIndicatorField.BYTE_LENGTH;
        if (!priceFormationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFormationIndicatorField.BYTE_LENGTH;
        if (!algorithmicIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        if (!postTradeDeferralReason.parse(data, cursor)) {
            return false;
        }
        cursor += PostTradeDeferralReasonField.BYTE_LENGTH;
        if (!deferralEnrichmentType.parse(data, cursor)) {
            return false;
        }
        cursor += DeferralEnrichmentTypeField.BYTE_LENGTH;
        if (!duplicativeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DuplicativeIndicatorField.BYTE_LENGTH;
        if (!thirdCountryTradingVenueOfExecution.parse(data, cursor)) {
            return false;
        }
        cursor += ThirdCountryTradingVenueOfExecutionField.BYTE_LENGTH;
        if (!portfolioTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PortfolioTransactionFlagField.BYTE_LENGTH;
        if (!contingentTransactionFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ContingentTransactionFlagField.BYTE_LENGTH;
        if (!missingPricePriceConditions.parse(data, cursor)) {
            return false;
        }
        cursor += MissingPricePriceConditionsField.BYTE_LENGTH;
        if (!marketClosingPriceFlag.parse(data, cursor)) {
            return false;
        }
        cursor += MarketClosingPriceFlagField.BYTE_LENGTH;
        if (!ntLargeInScaleFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NtLargeInScaleFlagField.BYTE_LENGTH;
        if (!ntPreTradeTransparencyFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NtPreTradeTransparencyFlagField.BYTE_LENGTH;
        if (!effectiveDateOfTheContract.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveDateOfTheContractField.BYTE_LENGTH;
        if (!maturityDateOfTheContract.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateOfTheContractField.BYTE_LENGTH;
        if (!spread.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadField.BYTE_LENGTH;
        if (!upfrontPayment.parse(data, cursor)) {
            return false;
        }
        cursor += UpfrontPaymentField.BYTE_LENGTH;
        if (!leiOfClearingHouse.parse(data, cursor)) {
            return false;
        }
        cursor += LeiOfClearingHouseField.BYTE_LENGTH;
        if (!matchedPrincipalTradeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += MatchedPrincipalTradeFlagField.BYTE_LENGTH;
        if (!esmaStandardDeferralFlags.parse(data, cursor)) {
            return false;
        }
        cursor += EsmaStandardDeferralFlagsField.BYTE_LENGTH;
        if (!negotiationTradeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationTradeFlagField.BYTE_LENGTH;
        if (!esmaSupplementaryDeferralFlags.parse(data, cursor)) {
            return false;
        }
        cursor += EsmaSupplementaryDeferralFlagsField.BYTE_LENGTH;
        return tradingSystem.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = transactionIdentificationCode.encode(data, cursor);
        cursor = totalNumberOfTransactions.encode(data, cursor);
        if (buffer != null && buffer.length >= 80) {
            System.arraycopy(buffer, 72, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = sourceVenue.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = tradingDateAndTime.encode(data, cursor);
        cursor = instrumentIdentificationCodeType.encode(data, cursor);
        cursor = instrumentIdentificationCode.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = priceMajorCurrencyPriceCurrency.encode(data, cursor);
        cursor = notionalAmount.encode(data, cursor);
        cursor = notionalCurrency.encode(data, cursor);
        cursor = venueOfExecution.encode(data, cursor);
        cursor = publicationDateAndTime.encode(data, cursor);
        cursor = benchmarkTransactionFlag.encode(data, cursor);
        cursor = agencyCrossTradeFlag.encode(data, cursor);
        cursor = nonPriceFormingTransactionsFlag.encode(data, cursor);
        cursor = nonPriceContributionToDiscovery.encode(data, cursor);
        cursor = specialDividendFlag.encode(data, cursor);
        cursor = ptDeferralReasonFlag.encode(data, cursor);
        cursor = referencePriceTransactionFlag.encode(data, cursor);
        cursor = ntLiquidityFlag.encode(data, cursor);
        cursor = ntPriceConditionsFlag.encode(data, cursor);
        cursor = algoTransactionFlag.encode(data, cursor);
        cursor = ptIlliquidFlag.encode(data, cursor);
        cursor = priceImprovementFlag.encode(data, cursor);
        cursor = cancellationFlag.encode(data, cursor);
        cursor = amendmentFlag.encode(data, cursor);
        cursor = duplicateFlag.encode(data, cursor);
        cursor = exchangeForPhysicalsFlag.encode(data, cursor);
        cursor = limitedDetailsFlag.encode(data, cursor);
        cursor = ldFullDetailsFlag.encode(data, cursor);
        cursor = dailyAggregatedTransactionFlag.encode(data, cursor);
        cursor = daFullDetailsFlag.encode(data, cursor);
        cursor = volumeOmissionFlag.encode(data, cursor);
        cursor = voFullDetailsFlag.encode(data, cursor);
        cursor = fourWeeksAggregationFlag.encode(data, cursor);
        cursor = faFullDetailsFlag.encode(data, cursor);
        cursor = indefiniteAggregationFlag.encode(data, cursor);
        cursor = volumeOmissionForSovereignDebtFlag.encode(data, cursor);
        cursor = consecutiveAggregationFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 335) {
            System.arraycopy(buffer, 334, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = venueType.encode(data, cursor);
        cursor = venueBookDefinitionId.encode(data, cursor);
        cursor = notationOfTheQuantityInMeasurementUnit.encode(data, cursor);
        cursor = quantityInMeasurementUnit.encode(data, cursor);
        cursor = transactionToBeCleared.encode(data, cursor);
        cursor = emissionAllowanceType.encode(data, cursor);
        cursor = venueOfPublication.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = tradingMode.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = negotiationIndicator.encode(data, cursor);
        cursor = agencyCrossIndicator.encode(data, cursor);
        cursor = modificationIndicator.encode(data, cursor);
        cursor = referencePriceIndicator.encode(data, cursor);
        cursor = specialDividendIndicator.encode(data, cursor);
        cursor = offBookAutomatedIndicator.encode(data, cursor);
        cursor = priceFormationIndicator.encode(data, cursor);
        cursor = algorithmicIndicator.encode(data, cursor);
        cursor = postTradeDeferralReason.encode(data, cursor);
        cursor = deferralEnrichmentType.encode(data, cursor);
        cursor = duplicativeIndicator.encode(data, cursor);
        cursor = thirdCountryTradingVenueOfExecution.encode(data, cursor);
        cursor = portfolioTransactionFlag.encode(data, cursor);
        cursor = contingentTransactionFlag.encode(data, cursor);
        cursor = missingPricePriceConditions.encode(data, cursor);
        cursor = marketClosingPriceFlag.encode(data, cursor);
        cursor = ntLargeInScaleFlag.encode(data, cursor);
        cursor = ntPreTradeTransparencyFlag.encode(data, cursor);
        cursor = effectiveDateOfTheContract.encode(data, cursor);
        cursor = maturityDateOfTheContract.encode(data, cursor);
        cursor = spread.encode(data, cursor);
        cursor = upfrontPayment.encode(data, cursor);
        cursor = leiOfClearingHouse.encode(data, cursor);
        cursor = matchedPrincipalTradeFlag.encode(data, cursor);
        cursor = esmaStandardDeferralFlags.encode(data, cursor);
        cursor = negotiationTradeFlag.encode(data, cursor);
        cursor = esmaSupplementaryDeferralFlags.encode(data, cursor);
        cursor = tradingSystem.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "TransactionIdentificationCode" -> Optional.of(transactionIdentificationCode);
            case "TotalNumberOfTransactions" -> Optional.of(totalNumberOfTransactions);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "TradingDateAndTime" -> Optional.of(tradingDateAndTime);
            case "InstrumentIdentificationCodeType" -> Optional.of(instrumentIdentificationCodeType);
            case "InstrumentIdentificationCode" -> Optional.of(instrumentIdentificationCode);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "PriceMajorCurrencyPriceCurrency" -> Optional.of(priceMajorCurrencyPriceCurrency);
            case "NotionalAmount" -> Optional.of(notionalAmount);
            case "NotionalCurrency" -> Optional.of(notionalCurrency);
            case "VenueOfExecution" -> Optional.of(venueOfExecution);
            case "PublicationDateAndTime" -> Optional.of(publicationDateAndTime);
            case "BenchmarkTransactionFlag" -> Optional.of(benchmarkTransactionFlag);
            case "AgencyCrossTradeFlag" -> Optional.of(agencyCrossTradeFlag);
            case "NonPriceFormingTransactionsFlag" -> Optional.of(nonPriceFormingTransactionsFlag);
            case "NonPriceContributionToDiscovery" -> Optional.of(nonPriceContributionToDiscovery);
            case "SpecialDividendFlag" -> Optional.of(specialDividendFlag);
            case "PtDeferralReasonFlag" -> Optional.of(ptDeferralReasonFlag);
            case "ReferencePriceTransactionFlag" -> Optional.of(referencePriceTransactionFlag);
            case "NtLiquidityFlag" -> Optional.of(ntLiquidityFlag);
            case "NtPriceConditionsFlag" -> Optional.of(ntPriceConditionsFlag);
            case "AlgoTransactionFlag" -> Optional.of(algoTransactionFlag);
            case "PtIlliquidFlag" -> Optional.of(ptIlliquidFlag);
            case "PriceImprovementFlag" -> Optional.of(priceImprovementFlag);
            case "CancellationFlag" -> Optional.of(cancellationFlag);
            case "AmendmentFlag" -> Optional.of(amendmentFlag);
            case "DuplicateFlag" -> Optional.of(duplicateFlag);
            case "ExchangeForPhysicalsFlag" -> Optional.of(exchangeForPhysicalsFlag);
            case "LimitedDetailsFlag" -> Optional.of(limitedDetailsFlag);
            case "LdFullDetailsFlag" -> Optional.of(ldFullDetailsFlag);
            case "DailyAggregatedTransactionFlag" -> Optional.of(dailyAggregatedTransactionFlag);
            case "DaFullDetailsFlag" -> Optional.of(daFullDetailsFlag);
            case "VolumeOmissionFlag" -> Optional.of(volumeOmissionFlag);
            case "VoFullDetailsFlag" -> Optional.of(voFullDetailsFlag);
            case "FourWeeksAggregationFlag" -> Optional.of(fourWeeksAggregationFlag);
            case "FaFullDetailsFlag" -> Optional.of(faFullDetailsFlag);
            case "IndefiniteAggregationFlag" -> Optional.of(indefiniteAggregationFlag);
            case "VolumeOmissionForSovereignDebtFlag" -> Optional.of(volumeOmissionForSovereignDebtFlag);
            case "ConsecutiveAggregationFlag" -> Optional.of(consecutiveAggregationFlag);
            case "VenueType" -> Optional.of(venueType);
            case "VenueBookDefinitionId" -> Optional.of(venueBookDefinitionId);
            case "NotationOfTheQuantityInMeasurementUnit" -> Optional.of(notationOfTheQuantityInMeasurementUnit);
            case "QuantityInMeasurementUnit" -> Optional.of(quantityInMeasurementUnit);
            case "TransactionToBeCleared" -> Optional.of(transactionToBeCleared);
            case "EmissionAllowanceType" -> Optional.of(emissionAllowanceType);
            case "VenueOfPublication" -> Optional.of(venueOfPublication);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "TradingMode" -> Optional.of(tradingMode);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "NegotiationIndicator" -> Optional.of(negotiationIndicator);
            case "AgencyCrossIndicator" -> Optional.of(agencyCrossIndicator);
            case "ModificationIndicator" -> Optional.of(modificationIndicator);
            case "ReferencePriceIndicator" -> Optional.of(referencePriceIndicator);
            case "SpecialDividendIndicator" -> Optional.of(specialDividendIndicator);
            case "OffBookAutomatedIndicator" -> Optional.of(offBookAutomatedIndicator);
            case "PriceFormationIndicator" -> Optional.of(priceFormationIndicator);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "PostTradeDeferralReason" -> Optional.of(postTradeDeferralReason);
            case "DeferralEnrichmentType" -> Optional.of(deferralEnrichmentType);
            case "DuplicativeIndicator" -> Optional.of(duplicativeIndicator);
            case "ThirdCountryTradingVenueOfExecution" -> Optional.of(thirdCountryTradingVenueOfExecution);
            case "PortfolioTransactionFlag" -> Optional.of(portfolioTransactionFlag);
            case "ContingentTransactionFlag" -> Optional.of(contingentTransactionFlag);
            case "MissingPricePriceConditions" -> Optional.of(missingPricePriceConditions);
            case "MarketClosingPriceFlag" -> Optional.of(marketClosingPriceFlag);
            case "NtLargeInScaleFlag" -> Optional.of(ntLargeInScaleFlag);
            case "NtPreTradeTransparencyFlag" -> Optional.of(ntPreTradeTransparencyFlag);
            case "EffectiveDateOfTheContract" -> Optional.of(effectiveDateOfTheContract);
            case "MaturityDateOfTheContract" -> Optional.of(maturityDateOfTheContract);
            case "Spread" -> Optional.of(spread);
            case "UpfrontPayment" -> Optional.of(upfrontPayment);
            case "LeiOfClearingHouse" -> Optional.of(leiOfClearingHouse);
            case "MatchedPrincipalTradeFlag" -> Optional.of(matchedPrincipalTradeFlag);
            case "EsmaStandardDeferralFlags" -> Optional.of(esmaStandardDeferralFlags);
            case "NegotiationTradeFlag" -> Optional.of(negotiationTradeFlag);
            case "EsmaSupplementaryDeferralFlags" -> Optional.of(esmaSupplementaryDeferralFlags);
            case "TradingSystem" -> Optional.of(tradingSystem);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MifidIiTradeReportMessage message)) {
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
        if (!(other instanceof MifidIiTradeReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
