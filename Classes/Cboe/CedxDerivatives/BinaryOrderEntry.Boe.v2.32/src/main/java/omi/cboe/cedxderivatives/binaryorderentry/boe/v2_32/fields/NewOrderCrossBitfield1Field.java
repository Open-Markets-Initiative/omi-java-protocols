package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields;

import java.util.Objects;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.ByteOps;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.FieldKind;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * BitSet NewOrderCross byte 1.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NewOrderCrossBitfield1Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NewOrderCrossBitfield1";

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
     * New Order Cross Bitfield 1 Symbol
     *
     * @return bit 0 of the container
     */
    public boolean newOrderCrossBitfield1Symbol() {
        return (value & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Id Source
     *
     * @return bit 1 of the container
     */
    public boolean newOrderCrossBitfield1IdSource() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Security Id
     *
     * @return bit 2 of the container
     */
    public boolean newOrderCrossBitfield1SecurityId() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Cust Order Handling Inst
     *
     * @return bit 3 of the container
     */
    public boolean newOrderCrossBitfield1CustOrderHandlingInst() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Liquidity Provision
     *
     * @return bit 4 of the container
     */
    public boolean newOrderCrossBitfield1LiquidityProvision() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Order Origination
     *
     * @return bit 5 of the container
     */
    public boolean newOrderCrossBitfield1OrderOrigination() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Algorithmic Indicator
     *
     * @return bit 6 of the container
     */
    public boolean newOrderCrossBitfield1AlgorithmicIndicator() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * New Order Cross Bitfield 1 Prevent Match
     *
     * @return bit 7 of the container
     */
    public boolean newOrderCrossBitfield1PreventMatch() {
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
        if (!(other instanceof NewOrderCrossBitfield1Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
