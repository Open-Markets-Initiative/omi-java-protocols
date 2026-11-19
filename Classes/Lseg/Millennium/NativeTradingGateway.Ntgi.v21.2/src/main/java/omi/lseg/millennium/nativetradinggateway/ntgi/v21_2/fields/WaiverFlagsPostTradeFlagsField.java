package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields;

import java.util.Objects;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.ByteOps;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.FieldKind;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Pre-trade waiver and post trade flags
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class WaiverFlagsPostTradeFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "WaiverFlagsPostTradeFlags";

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
     * Reserved for future use
     *
     * @return bit 0 of the container
     */
    public boolean reservedBit0() {
        return (value & 1L) != 0L;
    }

    /**
     * Post trade flag: trade executed during the CPX session at closing price
     *
     * @return bit 1 of the container
     */
    public boolean clse() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Reserved for future use
     *
     * @return bit 2 of the container
     */
    public boolean reservedBit2() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Waiver flag: illiquid instrument
     *
     * @return bit 3 of the container
     */
    public boolean ilqd() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Reserved for future use
     *
     * @return bit 4 of the container
     */
    public boolean reservedBit4() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Waiver flag: reference price
     *
     * @return bit 5 of the container
     */
    public boolean rfpt() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Reserved for future use
     *
     * @return bits 6 through 7 of the container
     */
    public int reserved() {
        return (int) ((value >>> 6) & 0x3L);
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
        if (!(other instanceof WaiverFlagsPostTradeFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
