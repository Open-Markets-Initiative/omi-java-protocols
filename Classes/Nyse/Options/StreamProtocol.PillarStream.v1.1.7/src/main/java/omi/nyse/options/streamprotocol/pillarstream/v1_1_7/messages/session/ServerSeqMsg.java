package omi.nyse.options.streamprotocol.pillarstream.v1_1_7.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.fields.ReservedField;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.fields.TimestampField;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.structs.MsgHeader;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.structs.SeqMsgHeader;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.structs.SeqMsgId;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.types.Field;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.types.Message;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.types.PrintOptions;
import omi.nyse.options.streamprotocol.pillarstream.v1_1_7.types.SizedField;

/**
 * Represents the ServerSeqMsg message from the StreamProtocol protocol.
 *
 * <p>Used to transmit a stream message</p>
 */
public final class ServerSeqMsg implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Server Seq Msg";

    /**
     * 4 bytes reserved for future use
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Message timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Raw sequenced message bytes sent by the exchange
     */
    private final SizedField serverSequencedMessage = new SizedField("ServerSequencedMessage", false);

    /**
     * Pillar Stream Message Header
     */
    private final MsgHeader msgHeader = new MsgHeader();

    /**
     * Pillar Stream Sequenced Message Identifier
     */
    private final SeqMsgId seqMsgId = new SeqMsgId();

    /**
     * Pillar Stream Sequenced Message Header
     */
    private final SeqMsgHeader seqMsgHeader = new SeqMsgHeader();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(msgHeader.fields(), seqMsgId.fields(), List.<Field>of(reserved), List.<Field>of(timestampField), seqMsgHeader.fields(), List.<Field>of(serverSequencedMessage)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * 4 bytes reserved for future use
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Message timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Raw sequenced message bytes sent by the exchange
     *
     * @return the ServerSequencedMessage field
     */
    public SizedField serverSequencedMessage() {
        return serverSequencedMessage;
    }

    /**
     * Pillar Stream Message Header
     *
     * @return the MsgHeader record
     */
    public MsgHeader msgHeader() {
        return msgHeader;
    }

    /**
     * Pillar Stream Sequenced Message Identifier
     *
     * @return the SeqMsgId record
     */
    public SeqMsgId seqMsgId() {
        return seqMsgId;
    }

    /**
     * Pillar Stream Sequenced Message Header
     *
     * @return the SeqMsgHeader record
     */
    public SeqMsgHeader seqMsgHeader() {
        return seqMsgHeader;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + serverSequencedMessage.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!msgHeader.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += msgHeader.byteLength();
        if (!seqMsgId.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += seqMsgId.byteLength();
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!seqMsgHeader.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += seqMsgHeader.byteLength();
        if (!serverSequencedMessage.parse(data, cursor, seqMsgHeader.seqMsgLength().value() - 4L, end)) {
            return false;
        }
        cursor += serverSequencedMessage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (serverSequencedMessage.byteLength() - -4 > 65535) {
            throw new IllegalStateException("serverSequencedMessage holds " + serverSequencedMessage.byteLength() + " bytes, more than its length field can state");
        }
        seqMsgHeader.seqMsgLength().value((serverSequencedMessage.byteLength() - -4));
        int cursor = offset;
        cursor = msgHeader.encode(data, cursor);
        cursor = seqMsgId.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = seqMsgHeader.encode(data, cursor);
        cursor = serverSequencedMessage.encode(data, cursor);
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
        msgHeader.clear();
        seqMsgId.clear();
        seqMsgHeader.clear();
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
            if (field != seqMsgHeader.seqMsgLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != seqMsgHeader.seqMsgLength() && !field.isValid()) {
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
            case "Reserved" -> Optional.of(reserved);
            case "Timestamp" -> Optional.of(timestampField);
            case "ServerSequencedMessage" -> Optional.of(serverSequencedMessage);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ServerSeqMsg message)) {
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
        if (!(other instanceof ServerSeqMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
