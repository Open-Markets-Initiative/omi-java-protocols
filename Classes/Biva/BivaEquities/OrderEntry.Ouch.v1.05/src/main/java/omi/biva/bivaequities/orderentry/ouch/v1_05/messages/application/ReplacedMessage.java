package omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.OrderReferenceNumberField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.OrderStateField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.OrderVerbField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.OrderbookField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.PreviousOrderTokenField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.PriceField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.QuantityField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.ReplacementOrderTokenField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.TimestampField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.Field;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.Message;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.PrintOptions;

/**
 * Represents the ReplacedMessage message from the OrderEntry protocol.
 *
 * <p>Replaced message</p>
 */
public final class ReplacedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replaced Message";

    /**
     * Number of nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Token must be unique for each Ouch user per trading cycle
     */
    private final ReplacementOrderTokenField replacementOrderToken = new ReplacementOrderTokenField();

    /**
     * Side of the order
     */
    private final OrderVerbField orderVerb = new OrderVerbField();

    /**
     * Total number of shares
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Unique orderbook identifier
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * The price of this order, 0x7FFFFFFF for a market order
     */
    private final PriceField price = new PriceField();

    /**
     * Day unique order reference number
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * Order state upon acceptance
     */
    private final OrderStateField orderState = new OrderStateField();

    /**
     * The order token of the order that was replaced
     */
    private final PreviousOrderTokenField previousOrderToken = new PreviousOrderTokenField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, replacementOrderToken, orderVerb, quantity, orderbook, price, orderReferenceNumber, orderState, previousOrderToken);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of nanoseconds past midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Token must be unique for each Ouch user per trading cycle
     *
     * @return the ReplacementOrderToken field
     */
    public ReplacementOrderTokenField replacementOrderToken() {
        return replacementOrderToken;
    }

    /**
     * Side of the order
     *
     * @return the OrderVerb field
     */
    public OrderVerbField orderVerb() {
        return orderVerb;
    }

    /**
     * Total number of shares
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Unique orderbook identifier
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * The price of this order, 0x7FFFFFFF for a market order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Day unique order reference number
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * Order state upon acceptance
     *
     * @return the OrderState field
     */
    public OrderStateField orderState() {
        return orderState;
    }

    /**
     * The order token of the order that was replaced
     *
     * @return the PreviousOrderToken field
     */
    public PreviousOrderTokenField previousOrderToken() {
        return previousOrderToken;
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
        if (!replacementOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacementOrderTokenField.BYTE_LENGTH;
        if (!orderVerb.parse(data, cursor)) {
            return false;
        }
        cursor += OrderVerbField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!orderState.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStateField.BYTE_LENGTH;
        return previousOrderToken.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = replacementOrderToken.encode(data, cursor);
        cursor = orderVerb.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = orderState.encode(data, cursor);
        cursor = previousOrderToken.encode(data, cursor);
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
            case "ReplacementOrderToken" -> Optional.of(replacementOrderToken);
            case "OrderVerb" -> Optional.of(orderVerb);
            case "Quantity" -> Optional.of(quantity);
            case "Orderbook" -> Optional.of(orderbook);
            case "Price" -> Optional.of(price);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "OrderState" -> Optional.of(orderState);
            case "PreviousOrderToken" -> Optional.of(previousOrderToken);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplacedMessage message)) {
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
        if (!(other instanceof ReplacedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
