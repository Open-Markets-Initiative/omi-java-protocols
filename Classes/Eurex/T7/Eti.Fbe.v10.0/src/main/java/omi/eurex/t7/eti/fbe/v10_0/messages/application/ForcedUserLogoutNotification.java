package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.UserStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.UsernameField;
import omi.eurex.t7.eti.fbe.v10_0.fields.VarTextLenField;
import omi.eurex.t7.eti.fbe.v10_0.structs.NotifHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;
import omi.eurex.t7.eti.fbe.v10_0.types.SizedField;

/**
 * Represents the ForcedUserLogoutNotification message from the Eti protocol.
 */
public final class ForcedUserLogoutNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 18;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Forced User Logout Notification";

    /**
     * Username
     */
    private final UsernameField username = new UsernameField();

    /**
     * Var Text Len
     */
    private final VarTextLenField varTextLen = new VarTextLenField();

    /**
     * User Status
     */
    private final UserStatusField userStatus = new UserStatusField();

    /**
     * Var Text
     */
    private final SizedField varText = new SizedField("VarText", true);

    /**
     * Notif Header Comp
     */
    private final NotifHeaderComp notifHeaderComp = new NotifHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(notifHeaderComp.fields(), List.<Field>of(username), List.<Field>of(varTextLen), List.<Field>of(userStatus), List.<Field>of(varText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Username
     *
     * @return the Username field
     */
    public UsernameField username() {
        return username;
    }

    /**
     * Var Text Len
     *
     * @return the VarTextLen field
     */
    public VarTextLenField varTextLen() {
        return varTextLen;
    }

    /**
     * User Status
     *
     * @return the UserStatus field
     */
    public UserStatusField userStatus() {
        return userStatus;
    }

    /**
     * Var Text
     *
     * @return the VarText field
     */
    public SizedField varText() {
        return varText;
    }

    /**
     * Notif Header Comp
     *
     * @return the NotifHeaderComp record
     */
    public NotifHeaderComp notifHeaderComp() {
        return notifHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + varText.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = NotifHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NotifHeaderComp.BYTE_LENGTH;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += varText.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(notifHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!notifHeaderComp.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += notifHeaderComp.byteLength();
        if (!username.parse(data, cursor)) {
            return false;
        }
        cursor += UsernameField.BYTE_LENGTH;
        if (!varTextLen.parse(data, cursor)) {
            return false;
        }
        cursor += VarTextLenField.BYTE_LENGTH;
        if (!userStatus.parse(data, cursor)) {
            return false;
        }
        cursor += UserStatusField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!varText.parse(data, cursor, varTextLen.value(), end)) {
            return false;
        }
        cursor += varText.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (varText.byteLength() > 65535) {
            throw new IllegalStateException("varText holds " + varText.byteLength() + " bytes, more than its length field can state");
        }
        varTextLen.value((varText.byteLength()));
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = notifHeaderComp.encode(data, cursor);
        cursor = username.encode(data, cursor);
        cursor = varTextLen.encode(data, cursor);
        cursor = userStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 18) {
            System.arraycopy(buffer, 17, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = varText.encode(data, cursor);
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
        notifHeaderComp.clear();
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
            if (field != varTextLen && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != varTextLen && !field.isValid()) {
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
            case "VarTextLen" -> Optional.of(varTextLen);
            case "UserStatus" -> Optional.of(userStatus);
            case "VarText" -> Optional.of(varText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ForcedUserLogoutNotification message)) {
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
        if (!(other instanceof ForcedUserLogoutNotification message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
