package omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.AgencyCrossIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.AlgorithmicIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.AuctionTypeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.DeferralEnrichmentTypeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.DuplicativeIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.InstrumentField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.InstrumentIdentificationCodeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.InstrumentIdentificationCodeTypeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.MarketClosingPriceFlagField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.MarketMechanismField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.MifidPriceField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.MifidQuantityField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.MifidTradeTypeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.ModificationIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.NegotiationIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.NotionalAmountField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.NotionalCurrencyField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.OffBookAutomatedIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PostTradeDeferralReasonField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PriceFormationIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PriceMajorCurrencyField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PriceNotationField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PtAlgoTradeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PtAmendmentFlagField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PtCancellationFlagField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PtRefPriceWaiverFlagField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.PublicationDateAndTimeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.ReferencePriceIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.SourceVenueField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.SpecialDividendIndicatorField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TimestampField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TradeQualifierField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TradingDateAndTimeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TradingModeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TransactionCategoryField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.TransactionIdentificationCodeField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.fields.VenueOfExecutionField;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.types.Field;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.types.Message;
import omi.lseg.lse.mifid2posttradereplay.gtp.v26_2.types.PrintOptions;

/**
 * Represents the MifidIiTradeMessage message from the Mifid2PostTradeReplay protocol.
 *
 * <p>Sent to represent different types of MiFID compliant trades published by markets.</p>
 */
