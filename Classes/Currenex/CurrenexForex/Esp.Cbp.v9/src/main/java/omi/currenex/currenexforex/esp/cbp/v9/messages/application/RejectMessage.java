package omi.currenex.currenexforex.esp.cbp.v9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.currenex.currenexforex.esp.cbp.v9.fields.RejectMsgTypeField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.RejectReasonField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.SessionIdField;
import omi.currenex.currenexforex.esp.cbp.v9.types.Field;
import omi.currenex.currenexforex.esp.cbp.v9.types.Message;
import omi.currenex.currenexforex.esp.cbp.v9.types.PrintOptions;

/**
 * Represents the RejectMessage message from the Esp protocol.
 *
 * <p>Included in the InstrumentInfo message is the InstrumentType, a free form instrument definition, and the InstrumentIndex used to request quotes and manage price updates</p>
 */
public final class RejectMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reject Message";

    /**
     * Unique session id provided by Currenex
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * Rejected message type
     */
    private final RejectMsgTypeField rejectMsgType = new RejectMsgTypeField();

    /**
     * Free form reject reason text
     */
    private final RejectReasonField rejectReason = new RejectReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionId, rejectMsgType, rejectReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique session id provided by Currenex
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * Rejected message type
     *
     * @return the RejectMsgType field
     */
    public RejectMsgTypeField rejectMsgType() {
        return rejectMsgType;
    }

    /**
     * Free form reject reason text
     *
     * @return the RejectReason field
     */
    public RejectReasonField rejectReason() {
        return rejectReason;
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
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!rejectMsgType.parse(data, cursor)) {
            return false;
        }
        cursor += RejectMsgTypeField.BYTE_LENGTH;
        return rejectReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = rejectMsgType.encode(data, cursor);
        cursor = rejectReason.encode(data, cursor);
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
            case "SessionId" -> Optional.of(sessionId);
            case "RejectMsgType" -> Optional.of(rejectMsgType);
            case "RejectReason" -> Optional.of(rejectReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RejectMessage message)) {
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
        if (!(other instanceof RejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
