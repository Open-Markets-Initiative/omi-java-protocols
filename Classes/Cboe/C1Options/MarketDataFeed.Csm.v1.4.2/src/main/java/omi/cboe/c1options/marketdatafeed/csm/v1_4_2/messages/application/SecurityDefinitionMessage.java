package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.ClassKeyField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.ContractSizeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.ExerciseStyleField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.MaturityDateField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.NoLegsField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.PriceTypeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.PutOrCallField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.SecurityExchangeField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.fields.SecurityIdField;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.SecurityDefinitionLegEntry;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.groups.SecurityDefinitionLegList;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.CurrencyCode;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.MaxStrikePrice;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.MinimumAbovePremiumFraction;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.MinimumBelowPremiumFraction;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.MinimumStrikePriceFraction;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.PremiumBreakPoint;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.SecurityType;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.StrikePrice;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.Symbol;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.TargetLocationId;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.UnderlyingSymbol;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.structs.UnderlyingType;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Field;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Message;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the MarketDataFeed protocol.
 *
 * <p>Security definitions describe an exchange’s products by name and trading parameters and associates those products with a product security ID.</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\r';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 61;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Class key
     */
    private final ClassKeyField classKey = new ClassKeyField();

    /**
     * Product key
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Expiration date: Format is “YYYYMMDD”. This field is required for options and futures
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Specifies how to interpret the value in the StrikePrice field.
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * This field is required for options.
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Exercise Style
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * The number of contracts per unit of size
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Num. of Legs in a strategy product. Only used for products that contain legs such as strategies. Will not exceed 255.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Security Definition Leg
     */
    private final SecurityDefinitionLegList securityDefinitionLeg = new SecurityDefinitionLegList();

    /**
     * Security Type
     */
    private final SecurityType securityType = new SecurityType();

    /**
     * Symbol
     */
    private final Symbol symbol = new Symbol();

    /**
     * Target Location Id
     */
    private final TargetLocationId targetLocationId = new TargetLocationId();

    /**
     * Strike Price
     */
    private final StrikePrice strikePrice = new StrikePrice();

    /**
     * Minimum Strike Price Fraction
     */
    private final MinimumStrikePriceFraction minimumStrikePriceFraction = new MinimumStrikePriceFraction();

    /**
     * Max Strike Price
     */
    private final MaxStrikePrice maxStrikePrice = new MaxStrikePrice();

    /**
     * Premium Break Point
     */
    private final PremiumBreakPoint premiumBreakPoint = new PremiumBreakPoint();

    /**
     * Minimum Above Premium Fraction
     */
    private final MinimumAbovePremiumFraction minimumAbovePremiumFraction = new MinimumAbovePremiumFraction();

    /**
     * Minimum Below Premium Fraction
     */
    private final MinimumBelowPremiumFraction minimumBelowPremiumFraction = new MinimumBelowPremiumFraction();

    /**
     * Currency Code
     */
    private final CurrencyCode currencyCode = new CurrencyCode();

    /**
     * Underlying Symbol
     */
    private final UnderlyingSymbol underlyingSymbol = new UnderlyingSymbol();

    /**
     * Underlying Type
     */
    private final UnderlyingType underlyingType = new UnderlyingType();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(securityType.fields(), List.<Field>of(securityExchange), symbol.fields(), targetLocationId.fields(), List.<Field>of(classKey), List.<Field>of(securityId), List.<Field>of(maturityDate), List.<Field>of(priceType), strikePrice.fields(), List.<Field>of(putOrCall), minimumStrikePriceFraction.fields(), maxStrikePrice.fields(), premiumBreakPoint.fields(), minimumAbovePremiumFraction.fields(), minimumBelowPremiumFraction.fields(), List.<Field>of(exerciseStyle), currencyCode.fields(), underlyingSymbol.fields(), underlyingType.fields(), List.<Field>of(contractSize), List.<Field>of(noLegs)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * Class key
     *
     * @return the ClassKey field
     */
    public ClassKeyField classKey() {
        return classKey;
    }

    /**
     * Product key
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Expiration date: Format is “YYYYMMDD”. This field is required for options and futures
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Specifies how to interpret the value in the StrikePrice field.
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * This field is required for options.
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Exercise Style
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * The number of contracts per unit of size
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Num. of Legs in a strategy product. Only used for products that contain legs such as strategies. Will not exceed 255.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Security Definition Leg
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the SecurityDefinitionLeg entries
     */
    public SecurityDefinitionLegList securityDefinitionLeg() {
        return securityDefinitionLeg;
    }

    /**
     * Security Type
     *
     * @return the SecurityType record
     */
    public SecurityType securityType() {
        return securityType;
    }

    /**
     * Symbol
     *
     * @return the Symbol record
     */
    public Symbol symbol() {
        return symbol;
    }

    /**
     * Target Location Id
     *
     * @return the TargetLocationId record
     */
    public TargetLocationId targetLocationId() {
        return targetLocationId;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice record
     */
    public StrikePrice strikePrice() {
        return strikePrice;
    }

    /**
     * Minimum Strike Price Fraction
     *
     * @return the MinimumStrikePriceFraction record
     */
    public MinimumStrikePriceFraction minimumStrikePriceFraction() {
        return minimumStrikePriceFraction;
    }

    /**
     * Max Strike Price
     *
     * @return the MaxStrikePrice record
     */
    public MaxStrikePrice maxStrikePrice() {
        return maxStrikePrice;
    }

    /**
     * Premium Break Point
     *
     * @return the PremiumBreakPoint record
     */
    public PremiumBreakPoint premiumBreakPoint() {
        return premiumBreakPoint;
    }

    /**
     * Minimum Above Premium Fraction
     *
     * @return the MinimumAbovePremiumFraction record
     */
    public MinimumAbovePremiumFraction minimumAbovePremiumFraction() {
        return minimumAbovePremiumFraction;
    }

    /**
     * Minimum Below Premium Fraction
     *
     * @return the MinimumBelowPremiumFraction record
     */
    public MinimumBelowPremiumFraction minimumBelowPremiumFraction() {
        return minimumBelowPremiumFraction;
    }

    /**
     * Currency Code
     *
     * @return the CurrencyCode record
     */
    public CurrencyCode currencyCode() {
        return currencyCode;
    }

    /**
     * Underlying Symbol
     *
     * @return the UnderlyingSymbol record
     */
    public UnderlyingSymbol underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Underlying Type
     *
     * @return the UnderlyingType record
     */
    public UnderlyingType underlyingType() {
        return underlyingType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityType.byteLength() - SecurityType.MINIMUM_BYTE_LENGTH + symbol.byteLength() - Symbol.MINIMUM_BYTE_LENGTH + targetLocationId.byteLength() - TargetLocationId.MINIMUM_BYTE_LENGTH + currencyCode.byteLength() - CurrencyCode.MINIMUM_BYTE_LENGTH + underlyingSymbol.byteLength() - UnderlyingSymbol.MINIMUM_BYTE_LENGTH + underlyingType.byteLength() - UnderlyingType.MINIMUM_BYTE_LENGTH + securityDefinitionLeg.byteLength();
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
        if (!securityType.parseFrom(data, cursor, end - 60)) {
            return false;
        }
        cursor += securityType.byteLength();
        if (end - cursor < 60) {
            return false;
        }
        if (!securityExchange.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityExchangeField.BYTE_LENGTH;
        if (!symbol.parseFrom(data, cursor, end - 58)) {
            return false;
        }
        cursor += symbol.byteLength();
        if (end - cursor < 58) {
            return false;
        }
        if (!targetLocationId.parseFrom(data, cursor, end - 57)) {
            return false;
        }
        cursor += targetLocationId.byteLength();
        if (end - cursor < 57) {
            return false;
        }
        if (!classKey.parse(data, cursor)) {
            return false;
        }
        cursor += ClassKeyField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!priceType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTypeField.BYTE_LENGTH;
        if (!strikePrice.parseFrom(data, cursor, end - 35)) {
            return false;
        }
        cursor += strikePrice.byteLength();
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!minimumStrikePriceFraction.parseFrom(data, cursor, end - 29)) {
            return false;
        }
        cursor += minimumStrikePriceFraction.byteLength();
        if (!maxStrikePrice.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += maxStrikePrice.byteLength();
        if (!premiumBreakPoint.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += premiumBreakPoint.byteLength();
        if (!minimumAbovePremiumFraction.parseFrom(data, cursor, end - 14)) {
            return false;
        }
        cursor += minimumAbovePremiumFraction.byteLength();
        if (!minimumBelowPremiumFraction.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += minimumBelowPremiumFraction.byteLength();
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!currencyCode.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += currencyCode.byteLength();
        if (end - cursor < 7) {
            return false;
        }
        if (!underlyingSymbol.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += underlyingSymbol.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!underlyingType.parseFrom(data, cursor, end - 5)) {
            return false;
        }
        cursor += underlyingType.byteLength();
        if (end - cursor < 5) {
            return false;
        }
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!securityDefinitionLeg.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += securityDefinitionLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (securityDefinitionLeg.size() > 255) {
            throw new IllegalStateException("securityDefinitionLeg holds " + securityDefinitionLeg.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) securityDefinitionLeg.size());
        int cursor = offset;
        cursor = securityType.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = targetLocationId.encode(data, cursor);
        cursor = classKey.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = priceType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = minimumStrikePriceFraction.encode(data, cursor);
        cursor = maxStrikePrice.encode(data, cursor);
        cursor = premiumBreakPoint.encode(data, cursor);
        cursor = minimumAbovePremiumFraction.encode(data, cursor);
        cursor = minimumBelowPremiumFraction.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = underlyingType.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = securityDefinitionLeg.encode(data, cursor);
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
        securityType.clear();
        symbol.clear();
        targetLocationId.clear();
        strikePrice.clear();
        minimumStrikePriceFraction.clear();
        maxStrikePrice.clear();
        premiumBreakPoint.clear();
        minimumAbovePremiumFraction.clear();
        minimumBelowPremiumFraction.clear();
        currencyCode.clear();
        underlyingSymbol.clear();
        underlyingType.clear();
        securityDefinitionLeg.clear();
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
            if (field != securityType.securityTypeLength() && field != symbol.symbolLength() && field != targetLocationId.targetLocationIdLength() && field != currencyCode.currencyCodeLength() && field != underlyingSymbol.underlyingSymbolLength() && field != underlyingType.underlyingTypeLength() && field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return securityDefinitionLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != securityType.securityTypeLength() && field != symbol.symbolLength() && field != targetLocationId.targetLocationIdLength() && field != currencyCode.currencyCodeLength() && field != underlyingSymbol.underlyingSymbolLength() && field != underlyingType.underlyingTypeLength() && field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!securityDefinitionLeg.isValid()) {
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
        if (!securityType.isDecoded()) {
            return securityType.failedAt();
        }
        if (!securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
        }
        if (!symbol.isDecoded()) {
            return symbol.failedAt();
        }
        if (!targetLocationId.isDecoded()) {
            return targetLocationId.failedAt();
        }
        if (!classKey.isDecoded()) {
            return Optional.of(classKey);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!priceType.isDecoded()) {
            return Optional.of(priceType);
        }
        if (!strikePrice.isDecoded()) {
            return strikePrice.failedAt();
        }
        if (!putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (!minimumStrikePriceFraction.isDecoded()) {
            return minimumStrikePriceFraction.failedAt();
        }
        if (!maxStrikePrice.isDecoded()) {
            return maxStrikePrice.failedAt();
        }
        if (!premiumBreakPoint.isDecoded()) {
            return premiumBreakPoint.failedAt();
        }
        if (!minimumAbovePremiumFraction.isDecoded()) {
            return minimumAbovePremiumFraction.failedAt();
        }
        if (!minimumBelowPremiumFraction.isDecoded()) {
            return minimumBelowPremiumFraction.failedAt();
        }
        if (!exerciseStyle.isDecoded()) {
            return Optional.of(exerciseStyle);
        }
        if (!currencyCode.isDecoded()) {
            return currencyCode.failedAt();
        }
        if (!underlyingSymbol.isDecoded()) {
            return underlyingSymbol.failedAt();
        }
        if (!underlyingType.isDecoded()) {
            return underlyingType.failedAt();
        }
        if (!contractSize.isDecoded()) {
            return Optional.of(contractSize);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!securityDefinitionLeg.isDecoded()) {
            return Optional.of(securityDefinitionLeg.failedEntry().flatMap(SecurityDefinitionLegEntry::failedAt).orElse(noLegs));
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
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "ClassKey" -> Optional.of(classKey);
            case "SecurityId" -> Optional.of(securityId);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "PriceType" -> Optional.of(priceType);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "ContractSize" -> Optional.of(contractSize);
            case "NoLegs" -> Optional.of(noLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityDefinitionLeg.diffFields(message.securityDefinitionLeg));
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
            securityDefinitionLeg.toFormattedString(builder, options);
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
        securityDefinitionLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && securityDefinitionLeg.equals(message.securityDefinitionLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityDefinitionLeg);
    }
}
