package omi.nairobi.nairobiequities.replay.mitch.v1_22.fields;

import java.util.Objects;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.ByteOps;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.FieldKind;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.PrintOptions;

/**
 * Flags of the Update Price Point message, which the document labels Flags.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class UpdatePricePointFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "UpdatePricePointFlags";

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
     * Not defined
     *
     * @return bits 0 through 3 of the container
     */
    public int reserved03() {
        return (int) (value & 0xFL);
    }

    /**
     * Market order
     *
     * @return bit 4 of the container
     */
    public boolean marketOrder() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Not defined
     *
     * @return bits 5 through 7 of the container
     */
    public int reserved57() {
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
        if (!(other instanceof UpdatePricePointFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
