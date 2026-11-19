package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields;

import java.util.Objects;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.ByteOps;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.FieldKind;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.PrintOptions;

/**
 * Order books of an Update Price Point, Delete Price Point or Top of Book message, one bit per book. The document labels this field Sub book or Sub Book; it defines no bit 1 or bit 7, and its bit 6 is Default Auction.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class PricePointSubBookFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "PricePointSubBookFlags";

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
     * Regular order book
     *
     * @return bit 0 of the container
     */
    public boolean regular() {
        return (value & 1L) != 0L;
    }

    /**
     * Not defined
     *
     * @return bit 1 of the container
     */
    public boolean reserved11() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Block Trade order book
     *
     * @return bit 2 of the container
     */
    public boolean blockTrade() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Odd Lot order book
     *
     * @return bit 3 of the container
     */
    public boolean oddLot() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Early Settlement order book
     *
     * @return bit 4 of the container
     */
    public boolean earlySettlement() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Bulletin Board order book
     *
     * @return bit 5 of the container
     */
    public boolean bulletinBoard() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Default Auction order book
     *
     * @return bit 6 of the container
     */
    public boolean defaultAuction() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Not defined
     *
     * @return bit 7 of the container
     */
    public boolean reserved7() {
        return ((value >>> 7) & 1L) != 0L;
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
        if (!(other instanceof PricePointSubBookFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
