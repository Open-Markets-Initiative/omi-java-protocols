package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.StatusField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.UsernameField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs.MsgHeader;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the LoginResponse message from the BinaryGateway protocol.
 *
 * <p>Pillar Stream Login Response Message Branch</p>
 */
public final class LoginResponse implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Login Response";

    /**
     * Unique identifier of the gateway session – SenderCompID.
     */
    private final UsernameField username = new UsernameField();

    /**
     * Pillar Status Code
     */
    private final StatusField status = new StatusField();

    /**
     * Pillar Stream Message Header
     */
    private final MsgHeader msgHeader = new MsgHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(msgHeader.fields(), List.<Field>of(username), List.<Field>of(status)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique identifier of the gateway session – SenderCompID.
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * Pillar Status Code
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * Pillar Stream Message Header
     *
     * @return the MsgHeader record
     */
    public MsgHeader msgHeader() {
        return msgHeader;
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
        if (!msgHeader.parseFrom(data, cursor, end - 17)) {
            return false;
        }
        cursor += msgHeader.byteLength();
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        return status.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgHeader.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = status.encode(data, cursor);
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
        msgHeader.clear();
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
            case "Username" -> Optional.of(username);
            case "Status" -> Optional.of(status);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LoginResponse message)) {
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
        if (!(other instanceof LoginResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
