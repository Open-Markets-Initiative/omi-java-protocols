package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.BusinessRejectReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.BusinessRejectRefIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.RefMsgTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.RefSeqNumField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the BusinessMessageRejectMessage message from the BinaryEntryPoint protocol.
 *
 * <p>BusinessMessageRejectMessage</p>
 */
public final class BusinessMessageRejectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Business Message Reject Message";

    /**
     * refMsgType
     */
    private final RefMsgTypeField refMsgType = new RefMsgTypeField();

    /**
     * refSeqNum
     */
    private final RefSeqNumField refSeqNum = new RefSeqNumField();

    /**
     * businessRejectRefID
     */
    private final BusinessRejectRefIdField businessRejectRefId = new BusinessRejectRefIdField();

    /**
     * businessRejectReason
     */
    private final BusinessRejectReasonField businessRejectReason = new BusinessRejectReasonField();

    /**
     * OutboundBusinessHeader
     */
    private final OutboundBusinessHeader outboundBusinessHeader = new OutboundBusinessHeader();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * text data struct
     */
    private final Text text = new Text();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(refMsgType), List.<Field>of(refSeqNum), List.<Field>of(businessRejectRefId), List.<Field>of(businessRejectReason), memo.fields(), text.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * refMsgType
     *
     * @return the RefMsgType field
     */
    public RefMsgTypeField refMsgType() {
        return refMsgType;
    }

    /**
     * refSeqNum
     *
     * @return the RefSeqNum field
     */
    public RefSeqNumField refSeqNum() {
        return refSeqNum;
    }

    /**
     * businessRejectRefID
     *
     * @return the BusinessRejectRefId field
     */
    public BusinessRejectRefIdField businessRejectRefId() {
        return businessRejectRefId;
    }

    /**
     * businessRejectReason
     *
     * @return the BusinessRejectReason field
     */
    public BusinessRejectReasonField businessRejectReason() {
        return businessRejectReason;
    }

    /**
     * OutboundBusinessHeader
     *
     * @return the OutboundBusinessHeader record
     */
    public OutboundBusinessHeader outboundBusinessHeader() {
        return outboundBusinessHeader;
    }

    /**
     * memo data struct
     *
     * @return the Memo record
     */
    public Memo memo() {
        return memo;
    }

    /**
     * text data struct
     *
     * @return the Text record
     */
    public Text text() {
        return text;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        for (int[] run = OutboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OutboundBusinessHeader.BYTE_LENGTH;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += memo.byteLength();
        cursor += text.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(outboundBusinessHeader.sendingTime().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!refMsgType.parse(data, cursor)) {
            return false;
        }
        cursor += RefMsgTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!refSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += RefSeqNumField.BYTE_LENGTH;
        if (!businessRejectRefId.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessRejectRefIdField.BYTE_LENGTH;
        if (!businessRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += BusinessRejectReasonField.BYTE_LENGTH;
        if (!memo.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += memo.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!text.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += text.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = refMsgType.encode(data, cursor);
        if (buffer != null && buffer.length >= 20) {
            System.arraycopy(buffer, 19, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = refSeqNum.encode(data, cursor);
        cursor = businessRejectRefId.encode(data, cursor);
        cursor = businessRejectReason.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        cursor = text.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        outboundBusinessHeader.clear();
        memo.clear();
        text.clear();
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
            if (field != memo.memoLength() && field != text.textLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != memo.memoLength() && field != text.textLength() && !field.isValid()) {
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
            case "RefMsgType" -> Optional.of(refMsgType);
            case "RefSeqNum" -> Optional.of(refSeqNum);
            case "BusinessRejectRefId" -> Optional.of(businessRejectRefId);
            case "BusinessRejectReason" -> Optional.of(businessRejectReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BusinessMessageRejectMessage message)) {
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
        if (!(other instanceof BusinessMessageRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
