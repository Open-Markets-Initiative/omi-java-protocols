package omi.lseg.millennium.level2replay.mitch.v11_9.fields;

import java.util.Objects;
import omi.lseg.millennium.level2replay.mitch.v11_9.types.ByteOps;
import omi.lseg.millennium.level2replay.mitch.v11_9.types.Field;
import omi.lseg.millennium.level2replay.mitch.v11_9.types.FieldKind;
import omi.lseg.millennium.level2replay.mitch.v11_9.types.PrintOptions;

/**
 * Order Book Clear Flags
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class OrderBookClearFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OrderBookClearFlags";

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
     * Unused
     *
     * @return bits 0 through 4 of the container
     */
    public int unused5() {
        return (int) (value & 0x1FL);
    }

    /**
     * Firm Quote
     *
     * @return bit 5 of the container
     */
    public boolean firmQuote() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Private RFQ
     *
     * @return bit 6 of the container
     */
    public boolean privateRfq() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Unused
     *
     * @return bit 7 of the container
     */
    public boolean unused1() {
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
        if (!(other instanceof OrderBookClearFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
