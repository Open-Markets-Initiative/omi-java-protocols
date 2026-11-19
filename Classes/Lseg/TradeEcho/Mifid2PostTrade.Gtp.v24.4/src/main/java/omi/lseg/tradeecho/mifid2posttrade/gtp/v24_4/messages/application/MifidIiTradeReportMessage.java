package omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.AgencyCrossIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.AgencyCrossTradeFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.AlgoTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.AlgorithmicIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.AmendmentFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.BenchmarkTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.CancellationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ConsecutiveAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ContingentTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.DaFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.DailyAggregatedTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.DeferralEnrichmentTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.DuplicateFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.DuplicativeIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.EmissionAllowanceTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ExchangeForPhysicalsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.FaFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.FourWeeksAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.IndefiniteAggregationFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.InstrumentField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.InstrumentIdentificationCodeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.InstrumentIdentificationCodeTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.LdFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.LimitedDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.MarketClosingPriceFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.MarketMechanismField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.MiFidPriceField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.MiFidQuantityField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.MiFidTradingDateAndTimeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ModificationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NegotiationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NonPriceContributionToDiscoveryField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NonPriceFormingTransactionsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NotionalAmountField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NotionalCurrencyField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NtLargeInScaleFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NtLiquidityFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NtPreTradeTransparencyFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.NtPriceConditionsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.OffBookAutomatedIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PortfolioTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PostTradeDeferralReasonField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PriceConditionsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PriceCurrencyField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PriceFormationIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PriceImprovementFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PriceNotationField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PtDeferralReasonFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PtIlliquidFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.PublicationDateAndTimeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.QuantityInMeasurementUnitField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ReferencePriceIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ReferencePriceTransactionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.SpecialDividendFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.SpecialDividendIndicatorField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.ThirdCountryTradingVenueOfExecutionField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TimestampField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TotalNumberOfTransactionsField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TradingModeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TransactionCategoryField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TransactionIdentificationCodeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.TransactionToBeClearedField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VenueBookDefinitionIdField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VenueMeasurementUnitNotationField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VenueOfExecutionField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VenueOfPublicationField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VenueTypeField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VoFullDetailsFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VolumeOmissionFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.fields.VolumeOmissionForSovereignDebtFlagField;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.types.Field;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.types.Message;
import omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.types.PrintOptions;

/**
 * Represents the MifidIiTradeReportMessage message from the Mifid2PostTrade protocol.
 *
 * <p>Sent to report the MiFID compliant details of a privately negotiated trade</p>
 */
