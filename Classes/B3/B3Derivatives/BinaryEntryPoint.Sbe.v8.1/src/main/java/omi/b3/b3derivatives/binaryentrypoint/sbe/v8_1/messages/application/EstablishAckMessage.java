package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.KeepAliveIntervalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.LastIncomingSeqNoField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.NextSeqNoField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.RequestTimestampField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SessionIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SessionVerIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the EstablishAckMessage message from the BinaryEntryPoint protocol.
 *
 * <p>EstablishAckMessage</p>
 */
public final class EstablishAckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Establish Ack Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * sessionID
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * sessionVerID
     */
    private final SessionVerIdField sessionVerId = new SessionVerIdField();

    /**
     * requestTimestamp
     */
    private final RequestTimestampField requestTimestamp = new RequestTimestampField();

    /**
     * keepAliveInterval
     */
    private final KeepAliveIntervalField keepAliveInterval = new KeepAliveIntervalField();

    /**
     * nextSeqNo
     */
    private final NextSeqNoField nextSeqNo = new NextSeqNoField();

    /**
     * lastIncomingSeqNo
     */
    private final LastIncomingSeqNoField lastIncomingSeqNo = new LastIncomingSeqNoField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionId, sessionVerId, requestTimestamp, keepAliveInterval, nextSeqNo, lastIncomingSeqNo);

    private byte[] buffer;

    private boolean decoded;

    /**
     * sessionID
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * sessionVerID
     *
     * @return the SessionVerId field
     */
    public SessionVerIdField sessionVerId() {
        return sessionVerId;
    }

    /**
     * requestTimestamp
     *
     * @return the RequestTimestamp field
     */
    public RequestTimestampField requestTimestamp() {
        return requestTimestamp;
    }

    /**
     * keepAliveInterval
     *
     * @return the KeepAliveInterval field
     */
    public KeepAliveIntervalField keepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * nextSeqNo
     *
     * @return the NextSeqNo field
     */
    public NextSeqNoField nextSeqNo() {
        return nextSeqNo;
    }

    /**
     * lastIncomingSeqNo
     *
     * @return the LastIncomingSeqNo field
     */
    public LastIncomingSeqNoField lastIncomingSeqNo() {
        return lastIncomingSeqNo;
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
        return Optional.ofNullable(requestTimestamp.value());
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
        if (!sessionVerId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionVerIdField.BYTE_LENGTH;
        if (!requestTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimestampField.BYTE_LENGTH;
        if (!keepAliveInterval.parse(data, cursor)) {
            return false;
        }
        cursor += KeepAliveIntervalField.BYTE_LENGTH;
        if (!nextSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += NextSeqNoField.BYTE_LENGTH;
        if (!lastIncomingSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += LastIncomingSeqNoField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = sessionVerId.encode(data, cursor);
        cursor = requestTimestamp.encode(data, cursor);
        cursor = keepAliveInterval.encode(data, cursor);
        cursor = nextSeqNo.encode(data, cursor);
        cursor = lastIncomingSeqNo.encode(data, cursor);
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
            case "SessionVerId" -> Optional.of(sessionVerId);
            case "RequestTimestamp" -> Optional.of(requestTimestamp);
            case "KeepAliveInterval" -> Optional.of(keepAliveInterval);
            case "NextSeqNo" -> Optional.of(nextSeqNo);
            case "LastIncomingSeqNo" -> Optional.of(lastIncomingSeqNo);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EstablishAckMessage message)) {
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
        if (!(other instanceof EstablishAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
