package omi.siac.cts.output.cta.v2_11_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.siac.cts.output.cta.v2_11_b.fields.MessageIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.NumberOfParticipantsField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantIdField;
import omi.siac.cts.output.cta.v2_11_b.fields.ParticipantReferenceNumberField;
import omi.siac.cts.output.cta.v2_11_b.fields.TransactionIdField;
import omi.siac.cts.output.cta.v2_11_b.groups.ParticipantEntry;
import omi.siac.cts.output.cta.v2_11_b.groups.ParticipantList;
import omi.siac.cts.output.cta.v2_11_b.structs.Timestamp;
import omi.siac.cts.output.cta.v2_11_b.types.Field;
import omi.siac.cts.output.cta.v2_11_b.types.Message;
import omi.siac.cts.output.cta.v2_11_b.types.PrintOptions;

/**
 * Represents the FractionalApproximateAdjustedVolumeMarketCenterMessage message from the Output protocol.
 *
 * <p>Used to report the volume of adjusted trading activity for each Participant. Volume is represented as a fractional value</p>
 */
public final class FractionalApproximateAdjustedVolumeMarketCenterMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'V';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 23;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fractional Approximate Adjusted Volume Market Center Message";

    /**
     * Identifies the Participant or Processor that initiated the message
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     */
    private final MessageIdField messageId = new MessageIdField();

    /**
     * Identifies the transaction
     */
    private final TransactionIdField transactionId = new TransactionIdField();

    /**
     * Contains the Participant Reference Number
     */
    private final ParticipantReferenceNumberField participantReferenceNumber = new ParticipantReferenceNumberField();

    /**
     * Represents the actual number of Participants for which an issue will be reported
     */
    private final NumberOfParticipantsField numberOfParticipants = new NumberOfParticipantsField();

    /**
     * Active Participants
     */
    private final ParticipantList participant = new ParticipantList();

    /**
     * Timestamp 1
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantId), timestampField.fields(), List.<Field>of(messageId), List.<Field>of(transactionId), List.<Field>of(participantReferenceNumber), List.<Field>of(numberOfParticipants)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifies the Participant or Processor that initiated the message
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
    }

    /**
     * The Message ID identifies the individual message within the block beginning with number one
     *
     * @return the MessageId field
     */
    public MessageIdField messageId() {
        return messageId;
    }

    /**
     * Identifies the transaction
     *
     * @return the TransactionId field
     */
    public TransactionIdField transactionId() {
        return transactionId;
    }

    /**
     * Contains the Participant Reference Number
     *
     * @return the ParticipantReferenceNumber field
     */
    public ParticipantReferenceNumberField participantReferenceNumber() {
        return participantReferenceNumber;
    }

    /**
     * Represents the actual number of Participants for which an issue will be reported
     *
     * @return the NumberOfParticipants field
     */
    public NumberOfParticipantsField numberOfParticipants() {
        return numberOfParticipants;
    }

    /**
     * Active Participants
     *
     * <p>Encode writes this list's size to the NumberOfParticipants field.</p>
     *
     * @return the Participant entries
     */
    public ParticipantList participant() {
        return participant;
    }

    /**
     * Timestamp 1
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + participant.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!participantId.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantIdField.BYTE_LENGTH;
        if (!timestampField.parseFrom(data, cursor, end - 14)) {
            return false;
        }
        cursor += timestampField.byteLength();
        if (!messageId.parse(data, cursor)) {
            return false;
        }
        cursor += MessageIdField.BYTE_LENGTH;
        if (!transactionId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdField.BYTE_LENGTH;
        if (!participantReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantReferenceNumberField.BYTE_LENGTH;
        if (!numberOfParticipants.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfParticipantsField.BYTE_LENGTH;
        if (!participant.parse(data, cursor, end, numberOfParticipants.value())) {
            return false;
        }
        cursor += participant.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (participant.size() > 255) {
            throw new IllegalStateException("participant holds " + participant.size() + " entries, more than its count field can state");
        }
        numberOfParticipants.value((short) participant.size());
        int cursor = offset;
        cursor = participantId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = messageId.encode(data, cursor);
        cursor = transactionId.encode(data, cursor);
        cursor = participantReferenceNumber.encode(data, cursor);
        cursor = numberOfParticipants.encode(data, cursor);
        cursor = participant.encode(data, cursor);
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
        timestampField.clear();
        participant.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfParticipants && !field.isRecognized()) {
                return false;
            }
        }
        return participant.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfParticipants && !field.isValid()) {
                return false;
            }
        }
        if (!participant.isValid()) {
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
        if (!participantId.isDecoded()) {
            return Optional.of(participantId);
        }
        if (!timestampField.isDecoded()) {
            return timestampField.failedAt();
        }
        if (!messageId.isDecoded()) {
            return Optional.of(messageId);
        }
        if (!transactionId.isDecoded()) {
            return Optional.of(transactionId);
        }
        if (!participantReferenceNumber.isDecoded()) {
            return Optional.of(participantReferenceNumber);
        }
        if (!numberOfParticipants.isDecoded()) {
            return Optional.of(numberOfParticipants);
        }
        if (!participant.isDecoded()) {
            return Optional.of(participant.failedEntry().flatMap(ParticipantEntry::failedAt).orElse(numberOfParticipants));
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
            case "ParticipantId" -> Optional.of(participantId);
            case "MessageId" -> Optional.of(messageId);
            case "TransactionId" -> Optional.of(transactionId);
            case "ParticipantReferenceNumber" -> Optional.of(participantReferenceNumber);
            case "NumberOfParticipants" -> Optional.of(numberOfParticipants);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FractionalApproximateAdjustedVolumeMarketCenterMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(participant.diffFields(message.participant));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            participant.toFormattedString(builder, options);
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
        participant.toFormattedString(builder, nested);
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
        if (!(other instanceof FractionalApproximateAdjustedVolumeMarketCenterMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && participant.equals(message.participant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, participant);
    }
}
