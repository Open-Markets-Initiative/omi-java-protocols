package omi.iex.iexequities.deepplus.snap.v1_06.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.ChannelIdField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.FirstMessageSequenceNumberField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.MessageCountField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.MessageProtocolIdField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.PayloadLengthField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.SendTimeField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.SessionIdField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.StreamOffsetField;
import omi.iex.iexequities.deepplus.snap.v1_06.fields.VersionField;
import omi.iex.iexequities.deepplus.snap.v1_06.types.Field;
import omi.iex.iexequities.deepplus.snap.v1_06.types.GroupEntry;
import omi.iex.iexequities.deepplus.snap.v1_06.types.PrintOptions;

/**
 * The IextpHeader record a message holds.
 *
 * <p>IexTp header of the wrapped feed message</p>
 */
public final class IextpHeader implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IextpHeader";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 1, 1 };

    /**
     * Version of transport specification
     */
    private final VersionField version = new VersionField();

    /**
     * Unique identifier of the higher layer protocol
     */
    private final MessageProtocolIdField messageProtocolId = new MessageProtocolIdField();

    /**
     * Channel identifier from the Deep Plus feed IexTp header
     */
    private final ChannelIdField channelId = new ChannelIdField();

    /**
     * Session identifier from the Deep Plus feed IexTp header
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * Byte length of the payload
     */
    private final PayloadLengthField payloadLength = new PayloadLengthField();

    /**
     * Number of messages in the payload
     */
    private final MessageCountField messageCount = new MessageCountField();

    /**
     * Byte offset of the data stream
     */
    private final StreamOffsetField streamOffset = new StreamOffsetField();

    /**
     * Sequence of the first message in the segment
     */
    private final FirstMessageSequenceNumberField firstMessageSequenceNumber = new FirstMessageSequenceNumberField();

    /**
     * Send time of segment
     */
    private final SendTimeField sendTime = new SendTimeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(version, messageProtocolId, channelId, sessionId, payloadLength, messageCount, streamOffset, firstMessageSequenceNumber, sendTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Version of transport specification
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * Unique identifier of the higher layer protocol
     *
     * @return the MessageProtocolId field
     */
    public MessageProtocolIdField messageProtocolId() {
        return messageProtocolId;
    }

    /**
     * Channel identifier from the Deep Plus feed IexTp header
     *
     * @return the ChannelId field
     */
    public ChannelIdField channelId() {
        return channelId;
    }

    /**
     * Session identifier from the Deep Plus feed IexTp header
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * Byte length of the payload
     *
     * @return the PayloadLength field
     */
    public PayloadLengthField payloadLength() {
        return payloadLength;
    }

    /**
     * Number of messages in the payload
     *
     * @return the MessageCount field
     */
    public MessageCountField messageCount() {
        return messageCount;
    }

    /**
     * Byte offset of the data stream
     *
     * @return the StreamOffset field
     */
    public StreamOffsetField streamOffset() {
        return streamOffset;
    }

    /**
     * Sequence of the first message in the segment
     *
     * @return the FirstMessageSequenceNumber field
     */
    public FirstMessageSequenceNumberField firstMessageSequenceNumber() {
        return firstMessageSequenceNumber;
    }

    /**
     * Send time of segment
     *
     * @return the SendTime field
     */
    public SendTimeField sendTime() {
        return sendTime;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        if (!version.parse(data, cursor)) {
            return false;
        }
        cursor += VersionField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!messageProtocolId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageProtocolIdField.BYTE_LENGTH;
        if (!channelId.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelIdField.BYTE_LENGTH;
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!payloadLength.parse(data, cursor)) {
            return false;
        }
        cursor += PayloadLengthField.BYTE_LENGTH;
        if (!messageCount.parse(data, cursor)) {
            return false;
        }
        cursor += MessageCountField.BYTE_LENGTH;
        if (!streamOffset.parse(data, cursor)) {
            return false;
        }
        cursor += StreamOffsetField.BYTE_LENGTH;
        if (!firstMessageSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FirstMessageSequenceNumberField.BYTE_LENGTH;
        return sendTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = version.encode(data, cursor);
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 1, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = messageProtocolId.encode(data, cursor);
        cursor = channelId.encode(data, cursor);
        cursor = sessionId.encode(data, cursor);
        cursor = payloadLength.encode(data, cursor);
        cursor = messageCount.encode(data, cursor);
        cursor = streamOffset.encode(data, cursor);
        cursor = firstMessageSequenceNumber.encode(data, cursor);
        cursor = sendTime.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "Version" -> Optional.of(version);
            case "MessageProtocolId" -> Optional.of(messageProtocolId);
            case "ChannelId" -> Optional.of(channelId);
            case "SessionId" -> Optional.of(sessionId);
            case "PayloadLength" -> Optional.of(payloadLength);
            case "MessageCount" -> Optional.of(messageCount);
            case "StreamOffset" -> Optional.of(streamOffset);
            case "FirstMessageSequenceNumber" -> Optional.of(firstMessageSequenceNumber);
            case "SendTime" -> Optional.of(sendTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IextpHeader message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof IextpHeader message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
