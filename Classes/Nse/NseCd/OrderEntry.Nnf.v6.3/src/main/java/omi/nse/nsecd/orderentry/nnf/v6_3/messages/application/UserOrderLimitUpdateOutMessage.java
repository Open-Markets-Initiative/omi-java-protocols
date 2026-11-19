package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserNameField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.UserTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.InstrumentUser;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the UserOrderLimitUpdateOutMessage message from the OrderEntry protocol.
 *
 * <p>User Order Limit Update Out, carried in the MS_ORDER_VAL_LIMIT_DATA structure</p>
 */
public final class UserOrderLimitUpdateOutMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 166;

    /**
     * This message's declared name.
     */
    public static final String NAME = "User Order Limit Update Out Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 102, 64 };

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * This field should contain the Branch ID to which the broker belongs
     */
    private final BranchIdField branchId = new BranchIdField();

    /**
     * This field contains the name of user
     */
    private final UserNameField userName = new UserNameField();

    /**
     * UserID
     */
    private final UserIdField userId = new UserIdField();

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     */
    private final UserTypeField userType = new UserTypeField();

    /**
     * INSTRUMENT_USER
     */
    private final InstrumentUser instrumentUser = new InstrumentUser();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(brokerId), List.<Field>of(branchId), List.<Field>of(userName), List.<Field>of(userId), List.<Field>of(userType), instrumentUser.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * This field should contain the Branch ID to which the broker belongs
     *
     * @return the BranchId field
     */
    public BranchIdField branchId() {
        return branchId;
    }

    /**
     * This field contains the name of user
     *
     * @return the UserName field
     */
    public UserNameField userName() {
        return userName;
    }

    /**
     * UserID
     *
     * @return the UserId field
     */
    public UserIdField userId() {
        return userId;
    }

    /**
     * This field can take one of the following values. • ‘0’ denotes Dealer • ‘4’ denotes Corporate Manager • ‘5’ denotes Branch Manager This field should be set to zero while sending to the host
     *
     * @return the UserType field
     */
    public UserTypeField userType() {
        return userType;
    }

    /**
     * INSTRUMENT_USER
     *
     * @return the InstrumentUser record
     */
    public InstrumentUser instrumentUser() {
        return instrumentUser;
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
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!branchId.parse(data, cursor)) {
            return false;
        }
        cursor += BranchIdField.BYTE_LENGTH;
        if (!userName.parse(data, cursor)) {
            return false;
        }
        cursor += UserNameField.BYTE_LENGTH;
        if (!userId.parse(data, cursor)) {
            return false;
        }
        cursor += UserIdField.BYTE_LENGTH;
        if (!userType.parse(data, cursor)) {
            return false;
        }
        cursor += UserTypeField.BYTE_LENGTH;
        if (!instrumentUser.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += instrumentUser.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = brokerId.encode(data, cursor);
        cursor = branchId.encode(data, cursor);
        cursor = userName.encode(data, cursor);
        cursor = userId.encode(data, cursor);
        cursor = userType.encode(data, cursor);
        cursor = instrumentUser.encode(data, cursor);
        if (buffer != null && buffer.length >= 166) {
            System.arraycopy(buffer, 102, data, cursor, 64); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 64, (byte) 0); // padding
        }
        cursor += 64;
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
        instrumentUser.clear();
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
            case "BrokerId" -> Optional.of(brokerId);
            case "BranchId" -> Optional.of(branchId);
            case "UserName" -> Optional.of(userName);
            case "UserId" -> Optional.of(userId);
            case "UserType" -> Optional.of(userType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UserOrderLimitUpdateOutMessage message)) {
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
        if (!(other instanceof UserOrderLimitUpdateOutMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
