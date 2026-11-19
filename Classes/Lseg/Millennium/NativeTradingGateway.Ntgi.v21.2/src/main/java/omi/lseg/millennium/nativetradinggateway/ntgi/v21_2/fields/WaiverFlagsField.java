package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields;

import java.util.Objects;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.ByteOps;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.FieldKind;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Pre-trade waiver flags
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class WaiverFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "WaiverFlags";

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
     * @return bits 0 through 2 of the container
     */
    public int reserved02() {
        return (int) (value & 0x7L);
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
     * @return bits 4 through 7 of the container
     */
    public int reserved47() {
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
        if (!(other instanceof WaiverFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
