package omi.nasdaq.gapdetection.utp.v2.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.gapdetection.utp.v2.fields.FeedSequenceField;
import omi.nasdaq.gapdetection.utp.v2.fields.MessageCategoryField;
import omi.nasdaq.gapdetection.utp.v2.fields.MessageTypeField;
import omi.nasdaq.gapdetection.utp.v2.fields.OriginatingParticipantField;
import omi.nasdaq.gapdetection.utp.v2.fields.ParticipantTokenField;
import omi.nasdaq.gapdetection.utp.v2.fields.TimestampField;
import omi.nasdaq.gapdetection.utp.v2.fields.VersionField;
import omi.nasdaq.gapdetection.utp.v2.types.Field;
import omi.nasdaq.gapdetection.utp.v2.types.GroupEntry;
import omi.nasdaq.gapdetection.utp.v2.types.PrintOptions;

/**
 * The MessageHeader record a message holds.
 *
 * <p>UTP Participant Input inbound message header (29 bytes). Return messages (SIP → Participant, lowercase Message Category) use a shorter 13-byte header and are out of scope for gap-detection observability.</p>
 */
public final class MessageHeader implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MessageHeader";

    /**
     * UTP Participant Input protocol version
     */
    private final VersionField version = new VersionField();

    /**
     * UTP message category. Uppercase letters (A/C/Q/T) denote inbound messages (Participant → SIP); lowercase letters (a/c) denote return messages (SIP → Participant, out of scope here)
     */
    private final MessageCategoryField messageCategory = new MessageCategoryField();

    /**
     * Single-byte ascii message type discriminator within a category
     */
    private final MessageTypeField messageType = new MessageTypeField();

    /**
     * Two-byte ascii originating participant identifier
     */
    private final OriginatingParticipantField originatingParticipant = new OriginatingParticipantField();

    /**
     * Participant-provided timestamp, nanoseconds since Unix epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Message Sequence Number, consecutive positive integers starting at 1. Used for gap detection.
     */
    private final FeedSequenceField feedSequence = new FeedSequenceField();

    /**
     * Participant Token, pass-through opaque value returned by the SIP
     */
    private final ParticipantTokenField participantToken = new ParticipantTokenField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(version, messageCategory, messageType, originatingParticipant, timestampField, feedSequence, participantToken);

    private byte[] buffer;

    private boolean decoded;

    /**
     * UTP Participant Input protocol version
     *
     * @return the Version field
     */
    public VersionField version() {
        return version;
    }

    /**
     * UTP message category. Uppercase letters (A/C/Q/T) denote inbound messages (Participant → SIP); lowercase letters (a/c) denote return messages (SIP → Participant, out of scope here)
     *
     * @return the MessageCategory field
     */
    public MessageCategoryField messageCategory() {
        return messageCategory;
    }

    /**
     * Single-byte ascii message type discriminator within a category
     *
     * @return the MessageType field
     */
    public MessageTypeField messageType() {
        return messageType;
    }

    /**
     * Two-byte ascii originating participant identifier
     *
     * @return the OriginatingParticipant field
     */
    public OriginatingParticipantField originatingParticipant() {
        return originatingParticipant;
    }

    /**
     * Participant-provided timestamp, nanoseconds since Unix epoch
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Message Sequence Number, consecutive positive integers starting at 1. Used for gap detection.
     *
     * @return the FeedSequence field
     */
    public FeedSequenceField feedSequence() {
        return feedSequence;
    }

    /**
     * Participant Token, pass-through opaque value returned by the SIP
     *
     * @return the ParticipantToken field
     */
    public ParticipantTokenField participantToken() {
        return participantToken;
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
        return new int[0];
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
        if (!messageCategory.parse(data, cursor)) {
            return false;
        }
        cursor += MessageCategoryField.BYTE_LENGTH;
        if (!messageType.parse(data, cursor)) {
            return false;
        }
        cursor += MessageTypeField.BYTE_LENGTH;
        if (!originatingParticipant.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatingParticipantField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!feedSequence.parse(data, cursor)) {
            return false;
        }
        cursor += FeedSequenceField.BYTE_LENGTH;
        return participantToken.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = version.encode(data, cursor);
        cursor = messageCategory.encode(data, cursor);
        cursor = messageType.encode(data, cursor);
        cursor = originatingParticipant.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = feedSequence.encode(data, cursor);
        cursor = participantToken.encode(data, cursor);
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
            case "MessageCategory" -> Optional.of(messageCategory);
            case "MessageType" -> Optional.of(messageType);
            case "OriginatingParticipant" -> Optional.of(originatingParticipant);
            case "Timestamp" -> Optional.of(timestampField);
            case "FeedSequence" -> Optional.of(feedSequence);
            case "ParticipantToken" -> Optional.of(participantToken);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MessageHeader message)) {
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
        if (!(other instanceof MessageHeader message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
