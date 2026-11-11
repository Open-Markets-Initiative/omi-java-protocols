package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.NumberOfUnitsField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.PasswordField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ReplayUnspecifiedUnitField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SessionIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SessionSubIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.UnitSequenceEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.UnitSequenceList;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the LoginRequestMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Login Request message must be sent as the first message upon connection</p>
 */
public final class LoginRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Login Request Message";

    /**
     * Session Id as supplied by CFE
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * Session Sub Id as supplied by CFE
     */
    private final SessionSubIdField sessionSubId = new SessionSubIdField();

    /**
     * The password associated with the SessionId and SessionSubId.
     */
    private final PasswordField password = new PasswordField();

    /**
     * Controls replay behavior for unknown units.
     */
    private final ReplayUnspecifiedUnitField replayUnspecifiedUnit = new ReplayUnspecifiedUnitField();

    /**
     * The number (possibly 0) of unit/sequence pairs to follow, one per unit from which the TPH has received messages over this port. The value must be 0 or 1 since all BOEv3 ports are associated to a single unit.
     */
    private final NumberOfUnitsField numberOfUnits = new NumberOfUnitsField();

    /**
     * Unit Sequence
     */
    private final UnitSequenceList unitSequence = new UnitSequenceList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionId, sessionSubId, password, replayUnspecifiedUnit, numberOfUnits);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Session Id as supplied by CFE
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * Session Sub Id as supplied by CFE
     *
     * @return the SessionSubId field
     */
    public SessionSubIdField sessionSubId() {
        return sessionSubId;
    }

    /**
     * The password associated with the SessionId and SessionSubId.
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
    }

    /**
     * Controls replay behavior for unknown units.
     *
     * @return the ReplayUnspecifiedUnit field
     */
    public ReplayUnspecifiedUnitField replayUnspecifiedUnit() {
        return replayUnspecifiedUnit;
    }

    /**
     * The number (possibly 0) of unit/sequence pairs to follow, one per unit from which the TPH has received messages over this port. The value must be 0 or 1 since all BOEv3 ports are associated to a single unit.
     *
     * @return the NumberOfUnits field
     */
    public NumberOfUnitsField numberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Unit Sequence
     *
     * <p>Encode writes this list's size to the NumberOfUnits field.</p>
     *
     * @return the UnitSequence entries
     */
    public UnitSequenceList unitSequence() {
        return unitSequence;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + unitSequence.byteLength();
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
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!sessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionSubIdField.BYTE_LENGTH;
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
        if (!replayUnspecifiedUnit.parse(data, cursor)) {
            return false;
        }
        cursor += ReplayUnspecifiedUnitField.BYTE_LENGTH;
        if (!numberOfUnits.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfUnitsField.BYTE_LENGTH;
        if (!unitSequence.parse(data, cursor, end, numberOfUnits.value())) {
            return false;
        }
        cursor += unitSequence.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (unitSequence.size() > 255) {
            throw new IllegalStateException("unitSequence holds " + unitSequence.size() + " entries, more than its count field can state");
        }
        numberOfUnits.value((short) unitSequence.size());
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = sessionSubId.encode(data, cursor);
        cursor = password.encode(data, cursor);
        cursor = replayUnspecifiedUnit.encode(data, cursor);
        cursor = numberOfUnits.encode(data, cursor);
        cursor = unitSequence.encode(data, cursor);
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
        unitSequence.clear();
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
        return unitSequence.isRecognized();
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
        if (!unitSequence.isValid()) {
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
        if (!sessionId.isDecoded()) {
            return Optional.of(sessionId);
        }
        if (!sessionSubId.isDecoded()) {
            return Optional.of(sessionSubId);
        }
        if (!password.isDecoded()) {
            return Optional.of(password);
        }
        if (!replayUnspecifiedUnit.isDecoded()) {
            return Optional.of(replayUnspecifiedUnit);
        }
        if (!numberOfUnits.isDecoded()) {
            return Optional.of(numberOfUnits);
        }
        if (!unitSequence.isDecoded()) {
            return Optional.of(unitSequence.failedEntry().flatMap(UnitSequenceEntry::failedAt).orElse(numberOfUnits));
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
            case "SessionId" -> Optional.of(sessionId);
            case "SessionSubId" -> Optional.of(sessionSubId);
            case "Password" -> Optional.of(password);
            case "ReplayUnspecifiedUnit" -> Optional.of(replayUnspecifiedUnit);
            case "NumberOfUnits" -> Optional.of(numberOfUnits);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LoginRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(unitSequence.diffFields(message.unitSequence));
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
            unitSequence.toFormattedString(builder, options);
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
        unitSequence.toFormattedString(builder, nested);
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
        if (!(other instanceof LoginRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && unitSequence.equals(message.unitSequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, unitSequence);
    }
}
