package omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ExerciseStyleField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LastTradingDateField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MarketCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MarketSegmentCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MergedTradableInstrumentIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.PriceCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementPricingMethodField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.StrategyLegCountField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.StrategyTypeCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TickSizeIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingCurrencyField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.UnderlyingTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.groups.StrategyLegsEntry;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.groups.StrategyLegsList;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the StrategyDefinitionMessage message from the ReferenceDataSnapshot protocol.
 *
 * <p>Describes individual strategy tradable instruments available from LMEsource.</p>
 */
public final class StrategyDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Definition Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * The id of the security for which trades in this tradable instrument are held.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * The TradableInstrumentID of the merged tradable instrument. Null means no merged tradable instrument.
     */
    private final MergedTradableInstrumentIdField mergedTradableInstrumentId = new MergedTradableInstrumentIdField();

    /**
     * Product code.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Constant contract type.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Strategy Type.
     */
    private final StrategyTypeCodeField strategyTypeCode = new StrategyTypeCodeField();

    /**
     * A unique code to identify the contract.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Exercise Style. Null for futures.
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * A code to represent the Trade at Reference or Trade at Settlement price code.
     */
    private final PriceCodeField priceCode = new PriceCodeField();

    /**
     * Market Code.
     */
    private final MarketCodeField marketCode = new MarketCodeField();

    /**
     * A string identifier for the individual market segment to which the outright belongs.
     */
    private final MarketSegmentCodeField marketSegmentCode = new MarketSegmentCodeField();

    /**
     * Tick Size ID.
     */
    private final TickSizeIdField tickSizeId = new TickSizeIdField();

    /**
     * The lot size for this tradable instrument.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Lot Size Type.
     */
    private final LotSizeTypeField lotSizeType = new LotSizeTypeField();

    /**
     * Last Trading Date, as YYYYMMDD.
     */
    private final LastTradingDateField lastTradingDate = new LastTradingDateField();

    /**
     * Settlement Type.
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Settlement Pricing Method.
     */
    private final SettlementPricingMethodField settlementPricingMethod = new SettlementPricingMethodField();

    /**
     * Underlying Type.
     */
    private final UnderlyingTypeField underlyingType = new UnderlyingTypeField();

    /**
     * Number of legs of this strategy instrument.
     */
    private final StrategyLegCountField strategyLegCount = new StrategyLegCountField();

    /**
     * One leg of a strategy tradable instrument definition
     */
    private final StrategyLegsList strategyLegs = new StrategyLegsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, tradableInstrumentId, mergedTradableInstrumentId, productCode, contractType, tradingCurrency, strategyTypeCode, contractCode, exerciseStyle, priceCode, marketCode, marketSegmentCode, tickSizeId, lotSize, lotSizeType, lastTradingDate, settlementType, settlementPricingMethod, underlyingType, strategyLegCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * The id of the security for which trades in this tradable instrument are held.
     *
     * @return the TradableInstrumentId field
     */
    public TradableInstrumentIdField tradableInstrumentId() {
        return tradableInstrumentId;
    }

    /**
     * The TradableInstrumentID of the merged tradable instrument. Null means no merged tradable instrument.
     *
     * @return the MergedTradableInstrumentId field
     */
    public MergedTradableInstrumentIdField mergedTradableInstrumentId() {
        return mergedTradableInstrumentId;
    }

    /**
     * Product code.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
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
     * The currency code according to ISO 4217.
     *
     * @return the TradingCurrency field
     */
    public TradingCurrencyField tradingCurrency() {
        return tradingCurrency;
    }

    /**
     * Strategy Type.
     *
     * @return the StrategyTypeCode field
     */
    public StrategyTypeCodeField strategyTypeCode() {
        return strategyTypeCode;
    }

    /**
     * A unique code to identify the contract.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Exercise Style. Null for futures.
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * A code to represent the Trade at Reference or Trade at Settlement price code.
     *
     * @return the PriceCode field
     */
    public PriceCodeField priceCode() {
        return priceCode;
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
     * A string identifier for the individual market segment to which the outright belongs.
     *
     * @return the MarketSegmentCode field
     */
    public MarketSegmentCodeField marketSegmentCode() {
        return marketSegmentCode;
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
     * The lot size for this tradable instrument.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Lot Size Type.
     *
     * @return the LotSizeType field
     */
    public LotSizeTypeField lotSizeType() {
        return lotSizeType;
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
     * Settlement Type.
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Settlement Pricing Method.
     *
     * @return the SettlementPricingMethod field
     */
    public SettlementPricingMethodField settlementPricingMethod() {
        return settlementPricingMethod;
    }

    /**
     * Underlying Type.
     *
     * @return the UnderlyingType field
     */
    public UnderlyingTypeField underlyingType() {
        return underlyingType;
    }

    /**
     * Number of legs of this strategy instrument.
     *
     * @return the StrategyLegCount field
     */
    public StrategyLegCountField strategyLegCount() {
        return strategyLegCount;
    }

    /**
     * One leg of a strategy tradable instrument definition
     *
     * <p>Encode writes this list's size to the StrategyLegCount field.</p>
     *
     * @return the StrategyLegs entries
     */
    public StrategyLegsList strategyLegs() {
        return strategyLegs;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategyLegs.byteLength();
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
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!mergedTradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += MergedTradableInstrumentIdField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        if (!tradingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCurrencyField.BYTE_LENGTH;
        if (!strategyTypeCode.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyTypeCodeField.BYTE_LENGTH;
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!priceCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCodeField.BYTE_LENGTH;
        if (!marketCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCodeField.BYTE_LENGTH;
        if (!marketSegmentCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentCodeField.BYTE_LENGTH;
        if (!tickSizeId.parse(data, cursor)) {
            return false;
        }
        cursor += TickSizeIdField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!lotSizeType.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeTypeField.BYTE_LENGTH;
        if (!lastTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDateField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!settlementPricingMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPricingMethodField.BYTE_LENGTH;
        if (!underlyingType.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingTypeField.BYTE_LENGTH;
        if (!strategyLegCount.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLegCountField.BYTE_LENGTH;
        if (!strategyLegs.parse(data, cursor, end, strategyLegCount.value())) {
            return false;
        }
        cursor += strategyLegs.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        strategyLegCount.value(strategyLegs.size());
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = mergedTradableInstrumentId.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = strategyTypeCode.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = priceCode.encode(data, cursor);
        cursor = marketCode.encode(data, cursor);
        cursor = marketSegmentCode.encode(data, cursor);
        cursor = tickSizeId.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = lotSizeType.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = settlementPricingMethod.encode(data, cursor);
        cursor = underlyingType.encode(data, cursor);
        cursor = strategyLegCount.encode(data, cursor);
        cursor = strategyLegs.encode(data, cursor);
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
        strategyLegs.clear();
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
            if (field != strategyLegCount && !field.isRecognized()) {
                return false;
            }
        }
        return strategyLegs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != strategyLegCount && !field.isValid()) {
                return false;
            }
        }
        if (!strategyLegs.isValid()) {
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
        if (!tradingVenue.isDecoded()) {
            return Optional.of(tradingVenue);
        }
        if (!tradableInstrumentId.isDecoded()) {
            return Optional.of(tradableInstrumentId);
        }
        if (!mergedTradableInstrumentId.isDecoded()) {
            return Optional.of(mergedTradableInstrumentId);
        }
        if (!productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (!contractType.isDecoded()) {
            return Optional.of(contractType);
        }
        if (!tradingCurrency.isDecoded()) {
            return Optional.of(tradingCurrency);
        }
        if (!strategyTypeCode.isDecoded()) {
            return Optional.of(strategyTypeCode);
        }
        if (!contractCode.isDecoded()) {
            return Optional.of(contractCode);
        }
        if (!exerciseStyle.isDecoded()) {
            return Optional.of(exerciseStyle);
        }
        if (!priceCode.isDecoded()) {
            return Optional.of(priceCode);
        }
        if (!marketCode.isDecoded()) {
            return Optional.of(marketCode);
        }
        if (!marketSegmentCode.isDecoded()) {
            return Optional.of(marketSegmentCode);
        }
        if (!tickSizeId.isDecoded()) {
            return Optional.of(tickSizeId);
        }
        if (!lotSize.isDecoded()) {
            return Optional.of(lotSize);
        }
        if (!lotSizeType.isDecoded()) {
            return Optional.of(lotSizeType);
        }
        if (!lastTradingDate.isDecoded()) {
            return Optional.of(lastTradingDate);
        }
        if (!settlementType.isDecoded()) {
            return Optional.of(settlementType);
        }
        if (!settlementPricingMethod.isDecoded()) {
            return Optional.of(settlementPricingMethod);
        }
        if (!underlyingType.isDecoded()) {
            return Optional.of(underlyingType);
        }
        if (!strategyLegCount.isDecoded()) {
            return Optional.of(strategyLegCount);
        }
        if (!strategyLegs.isDecoded()) {
            return Optional.of(strategyLegs.failedEntry().flatMap(StrategyLegsEntry::failedAt).orElse(strategyLegCount));
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "MergedTradableInstrumentId" -> Optional.of(mergedTradableInstrumentId);
            case "ProductCode" -> Optional.of(productCode);
            case "ContractType" -> Optional.of(contractType);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "StrategyTypeCode" -> Optional.of(strategyTypeCode);
            case "ContractCode" -> Optional.of(contractCode);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "PriceCode" -> Optional.of(priceCode);
            case "MarketCode" -> Optional.of(marketCode);
            case "MarketSegmentCode" -> Optional.of(marketSegmentCode);
            case "TickSizeId" -> Optional.of(tickSizeId);
            case "LotSize" -> Optional.of(lotSize);
            case "LotSizeType" -> Optional.of(lotSizeType);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "SettlementType" -> Optional.of(settlementType);
            case "SettlementPricingMethod" -> Optional.of(settlementPricingMethod);
            case "UnderlyingType" -> Optional.of(underlyingType);
            case "StrategyLegCount" -> Optional.of(strategyLegCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strategyLegs.diffFields(message.strategyLegs));
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
            strategyLegs.toFormattedString(builder, options);
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
        strategyLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategyDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strategyLegs.equals(message.strategyLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strategyLegs);
    }
}
