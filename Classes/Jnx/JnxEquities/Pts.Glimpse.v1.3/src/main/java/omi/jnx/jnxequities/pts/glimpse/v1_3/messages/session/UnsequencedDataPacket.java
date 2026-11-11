package omi.jnx.jnxequities.pts.glimpse.v1_3.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jnx.jnxequities.pts.glimpse.v1_3.fields.UnsequencedMessageTypeField;
import omi.jnx.jnxequities.pts.glimpse.v1_3.types.Field;
import omi.jnx.jnxequities.pts.glimpse.v1_3.types.Message;
import omi.jnx.jnxequities.pts.glimpse.v1_3.types.PrintOptions;
import omi.jnx.jnxequities.pts.glimpse.v1_3.types.SizedField;

/**
 * Represents the UnsequencedDataPacket message from the Pts protocol.
 *
 * <p>The Unsequenced Data Packets act as an envelope to carry the actual data messages that are transferred from the client to the server</p>
 */
public final class UnsequencedDataPacket implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 1;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Unsequenced Data Packet";

    /**
     * Value identifying unsequenced message type
     */
    private final UnsequencedMessageTypeField unsequencedMessageType = new UnsequencedMessageTypeField();

    /**
     * The unsequenced (client to server) message carried by the packet, opaque bytes unless an application source dispatches it
     */
    private final SizedField unsequencedMessage = new SizedField("UnsequencedMessage", false);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(unsequencedMessageType, unsequencedMessage);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Value identifying unsequenced message type
     *
     * @return the UnsequencedMessageType field
     */
    public UnsequencedMessageTypeField unsequencedMessageType() {
        return unsequencedMessageType;
    }

    /**
     * The unsequenced (client to server) message carried by the packet, opaque bytes unless an application source dispatches it
     *
     * @return the UnsequencedMessage field
     */
    public SizedField unsequencedMessage() {
        return unsequencedMessage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + unsequencedMessage.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!unsequencedMessageType.parse(data, cursor)) {
            return false;
        }
        cursor += UnsequencedMessageTypeField.BYTE_LENGTH;
        if (!unsequencedMessage.parse(data, cursor, (long) (end) - cursor, end)) {
            return false;
        }
        cursor += unsequencedMessage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = unsequencedMessageType.encode(data, cursor);
        cursor = unsequencedMessage.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
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
            case "UnsequencedMessageType" -> Optional.of(unsequencedMessageType);
            case "UnsequencedMessage" -> Optional.of(unsequencedMessage);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UnsequencedDataPacket message)) {
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
        if (!(other instanceof UnsequencedDataPacket message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
