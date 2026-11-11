package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ErrorCodesField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.FaultToleranceIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.NextSeqNoField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ReasonField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.RequestTimestampField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the EstablishmentReject message from the iLink3 protocol.
 *
 * <p>The Establishment Reject message is sent when an Establish message from the customer is rejected by CME.</p>
 */
public final class EstablishmentReject implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Establishment Reject";

    /**
     * Reject reason details
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * Time of request; recommended to use timestamp as number of nanoseconds since epoch (Jan 1, 1970)
     */
    private final RequestTimestampField requestTimestamp = new RequestTimestampField();

    /**
     * Next expected message sequence number
     */
    private final NextSeqNoField nextSeqNo = new NextSeqNoField();

    /**
     * Error code for reject reason
     */
    private final ErrorCodesField errorCodes = new ErrorCodesField();

    /**
     * Indicates whether the connection is primary or backup
     */
    private final FaultToleranceIndicatorField faultToleranceIndicator = new FaultToleranceIndicatorField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(reason, uuid, requestTimestamp, nextSeqNo, errorCodes, faultToleranceIndicator, splitMsg);

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
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     *
     * @return the Uuid field
     */
    public UuidField uuid() {
        return uuid;
    }

    /**
     * Time of request; recommended to use timestamp as number of nanoseconds since epoch (Jan 1, 1970)
     *
     * @return the RequestTimestamp field
     */
    public RequestTimestampField requestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Next expected message sequence number
     *
     * @return the NextSeqNo field
     */
    public NextSeqNoField nextSeqNo() {
        return nextSeqNo;
    }

    /**
     * Error code for reject reason
     *
     * @return the ErrorCodes field
     */
    public ErrorCodesField errorCodes() {
        return errorCodes;
    }

    /**
     * Indicates whether the connection is primary or backup
     *
     * @return the FaultToleranceIndicator field
     */
    public FaultToleranceIndicatorField faultToleranceIndicator() {
        return faultToleranceIndicator;
    }

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     *
     * @return the SplitMsg field
     */
    public SplitMsgField splitMsg() {
        return splitMsg;
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
        return new int[0];
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
        if (!nextSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += NextSeqNoField.BYTE_LENGTH;
        if (!errorCodes.parse(data, cursor)) {
            return false;
        }
        cursor += ErrorCodesField.BYTE_LENGTH;
        if (!faultToleranceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FaultToleranceIndicatorField.BYTE_LENGTH;
        return splitMsg.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reason.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = requestTimestamp.encode(data, cursor);
        cursor = nextSeqNo.encode(data, cursor);
        cursor = errorCodes.encode(data, cursor);
        cursor = faultToleranceIndicator.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
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
            case "NextSeqNo" -> Optional.of(nextSeqNo);
            case "ErrorCodes" -> Optional.of(errorCodes);
            case "FaultToleranceIndicator" -> Optional.of(faultToleranceIndicator);
            case "SplitMsg" -> Optional.of(splitMsg);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EstablishmentReject message)) {
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
        if (!(other instanceof EstablishmentReject message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
