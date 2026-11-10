package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.fields;

import java.util.Objects;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.ByteOps;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.FieldKind;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.types.PrintOptions;

/**
 * BitSet NewOrder byte 2.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NewOrderBitfield2Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NewOrderBitfield2";

    private byte value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public byte value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(byte value) {
        this.value = value;
        markSet(true);
    }

    /**
     * New Order Bitfield 2 Symbol
     *
     * @return bit 0 of the container
     */
    public boolean newOrderBitfield2Symbol() {
        return (value & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Symbol Sfx
     *
     * @return bit 1 of the container
     */
    public boolean newOrderBitfield2SymbolSfx() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Currency
     *
     * @return bit 2 of the container
     */
    public boolean newOrderBitfield2Currency() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Id Source
     *
     * @return bit 3 of the container
     */
    public boolean newOrderBitfield2IdSource() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Security Id
     *
     * @return bit 4 of the container
     */
    public boolean newOrderBitfield2SecurityId() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Security Exchange
     *
     * @return bit 5 of the container
     */
    public boolean newOrderBitfield2SecurityExchange() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Capacity
     *
     * @return bit 6 of the container
     */
    public boolean newOrderBitfield2Capacity() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * New Order Bitfield 2 Routing Inst
     *
     * @return bit 7 of the container
     */
    public boolean newOrderBitfield2RoutingInst() {
        return ((value >>> 7) & 1L) != 0L;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.BITFIELD;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    public boolean parse(byte[] data, int offset) {
        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        this.value = (byte) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, false);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = (byte) 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value & 0xFF));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewOrderBitfield2Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