public final class MifidIiTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 283;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mifid Ii Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 220, 4, 240, 1, 241, 3, 244, 20, 264, 4 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Venue from which market data is received for the instrument.
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * A unique trade identifier. The value will be right aligned.
     */
    private final TransactionIdentificationCodeField transactionIdentificationCode = new TransactionIdentificationCodeField();

    /**
     * Type of the trade.
     */
    private final MifidTradeTypeField mifidTradeType = new MifidTradeTypeField();

    /**
     * The value in this field is only relevant when Trade Type is 1.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * MiFID compliant Price field populated using either Price or Percentage. {DECIMAL-18/13} in case the price is expressed as monetary value. {DECIMAL-11/10} in case the price is expressed as percentage.
     */
    private final MifidPriceField mifidPrice = new MifidPriceField();

    /**
     * Number of units of the financial instrument. {DECIMAL-18/17} Will be set to default value (20 spaces) if the traded security is a bond.
     */
    private final MifidQuantityField mifidQuantity = new MifidQuantityField();

    /**
     * Date and time when the transaction was executed/agreed upon. If a trade is cancelled or amended, this field will contain the Trading Date and Time of the original trade.
     */
    private final TradingDateAndTimeField tradingDateAndTime = new TradingDateAndTimeField();

    /**
     * Only relevant for non-equity instruments. Empty for equity and equity-like instruments.
     */
    private final InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType = new InstrumentIdentificationCodeTypeField();

    /**
     * Instrument identification number (ISIN code).
     */
    private final InstrumentIdentificationCodeField instrumentIdentificationCode = new InstrumentIdentificationCodeField();

    /**
     * Indicates if the price is expressed in monetary value or in percentage. Only relevant for non-equity instruments.
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Major currency in which the price is expressed (applicable if the price is expressed as monetary value). Currency Code as per ISO 4217.
     */
    private final PriceMajorCurrencyField priceMajorCurrency = new PriceMajorCurrencyField();

    /**
     * Notional value relevant to the security. {DECIMAL-18/5} Only relevant for non-equity instruments.
     */
    private final NotionalAmountField notionalAmount = new NotionalAmountField();

    /**
     * Major Currency in which the notional amount is denominated. Only relevant for non-equity instruments.
     */
    private final NotionalCurrencyField notionalCurrency = new NotionalCurrencyField();

    /**
     * Identification of the venue where the transaction was executed.
     */
    private final VenueOfExecutionField venueOfExecution = new VenueOfExecutionField();

    /**
     * Date and time when the transaction was published.
     */
    private final PublicationDateAndTimeField publicationDateAndTime = new PublicationDateAndTimeField();

    /**
     * Not Applicable to LSE.
     */
    private final PtRefPriceWaiverFlagField ptRefPriceWaiverFlag = new PtRefPriceWaiverFlagField();

    /**
     * Market closing price flag.
     */
    private final MarketClosingPriceFlagField marketClosingPriceFlag = new MarketClosingPriceFlagField();

    /**
     * Algorithmic trade flag.
     */
    private final PtAlgoTradeField ptAlgoTrade = new PtAlgoTradeField();

    /**
     * Trade cancellation flag.
     */
    private final PtCancellationFlagField ptCancellationFlag = new PtCancellationFlagField();

    /**
     * Trade amendment flag.
     */
    private final PtAmendmentFlagField ptAmendmentFlag = new PtAmendmentFlagField();

    /**
     * Qualifier of the trade.
     */
    private final TradeQualifierField tradeQualifier = new TradeQualifierField();

    /**
     * Market mechanism the trade was executed under.
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Trading mode the trade was executed under.
     */
    private final TradingModeField tradingMode = new TradingModeField();

    /**
     * Category of the transaction.
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Indicates whether the trade was negotiated.
     */
    private final NegotiationIndicatorField negotiationIndicator = new NegotiationIndicatorField();

    /**
     * Indicates whether the trade was an agency cross.
     */
    private final AgencyCrossIndicatorField agencyCrossIndicator = new AgencyCrossIndicatorField();

    /**
     * Indicates whether the report cancels or amends a previous report.
     */
    private final ModificationIndicatorField modificationIndicator = new ModificationIndicatorField();

    /**
     * Indicates whether the trade was a reference price trade.
     */
    private final ReferencePriceIndicatorField referencePriceIndicator = new ReferencePriceIndicatorField();

    /**
     * Indicates whether the trade was a special dividend trade.
     */
    private final SpecialDividendIndicatorField specialDividendIndicator = new SpecialDividendIndicatorField();

    /**
     * Indicates whether the off book trade was automated.
     */
    private final OffBookAutomatedIndicatorField offBookAutomatedIndicator = new OffBookAutomatedIndicatorField();

    /**
     * Indicates how the price was formed.
     */
    private final PriceFormationIndicatorField priceFormationIndicator = new PriceFormationIndicatorField();

    /**
     * Indicates whether the trade was algorithmic.
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Reason publication of the trade was deferred.
     */
    private final PostTradeDeferralReasonField postTradeDeferralReason = new PostTradeDeferralReasonField();

    /**
     * Type of deferral or enrichment applied.
     */
    private final DeferralEnrichmentTypeField deferralEnrichmentType = new DeferralEnrichmentTypeField();

    /**
     * Indicates whether the trade report is duplicative.
     */
    private final DuplicativeIndicatorField duplicativeIndicator = new DuplicativeIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, sourceVenue, instrument, transactionIdentificationCode, mifidTradeType, auctionType, mifidPrice, mifidQuantity, tradingDateAndTime, instrumentIdentificationCodeType, instrumentIdentificationCode, priceNotation, priceMajorCurrency, notionalAmount, notionalCurrency, venueOfExecution, publicationDateAndTime, ptRefPriceWaiverFlag, marketClosingPriceFlag, ptAlgoTrade, ptCancellationFlag, ptAmendmentFlag, tradeQualifier, marketMechanism, tradingMode, transactionCategory, negotiationIndicator, agencyCrossIndicator, modificationIndicator, referencePriceIndicator, specialDividendIndicator, offBookAutomatedIndicator, priceFormationIndicator, algorithmicIndicator, postTradeDeferralReason, deferralEnrichmentType, duplicativeIndicator);

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
     * Venue from which market data is received for the instrument.
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
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
     * Type of the trade.
     *
     * @return the MifidTradeType field
     */
    public MifidTradeTypeField mifidTradeType() {
        return mifidTradeType;
    }

    /**
     * The value in this field is only relevant when Trade Type is 1.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * MiFID compliant Price field populated using either Price or Percentage. {DECIMAL-18/13} in case the price is expressed as monetary value. {DECIMAL-11/10} in case the price is expressed as percentage.
     *
     * @return the MifidPrice field
     */
    public MifidPriceField mifidPrice() {
        return mifidPrice;
    }

    /**
     * Number of units of the financial instrument. {DECIMAL-18/17} Will be set to default value (20 spaces) if the traded security is a bond.
     *
     * @return the MifidQuantity field
     */
    public MifidQuantityField mifidQuantity() {
        return mifidQuantity;
    }

    /**
     * Date and time when the transaction was executed/agreed upon. If a trade is cancelled or amended, this field will contain the Trading Date and Time of the original trade.
     *
     * @return the TradingDateAndTime field
     */
    public TradingDateAndTimeField tradingDateAndTime() {
        return tradingDateAndTime;
    }

    /**
     * Only relevant for non-equity instruments. Empty for equity and equity-like instruments.
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
     * Indicates if the price is expressed in monetary value or in percentage. Only relevant for non-equity instruments.
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Major currency in which the price is expressed (applicable if the price is expressed as monetary value). Currency Code as per ISO 4217.
     *
     * @return the PriceMajorCurrency field
     */
    public PriceMajorCurrencyField priceMajorCurrency() {
        return priceMajorCurrency;
    }

    /**
     * Notional value relevant to the security. {DECIMAL-18/5} Only relevant for non-equity instruments.
     *
     * @return the NotionalAmount field
     */
    public NotionalAmountField notionalAmount() {
        return notionalAmount;
    }

    /**
     * Major Currency in which the notional amount is denominated. Only relevant for non-equity instruments.
     *
     * @return the NotionalCurrency field
     */
    public NotionalCurrencyField notionalCurrency() {
        return notionalCurrency;
    }

    /**
     * Identification of the venue where the transaction was executed.
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
     * Not Applicable to LSE.
     *
     * @return the PtRefPriceWaiverFlag field
     */
    public PtRefPriceWaiverFlagField ptRefPriceWaiverFlag() {
        return ptRefPriceWaiverFlag;
    }

    /**
     * Market closing price flag.
     *
     * @return the MarketClosingPriceFlag field
     */
    public MarketClosingPriceFlagField marketClosingPriceFlag() {
        return marketClosingPriceFlag;
    }

    /**
     * Algorithmic trade flag.
     *
     * @return the PtAlgoTrade field
     */
    public PtAlgoTradeField ptAlgoTrade() {
        return ptAlgoTrade;
    }

    /**
     * Trade cancellation flag.
     *
     * @return the PtCancellationFlag field
     */
    public PtCancellationFlagField ptCancellationFlag() {
        return ptCancellationFlag;
    }

    /**
     * Trade amendment flag.
     *
     * @return the PtAmendmentFlag field
     */
    public PtAmendmentFlagField ptAmendmentFlag() {
        return ptAmendmentFlag;
    }

    /**
     * Qualifier of the trade.
     *
     * @return the TradeQualifier field
     */
    public TradeQualifierField tradeQualifier() {
        return tradeQualifier;
    }

    /**
     * Market mechanism the trade was executed under.
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Trading mode the trade was executed under.
     *
     * @return the TradingMode field
     */
    public TradingModeField tradingMode() {
        return tradingMode;
    }

    /**
     * Category of the transaction.
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Indicates whether the trade was negotiated.
     *
     * @return the NegotiationIndicator field
     */
    public NegotiationIndicatorField negotiationIndicator() {
        return negotiationIndicator;
    }

    /**
     * Indicates whether the trade was an agency cross.
     *
     * @return the AgencyCrossIndicator field
     */
    public AgencyCrossIndicatorField agencyCrossIndicator() {
        return agencyCrossIndicator;
    }

    /**
     * Indicates whether the report cancels or amends a previous report.
     *
     * @return the ModificationIndicator field
     */
    public ModificationIndicatorField modificationIndicator() {
        return modificationIndicator;
    }

    /**
     * Indicates whether the trade was a reference price trade.
     *
     * @return the ReferencePriceIndicator field
     */
    public ReferencePriceIndicatorField referencePriceIndicator() {
        return referencePriceIndicator;
    }

    /**
     * Indicates whether the trade was a special dividend trade.
     *
     * @return the SpecialDividendIndicator field
     */
    public SpecialDividendIndicatorField specialDividendIndicator() {
        return specialDividendIndicator;
    }

    /**
     * Indicates whether the off book trade was automated.
     *
     * @return the OffBookAutomatedIndicator field
     */
    public OffBookAutomatedIndicatorField offBookAutomatedIndicator() {
        return offBookAutomatedIndicator;
    }

    /**
     * Indicates how the price was formed.
     *
     * @return the PriceFormationIndicator field
     */
    public PriceFormationIndicatorField priceFormationIndicator() {
        return priceFormationIndicator;
    }

    /**
     * Indicates whether the trade was algorithmic.
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Reason publication of the trade was deferred.
     *
     * @return the PostTradeDeferralReason field
     */
    public PostTradeDeferralReasonField postTradeDeferralReason() {
        return postTradeDeferralReason;
    }

    /**
     * Type of deferral or enrichment applied.
     *
     * @return the DeferralEnrichmentType field
     */
    public DeferralEnrichmentTypeField deferralEnrichmentType() {
        return deferralEnrichmentType;
    }

    /**
     * Indicates whether the trade report is duplicative.
     *
     * @return the DuplicativeIndicator field
     */
    public DuplicativeIndicatorField duplicativeIndicator() {
        return duplicativeIndicator;
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
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!transactionIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdentificationCodeField.BYTE_LENGTH;
        if (!mifidTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += MifidTradeTypeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!mifidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MifidPriceField.BYTE_LENGTH;
        if (!mifidQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MifidQuantityField.BYTE_LENGTH;
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
        if (!priceMajorCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMajorCurrencyField.BYTE_LENGTH;
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
        if (!ptRefPriceWaiverFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PtRefPriceWaiverFlagField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!marketClosingPriceFlag.parse(data, cursor)) {
            return false;
        }
        cursor += MarketClosingPriceFlagField.BYTE_LENGTH;
        if (!ptAlgoTrade.parse(data, cursor)) {
            return false;
        }
        cursor += PtAlgoTradeField.BYTE_LENGTH;
        if (!ptCancellationFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PtCancellationFlagField.BYTE_LENGTH;
        if (!ptAmendmentFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PtAmendmentFlagField.BYTE_LENGTH;
        cursor += 28; // padding
        if (!tradeQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeQualifierField.BYTE_LENGTH;
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
        return duplicativeIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = transactionIdentificationCode.encode(data, cursor);
        cursor = mifidTradeType.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = mifidPrice.encode(data, cursor);
        cursor = mifidQuantity.encode(data, cursor);
        cursor = tradingDateAndTime.encode(data, cursor);
        cursor = instrumentIdentificationCodeType.encode(data, cursor);
        cursor = instrumentIdentificationCode.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = priceMajorCurrency.encode(data, cursor);
        cursor = notionalAmount.encode(data, cursor);
        cursor = notionalCurrency.encode(data, cursor);
        cursor = venueOfExecution.encode(data, cursor);
        cursor = publicationDateAndTime.encode(data, cursor);
        cursor = ptRefPriceWaiverFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 224) {
            System.arraycopy(buffer, 220, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = marketClosingPriceFlag.encode(data, cursor);
        cursor = ptAlgoTrade.encode(data, cursor);
        cursor = ptCancellationFlag.encode(data, cursor);
        cursor = ptAmendmentFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 268) {
            System.arraycopy(buffer, 240, data, cursor, 28); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 28, (byte) 0); // padding
        }
        cursor += 28;
        cursor = tradeQualifier.encode(data, cursor);
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
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "Instrument" -> Optional.of(instrument);
            case "TransactionIdentificationCode" -> Optional.of(transactionIdentificationCode);
            case "MifidTradeType" -> Optional.of(mifidTradeType);
            case "AuctionType" -> Optional.of(auctionType);
            case "MifidPrice" -> Optional.of(mifidPrice);
            case "MifidQuantity" -> Optional.of(mifidQuantity);
            case "TradingDateAndTime" -> Optional.of(tradingDateAndTime);
            case "InstrumentIdentificationCodeType" -> Optional.of(instrumentIdentificationCodeType);
            case "InstrumentIdentificationCode" -> Optional.of(instrumentIdentificationCode);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "PriceMajorCurrency" -> Optional.of(priceMajorCurrency);
            case "NotionalAmount" -> Optional.of(notionalAmount);
            case "NotionalCurrency" -> Optional.of(notionalCurrency);
            case "VenueOfExecution" -> Optional.of(venueOfExecution);
            case "PublicationDateAndTime" -> Optional.of(publicationDateAndTime);
            case "PtRefPriceWaiverFlag" -> Optional.of(ptRefPriceWaiverFlag);
            case "MarketClosingPriceFlag" -> Optional.of(marketClosingPriceFlag);
            case "PtAlgoTrade" -> Optional.of(ptAlgoTrade);
            case "PtCancellationFlag" -> Optional.of(ptCancellationFlag);
            case "PtAmendmentFlag" -> Optional.of(ptAmendmentFlag);
            case "TradeQualifier" -> Optional.of(tradeQualifier);
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
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MifidIiTradeMessage message)) {
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
        if (!(other instanceof MifidIiTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
