package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ExpirationDateField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ExpirationMonthField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ExpirationYearField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ExplicitStrikePriceField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.MpvField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.OptionIdField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.OptionTypeField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.OptionsClosingTypeField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.SecuritySymbolField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.SourceField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.TradableField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.UnderlyingSymbolField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.Field;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.Message;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.PrintOptions;

/**
 * Represents the OptionDirectoryMessage message from the DepthOfMarket protocol.
 *
 * <p>At the start of each trading day, the options system disseminates option symbol directory messages for all active option symbols in the PHLX ® options system.</p>
 */
public final class OptionDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Directory Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Option ID assigned daily, valid for trading day.
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Denotes the security symbol.
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Last two digits of the year of the option expiration
     */
    private final ExpirationYearField expirationYear = new ExpirationYearField();

    /**
     * Expiration Month (1-12)
     */
    private final ExpirationMonthField expirationMonth = new ExpirationMonthField();

    /**
     * Day of the Month of expiration (1- 31)
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Explicit strike price. Refer to Data Types for field processing notes.
     */
    private final ExplicitStrikePriceField explicitStrikePrice = new ExplicitStrikePriceField();

    /**
     * Option Type value
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Identifies the source of the Option, valid for the trading day
     */
    private final SourceField source = new SourceField();

    /**
     * Denotes the unique symbol assigned to the underlying security within exchange.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Denotes which System Event is used to trigger the option closing process.
     */
    private final OptionsClosingTypeField optionsClosingType = new OptionsClosingTypeField();

    /**
     * Denotes whether or not this option is tradable at the exchange.
     */
    private final TradableField tradable = new TradableField();

    /**
     * Minimum Price Variation for this option.
     */
    private final MpvField mpv = new MpvField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, optionId, securitySymbol, expirationYear, expirationMonth, expirationDate, explicitStrikePrice, optionType, source, underlyingSymbol, optionsClosingType, tradable, mpv);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Option ID assigned daily, valid for trading day.
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Denotes the security symbol.
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
     * Expiration Month (1-12)
     *
     * @return the ExpirationMonth field
     */
    public ExpirationMonthField expirationMonth() {
        return expirationMonth;
    }

    /**
     * Day of the Month of expiration (1- 31)
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
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
     * Option Type value
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Identifies the source of the Option, valid for the trading day
     *
     * @return the Source field
     */
    public SourceField source() {
        return source;
    }

    /**
     * Denotes the unique symbol assigned to the underlying security within exchange.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Denotes which System Event is used to trigger the option closing process.
     *
     * @return the OptionsClosingType field
     */
    public OptionsClosingTypeField optionsClosingType() {
        return optionsClosingType;
    }

    /**
     * Denotes whether or not this option is tradable at the exchange.
     *
     * @return the Tradable field
     */
    public TradableField tradable() {
        return tradable;
    }

    /**
     * Minimum Price Variation for this option.
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
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
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!explicitStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExplicitStrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!source.parse(data, cursor)) {
            return false;
        }
        cursor += SourceField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!optionsClosingType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsClosingTypeField.BYTE_LENGTH;
        if (!tradable.parse(data, cursor)) {
            return false;
        }
        cursor += TradableField.BYTE_LENGTH;
        return mpv.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expirationYear.encode(data, cursor);
        cursor = expirationMonth.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = explicitStrikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = source.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = optionsClosingType.encode(data, cursor);
        cursor = tradable.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "OptionId" -> Optional.of(optionId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "ExpirationYear" -> Optional.of(expirationYear);
            case "ExpirationMonth" -> Optional.of(expirationMonth);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "ExplicitStrikePrice" -> Optional.of(explicitStrikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "Source" -> Optional.of(source);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "OptionsClosingType" -> Optional.of(optionsClosingType);
            case "Tradable" -> Optional.of(tradable);
            case "Mpv" -> Optional.of(mpv);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionDirectoryMessage message)) {
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
        if (!(other instanceof OptionDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
