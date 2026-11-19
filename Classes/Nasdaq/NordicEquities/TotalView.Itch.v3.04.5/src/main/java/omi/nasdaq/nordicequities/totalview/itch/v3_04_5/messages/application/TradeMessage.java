package omi.nasdaq.nordicequities.totalview.itch.v3_04_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.MatchNumberField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.OrderBookField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.OrderReferenceNumberField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.ParticipantIdBuyerField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.ParticipantIdSellerField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.QuantityField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.TimestampField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.TrackingNumberField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.TradePriceField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.fields.TradeTypeField;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.types.Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.types.Message;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_5.types.PrintOptions;

/**
 * Represents the TradeMessage message from the TotalView protocol.
 *
 * <p>Execution details for a match involving non displayable order types</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Nasdaq Nordic internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Unique reference number assigned to the new order
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * Where a non displayed order has been executed
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Total number of shares in the order
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Order book id
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Day unique match number of this execution
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The price at which the order execution occurred
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * The Mpid of the buyer, if public
     */
    private final ParticipantIdBuyerField participantIdBuyer = new ParticipantIdBuyerField();

    /**
     * The Mpid of the seller, if public
     */
    private final ParticipantIdSellerField participantIdSeller = new ParticipantIdSellerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, trackingNumber, orderReferenceNumber, tradeType, quantity, orderBook, matchNumber, tradePrice, participantIdBuyer, participantIdSeller);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Nasdaq Nordic internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Unique reference number assigned to the new order
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * Where a non displayed order has been executed
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Total number of shares in the order
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Order book id
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Day unique match number of this execution
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The price at which the order execution occurred
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * The Mpid of the buyer, if public
     *
     * @return the ParticipantIdBuyer field
     */
    public ParticipantIdBuyerField participantIdBuyer() {
        return participantIdBuyer;
    }

    /**
     * The Mpid of the seller, if public
     *
     * @return the ParticipantIdSeller field
     */
    public ParticipantIdSellerField participantIdSeller() {
        return participantIdSeller;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!participantIdBuyer.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdBuyerField.BYTE_LENGTH;
        return participantIdSeller.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = participantIdBuyer.encode(data, cursor);
        cursor = participantIdSeller.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "TradeType" -> Optional.of(tradeType);
            case "Quantity" -> Optional.of(quantity);
            case "OrderBook" -> Optional.of(orderBook);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "TradePrice" -> Optional.of(tradePrice);
            case "ParticipantIdBuyer" -> Optional.of(participantIdBuyer);
            case "ParticipantIdSeller" -> Optional.of(participantIdSeller);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