public final class MifidIiTradeReportMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 433;

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
     * Time the message was generated
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * A unique trade identifier.
     */
    private final TransactionIdentificationCodeField transactionIdentificationCode = new TransactionIdentificationCodeField();

    /**
     * Total Number of Transactions of aggregated trade
     */
    private final TotalNumberOfTransactionsField totalNumberOfTransactions = new TotalNumberOfTransactionsField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * MiFID compliant Price field populated using either Price or Yield. Will be set to default value (20 spaces) if there is a pending price (PNDG)
     */
    private final MiFidPriceField miFidPrice = new MiFidPriceField();

    /**
     * Number of units of the financial instrument. {DECIMAL-18/17}
     */
    private final MiFidQuantityField miFidQuantity = new MiFidQuantityField();

    /**
     * Date and time when the transaction was executed/ agreed upon.
     */
    private final MiFidTradingDateAndTimeField miFidTradingDateAndTime = new MiFidTradingDateAndTimeField();

    /**
     * Instrument Identification Code Type
     */
    private final InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType = new InstrumentIdentificationCodeTypeField();

    /**
     * Instrument identification number (ISIN code).
     */
    private final InstrumentIdentificationCodeField instrumentIdentificationCode = new InstrumentIdentificationCodeField();

    /**
     * Indicates if the price is expressed in monetary value, in percentage or yield.
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Currency Code as per ISO 4217
     */
    private final PriceCurrencyField priceCurrency = new PriceCurrencyField();

    /**
     * Notional value relevant to the security
     */
    private final NotionalAmountField notionalAmount = new NotionalAmountField();

    /**
     * Major currency in which the notional amount is denominated
     */
    private final NotionalCurrencyField notionalCurrency = new NotionalCurrencyField();

    /**
     * Identification of the venue where the transaction was executed
     */
    private final VenueOfExecutionField venueOfExecution = new VenueOfExecutionField();

    /**
     * Date and time when the transaction was published
     */
    private final PublicationDateAndTimeField publicationDateAndTime = new PublicationDateAndTimeField();

    /**
     * Benchmark Transaction Flag
     */
    private final BenchmarkTransactionFlagField benchmarkTransactionFlag = new BenchmarkTransactionFlagField();

    /**
     * Agency Cross Trade Flag
     */
    private final AgencyCrossTradeFlagField agencyCrossTradeFlag = new AgencyCrossTradeFlagField();

    /**
     * Non Price Forming Transactions Flag
     */
    private final NonPriceFormingTransactionsFlagField nonPriceFormingTransactionsFlag = new NonPriceFormingTransactionsFlagField();

    /**
     * Non Price Contribution to Discovery
     */
    private final NonPriceContributionToDiscoveryField nonPriceContributionToDiscovery = new NonPriceContributionToDiscoveryField();

    /**
     * Special Dividend Flag
     */
    private final SpecialDividendFlagField specialDividendFlag = new SpecialDividendFlagField();

    /**
     * PT Deferral Reason Flag
     */
    private final PtDeferralReasonFlagField ptDeferralReasonFlag = new PtDeferralReasonFlagField();

    /**
     * Reference Price Transaction Flag
     */
    private final ReferencePriceTransactionFlagField referencePriceTransactionFlag = new ReferencePriceTransactionFlagField();

    /**
     * NT Liquidity Flag
     */
    private final NtLiquidityFlagField ntLiquidityFlag = new NtLiquidityFlagField();

    /**
     * NT Price Conditions Flag
     */
    private final NtPriceConditionsFlagField ntPriceConditionsFlag = new NtPriceConditionsFlagField();

    /**
     * Algo Transaction Flag
     */
    private final AlgoTransactionFlagField algoTransactionFlag = new AlgoTransactionFlagField();

    /**
     * PT Illiquid Flag
     */
    private final PtIlliquidFlagField ptIlliquidFlag = new PtIlliquidFlagField();

    /**
     * Price Improvement Flag
     */
    private final PriceImprovementFlagField priceImprovementFlag = new PriceImprovementFlagField();

    /**
     * Cancellation Flag
     */
    private final CancellationFlagField cancellationFlag = new CancellationFlagField();

    /**
     * Amendment Flag
     */
    private final AmendmentFlagField amendmentFlag = new AmendmentFlagField();

    /**
     * Duplicate Flag
     */
    private final DuplicateFlagField duplicateFlag = new DuplicateFlagField();

    /**
     * Exchange For Physicals Flag
     */
    private final ExchangeForPhysicalsFlagField exchangeForPhysicalsFlag = new ExchangeForPhysicalsFlagField();

    /**
     * Limited Details Flag
     */
    private final LimitedDetailsFlagField limitedDetailsFlag = new LimitedDetailsFlagField();

    /**
     * LD Full Details Flag
     */
    private final LdFullDetailsFlagField ldFullDetailsFlag = new LdFullDetailsFlagField();

    /**
     * Daily Aggregated Transaction Flag
     */
    private final DailyAggregatedTransactionFlagField dailyAggregatedTransactionFlag = new DailyAggregatedTransactionFlagField();

    /**
     * DA Full Details Flag
     */
    private final DaFullDetailsFlagField daFullDetailsFlag = new DaFullDetailsFlagField();

    /**
     * Volume Omission Flag
     */
    private final VolumeOmissionFlagField volumeOmissionFlag = new VolumeOmissionFlagField();

    /**
     * VO Full Details Flag
     */
    private final VoFullDetailsFlagField voFullDetailsFlag = new VoFullDetailsFlagField();

    /**
     * Four Weeks Aggregation Flag
     */
    private final FourWeeksAggregationFlagField fourWeeksAggregationFlag = new FourWeeksAggregationFlagField();

    /**
     * FA Full Details Flag
     */
    private final FaFullDetailsFlagField faFullDetailsFlag = new FaFullDetailsFlagField();

    /**
     * Indefinite Aggregation Flag
     */
    private final IndefiniteAggregationFlagField indefiniteAggregationFlag = new IndefiniteAggregationFlagField();

    /**
     * Volume Omission For Sovereign Debt Flag
     */
    private final VolumeOmissionForSovereignDebtFlagField volumeOmissionForSovereignDebtFlag = new VolumeOmissionForSovereignDebtFlagField();

    /**
     * Consecutive Aggregation Flag
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
     * Notation of the Quantity in Measurement Unit.
     */
    private final VenueMeasurementUnitNotationField venueMeasurementUnitNotation = new VenueMeasurementUnitNotationField();

    /**
     * The Quantity in Measurement Unit.
     */
    private final QuantityInMeasurementUnitField quantityInMeasurementUnit = new QuantityInMeasurementUnitField();

    /**
     * Identifies if the firm intends to clear the transaction. ESMA field for derivatives.
     */
    private final TransactionToBeClearedField transactionToBeCleared = new TransactionToBeClearedField();

    /**
     * Emission Allowance Type.
     */
    private final EmissionAllowanceTypeField emissionAllowanceType = new EmissionAllowanceTypeField();

    /**
     * Identification of the regulatory regime under which the transaction was published. The value sent by the source venue is passed on.
     */
    private final VenueOfPublicationField venueOfPublication = new VenueOfPublicationField();

    /**
     * Market Mechanism
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Trading Mode
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Negotiation Indicator
     */
    private final NegotiationIndicatorField negotiationIndicator = new NegotiationIndicatorField();

    /**
     * Agency Cross Indicator
     */
    private final AgencyCrossIndicatorField agencyCrossIndicator = new AgencyCrossIndicatorField();

    /**
     * Modification Indicator
     */
    private final ModificationIndicatorField modificationIndicator = new ModificationIndicatorField();

    /**
     * Reference Price Indicator
     */
    private final ReferencePriceIndicatorField referencePriceIndicator = new ReferencePriceIndicatorField();

    /**
     * Special Dividend Indicator
     */
    private final SpecialDividendIndicatorField specialDividendIndicator = new SpecialDividendIndicatorField();

    /**
     * Off Book Automated Indicator
     */
    private final OffBookAutomatedIndicatorField offBookAutomatedIndicator = new OffBookAutomatedIndicatorField();

    /**
     * Price Formation Indicator
     */
    private final PriceFormationIndicatorField priceFormationIndicator = new PriceFormationIndicatorField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Post-Trade Deferral Reason
     */
    private final PostTradeDeferralReasonField postTradeDeferralReason = new PostTradeDeferralReasonField();

    /**
     * Deferral/ Enrichment Type
     */
    private final DeferralEnrichmentTypeField deferralEnrichmentType = new DeferralEnrichmentTypeField();

    /**
     * Duplicative Indicator
     */
    private final DuplicativeIndicatorField duplicativeIndicator = new DuplicativeIndicatorField();

    /**
     * Identification of the third-country trading venue where the transaction was executed.
     */
    private final ThirdCountryTradingVenueOfExecutionField thirdCountryTradingVenueOfExecution = new ThirdCountryTradingVenueOfExecutionField();

    /**
     * Portfolio Transaction Flag
     */
    private final PortfolioTransactionFlagField portfolioTransactionFlag = new PortfolioTransactionFlagField();

    /**
     * Contingent Transaction Flag
     */
    private final ContingentTransactionFlagField contingentTransactionFlag = new ContingentTransactionFlagField();

    /**
     * Missing Price (ESMA) / Price Conditions (FCA)
     */
    private final PriceConditionsField priceConditions = new PriceConditionsField();

    /**
     * Market Closing Price Flag
     */
    private final MarketClosingPriceFlagField marketClosingPriceFlag = new MarketClosingPriceFlagField();

    /**
     * NT Large in Scale Flag
     */
    private final NtLargeInScaleFlagField ntLargeInScaleFlag = new NtLargeInScaleFlagField();

    /**
     * NT Pre-Trade Transparency Flag
     */
    private final NtPreTradeTransparencyFlagField ntPreTradeTransparencyFlag = new NtPreTradeTransparencyFlagField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, transactionIdentificationCode, totalNumberOfTransactions, sourceVenue, miFidPrice, miFidQuantity, miFidTradingDateAndTime, instrumentIdentificationCodeType, instrumentIdentificationCode, priceNotation, priceCurrency, notionalAmount, notionalCurrency, venueOfExecution, publicationDateAndTime, benchmarkTransactionFlag, agencyCrossTradeFlag, nonPriceFormingTransactionsFlag, nonPriceContributionToDiscovery, specialDividendFlag, ptDeferralReasonFlag, referencePriceTransactionFlag, ntLiquidityFlag, ntPriceConditionsFlag, algoTransactionFlag, ptIlliquidFlag, priceImprovementFlag, cancellationFlag, amendmentFlag, duplicateFlag, exchangeForPhysicalsFlag, limitedDetailsFlag, ldFullDetailsFlag, dailyAggregatedTransactionFlag, daFullDetailsFlag, volumeOmissionFlag, voFullDetailsFlag, fourWeeksAggregationFlag, faFullDetailsFlag, indefiniteAggregationFlag, volumeOmissionForSovereignDebtFlag, consecutiveAggregationFlag, venueType, venueBookDefinitionId, venueMeasurementUnitNotation, quantityInMeasurementUnit, transactionToBeCleared, emissionAllowanceType, venueOfPublication, marketMechanism, tradingMode, transactionCategory, negotiationIndicator, agencyCrossIndicator, modificationIndicator, referencePriceIndicator, specialDividendIndicator, offBookAutomatedIndicator, priceFormationIndicator, algorithmicIndicator, postTradeDeferralReason, deferralEnrichmentType, duplicativeIndicator, thirdCountryTradingVenueOfExecution, portfolioTransactionFlag, contingentTransactionFlag, priceConditions, marketClosingPriceFlag, ntLargeInScaleFlag, ntPreTradeTransparencyFlag);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated
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
     * A unique trade identifier.
     *
     * @return the TransactionIdentificationCode field
     */
    public TransactionIdentificationCodeField transactionIdentificationCode() {
        return transactionIdentificationCode;
    }

    /**
     * Total Number of Transactions of aggregated trade
     *
     * @return the TotalNumberOfTransactions field
     */
    public TotalNumberOfTransactionsField totalNumberOfTransactions() {
        return totalNumberOfTransactions;
    }

    /**
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * MiFID compliant Price field populated using either Price or Yield. Will be set to default value (20 spaces) if there is a pending price (PNDG)
     *
     * @return the MiFidPrice field
     */
    public MiFidPriceField miFidPrice() {
        return miFidPrice;
    }

    /**
     * Number of units of the financial instrument. {DECIMAL-18/17}
     *
     * @return the MiFidQuantity field
     */
    public MiFidQuantityField miFidQuantity() {
        return miFidQuantity;
    }

    /**
     * Date and time when the transaction was executed/ agreed upon.
     *
     * @return the MiFidTradingDateAndTime field
     */
    public MiFidTradingDateAndTimeField miFidTradingDateAndTime() {
        return miFidTradingDateAndTime;
    }

    /**
     * Instrument Identification Code Type
     *
     * @return the InstrumentIdentificationCodeType field
     */
    public InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType() {
        return instrumentIdentificationCodeType;
    }

    /**
     * Instrument identification number (ISIN code).
     *
     * @return the InstrumentIdentificationCode field
     */
    public InstrumentIdentificationCodeField instrumentIdentificationCode() {
        return instrumentIdentificationCode;
    }

    /**
     * Indicates if the price is expressed in monetary value, in percentage or yield.
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Currency Code as per ISO 4217
     *
     * @return the PriceCurrency field
     */
    public PriceCurrencyField priceCurrency() {
        return priceCurrency;
    }

    /**
     * Notional value relevant to the security
     *
     * @return the NotionalAmount field
     */
    public NotionalAmountField notionalAmount() {
        return notionalAmount;
    }

    /**
     * Major currency in which the notional amount is denominated
     *
     * @return the NotionalCurrency field
     */
    public NotionalCurrencyField notionalCurrency() {
        return notionalCurrency;
    }

    /**
     * Identification of the venue where the transaction was executed
     *
     * @return the VenueOfExecution field
     */
    public VenueOfExecutionField venueOfExecution() {
        return venueOfExecution;
    }

    /**
     * Date and time when the transaction was published
     *
     * @return the PublicationDateAndTime field
     */
    public PublicationDateAndTimeField publicationDateAndTime() {
        return publicationDateAndTime;
    }

    /**
     * Benchmark Transaction Flag
     *
     * @return the BenchmarkTransactionFlag field
     */
    public BenchmarkTransactionFlagField benchmarkTransactionFlag() {
        return benchmarkTransactionFlag;
    }

    /**
     * Agency Cross Trade Flag
     *
     * @return the AgencyCrossTradeFlag field
     */
    public AgencyCrossTradeFlagField agencyCrossTradeFlag() {
        return agencyCrossTradeFlag;
    }

    /**
     * Non Price Forming Transactions Flag
     *
     * @return the NonPriceFormingTransactionsFlag field
     */
    public NonPriceFormingTransactionsFlagField nonPriceFormingTransactionsFlag() {
        return nonPriceFormingTransactionsFlag;
    }

    /**
     * Non Price Contribution to Discovery
     *
     * @return the NonPriceContributionToDiscovery field
     */
    public NonPriceContributionToDiscoveryField nonPriceContributionToDiscovery() {
        return nonPriceContributionToDiscovery;
    }

    /**
     * Special Dividend Flag
     *
     * @return the SpecialDividendFlag field
     */
    public SpecialDividendFlagField specialDividendFlag() {
        return specialDividendFlag;
    }

    /**
     * PT Deferral Reason Flag
     *
     * @return the PtDeferralReasonFlag field
     */
    public PtDeferralReasonFlagField ptDeferralReasonFlag() {
        return ptDeferralReasonFlag;
    }

    /**
     * Reference Price Transaction Flag
     *
     * @return the ReferencePriceTransactionFlag field
     */
    public ReferencePriceTransactionFlagField referencePriceTransactionFlag() {
        return referencePriceTransactionFlag;
    }

    /**
     * NT Liquidity Flag
     *
     * @return the NtLiquidityFlag field
     */
    public NtLiquidityFlagField ntLiquidityFlag() {
        return ntLiquidityFlag;
    }

    /**
     * NT Price Conditions Flag
     *
     * @return the NtPriceConditionsFlag field
     */
    public NtPriceConditionsFlagField ntPriceConditionsFlag() {
        return ntPriceConditionsFlag;
    }

    /**
     * Algo Transaction Flag
     *
     * @return the AlgoTransactionFlag field
     */
    public AlgoTransactionFlagField algoTransactionFlag() {
        return algoTransactionFlag;
    }

    /**
     * PT Illiquid Flag
     *
     * @return the PtIlliquidFlag field
     */
    public PtIlliquidFlagField ptIlliquidFlag() {
        return ptIlliquidFlag;
    }

    /**
     * Price Improvement Flag
     *
     * @return the PriceImprovementFlag field
     */
    public PriceImprovementFlagField priceImprovementFlag() {
        return priceImprovementFlag;
    }

    /**
     * Cancellation Flag
     *
     * @return the CancellationFlag field
     */
    public CancellationFlagField cancellationFlag() {
        return cancellationFlag;
    }

    /**
     * Amendment Flag
     *
     * @return the AmendmentFlag field
     */
    public AmendmentFlagField amendmentFlag() {
        return amendmentFlag;
    }

    /**
     * Duplicate Flag
     *
     * @return the DuplicateFlag field
     */
    public DuplicateFlagField duplicateFlag() {
        return duplicateFlag;
    }

    /**
     * Exchange For Physicals Flag
     *
     * @return the ExchangeForPhysicalsFlag field
     */
    public ExchangeForPhysicalsFlagField exchangeForPhysicalsFlag() {
        return exchangeForPhysicalsFlag;
    }

    /**
     * Limited Details Flag
     *
     * @return the LimitedDetailsFlag field
     */
    public LimitedDetailsFlagField limitedDetailsFlag() {
        return limitedDetailsFlag;
    }

    /**
     * LD Full Details Flag
     *
     * @return the LdFullDetailsFlag field
     */
    public LdFullDetailsFlagField ldFullDetailsFlag() {
        return ldFullDetailsFlag;
    }

    /**
     * Daily Aggregated Transaction Flag
     *
     * @return the DailyAggregatedTransactionFlag field
     */
    public DailyAggregatedTransactionFlagField dailyAggregatedTransactionFlag() {
        return dailyAggregatedTransactionFlag;
    }

    /**
     * DA Full Details Flag
     *
     * @return the DaFullDetailsFlag field
     */
    public DaFullDetailsFlagField daFullDetailsFlag() {
        return daFullDetailsFlag;
    }

    /**
     * Volume Omission Flag
     *
     * @return the VolumeOmissionFlag field
     */
    public VolumeOmissionFlagField volumeOmissionFlag() {
        return volumeOmissionFlag;
    }

    /**
     * VO Full Details Flag
     *
     * @return the VoFullDetailsFlag field
     */
    public VoFullDetailsFlagField voFullDetailsFlag() {
        return voFullDetailsFlag;
    }

    /**
     * Four Weeks Aggregation Flag
     *
     * @return the FourWeeksAggregationFlag field
     */
    public FourWeeksAggregationFlagField fourWeeksAggregationFlag() {
        return fourWeeksAggregationFlag;
    }

    /**
     * FA Full Details Flag
     *
     * @return the FaFullDetailsFlag field
     */
    public FaFullDetailsFlagField faFullDetailsFlag() {
        return faFullDetailsFlag;
    }

    /**
     * Indefinite Aggregation Flag
     *
     * @return the IndefiniteAggregationFlag field
     */
    public IndefiniteAggregationFlagField indefiniteAggregationFlag() {
        return indefiniteAggregationFlag;
    }

    /**
     * Volume Omission For Sovereign Debt Flag
     *
     * @return the VolumeOmissionForSovereignDebtFlag field
     */
    public VolumeOmissionForSovereignDebtFlagField volumeOmissionForSovereignDebtFlag() {
        return volumeOmissionForSovereignDebtFlag;
    }

    /**
     * Consecutive Aggregation Flag
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
     * Notation of the Quantity in Measurement Unit.
     *
     * @return the VenueMeasurementUnitNotation field
     */
    public VenueMeasurementUnitNotationField venueMeasurementUnitNotation() {
        return venueMeasurementUnitNotation;
    }

    /**
     * The Quantity in Measurement Unit.
     *
     * @return the QuantityInMeasurementUnit field
     */
    public QuantityInMeasurementUnitField quantityInMeasurementUnit() {
        return quantityInMeasurementUnit;
    }

    /**
     * Identifies if the firm intends to clear the transaction. ESMA field for derivatives.
     *
     * @return the TransactionToBeCleared field
     */
    public TransactionToBeClearedField transactionToBeCleared() {
        return transactionToBeCleared;
    }

    /**
     * Emission Allowance Type.
     *
     * @return the EmissionAllowanceType field
     */
    public EmissionAllowanceTypeField emissionAllowanceType() {
        return emissionAllowanceType;
    }

    /**
     * Identification of the regulatory regime under which the transaction was published. The value sent by the source venue is passed on.
     *
     * @return the VenueOfPublication field
     */
    public VenueOfPublicationField venueOfPublication() {
        return venueOfPublication;
    }

    /**
     * Market Mechanism
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Trading Mode
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
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
     * Negotiation Indicator
     *
     * @return the NegotiationIndicator field
     */
    public NegotiationIndicatorField negotiationIndicator() {
        return negotiationIndicator;
    }

    /**
     * Agency Cross Indicator
     *
     * @return the AgencyCrossIndicator field
     */
    public AgencyCrossIndicatorField agencyCrossIndicator() {
        return agencyCrossIndicator;
    }

    /**
     * Modification Indicator
     *
     * @return the ModificationIndicator field
     */
    public ModificationIndicatorField modificationIndicator() {
        return modificationIndicator;
    }

    /**
     * Reference Price Indicator
     *
     * @return the ReferencePriceIndicator field
     */
    public ReferencePriceIndicatorField referencePriceIndicator() {
        return referencePriceIndicator;
    }

    /**
     * Special Dividend Indicator
     *
     * @return the SpecialDividendIndicator field
     */
    public SpecialDividendIndicatorField specialDividendIndicator() {
        return specialDividendIndicator;
    }

    /**
     * Off Book Automated Indicator
     *
     * @return the OffBookAutomatedIndicator field
     */
    public OffBookAutomatedIndicatorField offBookAutomatedIndicator() {
        return offBookAutomatedIndicator;
    }

    /**
     * Price Formation Indicator
     *
     * @return the PriceFormationIndicator field
     */
    public PriceFormationIndicatorField priceFormationIndicator() {
        return priceFormationIndicator;
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
     * Post-Trade Deferral Reason
     *
     * @return the PostTradeDeferralReason field
     */
    public PostTradeDeferralReasonField postTradeDeferralReason() {
        return postTradeDeferralReason;
    }

    /**
     * Deferral/ Enrichment Type
     *
     * @return the DeferralEnrichmentType field
     */
    public DeferralEnrichmentTypeField deferralEnrichmentType() {
        return deferralEnrichmentType;
    }

    /**
     * Duplicative Indicator
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
     * Portfolio Transaction Flag
     *
     * @return the PortfolioTransactionFlag field
     */
    public PortfolioTransactionFlagField portfolioTransactionFlag() {
        return portfolioTransactionFlag;
    }

    /**
     * Contingent Transaction Flag
     *
     * @return the ContingentTransactionFlag field
     */
    public ContingentTransactionFlagField contingentTransactionFlag() {
        return contingentTransactionFlag;
    }

    /**
     * Missing Price (ESMA) / Price Conditions (FCA)
     *
     * @return the PriceConditions field
     */
    public PriceConditionsField priceConditions() {
        return priceConditions;
    }

    /**
     * Market Closing Price Flag
     *
     * @return the MarketClosingPriceFlag field
     */
    public MarketClosingPriceFlagField marketClosingPriceFlag() {
        return marketClosingPriceFlag;
    }

    /**
     * NT Large in Scale Flag
     *
     * @return the NtLargeInScaleFlag field
     */
    public NtLargeInScaleFlagField ntLargeInScaleFlag() {
        return ntLargeInScaleFlag;
    }

    /**
     * NT Pre-Trade Transparency Flag
     *
     * @return the NtPreTradeTransparencyFlag field
     */
    public NtPreTradeTransparencyFlagField ntPreTradeTransparencyFlag() {
        return ntPreTradeTransparencyFlag;
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
        if (!miFidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidPriceField.BYTE_LENGTH;
        if (!miFidQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidQuantityField.BYTE_LENGTH;
        if (!miFidTradingDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidTradingDateAndTimeField.BYTE_LENGTH;
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
        if (!priceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCurrencyField.BYTE_LENGTH;
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
        if (!venueMeasurementUnitNotation.parse(data, cursor)) {
            return false;
        }
        cursor += VenueMeasurementUnitNotationField.BYTE_LENGTH;
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
        if (!priceConditions.parse(data, cursor)) {
            return false;
        }
        cursor += PriceConditionsField.BYTE_LENGTH;
        if (!marketClosingPriceFlag.parse(data, cursor)) {
            return false;
        }
        cursor += MarketClosingPriceFlagField.BYTE_LENGTH;
        if (!ntLargeInScaleFlag.parse(data, cursor)) {
            return false;
        }
        cursor += NtLargeInScaleFlagField.BYTE_LENGTH;
        return ntPreTradeTransparencyFlag.parse(data, cursor);
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
        cursor = miFidPrice.encode(data, cursor);
        cursor = miFidQuantity.encode(data, cursor);
        cursor = miFidTradingDateAndTime.encode(data, cursor);
        cursor = instrumentIdentificationCodeType.encode(data, cursor);
        cursor = instrumentIdentificationCode.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = priceCurrency.encode(data, cursor);
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
        cursor = venueMeasurementUnitNotation.encode(data, cursor);
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
        cursor = priceConditions.encode(data, cursor);
        cursor = marketClosingPriceFlag.encode(data, cursor);
        cursor = ntLargeInScaleFlag.encode(data, cursor);
        cursor = ntPreTradeTransparencyFlag.encode(data, cursor);
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
            case "MiFidPrice" -> Optional.of(miFidPrice);
            case "MiFidQuantity" -> Optional.of(miFidQuantity);
            case "MiFidTradingDateAndTime" -> Optional.of(miFidTradingDateAndTime);
            case "InstrumentIdentificationCodeType" -> Optional.of(instrumentIdentificationCodeType);
            case "InstrumentIdentificationCode" -> Optional.of(instrumentIdentificationCode);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "PriceCurrency" -> Optional.of(priceCurrency);
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
            case "VenueMeasurementUnitNotation" -> Optional.of(venueMeasurementUnitNotation);
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
            case "PriceConditions" -> Optional.of(priceConditions);
            case "MarketClosingPriceFlag" -> Optional.of(marketClosingPriceFlag);
            case "NtLargeInScaleFlag" -> Optional.of(ntLargeInScaleFlag);
            case "NtPreTradeTransparencyFlag" -> Optional.of(ntPreTradeTransparencyFlag);
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
