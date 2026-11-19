package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.NewReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.OrderIdField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.OriginalReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ShortPriceField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.fields.ShortVolumeField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.Field;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.Message;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.PrintOptions;

/**
 * Represents the OrderReplaceShortMessage message from the DepthOfMarket protocol.
 *
 * <p>This message is sent whenever an order on the book is replaced. The replacement has a new reference number and replaces the prior reference number.</p>
 */
public final class OrderReplaceShortMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'v';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replace Short Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * The original reference number delta associated with the order being replaced.
     */
    private final OriginalReferenceNumberDeltaField originalReferenceNumberDelta = new OriginalReferenceNumberDeltaField();

    /**
     * The new reference number delta associated with the new order.
     */
    private final NewReferenceNumberDeltaField newReferenceNumberDelta = new NewReferenceNumberDeltaField();

    /**
     * The display price of the new order being added to the book. NOTE: When converted to a decimal format, this price is in fixed point format with 3 whole number places followed by 2 decimal digits.
     */
    private final ShortPriceField shortPrice = new ShortPriceField();

    /**
     * The total number of contracts of the new order being added to the book.
     */
    private final ShortVolumeField shortVolume = new ShortVolumeField();

    /**
     * PHLX assigned order ID.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, originalReferenceNumberDelta, newReferenceNumberDelta, shortPrice, shortVolume, orderId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * The original reference number delta associated with the order being replaced.
     *
     * @return the OriginalReferenceNumberDelta field
     */
    public OriginalReferenceNumberDeltaField originalReferenceNumberDelta() {
        return originalReferenceNumberDelta;
    }

    /**
     * The new reference number delta associated with the new order.
     *
     * @return the NewReferenceNumberDelta field
     */
    public NewReferenceNumberDeltaField newReferenceNumberDelta() {
        return newReferenceNumberDelta;
    }

    /**
     * The display price of the new order being added to the book. NOTE: When converted to a decimal format, this price is in fixed point format with 3 whole number places followed by 2 decimal digits.
     *
     * @return the ShortPrice field
     */
    public ShortPriceField shortPrice() {
        return shortPrice;
    }

    /**
     * The total number of contracts of the new order being added to the book.
     *
     * @return the ShortVolume field
     */
    public ShortVolumeField shortVolume() {
        return shortVolume;
    }

    /**
     * PHLX assigned order ID.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
        if (!originalReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalReferenceNumberDeltaField.BYTE_LENGTH;
        if (!newReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += NewReferenceNumberDeltaField.BYTE_LENGTH;
        if (!shortPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ShortPriceField.BYTE_LENGTH;
        if (!shortVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ShortVolumeField.BYTE_LENGTH;
        return orderId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = originalReferenceNumberDelta.encode(data, cursor);
        cursor = newReferenceNumberDelta.encode(data, cursor);
        cursor = shortPrice.encode(data, cursor);
        cursor = shortVolume.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
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
            case "OriginalReferenceNumberDelta" -> Optional.of(originalReferenceNumberDelta);
            case "NewReferenceNumberDelta" -> Optional.of(newReferenceNumberDelta);
            case "ShortPrice" -> Optional.of(shortPrice);
            case "ShortVolume" -> Optional.of(shortVolume);
            case "OrderId" -> Optional.of(orderId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplaceShortMessage message)) {
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
        if (!(other instanceof OrderReplaceShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
