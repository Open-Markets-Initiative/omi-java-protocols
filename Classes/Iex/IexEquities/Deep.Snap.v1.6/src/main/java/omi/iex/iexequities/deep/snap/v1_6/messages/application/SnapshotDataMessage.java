package omi.iex.iexequities.deep.snap.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.iex.iexequities.deep.snap.v1_6.branches.IexTpMessageData;
import omi.iex.iexequities.deep.snap.v1_6.fields.IexTpMessageBlockLengthField;
import omi.iex.iexequities.deep.snap.v1_6.fields.IexTpMessageLengthField;
import omi.iex.iexequities.deep.snap.v1_6.fields.IexTpMessageTypeField;
import omi.iex.iexequities.deep.snap.v1_6.structs.IextpHeader;
import omi.iex.iexequities.deep.snap.v1_6.types.Field;
import omi.iex.iexequities.deep.snap.v1_6.types.Message;
import omi.iex.iexequities.deep.snap.v1_6.types.PrintOptions;

/**
 * Represents the SnapshotDataMessage message from the Deep protocol.
 *
 * <p>Carries one complete Deep feed message wrapped with an IexTp header providing Deep feed sequencing and timing information</p>
 */
public final class SnapshotDataMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'd';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Snapshot Data Message";

    /**
     * Length in bytes of the IexTp message block that follows this field: the IexTp Message Length field and the message
     */
    private final IexTpMessageBlockLengthField iexTpMessageBlockLength = new IexTpMessageBlockLengthField();

    /**
     * Length of the wrapped Deep message in bytes not including this field
     */
    private final IexTpMessageLengthField iexTpMessageLength = new IexTpMessageLengthField();

    /**
     * Code identifying the wrapped Deep message type
     */
    private final IexTpMessageTypeField iexTpMessageType = new IexTpMessageTypeField();

    /**
     * IexTp header of the wrapped feed message
     */
    private final IextpHeader iextpHeader = new IextpHeader();

    /**
     * One complete Iex Deep formatted message, may be any Deep message type, see the Iex Transport specification
     */
    private final IexTpMessageData iexTpMessageData = new IexTpMessageData();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(iextpHeader.fields(), List.<Field>of(iexTpMessageBlockLength), List.<Field>of(iexTpMessageLength), List.<Field>of(iexTpMessageType)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Length in bytes of the IexTp message block that follows this field: the IexTp Message Length field and the message
     *
     * @return the IexTpMessageBlockLength field
     */
    public IexTpMessageBlockLengthField iexTpMessageBlockLength() {
        return iexTpMessageBlockLength;
    }

    /**
     * Length of the wrapped Deep message in bytes not including this field
     *
     * @return the IexTpMessageLength field
     */
    public IexTpMessageLengthField iexTpMessageLength() {
        return iexTpMessageLength;
    }

    /**
     * Code identifying the wrapped Deep message type
     *
     * @return the IexTpMessageType field
     */
    public IexTpMessageTypeField iexTpMessageType() {
        return iexTpMessageType;
    }

    /**
     * IexTp header of the wrapped feed message
     *
     * @return the IextpHeader record
     */
    public IextpHeader iextpHeader() {
        return iextpHeader;
    }

    /**
     * One complete Iex Deep formatted message, may be any Deep message type, see the Iex Transport specification
     *
     * @return the IexTpMessageData record
     */
    public IexTpMessageData iexTpMessageData() {
        return iexTpMessageData;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + iexTpMessageData.byteLength() - IexTpMessageData.MINIMUM_BYTE_LENGTH;
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
        for (int[] run = IextpHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += IextpHeader.BYTE_LENGTH;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += iexTpMessageData.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(iextpHeader.sendTime().value());
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
        if (!iextpHeader.parseFrom(data, cursor, end - 5)) {
            return false;
        }
        cursor += iextpHeader.byteLength();
        if (!iexTpMessageBlockLength.parse(data, cursor)) {
            return false;
        }
        cursor += IexTpMessageBlockLengthField.BYTE_LENGTH;
        if (!iexTpMessageLength.parse(data, cursor)) {
            return false;
        }
        cursor += IexTpMessageLengthField.BYTE_LENGTH;
        if (!iexTpMessageType.parse(data, cursor)) {
            return false;
        }
        cursor += IexTpMessageTypeField.BYTE_LENGTH;
        long iexTpMessageDataWidth = iexTpMessageLength.value() - 1L;
        if (iexTpMessageDataWidth < 0 || iexTpMessageDataWidth > (end) - cursor) {
            return false;
        }
        if (!iexTpMessageData.parseFrom(iexTpMessageType, data, cursor, cursor + (int) iexTpMessageDataWidth) || iexTpMessageData.byteLength() != iexTpMessageDataWidth) {
            return false;
        }
        cursor += iexTpMessageData.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        iexTpMessageData.writeKey(iexTpMessageType);
        iexTpMessageLength.value((iexTpMessageData.byteLength() - -1));
        int cursor = offset;
        cursor = iextpHeader.encode(data, cursor);
        cursor = iexTpMessageBlockLength.encode(data, cursor);
        cursor = iexTpMessageLength.encode(data, cursor);
        cursor = iexTpMessageType.encode(data, cursor);
        cursor = iexTpMessageData.encode(data, cursor);
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
        iextpHeader.clear();
        iexTpMessageData.clear();
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
            if (field != iexTpMessageType && field != iexTpMessageLength && !field.isRecognized()) {
                return false;
            }
        }
        return iexTpMessageData.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != iexTpMessageType && field != iexTpMessageLength && !field.isValid()) {
                return false;
            }
        }
        if (!iexTpMessageData.isValid()) {
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
        return switch (name) {
            case "IexTpMessageBlockLength" -> Optional.of(iexTpMessageBlockLength);
            case "IexTpMessageLength" -> Optional.of(iexTpMessageLength);
            case "IexTpMessageType" -> Optional.of(iexTpMessageType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SnapshotDataMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(iexTpMessageData.diffFields(message.iexTpMessageData));
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
            iexTpMessageData.toFormattedString(builder, options);
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
        iexTpMessageData.toFormattedString(builder, nested);
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
        if (!(other instanceof SnapshotDataMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && iexTpMessageData.equals(message.iexTpMessageData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, iexTpMessageData);
    }
}
