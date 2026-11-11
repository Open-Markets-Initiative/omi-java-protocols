package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRejectedSenderCompField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRequestIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MassCancelRejectedMessage message from the Seed protocol.
 *
 * <p>The Mass Cancel has been rejected.</p>
 */
public final class MassCancelRejectedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Rejected Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MassCancelRejectedPresenceBitsField massCancelRejectedPresenceBits = new MassCancelRejectedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Unique identifier assigned by the Member for this mass cancel request.
     */
    private final MassCancelRequestIdField massCancelRequestId = new MassCancelRequestIdField();

    /**
     * Enum MassCancelRejectedScope.
     */
    private final MassCancelRejectedScopeField massCancelRejectedScope = new MassCancelRejectedScopeField();

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     */
    private final MassCancelRejectedBitFieldsField massCancelRejectedBitFields = new MassCancelRejectedBitFieldsField();

    /**
     * Enum MassCancelRejectedReason.
     */
    private final MassCancelRejectedReasonField massCancelRejectedReason = new MassCancelRejectedReasonField();

    /**
     * Market Participant Identifier.
     */
    private final MassCancelRejectedMpidField massCancelRejectedMpid = new MassCancelRejectedMpidField();

    /**
     * Narrows the cancel to orders entered on the specified order entry port.
     */
    private final MassCancelRejectedSenderCompField massCancelRejectedSenderComp = new MassCancelRejectedSenderCompField();

    /**
     * Member supplied grouping.
     */
    private final MassCancelRejectedMemberGroupField massCancelRejectedMemberGroup = new MassCancelRejectedMemberGroupField();

    /**
     * Scopes the mass cancel to this specific order.
     */
    private final MassCancelRejectedClOrdIdField massCancelRejectedClOrdId = new MassCancelRejectedClOrdIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(massCancelRejectedPresenceBits, transactTime, massCancelRequestId, massCancelRejectedScope, massCancelRejectedBitFields, massCancelRejectedReason, massCancelRejectedMpid, massCancelRejectedSenderComp, massCancelRejectedMemberGroup, massCancelRejectedClOrdId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MassCancelRejectedPresenceBits field
     */
    public MassCancelRejectedPresenceBitsField massCancelRejectedPresenceBits() {
        return massCancelRejectedPresenceBits;
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
     * Enum MassCancelRejectedScope.
     *
     * @return the MassCancelRejectedScope field
     */
    public MassCancelRejectedScopeField massCancelRejectedScope() {
        return massCancelRejectedScope;
    }

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     *
     * @return the MassCancelRejectedBitFields field
     */
    public MassCancelRejectedBitFieldsField massCancelRejectedBitFields() {
        return massCancelRejectedBitFields;
    }

    /**
     * Enum MassCancelRejectedReason.
     *
     * @return the MassCancelRejectedReason field
     */
    public MassCancelRejectedReasonField massCancelRejectedReason() {
        return massCancelRejectedReason;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MassCancelRejectedMpid field
     */
    public MassCancelRejectedMpidField massCancelRejectedMpid() {
        return massCancelRejectedMpid;
    }

    /**
     * Narrows the cancel to orders entered on the specified order entry port.
     *
     * @return the MassCancelRejectedSenderComp field
     */
    public MassCancelRejectedSenderCompField massCancelRejectedSenderComp() {
        return massCancelRejectedSenderComp;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MassCancelRejectedMemberGroup field
     */
    public MassCancelRejectedMemberGroupField massCancelRejectedMemberGroup() {
        return massCancelRejectedMemberGroup;
    }

    /**
     * Scopes the mass cancel to this specific order.
     *
     * @return the MassCancelRejectedClOrdId field
     */
    public MassCancelRejectedClOrdIdField massCancelRejectedClOrdId() {
        return massCancelRejectedClOrdId;
    }

    /**
     * Returns whether the fields before the MassCancelRejectedMpid put it on the wire.
     *
     * <p>Decode reads the MassCancelRejectedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelRejectedMpid is on the wire
     */
    public boolean massCancelRejectedMpidPresent() {
        return massCancelRejectedPresenceBits.hasMassCancelRejectedMpid();
    }

    /**
     * Returns whether the fields before the MassCancelRejectedSenderComp put it on the wire.
     *
     * <p>Decode reads the MassCancelRejectedSenderComp where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelRejectedSenderComp is on the wire
     */
    public boolean massCancelRejectedSenderCompPresent() {
        return massCancelRejectedPresenceBits.hasMassCancelRejectedSenderComp();
    }

    /**
     * Returns whether the fields before the MassCancelRejectedMemberGroup put it on the wire.
     *
     * <p>Decode reads the MassCancelRejectedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelRejectedMemberGroup is on the wire
     */
    public boolean massCancelRejectedMemberGroupPresent() {
        return massCancelRejectedPresenceBits.hasMassCancelRejectedMemberGroup();
    }

    /**
     * Returns whether the fields before the MassCancelRejectedClOrdId put it on the wire.
     *
     * <p>Decode reads the MassCancelRejectedClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelRejectedClOrdId is on the wire
     */
    public boolean massCancelRejectedClOrdIdPresent() {
        return massCancelRejectedPresenceBits.hasMassCancelRejectedClOrdId();
    }

    private boolean onWire(Field field) {
        return (field != massCancelRejectedMpid || massCancelRejectedMpidPresent()) && (field != massCancelRejectedSenderComp || massCancelRejectedSenderCompPresent()) && (field != massCancelRejectedMemberGroup || massCancelRejectedMemberGroupPresent()) && (field != massCancelRejectedClOrdId || massCancelRejectedClOrdIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (massCancelRejectedMpidPresent() ? MassCancelRejectedMpidField.BYTE_LENGTH : 0) + (massCancelRejectedSenderCompPresent() ? MassCancelRejectedSenderCompField.BYTE_LENGTH : 0) + (massCancelRejectedMemberGroupPresent() ? MassCancelRejectedMemberGroupField.BYTE_LENGTH : 0) + (massCancelRejectedClOrdIdPresent() ? MassCancelRejectedClOrdIdField.BYTE_LENGTH : 0);
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
        if (!massCancelRejectedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!massCancelRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestIdField.BYTE_LENGTH;
        if (!massCancelRejectedScope.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectedScopeField.BYTE_LENGTH;
        if (!massCancelRejectedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectedBitFieldsField.BYTE_LENGTH;
        if (!massCancelRejectedReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRejectedReasonField.BYTE_LENGTH;
        if (massCancelRejectedMpidPresent()) {
            if (end - cursor < MassCancelRejectedMpidField.BYTE_LENGTH || !massCancelRejectedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelRejectedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelRejectedSenderCompPresent()) {
            if (end - cursor < MassCancelRejectedSenderCompField.BYTE_LENGTH || !massCancelRejectedSenderComp.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelRejectedSenderCompField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelRejectedMemberGroupPresent()) {
            if (end - cursor < MassCancelRejectedMemberGroupField.BYTE_LENGTH || !massCancelRejectedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelRejectedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelRejectedClOrdIdPresent()) {
            if (end - cursor < MassCancelRejectedClOrdIdField.BYTE_LENGTH || !massCancelRejectedClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelRejectedClOrdIdField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (massCancelRejectedMpidPresent() != massCancelRejectedMpid.hasValue()) {
            throw new IllegalStateException(massCancelRejectedMpid.hasValue() ? "massCancelRejectedMpid holds a value the fields before it leave off the wire" : "massCancelRejectedMpid holds no value, though the fields before it put it on the wire");
        }
        if (massCancelRejectedSenderCompPresent() != massCancelRejectedSenderComp.hasValue()) {
            throw new IllegalStateException(massCancelRejectedSenderComp.hasValue() ? "massCancelRejectedSenderComp holds a value the fields before it leave off the wire" : "massCancelRejectedSenderComp holds no value, though the fields before it put it on the wire");
        }
        if (massCancelRejectedMemberGroupPresent() != massCancelRejectedMemberGroup.hasValue()) {
            throw new IllegalStateException(massCancelRejectedMemberGroup.hasValue() ? "massCancelRejectedMemberGroup holds a value the fields before it leave off the wire" : "massCancelRejectedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (massCancelRejectedClOrdIdPresent() != massCancelRejectedClOrdId.hasValue()) {
            throw new IllegalStateException(massCancelRejectedClOrdId.hasValue() ? "massCancelRejectedClOrdId holds a value the fields before it leave off the wire" : "massCancelRejectedClOrdId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = massCancelRejectedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = massCancelRequestId.encode(data, cursor);
        cursor = massCancelRejectedScope.encode(data, cursor);
        cursor = massCancelRejectedBitFields.encode(data, cursor);
        cursor = massCancelRejectedReason.encode(data, cursor);
        if (massCancelRejectedMpidPresent()) {
            cursor = massCancelRejectedMpid.encode(data, cursor);
        }
        if (massCancelRejectedSenderCompPresent()) {
            cursor = massCancelRejectedSenderComp.encode(data, cursor);
        }
        if (massCancelRejectedMemberGroupPresent()) {
            cursor = massCancelRejectedMemberGroup.encode(data, cursor);
        }
        if (massCancelRejectedClOrdIdPresent()) {
            cursor = massCancelRejectedClOrdId.encode(data, cursor);
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
            case "MassCancelRejectedPresenceBits" -> Optional.of(massCancelRejectedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "MassCancelRequestId" -> Optional.of(massCancelRequestId);
            case "MassCancelRejectedScope" -> Optional.of(massCancelRejectedScope);
            case "MassCancelRejectedBitFields" -> Optional.of(massCancelRejectedBitFields);
            case "MassCancelRejectedReason" -> Optional.of(massCancelRejectedReason);
            case "MassCancelRejectedMpid" -> Optional.of(massCancelRejectedMpid);
            case "MassCancelRejectedSenderComp" -> Optional.of(massCancelRejectedSenderComp);
            case "MassCancelRejectedMemberGroup" -> Optional.of(massCancelRejectedMemberGroup);
            case "MassCancelRejectedClOrdId" -> Optional.of(massCancelRejectedClOrdId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelRejectedMessage message)) {
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
        if (!(other instanceof MassCancelRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
