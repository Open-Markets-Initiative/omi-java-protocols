package omi.txse.txseequities.seed.rake.v1_0.fields;

import java.util.Objects;
import omi.txse.txseequities.seed.rake.v1_0.types.ByteOps;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.FieldKind;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Presence bit flags for optional fields in the enclosing message.
 *
 * <p>A 4-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class LimitOrderPresenceBitsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "LimitOrderPresenceBits";

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
     * Set when limitOrderSelfMatchScope is present.
     *
     * @return bit 0 of the container
     */
    public boolean hasLimitOrderSelfMatchScope() {
        return (value & 1L) != 0L;
    }

    /**
     * Set when limitOrderSelfMatchInstruction is present.
     *
     * @return bit 1 of the container
     */
    public boolean hasLimitOrderSelfMatchInstruction() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Set when limitOrderPriceSlideInstruction is present.
     *
     * @return bit 2 of the container
     */
    public boolean hasLimitOrderPriceSlideInstruction() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMinQty is present.
     *
     * @return bit 3 of the container
     */
    public boolean hasLimitOrderMinQty() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMaxFloorQty is present.
     *
     * @return bit 4 of the container
     */
    public boolean hasLimitOrderMaxFloorQty() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMaxReplenishQtyRange is present.
     *
     * @return bit 5 of the container
     */
    public boolean hasLimitOrderMaxReplenishQtyRange() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMaxReplenishTimeRange is present.
     *
     * @return bit 6 of the container
     */
    public boolean hasLimitOrderMaxReplenishTimeRange() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Set when limitOrderReferencePriceTarget is present.
     *
     * @return bit 7 of the container
     */
    public boolean hasLimitOrderReferencePriceTarget() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Set when limitOrderExpireTime is present.
     *
     * @return bit 8 of the container
     */
    public boolean hasLimitOrderExpireTime() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Set when limitOrderUserData is present.
     *
     * @return bit 9 of the container
     */
    public boolean hasLimitOrderUserData() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMpid is present.
     *
     * @return bit 10 of the container
     */
    public boolean hasLimitOrderMpid() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Set when limitOrderMemberGroup is present.
     *
     * @return bit 11 of the container
     */
    public boolean hasLimitOrderMemberGroup() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Set when limitOrderLocateBroker is present.
     *
     * @return bit 12 of the container
     */
    public boolean hasLimitOrderLocateBroker() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Reserved for future use.
     *
     * @return bits 13 through 31 of the container
     */
    public int reserved() {
        return (int) ((value >>> 13) & 0x7FFFFL);
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
        if (!(other instanceof LimitOrderPresenceBitsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
