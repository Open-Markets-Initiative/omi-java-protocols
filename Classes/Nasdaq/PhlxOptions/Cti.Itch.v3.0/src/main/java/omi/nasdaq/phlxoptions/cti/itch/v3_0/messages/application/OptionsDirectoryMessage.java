package omi.nasdaq.phlxoptions.cti.itch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ClosingOnlyField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ContractSizeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.ExpirationField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.MpvField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OptionClosingTypeField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OptionIdField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.OptionKindField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SecondsField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.SecuritySymbolField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.StrikePriceField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.TradableField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.UnderlyingSymbolField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.fields.VersionField;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.Field;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.Message;
import omi.nasdaq.phlxoptions.cti.itch.v3_0.types.PrintOptions;

/**
 * Represents the OptionsDirectoryMessage message from the Cti protocol.
 *
 * <p>At the start of each trading day, the exchange disseminates directory messages for all symbols trading on a given ring. Sent once per symbol, typically before the Start of System Hours System Event; intra-day updates are sent as they occur.</p>
 */
public final class OptionsDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 49, 16 };

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     */
    private final SecondsField seconds = new SecondsField();

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     */
    private final VersionField version = new VersionField();

    /**
     * Option id assigned by exchange daily
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Option root symbol
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     */
    private final ExpirationField expiration = new ExpirationField();

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * C = Call, P = Put
     */
    private final OptionKindField optionKind = new OptionKindField();

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * N = Normal hours, L = Late hours, W = WCO Early Closing at 12:00 Noon (PHLX only), E = Extended Close (ETH edition)
     */
    private final OptionClosingTypeField optionClosingType = new OptionClosingTypeField();

    /**
     * Y = Tradable, N = Non-Tradable
     */
    private final TradableField tradable = new TradableField();

    /**
     * Minimum Price Variation for this option: E = penny Everywhere, S = Scaled, P = penny Pilot
     */
    private final MpvField mpv = new MpvField();

    /**
     * Y = Option is Closing Position Only (only MM origin orders can have open position in the series), N = Option is not Closing Position Only
     */
    private final ClosingOnlyField closingOnly = new ClosingOnlyField();

    /**
     * Underlying Deliverable size
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seconds, nanoseconds, version, optionId, securitySymbol, expiration, strikePrice, optionKind, underlyingSymbol, optionClosingType, tradable, mpv, closingOnly, contractSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Seconds portion of timestamp: whole seconds after midnight US Eastern Time (0 to 86400)
     *
     * @return the Seconds field
     */
    public SecondsField seconds() {
        return seconds;
    }

    /**
     * Nanoseconds portion of timestamp (0 to 999999999)
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * CTI version, decoded as Mn (major, minor): currently set to 30
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * Option id assigned by exchange daily
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Option root symbol
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Expiration date of the option packed into 2 bytes: Bits 0-6 = Year (0-99), Bits 7-10 = Month (1-12), Bits 11-15 = Day (1-31); bit 15 is the least significant bit
     *
     * @return the Expiration field
     */
    public ExpirationField expiration() {
        return expiration;
    }

    /**
     * Strike price of the option: fixed point with 4 decimal digits
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * C = Call, P = Put
     *
     * @return the OptionKind field
     */
    public OptionKindField optionKind() {
        return optionKind;
    }

    /**
     * Underlying stock symbol (left justified, space filled). The document types this field Integer.
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * N = Normal hours, L = Late hours, W = WCO Early Closing at 12:00 Noon (PHLX only), E = Extended Close (ETH edition)
     *
     * @return the OptionClosingType field
     */
    public OptionClosingTypeField optionClosingType() {
        return optionClosingType;
    }

    /**
     * Y = Tradable, N = Non-Tradable
     *
     * @return the Tradable field
     */
    public TradableField tradable() {
        return tradable;
    }

    /**
     * Minimum Price Variation for this option: E = penny Everywhere, S = Scaled, P = penny Pilot
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * Y = Option is Closing Position Only (only MM origin orders can have open position in the series), N = Option is not Closing Position Only
     *
     * @return the ClosingOnly field
     */
    public ClosingOnlyField closingOnly() {
        return closingOnly;
    }

    /**
     * Underlying Deliverable size
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
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
        if (!seconds.parse(data, cursor)) {
            return false;
        }
        cursor += SecondsField.BYTE_LENGTH;
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!version.parse(data, cursor)) {
            return false;
        }
        cursor += VersionField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expiration.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!optionKind.parse(data, cursor)) {
            return false;
        }
        cursor += OptionKindField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
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
        if (!closingOnly.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingOnlyField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seconds.encode(data, cursor);
        cursor = nanoseconds.encode(data, cursor);
        cursor = version.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expiration.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = optionKind.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = optionClosingType.encode(data, cursor);
        cursor = tradable.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        cursor = closingOnly.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 65) {
            System.arraycopy(buffer, 49, data, cursor, 16); // padding
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
            case "Seconds" -> Optional.of(seconds);
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "Version" -> Optional.of(version);
            case "OptionId" -> Optional.of(optionId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "Expiration" -> Optional.of(expiration);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "OptionKind" -> Optional.of(optionKind);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "OptionClosingType" -> Optional.of(optionClosingType);
            case "Tradable" -> Optional.of(tradable);
            case "Mpv" -> Optional.of(mpv);
            case "ClosingOnly" -> Optional.of(closingOnly);
            case "ContractSize" -> Optional.of(contractSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsDirectoryMessage message)) {
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
        if (!(other instanceof OptionsDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
