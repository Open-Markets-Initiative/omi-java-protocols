package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CancelOrderV2Bitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CancelOrderV2Bitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.MassCancelIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.MassCancelInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.NumberOfCancelOrderV2BitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.OrigClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ProductCodeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * Represents the CancelOrderV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Cancel Order V2 Message.</p>
 */
public final class CancelOrderV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 21;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cancel Order V 2 Message";

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfCancelOrderV2BitfieldsField numberOfCancelOrderV2Bitfields = new NumberOfCancelOrderV2BitfieldsField();

    /**
     * BitSet CancelOrderV2 byte 1.
     */
    private final CancelOrderV2Bitfield1Field cancelOrderV2Bitfield1 = new CancelOrderV2Bitfield1Field();

    /**
     * BitSet CancelOrderV2 byte 2.
     */
    private final CancelOrderV2Bitfield2Field cancelOrderV2Bitfield2 = new CancelOrderV2Bitfield2Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Product Code
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Mass Cancel Inst
     */
    private final MassCancelInstField massCancelInst = new MassCancelInstField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(origClOrdId, numberOfCancelOrderV2Bitfields, cancelOrderV2Bitfield1, cancelOrderV2Bitfield2, clearingFirm, productCode, massCancelId, massCancelInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfCancelOrderV2Bitfields field
     */
    public NumberOfCancelOrderV2BitfieldsField numberOfCancelOrderV2Bitfields() {
        return numberOfCancelOrderV2Bitfields;
    }

    /**
     * BitSet CancelOrderV2 byte 1.
     *
     * @return the CancelOrderV2Bitfield1 field
     */
    public CancelOrderV2Bitfield1Field cancelOrderV2Bitfield1() {
        return cancelOrderV2Bitfield1;
    }

    /**
     * BitSet CancelOrderV2 byte 2.
     *
     * @return the CancelOrderV2Bitfield2 field
     */
    public CancelOrderV2Bitfield2Field cancelOrderV2Bitfield2() {
        return cancelOrderV2Bitfield2;
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
     * Product Code
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * Mass Cancel Id
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Mass Cancel Inst
     *
     * @return the MassCancelInst field
     */
    public MassCancelInstField massCancelInst() {
        return massCancelInst;
    }

    /**
     * Returns whether the fields before the CancelOrderV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the CancelOrderV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrderV2Bitfield1 is on the wire
     */
    public boolean cancelOrderV2Bitfield1Present() {
        return numberOfCancelOrderV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CancelOrderV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the CancelOrderV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrderV2Bitfield2 is on the wire
     */
    public boolean cancelOrderV2Bitfield2Present() {
        return numberOfCancelOrderV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfCancelOrderV2Bitfields.value() >= 1L) && (cancelOrderV2Bitfield1Present() && cancelOrderV2Bitfield1.cancelOrderV2Bitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the ProductCode put it on the wire.
     *
     * <p>Decode reads the ProductCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ProductCode is on the wire
     */
    public boolean productCodePresent() {
        return (numberOfCancelOrderV2Bitfields.value() >= 1L) && (cancelOrderV2Bitfield1Present() && cancelOrderV2Bitfield1.cancelOrderV2Bitfield1ProductCode());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfCancelOrderV2Bitfields.value() >= 1L) && (cancelOrderV2Bitfield1Present() && cancelOrderV2Bitfield1.cancelOrderV2Bitfield1MassCancelId());
    }

    /**
     * Returns whether the fields before the MassCancelInst put it on the wire.
     *
     * <p>Decode reads the MassCancelInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelInst is on the wire
     */
    public boolean massCancelInstPresent() {
        return (numberOfCancelOrderV2Bitfields.value() >= 2L) && (cancelOrderV2Bitfield2Present() && cancelOrderV2Bitfield2.cancelOrderV2Bitfield2MassCancelInst());
    }

    private boolean onWire(Field field) {
        return (field != cancelOrderV2Bitfield1 || cancelOrderV2Bitfield1Present()) && (field != cancelOrderV2Bitfield2 || cancelOrderV2Bitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != productCode || productCodePresent()) && (field != massCancelId || massCancelIdPresent()) && (field != massCancelInst || massCancelInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (cancelOrderV2Bitfield1Present() ? CancelOrderV2Bitfield1Field.BYTE_LENGTH : 0) + (cancelOrderV2Bitfield2Present() ? CancelOrderV2Bitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (productCodePresent() ? ProductCodeField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0);
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
        if (!numberOfCancelOrderV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfCancelOrderV2BitfieldsField.BYTE_LENGTH;
        if (cancelOrderV2Bitfield1Present()) {
            if (end - cursor < CancelOrderV2Bitfield1Field.BYTE_LENGTH || !cancelOrderV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CancelOrderV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelOrderV2Bitfield2Present()) {
            if (end - cursor < CancelOrderV2Bitfield2Field.BYTE_LENGTH || !cancelOrderV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CancelOrderV2Bitfield2Field.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (productCodePresent()) {
            if (end - cursor < ProductCodeField.BYTE_LENGTH || !productCode.parse(data, cursor)) {
                return false;
            }
            cursor += ProductCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelIdPresent()) {
            if (end - cursor < MassCancelIdField.BYTE_LENGTH || !massCancelId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelInstPresent()) {
            if (end - cursor < MassCancelInstField.BYTE_LENGTH || !massCancelInst.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelInstField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (cancelOrderV2Bitfield1Present() != cancelOrderV2Bitfield1.hasValue()) {
            throw new IllegalStateException(cancelOrderV2Bitfield1.hasValue() ? "cancelOrderV2Bitfield1 holds a value the fields before it leave off the wire" : "cancelOrderV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (cancelOrderV2Bitfield2Present() != cancelOrderV2Bitfield2.hasValue()) {
            throw new IllegalStateException(cancelOrderV2Bitfield2.hasValue() ? "cancelOrderV2Bitfield2 holds a value the fields before it leave off the wire" : "cancelOrderV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (productCodePresent() != productCode.hasValue()) {
            throw new IllegalStateException(productCode.hasValue() ? "productCode holds a value the fields before it leave off the wire" : "productCode holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
        }
        if (massCancelInstPresent() != massCancelInst.hasValue()) {
            throw new IllegalStateException(massCancelInst.hasValue() ? "massCancelInst holds a value the fields before it leave off the wire" : "massCancelInst holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = origClOrdId.encode(data, cursor);
        cursor = numberOfCancelOrderV2Bitfields.encode(data, cursor);
        if (cancelOrderV2Bitfield1Present()) {
            cursor = cancelOrderV2Bitfield1.encode(data, cursor);
        }
        if (cancelOrderV2Bitfield2Present()) {
            cursor = cancelOrderV2Bitfield2.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (productCodePresent()) {
            cursor = productCode.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
        }
        if (massCancelInstPresent()) {
            cursor = massCancelInst.encode(data, cursor);
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
            case "NumberOfCancelOrderV2Bitfields" -> Optional.of(numberOfCancelOrderV2Bitfields);
            case "CancelOrderV2Bitfield1" -> Optional.of(cancelOrderV2Bitfield1);
            case "CancelOrderV2Bitfield2" -> Optional.of(cancelOrderV2Bitfield2);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ProductCode" -> Optional.of(productCode);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CancelOrderV2Message message)) {
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
        if (!(other instanceof CancelOrderV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
