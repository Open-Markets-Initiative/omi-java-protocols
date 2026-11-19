package omi.biva.bivaequities.totalview.itch.v1_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.BestBidField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.BestOfferField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.CrossTypeField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.NanosecondsField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.OrderbookField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.TheoreticalOpeningPriceField;
import omi.biva.bivaequities.totalview.itch.v1_12.fields.TheoreticalOpeningQuantityField;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Field;
import omi.biva.bivaequities.totalview.itch.v1_12.types.Message;
import omi.biva.bivaequities.totalview.itch.v1_12.types.PrintOptions;

/**
 * Represents the IndicativePriceQuantityMessage message from the TotalView protocol.
 *
 * <p>Indicative price quantity message</p>
 */
public final class IndicativePriceQuantityMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'I';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Indicative Price Quantity Message";

    /**
     * Nanoseconds since last Time Stamp seconds message
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Total quantity eligible to be matched at the current Theoretical Opening Price
     */
    private final TheoreticalOpeningQuantityField theoreticalOpeningQuantity = new TheoreticalOpeningQuantityField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * The current best buy price
     */
    private final BestBidField bestBid = new BestBidField();

    /**
     * The current best sell price
     */
    private final BestOfferField bestOffer = new BestOfferField();

    /**
     * The current opening price for this orderbook
     */
    private final TheoreticalOpeningPriceField theoreticalOpeningPrice = new TheoreticalOpeningPriceField();

    /**
     * Cross type code
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, theoreticalOpeningQuantity, orderbook, bestBid, bestOffer, theoreticalOpeningPrice, crossType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Total quantity eligible to be matched at the current Theoretical Opening Price
     *
     * @return the TheoreticalOpeningQuantity field
     */
    public TheoreticalOpeningQuantityField theoreticalOpeningQuantity() {
        return theoreticalOpeningQuantity;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * The current best buy price
     *
     * @return the BestBid field
     */
    public BestBidField bestBid() {
        return bestBid;
    }

    /**
     * The current best sell price
     *
     * @return the BestOffer field
     */
    public BestOfferField bestOffer() {
        return bestOffer;
    }

    /**
     * The current opening price for this orderbook
     *
     * @return the TheoreticalOpeningPrice field
     */
    public TheoreticalOpeningPriceField theoreticalOpeningPrice() {
        return theoreticalOpeningPrice;
    }

    /**
     * Cross type code
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
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
        if (!theoreticalOpeningQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TheoreticalOpeningQuantityField.BYTE_LENGTH;
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!bestBid.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidField.BYTE_LENGTH;
        if (!bestOffer.parse(data, cursor)) {
            return false;
        }
        cursor += BestOfferField.BYTE_LENGTH;
        if (!theoreticalOpeningPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TheoreticalOpeningPriceField.BYTE_LENGTH;
        return crossType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = theoreticalOpeningQuantity.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = bestBid.encode(data, cursor);
        cursor = bestOffer.encode(data, cursor);
        cursor = theoreticalOpeningPrice.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
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
            case "TheoreticalOpeningQuantity" -> Optional.of(theoreticalOpeningQuantity);
            case "Orderbook" -> Optional.of(orderbook);
            case "BestBid" -> Optional.of(bestBid);
            case "BestOffer" -> Optional.of(bestOffer);
            case "TheoreticalOpeningPrice" -> Optional.of(theoreticalOpeningPrice);
            case "CrossType" -> Optional.of(crossType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndicativePriceQuantityMessage message)) {
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
        if (!(other instanceof IndicativePriceQuantityMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
