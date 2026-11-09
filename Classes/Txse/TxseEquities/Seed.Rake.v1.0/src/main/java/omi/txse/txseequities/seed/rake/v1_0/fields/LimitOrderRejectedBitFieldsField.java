package omi.txse.txseequities.seed.rake.v1_0.fields;

import java.util.Objects;
import omi.txse.txseequities.seed.rake.v1_0.types.ByteOps;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.FieldKind;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Bitfield used in LimitOrder, LimitOrderAccepted, and LimitOrderRejected messages.
 *
 * <p>A 4-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class LimitOrderRejectedBitFieldsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "LimitOrderRejectedBitFields";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = true;

    private int value;

    /**
     * Returns the whole bitfield container. Prefer the named accessors below.
     *
     * @return the decoded value, zero when the field has not decoded
     */
    public int value() {
        return value;
    }

    /**
     * Sets the value to encode.
     *
     * @param value the value to encode
     */
    public void value(int value) {
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
     * Enum TimeInForce.
     *
     * @return bits 4 through 7 of the container
     */
    public int timeInForce() {
        return (int) ((value >>> 4) & 0xFL);
    }

    /**
     * Enum OrderCapacity.
     *
     * @return bits 8 through 10 of the container
     */
    public int orderCapacity() {
        return (int) ((value >>> 8) & 0x7L);
    }

    /**
     * True for Reg NMS Intermarket sweep orders, false otherwise.
     *
     * @return bit 11 of the container
     */
    public boolean isIso() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * True if any of the order quantity is hidden, false for order quantity to be displayed.
     *
     * @return bit 12 of the container
     */
    public boolean isHidden() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * True to only add the order to the book if it would be added as a resting order with no quantity executed.
     *
     * @return bit 13 of the container
     */
    public boolean isPostOnly() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * True to cancel the order at entry if market conditions are crossed.
     *
     * @return bit 14 of the container
     */
    public boolean cancelAtEntryIfCrossed() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Reserved for the future.
     *
     * @return bits 15 through 31 of the container
     */
    public int reserved() {
        return (int) ((value >>> 15) & 0x1FFFFL);
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

        this.value = (int) ByteOps.unsigned(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
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
        this.value = 0;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append("0x").append(Integer.toHexString(value));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitOrderRejectedBitFieldsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
