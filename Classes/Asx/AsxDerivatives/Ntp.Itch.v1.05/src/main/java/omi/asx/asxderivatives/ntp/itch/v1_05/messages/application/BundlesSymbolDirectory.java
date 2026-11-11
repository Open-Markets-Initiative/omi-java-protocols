package omi.asx.asxderivatives.ntp.itch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.CfiCodeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LegsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LongNameField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.NanosecondsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceDisplayDecimalsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceFractionalDenominatorField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceMethodField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceMinimumTickField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SymbolNameField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.groups.BundleLegEntry;
import omi.asx.asxderivatives.ntp.itch.v1_05.groups.BundleLegList;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Field;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.PrintOptions;

/**
 * Represents the BundlesSymbolDirectory message from the Ntp protocol.
 *
 * <p>The Bundles Symbol Directory is a specialised reference data message used for defining combinations with legs greater than 6, specifically Bundle products with legs of 8, 12, 16 or 20 legs</p>
 */
public final class BundlesSymbolDirectory implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'm';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 459;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Bundles Symbol Directory";

    /**
     * The number of slots that BundleLeg carries on the wire.
     */
    public static final int BUNDLE_LEG_COUNT = 20;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifier of the Order Book.
     */
    private final TradeableInstrumentIdField tradeableInstrumentId = new TradeableInstrumentIdField();

    /**
     * The unique tradable instrument name.
     */
    private final SymbolNameField symbolName = new SymbolNameField();

    /**
     * Additional instrument series information.
     */
    private final LongNameField longName = new LongNameField();

    /**
     * Indicates the type of security using ISO 10962 standard, CFI code values.
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Pricing method
     */
    private final PriceMethodField priceMethod = new PriceMethodField();

    /**
     * Suggested number of decimals to display the price at.
     */
    private final PriceDisplayDecimalsField priceDisplayDecimals = new PriceDisplayDecimalsField();

    /**
     * Denominator of the price to yield the floating point price.
     */
    private final PriceFractionalDenominatorField priceFractionalDenominator = new PriceFractionalDenominatorField();

    /**
     * Minimum tick size. Divide by the Price Fractional Denominator to determine the floating point value.
     */
    private final PriceMinimumTickField priceMinimumTick = new PriceMinimumTickField();

    /**
     * Number of legs.
     */
    private final LegsField legs = new LegsField();

    /**
     * Bundle Leg
     */
    private final BundleLegList bundleLeg = new BundleLegList(BUNDLE_LEG_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, tradeableInstrumentId, symbolName, longName, cfiCode, priceMethod, priceDisplayDecimals, priceFractionalDenominator, priceMinimumTick, legs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifier of the Order Book.
     *
     * @return the TradeableInstrumentId field
     */
    public TradeableInstrumentIdField tradeableInstrumentId() {
        return tradeableInstrumentId;
    }

    /**
     * The unique tradable instrument name.
     *
     * @return the SymbolName field
     */
    public SymbolNameField symbolName() {
        return symbolName;
    }

    /**
     * Additional instrument series information.
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * Indicates the type of security using ISO 10962 standard, CFI code values.
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Pricing method
     *
     * @return the PriceMethod field
     */
    public PriceMethodField priceMethod() {
        return priceMethod;
    }

    /**
     * Suggested number of decimals to display the price at.
     *
     * @return the PriceDisplayDecimals field
     */
    public PriceDisplayDecimalsField priceDisplayDecimals() {
        return priceDisplayDecimals;
    }

    /**
     * Denominator of the price to yield the floating point price.
     *
     * @return the PriceFractionalDenominator field
     */
    public PriceFractionalDenominatorField priceFractionalDenominator() {
        return priceFractionalDenominator;
    }

    /**
     * Minimum tick size. Divide by the Price Fractional Denominator to determine the floating point value.
     *
     * @return the PriceMinimumTick field
     */
    public PriceMinimumTickField priceMinimumTick() {
        return priceMinimumTick;
    }

    /**
     * Number of legs.
     *
     * @return the Legs field
     */
    public LegsField legs() {
        return legs;
    }

    /**
     * Bundle Leg
     *
     * <p>The wire always carries 20 slots, and this list holds those in use: encode writes its size to the Legs field and fills the rest.</p>
     *
     * @return the BundleLeg entries
     */
    public BundleLegList bundleLeg() {
        return bundleLeg;
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
        if (decoded) {
            bundleLeg.keep(buffer, offset);
        }
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeableInstrumentIdField.BYTE_LENGTH;
        if (!symbolName.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolNameField.BYTE_LENGTH;
        if (!longName.parse(data, cursor)) {
            return false;
        }
        cursor += LongNameField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!priceMethod.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMethodField.BYTE_LENGTH;
        if (!priceDisplayDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisplayDecimalsField.BYTE_LENGTH;
        if (!priceFractionalDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFractionalDenominatorField.BYTE_LENGTH;
        if (!priceMinimumTick.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMinimumTickField.BYTE_LENGTH;
        if (!legs.parse(data, cursor)) {
            return false;
        }
        cursor += LegsField.BYTE_LENGTH;
        if (!bundleLeg.parse(data, cursor, end, legs.value())) {
            return false;
        }
        cursor += bundleLeg.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        if (bundleLeg.size() > 255) {
            throw new IllegalStateException("bundleLeg holds " + bundleLeg.size() + " entries, more than its count field can state");
        }
        legs.value((short) bundleLeg.size());
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeableInstrumentId.encode(data, cursor);
        cursor = symbolName.encode(data, cursor);
        cursor = longName.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = priceMethod.encode(data, cursor);
        cursor = priceDisplayDecimals.encode(data, cursor);
        cursor = priceFractionalDenominator.encode(data, cursor);
        cursor = priceMinimumTick.encode(data, cursor);
        cursor = legs.encode(data, cursor);
        cursor = bundleLeg.encode(data, cursor);
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
        bundleLeg.clear();
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
            if (field != legs && !field.isRecognized()) {
                return false;
            }
        }
        return bundleLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legs && !field.isValid()) {
                return false;
            }
        }
        if (!bundleLeg.isValid()) {
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
        if (!nanoseconds.isDecoded()) {
            return Optional.of(nanoseconds);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!tradeableInstrumentId.isDecoded()) {
            return Optional.of(tradeableInstrumentId);
        }
        if (!symbolName.isDecoded()) {
            return Optional.of(symbolName);
        }
        if (!longName.isDecoded()) {
            return Optional.of(longName);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!priceMethod.isDecoded()) {
            return Optional.of(priceMethod);
        }
        if (!priceDisplayDecimals.isDecoded()) {
            return Optional.of(priceDisplayDecimals);
        }
        if (!priceFractionalDenominator.isDecoded()) {
            return Optional.of(priceFractionalDenominator);
        }
        if (!priceMinimumTick.isDecoded()) {
            return Optional.of(priceMinimumTick);
        }
        if (!legs.isDecoded()) {
            return Optional.of(legs);
        }
        if (!bundleLeg.isDecoded()) {
            return Optional.of(bundleLeg.failedEntry().flatMap(BundleLegEntry::failedAt).orElse(legs));
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeableInstrumentId" -> Optional.of(tradeableInstrumentId);
            case "SymbolName" -> Optional.of(symbolName);
            case "LongName" -> Optional.of(longName);
            case "CfiCode" -> Optional.of(cfiCode);
            case "PriceMethod" -> Optional.of(priceMethod);
            case "PriceDisplayDecimals" -> Optional.of(priceDisplayDecimals);
            case "PriceFractionalDenominator" -> Optional.of(priceFractionalDenominator);
            case "PriceMinimumTick" -> Optional.of(priceMinimumTick);
            case "Legs" -> Optional.of(legs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BundlesSymbolDirectory message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bundleLeg.diffFields(message.bundleLeg));
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
            bundleLeg.toFormattedString(builder, options);
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
        bundleLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof BundlesSymbolDirectory message)) {
            return false;
        }
        return fields.equals(message.fields) && bundleLeg.equals(message.bundleLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bundleLeg);
    }
}
