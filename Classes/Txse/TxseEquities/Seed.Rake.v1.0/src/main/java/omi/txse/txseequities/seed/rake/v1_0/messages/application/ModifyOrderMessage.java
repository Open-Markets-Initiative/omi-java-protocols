package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyOrderBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyOrderLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyOrderOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ModifyOrderPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the ModifyOrderMessage message from the Seed protocol.
 *
 * <p>Request to modify an existing order without losing book priority.</p>
 */
public final class ModifyOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 17;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final ModifyOrderPresenceBitsField modifyOrderPresenceBits = new ModifyOrderPresenceBitsField();

    /**
     * Client-specified order identifier that must increase with each new order.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * The ClOrdId of the order to be canceled.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Quantity can remain the same or decrease. Quantity cannot increase.
     */
    private final ModifyOrderOrderQtyField modifyOrderOrderQty = new ModifyOrderOrderQtyField();

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     */
    private final ModifyOrderBitFieldsField modifyOrderBitFields = new ModifyOrderBitFieldsField();

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     */
    private final ModifyOrderLocateBrokerField modifyOrderLocateBroker = new ModifyOrderLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(modifyOrderPresenceBits, clOrdId, origClOrdId, modifyOrderOrderQty, modifyOrderBitFields, modifyOrderLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the ModifyOrderPresenceBits field
     */
    public ModifyOrderPresenceBitsField modifyOrderPresenceBits() {
        return modifyOrderPresenceBits;
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
     * Quantity can remain the same or decrease. Quantity cannot increase.
     *
     * @return the ModifyOrderOrderQty field
     */
    public ModifyOrderOrderQtyField modifyOrderOrderQty() {
        return modifyOrderOrderQty;
    }

    /**
     * Bitfield used in ModifyOrder, OrderModified, and ModifyRejected messages.
     *
     * @return the ModifyOrderBitFields field
     */
    public ModifyOrderBitFieldsField modifyOrderBitFields() {
        return modifyOrderBitFields;
    }

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     *
     * @return the ModifyOrderLocateBroker field
     */
    public ModifyOrderLocateBrokerField modifyOrderLocateBroker() {
        return modifyOrderLocateBroker;
    }

    /**
     * Returns whether the fields before the ModifyOrderOrderQty put it on the wire.
     *
     * <p>Decode reads the ModifyOrderOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderOrderQty is on the wire
     */
    public boolean modifyOrderOrderQtyPresent() {
        return modifyOrderPresenceBits.hasModifyOrderOrderQty();
    }

    /**
     * Returns whether the fields before the ModifyOrderBitFields put it on the wire.
     *
     * <p>Decode reads the ModifyOrderBitFields where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderBitFields is on the wire
     */
    public boolean modifyOrderBitFieldsPresent() {
        return modifyOrderPresenceBits.hasModifyOrderBitFields();
    }

    /**
     * Returns whether the fields before the ModifyOrderLocateBroker put it on the wire.
     *
     * <p>Decode reads the ModifyOrderLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderLocateBroker is on the wire
     */
    public boolean modifyOrderLocateBrokerPresent() {
        return modifyOrderPresenceBits.hasModifyOrderLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != modifyOrderOrderQty || modifyOrderOrderQtyPresent()) && (field != modifyOrderBitFields || modifyOrderBitFieldsPresent()) && (field != modifyOrderLocateBroker || modifyOrderLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (modifyOrderOrderQtyPresent() ? ModifyOrderOrderQtyField.BYTE_LENGTH : 0) + (modifyOrderBitFieldsPresent() ? ModifyOrderBitFieldsField.BYTE_LENGTH : 0) + (modifyOrderLocateBrokerPresent() ? ModifyOrderLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!modifyOrderPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += ModifyOrderPresenceBitsField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (modifyOrderOrderQtyPresent()) {
            if (end - cursor < ModifyOrderOrderQtyField.BYTE_LENGTH || !modifyOrderOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyOrderBitFieldsPresent()) {
            if (end - cursor < ModifyOrderBitFieldsField.BYTE_LENGTH || !modifyOrderBitFields.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderBitFieldsField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyOrderLocateBrokerPresent()) {
            if (end - cursor < ModifyOrderLocateBrokerField.BYTE_LENGTH || !modifyOrderLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (modifyOrderOrderQtyPresent() != modifyOrderOrderQty.hasValue()) {
            throw new IllegalStateException(modifyOrderOrderQty.hasValue() ? "modifyOrderOrderQty holds a value the fields before it leave off the wire" : "modifyOrderOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (modifyOrderBitFieldsPresent() != modifyOrderBitFields.hasValue()) {
            throw new IllegalStateException(modifyOrderBitFields.hasValue() ? "modifyOrderBitFields holds a value the fields before it leave off the wire" : "modifyOrderBitFields holds no value, though the fields before it put it on the wire");
        }
        if (modifyOrderLocateBrokerPresent() != modifyOrderLocateBroker.hasValue()) {
            throw new IllegalStateException(modifyOrderLocateBroker.hasValue() ? "modifyOrderLocateBroker holds a value the fields before it leave off the wire" : "modifyOrderLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = modifyOrderPresenceBits.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        if (modifyOrderOrderQtyPresent()) {
            cursor = modifyOrderOrderQty.encode(data, cursor);
        }
        if (modifyOrderBitFieldsPresent()) {
            cursor = modifyOrderBitFields.encode(data, cursor);
        }
        if (modifyOrderLocateBrokerPresent()) {
            cursor = modifyOrderLocateBroker.encode(data, cursor);
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
            case "ModifyOrderPresenceBits" -> Optional.of(modifyOrderPresenceBits);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "ModifyOrderOrderQty" -> Optional.of(modifyOrderOrderQty);
            case "ModifyOrderBitFields" -> Optional.of(modifyOrderBitFields);
            case "ModifyOrderLocateBroker" -> Optional.of(modifyOrderLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderMessage message)) {
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
        if (!(other instanceof ModifyOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
