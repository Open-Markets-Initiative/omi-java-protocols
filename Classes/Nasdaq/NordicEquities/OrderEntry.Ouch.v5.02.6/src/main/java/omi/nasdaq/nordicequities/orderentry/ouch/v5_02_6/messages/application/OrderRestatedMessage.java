package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.AppendageLengthField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.RestateReasonField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.TimestampField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.fields.UserRefNumField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.groups.TagvalueEntry;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.groups.TagvalueList;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.Message;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.types.PrintOptions;

/**
 * Represents the OrderRestatedMessage message from the OrderEntry protocol.
 *
 * <p>An order has been restated by the system</p>
 */
public final class OrderRestatedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 15;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Restated Message";

    /**
     * Nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Sequence number, unique and strictly increasing for the day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * The reason for this order being restated
     */
    private final RestateReasonField restateReason = new RestateReasonField();

    /**
     * Remaining length of the TagValue element
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Additional appendage tag value
     */
    private final TagvalueList tagvalue = new TagvalueList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, restateReason, appendageLength);

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
     * The reason for this order being restated
     *
     * @return the RestateReason field
     */
    public RestateReasonField restateReason() {
        return restateReason;
    }

    /**
     * Remaining length of the TagValue element
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Additional appendage tag value
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the Tagvalue entries
     */
    public TagvalueList tagvalue() {
        return tagvalue;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tagvalue.byteLength();
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!restateReason.parse(data, cursor)) {
            return false;
        }
        cursor += RestateReasonField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long tagvalueBudget = appendageLength.value();
        if (tagvalueBudget < 0 || tagvalueBudget > (end) - cursor) {
            return false;
        }
        if (!tagvalue.parse(data, cursor, cursor + (int) tagvalueBudget)) {
            return false;
        }
        cursor += tagvalue.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tagvalue.byteLength() > 65535) {
            throw new IllegalStateException("tagvalue holds " + tagvalue.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((tagvalue.byteLength()));
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = restateReason.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = tagvalue.encode(data, cursor);
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
        tagvalue.clear();
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
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return tagvalue.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!tagvalue.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!restateReason.isDecoded()) {
            return Optional.of(restateReason);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!tagvalue.isDecoded()) {
            return Optional.of(tagvalue.failedEntry().flatMap(TagvalueEntry::failedAt).orElse(appendageLength));
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
            case "RestateReason" -> Optional.of(restateReason);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderRestatedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tagvalue.diffFields(message.tagvalue));
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
            tagvalue.toFormattedString(builder, options);
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
        tagvalue.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderRestatedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tagvalue.equals(message.tagvalue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tagvalue);
    }
}
