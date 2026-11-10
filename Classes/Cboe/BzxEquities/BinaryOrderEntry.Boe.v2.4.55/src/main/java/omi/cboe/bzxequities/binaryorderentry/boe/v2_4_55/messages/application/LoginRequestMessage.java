package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields.NumberOfParamGroupsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields.PasswordField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields.SessionSubIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields.UsernameField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.groups.ParamGroupEntry;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.groups.ParamGroupList;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.PrintOptions;

/**
 * Represents the LoginRequestMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Login Request message must be sent as the first message upon connection. A number of repeating parameter groups are sent at the end of the message.</p>
 */
public final class LoginRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Login Request Message";

    /**
     * Session Sub ID supplied by Cboe.
     */
    private final SessionSubIdField sessionSubId = new SessionSubIdField();

    /**
     * Username supplied by Cboe.
     */
    private final UsernameField username = new UsernameField();

    /**
     * Password supplied by Cboe.
     */
    private final PasswordField password = new PasswordField();

    /**
     * A number, n (possibly 0), of parameter groups to follow.
     */
    private final NumberOfParamGroupsField numberOfParamGroups = new NumberOfParamGroupsField();

    /**
     * Repeating parameter group appended to the Login Request and Login Response messages. NumberOfParamGroups instances follow (count may be 0 — the group is optional). Each instance starts with the 2-byte ParamGroupLength + 1-byte ParamGroupType header; the remaining (ParamGroupLength - 3) payload bytes are interpreted per ParamGroupType (0x80 = Unit Sequences Parameter Group, 0x81 = Return Bitfields Parameter Group). New parameter group types may be added without notice; unrecognized types should be skipped using ParamGroupLength.
     */
    private final ParamGroupList paramGroup = new ParamGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionSubId, username, password, numberOfParamGroups);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Session Sub ID supplied by Cboe.
     *
     * @return the SessionSubId field
     */
    public SessionSubIdField sessionSubId() {
        return sessionSubId;
    }

    /**
     * Username supplied by Cboe.
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * Password supplied by Cboe.
     *
     * @return the Password field
     */
    public PasswordField password() {
        return password;
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
     * Repeating parameter group appended to the Login Request and Login Response messages. NumberOfParamGroups instances follow (count may be 0 — the group is optional). Each instance starts with the 2-byte ParamGroupLength + 1-byte ParamGroupType header; the remaining (ParamGroupLength - 3) payload bytes are interpreted per ParamGroupType (0x80 = Unit Sequences Parameter Group, 0x81 = Return Bitfields Parameter Group). New parameter group types may be added without notice; unrecognized types should be skipped using ParamGroupLength.
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
        return MINIMUM_BYTE_LENGTH + paramGroup.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 10;
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
        if (!sessionSubId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionSubIdField.BYTE_LENGTH;
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        if (!password.parse(data, cursor)) {
            return false;
        }
        cursor += PasswordField.BYTE_LENGTH;
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
        if (paramGroup.size() > 255) {
            throw new IllegalStateException("paramGroup holds " + paramGroup.size() + " entries, more than its count field can state");
        }
        numberOfParamGroups.value((short) paramGroup.size());
        int cursor = offset;
        cursor = sessionSubId.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = password.encode(data, cursor);
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
            if (field != numberOfParamGroups && !field.isRecognized()) {
                return false;
            }
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
            if (field != numberOfParamGroups && !field.isValid()) {
                return false;
            }
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
        if (!sessionSubId.isDecoded()) {
            return Optional.of(sessionSubId);
        }
        if (!username.isDecoded()) {
            return Optional.of(username);
        }
        if (!password.isDecoded()) {
            return Optional.of(password);
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
            case "SessionSubId" -> Optional.of(sessionSubId);
            case "Username" -> Optional.of(username);
            case "Password" -> Optional.of(password);
            case "NumberOfParamGroups" -> Optional.of(numberOfParamGroups);
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
        if (!(other instanceof LoginRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && paramGroup.equals(message.paramGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, paramGroup);
    }
}
