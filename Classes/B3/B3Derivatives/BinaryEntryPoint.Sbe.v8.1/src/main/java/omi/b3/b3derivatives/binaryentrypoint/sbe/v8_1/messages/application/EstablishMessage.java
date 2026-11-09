package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CancelOnDisconnectTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.CodTimeoutWindowField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.KeepAliveIntervalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.NextSeqNoField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SessionIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SessionVerIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TimestampField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Credentials;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the EstablishMessage message from the BinaryEntryPoint protocol.
 *
 * <p>EstablishMessage</p>
 */
public final class EstablishMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Establish Message";

    /**
     * sessionID
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * sessionVerID
     */
    private final SessionVerIdField sessionVerId = new SessionVerIdField();

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * keepAliveInterval
     */
    private final KeepAliveIntervalField keepAliveInterval = new KeepAliveIntervalField();

    /**
     * nextSeqNo
     */
    private final NextSeqNoField nextSeqNo = new NextSeqNoField();

    /**
     * cancelOnDisconnectType
     */
    private final CancelOnDisconnectTypeField cancelOnDisconnectType = new CancelOnDisconnectTypeField();

    /**
     * codTimeoutWindow
     */
    private final CodTimeoutWindowField codTimeoutWindow = new CodTimeoutWindowField();

    /**
     * credentials data struct
     */
    private final Credentials credentials = new Credentials();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(sessionId), List.<Field>of(sessionVerId), List.<Field>of(timestampField), List.<Field>of(keepAliveInterval), List.<Field>of(nextSeqNo), List.<Field>of(cancelOnDisconnectType), List.<Field>of(codTimeoutWindow), credentials.fields()).flatMap(List::stream).toList();

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
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
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
     * cancelOnDisconnectType
     *
     * @return the CancelOnDisconnectType field
     */
    public CancelOnDisconnectTypeField cancelOnDisconnectType() {
        return cancelOnDisconnectType;
    }

    /**
     * codTimeoutWindow
     *
     * @return the CodTimeoutWindow field
     */
    public CodTimeoutWindowField codTimeoutWindow() {
        return codTimeoutWindow;
    }

    /**
     * credentials data struct
     *
     * @return the Credentials record
     */
    public Credentials credentials() {
        return credentials;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + credentials.byteLength() - Credentials.MINIMUM_BYTE_LENGTH;
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
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 8;
        cursor = credentials.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(timestampField.value());
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
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!sessionVerId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionVerIdField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!keepAliveInterval.parse(data, cursor)) {
            return false;
        }
        cursor += KeepAliveIntervalField.BYTE_LENGTH;
        if (!nextSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += NextSeqNoField.BYTE_LENGTH;
        if (!cancelOnDisconnectType.parse(data, cursor)) {
            return false;
        }
        cursor += CancelOnDisconnectTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!codTimeoutWindow.parse(data, cursor)) {
            return false;
        }
        cursor += CodTimeoutWindowField.BYTE_LENGTH;
        if (!credentials.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += credentials.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = sessionVerId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = keepAliveInterval.encode(data, cursor);
        cursor = nextSeqNo.encode(data, cursor);
        cursor = cancelOnDisconnectType.encode(data, cursor);
        if (buffer != null && buffer.length >= 33 + 1) {
            System.arraycopy(buffer, 33, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = codTimeoutWindow.encode(data, cursor);
        cursor = credentials.encode(data, cursor);
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
        credentials.clear();
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
            if (field != credentials.credentialsLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != credentials.credentialsLength() && !field.isValid()) {
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
            case "Timestamp" -> Optional.of(timestampField);
            case "KeepAliveInterval" -> Optional.of(keepAliveInterval);
            case "NextSeqNo" -> Optional.of(nextSeqNo);
            case "CancelOnDisconnectType" -> Optional.of(cancelOnDisconnectType);
            case "CodTimeoutWindow" -> Optional.of(codTimeoutWindow);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EstablishMessage message)) {
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
        if (!(other instanceof EstablishMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
