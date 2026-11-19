package omi.bme.bmeequities.orderentry.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.DisplayQty2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.DisplayQtyField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ExecType2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ExecTypeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdRejReason2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdRejReasonField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdStatus2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdStatusField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderId2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderQty2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderQtyField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.Price2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PriceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.Priority2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PriorityField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryExecId2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryExecIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryOrderId2Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryOrderIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the QuoteStatusMessage message from the OrderEntry protocol.
 *
 * <p>Sent by the server to inform about the status of a Quote</p>
 */
public final class QuoteStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 92;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Status Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * System Order Number
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * System Order Number
     */
    private final SecondaryOrderId2Field secondaryOrderId2 = new SecondaryOrderId2Field();

    /**
     * Priority
     */
    private final PriorityField priority = new PriorityField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Visible pending volume
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Priority
     */
    private final Priority2Field priority2 = new Priority2Field();

    /**
     * Limit price
     */
    private final Price2Field price2 = new Price2Field();

    /**
     * Visible pending volume
     */
    private final DisplayQty2Field displayQty2 = new DisplayQty2Field();

    /**
     * Application Order ID (unique at security level)
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * History number
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * Total order volume
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order Status
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * When OrdStatus = 4/8 it contains the reason for Cancellation/Reject. When OrdStatus # 4/8 it may contain additional information on the status of the order
     */
    private final OrdRejReasonField ordRejReason = new OrdRejReasonField();

    /**
     * Confirmation type
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Application Order ID (unique at security level)
     */
    private final OrderId2Field orderId2 = new OrderId2Field();

    /**
     * History number
     */
    private final SecondaryExecId2Field secondaryExecId2 = new SecondaryExecId2Field();

    /**
     * Total order volume
     */
    private final OrderQty2Field orderQty2 = new OrderQty2Field();

    /**
     * Order Status
     */
    private final OrdStatus2Field ordStatus2 = new OrdStatus2Field();

    /**
     * When OrdStatus = 4/8 it contains the reason for Cancellation/Reject. When OrdStatus # 4/8 it may contain additional information on the status of the order
     */
    private final OrdRejReason2Field ordRejReason2 = new OrdRejReason2Field();

    /**
     * Confirmation type
     */
    private final ExecType2Field execType2 = new ExecType2Field();

    /**
     * Request ID (for application feedback)
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     */
    private final ClientDataIdField clientDataId = new ClientDataIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, secondaryOrderId, secondaryOrderId2, priority, price, displayQty, priority2, price2, displayQty2, orderId, secondaryExecId, orderQty, ordStatus, ordRejReason, execType, orderId2, secondaryExecId2, orderQty2, ordStatus2, ordRejReason2, execType2, requestId, clientDataId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId2 field
     */
    public SecondaryOrderId2Field secondaryOrderId2() {
        return secondaryOrderId2;
    }

    /**
     * Priority
     *
     * @return the Priority field
     */
    public PriorityField priority() {
        return priority;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Priority
     *
     * @return the Priority2 field
     */
    public Priority2Field priority2() {
        return priority2;
    }

    /**
     * Limit price
     *
     * @return the Price2 field
     */
    public Price2Field price2() {
        return price2;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty2 field
     */
    public DisplayQty2Field displayQty2() {
        return displayQty2;
    }

    /**
     * Application Order ID (unique at security level)
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * History number
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * Total order volume
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * When OrdStatus = 4/8 it contains the reason for Cancellation/Reject. When OrdStatus # 4/8 it may contain additional information on the status of the order
     *
     * @return the OrdRejReason field
     */
    public OrdRejReasonField ordRejReason() {
        return ordRejReason;
    }

    /**
     * Confirmation type
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
    }

    /**
     * Application Order ID (unique at security level)
     *
     * @return the OrderId2 field
     */
    public OrderId2Field orderId2() {
        return orderId2;
    }

    /**
     * History number
     *
     * @return the SecondaryExecId2 field
     */
    public SecondaryExecId2Field secondaryExecId2() {
        return secondaryExecId2;
    }

    /**
     * Total order volume
     *
     * @return the OrderQty2 field
     */
    public OrderQty2Field orderQty2() {
        return orderQty2;
    }

    /**
     * Order Status
     *
     * @return the OrdStatus2 field
     */
    public OrdStatus2Field ordStatus2() {
        return ordStatus2;
    }

    /**
     * When OrdStatus = 4/8 it contains the reason for Cancellation/Reject. When OrdStatus # 4/8 it may contain additional information on the status of the order
     *
     * @return the OrdRejReason2 field
     */
    public OrdRejReason2Field ordRejReason2() {
        return ordRejReason2;
    }

    /**
     * Confirmation type
     *
     * @return the ExecType2 field
     */
    public ExecType2Field execType2() {
        return execType2;
    }

    /**
     * Request ID (for application feedback)
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
    }

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     *
     * @return the ClientDataId field
     */
    public ClientDataIdField clientDataId() {
        return clientDataId;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!secondaryOrderId2.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderId2Field.BYTE_LENGTH;
        if (!priority.parse(data, cursor)) {
            return false;
        }
        cursor += PriorityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!priority2.parse(data, cursor)) {
            return false;
        }
        cursor += Priority2Field.BYTE_LENGTH;
        if (!price2.parse(data, cursor)) {
            return false;
        }
        cursor += Price2Field.BYTE_LENGTH;
        if (!displayQty2.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQty2Field.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!ordRejReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrdRejReasonField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!orderId2.parse(data, cursor)) {
            return false;
        }
        cursor += OrderId2Field.BYTE_LENGTH;
        if (!secondaryExecId2.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecId2Field.BYTE_LENGTH;
        if (!orderQty2.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQty2Field.BYTE_LENGTH;
        if (!ordStatus2.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatus2Field.BYTE_LENGTH;
        if (!ordRejReason2.parse(data, cursor)) {
            return false;
        }
        cursor += OrdRejReason2Field.BYTE_LENGTH;
        if (!execType2.parse(data, cursor)) {
            return false;
        }
        cursor += ExecType2Field.BYTE_LENGTH;
        if (!requestId.parse(data, cursor)) {
            return false;
        }
        cursor += RequestIdField.BYTE_LENGTH;
        return clientDataId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = secondaryOrderId2.encode(data, cursor);
        cursor = priority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = priority2.encode(data, cursor);
        cursor = price2.encode(data, cursor);
        cursor = displayQty2.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = ordRejReason.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = orderId2.encode(data, cursor);
        cursor = secondaryExecId2.encode(data, cursor);
        cursor = orderQty2.encode(data, cursor);
        cursor = ordStatus2.encode(data, cursor);
        cursor = ordRejReason2.encode(data, cursor);
        cursor = execType2.encode(data, cursor);
        cursor = requestId.encode(data, cursor);
        cursor = clientDataId.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "SecondaryOrderId2" -> Optional.of(secondaryOrderId2);
            case "Priority" -> Optional.of(priority);
            case "Price" -> Optional.of(price);
            case "DisplayQty" -> Optional.of(displayQty);
            case "Priority2" -> Optional.of(priority2);
            case "Price2" -> Optional.of(price2);
            case "DisplayQty2" -> Optional.of(displayQty2);
            case "OrderId" -> Optional.of(orderId);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "OrdRejReason" -> Optional.of(ordRejReason);
            case "ExecType" -> Optional.of(execType);
            case "OrderId2" -> Optional.of(orderId2);
            case "SecondaryExecId2" -> Optional.of(secondaryExecId2);
            case "OrderQty2" -> Optional.of(orderQty2);
            case "OrdStatus2" -> Optional.of(ordStatus2);
            case "OrdRejReason2" -> Optional.of(ordRejReason2);
            case "ExecType2" -> Optional.of(execType2);
            case "RequestId" -> Optional.of(requestId);
            case "ClientDataId" -> Optional.of(clientDataId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteStatusMessage message)) {
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
        if (!(other instanceof QuoteStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
