package omi.cboe.edgxequities.multicastdepthofbook.pitch.v2_41_81.fields;

import java.util.Objects;
import omi.cboe.edgxequities.multicastdepthofbook.pitch.v2_41_81.types.ByteOps;
import omi.cboe.edgxequities.multicastdepthofbook.pitch.v2_41_81.types.Field;
import omi.cboe.edgxequities.multicastdepthofbook.pitch.v2_41_81.types.FieldKind;
import omi.cboe.edgxequities.multicastdepthofbook.pitch.v2_41_81.types.PrintOptions;

/**
 * Bit field used in the Add Order Long, Add Order Short, and Add Order Expanded messages.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class AddFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "AddFlags";

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
     * Bits 0-2 Reserved (Bit 0 set to 1).
     *
     * @return bits 0 through 2 of the container
     */
    public int unused3() {
        return (int) (value & 0x7L);
    }

    /**
     * Options only. 0 = Order is a firm quote, 1 = Order is AON (All or None).
     *
     * @return bit 3 of the container
     */
    public boolean aon() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Bits 4-7 - Reserved.
     *
     * @return bits 4 through 7 of the container
     */
    public int unused4() {
        return (int) ((value >>> 4) & 0xFL);
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
        if (!(other instanceof AddFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
