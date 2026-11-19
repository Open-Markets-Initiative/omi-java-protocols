package omi.bme.bmeequities.orderentry.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.DisplayQtyField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.EntryDateField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.ExecTypeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdRejReasonField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrdStatusField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.OrderQtyField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PriceField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.PriorityField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryExecIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecondaryOrderIdField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.SideField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.orderentry.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SimpleOrderStatusMessage message from the OrderEntry protocol.
 *
 * <p>Sent by the server to inform about the order status. Please note that the first fields of this message are the same as the ones for Order Market Pre- Transparency Information (Msg Type = 0x03) (see section 5.4.12)</p>
 */
public final class SimpleOrderStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Order Status Message";

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
     * System order entry date (when System Order Number was assigned)
     */
    private final EntryDateField entryDate = new EntryDateField();

    /**
     * Side
     */
    private final SideField side = new SideField();

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
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, secondaryOrderId, entryDate, side, priority, price, displayQty, orderId, secondaryExecId, orderQty, ordStatus, ordRejReason, execType, requestId, clientDataId);

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
     * System order entry date (when System Order Number was assigned)
     *
     * @return the EntryDate field
     */
    public EntryDateField entryDate() {
        return entryDate;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
        if (!entryDate.parse(data, cursor)) {
            return false;
        }
        cursor += EntryDateField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
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
        cursor = entryDate.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = priority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = ordRejReason.encode(data, cursor);
        cursor = execType.encode(data, cursor);
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
            case "EntryDate" -> Optional.of(entryDate);
            case "Side" -> Optional.of(side);
            case "Priority" -> Optional.of(priority);
            case "Price" -> Optional.of(price);
            case "DisplayQty" -> Optional.of(displayQty);
            case "OrderId" -> Optional.of(orderId);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "OrdRejReason" -> Optional.of(ordRejReason);
            case "ExecType" -> Optional.of(execType);
            case "RequestId" -> Optional.of(requestId);
            case "ClientDataId" -> Optional.of(clientDataId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleOrderStatusMessage message)) {
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
        if (!(other instanceof SimpleOrderStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
