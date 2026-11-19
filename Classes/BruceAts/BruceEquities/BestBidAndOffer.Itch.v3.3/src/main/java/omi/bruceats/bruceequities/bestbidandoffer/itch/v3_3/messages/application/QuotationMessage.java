package omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.BestBidPriceField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.BestBidSizeField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.BestOfferPriceField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.BestOfferSizeField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.StockField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.StockLocateField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.fields.TimestampField;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.types.Field;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.types.Message;
import omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.types.PrintOptions;

/**
 * Represents the QuotationMessage message from the BestBidAndOffer protocol.
 *
 * <p>BBBO will broadcast a real-time update every time that the system's best bid and offer quote is updated during the trading day.</p>
 */
public final class QuotationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quotation Message";

    /**
     * Always 0
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * Time stamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The security symbol for the issue, in Nasdaq symbology.
     */
    private final StockField stock = new StockField();

    /**
     * The current best bid price for the buy orders posted in BRUCE
     */
    private final BestBidPriceField bestBidPrice = new BestBidPriceField();

    /**
     * Aggregated number of shares available for buy orders posted on the BRUCE Best Bid Price
     */
    private final BestBidSizeField bestBidSize = new BestBidSizeField();

    /**
     * The current best offer price for the sell orders posted in BRUCE
     */
    private final BestOfferPriceField bestOfferPrice = new BestOfferPriceField();

    /**
     * Aggregated number of shares available for sell orders posted on the BRUCE Best Offer Price
     */
    private final BestOfferSizeField bestOfferSize = new BestOfferSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, timestampField, stock, bestBidPrice, bestBidSize, bestOfferPrice, bestOfferSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Always 0
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * Time stamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The security symbol for the issue, in Nasdaq symbology.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * The current best bid price for the buy orders posted in BRUCE
     *
     * @return the BestBidPrice field
     */
    public BestBidPriceField bestBidPrice() {
        return bestBidPrice;
    }

    /**
     * Aggregated number of shares available for buy orders posted on the BRUCE Best Bid Price
     *
     * @return the BestBidSize field
     */
    public BestBidSizeField bestBidSize() {
        return bestBidSize;
    }

    /**
     * The current best offer price for the sell orders posted in BRUCE
     *
     * @return the BestOfferPrice field
     */
    public BestOfferPriceField bestOfferPrice() {
        return bestOfferPrice;
    }

    /**
     * Aggregated number of shares available for sell orders posted on the BRUCE Best Offer Price
     *
     * @return the BestOfferSize field
     */
    public BestOfferSizeField bestOfferSize() {
        return bestOfferSize;
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
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!bestBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidPriceField.BYTE_LENGTH;
        if (!bestBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidSizeField.BYTE_LENGTH;
        if (!bestOfferPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferPriceField.BYTE_LENGTH;
        return bestOfferSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = bestBidPrice.encode(data, cursor);
        cursor = bestBidSize.encode(data, cursor);
        cursor = bestOfferPrice.encode(data, cursor);
        cursor = bestOfferSize.encode(data, cursor);
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
            case "StockLocate" -> Optional.of(stockLocate);
            case "Timestamp" -> Optional.of(timestampField);
            case "Stock" -> Optional.of(stock);
            case "BestBidPrice" -> Optional.of(bestBidPrice);
            case "BestBidSize" -> Optional.of(bestBidSize);
            case "BestOfferPrice" -> Optional.of(bestOfferPrice);
            case "BestOfferSize" -> Optional.of(bestOfferSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuotationMessage message)) {
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
        if (!(other instanceof QuotationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
