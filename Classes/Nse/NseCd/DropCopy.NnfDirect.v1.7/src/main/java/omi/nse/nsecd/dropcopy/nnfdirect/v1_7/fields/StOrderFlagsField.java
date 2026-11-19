package omi.nse.nsecd.dropcopy.nnfdirect.v1_7.fields;

import java.util.Objects;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.ByteOps;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.Field;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.FieldKind;
import omi.nse.nsecd.dropcopy.nnfdirect.v1_7.types.PrintOptions;

/**
 * Terms attached to the order
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class StOrderFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "StOrderFlags";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = false;

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
     * Reserved
     *
     * @return bits 0 through 2 of the container
     */
    public int reserved() {
        return (int) (value & 0x7L);
    }

    /**
     * Order is frozen for Nse Control to release
     *
     * @return bit 3 of the container
     */
    public boolean frozen() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Order has been modified
     *
     * @return bit 4 of the container
     */
    public boolean modified() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Order has traded
     *
     * @return bit 5 of the container
     */
    public boolean traded() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Order has been matched
     *
     * @return bit 6 of the container
     */
    public boolean matchedInd() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Minimum fill order
     *
     * @return bit 7 of the container
     */
    public boolean mf() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * All or none order
     *
     * @return bit 8 of the container
     */
    public boolean aon() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Immediate or cancel order
     *
     * @return bit 9 of the container
     */
    public boolean ioc() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Good till cancelled order
     *
     * @return bit 10 of the container
     */
    public boolean gtc() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Day order
     *
     * @return bit 11 of the container
     */
    public boolean day() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Market if touched order
     *
     * @return bit 12 of the container
     */
    public boolean mit() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Stop loss order
     *
     * @return bit 13 of the container
     */
    public boolean sl() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Market order
     *
     * @return bit 14 of the container
     */
    public boolean market() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * At the opening order
     *
     * @return bit 15 of the container
     */
    public boolean ato() {
        return ((value >>> 15) & 1L) != 0L;
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
        if (!(other instanceof StOrderFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
