package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastReceivedSequenceNumberField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LogoutReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LogoutReasonTextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfUnitsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.groups.UnitsEntry;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.groups.UnitsList;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the LogoutMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Logout Message.</p>
 */
public final class LogoutMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Logout Message";

    /**
     * The reason why the Logout message was sent. U=User Requested E=End of Day A=Administrative !=Protocol Violation
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
     * Repeating group stated NumberOfUnits times.
     */
    private final UnitsList units = new UnitsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(logoutReason, logoutReasonText, lastReceivedSequenceNumber, numberOfUnits);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The reason why the Logout message was sent. U=User Requested E=End of Day A=Administrative !=Protocol Violation
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

    /**
     * Repeating group stated NumberOfUnits times.
     *
     * <p>Encode writes this list's size to the NumberOfUnits field.</p>
     *
     * @return the Units entries
     */
    public UnitsList units() {
        return units;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + units.byteLength();
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
        if (!numberOfUnits.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfUnitsField.BYTE_LENGTH;
        if (!units.parse(data, cursor, end, numberOfUnits.value())) {
            return false;
        }
        cursor += units.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (units.size() > 255) {
            throw new IllegalStateException("units holds " + units.size() + " entries, more than its count field can state");
        }
        numberOfUnits.value((short) units.size());
        int cursor = offset;
        cursor = logoutReason.encode(data, cursor);
        cursor = logoutReasonText.encode(data, cursor);
        cursor = lastReceivedSequenceNumber.encode(data, cursor);
        cursor = numberOfUnits.encode(data, cursor);
        cursor = units.encode(data, cursor);
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
        units.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfUnits && !field.isRecognized()) {
                return false;
            }
        }
        return units.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfUnits && !field.isValid()) {
                return false;
            }
        }
        if (!units.isValid()) {
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
        if (!logoutReason.isDecoded()) {
            return Optional.of(logoutReason);
        }
        if (!logoutReasonText.isDecoded()) {
            return Optional.of(logoutReasonText);
        }
        if (!lastReceivedSequenceNumber.isDecoded()) {
            return Optional.of(lastReceivedSequenceNumber);
        }
        if (!numberOfUnits.isDecoded()) {
            return Optional.of(numberOfUnits);
        }
        if (!units.isDecoded()) {
            return Optional.of(units.failedEntry().flatMap(UnitsEntry::failedAt).orElse(numberOfUnits));
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
        changed.addAll(units.diffFields(message.units));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            units.toFormattedString(builder, options);
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
        units.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && units.equals(message.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, units);
    }
}
