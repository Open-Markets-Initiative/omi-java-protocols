package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.fields.BeginSeqNumField;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.fields.ChannelIdField;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.fields.EndSeqNumField;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.fields.ProductIdField;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.types.Field;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.types.Message;
import omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.types.PrintOptions;

/**
 * Represents the MessageUnavailableMessage message from the ImbalancesFeed protocol.
 *
 * <p>This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission.</p>
 */
public final class MessageUnavailableMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 10;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Message Unavailable Message";

    /**
     * The beginning sequence number of the range of messages to be retransmitted.
     */
    private final BeginSeqNumField beginSeqNum = new BeginSeqNumField();

    /**
     * The end sequence number of the range of messages to be retransmitted.
     */
    private final EndSeqNumField endSeqNum = new EndSeqNumField();

    /**
     * The unique ID for this NYSE feed listed in the feed’s client specification.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * The ID of the multicast channel over which the packet was sent.
     */
    private final ChannelIdField channelId = new ChannelIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(beginSeqNum, endSeqNum, productId, channelId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The beginning sequence number of the range of messages to be retransmitted.
     *
     * @return the BeginSeqNum field
     */
    public BeginSeqNumField beginSeqNum() {
        return beginSeqNum;
    }

    /**
     * The end sequence number of the range of messages to be retransmitted.
     *
     * @return the EndSeqNum field
     */
    public EndSeqNumField endSeqNum() {
        return endSeqNum;
    }

    /**
     * The unique ID for this NYSE feed listed in the feed’s client specification.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * The ID of the multicast channel over which the packet was sent.
     *
     * @return the ChannelId field
     */
    public ChannelIdField channelId() {
        return channelId;
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
        if (!beginSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += BeginSeqNumField.BYTE_LENGTH;
        if (!endSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += EndSeqNumField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        return channelId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = beginSeqNum.encode(data, cursor);
        cursor = endSeqNum.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = channelId.encode(data, cursor);
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
            case "BeginSeqNum" -> Optional.of(beginSeqNum);
            case "EndSeqNum" -> Optional.of(endSeqNum);
            case "ProductId" -> Optional.of(productId);
            case "ChannelId" -> Optional.of(channelId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MessageUnavailableMessage message)) {
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
        if (!(other instanceof MessageUnavailableMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
