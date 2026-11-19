package omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractPriceTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ContractTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ExerciseStyleField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.FirstTradingDateField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotSizeTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.LotUnitField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.NameField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.ProductCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementPricingMethodField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.SettlementTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingCurrencyField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.UnderlyingContractCodeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.fields.UnderlyingTypeField;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the ContractDefinitionMessage message from the ReferenceDataSnapshot protocol.
 *
 * <p>Published for a new contract prior to its first trading date, to enable participants to configure risk management parameters before the contract becomes tradable.</p>
 */
public final class ContractDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 134;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Contract Definition Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * A unique code to identify the contract.
     */
    private final ContractCodeField contractCode = new ContractCodeField();

    /**
     * Name of the contract.
     */
    private final NameField nameField = new NameField();

    /**
     * Constant contract type.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * Product code.
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Underlying Type.
     */
    private final UnderlyingTypeField underlyingType = new UnderlyingTypeField();

    /**
     * Reference to the underlying contract.
     */
    private final UnderlyingContractCodeField underlyingContractCode = new UnderlyingContractCodeField();

    /**
     * The currency code according to ISO 4217.
     */
    private final TradingCurrencyField tradingCurrency = new TradingCurrencyField();

    /**
     * Settlement Type.
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Settlement Pricing Method.
     */
    private final SettlementPricingMethodField settlementPricingMethod = new SettlementPricingMethodField();

    /**
     * Exercise Style. Null for futures.
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Lot Unit.
     */
    private final LotUnitField lotUnit = new LotUnitField();

    /**
     * The lot size for this tradable instrument.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Lot Size Type.
     */
    private final LotSizeTypeField lotSizeType = new LotSizeTypeField();

    /**
     * Price for futures, premium or volatility for options. The specification names this field PriceType; it is qualified here because the Reference Price message gives a PriceType of its own carrying a different set of values.
     */
    private final ContractPriceTypeField contractPriceType = new ContractPriceTypeField();

    /**
     * First Trading Date, as YYYYMMDD.
     */
    private final FirstTradingDateField firstTradingDate = new FirstTradingDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, contractCode, nameField, contractType, productCode, underlyingType, underlyingContractCode, tradingCurrency, settlementType, settlementPricingMethod, exerciseStyle, lotUnit, lotSize, lotSizeType, contractPriceType, firstTradingDate);

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
     * A unique code to identify the contract.
     *
     * @return the ContractCode field
     */
    public ContractCodeField contractCode() {
        return contractCode;
    }

    /**
     * Name of the contract.
     *
     * @return the Name field
     */
    public NameField nameField() {
        return nameField;
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
     * Product code.
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
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
     * Reference to the underlying contract.
     *
     * @return the UnderlyingContractCode field
     */
    public UnderlyingContractCodeField underlyingContractCode() {
        return underlyingContractCode;
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
     * Exercise Style. Null for futures.
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Lot Unit.
     *
     * @return the LotUnit field
     */
    public LotUnitField lotUnit() {
        return lotUnit;
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
     * Price for futures, premium or volatility for options. The specification names this field PriceType; it is qualified here because the Reference Price message gives a PriceType of its own carrying a different set of values.
     *
     * @return the ContractPriceType field
     */
    public ContractPriceTypeField contractPriceType() {
        return contractPriceType;
    }

    /**
     * First Trading Date, as YYYYMMDD.
     *
     * @return the FirstTradingDate field
     */
    public FirstTradingDateField firstTradingDate() {
        return firstTradingDate;
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
        if (!contractCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractCodeField.BYTE_LENGTH;
        if (!nameField.parse(data, cursor)) {
            return false;
        }
        cursor += NameField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!underlyingType.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingTypeField.BYTE_LENGTH;
        if (!underlyingContractCode.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingContractCodeField.BYTE_LENGTH;
        if (!tradingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCurrencyField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!settlementPricingMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPricingMethodField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!lotUnit.parse(data, cursor)) {
            return false;
        }
        cursor += LotUnitField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!lotSizeType.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeTypeField.BYTE_LENGTH;
        if (!contractPriceType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractPriceTypeField.BYTE_LENGTH;
        return firstTradingDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = contractCode.encode(data, cursor);
        cursor = nameField.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = underlyingType.encode(data, cursor);
        cursor = underlyingContractCode.encode(data, cursor);
        cursor = tradingCurrency.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = settlementPricingMethod.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = lotUnit.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = lotSizeType.encode(data, cursor);
        cursor = contractPriceType.encode(data, cursor);
        cursor = firstTradingDate.encode(data, cursor);
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
            case "ContractCode" -> Optional.of(contractCode);
            case "Name" -> Optional.of(nameField);
            case "ContractType" -> Optional.of(contractType);
            case "ProductCode" -> Optional.of(productCode);
            case "UnderlyingType" -> Optional.of(underlyingType);
            case "UnderlyingContractCode" -> Optional.of(underlyingContractCode);
            case "TradingCurrency" -> Optional.of(tradingCurrency);
            case "SettlementType" -> Optional.of(settlementType);
            case "SettlementPricingMethod" -> Optional.of(settlementPricingMethod);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "LotUnit" -> Optional.of(lotUnit);
            case "LotSize" -> Optional.of(lotSize);
            case "LotSizeType" -> Optional.of(lotSizeType);
            case "ContractPriceType" -> Optional.of(contractPriceType);
            case "FirstTradingDate" -> Optional.of(firstTradingDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ContractDefinitionMessage message)) {
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
        if (!(other instanceof ContractDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
