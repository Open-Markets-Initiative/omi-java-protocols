package omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.RejectReasonField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceIdField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceSeqNumField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.StatusField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.PrintOptions;

/**
 * Represents the RequestResponseMessage message from the OpenBook protocol.
 *
 * <p>This message will be sent immediately via TCP/IP in response to the client's request for a retransmission, refresh, or Symbol Index information. The requested information will follow in the appropriate retransmission or refresh channel.</p>
 */
public final class RequestResponseMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Request Response Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 26, 2 };

    /**
     * The sequence number assigned by the client to the original request. It is returned by NYSE in this message for the client's identification purposes.
     */
    private final SourceSeqNumField sourceSeqNum = new SourceSeqNumField();

    /**
     * The ID of the client that sent the request, left justified and null padded.
     */
    private final SourceIdField sourceId = new SourceIdField();

    /**
     * Status of the request.
     */
    private final StatusField status = new StatusField();

    /**
     * The reason why the request was rejected.
     */
    private final RejectReasonField rejectReason = new RejectReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceSeqNum, sourceId, status, rejectReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The sequence number assigned by the client to the original request. It is returned by NYSE in this message for the client's identification purposes.
     *
     * @return the SourceSeqNum field
     */
    public SourceSeqNumField sourceSeqNum() {
        return sourceSeqNum;
    }

    /**
     * The ID of the client that sent the request, left justified and null padded.
     *
     * @return the SourceId field
     */
    public SourceIdField sourceId() {
        return sourceId;
    }

    /**
     * Status of the request.
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * The reason why the request was rejected.
     *
     * @return the RejectReason field
     */
    public RejectReasonField rejectReason() {
        return rejectReason;
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
        if (!sourceSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SourceSeqNumField.BYTE_LENGTH;
        if (!sourceId.parse(data, cursor)) {
            return false;
        }
        cursor += SourceIdField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!rejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += RejectReasonField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceSeqNum.encode(data, cursor);
        cursor = sourceId.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = rejectReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 28) {
            System.arraycopy(buffer, 26, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "SourceSeqNum" -> Optional.of(sourceSeqNum);
            case "SourceId" -> Optional.of(sourceId);
            case "Status" -> Optional.of(status);
            case "RejectReason" -> Optional.of(rejectReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RequestResponseMessage message)) {
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
        if (!(other instanceof RequestResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
