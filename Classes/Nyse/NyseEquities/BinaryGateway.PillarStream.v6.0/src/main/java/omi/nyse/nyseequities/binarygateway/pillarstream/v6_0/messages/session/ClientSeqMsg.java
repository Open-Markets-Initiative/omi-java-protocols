package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.session;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.dispatch.ClientSequencedMessageDispatch;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums.SeqMsgType;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.TimestampField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.BulkCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.ManualActionResponseMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.NewOrderSingleAndCancelReplaceRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderCancelRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.OrderModifyRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskActionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.RiskLimitUpdateRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SequencedFillerMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SessionConfigurationRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.SymbolSubscriptionRequestMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgBeginMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application.TgEndMessage;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.MsgHeader;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.SeqMsgHeader;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.structs.SeqMsgId;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.UnknownMessage;

/**
 * Represents the ClientSeqMsg message from the BinaryGateway protocol.
 *
 * <p>Used to transmit a stream message</p>
 */
public final class ClientSeqMsg implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 36;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Client Seq Msg";

    /**
     * Message timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Branch
     */
    private Message clientSequencedMessage = new UnknownMessage();

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
    private final List<Field> fields = Stream.of(msgHeader.fields(), seqMsgId.fields(), List.<Field>of(timestampField), seqMsgHeader.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Branch
     *
     * <p>The message its SeqMsgType selected, or an {@link UnknownMessage} holding the bytes of one this library does not decode.</p>
     *
     * @return the ClientSequencedMessage message
     */
    public Message clientSequencedMessage() {
        return clientSequencedMessage;
    }

    /**
     * Sets the message to hold. Encode writes the SeqMsgType that selects it; an unknown message keeps the one it arrived with.
     *
     * @param message the message
     */
    public void clientSequencedMessage(Message message) {
        this.clientSequencedMessage = Objects.requireNonNull(message, "message");
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
        return MINIMUM_BYTE_LENGTH + clientSequencedMessage.byteLength();
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
        for (int[] run = MsgHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += MsgHeader.BYTE_LENGTH;
        for (int[] run = SeqMsgId.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += SeqMsgId.BYTE_LENGTH;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor += 8;
        for (int[] run = SeqMsgHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += SeqMsgHeader.BYTE_LENGTH;
        cursor += clientSequencedMessage.byteLength();
        return cursor;
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
        long stated = msgHeader.msgLength().value();
        if (stated < MINIMUM_BYTE_LENGTH || stated > end - offset) {
            return false;
        }
        end = offset + (int) stated;
        if (!seqMsgId.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += seqMsgId.byteLength();
        cursor += 4; // padding
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!seqMsgHeader.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += seqMsgHeader.byteLength();
        Optional<Message> clientSequencedMessageSelected = ClientSequencedMessageDispatch.decode(seqMsgHeader.seqMsgType().rawValue(), OptionalLong.of(seqMsgHeader.seqMsgLength().value()), data, cursor, end);
        if (clientSequencedMessageSelected.isPresent()) {
            if (!clientSequencedMessageSelected.get().isDecoded()) {
                return false;
            }
            clientSequencedMessage = clientSequencedMessageSelected.get();
        } else {
            UnknownMessage clientSequencedMessageUnknown = new UnknownMessage();
            if (!clientSequencedMessageUnknown.parseFrom(data, cursor, end)) {
                return false;
            }
            clientSequencedMessage = clientSequencedMessageUnknown;
        }
        cursor += clientSequencedMessage.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return cursor == end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (byteLength() > 65535) {
            throw new IllegalStateException("this message holds " + byteLength() + " bytes, more than its length field can state");
        }
        msgHeader.msgLength().value((byteLength()));
        if (clientSequencedMessage instanceof SessionConfigurationRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.SESSION_CONFIGURATION_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof SequencedFillerMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.SEQUENCED_FILLER_MESSAGE);
        } else if (clientSequencedMessage instanceof NewOrderSingleAndCancelReplaceRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.NEW_ORDER_SINGLE_AND_CANCEL_REPLACE_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof OrderCancelRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.ORDER_CANCEL_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof OrderModifyRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.ORDER_MODIFY_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof BulkCancelRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.BULK_CANCEL_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof SymbolSubscriptionRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.SYMBOL_SUBSCRIPTION_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof TgBeginMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.TG_BEGIN_MESSAGE);
        } else if (clientSequencedMessage instanceof TgEndMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.TG_END_MESSAGE);
        } else if (clientSequencedMessage instanceof ManualActionResponseMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.MANUAL_ACTION_RESPONSE_MESSAGE);
        } else if (clientSequencedMessage instanceof RiskLimitUpdateRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.RISK_LIMIT_UPDATE_REQUEST_MESSAGE);
        } else if (clientSequencedMessage instanceof RiskActionRequestMessage) {
            seqMsgHeader.seqMsgType().value(SeqMsgType.RISK_ACTION_REQUEST_MESSAGE);
        }
        int cursor = offset;
        cursor = msgHeader.encode(data, cursor);
        cursor = seqMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 20, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = timestampField.encode(data, cursor);
        cursor = seqMsgHeader.encode(data, cursor);
        cursor = clientSequencedMessage.encode(data, cursor);
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
        this.clientSequencedMessage = new UnknownMessage();
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
            if (field != msgHeader.msgLength() && field != seqMsgHeader.seqMsgType() && !field.isRecognized()) {
                return false;
            }
        }
        return clientSequencedMessage.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != msgHeader.msgLength() && field != seqMsgHeader.seqMsgType() && !field.isValid()) {
                return false;
            }
        }
        if (!clientSequencedMessage.isValid()) {
            return false;
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
        return "Timestamp".equals(name) ? Optional.of(timestampField) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ClientSeqMsg message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(clientSequencedMessage.diffFields(message.clientSequencedMessage));
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
            builder.append(", ");
            clientSequencedMessage.toFormattedString(builder, options);
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
        clientSequencedMessage.toFormattedString(builder, nested);
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
        if (!(other instanceof ClientSeqMsg message)) {
            return false;
        }
        return fields.equals(message.fields) && clientSequencedMessage.equals(message.clientSequencedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, clientSequencedMessage);
    }
}
