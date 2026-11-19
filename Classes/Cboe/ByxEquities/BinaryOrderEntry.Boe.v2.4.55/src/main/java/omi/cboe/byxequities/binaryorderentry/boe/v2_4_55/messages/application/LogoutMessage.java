package omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.fields.LastReceivedSequenceNumberField;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.fields.LogoutReasonField;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.fields.LogoutReasonTextField;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.fields.NumberOfUnitsField;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.types.Field;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.types.Message;
import omi.cboe.byxequities.binaryorderentry.boe.v2_4_55.types.PrintOptions;

/**
 * Represents the LogoutMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Logout message is usually sent in response to a Logout Request message. Any queued data is transmitted, a Logout message is sent, and Cboe will close the connection. A Logout may also be sent if the Member violates the protocol specification (e.g., by moving backwards in sequence number).</p>
 */
public final class LogoutMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Logout Message";

    /**
     * The reason why the Logout message was sent.
     */
    private final LogoutReasonField logoutReason = new LogoutReasonField();

    /**
     * Human-readable text with additional information about the reason for logout. Particularly useful if LogoutReason = ! (Protocol Violation).
     */
    private final LogoutReasonTextField logoutReasonText = new LogoutReasonTextField();

    /**
     * Last inbound (Member to Cboe) message sequence number processed by Cboe.
     */
    private final LastReceivedSequenceNumberField lastReceivedSequenceNumber = new LastReceivedSequenceNumberField();

    /**
     * A number, n, of unit/sequence pairs to follow, one per unit. A pair for every unit will be sent, even if no messages have been sent to this port today. For unsuccessful logins, this will be 0.
     */
    private final NumberOfUnitsField numberOfUnits = new NumberOfUnitsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(logoutReason, logoutReasonText, lastReceivedSequenceNumber, numberOfUnits);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The reason why the Logout message was sent.
     *
     * @return the LogoutReason field
     */
    public LogoutReasonField logoutReason() {
        return logoutReason;
    }

    /**
     * Human-readable text with additional information about the reason for logout. Particularly useful if LogoutReason = ! (Protocol Violation).
     *
     * @return the LogoutReasonText field
     */
    public LogoutReasonTextField logoutReasonText() {
        return logoutReasonText;
    }

    /**
     * Last inbound (Member to Cboe) message sequence number processed by Cboe.
     *
     * @return the LastReceivedSequenceNumber field
     */
    public LastReceivedSequenceNumberField lastReceivedSequenceNumber() {
        return lastReceivedSequenceNumber;
    }

    /**
     * A number, n, of unit/sequence pairs to follow, one per unit. A pair for every unit will be sent, even if no messages have been sent to this port today. For unsuccessful logins, this will be 0.
     *
     * @return the NumberOfUnits field
     */
    public NumberOfUnitsField numberOfUnits() {
        return numberOfUnits;
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
        if (!logoutReason.parse(data, cursor)) {
            return false;
        }
        cursor += LogoutReasonField.BYTE_LENGTH;
        if (!logoutReasonText.parse(data, cursor)) {
            return false;
        }
        cursor += LogoutReasonTextField.BYTE_LENGTH;
        if (!lastReceivedSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += LastReceivedSequenceNumberField.BYTE_LENGTH;
        return numberOfUnits.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = logoutReason.encode(data, cursor);
        cursor = logoutReasonText.encode(data, cursor);
        cursor = lastReceivedSequenceNumber.encode(data, cursor);
        cursor = numberOfUnits.encode(data, cursor);
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
            case "LogoutReason" -> Optional.of(logoutReason);
            case "LogoutReasonText" -> Optional.of(logoutReasonText);
            case "LastReceivedSequenceNumber" -> Optional.of(lastReceivedSequenceNumber);
            case "NumberOfUnits" -> Optional.of(numberOfUnits);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LogoutMessage message)) {
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
        if (!(other instanceof LogoutMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
