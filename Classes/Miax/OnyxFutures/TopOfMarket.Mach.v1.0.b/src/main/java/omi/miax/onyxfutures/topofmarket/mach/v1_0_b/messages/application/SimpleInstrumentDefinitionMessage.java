package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.CurrencyField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.ExchangeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.HighLimitPriceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentIdField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentIdSourceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.InstrumentTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.LowLimitPriceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MatchAlgorithmField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MaturityMonthYearField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MaximumSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.MinimumSizeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.OpenInterestQuantityField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.ProductGroupCodeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.SettlementCurrencyField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.SettlementPriceField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.SettlementPriceTypeCalcMethodField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TickField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TimestampField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TotalVolumeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TradingCollarVariationField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.TradingCollarVariationTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnderlyingAssetField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnderlyingAssetTypeField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnitOfMeasureField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.fields.UnitOfMeasureQuantityField;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Field;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.Message;
import omi.miax.onyxfutures.topofmarket.mach.v1_0_b.types.PrintOptions;

/**
 * Represents the SimpleInstrumentDefinitionMessage message from the TopOfMarket protocol.
 *
 * <p>used to disseminate all Simple Instruments traded on MIAX FuturesOnyx for the current trading session</p>
 */
public final class SimpleInstrumentDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0001';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 119;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Instrument Definition Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 103, 16 };

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique ID assigned by MIAX Futures Onyx
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

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
     * Maturity Month-Year is the expiration date of a Simple Instrument
     */
    private final MaturityMonthYearField maturityMonthYear = new MaturityMonthYearField();

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
     * The previous day’s Settlement Price
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Actual or Theoretical Settlement Price Indicator
     */
    private final SettlementPriceTypeCalcMethodField settlementPriceTypeCalcMethod = new SettlementPriceTypeCalcMethodField();

    /**
     * The aggregate amount of volume that has traded from the prior Trading Day
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * The amount of aggregate open contracts in a Simple Instrument
     */
    private final OpenInterestQuantityField openInterestQuantity = new OpenInterestQuantityField();

    /**
     * The Upper Band of the Daily Trading Limit of a Futures Product
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * The Lower Band of the Daily Trading Limit of a Futures Product
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * Trading Collar Variation Type
     */
    private final TradingCollarVariationTypeField tradingCollarVariationType = new TradingCollarVariationTypeField();

    /**
     * The Dollar Value or Percentage Value used in the calculation of theTrading Collar
     */
    private final TradingCollarVariationField tradingCollarVariation = new TradingCollarVariationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentId, underlyingAssetType, underlyingAsset, productGroupCode, exchange, instrumentIdSource, instrumentType, maturityMonthYear, currency, settlementCurrency, matchAlgorithm, minimumSize, maximumSize, tick, unitOfMeasure, unitOfMeasureQuantity, settlementPrice, settlementPriceTypeCalcMethod, totalVolume, openInterestQuantity, highLimitPrice, lowLimitPrice, tradingCollarVariationType, tradingCollarVariation);

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
     * Unique ID assigned by MIAX Futures Onyx
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
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
     * Maturity Month-Year is the expiration date of a Simple Instrument
     *
     * @return the MaturityMonthYear field
     */
    public MaturityMonthYearField maturityMonthYear() {
        return maturityMonthYear;
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
     * The previous day’s Settlement Price
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
     * The aggregate amount of volume that has traded from the prior Trading Day
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * The amount of aggregate open contracts in a Simple Instrument
     *
     * @return the OpenInterestQuantity field
     */
    public OpenInterestQuantityField openInterestQuantity() {
        return openInterestQuantity;
    }

    /**
     * The Upper Band of the Daily Trading Limit of a Futures Product
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * The Lower Band of the Daily Trading Limit of a Futures Product
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
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

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
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
        if (!maturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearField.BYTE_LENGTH;
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
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!openInterestQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestQuantityField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!tradingCollarVariationType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationTypeField.BYTE_LENGTH;
        if (!tradingCollarVariation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationField.BYTE_LENGTH;
        cursor += 16; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = underlyingAssetType.encode(data, cursor);
        cursor = underlyingAsset.encode(data, cursor);
        cursor = productGroupCode.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = instrumentIdSource.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
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
        cursor = totalVolume.encode(data, cursor);
        cursor = openInterestQuantity.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = tradingCollarVariationType.encode(data, cursor);
        cursor = tradingCollarVariation.encode(data, cursor);
        if (buffer != null && buffer.length >= 103 + 16) {
            System.arraycopy(buffer, 103, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "UnderlyingAssetType" -> Optional.of(underlyingAssetType);
            case "UnderlyingAsset" -> Optional.of(underlyingAsset);
            case "ProductGroupCode" -> Optional.of(productGroupCode);
            case "Exchange" -> Optional.of(exchange);
            case "InstrumentIdSource" -> Optional.of(instrumentIdSource);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "MaturityMonthYear" -> Optional.of(maturityMonthYear);
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
            case "TotalVolume" -> Optional.of(totalVolume);
            case "OpenInterestQuantity" -> Optional.of(openInterestQuantity);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "TradingCollarVariationType" -> Optional.of(tradingCollarVariationType);
            case "TradingCollarVariation" -> Optional.of(tradingCollarVariation);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleInstrumentDefinitionMessage message)) {
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
        if (!(other instanceof SimpleInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
