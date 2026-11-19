package omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.ActiveMarketMakerField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.AllowedBookTypesField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.CurrencyField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.FullNameField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.InstrumentFlagsField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.LotSizeField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.PreviousCloseField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.SecurityTypeField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.SegmentField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.SymbolField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.fields.TimestampField;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.types.Field;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.types.Message;
import omi.cboe.neoequities.multicasttrades.pitch.v1_0_13.types.PrintOptions;

/**
 * Represents the InstrumentDirectoryMessage message from the MulticastTrades protocol.
 *
 * <p>Disseminates information for each symbol. A separate Trading Status message indicates the status of each symbol. If no Trading Status message is received for a symbol, it is assumed to be Suspended.</p>
 */
public final class InstrumentDirectoryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 168;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Directory Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Defines the order book types allowed for the symbol. 0 means not allowed and 1 means allowed.
     */
    private final AllowedBookTypesField allowedBookTypes = new AllowedBookTypesField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Segment the symbol is assigned to (right padded with spaces).
     */
    private final SegmentField segment = new SegmentField();

    /**
     * The possible values will be the ISO 4217 codes for currency.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Indicates the minimum quantity/nominal value tradable on the market for a security.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * The unique long name assigned to the symbol.
     */
    private final FullNameField fullName = new FullNameField();

    /**
     * The active market maker broker id who will be carrying our market maker obligations for the instrument.
     */
    private final ActiveMarketMakerField activeMarketMaker = new ActiveMarketMakerField();

    /**
     * The security type of the instrument.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Instrument flags.
     */
    private final InstrumentFlagsField instrumentFlags = new InstrumentFlagsField();

    /**
     * The previous day's closing price.
     */
    private final PreviousCloseField previousClose = new PreviousCloseField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, allowedBookTypes, symbol, segment, currency, lotSize, fullName, activeMarketMaker, securityType, instrumentFlags, previousClose);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Defines the order book types allowed for the symbol. 0 means not allowed and 1 means allowed.
     *
     * @return the AllowedBookTypes field
     */
    public AllowedBookTypesField allowedBookTypes() {
        return allowedBookTypes;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Segment the symbol is assigned to (right padded with spaces).
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
    }

    /**
     * The possible values will be the ISO 4217 codes for currency.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Indicates the minimum quantity/nominal value tradable on the market for a security.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * The unique long name assigned to the symbol.
     *
     * @return the FullName field
     */
    public FullNameField fullName() {
        return fullName;
    }

    /**
     * The active market maker broker id who will be carrying our market maker obligations for the instrument.
     *
     * @return the ActiveMarketMaker field
     */
    public ActiveMarketMakerField activeMarketMaker() {
        return activeMarketMaker;
    }

    /**
     * The security type of the instrument.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Instrument flags.
     *
     * @return the InstrumentFlags field
     */
    public InstrumentFlagsField instrumentFlags() {
        return instrumentFlags;
    }

    /**
     * The previous day's closing price.
     *
     * @return the PreviousClose field
     */
    public PreviousCloseField previousClose() {
        return previousClose;
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
        if (!allowedBookTypes.parse(data, cursor)) {
            return false;
        }
        cursor += AllowedBookTypesField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!fullName.parse(data, cursor)) {
            return false;
        }
        cursor += FullNameField.BYTE_LENGTH;
        if (!activeMarketMaker.parse(data, cursor)) {
            return false;
        }
        cursor += ActiveMarketMakerField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!instrumentFlags.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentFlagsField.BYTE_LENGTH;
        return previousClose.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = allowedBookTypes.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = fullName.encode(data, cursor);
        cursor = activeMarketMaker.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = instrumentFlags.encode(data, cursor);
        cursor = previousClose.encode(data, cursor);
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
            case "AllowedBookTypes" -> Optional.of(allowedBookTypes);
            case "Symbol" -> Optional.of(symbol);
            case "Segment" -> Optional.of(segment);
            case "Currency" -> Optional.of(currency);
            case "LotSize" -> Optional.of(lotSize);
            case "FullName" -> Optional.of(fullName);
            case "ActiveMarketMaker" -> Optional.of(activeMarketMaker);
            case "SecurityType" -> Optional.of(securityType);
            case "InstrumentFlags" -> Optional.of(instrumentFlags);
            case "PreviousClose" -> Optional.of(previousClose);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDirectoryMessage message)) {
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
        if (!(other instanceof InstrumentDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
