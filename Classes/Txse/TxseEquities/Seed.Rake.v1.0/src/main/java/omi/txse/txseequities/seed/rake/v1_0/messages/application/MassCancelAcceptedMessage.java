package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelAcceptedSenderCompField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRequestIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MassCancelAcceptedMessage message from the Seed protocol.
 *
 * <p>The Mass Cancel has been accepted and is being processed.</p>
 */
public final class MassCancelAcceptedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Accepted Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MassCancelAcceptedPresenceBitsField massCancelAcceptedPresenceBits = new MassCancelAcceptedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Unique identifier assigned by the Member for this mass cancel request.
     */
    private final MassCancelRequestIdField massCancelRequestId = new MassCancelRequestIdField();

    /**
     * Enum MassCancelAcceptedScope.
     */
    private final MassCancelAcceptedScopeField massCancelAcceptedScope = new MassCancelAcceptedScopeField();

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     */
    private final MassCancelAcceptedBitFieldsField massCancelAcceptedBitFields = new MassCancelAcceptedBitFieldsField();

    /**
     * An identifier assigned by the Exchange for this Mass Cancel request.
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Market Participant Identifier.
     */
    private final MassCancelAcceptedMpidField massCancelAcceptedMpid = new MassCancelAcceptedMpidField();

    /**
     * Narrows the cancel to orders entered on the specified order entry port.
     */
    private final MassCancelAcceptedSenderCompField massCancelAcceptedSenderComp = new MassCancelAcceptedSenderCompField();

    /**
     * Member supplied grouping.
     */
    private final MassCancelAcceptedMemberGroupField massCancelAcceptedMemberGroup = new MassCancelAcceptedMemberGroupField();

    /**
     * Scopes the mass cancel to this specific order.
     */
    private final MassCancelAcceptedClOrdIdField massCancelAcceptedClOrdId = new MassCancelAcceptedClOrdIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(massCancelAcceptedPresenceBits, transactTime, massCancelRequestId, massCancelAcceptedScope, massCancelAcceptedBitFields, massCancelId, massCancelAcceptedMpid, massCancelAcceptedSenderComp, massCancelAcceptedMemberGroup, massCancelAcceptedClOrdId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MassCancelAcceptedPresenceBits field
     */
    public MassCancelAcceptedPresenceBitsField massCancelAcceptedPresenceBits() {
        return massCancelAcceptedPresenceBits;
    }

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Unique identifier assigned by the Member for this mass cancel request.
     *
     * @return the MassCancelRequestId field
     */
    public MassCancelRequestIdField massCancelRequestId() {
        return massCancelRequestId;
    }

    /**
     * Enum MassCancelAcceptedScope.
     *
     * @return the MassCancelAcceptedScope field
     */
    public MassCancelAcceptedScopeField massCancelAcceptedScope() {
        return massCancelAcceptedScope;
    }

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     *
     * @return the MassCancelAcceptedBitFields field
     */
    public MassCancelAcceptedBitFieldsField massCancelAcceptedBitFields() {
        return massCancelAcceptedBitFields;
    }

    /**
     * An identifier assigned by the Exchange for this Mass Cancel request.
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MassCancelAcceptedMpid field
     */
    public MassCancelAcceptedMpidField massCancelAcceptedMpid() {
        return massCancelAcceptedMpid;
    }

    /**
     * Narrows the cancel to orders entered on the specified order entry port.
     *
     * @return the MassCancelAcceptedSenderComp field
     */
    public MassCancelAcceptedSenderCompField massCancelAcceptedSenderComp() {
        return massCancelAcceptedSenderComp;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MassCancelAcceptedMemberGroup field
     */
    public MassCancelAcceptedMemberGroupField massCancelAcceptedMemberGroup() {
        return massCancelAcceptedMemberGroup;
    }

    /**
     * Scopes the mass cancel to this specific order.
     *
     * @return the MassCancelAcceptedClOrdId field
     */
    public MassCancelAcceptedClOrdIdField massCancelAcceptedClOrdId() {
        return massCancelAcceptedClOrdId;
    }

    /**
     * Returns whether the fields before the MassCancelAcceptedMpid put it on the wire.
     *
     * <p>Decode reads the MassCancelAcceptedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelAcceptedMpid is on the wire
     */
    public boolean massCancelAcceptedMpidPresent() {
        return massCancelAcceptedPresenceBits.hasMassCancelAcceptedMpid();
    }

    /**
     * Returns whether the fields before the MassCancelAcceptedSenderComp put it on the wire.
     *
     * <p>Decode reads the MassCancelAcceptedSenderComp where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelAcceptedSenderComp is on the wire
     */
    public boolean massCancelAcceptedSenderCompPresent() {
        return massCancelAcceptedPresenceBits.hasMassCancelAcceptedSenderComp();
    }

    /**
     * Returns whether the fields before the MassCancelAcceptedMemberGroup put it on the wire.
     *
     * <p>Decode reads the MassCancelAcceptedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelAcceptedMemberGroup is on the wire
     */
    public boolean massCancelAcceptedMemberGroupPresent() {
        return massCancelAcceptedPresenceBits.hasMassCancelAcceptedMemberGroup();
    }

    /**
     * Returns whether the fields before the MassCancelAcceptedClOrdId put it on the wire.
     *
     * <p>Decode reads the MassCancelAcceptedClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelAcceptedClOrdId is on the wire
     */
    public boolean massCancelAcceptedClOrdIdPresent() {
        return massCancelAcceptedPresenceBits.hasMassCancelAcceptedClOrdId();
    }

    private boolean onWire(Field field) {
        return (field != massCancelAcceptedMpid || massCancelAcceptedMpidPresent()) && (field != massCancelAcceptedSenderComp || massCancelAcceptedSenderCompPresent()) && (field != massCancelAcceptedMemberGroup || massCancelAcceptedMemberGroupPresent()) && (field != massCancelAcceptedClOrdId || massCancelAcceptedClOrdIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (massCancelAcceptedMpidPresent() ? MassCancelAcceptedMpidField.BYTE_LENGTH : 0) + (massCancelAcceptedSenderCompPresent() ? MassCancelAcceptedSenderCompField.BYTE_LENGTH : 0) + (massCancelAcceptedMemberGroupPresent() ? MassCancelAcceptedMemberGroupField.BYTE_LENGTH : 0) + (massCancelAcceptedClOrdIdPresent() ? MassCancelAcceptedClOrdIdField.BYTE_LENGTH : 0);
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
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        if (massCancelAcceptedMpidPresent()) {
            cursor += 4;
        }
        if (massCancelAcceptedSenderCompPresent()) {
            cursor += 8;
        }
        if (massCancelAcceptedMemberGroupPresent()) {
            cursor += 2;
        }
        if (massCancelAcceptedClOrdIdPresent()) {
            cursor += 8;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactTime.value());
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
        if (!massCancelAcceptedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelAcceptedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!massCancelRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestIdField.BYTE_LENGTH;
        if (!massCancelAcceptedScope.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelAcceptedScopeField.BYTE_LENGTH;
        if (!massCancelAcceptedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelAcceptedBitFieldsField.BYTE_LENGTH;
        if (!massCancelId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelIdField.BYTE_LENGTH;
        if (massCancelAcceptedMpidPresent()) {
            if (end - cursor < MassCancelAcceptedMpidField.BYTE_LENGTH || !massCancelAcceptedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelAcceptedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelAcceptedSenderCompPresent()) {
            if (end - cursor < MassCancelAcceptedSenderCompField.BYTE_LENGTH || !massCancelAcceptedSenderComp.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelAcceptedSenderCompField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelAcceptedMemberGroupPresent()) {
            if (end - cursor < MassCancelAcceptedMemberGroupField.BYTE_LENGTH || !massCancelAcceptedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelAcceptedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelAcceptedClOrdIdPresent()) {
            if (end - cursor < MassCancelAcceptedClOrdIdField.BYTE_LENGTH || !massCancelAcceptedClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelAcceptedClOrdIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (massCancelAcceptedMpidPresent() != massCancelAcceptedMpid.hasValue()) {
            throw new IllegalStateException(massCancelAcceptedMpid.hasValue() ? "massCancelAcceptedMpid holds a value the fields before it leave off the wire" : "massCancelAcceptedMpid holds no value, though the fields before it put it on the wire");
        }
        if (massCancelAcceptedSenderCompPresent() != massCancelAcceptedSenderComp.hasValue()) {
            throw new IllegalStateException(massCancelAcceptedSenderComp.hasValue() ? "massCancelAcceptedSenderComp holds a value the fields before it leave off the wire" : "massCancelAcceptedSenderComp holds no value, though the fields before it put it on the wire");
        }
        if (massCancelAcceptedMemberGroupPresent() != massCancelAcceptedMemberGroup.hasValue()) {
            throw new IllegalStateException(massCancelAcceptedMemberGroup.hasValue() ? "massCancelAcceptedMemberGroup holds a value the fields before it leave off the wire" : "massCancelAcceptedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (massCancelAcceptedClOrdIdPresent() != massCancelAcceptedClOrdId.hasValue()) {
            throw new IllegalStateException(massCancelAcceptedClOrdId.hasValue() ? "massCancelAcceptedClOrdId holds a value the fields before it leave off the wire" : "massCancelAcceptedClOrdId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = massCancelAcceptedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = massCancelRequestId.encode(data, cursor);
        cursor = massCancelAcceptedScope.encode(data, cursor);
        cursor = massCancelAcceptedBitFields.encode(data, cursor);
        cursor = massCancelId.encode(data, cursor);
        if (massCancelAcceptedMpidPresent()) {
            cursor = massCancelAcceptedMpid.encode(data, cursor);
        }
        if (massCancelAcceptedSenderCompPresent()) {
            cursor = massCancelAcceptedSenderComp.encode(data, cursor);
        }
        if (massCancelAcceptedMemberGroupPresent()) {
            cursor = massCancelAcceptedMemberGroup.encode(data, cursor);
        }
        if (massCancelAcceptedClOrdIdPresent()) {
            cursor = massCancelAcceptedClOrdId.encode(data, cursor);
        }
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "MassCancelAcceptedPresenceBits" -> Optional.of(massCancelAcceptedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "MassCancelRequestId" -> Optional.of(massCancelRequestId);
            case "MassCancelAcceptedScope" -> Optional.of(massCancelAcceptedScope);
            case "MassCancelAcceptedBitFields" -> Optional.of(massCancelAcceptedBitFields);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "MassCancelAcceptedMpid" -> Optional.of(massCancelAcceptedMpid);
            case "MassCancelAcceptedSenderComp" -> Optional.of(massCancelAcceptedSenderComp);
            case "MassCancelAcceptedMemberGroup" -> Optional.of(massCancelAcceptedMemberGroup);
            case "MassCancelAcceptedClOrdId" -> Optional.of(massCancelAcceptedClOrdId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelAcceptedMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof MassCancelAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
