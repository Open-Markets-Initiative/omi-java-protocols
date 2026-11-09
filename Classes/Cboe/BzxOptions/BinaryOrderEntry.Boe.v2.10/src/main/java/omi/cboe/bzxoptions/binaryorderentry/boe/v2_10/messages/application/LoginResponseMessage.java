package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LastReceivedSequenceNumberField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LoginResponseStatusField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LoginResponseTextField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NoUnspecifiedUnitReplayField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfParamGroupsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfUnitsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.ParamGroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.ParamGroupList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.UnitSequenceEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.UnitSequenceList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the LoginResponseMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to ‘A’. On a failed login, LoginResponseStatus will be set to a value other than ‘A’, and LoginResponseText will be set to an appropriate failure description.</p>
 */
public final class LoginResponseMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Login Response Message";

    /**
     * Accepted, or the reason for the rejection.
     */
    private final LoginResponseStatusField loginResponseStatus = new LoginResponseStatusField();

    /**
     * Human-readable text with additional information about the reason for rejection. ASCII NUL (0x00) filled on the right, if necessary.
     */
    private final LoginResponseTextField loginResponseText = new LoginResponseTextField();

    /**
     * Echoed back from the original Login Request message.
     */
    private final NoUnspecifiedUnitReplayField noUnspecifiedUnitReplay = new NoUnspecifiedUnitReplayField();

    /**
     * Last inbound (Member to Cboe) message sequence number processed by Cboe.
     */
    private final LastReceivedSequenceNumberField lastReceivedSequenceNumber = new LastReceivedSequenceNumberField();

    /**
     * A number, n, of unit/sequence pairs to follow, one per unit. A pair for every unit will be sent, even if no messages have been sent to this port today. For unsuccessful logins, this will be 0.
     */
    private final NumberOfUnitsField numberOfUnits = new NumberOfUnitsField();

    /**
     * A number, n (possibly 0), of parameter groups to follow.
     */
    private final NumberOfParamGroupsField numberOfParamGroups = new NumberOfParamGroupsField();

    /**
     * Unit Sequence
     */
    private final UnitSequenceList unitSequence = new UnitSequenceList();

    /**
     * Repeating parameter group appended to the Login Request and Login Response messages. NumberOfParamGroups instances follow (count may be 0). Each instance starts with the 2-byte ParamGroupLength + 1-byte ParamGroupType header; the remaining payload bytes are interpreted per ParamGroupType (0x80 = Unit Sequences Parameter Group, 0x81 = Return Bitfields Parameter Group).
     */
    private final ParamGroupList paramGroup = new ParamGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(loginResponseStatus, loginResponseText, noUnspecifiedUnitReplay, lastReceivedSequenceNumber, numberOfUnits, numberOfParamGroups);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Accepted, or the reason for the rejection.
     *
     * @return the LoginResponseStatus field
     */
    public LoginResponseStatusField loginResponseStatus() {
        return loginResponseStatus;
    }

    /**
     * Human-readable text with additional information about the reason for rejection. ASCII NUL (0x00) filled on the right, if necessary.
     *
     * @return the LoginResponseText field
     */
    public LoginResponseTextField loginResponseText() {
        return loginResponseText;
    }

    /**
     * Echoed back from the original Login Request message.
     *
     * @return the NoUnspecifiedUnitReplay field
     */
    public NoUnspecifiedUnitReplayField noUnspecifiedUnitReplay() {
        return noUnspecifiedUnitReplay;
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
     * A number, n (possibly 0), of parameter groups to follow.
     *
     * @return the NumberOfParamGroups field
     */
    public NumberOfParamGroupsField numberOfParamGroups() {
        return numberOfParamGroups;
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

    /**
     * Repeating parameter group appended to the Login Request and Login Response messages. NumberOfParamGroups instances follow (count may be 0). Each instance starts with the 2-byte ParamGroupLength + 1-byte ParamGroupType header; the remaining payload bytes are interpreted per ParamGroupType (0x80 = Unit Sequences Parameter Group, 0x81 = Return Bitfields Parameter Group).
     *
     * <p>Encode writes this list's size to the NumberOfParamGroups field.</p>
     *
     * @return the ParamGroup entries
     */
    public ParamGroupList paramGroup() {
        return paramGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + unitSequence.byteLength() + paramGroup.byteLength();
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
        cursor += 60;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor = unitSequence.padding(runs, cursor);
        cursor += 1;
        cursor = paramGroup.padding(runs, cursor);
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
        if (!loginResponseStatus.parse(data, cursor)) {
            return false;
        }
        cursor += LoginResponseStatusField.BYTE_LENGTH;
        if (!loginResponseText.parse(data, cursor)) {
            return false;
        }
        cursor += LoginResponseTextField.BYTE_LENGTH;
        if (!noUnspecifiedUnitReplay.parse(data, cursor)) {
            return false;
        }
        cursor += NoUnspecifiedUnitReplayField.BYTE_LENGTH;
        if (!lastReceivedSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += LastReceivedSequenceNumberField.BYTE_LENGTH;
        if (!numberOfUnits.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfUnitsField.BYTE_LENGTH;
        if (!unitSequence.parse(data, cursor, end - 1, numberOfUnits.value())) {
            return false;
        }
        cursor += unitSequence.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!numberOfParamGroups.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfParamGroupsField.BYTE_LENGTH;
        if (!paramGroup.parse(data, cursor, end, numberOfParamGroups.value())) {
            return false;
        }
        cursor += paramGroup.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (unitSequence.size() > 255) {
            throw new IllegalStateException("unitSequence holds " + unitSequence.size() + " entries, more than its count field can state");
        }
        if (paramGroup.size() > 255) {
            throw new IllegalStateException("paramGroup holds " + paramGroup.size() + " entries, more than its count field can state");
        }
        numberOfUnits.value((short) unitSequence.size());
        numberOfParamGroups.value((short) paramGroup.size());
        int cursor = offset;
        cursor = loginResponseStatus.encode(data, cursor);
        cursor = loginResponseText.encode(data, cursor);
        cursor = noUnspecifiedUnitReplay.encode(data, cursor);
        cursor = lastReceivedSequenceNumber.encode(data, cursor);
        cursor = numberOfUnits.encode(data, cursor);
        cursor = unitSequence.encode(data, cursor);
        cursor = numberOfParamGroups.encode(data, cursor);
        cursor = paramGroup.encode(data, cursor);
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
        paramGroup.clear();
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
            if (field != numberOfUnits && field != numberOfParamGroups && !field.isRecognized()) {
                return false;
            }
        }
        if (!unitSequence.isRecognized()) {
            return false;
        }
        if (!paramGroup.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfUnits && field != numberOfParamGroups && !field.isValid()) {
                return false;
            }
        }
        if (!unitSequence.isValid()) {
            return false;
        }
        if (!paramGroup.isValid()) {
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
        if (!loginResponseStatus.isDecoded()) {
            return Optional.of(loginResponseStatus);
        }
        if (!loginResponseText.isDecoded()) {
            return Optional.of(loginResponseText);
        }
        if (!noUnspecifiedUnitReplay.isDecoded()) {
            return Optional.of(noUnspecifiedUnitReplay);
        }
        if (!lastReceivedSequenceNumber.isDecoded()) {
            return Optional.of(lastReceivedSequenceNumber);
        }
        if (!numberOfUnits.isDecoded()) {
            return Optional.of(numberOfUnits);
        }
        if (!unitSequence.isDecoded()) {
            return Optional.of(unitSequence.failedEntry().flatMap(UnitSequenceEntry::failedAt).orElse(numberOfUnits));
        }
        if (!numberOfParamGroups.isDecoded()) {
            return Optional.of(numberOfParamGroups);
        }
        if (!paramGroup.isDecoded()) {
            return Optional.of(paramGroup.failedEntry().flatMap(ParamGroupEntry::failedAt).orElse(numberOfParamGroups));
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
            case "LoginResponseStatus" -> Optional.of(loginResponseStatus);
            case "LoginResponseText" -> Optional.of(loginResponseText);
            case "NoUnspecifiedUnitReplay" -> Optional.of(noUnspecifiedUnitReplay);
            case "LastReceivedSequenceNumber" -> Optional.of(lastReceivedSequenceNumber);
            case "NumberOfUnits" -> Optional.of(numberOfUnits);
            case "NumberOfParamGroups" -> Optional.of(numberOfParamGroups);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LoginResponseMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(unitSequence.diffFields(message.unitSequence));
        changed.addAll(paramGroup.diffFields(message.paramGroup));
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
            builder.append(", ");
            paramGroup.toFormattedString(builder, options);
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
        paramGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof LoginResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && unitSequence.equals(message.unitSequence) && paramGroup.equals(message.paramGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, unitSequence, paramGroup);
    }
}
