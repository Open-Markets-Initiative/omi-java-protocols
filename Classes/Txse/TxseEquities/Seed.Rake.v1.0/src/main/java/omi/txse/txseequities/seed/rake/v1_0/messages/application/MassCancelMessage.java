package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelRequestIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MassCancelSenderCompField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MassCancelMessage message from the Seed protocol.
 *
 * <p>Cancels all resting orders matching the specified scope and optional filters.</p>
 */
public final class MassCancelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'V';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 11;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MassCancelPresenceBitsField massCancelPresenceBits = new MassCancelPresenceBitsField();

    /**
     * Unique identifier assigned by the Member for this mass cancel request.
     */
    private final MassCancelRequestIdField massCancelRequestId = new MassCancelRequestIdField();

    /**
     * Enum MassCancelScope.
     */
    private final MassCancelScopeField massCancelScope = new MassCancelScopeField();

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     */
    private final MassCancelBitFieldsField massCancelBitFields = new MassCancelBitFieldsField();

    /**
     * Market Participant Identifier.
     */
    private final MassCancelMpidField massCancelMpid = new MassCancelMpidField();

    /**
     * Narrows the cancel to orders entered on the specified order entry port (SenderComp).
     */
    private final MassCancelSenderCompField massCancelSenderComp = new MassCancelSenderCompField();

    /**
     * Member supplied grouping.
     */
    private final MassCancelMemberGroupField massCancelMemberGroup = new MassCancelMemberGroupField();

    /**
     * Scopes the mass cancel to this specific order. SenderComp is required when ClOrdId is supplied.
     */
    private final MassCancelClOrdIdField massCancelClOrdId = new MassCancelClOrdIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(massCancelPresenceBits, massCancelRequestId, massCancelScope, massCancelBitFields, massCancelMpid, massCancelSenderComp, massCancelMemberGroup, massCancelClOrdId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MassCancelPresenceBits field
     */
    public MassCancelPresenceBitsField massCancelPresenceBits() {
        return massCancelPresenceBits;
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
     * Enum MassCancelScope.
     *
     * @return the MassCancelScope field
     */
    public MassCancelScopeField massCancelScope() {
        return massCancelScope;
    }

    /**
     * Bitfield used in MassCancel, MassCancelAccepted, and MassCancelRejected messages.
     *
     * @return the MassCancelBitFields field
     */
    public MassCancelBitFieldsField massCancelBitFields() {
        return massCancelBitFields;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MassCancelMpid field
     */
    public MassCancelMpidField massCancelMpid() {
        return massCancelMpid;
    }

    /**
     * Narrows the cancel to orders entered on the specified order entry port (SenderComp).
     *
     * @return the MassCancelSenderComp field
     */
    public MassCancelSenderCompField massCancelSenderComp() {
        return massCancelSenderComp;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MassCancelMemberGroup field
     */
    public MassCancelMemberGroupField massCancelMemberGroup() {
        return massCancelMemberGroup;
    }

    /**
     * Scopes the mass cancel to this specific order. SenderComp is required when ClOrdId is supplied.
     *
     * @return the MassCancelClOrdId field
     */
    public MassCancelClOrdIdField massCancelClOrdId() {
        return massCancelClOrdId;
    }

    /**
     * Returns whether the fields before the MassCancelMpid put it on the wire.
     *
     * <p>Decode reads the MassCancelMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelMpid is on the wire
     */
    public boolean massCancelMpidPresent() {
        return massCancelPresenceBits.hasMassCancelMpid();
    }

    /**
     * Returns whether the fields before the MassCancelSenderComp put it on the wire.
     *
     * <p>Decode reads the MassCancelSenderComp where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelSenderComp is on the wire
     */
    public boolean massCancelSenderCompPresent() {
        return massCancelPresenceBits.hasMassCancelSenderComp();
    }

    /**
     * Returns whether the fields before the MassCancelMemberGroup put it on the wire.
     *
     * <p>Decode reads the MassCancelMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelMemberGroup is on the wire
     */
    public boolean massCancelMemberGroupPresent() {
        return massCancelPresenceBits.hasMassCancelMemberGroup();
    }

    /**
     * Returns whether the fields before the MassCancelClOrdId put it on the wire.
     *
     * <p>Decode reads the MassCancelClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelClOrdId is on the wire
     */
    public boolean massCancelClOrdIdPresent() {
        return massCancelPresenceBits.hasMassCancelClOrdId();
    }

    private boolean onWire(Field field) {
        return (field != massCancelMpid || massCancelMpidPresent()) && (field != massCancelSenderComp || massCancelSenderCompPresent()) && (field != massCancelMemberGroup || massCancelMemberGroupPresent()) && (field != massCancelClOrdId || massCancelClOrdIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (massCancelMpidPresent() ? MassCancelMpidField.BYTE_LENGTH : 0) + (massCancelSenderCompPresent() ? MassCancelSenderCompField.BYTE_LENGTH : 0) + (massCancelMemberGroupPresent() ? MassCancelMemberGroupField.BYTE_LENGTH : 0) + (massCancelClOrdIdPresent() ? MassCancelClOrdIdField.BYTE_LENGTH : 0);
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
        if (!massCancelPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelPresenceBitsField.BYTE_LENGTH;
        if (!massCancelRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestIdField.BYTE_LENGTH;
        if (!massCancelScope.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelScopeField.BYTE_LENGTH;
        if (!massCancelBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelBitFieldsField.BYTE_LENGTH;
        if (massCancelMpidPresent()) {
            if (end - cursor < MassCancelMpidField.BYTE_LENGTH || !massCancelMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelSenderCompPresent()) {
            if (end - cursor < MassCancelSenderCompField.BYTE_LENGTH || !massCancelSenderComp.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelSenderCompField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelMemberGroupPresent()) {
            if (end - cursor < MassCancelMemberGroupField.BYTE_LENGTH || !massCancelMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelClOrdIdPresent()) {
            if (end - cursor < MassCancelClOrdIdField.BYTE_LENGTH || !massCancelClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelClOrdIdField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (massCancelMpidPresent() != massCancelMpid.hasValue()) {
            throw new IllegalStateException(massCancelMpid.hasValue() ? "massCancelMpid holds a value the fields before it leave off the wire" : "massCancelMpid holds no value, though the fields before it put it on the wire");
        }
        if (massCancelSenderCompPresent() != massCancelSenderComp.hasValue()) {
            throw new IllegalStateException(massCancelSenderComp.hasValue() ? "massCancelSenderComp holds a value the fields before it leave off the wire" : "massCancelSenderComp holds no value, though the fields before it put it on the wire");
        }
        if (massCancelMemberGroupPresent() != massCancelMemberGroup.hasValue()) {
            throw new IllegalStateException(massCancelMemberGroup.hasValue() ? "massCancelMemberGroup holds a value the fields before it leave off the wire" : "massCancelMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (massCancelClOrdIdPresent() != massCancelClOrdId.hasValue()) {
            throw new IllegalStateException(massCancelClOrdId.hasValue() ? "massCancelClOrdId holds a value the fields before it leave off the wire" : "massCancelClOrdId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = massCancelPresenceBits.encode(data, cursor);
        cursor = massCancelRequestId.encode(data, cursor);
        cursor = massCancelScope.encode(data, cursor);
        cursor = massCancelBitFields.encode(data, cursor);
        if (massCancelMpidPresent()) {
            cursor = massCancelMpid.encode(data, cursor);
        }
        if (massCancelSenderCompPresent()) {
            cursor = massCancelSenderComp.encode(data, cursor);
        }
        if (massCancelMemberGroupPresent()) {
            cursor = massCancelMemberGroup.encode(data, cursor);
        }
        if (massCancelClOrdIdPresent()) {
            cursor = massCancelClOrdId.encode(data, cursor);
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
            case "MassCancelPresenceBits" -> Optional.of(massCancelPresenceBits);
            case "MassCancelRequestId" -> Optional.of(massCancelRequestId);
            case "MassCancelScope" -> Optional.of(massCancelScope);
            case "MassCancelBitFields" -> Optional.of(massCancelBitFields);
            case "MassCancelMpid" -> Optional.of(massCancelMpid);
            case "MassCancelSenderComp" -> Optional.of(massCancelSenderComp);
            case "MassCancelMemberGroup" -> Optional.of(massCancelMemberGroup);
            case "MassCancelClOrdId" -> Optional.of(massCancelClOrdId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelMessage message)) {
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
        if (!(other instanceof MassCancelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
