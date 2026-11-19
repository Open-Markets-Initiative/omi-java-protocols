package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.CancelRejectReasonField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClOrdIdField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.InFlightField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.TextField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.fields.TransactionTimeField;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the CancelRejectedUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur</p>
 */
public final class CancelRejectedUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 95;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Rejected Us Equities V";

    /**
     * Total number of messages received by the order handler which have not yet been acknowledged by the matching engine
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * Transaction Time
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Single character code for the cancellation Rejection reason
     */
    private final CancelRejectReasonField cancelRejectReason = new CancelRejectReasonField();

    /**
     * Human readable text with more information about the reject reason
     */
    private final TextField text = new TextField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, clearingFirm, clOrdId, cancelRejectReason, text);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages received by the order handler which have not yet been acknowledged by the matching engine
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * Transaction Time
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * MPID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Single character code for the cancellation Rejection reason
     *
     * @return the CancelRejectReason field
     */
    public CancelRejectReasonField cancelRejectReason() {
        return cancelRejectReason;
    }

    /**
     * Human readable text with more information about the reject reason
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!cancelRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelRejectReasonField.BYTE_LENGTH;
        return text.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = cancelRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "CancelRejectReason" -> Optional.of(cancelRejectReason);
            case "Text" -> Optional.of(text);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelRejectedUsEquitiesV message)) {
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
        if (!(other instanceof CancelRejectedUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
