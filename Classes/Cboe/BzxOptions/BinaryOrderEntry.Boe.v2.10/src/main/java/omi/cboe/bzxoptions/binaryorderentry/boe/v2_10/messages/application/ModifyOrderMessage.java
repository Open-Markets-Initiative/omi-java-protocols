package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.CancelOrigOnRejectField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ExecInstField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.MaxFloorField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ModifyOrderBitfield1Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ModifyOrderBitfield2Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfModifyOrderBitfieldsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.OrdTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.OrderQtyLongField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.OrigClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.PriceLongField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.StopPxField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the ModifyOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to modify an order. T.</p>
 */
public final class ModifyOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Order Message";

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfModifyOrderBitfieldsField numberOfModifyOrderBitfields = new NumberOfModifyOrderBitfieldsField();

    /**
     * BitSet ModifyOrder byte 1.
     */
    private final ModifyOrderBitfield1Field modifyOrderBitfield1 = new ModifyOrderBitfield1Field();

    /**
     * BitSet ModifyOrder byte 2.
     */
    private final ModifyOrderBitfield2Field modifyOrderBitfield2 = new ModifyOrderBitfield2Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyLongField orderQtyLong = new OrderQtyLongField();

    /**
     * Price Long
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Cancel Orig On Reject
     */
    private final CancelOrigOnRejectField cancelOrigOnReject = new CancelOrigOnRejectField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, origClOrdId, numberOfModifyOrderBitfields, modifyOrderBitfield1, modifyOrderBitfield2, clearingFirm, orderQtyLong, priceLong, ordType, cancelOrigOnReject, execInst, maxFloor, stopPx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel. For mass cancel requests, must be empty (all zeroes).
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfModifyOrderBitfields field
     */
    public NumberOfModifyOrderBitfieldsField numberOfModifyOrderBitfields() {
        return numberOfModifyOrderBitfields;
    }

    /**
     * BitSet ModifyOrder byte 1.
     *
     * @return the ModifyOrderBitfield1 field
     */
    public ModifyOrderBitfield1Field modifyOrderBitfield1() {
        return modifyOrderBitfield1;
    }

    /**
     * BitSet ModifyOrder byte 2.
     *
     * @return the ModifyOrderBitfield2 field
     */
    public ModifyOrderBitfield2Field modifyOrderBitfield2() {
        return modifyOrderBitfield2;
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
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQtyLong field
     */
    public OrderQtyLongField orderQtyLong() {
        return orderQtyLong;
    }

    /**
     * Price Long
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
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
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
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
     * Returns whether the fields before the ModifyOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the ModifyOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderBitfield1 is on the wire
     */
    public boolean modifyOrderBitfield1Present() {
        return numberOfModifyOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ModifyOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the ModifyOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ModifyOrderBitfield2 is on the wire
     */
    public boolean modifyOrderBitfield2Present() {
        return numberOfModifyOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQtyLong put it on the wire.
     *
     * <p>Decode reads the OrderQtyLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyLong is on the wire
     */
    public boolean orderQtyLongPresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1OrderQty());
    }

    /**
     * Returns whether the fields before the PriceLong put it on the wire.
     *
     * <p>Decode reads the PriceLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceLong is on the wire
     */
    public boolean priceLongPresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the CancelOrigOnReject put it on the wire.
     *
     * <p>Decode reads the CancelOrigOnReject where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CancelOrigOnReject is on the wire
     */
    public boolean cancelOrigOnRejectPresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1CancelOrigOnReject());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfModifyOrderBitfields.value() >= 1L) && (modifyOrderBitfield1Present() && modifyOrderBitfield1.modifyOrderBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfModifyOrderBitfields.value() >= 2L) && (modifyOrderBitfield2Present() && modifyOrderBitfield2.modifyOrderBitfield2MaxFloor());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfModifyOrderBitfields.value() >= 2L) && (modifyOrderBitfield2Present() && modifyOrderBitfield2.modifyOrderBitfield2StopPx());
    }

    private boolean onWire(Field field) {
        return (field != modifyOrderBitfield1 || modifyOrderBitfield1Present()) && (field != modifyOrderBitfield2 || modifyOrderBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQtyLong || orderQtyLongPresent()) && (field != priceLong || priceLongPresent()) && (field != ordType || ordTypePresent()) && (field != cancelOrigOnReject || cancelOrigOnRejectPresent()) && (field != execInst || execInstPresent()) && (field != maxFloor || maxFloorPresent()) && (field != stopPx || stopPxPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (modifyOrderBitfield1Present() ? ModifyOrderBitfield1Field.BYTE_LENGTH : 0) + (modifyOrderBitfield2Present() ? ModifyOrderBitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyLongPresent() ? OrderQtyLongField.BYTE_LENGTH : 0) + (priceLongPresent() ? PriceLongField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (cancelOrigOnRejectPresent() ? CancelOrigOnRejectField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0);
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
        if (!numberOfModifyOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfModifyOrderBitfieldsField.BYTE_LENGTH;
        if (modifyOrderBitfield1Present()) {
            if (end - cursor < ModifyOrderBitfield1Field.BYTE_LENGTH || !modifyOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (modifyOrderBitfield2Present()) {
            if (end - cursor < ModifyOrderBitfield2Field.BYTE_LENGTH || !modifyOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ModifyOrderBitfield2Field.BYTE_LENGTH;
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
        if (orderQtyLongPresent()) {
            if (end - cursor < OrderQtyLongField.BYTE_LENGTH || !orderQtyLong.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyLongField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceLongPresent()) {
            if (end - cursor < PriceLongField.BYTE_LENGTH || !priceLong.parse(data, cursor)) {
                return false;
            }
            cursor += PriceLongField.BYTE_LENGTH;
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
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (modifyOrderBitfield1Present() != modifyOrderBitfield1.hasValue()) {
            throw new IllegalStateException(modifyOrderBitfield1.hasValue() ? "modifyOrderBitfield1 holds a value the fields before it leave off the wire" : "modifyOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (modifyOrderBitfield2Present() != modifyOrderBitfield2.hasValue()) {
            throw new IllegalStateException(modifyOrderBitfield2.hasValue() ? "modifyOrderBitfield2 holds a value the fields before it leave off the wire" : "modifyOrderBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyLongPresent() != orderQtyLong.hasValue()) {
            throw new IllegalStateException(orderQtyLong.hasValue() ? "orderQtyLong holds a value the fields before it leave off the wire" : "orderQtyLong holds no value, though the fields before it put it on the wire");
        }
        if (priceLongPresent() != priceLong.hasValue()) {
            throw new IllegalStateException(priceLong.hasValue() ? "priceLong holds a value the fields before it leave off the wire" : "priceLong holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (cancelOrigOnRejectPresent() != cancelOrigOnReject.hasValue()) {
            throw new IllegalStateException(cancelOrigOnReject.hasValue() ? "cancelOrigOnReject holds a value the fields before it leave off the wire" : "cancelOrigOnReject holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = numberOfModifyOrderBitfields.encode(data, cursor);
        if (modifyOrderBitfield1Present()) {
            cursor = modifyOrderBitfield1.encode(data, cursor);
        }
        if (modifyOrderBitfield2Present()) {
            cursor = modifyOrderBitfield2.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (orderQtyLongPresent()) {
            cursor = orderQtyLong.encode(data, cursor);
        }
        if (priceLongPresent()) {
            cursor = priceLong.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (cancelOrigOnRejectPresent()) {
            cursor = cancelOrigOnReject.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
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
            case "NumberOfModifyOrderBitfields" -> Optional.of(numberOfModifyOrderBitfields);
            case "ModifyOrderBitfield1" -> Optional.of(modifyOrderBitfield1);
            case "ModifyOrderBitfield2" -> Optional.of(modifyOrderBitfield2);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrderQtyLong" -> Optional.of(orderQtyLong);
            case "PriceLong" -> Optional.of(priceLong);
            case "OrdType" -> Optional.of(ordType);
            case "CancelOrigOnReject" -> Optional.of(cancelOrigOnReject);
            case "ExecInst" -> Optional.of(execInst);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "StopPx" -> Optional.of(stopPx);
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
