package omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields;

import java.util.Objects;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.ByteOps;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.FieldKind;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.PrintOptions;

/**
 * Order books a message relates to, one bit per book. The document labels this field Sub Book, the label it also gives the single valued order book code of the trade and statistics messages; the two are different encodings.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class SubBookFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SubBookFlags";

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
     * Off-Book order book
     *
     * @return bit 1 of the container
     */
    public boolean offBook() {
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
     * Auction order book
     *
     * @return bit 6 of the container
     */
    public boolean auction() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * All or None order book
     *
     * @return bit 7 of the container
     */
    public boolean allOrNone() {
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
        if (!(other instanceof SubBookFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
