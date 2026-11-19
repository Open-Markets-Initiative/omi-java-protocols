package omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.CfiCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ExerciseStyleField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ExpiryDateField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.IsinField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LastTradingDateField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LinkedTradableInstrumentIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MarketCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MarketSegmentCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.MergedTradableInstrumentIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.OptionTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.PriceCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.PromptDateLabelField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.PromptTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementPricingMethodField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.StrikePriceField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TickSizeIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingCurrencyField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.UnderlyingTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the OutrightDefinitionMessage message from the ReferenceDataSnapshot protocol.
 *
 * <p>Describes individual outright tradable instruments available from LMEsource.</p>
 */
public final class OutrightDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 121;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Outright Definition Message";

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
     * The TradableInstrumentID of the linked tradable instrument.
     */
    private final LinkedTradableInstrumentIdField linkedTradableInstrumentId = new LinkedTradableInstrumentIdField();

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
     * A unique code to identify the contract.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * The expiry date for this tradable instrument, as YYYYMMDD.
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Identifies whether the prompt is single or a range.
     */
    private final PromptTypeField promptType = new PromptTypeField();

    /**
     * The strike price for this tradable instrument, in implicit six decimal place format. Null for futures.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * For option tradable instruments, the type of option.
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Exercise Style. Null for futures.
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Prompt Date Label.
     */
    private final PromptDateLabelField promptDateLabel = new PromptDateLabelField();

    /**
     * A code to represent the Trade at Reference or Trade at Settlement price code.
     */
    private final PriceCodeField priceCode = new PriceCodeField();

    /**
     * ISIN Code. Space if not applicable.
     */
    private final IsinField isin = new IsinField();

    /**
     * The instrument classification code.
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, tradableInstrumentId, mergedTradableInstrumentId, linkedTradableInstrumentId, productCode, contractType, tradingCurrency, contractCode, expiryDate, promptType, strikePrice, optionType, exerciseStyle, promptDateLabel, priceCode, isin, cfiCode, marketCode, marketSegmentCode, tickSizeId, lotSize, lotSizeType, lastTradingDate, settlementType, settlementPricingMethod, underlyingType);

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
     * The TradableInstrumentID of the linked tradable instrument.
     *
     * @return the LinkedTradableInstrumentId field
     */
    public LinkedTradableInstrumentIdField linkedTradableInstrumentId() {
        return linkedTradableInstrumentId;
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
     * A unique code to identify the contract.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * The expiry date for this tradable instrument, as YYYYMMDD.
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Identifies whether the prompt is single or a range.
     *
     * @return the PromptType field
     */
    public PromptTypeField promptType() {
        return promptType;
    }

    /**
     * The strike price for this tradable instrument, in implicit six decimal place format. Null for futures.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * For option tradable instruments, the type of option.
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
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
     * Prompt Date Label.
     *
     * @return the PromptDateLabel field
     */
    public PromptDateLabelField promptDateLabel() {
        return promptDateLabel;
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
     * ISIN Code. Space if not applicable.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * The instrument classification code.
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!linkedTradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += LinkedTradableInstrumentIdField.BYTE_LENGTH;
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
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!promptType.parse(data, cursor)) {
            return false;
        }
        cursor += PromptTypeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!promptDateLabel.parse(data, cursor)) {
            return false;
        }
        cursor += PromptDateLabelField.BYTE_LENGTH;
        if (!priceCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCodeField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
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
        return underlyingType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = mergedTradableInstrumentId.encode(data, cursor);
        cursor = linkedTradableInstrumentId.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = promptType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = promptDateLabel.encode(data, cursor);
        cursor = priceCode.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = marketCode.encode(data, cursor);
        cursor = marketSegmentCode.encode(data, cursor);
        cursor = tickSizeId.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = lotSizeType.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = settlementPricingMethod.encode(data, cursor);
        cursor = underlyingType.encode(data, cursor);
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "MergedTradableInstrumentId" -> Optional.of(mergedTradableInstrumentId);
            case "LinkedTradableInstrumentId" -> Optional.of(linkedTradableInstrumentId);
            case "ProductCode" -> Optional.of(productCode);
            case "ContractType" -> Optional.of(contractType);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "ContractCode" -> Optional.of(contractCode);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "PromptType" -> Optional.of(promptType);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "PromptDateLabel" -> Optional.of(promptDateLabel);
            case "PriceCode" -> Optional.of(priceCode);
            case "Isin" -> Optional.of(isin);
            case "CfiCode" -> Optional.of(cfiCode);
            case "MarketCode" -> Optional.of(marketCode);
            case "MarketSegmentCode" -> Optional.of(marketSegmentCode);
            case "TickSizeId" -> Optional.of(tickSizeId);
            case "LotSize" -> Optional.of(lotSize);
            case "LotSizeType" -> Optional.of(lotSizeType);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "SettlementType" -> Optional.of(settlementType);
            case "SettlementPricingMethod" -> Optional.of(settlementPricingMethod);
            case "UnderlyingType" -> Optional.of(underlyingType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OutrightDefinitionMessage message)) {
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
        if (!(other instanceof OutrightDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
