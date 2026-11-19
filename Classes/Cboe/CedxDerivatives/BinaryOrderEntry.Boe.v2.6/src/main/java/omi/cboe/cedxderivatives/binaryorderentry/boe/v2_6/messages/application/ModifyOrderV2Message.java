package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.CancelOrigOnRejectField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ModifyOrderV2Bitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ModifyOrderV2Bitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.NumberOfModifyOrderV2BitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.OrdTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.OrigClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.StopPxField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.PrintOptions;

/**
 * Represents the ModifyOrderV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Modify Order V2 Message.</p>
 */
public final class ModifyOrderV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order V 2 Message";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfModifyOrderV2BitfieldsField numberOfModifyOrderV2Bitfields = new NumberOfModifyOrderV2BitfieldsField();

    /**
     * BitSet ModifyOrderV2 byte 1.
     */
    private final ModifyOrderV2Bitfield1Field modifyOrderV2Bitfield1 = new ModifyOrderV2Bitfield1Field();

    /**
     * BitSet ModifyOrderV2 byte 2.
     */
    private final ModifyOrderV2Bitfield2Field modifyOrderV2Bitfield2 = new ModifyOrderV2Bitfield2Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Cancel Orig On Reject
     */
    private final CancelOrigOnRejectField cancelOrigOnReject = new CancelOrigOnRejectField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, origClOrdId, numberOfModifyOrderV2Bitfields, modifyOrderV2Bitfield1, modifyOrderV2Bitfield2, clearingFirm, ordType, cancelOrigOnReject, stopPx, custOrderHandlingInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

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
     * @return the NumberOfModifyOrderV2Bitfields field
     */
    public NumberOfModifyOrderV2BitfieldsField numberOfModifyOrderV2Bitfields() {
        return numberOfModifyOrderV2Bitfields;
    }

    /**
     * BitSet ModifyOrderV2 byte 1.
     *
     * @return the ModifyOrderV2Bitfield1 field
     */
    public ModifyOrderV2Bitfield1Field modifyOrderV2Bitfield1() {
        return modifyOrderV2Bitfield1;
    }

    /**
     * BitSet ModifyOrderV2 byte 2.
     *
     * @return the ModifyOrderV2Bitfield2 field
     */
    public ModifyOrderV2Bitfield2Field modifyOrderV2Bitfield2() {
        return modifyOrderV2Bitfield2;
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
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Cancel Orig On Reject
     *
     * @return the CancelOrigOnReject field
     */
    public CancelOrigOnRejectField cancelOrigOnReject() {
        return cancelOrigOnReject;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Returns whether the fields before the ModifyOrderV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the ModifyOrderV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderV2Bitfield1 is on the wire
     */
    public boolean modifyOrderV2Bitfield1Present() {
        return numberOfModifyOrderV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ModifyOrderV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the ModifyOrderV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderV2Bitfield2 is on the wire
     */
    public boolean modifyOrderV2Bitfield2Present() {
        return numberOfModifyOrderV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfModifyOrderV2Bitfields.value() >= 1L) && (modifyOrderV2Bitfield1Present() && modifyOrderV2Bitfield1.modifyOrderV2Bitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfModifyOrderV2Bitfields.value() >= 1L) && (modifyOrderV2Bitfield1Present() && modifyOrderV2Bitfield1.modifyOrderV2Bitfield1OrdType());
    }

    /**
     * Returns whether the fields before the CancelOrigOnReject put it on the wire.
     *
     * <p>Decode reads the CancelOrigOnReject where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrigOnReject is on the wire
     */
    public boolean cancelOrigOnRejectPresent() {
        return (numberOfModifyOrderV2Bitfields.value() >= 1L) && (modifyOrderV2Bitfield1Present() && modifyOrderV2Bitfield1.modifyOrderV2Bitfield1CancelOrigOnReject());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfModifyOrderV2Bitfields.value() >= 2L) && (modifyOrderV2Bitfield2Present() && modifyOrderV2Bitfield2.modifyOrderV2Bitfield2StopPx());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfModifyOrderV2Bitfields.value() >= 2L) && (modifyOrderV2Bitfield2Present() && modifyOrderV2Bitfield2.modifyOrderV2Bitfield2CustOrderHandlingInst());
    }

    private boolean onWire(Field field) {
        return (field != modifyOrderV2Bitfield1 || modifyOrderV2Bitfield1Present()) && (field != modifyOrderV2Bitfield2 || modifyOrderV2Bitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != ordType || ordTypePresent()) && (field != cancelOrigOnReject || cancelOrigOnRejectPresent()) && (field != stopPx || stopPxPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (modifyOrderV2Bitfield1Present() ? ModifyOrderV2Bitfield1Field.BYTE_LENGTH : 0) + (modifyOrderV2Bitfield2Present() ? ModifyOrderV2Bitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (cancelOrigOnRejectPresent() ? CancelOrigOnRejectField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0);
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!numberOfModifyOrderV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfModifyOrderV2BitfieldsField.BYTE_LENGTH;
        if (modifyOrderV2Bitfield1Present()) {
            if (end - cursor < ModifyOrderV2Bitfield1Field.BYTE_LENGTH || !modifyOrderV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyOrderV2Bitfield2Present()) {
            if (end - cursor < ModifyOrderV2Bitfield2Field.BYTE_LENGTH || !modifyOrderV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderV2Bitfield2Field.BYTE_LENGTH;
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
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cancelOrigOnRejectPresent()) {
            if (end - cursor < CancelOrigOnRejectField.BYTE_LENGTH || !cancelOrigOnReject.parse(data, cursor)) {
                return false;
            }
            cursor += CancelOrigOnRejectField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (custOrderHandlingInstPresent()) {
            if (end - cursor < CustOrderHandlingInstField.BYTE_LENGTH || !custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (modifyOrderV2Bitfield1Present() != modifyOrderV2Bitfield1.hasValue()) {
            throw new IllegalStateException(modifyOrderV2Bitfield1.hasValue() ? "modifyOrderV2Bitfield1 holds a value the fields before it leave off the wire" : "modifyOrderV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (modifyOrderV2Bitfield2Present() != modifyOrderV2Bitfield2.hasValue()) {
            throw new IllegalStateException(modifyOrderV2Bitfield2.hasValue() ? "modifyOrderV2Bitfield2 holds a value the fields before it leave off the wire" : "modifyOrderV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (cancelOrigOnRejectPresent() != cancelOrigOnReject.hasValue()) {
            throw new IllegalStateException(cancelOrigOnReject.hasValue() ? "cancelOrigOnReject holds a value the fields before it leave off the wire" : "cancelOrigOnReject holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = numberOfModifyOrderV2Bitfields.encode(data, cursor);
        if (modifyOrderV2Bitfield1Present()) {
            cursor = modifyOrderV2Bitfield1.encode(data, cursor);
        }
        if (modifyOrderV2Bitfield2Present()) {
            cursor = modifyOrderV2Bitfield2.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (cancelOrigOnRejectPresent()) {
            cursor = cancelOrigOnReject.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "NumberOfModifyOrderV2Bitfields" -> Optional.of(numberOfModifyOrderV2Bitfields);
            case "ModifyOrderV2Bitfield1" -> Optional.of(modifyOrderV2Bitfield1);
            case "ModifyOrderV2Bitfield2" -> Optional.of(modifyOrderV2Bitfield2);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrdType" -> Optional.of(ordType);
            case "CancelOrigOnReject" -> Optional.of(cancelOrigOnReject);
            case "StopPx" -> Optional.of(stopPx);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyOrderV2Message message)) {
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
        if (!(other instanceof ModifyOrderV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
