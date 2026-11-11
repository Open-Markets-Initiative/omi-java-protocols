package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.AskPriceQuote;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.BidPriceQuote;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.FutureOptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the FutureOptionsQuoteMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Quote message</p>
 */
public final class FutureOptionsQuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Quote Message";

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Option on future symbology
     */
    private final FutureOptionSymbol futureOptionSymbol = new FutureOptionSymbol();

    /**
     * Bid price for the option series
     */
    private final BidPriceQuote bidPriceQuote = new BidPriceQuote();

    /**
     * Ask price for the option series
     */
    private final AskPriceQuote askPriceQuote = new AskPriceQuote();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, bidSize, askSize, instrumentStatusMarker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the quote occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Option on future symbology
     *
     * @return the FutureOptionSymbol record
     */
    public FutureOptionSymbol futureOptionSymbol() {
        return futureOptionSymbol;
    }

    /**
     * Bid price for the option series
     *
     * @return the BidPriceQuote record
     */
    public BidPriceQuote bidPriceQuote() {
        return bidPriceQuote;
    }

    /**
     * Ask price for the option series
     *
     * @return the AskPriceQuote record
     */
    public AskPriceQuote askPriceQuote() {
        return askPriceQuote;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!futureOptionSymbol.parseFrom(data, cursor, end - 27)) {
            return false;
        }
        cursor += futureOptionSymbol.byteLength();
        if (!bidPriceQuote.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += bidPriceQuote.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceQuote.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += askPriceQuote.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        return instrumentStatusMarker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = futureOptionSymbol.encode(data, cursor);
        cursor = bidPriceQuote.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceQuote.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
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
        futureOptionSymbol.clear();
        bidPriceQuote.clear();
        askPriceQuote.clear();
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
        if (!futureOptionSymbol.isRecognized()) {
            return false;
        }
        if (!bidPriceQuote.isRecognized()) {
            return false;
        }
        return askPriceQuote.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!futureOptionSymbol.isValid()) {
            return false;
        }
        if (!bidPriceQuote.isValid()) {
            return false;
        }
        if (!askPriceQuote.isValid()) {
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureOptionSymbol.diffFields(message.futureOptionSymbol));
        changed.addAll(bidPriceQuote.diffFields(message.bidPriceQuote));
        changed.addAll(askPriceQuote.diffFields(message.askPriceQuote));
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
            builder.append(", ");
            futureOptionSymbol.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceQuote.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuote.toFormattedString(builder, options);
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
        futureOptionSymbol.toFormattedString(builder, nested);
        bidPriceQuote.toFormattedString(builder, nested);
        askPriceQuote.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futureOptionSymbol.equals(message.futureOptionSymbol) && bidPriceQuote.equals(message.bidPriceQuote) && askPriceQuote.equals(message.askPriceQuote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureOptionSymbol, bidPriceQuote, askPriceQuote);
    }
}
