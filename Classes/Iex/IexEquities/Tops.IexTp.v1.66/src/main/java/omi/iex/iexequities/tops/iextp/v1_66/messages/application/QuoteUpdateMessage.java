package omi.iex.iexequities.tops.iextp.v1_66.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexequities.tops.iextp.v1_66.fields.AskPriceField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.AskSizeField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.BidPriceField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.BidSizeField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.QuoteUpdateFlagsField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.SymbolField;
import omi.iex.iexequities.tops.iextp.v1_66.fields.TimestampField;
import omi.iex.iexequities.tops.iextp.v1_66.types.Field;
import omi.iex.iexequities.tops.iextp.v1_66.types.Message;
import omi.iex.iexequities.tops.iextp.v1_66.types.PrintOptions;

/**
 * Represents the QuoteUpdateMessage message from the Tops protocol.
 *
 * <p>Tops broadcasts a real-time Quote Update Message each time IEX's best bid or offer quotation is updated during the trading day</p>
 */
public final class QuoteUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Message";

    /**
     * Quote Update Flags
     */
    private final QuoteUpdateFlagsField quoteUpdateFlags = new QuoteUpdateFlagsField();

    /**
     * Time stamp of the system event
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Security identifier
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Aggregate quoted best bid size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Best quoted bid price
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Best quoted ask price
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Aggregate quoted best ask size
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteUpdateFlags, timestampField, symbol, bidSize, bidPrice, askPrice, askSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Quote Update Flags
     *
     * @return the QuoteUpdateFlags field
     */
    public QuoteUpdateFlagsField quoteUpdateFlags() {
        return quoteUpdateFlags;
    }

    /**
     * Time stamp of the system event
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Security identifier
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Aggregate quoted best bid size
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Best quoted bid price
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Best quoted ask price
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Aggregate quoted best ask size
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
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
        if (!quoteUpdateFlags.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateFlagsField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        return askSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = quoteUpdateFlags.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
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
            case "QuoteUpdateFlags" -> Optional.of(quoteUpdateFlags);
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "BidSize" -> Optional.of(bidSize);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateMessage message)) {
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
        if (!(other instanceof QuoteUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
