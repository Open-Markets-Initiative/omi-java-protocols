package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.AddOrRemoveField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.InstructionField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.InstructionStatusField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.OrderBookField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.TimestampField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.UserField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.fields.UserRefNumField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.structs.Firm;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.types.Message;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.types.PrintOptions;

/**
 * Represents the ResponseToMmiNotificationMessage message from the OrderEntry protocol.
 *
 * <p>Response to a market making instruction notification</p>
 */
public final class ResponseToMmiNotificationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Response To Mmi Notification Message";

    /**
     * Nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Sequence number, unique and strictly increasing for the day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Order book id
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Notification reason
     */
    private final InstructionField instruction = new InstructionField();

    /**
     * Whether the instruction is added or removed
     */
    private final AddOrRemoveField addOrRemove = new AddOrRemoveField();

    /**
     * Name of responsible trader
     */
    private final UserField user = new UserField();

    /**
     * Whether the instruction was accepted or rejected
     */
    private final InstructionStatusField instructionStatus = new InstructionStatusField();

    /**
     * Firm
     */
    private final Firm firm = new Firm();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(timestampField), List.<Field>of(userRefNum), List.<Field>of(orderBook), List.<Field>of(instruction), List.<Field>of(addOrRemove), firm.fields(), List.<Field>of(user), List.<Field>of(instructionStatus)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds past midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Sequence number, unique and strictly increasing for the day
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Order book id
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Notification reason
     *
     * @return the Instruction field
     */
    public InstructionField instruction() {
        return instruction;
    }

    /**
     * Whether the instruction is added or removed
     *
     * @return the AddOrRemove field
     */
    public AddOrRemoveField addOrRemove() {
        return addOrRemove;
    }

    /**
     * Name of responsible trader
     *
     * @return the User field
     */
    public UserField user() {
        return user;
    }

    /**
     * Whether the instruction was accepted or rejected
     *
     * @return the InstructionStatus field
     */
    public InstructionStatusField instructionStatus() {
        return instructionStatus;
    }

    /**
     * Firm
     *
     * @return the Firm record
     */
    public Firm firm() {
        return firm;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!instruction.parse(data, cursor)) {
            return false;
        }
        cursor += InstructionField.BYTE_LENGTH;
        if (!addOrRemove.parse(data, cursor)) {
            return false;
        }
        cursor += AddOrRemoveField.BYTE_LENGTH;
        if (!firm.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += firm.byteLength();
        if (!user.parse(data, cursor)) {
            return false;
        }
        cursor += UserField.BYTE_LENGTH;
        return instructionStatus.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = instruction.encode(data, cursor);
        cursor = addOrRemove.encode(data, cursor);
        cursor = firm.encode(data, cursor);
        cursor = user.encode(data, cursor);
        cursor = instructionStatus.encode(data, cursor);
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
        firm.clear();
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
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "OrderBook" -> Optional.of(orderBook);
            case "Instruction" -> Optional.of(instruction);
            case "AddOrRemove" -> Optional.of(addOrRemove);
            case "User" -> Optional.of(user);
            case "InstructionStatus" -> Optional.of(instructionStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ResponseToMmiNotificationMessage message)) {
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
        if (!(other instanceof ResponseToMmiNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
