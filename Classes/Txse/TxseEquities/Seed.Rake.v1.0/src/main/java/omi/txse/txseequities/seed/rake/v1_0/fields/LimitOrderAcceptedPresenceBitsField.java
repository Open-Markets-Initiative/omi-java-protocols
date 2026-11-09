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
public final class LimitOrderAcceptedPresenceBitsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "LimitOrderAcceptedPresenceBits";

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
     * Set when limitOrderAcceptedSelfMatchScope is present.
     *
     * @return bit 0 of the container
     */
    public boolean hasLimitOrderAcceptedSelfMatchScope() {
        return (value & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedSelfMatchInstruction is present.
     *
     * @return bit 1 of the container
     */
    public boolean hasLimitOrderAcceptedSelfMatchInstruction() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedPriceSlideInstruction is present.
     *
     * @return bit 2 of the container
     */
    public boolean hasLimitOrderAcceptedPriceSlideInstruction() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMinQty is present.
     *
     * @return bit 3 of the container
     */
    public boolean hasLimitOrderAcceptedMinQty() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMaxFloorQty is present.
     *
     * @return bit 4 of the container
     */
    public boolean hasLimitOrderAcceptedMaxFloorQty() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMaxReplenishQtyRange is present.
     *
     * @return bit 5 of the container
     */
    public boolean hasLimitOrderAcceptedMaxReplenishQtyRange() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMaxReplenishTimeRange is present.
     *
     * @return bit 6 of the container
     */
    public boolean hasLimitOrderAcceptedMaxReplenishTimeRange() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedReferencePriceTarget is present.
     *
     * @return bit 7 of the container
     */
    public boolean hasLimitOrderAcceptedReferencePriceTarget() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedExpireTime is present.
     *
     * @return bit 8 of the container
     */
    public boolean hasLimitOrderAcceptedExpireTime() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedUserData is present.
     *
     * @return bit 9 of the container
     */
    public boolean hasLimitOrderAcceptedUserData() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMpid is present.
     *
     * @return bit 10 of the container
     */
    public boolean hasLimitOrderAcceptedMpid() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedMemberGroup is present.
     *
     * @return bit 11 of the container
     */
    public boolean hasLimitOrderAcceptedMemberGroup() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedLocateBroker is present.
     *
     * @return bit 12 of the container
     */
    public boolean hasLimitOrderAcceptedLocateBroker() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedRankPrice is present.
     *
     * @return bit 13 of the container
     */
    public boolean hasLimitOrderAcceptedRankPrice() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Set when limitOrderAcceptedDisplayPrice is present.
     *
     * @return bit 14 of the container
     */
    public boolean hasLimitOrderAcceptedDisplayPrice() {
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
        if (!(other instanceof LimitOrderAcceptedPresenceBitsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
