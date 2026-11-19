package omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.BusinessDaysToExpiryField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.CfiCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.ExpiryDateField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.InstrumentIdField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.InstrumentTypeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.IsinField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.LastTradingDateField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.MarketCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.MarketSegmentCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.OptionStrikeRelativePositionField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.OptionTypeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.PriceCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.PromptDateLabelField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.PromptTypeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.RecordCountField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.RemainingRecordsField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.SettlementDateField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.StrategyLegCountField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.StrategyTypeCodeField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.StrikePriceField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.TickSizeIdField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.TradeAtReferenceField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.TradingCurrencyField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.fields.UnderlyingTradableInstrumentIdField;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.groups.DefinitionLegsEntry;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.groups.DefinitionLegsList;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the TradableInstrumentDefinitionMessage message from the NonElectronicRefDataSnapshot protocol.
 *
 * <p>Describes an individual outright, strategy or Trade at Reference tradable instrument on the Ring or Inter Office venue. An option tradable instrument is published only once on the day of creation and is published at the start of day on the next business day.</p>
 */
public final class TradableInstrumentDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 134;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tradable Instrument Definition Message";

    /**
     * Tradable instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Unique Instrument Identifier.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Numeric indicator of the number of Business Days to Expiry used as a measure of how far the instrument is down the curve. Null if Contract Type is Option.
     */
    private final BusinessDaysToExpiryField businessDaysToExpiry = new BusinessDaysToExpiryField();

    /**
     * Last Trading Date, as YYYYMMDD.
     */
    private final LastTradingDateField lastTradingDate = new LastTradingDateField();

    /**
     * Tick Size ID.
     */
    private final TickSizeIdField tickSizeId = new TickSizeIdField();

    /**
     * Contract to which the instrument belongs.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Constant contract type.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * Instrument Type.
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Market Code.
     */
    private final MarketCodeField marketCode = new MarketCodeField();

    /**
     * A string identifier for the individual market segment to which the tradable instrument belongs.
     */
    private final MarketSegmentCodeField marketSegmentCode = new MarketSegmentCodeField();

    /**
     * Product code. This identifies the metal.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Underlying Tradable Instrument ID. Null when no underlying Tradable Instrument exists or the Tradable Instrument is a strategy.
     */
    private final UnderlyingTradableInstrumentIdField underlyingTradableInstrumentId = new UnderlyingTradableInstrumentIdField();

    /**
     * Settlement Date, as YYYYMMDD. Null for a rolling prompt or strategy.
     */
    private final SettlementDateField settlementDate = new SettlementDateField();

    /**
     * Expiry date, as YYYYMMDD.
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Call or Put. Space if Contract Type is Future.
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Option Exercise Price, in implicit six decimal place format. Null for futures.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * The instrument classification according to ISO 10962.
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * ISIN Code. Not applicable if the Instrument belongs to an algorithmic test contract.
     */
    private final IsinField isin = new IsinField();

    /**
     * A flag to indicate that the instrument is a TaS or TaR type.
     */
    private final TradeAtReferenceField tradeAtReference = new TradeAtReferenceField();

    /**
     * The price code that specifies the type of TaS or TaR instrument. Not applicable for non Trade at Reference tradable instruments.
     */
    private final PriceCodeField priceCode = new PriceCodeField();

    /**
     * Prompt Date Label. Not applicable for a strategy.
     */
    private final PromptDateLabelField promptDateLabel = new PromptDateLabelField();

    /**
     * Identifies whether the prompt is a single or a rolling prompt. Not applicable for a strategy.
     */
    private final PromptTypeField promptType = new PromptTypeField();

    /**
     * ATM Strike is zero, ITM relative positions are positive and OTM positions are negative. Null if Contract Type is Future or Instrument Type is Strategy.
     */
    private final OptionStrikeRelativePositionField optionStrikeRelativePosition = new OptionStrikeRelativePositionField();

    /**
     * Strategy Type. Null for an outright.
     */
    private final StrategyTypeCodeField strategyTypeCode = new StrategyTypeCodeField();

    /**
     * Number of remaining records to be published. When the value of RemainingRecords equals RecordCount this is the last message.
     */
    private final RemainingRecordsField remainingRecords = new RemainingRecordsField();

    /**
     * The number of records in this message.
     */
    private final RecordCountField recordCount = new RecordCountField();

    /**
     * Number of strategy legs.
     */
    private final StrategyLegCountField strategyLegCount = new StrategyLegCountField();

    /**
     * One strategy leg record of a tradable instrument definition, counted by RecordCount rather than by StrategyLegCount: the specification's length formula gives the repeat as the value of Record Count, StrategyLegCount being the number of legs the whole strategy has
     */
    private final DefinitionLegsList definitionLegs = new DefinitionLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradableInstrumentId, instrumentId, tradingVenue, businessDaysToExpiry, lastTradingDate, tickSizeId, contractCode, contractType, instrumentType, tradingCurrency, marketCode, marketSegmentCode, productCode, underlyingTradableInstrumentId, settlementDate, expiryDate, optionType, strikePrice, cfiCode, isin, tradeAtReference, priceCode, promptDateLabel, promptType, optionStrikeRelativePosition, strategyTypeCode, remainingRecords, recordCount, strategyLegCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Tradable instrument ID.
     *
     * @return the TradableInstrumentId field
     */
    public TradableInstrumentIdField tradableInstrumentId() {
        return tradableInstrumentId;
    }

    /**
     * Unique Instrument Identifier.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Numeric indicator of the number of Business Days to Expiry used as a measure of how far the instrument is down the curve. Null if Contract Type is Option.
     *
     * @return the BusinessDaysToExpiry field
     */
    public BusinessDaysToExpiryField businessDaysToExpiry() {
        return businessDaysToExpiry;
    }

    /**
     * Last Trading Date, as YYYYMMDD.
     *
     * @return the LastTradingDate field
     */
    public LastTradingDateField lastTradingDate() {
        return lastTradingDate;
    }

    /**
     * Tick Size ID.
     *
     * @return the TickSizeId field
     */
    public TickSizeIdField tickSizeId() {
        return tickSizeId;
    }

    /**
     * Contract to which the instrument belongs.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Constant contract type.
     *
     * @return the ContractType field
     */
    public ContractTypeField contractType() {
        return contractType;
    }

    /**
     * Instrument Type.
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * The currency code according to ISO 4217.
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * Market Code.
     *
     * @return the MarketCode field
     */
    public MarketCodeField marketCode() {
        return marketCode;
    }

    /**
     * A string identifier for the individual market segment to which the tradable instrument belongs.
     *
     * @return the MarketSegmentCode field
     */
    public MarketSegmentCodeField marketSegmentCode() {
        return marketSegmentCode;
    }

    /**
     * Product code. This identifies the metal.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Underlying Tradable Instrument ID. Null when no underlying Tradable Instrument exists or the Tradable Instrument is a strategy.
     *
     * @return the UnderlyingTradableInstrumentId field
     */
    public UnderlyingTradableInstrumentIdField underlyingTradableInstrumentId() {
        return underlyingTradableInstrumentId;
    }

    /**
     * Settlement Date, as YYYYMMDD. Null for a rolling prompt or strategy.
     *
     * @return the SettlementDate field
     */
    public SettlementDateField settlementDate() {
        return settlementDate;
    }

    /**
     * Expiry date, as YYYYMMDD.
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Call or Put. Space if Contract Type is Future.
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Option Exercise Price, in implicit six decimal place format. Null for futures.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * The instrument classification according to ISO 10962.
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * ISIN Code. Not applicable if the Instrument belongs to an algorithmic test contract.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * A flag to indicate that the instrument is a TaS or TaR type.
     *
     * @return the TradeAtReference field
     */
    public TradeAtReferenceField tradeAtReference() {
        return tradeAtReference;
    }

    /**
     * The price code that specifies the type of TaS or TaR instrument. Not applicable for non Trade at Reference tradable instruments.
     *
     * @return the PriceCode field
     */
    public PriceCodeField priceCode() {
        return priceCode;
    }

    /**
     * Prompt Date Label. Not applicable for a strategy.
     *
     * @return the PromptDateLabel field
     */
    public PromptDateLabelField promptDateLabel() {
        return promptDateLabel;
    }

    /**
     * Identifies whether the prompt is a single or a rolling prompt. Not applicable for a strategy.
     *
     * @return the PromptType field
     */
    public PromptTypeField promptType() {
        return promptType;
    }

    /**
     * ATM Strike is zero, ITM relative positions are positive and OTM positions are negative. Null if Contract Type is Future or Instrument Type is Strategy.
     *
     * @return the OptionStrikeRelativePosition field
     */
    public OptionStrikeRelativePositionField optionStrikeRelativePosition() {
        return optionStrikeRelativePosition;
    }

    /**
     * Strategy Type. Null for an outright.
     *
     * @return the StrategyTypeCode field
     */
    public StrategyTypeCodeField strategyTypeCode() {
        return strategyTypeCode;
    }

    /**
     * Number of remaining records to be published. When the value of RemainingRecords equals RecordCount this is the last message.
     *
     * @return the RemainingRecords field
     */
    public RemainingRecordsField remainingRecords() {
        return remainingRecords;
    }

    /**
     * The number of records in this message.
     *
     * @return the RecordCount field
     */
    public RecordCountField recordCount() {
        return recordCount;
    }

    /**
     * Number of strategy legs.
     *
     * @return the StrategyLegCount field
     */
    public StrategyLegCountField strategyLegCount() {
        return strategyLegCount;
    }

    /**
     * One strategy leg record of a tradable instrument definition, counted by RecordCount rather than by StrategyLegCount: the specification's length formula gives the repeat as the value of Record Count, StrategyLegCount being the number of legs the whole strategy has
     *
     * <p>Encode writes this list's size to the RecordCount field.</p>
     *
     * @return the DefinitionLegs entries
     */
    public DefinitionLegsList definitionLegs() {
        return definitionLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + definitionLegs.byteLength();
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
        return Optional.empty();
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
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!businessDaysToExpiry.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessDaysToExpiryField.BYTE_LENGTH;
        if (!lastTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDateField.BYTE_LENGTH;
        if (!tickSizeId.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeIdField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!tradingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCurrencyField.BYTE_LENGTH;
        if (!marketCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCodeField.BYTE_LENGTH;
        if (!marketSegmentCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentCodeField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!underlyingTradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingTradableInstrumentIdField.BYTE_LENGTH;
        if (!settlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementDateField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!tradeAtReference.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAtReferenceField.BYTE_LENGTH;
        if (!priceCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCodeField.BYTE_LENGTH;
        if (!promptDateLabel.parse(data, cursor)) {
            return false;
        }
        cursor += PromptDateLabelField.BYTE_LENGTH;
        if (!promptType.parse(data, cursor)) {
            return false;
        }
        cursor += PromptTypeField.BYTE_LENGTH;
        if (!optionStrikeRelativePosition.parse(data, cursor)) {
            return false;
        }
        cursor += OptionStrikeRelativePositionField.BYTE_LENGTH;
        if (!strategyTypeCode.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyTypeCodeField.BYTE_LENGTH;
        if (!remainingRecords.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingRecordsField.BYTE_LENGTH;
        if (!recordCount.parse(data, cursor)) {
            return false;
        }
        cursor += RecordCountField.BYTE_LENGTH;
        if (!strategyLegCount.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLegCountField.BYTE_LENGTH;
        if (!definitionLegs.parse(data, cursor, end, recordCount.value())) {
            return false;
        }
        cursor += definitionLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (definitionLegs.size() > 65535) {
            throw new IllegalStateException("definitionLegs holds " + definitionLegs.size() + " entries, more than its count field can state");
        }
        recordCount.value(definitionLegs.size());
        int cursor = offset;
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = tradingVenue.encode(data, cursor);
        cursor = businessDaysToExpiry.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = tickSizeId.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = marketCode.encode(data, cursor);
        cursor = marketSegmentCode.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = underlyingTradableInstrumentId.encode(data, cursor);
        cursor = settlementDate.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = tradeAtReference.encode(data, cursor);
        cursor = priceCode.encode(data, cursor);
        cursor = promptDateLabel.encode(data, cursor);
        cursor = promptType.encode(data, cursor);
        cursor = optionStrikeRelativePosition.encode(data, cursor);
        cursor = strategyTypeCode.encode(data, cursor);
        cursor = remainingRecords.encode(data, cursor);
        cursor = recordCount.encode(data, cursor);
        cursor = strategyLegCount.encode(data, cursor);
        cursor = definitionLegs.encode(data, cursor);
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
        definitionLegs.clear();
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
            if (field != recordCount && !field.isRecognized()) {
                return false;
            }
        }
        return definitionLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != recordCount && !field.isValid()) {
                return false;
            }
        }
        if (!definitionLegs.isValid()) {
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
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!businessDaysToExpiry.isDecoded()) {
            return Optional.of(businessDaysToExpiry);
        }
        if (!lastTradingDate.isDecoded()) {
            return Optional.of(lastTradingDate);
        }
        if (!tickSizeId.isDecoded()) {
            return Optional.of(tickSizeId);
        }
        if (!contractCode.isDecoded()) {
            return Optional.of(contractCode);
        }
        if (!contractType.isDecoded()) {
            return Optional.of(contractType);
        }
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!tradingCurrency.isDecoded()) {
            return Optional.of(tradingCurrency);
        }
        if (!marketCode.isDecoded()) {
            return Optional.of(marketCode);
        }
        if (!marketSegmentCode.isDecoded()) {
            return Optional.of(marketSegmentCode);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!underlyingTradableInstrumentId.isDecoded()) {
            return Optional.of(underlyingTradableInstrumentId);
        }
        if (!settlementDate.isDecoded()) {
            return Optional.of(settlementDate);
        }
        if (!expiryDate.isDecoded()) {
            return Optional.of(expiryDate);
        }
        if (!optionType.isDecoded()) {
            return Optional.of(optionType);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!isin.isDecoded()) {
            return Optional.of(isin);
        }
        if (!tradeAtReference.isDecoded()) {
            return Optional.of(tradeAtReference);
        }
        if (!priceCode.isDecoded()) {
            return Optional.of(priceCode);
        }
        if (!promptDateLabel.isDecoded()) {
            return Optional.of(promptDateLabel);
        }
        if (!promptType.isDecoded()) {
            return Optional.of(promptType);
        }
        if (!optionStrikeRelativePosition.isDecoded()) {
            return Optional.of(optionStrikeRelativePosition);
        }
        if (!strategyTypeCode.isDecoded()) {
            return Optional.of(strategyTypeCode);
        }
        if (!remainingRecords.isDecoded()) {
            return Optional.of(remainingRecords);
        }
        if (!recordCount.isDecoded()) {
            return Optional.of(recordCount);
        }
        if (!strategyLegCount.isDecoded()) {
            return Optional.of(strategyLegCount);
        }
        if (!definitionLegs.isDecoded()) {
            return Optional.of(definitionLegs.failedEntry().flatMap(DefinitionLegsEntry::failedAt).orElse(recordCount));
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
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "BusinessDaysToExpiry" -> Optional.of(businessDaysToExpiry);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "TickSizeId" -> Optional.of(tickSizeId);
            case "ContractCode" -> Optional.of(contractCode);
            case "ContractType" -> Optional.of(contractType);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "MarketCode" -> Optional.of(marketCode);
            case "MarketSegmentCode" -> Optional.of(marketSegmentCode);
            case "ProductCode" -> Optional.of(productCode);
            case "UnderlyingTradableInstrumentId" -> Optional.of(underlyingTradableInstrumentId);
            case "SettlementDate" -> Optional.of(settlementDate);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "OptionType" -> Optional.of(optionType);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "CfiCode" -> Optional.of(cfiCode);
            case "Isin" -> Optional.of(isin);
            case "TradeAtReference" -> Optional.of(tradeAtReference);
            case "PriceCode" -> Optional.of(priceCode);
            case "PromptDateLabel" -> Optional.of(promptDateLabel);
            case "PromptType" -> Optional.of(promptType);
            case "OptionStrikeRelativePosition" -> Optional.of(optionStrikeRelativePosition);
            case "StrategyTypeCode" -> Optional.of(strategyTypeCode);
            case "RemainingRecords" -> Optional.of(remainingRecords);
            case "RecordCount" -> Optional.of(recordCount);
            case "StrategyLegCount" -> Optional.of(strategyLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradableInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(definitionLegs.diffFields(message.definitionLegs));
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
            definitionLegs.toFormattedString(builder, options);
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
        definitionLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof TradableInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && definitionLegs.equals(message.definitionLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, definitionLegs);
    }
}
