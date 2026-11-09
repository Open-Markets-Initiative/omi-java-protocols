package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyRejectedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyRejectedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyRejectedOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyRejectedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyRejectedReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the ModifyRejectedMessage message from the Seed protocol.
 *
 * <p>The requested ModifyOrder has been rejected.</p>
 */
public final class ModifyRejectedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'N';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Rejected Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final ModifyRejectedPresenceBitsField modifyRejectedPresenceBits = new ModifyRejectedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Client-specified order identifier that must increase with each new order.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * The ClOrdId of the order to be canceled.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Enum ModifyRejectedReason.
     */
    private final ModifyRejectedReasonField modifyRejectedReason = new ModifyRejectedReasonField();

    /**
     * Quantity can remain the same or decrease.
     */
    private final ModifyRejectedOrderQtyField modifyRejectedOrderQty = new ModifyRejectedOrderQtyField();

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     */
    private final ModifyRejectedBitFieldsField modifyRejectedBitFields = new ModifyRejectedBitFieldsField();

    /**
     * Locate broker.
     */
    private final ModifyRejectedLocateBrokerField modifyRejectedLocateBroker = new ModifyRejectedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(modifyRejectedPresenceBits, transactTime, clOrdId, origClOrdId, modifyRejectedReason, modifyRejectedOrderQty, modifyRejectedBitFields, modifyRejectedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the ModifyRejectedPresenceBits field
     */
    public ModifyRejectedPresenceBitsField modifyRejectedPresenceBits() {
        return modifyRejectedPresenceBits;
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
     * Client-specified order identifier that must increase with each new order.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * The ClOrdId of the order to be canceled.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Enum ModifyRejectedReason.
     *
     * @return the ModifyRejectedReason field
     */
    public ModifyRejectedReasonField modifyRejectedReason() {
        return modifyRejectedReason;
    }

    /**
     * Quantity can remain the same or decrease.
     *
     * @return the ModifyRejectedOrderQty field
     */
    public ModifyRejectedOrderQtyField modifyRejectedOrderQty() {
        return modifyRejectedOrderQty;
    }

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     *
     * @return the ModifyRejectedBitFields field
     */
    public ModifyRejectedBitFieldsField modifyRejectedBitFields() {
        return modifyRejectedBitFields;
    }

    /**
     * Locate broker.
     *
     * @return the ModifyRejectedLocateBroker field
     */
    public ModifyRejectedLocateBrokerField modifyRejectedLocateBroker() {
        return modifyRejectedLocateBroker;
    }

    /**
     * Returns whether the fields before the ModifyRejectedOrderQty put it on the wire.
     *
     * <p>Decode reads the ModifyRejectedOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyRejectedOrderQty is on the wire
     */
    public boolean modifyRejectedOrderQtyPresent() {
        return modifyRejectedPresenceBits.hasModifyRejectedOrderQty();
    }

    /**
     * Returns whether the fields before the ModifyRejectedBitFields put it on the wire.
     *
     * <p>Decode reads the ModifyRejectedBitFields where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyRejectedBitFields is on the wire
     */
    public boolean modifyRejectedBitFieldsPresent() {
        return modifyRejectedPresenceBits.hasModifyRejectedBitFields();
    }

    /**
     * Returns whether the fields before the ModifyRejectedLocateBroker put it on the wire.
     *
     * <p>Decode reads the ModifyRejectedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyRejectedLocateBroker is on the wire
     */
    public boolean modifyRejectedLocateBrokerPresent() {
        return modifyRejectedPresenceBits.hasModifyRejectedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != modifyRejectedOrderQty || modifyRejectedOrderQtyPresent()) && (field != modifyRejectedBitFields || modifyRejectedBitFieldsPresent()) && (field != modifyRejectedLocateBroker || modifyRejectedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (modifyRejectedOrderQtyPresent() ? ModifyRejectedOrderQtyField.BYTE_LENGTH : 0) + (modifyRejectedBitFieldsPresent() ? ModifyRejectedBitFieldsField.BYTE_LENGTH : 0) + (modifyRejectedLocateBrokerPresent() ? ModifyRejectedLocateBrokerField.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 1;
        if (modifyRejectedOrderQtyPresent()) {
            cursor += 4;
        }
        if (modifyRejectedBitFieldsPresent()) {
            cursor += 1;
        }
        if (modifyRejectedLocateBrokerPresent()) {
            cursor += 4;
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
        if (!modifyRejectedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += ModifyRejectedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!modifyRejectedReason.parse(data, cursor)) {
            return false;
        }
        cursor += ModifyRejectedReasonField.BYTE_LENGTH;
        if (modifyRejectedOrderQtyPresent()) {
            if (end - cursor < ModifyRejectedOrderQtyField.BYTE_LENGTH || !modifyRejectedOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyRejectedOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyRejectedBitFieldsPresent()) {
            if (end - cursor < ModifyRejectedBitFieldsField.BYTE_LENGTH || !modifyRejectedBitFields.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyRejectedBitFieldsField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyRejectedLocateBrokerPresent()) {
            if (end - cursor < ModifyRejectedLocateBrokerField.BYTE_LENGTH || !modifyRejectedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyRejectedLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (modifyRejectedOrderQtyPresent() != modifyRejectedOrderQty.hasValue()) {
            throw new IllegalStateException(modifyRejectedOrderQty.hasValue() ? "modifyRejectedOrderQty holds a value the fields before it leave off the wire" : "modifyRejectedOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (modifyRejectedBitFieldsPresent() != modifyRejectedBitFields.hasValue()) {
            throw new IllegalStateException(modifyRejectedBitFields.hasValue() ? "modifyRejectedBitFields holds a value the fields before it leave off the wire" : "modifyRejectedBitFields holds no value, though the fields before it put it on the wire");
        }
        if (modifyRejectedLocateBrokerPresent() != modifyRejectedLocateBroker.hasValue()) {
            throw new IllegalStateException(modifyRejectedLocateBroker.hasValue() ? "modifyRejectedLocateBroker holds a value the fields before it leave off the wire" : "modifyRejectedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = modifyRejectedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = modifyRejectedReason.encode(data, cursor);
        if (modifyRejectedOrderQtyPresent()) {
            cursor = modifyRejectedOrderQty.encode(data, cursor);
        }
        if (modifyRejectedBitFieldsPresent()) {
            cursor = modifyRejectedBitFields.encode(data, cursor);
        }
        if (modifyRejectedLocateBrokerPresent()) {
            cursor = modifyRejectedLocateBroker.encode(data, cursor);
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
            case "ModifyRejectedPresenceBits" -> Optional.of(modifyRejectedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "ModifyRejectedReason" -> Optional.of(modifyRejectedReason);
            case "ModifyRejectedOrderQty" -> Optional.of(modifyRejectedOrderQty);
            case "ModifyRejectedBitFields" -> Optional.of(modifyRejectedBitFields);
            case "ModifyRejectedLocateBroker" -> Optional.of(modifyRejectedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyRejectedMessage message)) {
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
        if (!(other instanceof ModifyRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
