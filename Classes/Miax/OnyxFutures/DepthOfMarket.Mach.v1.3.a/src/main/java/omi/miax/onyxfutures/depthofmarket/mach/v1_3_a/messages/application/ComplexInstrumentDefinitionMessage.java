package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.CurrencyField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ExchangeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.FirstTradeDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentIdField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentIdSourceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentListingStatusField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MatchAlgorithmField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MaximumSizeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MinimumSizeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.NumberOfLegsField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ProductGroupCodeAlphanumericField2;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementCurrencyField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementPriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementPriceTypeCalcMethodField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SpreadTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TickField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TimestampField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TradingCollarVariationField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TradingCollarVariationTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnderlyingAssetAlphanumericField2;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnderlyingAssetTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnitOfMeasureField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnitOfMeasureQuantityField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.groups.InstrumentLegEntry;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.groups.InstrumentLegList;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Field;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Message;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDefinitionMessage message from the DepthOfMarket protocol.
 *
 * <p>Complex Instrument Definition</p>
 */
public final class ComplexInstrumentDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0011';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 156;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Definition Message";

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Underlying Asset Type of this instrument:
     */
    private final UnderlyingAssetTypeField underlyingAssetType = new UnderlyingAssetTypeField();

    /**
     * Underlying Asset Code
     */
    private final UnderlyingAssetAlphanumericField2 underlyingAssetAlphanumeric = new UnderlyingAssetAlphanumericField2();

    /**
     * Product Group Code: e.g.: MWE for Hard Red Spring Wheat Standard Deliverable (5000 Bushels) Cross Product Spread example: XXX-YYY
     */
    private final ProductGroupCodeAlphanumericField2 productGroupCodeAlphanumeric = new ProductGroupCodeAlphanumericField2();

    /**
     * Spread Type
     */
    private final SpreadTypeField spreadType = new SpreadTypeField();

    /**
     * Exchange
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * Indicates whether the Instrument ID has been assigned by the exchange or from an external industry source
     */
    private final InstrumentIdSourceField instrumentIdSource = new InstrumentIdSourceField();

    /**
     * Instrument Type
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * The currency in which all Futures Instruments of the Futures Product will trade
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The Currency in which the Product settles
     */
    private final SettlementCurrencyField settlementCurrency = new SettlementCurrencyField();

    /**
     * The allocation model used by the MIAX Futures Onyx Trading Platform for the Product
     */
    private final MatchAlgorithmField matchAlgorithm = new MatchAlgorithmField();

    /**
     * Minimum Order Size
     */
    private final MinimumSizeField minimumSize = new MinimumSizeField();

    /**
     * Maximum Order Size
     */
    private final MaximumSizeField maximumSize = new MaximumSizeField();

    /**
     * Order Entry Price Tick of the Product
     */
    private final TickField tick = new TickField();

    /**
     * Individual unit of the Deliverable of the Underlying Asset associated with the Futures Contract
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * The quantity of the Underlying Asset that is required for the Deliverable associated with the Futures Contract
     */
    private final UnitOfMeasureQuantityField unitOfMeasureQuantity = new UnitOfMeasureQuantityField();

    /**
     * The previous day
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Actual or Theoretical Settlement Price Indicator
     */
    private final SettlementPriceTypeCalcMethodField settlementPriceTypeCalcMethod = new SettlementPriceTypeCalcMethodField();

    /**
     * Trading Collar Variation Type
     */
    private final TradingCollarVariationTypeField tradingCollarVariationType = new TradingCollarVariationTypeField();

    /**
     * The Dollar Value or Percentage Value used in the calculation of the Trading Collar
     */
    private final TradingCollarVariationField tradingCollarVariation = new TradingCollarVariationField();

    /**
     * Instrument Listing Status
     */
    private final InstrumentListingStatusField instrumentListingStatus = new InstrumentListingStatusField();

    /**
     * First Trade Date will be the Trading Date that the Simple Instrument is initially made available for Trading on MIAX Futures Onyx
     */
    private final FirstTradeDateField firstTradeDate = new FirstTradeDateField();

    /**
     * Number of strategy legs
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Complex Strategy Number of Legs
     */
    private final InstrumentLegList instrumentLeg = new InstrumentLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentId, underlyingAssetType, underlyingAssetAlphanumeric, productGroupCodeAlphanumeric, spreadType, exchange, instrumentIdSource, instrumentType, currency, settlementCurrency, matchAlgorithm, minimumSize, maximumSize, tick, unitOfMeasure, unitOfMeasureQuantity, settlementPrice, settlementPriceTypeCalcMethod, tradingCollarVariationType, tradingCollarVariation, instrumentListingStatus, firstTradeDate, numberOfLegs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching Engine time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Underlying Asset Type of this instrument:
     *
     * @return the UnderlyingAssetType field
     */
    public UnderlyingAssetTypeField underlyingAssetType() {
        return underlyingAssetType;
    }

    /**
     * Underlying Asset Code
     *
     * @return the UnderlyingAssetAlphanumeric field
     */
    public UnderlyingAssetAlphanumericField2 underlyingAssetAlphanumeric() {
        return underlyingAssetAlphanumeric;
    }

    /**
     * Product Group Code: e.g.: MWE for Hard Red Spring Wheat Standard Deliverable (5000 Bushels) Cross Product Spread example: XXX-YYY
     *
     * @return the ProductGroupCodeAlphanumeric field
     */
    public ProductGroupCodeAlphanumericField2 productGroupCodeAlphanumeric() {
        return productGroupCodeAlphanumeric;
    }

    /**
     * Spread Type
     *
     * @return the SpreadType field
     */
    public SpreadTypeField spreadType() {
        return spreadType;
    }

    /**
     * Exchange
     *
     * @return the Exchange field
     */
    public ExchangeField exchange() {
        return exchange;
    }

    /**
     * Indicates whether the Instrument ID has been assigned by the exchange or from an external industry source
     *
     * @return the InstrumentIdSource field
     */
    public InstrumentIdSourceField instrumentIdSource() {
        return instrumentIdSource;
    }

    /**
     * Instrument Type
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * The currency in which all Futures Instruments of the Futures Product will trade
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The Currency in which the Product settles
     *
     * @return the SettlementCurrency field
     */
    public SettlementCurrencyField settlementCurrency() {
        return settlementCurrency;
    }

    /**
     * The allocation model used by the MIAX Futures Onyx Trading Platform for the Product
     *
     * @return the MatchAlgorithm field
     */
    public MatchAlgorithmField matchAlgorithm() {
        return matchAlgorithm;
    }

    /**
     * Minimum Order Size
     *
     * @return the MinimumSize field
     */
    public MinimumSizeField minimumSize() {
        return minimumSize;
    }

    /**
     * Maximum Order Size
     *
     * @return the MaximumSize field
     */
    public MaximumSizeField maximumSize() {
        return maximumSize;
    }

    /**
     * Order Entry Price Tick of the Product
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
    }

    /**
     * Individual unit of the Deliverable of the Underlying Asset associated with the Futures Contract
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * The quantity of the Underlying Asset that is required for the Deliverable associated with the Futures Contract
     *
     * @return the UnitOfMeasureQuantity field
     */
    public UnitOfMeasureQuantityField unitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * The previous day
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * Actual or Theoretical Settlement Price Indicator
     *
     * @return the SettlementPriceTypeCalcMethod field
     */
    public SettlementPriceTypeCalcMethodField settlementPriceTypeCalcMethod() {
        return settlementPriceTypeCalcMethod;
    }

    /**
     * Trading Collar Variation Type
     *
     * @return the TradingCollarVariationType field
     */
    public TradingCollarVariationTypeField tradingCollarVariationType() {
        return tradingCollarVariationType;
    }

    /**
     * The Dollar Value or Percentage Value used in the calculation of the Trading Collar
     *
     * @return the TradingCollarVariation field
     */
    public TradingCollarVariationField tradingCollarVariation() {
        return tradingCollarVariation;
    }

    /**
     * Instrument Listing Status
     *
     * @return the InstrumentListingStatus field
     */
    public InstrumentListingStatusField instrumentListingStatus() {
        return instrumentListingStatus;
    }

    /**
     * First Trade Date will be the Trading Date that the Simple Instrument is initially made available for Trading on MIAX Futures Onyx
     *
     * @return the FirstTradeDate field
     */
    public FirstTradeDateField firstTradeDate() {
        return firstTradeDate;
    }

    /**
     * Number of strategy legs
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Complex Strategy Number of Legs
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the InstrumentLeg entries
     */
    public InstrumentLegList instrumentLeg() {
        return instrumentLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrumentLeg.byteLength();
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
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 9;
        cursor += 13;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 5;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 2;
        runs.add(cursor).add(64);
        cursor += 64;
        cursor += 1;
        cursor = instrumentLeg.padding(runs, cursor);
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!underlyingAssetType.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetTypeField.BYTE_LENGTH;
        if (!underlyingAssetAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetAlphanumericField2.BYTE_LENGTH;
        if (!productGroupCodeAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += ProductGroupCodeAlphanumericField2.BYTE_LENGTH;
        if (!spreadType.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadTypeField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!instrumentIdSource.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdSourceField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!settlementCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementCurrencyField.BYTE_LENGTH;
        if (!matchAlgorithm.parse(data, cursor)) {
            return false;
        }
        cursor += MatchAlgorithmField.BYTE_LENGTH;
        if (!minimumSize.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumSizeField.BYTE_LENGTH;
        if (!maximumSize.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumSizeField.BYTE_LENGTH;
        if (!tick.parse(data, cursor)) {
            return false;
        }
        cursor += TickField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!unitOfMeasureQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQuantityField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!settlementPriceTypeCalcMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceTypeCalcMethodField.BYTE_LENGTH;
        if (!tradingCollarVariationType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationTypeField.BYTE_LENGTH;
        if (!tradingCollarVariation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationField.BYTE_LENGTH;
        if (!instrumentListingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentListingStatusField.BYTE_LENGTH;
        if (!firstTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradeDateField.BYTE_LENGTH;
        cursor += 64; // padding
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!instrumentLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += instrumentLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (instrumentLeg.size() > 255) {
            throw new IllegalStateException("instrumentLeg holds " + instrumentLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) instrumentLeg.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = underlyingAssetType.encode(data, cursor);
        cursor = underlyingAssetAlphanumeric.encode(data, cursor);
        cursor = productGroupCodeAlphanumeric.encode(data, cursor);
        cursor = spreadType.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = instrumentIdSource.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = settlementCurrency.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = minimumSize.encode(data, cursor);
        cursor = maximumSize.encode(data, cursor);
        cursor = tick.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQuantity.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = settlementPriceTypeCalcMethod.encode(data, cursor);
        cursor = tradingCollarVariationType.encode(data, cursor);
        cursor = tradingCollarVariation.encode(data, cursor);
        cursor = instrumentListingStatus.encode(data, cursor);
        cursor = firstTradeDate.encode(data, cursor);
        if (buffer != null && buffer.length >= 155) {
            System.arraycopy(buffer, 91, data, cursor, 64); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 64, (byte) 0); // padding
        }
        cursor += 64;
        cursor = numberOfLegs.encode(data, cursor);
        cursor = instrumentLeg.encode(data, cursor);
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
        instrumentLeg.clear();
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
            if (field != numberOfLegs && !field.isRecognized()) {
                return false;
            }
        }
        return instrumentLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!instrumentLeg.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!underlyingAssetType.isDecoded()) {
            return Optional.of(underlyingAssetType);
        }
        if (!underlyingAssetAlphanumeric.isDecoded()) {
            return Optional.of(underlyingAssetAlphanumeric);
        }
        if (!productGroupCodeAlphanumeric.isDecoded()) {
            return Optional.of(productGroupCodeAlphanumeric);
        }
        if (!spreadType.isDecoded()) {
            return Optional.of(spreadType);
        }
        if (!exchange.isDecoded()) {
            return Optional.of(exchange);
        }
        if (!instrumentIdSource.isDecoded()) {
            return Optional.of(instrumentIdSource);
        }
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!settlementCurrency.isDecoded()) {
            return Optional.of(settlementCurrency);
        }
        if (!matchAlgorithm.isDecoded()) {
            return Optional.of(matchAlgorithm);
        }
        if (!minimumSize.isDecoded()) {
            return Optional.of(minimumSize);
        }
        if (!maximumSize.isDecoded()) {
            return Optional.of(maximumSize);
        }
        if (!tick.isDecoded()) {
            return Optional.of(tick);
        }
        if (!unitOfMeasure.isDecoded()) {
            return Optional.of(unitOfMeasure);
        }
        if (!unitOfMeasureQuantity.isDecoded()) {
            return Optional.of(unitOfMeasureQuantity);
        }
        if (!settlementPrice.isDecoded()) {
            return Optional.of(settlementPrice);
        }
        if (!settlementPriceTypeCalcMethod.isDecoded()) {
            return Optional.of(settlementPriceTypeCalcMethod);
        }
        if (!tradingCollarVariationType.isDecoded()) {
            return Optional.of(tradingCollarVariationType);
        }
        if (!tradingCollarVariation.isDecoded()) {
            return Optional.of(tradingCollarVariation);
        }
        if (!instrumentListingStatus.isDecoded()) {
            return Optional.of(instrumentListingStatus);
        }
        if (!firstTradeDate.isDecoded()) {
            return Optional.of(firstTradeDate);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!instrumentLeg.isDecoded()) {
            return Optional.of(instrumentLeg.failedEntry().flatMap(InstrumentLegEntry::failedAt).orElse(numberOfLegs));
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "UnderlyingAssetType" -> Optional.of(underlyingAssetType);
            case "UnderlyingAssetAlphanumeric" -> Optional.of(underlyingAssetAlphanumeric);
            case "ProductGroupCodeAlphanumeric" -> Optional.of(productGroupCodeAlphanumeric);
            case "SpreadType" -> Optional.of(spreadType);
            case "Exchange" -> Optional.of(exchange);
            case "InstrumentIdSource" -> Optional.of(instrumentIdSource);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "Currency" -> Optional.of(currency);
            case "SettlementCurrency" -> Optional.of(settlementCurrency);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MinimumSize" -> Optional.of(minimumSize);
            case "MaximumSize" -> Optional.of(maximumSize);
            case "Tick" -> Optional.of(tick);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQuantity" -> Optional.of(unitOfMeasureQuantity);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "SettlementPriceTypeCalcMethod" -> Optional.of(settlementPriceTypeCalcMethod);
            case "TradingCollarVariationType" -> Optional.of(tradingCollarVariationType);
            case "TradingCollarVariation" -> Optional.of(tradingCollarVariation);
            case "InstrumentListingStatus" -> Optional.of(instrumentListingStatus);
            case "FirstTradeDate" -> Optional.of(firstTradeDate);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrumentLeg.diffFields(message.instrumentLeg));
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
            instrumentLeg.toFormattedString(builder, options);
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
        instrumentLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrumentLeg.equals(message.instrumentLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrumentLeg);
    }
}
