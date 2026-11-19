package omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.ClosingTypeField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.ExpirationDayField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.ExpirationMonthField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.ExpirationYearField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.ExplicitStrikePriceField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.InstrumentIdField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.MpvField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.OptionTypeField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.SecuritySymbolField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.TimestampField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.TrackingNumberField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.TradableField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.fields.UnderlyingSymbolField;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.types.Field;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.types.Message;
import omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.types.PrintOptions;

/**
 * Represents the DerivativeDirectoryMessage message from the DepthOfMarket protocol.
 *
 * <p>Derivative Directory Message for active options symbols.</p>
 */
public final class DerivativeDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'm';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Derivative Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 46, 16 };

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Denotes the option root symbol (security symbol)
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Last two digits of the year of the option expiration
     */
    private final ExpirationYearField expirationYear = new ExpirationYearField();

    /**
     * Expiration Month of the option (1-12)
     */
    private final ExpirationMonthField expirationMonth = new ExpirationMonthField();

    /**
     * Day of the Month of expiration (1-31)
     */
    private final ExpirationDayField expirationDay = new ExpirationDayField();

    /**
     * Explicit strike price. Refer to Data Types for field processing notes.
     */
    private final ExplicitStrikePriceField explicitStrikePrice = new ExplicitStrikePriceField();

    /**
     * Option Type
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Denotes the unique symbol assigned to the underlying security within the Exchange System.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Closing Type
     */
    private final ClosingTypeField closingType = new ClosingTypeField();

    /**
     * Tradable
     */
    private final TradableField tradable = new TradableField();

    /**
     * Minimum Price Variation
     */
    private final MpvField mpv = new MpvField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, instrumentId, securitySymbol, expirationYear, expirationMonth, expirationDay, explicitStrikePrice, optionType, underlyingSymbol, closingType, tradable, mpv);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Denotes the option root symbol (security symbol)
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Last two digits of the year of the option expiration
     *
     * @return the ExpirationYear field
     */
    public ExpirationYearField expirationYear() {
        return expirationYear;
    }

    /**
     * Expiration Month of the option (1-12)
     *
     * @return the ExpirationMonth field
     */
    public ExpirationMonthField expirationMonth() {
        return expirationMonth;
    }

    /**
     * Day of the Month of expiration (1-31)
     *
     * @return the ExpirationDay field
     */
    public ExpirationDayField expirationDay() {
        return expirationDay;
    }

    /**
     * Explicit strike price. Refer to Data Types for field processing notes.
     *
     * @return the ExplicitStrikePrice field
     */
    public ExplicitStrikePriceField explicitStrikePrice() {
        return explicitStrikePrice;
    }

    /**
     * Option Type
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Denotes the unique symbol assigned to the underlying security within the Exchange System.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Closing Type
     *
     * @return the ClosingType field
     */
    public ClosingTypeField closingType() {
        return closingType;
    }

    /**
     * Tradable
     *
     * @return the Tradable field
     */
    public TradableField tradable() {
        return tradable;
    }

    /**
     * Minimum Price Variation
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expirationYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationYearField.BYTE_LENGTH;
        if (!expirationMonth.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationMonthField.BYTE_LENGTH;
        if (!expirationDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDayField.BYTE_LENGTH;
        if (!explicitStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExplicitStrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!closingType.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingTypeField.BYTE_LENGTH;
        if (!tradable.parse(data, cursor)) {
            return false;
        }
        cursor += TradableField.BYTE_LENGTH;
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expirationYear.encode(data, cursor);
        cursor = expirationMonth.encode(data, cursor);
        cursor = expirationDay.encode(data, cursor);
        cursor = explicitStrikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = closingType.encode(data, cursor);
        cursor = tradable.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        if (buffer != null && buffer.length >= 62) {
            System.arraycopy(buffer, 46, data, cursor, 16); // padding
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "ExpirationYear" -> Optional.of(expirationYear);
            case "ExpirationMonth" -> Optional.of(expirationMonth);
            case "ExpirationDay" -> Optional.of(expirationDay);
            case "ExplicitStrikePrice" -> Optional.of(explicitStrikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "ClosingType" -> Optional.of(closingType);
            case "Tradable" -> Optional.of(tradable);
            case "Mpv" -> Optional.of(mpv);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DerivativeDirectoryMessage message)) {
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
        if (!(other instanceof DerivativeDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
