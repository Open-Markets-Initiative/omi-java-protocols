package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.ClientOrderIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.MassCancelStatusField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.OrderBookField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.PartitionIdField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.RejectCodeField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.fields.SequenceNumberField;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.structs.TransactTime;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.Message;
import omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.types.PrintOptions;

/**
 * Represents the OrderMassCancelReportMessage message from the EnhancedNativeTradingRecovery protocol.
 *
 * <p>Indicates the outcome of an order mass cancel request.</p>
 */
public final class OrderMassCancelReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'r';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Cancel Report Message";

    /**
     * Identity of the matching partition the request relates to
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Sequence number immediately after that of the last message received from the partition
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Client specified identifier of the rejected message if it is available
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Outcome of the mass cancel request
     */
    private final MassCancelStatusField massCancelStatus = new MassCancelStatusField();

    /**
     * Will be zero or three if login is accepted
     */
    private final RejectCodeField rejectCode = new RejectCodeField();

    /**
     * Order book the order belongs to
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Time the Execution Report was generated
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(partitionId), List.<Field>of(sequenceNumber), List.<Field>of(clientOrderId), List.<Field>of(massCancelStatus), List.<Field>of(rejectCode), transactTime.fields(), List.<Field>of(orderBook)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identity of the matching partition the request relates to
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * Sequence number immediately after that of the last message received from the partition
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Client specified identifier of the rejected message if it is available
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Outcome of the mass cancel request
     *
     * @return the MassCancelStatus field
     */
    public MassCancelStatusField massCancelStatus() {
        return massCancelStatus;
    }

    /**
     * Will be zero or three if login is accepted
     *
     * @return the RejectCode field
     */
    public RejectCodeField rejectCode() {
        return rejectCode;
    }

    /**
     * Order book the order belongs to
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Time the Execution Report was generated
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
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!massCancelStatus.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelStatusField.BYTE_LENGTH;
        if (!rejectCode.parse(data, cursor)) {
            return false;
        }
        cursor += RejectCodeField.BYTE_LENGTH;
        if (!transactTime.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += transactTime.byteLength();
        return orderBook.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = massCancelStatus.encode(data, cursor);
        cursor = rejectCode.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
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
            case "PartitionId" -> Optional.of(partitionId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "MassCancelStatus" -> Optional.of(massCancelStatus);
            case "RejectCode" -> Optional.of(rejectCode);
            case "OrderBook" -> Optional.of(orderBook);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassCancelReportMessage message)) {
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
        if (!(other instanceof OrderMassCancelReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
