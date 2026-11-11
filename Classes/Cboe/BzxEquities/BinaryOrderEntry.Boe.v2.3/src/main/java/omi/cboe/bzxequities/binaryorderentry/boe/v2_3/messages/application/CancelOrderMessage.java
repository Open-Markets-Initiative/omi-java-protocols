package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.CancelOrderBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.CancelOrderBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.NumberOfCancelOrderBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.OrigClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.PrintOptions;

/**
 * Represents the CancelOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to cancel either a single order or mass cancellation of a group of orders.</p>
 */
public final class CancelOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Order Message";

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Bitfield identifying which bitfields are set. Field values must be appended to the end of the message.
     */
    private final NumberOfCancelOrderBitfieldsField numberOfCancelOrderBitfields = new NumberOfCancelOrderBitfieldsField();

    /**
     * BitSet CancelOrder byte 1.
     */
    private final CancelOrderBitfield1Field cancelOrderBitfield1 = new CancelOrderBitfield1Field();

    /**
     * BitSet CancelOrder byte 2.
     */
    private final CancelOrderBitfield2Field cancelOrderBitfield2 = new CancelOrderBitfield2Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(origClOrdId, numberOfCancelOrderBitfields, cancelOrderBitfield1, cancelOrderBitfield2, clearingFirm);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Bitfield identifying which bitfields are set. Field values must be appended to the end of the message.
     *
     * @return the NumberOfCancelOrderBitfields field
     */
    public NumberOfCancelOrderBitfieldsField numberOfCancelOrderBitfields() {
        return numberOfCancelOrderBitfields;
    }

    /**
     * BitSet CancelOrder byte 1.
     *
     * @return the CancelOrderBitfield1 field
     */
    public CancelOrderBitfield1Field cancelOrderBitfield1() {
        return cancelOrderBitfield1;
    }

    /**
     * BitSet CancelOrder byte 2.
     *
     * @return the CancelOrderBitfield2 field
     */
    public CancelOrderBitfield2Field cancelOrderBitfield2() {
        return cancelOrderBitfield2;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Returns whether the fields before the CancelOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the CancelOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrderBitfield1 is on the wire
     */
    public boolean cancelOrderBitfield1Present() {
        return numberOfCancelOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CancelOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the CancelOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrderBitfield2 is on the wire
     */
    public boolean cancelOrderBitfield2Present() {
        return numberOfCancelOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfCancelOrderBitfields.value() >= 1L) && (cancelOrderBitfield1Present() && cancelOrderBitfield1.cancelOrderBitfield1ClearingFirm());
    }

    private boolean onWire(Field field) {
        return (field != cancelOrderBitfield1 || cancelOrderBitfield1Present()) && (field != cancelOrderBitfield2 || cancelOrderBitfield2Present()) && (field != clearingFirm || clearingFirmPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (cancelOrderBitfield1Present() ? CancelOrderBitfield1Field.BYTE_LENGTH : 0) + (cancelOrderBitfield2Present() ? CancelOrderBitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0);
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
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!numberOfCancelOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfCancelOrderBitfieldsField.BYTE_LENGTH;
        if (cancelOrderBitfield1Present()) {
            if (end - cursor < CancelOrderBitfield1Field.BYTE_LENGTH || !cancelOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CancelOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelOrderBitfield2Present()) {
            if (end - cursor < CancelOrderBitfield2Field.BYTE_LENGTH || !cancelOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CancelOrderBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (cancelOrderBitfield1Present() != cancelOrderBitfield1.hasValue()) {
            throw new IllegalStateException(cancelOrderBitfield1.hasValue() ? "cancelOrderBitfield1 holds a value the fields before it leave off the wire" : "cancelOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (cancelOrderBitfield2Present() != cancelOrderBitfield2.hasValue()) {
            throw new IllegalStateException(cancelOrderBitfield2.hasValue() ? "cancelOrderBitfield2 holds a value the fields before it leave off the wire" : "cancelOrderBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = origClOrdId.encode(data, cursor);
        cursor = numberOfCancelOrderBitfields.encode(data, cursor);
        if (cancelOrderBitfield1Present()) {
            cursor = cancelOrderBitfield1.encode(data, cursor);
        }
        if (cancelOrderBitfield2Present()) {
            cursor = cancelOrderBitfield2.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
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
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "NumberOfCancelOrderBitfields" -> Optional.of(numberOfCancelOrderBitfields);
            case "CancelOrderBitfield1" -> Optional.of(cancelOrderBitfield1);
            case "CancelOrderBitfield2" -> Optional.of(cancelOrderBitfield2);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelOrderMessage message)) {
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
        if (!(other instanceof CancelOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
