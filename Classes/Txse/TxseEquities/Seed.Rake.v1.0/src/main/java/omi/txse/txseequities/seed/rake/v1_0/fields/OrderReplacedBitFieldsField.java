package omi.txse.txseequities.seed.rake.v1_0.fields;

import java.util.Objects;
import omi.txse.txseequities.seed.rake.v1_0.types.ByteOps;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.FieldKind;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Bitfield used in ReplaceOrder, OrderReplaced, and ReplaceRejected messages.
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderReplacedBitFieldsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderReplacedBitFields";

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
     * Enum Side.
     *
     * @return bits 0 through 2 of the container
     */
    public int side() {
        return (int) (value & 0x7L);
    }

    /**
     * True if a locate is required for short-sale, false otherwise.
     *
     * @return bit 3 of the container
     */
    public boolean isLocateRequired() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * True for Reg NMS Intermarket sweep orders, false otherwise.
     *
     * @return bit 4 of the container
     */
    public boolean isIso() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * True to only add the order to the book if it would be added as a resting order with no quantity executed.
     *
     * @return bit 5 of the container
     */
    public boolean isPostOnly() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * True to cancel the order at entry if market conditions are crossed.
     *
     * @return bit 6 of the container
     */
    public boolean cancelAtEntryIfCrossed() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Reserved for future use.
     *
     * @return bits 7 through 15 of the container
     */
    public int reserved() {
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
        if (!(other instanceof OrderReplacedBitFieldsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
