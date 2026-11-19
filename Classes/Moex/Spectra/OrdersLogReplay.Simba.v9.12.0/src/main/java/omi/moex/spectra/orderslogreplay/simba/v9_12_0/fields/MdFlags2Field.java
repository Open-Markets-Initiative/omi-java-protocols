package omi.moex.spectra.orderslogreplay.simba.v9_12_0.fields;

import java.util.Objects;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.ByteOps;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.Field;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.FieldKind;
import omi.moex.spectra.orderslogreplay.simba.v9_12_0.types.PrintOptions;

/**
 * MDFlags2Set bit set
 *
 * <p>A 8-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class MdFlags2Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This field's declared name.
     */
    public static final String NAME = "MdFlags2";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

    private long value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public long value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(long value) {
        this.value = value;
        markSet(true);
    }

    /**
     * Zero
     *
     * @return bit 0 of the container
     */
    public boolean zero() {
        return (value & 1L) != 0L;
    }

    /**
     * 63 reserved bits
     *
     * @return bits 1 through 63 of the container
     */
    public long reserved() {
        return ((value >>> 1) & 0x7FFFFFFFFFFFFFFFL);
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

        this.value = ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, value, LITTLE_ENDIAN);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = 0L;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Long.toHexString(value));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MdFlags2Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
