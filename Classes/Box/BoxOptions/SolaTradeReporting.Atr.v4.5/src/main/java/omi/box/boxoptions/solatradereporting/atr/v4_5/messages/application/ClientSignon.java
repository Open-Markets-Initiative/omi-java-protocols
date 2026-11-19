package omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.InitialSequenceNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.MemberNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.PasswordMd5EncryptionField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ProtocolVersionField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.TimeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.UsernameField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Field;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.PrintOptions;

/**
 * Represents the ClientSignon message from the SolaTradeReporting protocol.
 */
public final class ClientSignon implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Client Signon";

    /**
     * In the [0001,9999] range Right justified, zero padded
     */
    private final MemberNumberField memberNumber = new MemberNumberField();

    /**
     * The ATR Server will begin at this specific sequence number In the [1,99999999] range Right justified, zero padded
     */
    private final InitialSequenceNumberField initialSequenceNumber = new InitialSequenceNumberField();

    /**
     * Protocol versions supported: A2, A3
     */
    private final ProtocolVersionField protocolVersion = new ProtocolVersionField();

    /**
     * Time at which the Client Signon is sent (HHMMSS)
     */
    private final TimeField time = new TimeField();

    /**
     * Identifies the User for a connection. The Username must be configured by BOX MOC (Please contact BOX MOC for details)
     */
    private final UsernameField username = new UsernameField();

    /**
     * Used when establishing an ATR Logical connection See Section 7 for details on how to encode password. (Please contact BOX MOC for details about new password procedure or password reset)
     */
    private final PasswordMd5EncryptionField passwordMd5Encryption = new PasswordMd5EncryptionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(memberNumber, initialSequenceNumber, protocolVersion, time, username, passwordMd5Encryption);

    private byte[] buffer;

    private boolean decoded;

    /**
     * In the [0001,9999] range Right justified, zero padded
     *
     * @return the MemberNumber field
     */
    public MemberNumberField memberNumber() {
        return memberNumber;
    }

    /**
     * The ATR Server will begin at this specific sequence number In the [1,99999999] range Right justified, zero padded
     *
     * @return the InitialSequenceNumber field
     */
    public InitialSequenceNumberField initialSequenceNumber() {
        return initialSequenceNumber;
    }

    /**
     * Protocol versions supported: A2, A3
     *
     * @return the ProtocolVersion field
     */
    public ProtocolVersionField protocolVersion() {
        return protocolVersion;
    }

    /**
     * Time at which the Client Signon is sent (HHMMSS)
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Identifies the User for a connection. The Username must be configured by BOX MOC (Please contact BOX MOC for details)
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * Used when establishing an ATR Logical connection See Section 7 for details on how to encode password. (Please contact BOX MOC for details about new password procedure or password reset)
     *
     * @return the PasswordMd5Encryption field
     */
    public PasswordMd5EncryptionField passwordMd5Encryption() {
        return passwordMd5Encryption;
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
        if (!memberNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MemberNumberField.BYTE_LENGTH;
        if (!initialSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += InitialSequenceNumberField.BYTE_LENGTH;
        if (!protocolVersion.parse(data, cursor)) {
            return false;
        }
        cursor += ProtocolVersionField.BYTE_LENGTH;
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        return passwordMd5Encryption.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = memberNumber.encode(data, cursor);
        cursor = initialSequenceNumber.encode(data, cursor);
        cursor = protocolVersion.encode(data, cursor);
        cursor = time.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = passwordMd5Encryption.encode(data, cursor);
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
            case "MemberNumber" -> Optional.of(memberNumber);
            case "InitialSequenceNumber" -> Optional.of(initialSequenceNumber);
            case "ProtocolVersion" -> Optional.of(protocolVersion);
            case "Time" -> Optional.of(time);
            case "Username" -> Optional.of(username);
            case "PasswordMd5Encryption" -> Optional.of(passwordMd5Encryption);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ClientSignon message)) {
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
        if (!(other instanceof ClientSignon message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
