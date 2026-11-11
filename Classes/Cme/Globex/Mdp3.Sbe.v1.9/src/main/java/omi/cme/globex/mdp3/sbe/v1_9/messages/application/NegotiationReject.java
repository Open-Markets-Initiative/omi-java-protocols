package omi.cme.globex.mdp3.sbe.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_9.fields.ErrorCodesField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.ReasonField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.RequestTimestampField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.UuidField;
import omi.cme.globex.mdp3.sbe.v1_9.types.Field;
import omi.cme.globex.mdp3.sbe.v1_9.types.Message;
import omi.cme.globex.mdp3.sbe.v1_9.types.PrintOptions;

/**
 * Represents the NegotiationReject message from the Mdp3 protocol.
 *
 * <p>NegotiationReject</p>
 */
public final class NegotiationReject implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 70;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Negotiation Reject";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 65, 5 };

    /**
     * Reject reason details
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Session Identifier defined as type long uInt64, recommended to use timestamp as number of microseconds since Unix epoch
     */
    private final UuidField uuid = new UuidField();

    /**
     * Time of request, recommended to use timestamp as number of nanoseconds since Unix epoch
     */
    private final RequestTimestampField requestTimestamp = new RequestTimestampField();

    /**
     * Error code for reject reason
     */
    private final ErrorCodesField errorCodes = new ErrorCodesField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(reason, uuid, requestTimestamp, errorCodes);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Reject reason details
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Session Identifier defined as type long uInt64, recommended to use timestamp as number of microseconds since Unix epoch
     *
     * @return the Uuid field
     */
    public UuidField uuid() {
        return uuid;
    }

    /**
     * Time of request, recommended to use timestamp as number of nanoseconds since Unix epoch
     *
     * @return the RequestTimestamp field
     */
    public RequestTimestampField requestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Error code for reject reason
     *
     * @return the ErrorCodes field
     */
    public ErrorCodesField errorCodes() {
        return errorCodes;
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
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!uuid.parse(data, cursor)) {
            return false;
        }
        cursor += UuidField.BYTE_LENGTH;
        if (!requestTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimestampField.BYTE_LENGTH;
        if (!errorCodes.parse(data, cursor)) {
            return false;
        }
        cursor += ErrorCodesField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reason.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = requestTimestamp.encode(data, cursor);
        cursor = errorCodes.encode(data, cursor);
        if (buffer != null && buffer.length >= 70) {
            System.arraycopy(buffer, 65, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
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
            case "Reason" -> Optional.of(reason);
            case "Uuid" -> Optional.of(uuid);
            case "RequestTimestamp" -> Optional.of(requestTimestamp);
            case "ErrorCodes" -> Optional.of(errorCodes);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NegotiationReject message)) {
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
        if (!(other instanceof NegotiationReject message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
