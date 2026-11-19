package omi.nasdaq.iseoptions.orderfeed.itch.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ClosingOnlyField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ContractSizeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ExpirationDayField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ExpirationMonthField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.ExpirationYearField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.MpvField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OptionClosingTypeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OptionIdField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.OptionTypeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.SecuritySymbolField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.SourceField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.StrikePriceField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.TimestampField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.TradableField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.TradingTypeField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.fields.UnderlyingSymbolField;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.Field;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.Message;
import omi.nasdaq.iseoptions.orderfeed.itch.v1_1.types.PrintOptions;

/**
 * Represents the OptionDirectoryMessage message from the OrderFeed protocol.
 *
 * <p>At the start of each trading day, the options system disseminates directory messages for all symbols eligible for trading in the options system.</p>
 */
public final class OptionDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Directory Message";

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     */
    private final OptionIdField optionId = new OptionIdField();

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
     * Explicit strike price in fixed point format with 12 whole number places followed by 8 decimal digits.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Option Type value
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Identifies the source of the option, valid for the trading day.
     */
    private final SourceField source = new SourceField();

    /**
     * Denotes the unique symbol assigned to the underlying security within the Exchange System.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Indicates what kind of option this is
     */
    private final TradingTypeField tradingType = new TradingTypeField();

    /**
     * Underlying deliverable size
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Denotes which System Event is used to determine when trading ceases in this symbol.
     */
    private final OptionClosingTypeField optionClosingType = new OptionClosingTypeField();

    /**
     * Denotes whether or not this option is tradable at the exchange
     */
    private final TradableField tradable = new TradableField();

    /**
     * Minimum Price Variation for this option
     */
    private final MpvField mpv = new MpvField();

    /**
     * Closing position of the option
     */
    private final ClosingOnlyField closingOnly = new ClosingOnlyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, optionId, securitySymbol, expirationYear, expirationMonth, expirationDay, strikePrice, optionType, source, underlyingSymbol, tradingType, contractSize, optionClosingType, tradable, mpv, closingOnly);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
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
     * Explicit strike price in fixed point format with 12 whole number places followed by 8 decimal digits.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
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
     * Identifies the source of the option, valid for the trading day.
     *
     * @return the Source field
     */
    public SourceField source() {
        return source;
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
     * Indicates what kind of option this is
     *
     * @return the TradingType field
     */
    public TradingTypeField tradingType() {
        return tradingType;
    }

    /**
     * Underlying deliverable size
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Denotes which System Event is used to determine when trading ceases in this symbol.
     *
     * @return the OptionClosingType field
     */
    public OptionClosingTypeField optionClosingType() {
        return optionClosingType;
    }

    /**
     * Denotes whether or not this option is tradable at the exchange
     *
     * @return the Tradable field
     */
    public TradableField tradable() {
        return tradable;
    }

    /**
     * Minimum Price Variation for this option
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * Closing position of the option
     *
     * @return the ClosingOnly field
     */
    public ClosingOnlyField closingOnly() {
        return closingOnly;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
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
        if (!expirationDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDayField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
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
        if (!tradingType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingTypeField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!optionClosingType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionClosingTypeField.BYTE_LENGTH;
        if (!tradable.parse(data, cursor)) {
            return false;
        }
        cursor += TradableField.BYTE_LENGTH;
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;
        return closingOnly.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expirationYear.encode(data, cursor);
        cursor = expirationMonth.encode(data, cursor);
        cursor = expirationDay.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = source.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = tradingType.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = optionClosingType.encode(data, cursor);
        cursor = tradable.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        cursor = closingOnly.encode(data, cursor);
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
            case "OptionId" -> Optional.of(optionId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "ExpirationYear" -> Optional.of(expirationYear);
            case "ExpirationMonth" -> Optional.of(expirationMonth);
            case "ExpirationDay" -> Optional.of(expirationDay);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "Source" -> Optional.of(source);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "TradingType" -> Optional.of(tradingType);
            case "ContractSize" -> Optional.of(contractSize);
            case "OptionClosingType" -> Optional.of(optionClosingType);
            case "Tradable" -> Optional.of(tradable);
            case "Mpv" -> Optional.of(mpv);
            case "ClosingOnly" -> Optional.of(closingOnly);
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
