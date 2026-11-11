package omi.jnx.jnxequities.pts.ouch.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.BuySellIndicatorField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.DisplayField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.GroupField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.MinimumQuantityField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.OrderNumberField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.OrderStateField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.OrderbookIdField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.PreviousOrderTokenField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.PriceField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.QuantityField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.ReplacementOrderTokenField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.TimeInForceField;
import omi.jnx.jnxequities.pts.ouch.v1_11.fields.TimestampField;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.Field;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.Message;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.PrintOptions;

/**
 * Represents the OrderReplacedMessage message from the Pts protocol.
 *
 * <p>An Order Replaced Message acknowledges the receipt and acceptance of a valid Replace Order Message</p>
 */
public final class OrderReplacedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replaced Message";

    /**
     * Number of nanoseconds past midnight of the current calendar date
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Must be unique per Ouch account within a trading day and increase on each subsequent transaction
     */
    private final ReplacementOrderTokenField replacementOrderToken = new ReplacementOrderTokenField();

    /**
     * Side of order
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * Number of shares
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * 4 digit Quick code
     */
    private final OrderbookIdField orderbookId = new OrderbookIdField();

    /**
     * Order book group identifier
     */
    private final GroupField group = new GroupField();

    /**
     * Order price
     */
    private final PriceField price = new PriceField();

    /**
     * How long the order remains in effect
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Order handling instruction
     */
    private final DisplayField display = new DisplayField();

    /**
     * Order reference number unique within trading day
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * Minimum acceptable quantity to execute
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Order state upon acceptance
     */
    private final OrderStateField orderState = new OrderStateField();

    /**
     * Order token of replaced order
     */
    private final PreviousOrderTokenField previousOrderToken = new PreviousOrderTokenField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, replacementOrderToken, buySellIndicator, quantity, orderbookId, group, price, timeInForce, display, orderNumber, minimumQuantity, orderState, previousOrderToken);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of nanoseconds past midnight of the current calendar date
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Must be unique per Ouch account within a trading day and increase on each subsequent transaction
     *
     * @return the ReplacementOrderToken field
     */
    public ReplacementOrderTokenField replacementOrderToken() {
        return replacementOrderToken;
    }

    /**
     * Side of order
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Number of shares
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * 4 digit Quick code
     *
     * @return the OrderbookId field
     */
    public OrderbookIdField orderbookId() {
        return orderbookId;
    }

    /**
     * Order book group identifier
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
    }

    /**
     * Order price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * How long the order remains in effect
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Order handling instruction
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * Order reference number unique within trading day
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * Minimum acceptable quantity to execute
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
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
     * Order token of replaced order
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
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderbookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookIdField.BYTE_LENGTH;
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!minimumQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumQuantityField.BYTE_LENGTH;
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
        cursor = buySellIndicator.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderbookId.encode(data, cursor);
        cursor = group.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
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
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "Quantity" -> Optional.of(quantity);
            case "OrderbookId" -> Optional.of(orderbookId);
            case "Group" -> Optional.of(group);
            case "Price" -> Optional.of(price);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Display" -> Optional.of(display);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "OrderState" -> Optional.of(orderState);
            case "PreviousOrderToken" -> Optional.of(previousOrderToken);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplacedMessage message)) {
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
        if (!(other instanceof OrderReplacedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
