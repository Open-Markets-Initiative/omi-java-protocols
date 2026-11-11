package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.AttributionField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.OrderReferenceNumberField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.PriceField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.SharesNumericField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.SideField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.StockAlphanumericField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Field;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Message;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.PrintOptions;

/**
 * Represents the AddOrderWithMpidMessage message from the TotalView protocol.
 *
 * <p>This message will be generated for attributed orders and quotations entered into the NASDAQ Single Book system.</p>
 */
public final class AddOrderWithMpidMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order With Mpid Message";

    /**
     * The unique reference number assigned to the new order. The order reference number is increasing, but not necessarily sequential.
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * The type of order being added.
     */
    private final SideField side = new SideField();

    /**
     * The total number of shares associated with the order being added to the book.
     */
    private final SharesNumericField sharesNumeric = new SharesNumericField();

    /**
     * Stock symbol right padded with spaces.
     */
    private final StockAlphanumericField stockAlphanumeric = new StockAlphanumericField();

    /**
     * The display price of the new order. Refer to Data Types for field processing notes.
     */
    private final PriceField price = new PriceField();

    /**
     * NASDAQ market participant identifier associated with the entered order.
     */
    private final AttributionField attribution = new AttributionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderReferenceNumber, side, sharesNumeric, stockAlphanumeric, price, attribution);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique reference number assigned to the new order. The order reference number is increasing, but not necessarily sequential.
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * The type of order being added.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * The total number of shares associated with the order being added to the book.
     *
     * @return the SharesNumeric field
     */
    public SharesNumericField sharesNumeric() {
        return sharesNumeric;
    }

    /**
     * Stock symbol right padded with spaces.
     *
     * @return the StockAlphanumeric field
     */
    public StockAlphanumericField stockAlphanumeric() {
        return stockAlphanumeric;
    }

    /**
     * The display price of the new order. Refer to Data Types for field processing notes.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * NASDAQ market participant identifier associated with the entered order.
     *
     * @return the Attribution field
     */
    public AttributionField attribution() {
        return attribution;
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
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!sharesNumeric.parse(data, cursor)) {
            return false;
        }
        cursor += SharesNumericField.BYTE_LENGTH;
        if (!stockAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += StockAlphanumericField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return attribution.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = sharesNumeric.encode(data, cursor);
        cursor = stockAlphanumeric.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = attribution.encode(data, cursor);
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
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "Side" -> Optional.of(side);
            case "SharesNumeric" -> Optional.of(sharesNumeric);
            case "StockAlphanumeric" -> Optional.of(stockAlphanumeric);
            case "Price" -> Optional.of(price);
            case "Attribution" -> Optional.of(attribution);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderWithMpidMessage message)) {
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
        if (!(other instanceof AddOrderWithMpidMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
