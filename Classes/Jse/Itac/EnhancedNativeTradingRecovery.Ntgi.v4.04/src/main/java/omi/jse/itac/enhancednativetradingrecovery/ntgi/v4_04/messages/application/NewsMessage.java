package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.FirmListField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.HeadlineField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.InstrumentsField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.OrigTimeField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.PartitionIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SequenceNumberField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.TextField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.UnderlyingsField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.UrgencyField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.UserListField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Message;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.PrintOptions;

/**
 * Represents the NewsMessage message from the EnhancedNativeTradingRecovery protocol.
 *
 * <p>Carries a market operations announcement.</p>
 */
public final class NewsMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1188;

    /**
     * This message's declared name.
     */
    public static final String NAME = "News Message";

    /**
     * Identity of the matching partition the request relates to
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Sequence number immediately after that of the last message received from the partition
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Time the announcement was published
     */
    private final OrigTimeField origTime = new OrigTimeField();

    /**
     * Urgency of the announcement
     */
    private final UrgencyField urgency = new UrgencyField();

    /**
     * Headline or subject of market operations announcement
     */
    private final HeadlineField headline = new HeadlineField();

    /**
     * Text of the market operations announcement
     */
    private final TextField text = new TextField();

    /**
     * Pipe separated list of symbols of the instruments the announcements relate to
     */
    private final InstrumentsField instruments = new InstrumentsField();

    /**
     * Pipe separated list of symbols of underlyings the instruments relate to
     */
    private final UnderlyingsField underlyings = new UnderlyingsField();

    /**
     * Pipe separated list of firms that the announcement should be sent to
     */
    private final FirmListField firmList = new FirmListField();

    /**
     * Pipe separated list of users that the announcement should be sent to
     */
    private final UserListField userList = new UserListField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, origTime, urgency, headline, text, instruments, underlyings, firmList, userList);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identity of the matching partition the request relates to
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * Sequence number immediately after that of the last message received from the partition
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Time the announcement was published
     *
     * @return the OrigTime field
     */
    public OrigTimeField origTime() {
        return origTime;
    }

    /**
     * Urgency of the announcement
     *
     * @return the Urgency field
     */
    public UrgencyField urgency() {
        return urgency;
    }

    /**
     * Headline or subject of market operations announcement
     *
     * @return the Headline field
     */
    public HeadlineField headline() {
        return headline;
    }

    /**
     * Text of the market operations announcement
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
    }

    /**
     * Pipe separated list of symbols of the instruments the announcements relate to
     *
     * @return the Instruments field
     */
    public InstrumentsField instruments() {
        return instruments;
    }

    /**
     * Pipe separated list of symbols of underlyings the instruments relate to
     *
     * @return the Underlyings field
     */
    public UnderlyingsField underlyings() {
        return underlyings;
    }

    /**
     * Pipe separated list of firms that the announcement should be sent to
     *
     * @return the FirmList field
     */
    public FirmListField firmList() {
        return firmList;
    }

    /**
     * Pipe separated list of users that the announcement should be sent to
     *
     * @return the UserList field
     */
    public UserListField userList() {
        return userList;
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
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!origTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimeField.BYTE_LENGTH;
        if (!urgency.parse(data, cursor)) {
            return false;
        }
        cursor += UrgencyField.BYTE_LENGTH;
        if (!headline.parse(data, cursor)) {
            return false;
        }
        cursor += HeadlineField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        if (!instruments.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentsField.BYTE_LENGTH;
        if (!underlyings.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingsField.BYTE_LENGTH;
        if (!firmList.parse(data, cursor)) {
            return false;
        }
        cursor += FirmListField.BYTE_LENGTH;
        return userList.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        cursor = urgency.encode(data, cursor);
        cursor = headline.encode(data, cursor);
        cursor = text.encode(data, cursor);
        cursor = instruments.encode(data, cursor);
        cursor = underlyings.encode(data, cursor);
        cursor = firmList.encode(data, cursor);
        cursor = userList.encode(data, cursor);
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
            case "PartitionId" -> Optional.of(partitionId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "OrigTime" -> Optional.of(origTime);
            case "Urgency" -> Optional.of(urgency);
            case "Headline" -> Optional.of(headline);
            case "Text" -> Optional.of(text);
            case "Instruments" -> Optional.of(instruments);
            case "Underlyings" -> Optional.of(underlyings);
            case "FirmList" -> Optional.of(firmList);
            case "UserList" -> Optional.of(userList);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewsMessage message)) {
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
        if (!(other instanceof NewsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
