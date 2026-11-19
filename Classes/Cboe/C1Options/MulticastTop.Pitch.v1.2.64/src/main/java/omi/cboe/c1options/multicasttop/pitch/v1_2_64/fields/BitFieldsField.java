package omi.cboe.c1options.multicasttop.pitch.v1_2_64.fields;

import java.util.Objects;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.types.ByteOps;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.types.Field;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.types.FieldKind;
import omi.cboe.c1options.multicasttop.pitch.v1_2_64.types.PrintOptions;

/**
 * Bit field used in Single Side Update Expanded and Two Side Update Expanded messages. Bit 3 indicates AON (All or None) price level; Bit 4 (C1 Only) indicates the price level is specifically for firm customer quotes.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class BitFieldsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "BitFields";

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
     * Bits 0-2 Reserved.
     *
     * @return bits 0 through 2 of the container
     */
    public int reservedLow() {
        return (int) (value & 0x7L);
    }

    /**
     * 0 = Price level is a firm quote, 1 = Price Level is AON (All or None).
     *
     * @return bit 3 of the container
     */
    public boolean aon() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * C1 Only. 0 = Not customer specific, 1 = Price Level is specifically for firm customer quotes.
     *
     * @return bit 4 of the container
     */
    public boolean customer() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Bits 5-7 Reserved.
     *
     * @return bits 5 through 7 of the container
     */
    public int reservedHigh() {
        return (int) ((value >>> 5) & 0x7L);
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
        if (!(other instanceof BitFieldsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
