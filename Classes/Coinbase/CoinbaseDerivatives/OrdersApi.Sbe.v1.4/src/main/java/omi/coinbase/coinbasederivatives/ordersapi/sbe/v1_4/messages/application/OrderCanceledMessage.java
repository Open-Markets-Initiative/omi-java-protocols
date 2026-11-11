package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.CancelReasonField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.ClientOrderIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.CorrelationIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.ExecIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.InstrumentIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.OrderIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.ReceiveTimeField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.TimestampField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.TotalFilledField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Field;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Message;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.PrintOptions;

/**
 * Represents the OrderCanceledMessage message from the OrdersApi protocol.
 *
 * <p>OrderCanceledMessage</p>
 */
public final class OrderCanceledMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 57;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Canceled Message";

    /**
     * Nanoseconds since epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * clientOrderId
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * receiveTime
     */
    private final ReceiveTimeField receiveTime = new ReceiveTimeField();

    /**
     * totalFilled
     */
    private final TotalFilledField totalFilled = new TotalFilledField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * cancelReason
     */
    private final CancelReasonField cancelReason = new CancelReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, execId, clientOrderId, correlationId, orderId, receiveTime, totalFilled, instrumentId, cancelReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * execId
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * clientOrderId
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * orderId
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * receiveTime
     *
     * @return the ReceiveTime field
     */
    public ReceiveTimeField receiveTime() {
        return receiveTime;
    }

    /**
     * totalFilled
     *
     * @return the TotalFilled field
     */
    public TotalFilledField totalFilled() {
        return totalFilled;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * cancelReason
     *
     * @return the CancelReason field
     */
    public CancelReasonField cancelReason() {
        return cancelReason;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!receiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += ReceiveTimeField.BYTE_LENGTH;
        if (!totalFilled.parse(data, cursor)) {
            return false;
        }
        cursor += TotalFilledField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        return cancelReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = receiveTime.encode(data, cursor);
        cursor = totalFilled.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = cancelReason.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ExecId" -> Optional.of(execId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "OrderId" -> Optional.of(orderId);
            case "ReceiveTime" -> Optional.of(receiveTime);
            case "TotalFilled" -> Optional.of(totalFilled);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "CancelReason" -> Optional.of(cancelReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCanceledMessage message)) {
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
        if (!(other instanceof OrderCanceledMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
