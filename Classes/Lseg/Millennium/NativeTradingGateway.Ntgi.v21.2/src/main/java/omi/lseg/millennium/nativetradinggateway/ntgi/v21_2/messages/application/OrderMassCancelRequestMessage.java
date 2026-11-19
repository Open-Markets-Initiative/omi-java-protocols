package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.GroupIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MassCancelRequestTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderMassCancelRequestOrderSubTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SegmentField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the OrderMassCancelRequestMessage message from the NativeTradingGateway protocol.
 *
 * <p>Allows the client to mass cancel live orders, optionally scoped to an instrument or a segment.</p>
 */
public final class OrderMassCancelRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Cancel Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 25, 1, 32, 10 };

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Type of Mass Cancellation.
     */
    private final MassCancelRequestTypeField massCancelRequestType = new MassCancelRequestTypeField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Specified by the user as order submission.
     */
    private final GroupIdField groupId = new GroupIdField();

    /**
     * The segment for which the orders will be cancelled.
     */
    private final SegmentField segment = new SegmentField();

    /**
     * Whether cancellation should apply to orders or quotes.
     */
    private final OrderMassCancelRequestOrderSubTypeField orderMassCancelRequestOrderSubType = new OrderMassCancelRequestOrderSubTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, massCancelRequestType, instrumentId, groupId, segment, orderMassCancelRequestOrderSubType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Client specified identifier of the rejected message if it is available.
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Type of Mass Cancellation.
     *
     * @return the MassCancelRequestType field
     */
    public MassCancelRequestTypeField massCancelRequestType() {
        return massCancelRequestType;
    }

    /**
     * Identifier of the instrument for which the order is submitted.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Specified by the user as order submission.
     *
     * @return the GroupId field
     */
    public GroupIdField groupId() {
        return groupId;
    }

    /**
     * The segment for which the orders will be cancelled.
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
    }

    /**
     * Whether cancellation should apply to orders or quotes.
     *
     * @return the OrderMassCancelRequestOrderSubType field
     */
    public OrderMassCancelRequestOrderSubTypeField orderMassCancelRequestOrderSubType() {
        return orderMassCancelRequestOrderSubType;
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
        return PADDING.clone();
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!massCancelRequestType.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestTypeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!groupId.parse(data, cursor)) {
            return false;
        }
        cursor += GroupIdField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        if (!orderMassCancelRequestOrderSubType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderMassCancelRequestOrderSubTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = massCancelRequestType.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 25, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = groupId.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        cursor = orderMassCancelRequestOrderSubType.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 32, data, cursor, 10); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 10, (byte) 0); // padding
        }
        cursor += 10;
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "MassCancelRequestType" -> Optional.of(massCancelRequestType);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "GroupId" -> Optional.of(groupId);
            case "Segment" -> Optional.of(segment);
            case "OrderMassCancelRequestOrderSubType" -> Optional.of(orderMassCancelRequestOrderSubType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassCancelRequestMessage message)) {
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
        if (!(other instanceof OrderMassCancelRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
