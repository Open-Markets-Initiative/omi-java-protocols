package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.NewOrderReferenceNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.OriginalOrderReferenceNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.PriceField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.SharesField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.StockLocateField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.TimestampField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.types.PrintOptions;

/**
 * Represents the OrderReplaceMessage message from the TotalView protocol.
 *
 * <p>This message is sent whenever an order on the book has been cancel-replaced</p>
 */
public final class OrderReplaceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replace Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The original reference number of the order being replaced
     */
    private final OriginalOrderReferenceNumberField originalOrderReferenceNumber = new OriginalOrderReferenceNumberField();

    /**
     * The new reference number for this order at time of replacement
     */
    private final NewOrderReferenceNumberField newOrderReferenceNumber = new NewOrderReferenceNumberField();

    /**
     * The total number of shares associated with the order being added to the book
     */
    private final SharesField shares = new SharesField();

    /**
     * The display price of the new order
     */
    private final PriceField price = new PriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, originalOrderReferenceNumber, newOrderReferenceNumber, shares, price);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * Nasdaq internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The original reference number of the order being replaced
     *
     * @return the OriginalOrderReferenceNumber field
     */
    public OriginalOrderReferenceNumberField originalOrderReferenceNumber() {
        return originalOrderReferenceNumber;
    }

    /**
     * The new reference number for this order at time of replacement
     *
     * @return the NewOrderReferenceNumber field
     */
    public NewOrderReferenceNumberField newOrderReferenceNumber() {
        return newOrderReferenceNumber;
    }

    /**
     * The total number of shares associated with the order being added to the book
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * The display price of the new order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!originalOrderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalOrderReferenceNumberField.BYTE_LENGTH;
        if (!newOrderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += NewOrderReferenceNumberField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = originalOrderReferenceNumber.encode(data, cursor);
        cursor = newOrderReferenceNumber.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = price.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "OriginalOrderReferenceNumber" -> Optional.of(originalOrderReferenceNumber);
            case "NewOrderReferenceNumber" -> Optional.of(newOrderReferenceNumber);
            case "Shares" -> Optional.of(shares);
            case "Price" -> Optional.of(price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplaceMessage message)) {
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
        if (!(other instanceof OrderReplaceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
