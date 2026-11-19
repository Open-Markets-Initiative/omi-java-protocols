package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AppIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.CancelRejectReasonField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SequenceNoField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.structs.TransactTime;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the OrderCancelRejectMessage message from the NativeTradingGateway protocol.
 *
 * <p>Indicates that an order cancel request or order cancel/replace request has been rejected.</p>
 */
public final class OrderCancelRejectMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '9';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Reject Message";

    /**
     * Partition ID
     */
    private final AppIdField appId = new AppIdField();

    /**
     * Sequence number of the message.
     */
    private final SequenceNoField sequenceNo = new SequenceNoField();

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Unique identifier of the order assigned by the matching system.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Code specifying the reason for the reject.
     */
    private final CancelRejectReasonField cancelRejectReason = new CancelRejectReasonField();

    /**
     * Identifier of the initial RFQ by the Requester.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * Composite
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(appId), List.<Field>of(sequenceNo), List.<Field>of(clientOrderId), List.<Field>of(orderId), List.<Field>of(cancelRejectReason), transactTime.fields(), List.<Field>of(rfqId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Partition ID
     *
     * @return the AppId field
     */
    public AppIdField appId() {
        return appId;
    }

    /**
     * Sequence number of the message.
     *
     * @return the SequenceNo field
     */
    public SequenceNoField sequenceNo() {
        return sequenceNo;
    }

    /**
     * Client specified identifier of the rejected message if it is available.
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Unique identifier of the order assigned by the matching system.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Code specifying the reason for the reject.
     *
     * @return the CancelRejectReason field
     */
    public CancelRejectReasonField cancelRejectReason() {
        return cancelRejectReason;
    }

    /**
     * Identifier of the initial RFQ by the Requester.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
    }

    /**
     * Composite
     *
     * @return the TransactTime record
     */
    public TransactTime transactTime() {
        return transactTime;
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
        if (!appId.parse(data, cursor)) {
            return false;
        }
        cursor += AppIdField.BYTE_LENGTH;
        if (!sequenceNo.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNoField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!cancelRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelRejectReasonField.BYTE_LENGTH;
        if (!transactTime.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += transactTime.byteLength();
        return rfqId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = appId.encode(data, cursor);
        cursor = sequenceNo.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = cancelRejectReason.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
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
        transactTime.clear();
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
            case "AppId" -> Optional.of(appId);
            case "SequenceNo" -> Optional.of(sequenceNo);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrderId" -> Optional.of(orderId);
            case "CancelRejectReason" -> Optional.of(cancelRejectReason);
            case "RfqId" -> Optional.of(rfqId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelRejectMessage message)) {
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
        if (!(other instanceof OrderCancelRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
