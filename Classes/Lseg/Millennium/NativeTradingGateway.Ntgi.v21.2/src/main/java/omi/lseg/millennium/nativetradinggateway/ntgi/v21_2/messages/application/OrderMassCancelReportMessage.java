package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AppIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MassCancelRejectReasonField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MassCancelResponseField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SequenceNoField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.structs.TransactTime;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the OrderMassCancelReportMessage message from the NativeTradingGateway protocol.
 *
 * <p>Indicates that a mass order cancel request was accepted or rejected.</p>
 */
public final class OrderMassCancelReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'r';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Cancel Report Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 30, 4, 42, 10 };

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
     * Whether the Mass Cancel Request was accepted or rejected.
     */
    private final MassCancelResponseField massCancelResponse = new MassCancelResponseField();

    /**
     * The code that identifies the reason the order mass cancel was rejected.
     */
    private final MassCancelRejectReasonField massCancelRejectReason = new MassCancelRejectReasonField();

    /**
     * Composite
     */
    private final TransactTime transactTime = new TransactTime();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(appId), List.<Field>of(sequenceNo), List.<Field>of(clientOrderId), List.<Field>of(massCancelResponse), List.<Field>of(massCancelRejectReason), transactTime.fields()).flatMap(List::stream).toList();

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
     * Whether the Mass Cancel Request was accepted or rejected.
     *
     * @return the MassCancelResponse field
     */
    public MassCancelResponseField massCancelResponse() {
        return massCancelResponse;
    }

    /**
     * The code that identifies the reason the order mass cancel was rejected.
     *
     * @return the MassCancelRejectReason field
     */
    public MassCancelRejectReasonField massCancelRejectReason() {
        return massCancelRejectReason;
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
        if (!massCancelResponse.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelResponseField.BYTE_LENGTH;
        if (!massCancelRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectReasonField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!transactTime.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += transactTime.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = appId.encode(data, cursor);
        cursor = sequenceNo.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = massCancelResponse.encode(data, cursor);
        cursor = massCancelRejectReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 34) {
            System.arraycopy(buffer, 30, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = transactTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 52) {
            System.arraycopy(buffer, 42, data, cursor, 10); // padding
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
            case "MassCancelResponse" -> Optional.of(massCancelResponse);
            case "MassCancelRejectReason" -> Optional.of(massCancelRejectReason);
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
