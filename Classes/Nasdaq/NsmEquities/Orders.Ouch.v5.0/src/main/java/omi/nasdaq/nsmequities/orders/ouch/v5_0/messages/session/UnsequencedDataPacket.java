package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.dispatch.UnsequencedMessageDispatch;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.UnsequencedMessageType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UnsequencedMessageTypeField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.AccountQueryMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.CancelOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.DisableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnableOrderEntryRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.EnterOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.MassCancelRequestMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ModifyOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application.ReplaceOrderMessage;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.UnknownMessage;

/**
 * Represents the UnsequencedDataPacket message from the Orders protocol.
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
    private Message unsequencedMessage = new UnknownMessage();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(unsequencedMessageType);

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
     * <p>The message its UnsequencedMessageType selected, or an {@link UnknownMessage} holding the bytes of one this library does not decode.</p>
     *
     * @return the UnsequencedMessage message
     */
    public Message unsequencedMessage() {
        return unsequencedMessage;
    }

    /**
     * Sets the message to hold. Encode writes the UnsequencedMessageType that selects it; an unknown message keeps the one it arrived with.
     *
     * @param message the message
     */
    public void unsequencedMessage(Message message) {
        this.unsequencedMessage = Objects.requireNonNull(message, "message");
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
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 1;
        cursor += unsequencedMessage.byteLength();
        return cursor;
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
        Optional<Message> unsequencedMessageSelected = UnsequencedMessageDispatch.decode(unsequencedMessageType.rawValue(), data, cursor, end);
        if (unsequencedMessageSelected.isPresent()) {
            if (!unsequencedMessageSelected.get().isDecoded()) {
                return false;
            }
            unsequencedMessage = unsequencedMessageSelected.get();
        } else {
            UnknownMessage unsequencedMessageUnknown = new UnknownMessage();
            if (!unsequencedMessageUnknown.parseFrom(data, cursor, end)) {
                return false;
            }
            unsequencedMessage = unsequencedMessageUnknown;
        }
        cursor += unsequencedMessage.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (unsequencedMessage instanceof EnterOrderMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.ENTER_ORDER_MESSAGE);
        } else if (unsequencedMessage instanceof ReplaceOrderMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.REPLACE_ORDER_MESSAGE);
        } else if (unsequencedMessage instanceof CancelOrderMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.CANCEL_ORDER_MESSAGE);
        } else if (unsequencedMessage instanceof ModifyOrderMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.MODIFY_ORDER_MESSAGE);
        } else if (unsequencedMessage instanceof AccountQueryMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.ACCOUNT_QUERY_MESSAGE);
        } else if (unsequencedMessage instanceof MassCancelRequestMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.MASS_CANCEL_REQUEST_MESSAGE);
        } else if (unsequencedMessage instanceof DisableOrderEntryRequestMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.DISABLE_ORDER_ENTRY_REQUEST_MESSAGE);
        } else if (unsequencedMessage instanceof EnableOrderEntryRequestMessage) {
            unsequencedMessageType.value(UnsequencedMessageType.ENABLE_ORDER_ENTRY_REQUEST_MESSAGE);
        }
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
        this.unsequencedMessage = new UnknownMessage();
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
            if (field != unsequencedMessageType && !field.isRecognized()) {
                return false;
            }
        }
        if (!unsequencedMessage.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != unsequencedMessageType && !field.isValid()) {
                return false;
            }
        }
        if (!unsequencedMessage.isValid()) {
            return false;
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
        changed.addAll(unsequencedMessage.diffFields(message.unsequencedMessage));
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
            builder.append(", ");
            unsequencedMessage.toFormattedString(builder, options);
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
        unsequencedMessage.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && unsequencedMessage.equals(message.unsequencedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, unsequencedMessage);
    }
}
