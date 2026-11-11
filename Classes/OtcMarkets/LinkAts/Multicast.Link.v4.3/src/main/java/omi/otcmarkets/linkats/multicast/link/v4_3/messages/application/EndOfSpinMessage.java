package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SpinEndTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SpinLastSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SpinMsgCtField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SpinTypeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the EndOfSpinMessage message from the Multicast protocol.
 *
 * <p>This message appears on all quote channels and indicates the end of a spin message cycle.</p>
 */
public final class EndOfSpinMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\f';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "End Of Spin Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Spin type
     */
    private final SpinTypeField spinType = new SpinTypeField();

    /**
     * Total number of messages in the spin.
     */
    private final SpinMsgCtField spinMsgCt = new SpinMsgCtField();

    /**
     * Milliseconds since UTC epoch.
     */
    private final SpinEndTimeMilliField spinEndTimeMilli = new SpinEndTimeMilliField();

    /**
     * Last sequence number applied to this spin.
     */
    private final SpinLastSeqNumField spinLastSeqNum = new SpinLastSeqNumField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, spinType, spinMsgCt, spinEndTimeMilli, spinLastSeqNum);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Monotonically increasing message sequence number at the channel level.
     *
     * @return the ChannelSeqNum field
     */
    public ChannelSeqNumField channelSeqNum() {
        return channelSeqNum;
    }

    /**
     * Spin type
     *
     * @return the SpinType field
     */
    public SpinTypeField spinType() {
        return spinType;
    }

    /**
     * Total number of messages in the spin.
     *
     * @return the SpinMsgCt field
     */
    public SpinMsgCtField spinMsgCt() {
        return spinMsgCt;
    }

    /**
     * Milliseconds since UTC epoch.
     *
     * @return the SpinEndTimeMilli field
     */
    public SpinEndTimeMilliField spinEndTimeMilli() {
        return spinEndTimeMilli;
    }

    /**
     * Last sequence number applied to this spin.
     *
     * @return the SpinLastSeqNum field
     */
    public SpinLastSeqNumField spinLastSeqNum() {
        return spinLastSeqNum;
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
        if (!channelSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelSeqNumField.BYTE_LENGTH;
        if (!spinType.parse(data, cursor)) {
            return false;
        }
        cursor += SpinTypeField.BYTE_LENGTH;
        if (!spinMsgCt.parse(data, cursor)) {
            return false;
        }
        cursor += SpinMsgCtField.BYTE_LENGTH;
        if (!spinEndTimeMilli.parse(data, cursor)) {
            return false;
        }
        cursor += SpinEndTimeMilliField.BYTE_LENGTH;
        return spinLastSeqNum.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = spinType.encode(data, cursor);
        cursor = spinMsgCt.encode(data, cursor);
        cursor = spinEndTimeMilli.encode(data, cursor);
        cursor = spinLastSeqNum.encode(data, cursor);
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
            case "ChannelSeqNum" -> Optional.of(channelSeqNum);
            case "SpinType" -> Optional.of(spinType);
            case "SpinMsgCt" -> Optional.of(spinMsgCt);
            case "SpinEndTimeMilli" -> Optional.of(spinEndTimeMilli);
            case "SpinLastSeqNum" -> Optional.of(spinLastSeqNum);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EndOfSpinMessage message)) {
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
        if (!(other instanceof EndOfSpinMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
