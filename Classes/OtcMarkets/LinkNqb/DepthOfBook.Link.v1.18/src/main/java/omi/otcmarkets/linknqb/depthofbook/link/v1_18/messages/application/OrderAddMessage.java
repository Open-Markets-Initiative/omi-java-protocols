package omi.otcmarkets.linknqb.depthofbook.link.v1_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.FirmIdField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.OrderFlagsField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.OrderIdField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.PriceField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.QuantityField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.SideIndicatorField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.SymbolField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.TimeField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.fields.UnsolicitedField;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.types.Field;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.types.Message;
import omi.otcmarkets.linknqb.depthofbook.link.v1_18.types.PrintOptions;

/**
 * Represents the OrderAddMessage message from the DepthOfBook protocol.
 *
 * <p>This message appears on the DOB channel. Indicates a new order added to the book.</p>
 */
public final class OrderAddMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0015';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Add Message";

    /**
     * Milliseconds from midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Day-specific identifier assigned to this order. The Order ID consists of 14 alphanumeric characters; use the first 12 characters and convert them from base-36 to a 64-bit integer.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * "B" = Buy Order, "S" = Sell Order.
     */
    private final SideIndicatorField sideIndicator = new SideIndicatorField();

    /**
     * Number of shares being added to the book.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Ticker symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The limit order price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     */
    private final PriceField price = new PriceField();

    /**
     * Firm's MPID.
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * "Y" = Unsolicited, "N" = Not Unsolicited.
     */
    private final UnsolicitedField unsolicited = new UnsolicitedField();

    /**
     * TBD.
     */
    private final OrderFlagsField orderFlags = new OrderFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, orderId, sideIndicator, quantity, symbol, price, firmId, unsolicited, orderFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Milliseconds from midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Day-specific identifier assigned to this order. The Order ID consists of 14 alphanumeric characters; use the first 12 characters and convert them from base-36 to a 64-bit integer.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * "B" = Buy Order, "S" = Sell Order.
     *
     * @return the SideIndicator field
     */
    public SideIndicatorField sideIndicator() {
        return sideIndicator;
    }

    /**
     * Number of shares being added to the book.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Ticker symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * The limit order price. The long value represents the price scaled by 1,000,000 (6 decimal places).
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Firm's MPID.
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * "Y" = Unsolicited, "N" = Not Unsolicited.
     *
     * @return the Unsolicited field
     */
    public UnsolicitedField unsolicited() {
        return unsolicited;
    }

    /**
     * TBD.
     *
     * @return the OrderFlags field
     */
    public OrderFlagsField orderFlags() {
        return orderFlags;
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!sideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SideIndicatorField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!unsolicited.parse(data, cursor)) {
            return false;
        }
        cursor += UnsolicitedField.BYTE_LENGTH;
        return orderFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = sideIndicator.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = unsolicited.encode(data, cursor);
        cursor = orderFlags.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "OrderId" -> Optional.of(orderId);
            case "SideIndicator" -> Optional.of(sideIndicator);
            case "Quantity" -> Optional.of(quantity);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "FirmId" -> Optional.of(firmId);
            case "Unsolicited" -> Optional.of(unsolicited);
            case "OrderFlags" -> Optional.of(orderFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAddMessage message)) {
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
        if (!(other instanceof OrderAddMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
