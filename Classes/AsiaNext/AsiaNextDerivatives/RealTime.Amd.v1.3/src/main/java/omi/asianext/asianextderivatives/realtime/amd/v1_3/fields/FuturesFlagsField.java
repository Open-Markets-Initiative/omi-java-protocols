package omi.asianext.asianextderivatives.realtime.amd.v1_3.fields;

import java.util.Objects;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.ByteOps;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Field;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.FieldKind;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.PrintOptions;

/**
 * Futures security flags
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class FuturesFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "FuturesFlags";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

    private short value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public short value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(short value) {
        this.value = value;
        markSet(true);
    }

    /**
     * Not in used. Default to 0
     *
     * @return bit 0 of the container
     */
    public boolean macEnabled() {
        return (value & 1L) != 0L;
    }

    /**
     * 0 = Security is not a test stock, 1 = Security is a test stock
     *
     * @return bit 1 of the container
     */
    public boolean testStock() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * 0 = Security is liquid, 1 = Security is illiquid
     *
     * @return bit 2 of the container
     */
    public boolean illiquid() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * 0 = Security is not live, 1 = Security is live
     *
     * @return bit 3 of the container
     */
    public boolean live() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bit 4 of the container
     */
    public boolean unused1() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * 0 = Security is not an underlying, 1 = Security is an underlying
     *
     * @return bit 5 of the container
     */
    public boolean underlyingFlag() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * 0 = Security is not RFQ only, 1 = Security is available for RFQ trading only
     *
     * @return bit 6 of the container
     */
    public boolean rfqOnly() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bits 7 through 15 of the container
     */
    public int unused9() {
        return (int) ((value >>> 7) & 0x1FFL);
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

        this.value = (short) ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
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
        this.value = (short) 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value & 0xFFFF));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
