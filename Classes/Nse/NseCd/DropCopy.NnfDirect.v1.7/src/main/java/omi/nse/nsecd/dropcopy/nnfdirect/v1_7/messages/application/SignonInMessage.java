package omi.nse.nsecd.dropcopy.nnfdirect.v1_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.fields.BrokerIdField;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.fields.PasswordField;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.fields.UserIdField;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Field;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Message;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.PrintOptions;

/**
 * Represents the SignonInMessage message from the DropCopy protocol.
 *
 * <p>Logs the user on to the drop copy feed</p>
 */
public final class SignonInMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 238;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Signon In Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 4, 8, 24, 4, 28, 38, 71, 119, 190, 16, 206, 16, 222, 16 };

    /**
     * User Id of the user
     */
    private final UserIdField userId = new UserIdField();

    /**
     * Password entered by the user; alphabet, numbers and special characters are allowed
     */
    private final PasswordField password = new PasswordField();

    /**
     * Trading member Id
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userId, password, brokerId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * User Id of the user
     *
     * @return the UserId field
     */
    public UserIdField userId() {
        return userId;
    }

    /**
     * Password entered by the user; alphabet, numbers and special characters are allowed
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
    }

    /**
     * Trading member Id
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
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
        return PADDING.clone();
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
        if (!userId.parse(data, cursor)) {
            return false;
        }
        cursor += UserIdField.BYTE_LENGTH;
        cursor += 8; // padding
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
        cursor += 42; // padding
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = userId.encode(data, cursor);
        if (buffer != null && buffer.length >= 12) {
            System.arraycopy(buffer, 4, data, cursor, 8); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 8, (byte) 0); // padding
        }
        cursor += 8;
        cursor = password.encode(data, cursor);
        if (buffer != null && buffer.length >= 66) {
            System.arraycopy(buffer, 24, data, cursor, 42); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 42, (byte) 0); // padding
        }
        cursor += 42;
        cursor = brokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 238) {
            System.arraycopy(buffer, 71, data, cursor, 167); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 167, (byte) 0); // padding
        }
        cursor += 167;
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
            case "UserId" -> Optional.of(userId);
            case "Password" -> Optional.of(password);
            case "BrokerId" -> Optional.of(brokerId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SignonInMessage message)) {
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
        if (!(other instanceof SignonInMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
