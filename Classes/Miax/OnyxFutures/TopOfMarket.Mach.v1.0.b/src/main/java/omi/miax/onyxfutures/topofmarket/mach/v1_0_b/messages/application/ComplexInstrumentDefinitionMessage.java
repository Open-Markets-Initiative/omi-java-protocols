package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.CurrencyField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.ExchangeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentIdSourceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MatchAlgorithmField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MaximumSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MinimumSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.NumberOfLegsField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.ProductGroupCodeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.SettlementCurrencyField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.SpreadTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.StrategyIdField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TickField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TimestampField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TradingCollarVariationField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TradingCollarVariationTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnderlyingAssetField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnderlyingAssetTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnitOfMeasureField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnitOfMeasureQuantityField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.groups.InstrumentLegEntry;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.groups.InstrumentLegList;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Field;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Message;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.PrintOptions;

/**
 * Represents the ComplexInstrumentDefinitionMessage message from the TopOfMarket protocol.
 *
 * <p>Used to disseminate all Complex Instruments traded on MIAX Futures Onyx for the current trading session</p>
 */
public final class ComplexInstrumentDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0002';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Definition Message";

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique ID assigned by MIAX Futures Onyx for a Complex instrument and is permanent for the life of an instrument
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Underlying Asset Type of this instrument
     */
    private final UnderlyingAssetTypeField underlyingAssetType = new UnderlyingAssetTypeField();

    /**
     * Underlying Asset Code
     */
    private final UnderlyingAssetField underlyingAsset = new UnderlyingAssetField();

    /**
     * Product Group Code
     */
    private final ProductGroupCodeField productGroupCode = new ProductGroupCodeField();

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
     * ‘F’ = Futures
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
     * Trading Collar Variation Type
     */
    private final TradingCollarVariationTypeField tradingCollarVariationType = new TradingCollarVariationTypeField();

    /**
     * The Dollar Value or Percentage Value used in the calculation of theTrading Collar
     */
    private final TradingCollarVariationField tradingCollarVariation = new TradingCollarVariationField();

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
    private final List<Field> fields = List.of(timestampField, strategyId, underlyingAssetType, underlyingAsset, productGroupCode, spreadType, exchange, instrumentIdSource, instrumentType, currency, settlementCurrency, matchAlgorithm, minimumSize, maximumSize, tick, unitOfMeasure, unitOfMeasureQuantity, tradingCollarVariationType, tradingCollarVariation, numberOfLegs);

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
     * Unique ID assigned by MIAX Futures Onyx for a Complex instrument and is permanent for the life of an instrument
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Underlying Asset Type of this instrument
     *
     * @return the UnderlyingAssetType field
     */
    public UnderlyingAssetTypeField underlyingAssetType() {
        return underlyingAssetType;
    }

    /**
     * Underlying Asset Code
     *
     * @return the UnderlyingAsset field
     */
    public UnderlyingAssetField underlyingAsset() {
        return underlyingAsset;
    }

    /**
     * Product Group Code
     *
     * @return the ProductGroupCode field
     */
    public ProductGroupCodeField productGroupCode() {
        return productGroupCode;
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
     * ‘F’ = Futures
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
     * Trading Collar Variation Type
     *
     * @return the TradingCollarVariationType field
     */
    public TradingCollarVariationTypeField tradingCollarVariationType() {
        return tradingCollarVariationType;
    }

    /**
     * The Dollar Value or Percentage Value used in the calculation of theTrading Collar
     *
     * @return the TradingCollarVariation field
     */
    public TradingCollarVariationField tradingCollarVariation() {
        return tradingCollarVariation;
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
        cursor += 4;
        cursor += 6;
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
        cursor += 1;
        cursor += 8;
        runs.add(cursor).add(16);
        cursor += 16;
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
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!underlyingAssetType.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetTypeField.BYTE_LENGTH;
        if (!underlyingAsset.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetField.BYTE_LENGTH;
        if (!productGroupCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductGroupCodeField.BYTE_LENGTH;
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
        if (!tradingCollarVariationType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationTypeField.BYTE_LENGTH;
        if (!tradingCollarVariation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationField.BYTE_LENGTH;
        cursor += 16; // padding
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
        cursor = strategyId.encode(data, cursor);
        cursor = underlyingAssetType.encode(data, cursor);
        cursor = underlyingAsset.encode(data, cursor);
        cursor = productGroupCode.encode(data, cursor);
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
        cursor = tradingCollarVariationType.encode(data, cursor);
        cursor = tradingCollarVariation.encode(data, cursor);
        if (buffer != null && buffer.length >= 83) {
            System.arraycopy(buffer, 67, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!underlyingAssetType.isDecoded()) {
            return Optional.of(underlyingAssetType);
        }
        if (!underlyingAsset.isDecoded()) {
            return Optional.of(underlyingAsset);
        }
        if (!productGroupCode.isDecoded()) {
            return Optional.of(productGroupCode);
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
        if (!tradingCollarVariationType.isDecoded()) {
            return Optional.of(tradingCollarVariationType);
        }
        if (!tradingCollarVariation.isDecoded()) {
            return Optional.of(tradingCollarVariation);
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
            case "StrategyId" -> Optional.of(strategyId);
            case "UnderlyingAssetType" -> Optional.of(underlyingAssetType);
            case "UnderlyingAsset" -> Optional.of(underlyingAsset);
            case "ProductGroupCode" -> Optional.of(productGroupCode);
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
            case "TradingCollarVariationType" -> Optional.of(tradingCollarVariationType);
            case "TradingCollarVariation" -> Optional.of(tradingCollarVariation);
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
