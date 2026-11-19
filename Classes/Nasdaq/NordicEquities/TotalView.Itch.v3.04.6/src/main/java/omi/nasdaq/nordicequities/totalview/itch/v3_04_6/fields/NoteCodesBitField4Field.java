package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.fields;

import java.util.Objects;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.ByteOps;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.Field;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.FieldKind;
import omi.nasdaq.nordicequities.totalview.itch.v3_04_6.types.PrintOptions;

/**
 * Note codes, logical Or is used to identify multiple note codes
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class NoteCodesBitField4Field extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "NoteCodesBitField4";

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
     * Bb Buy Back
     *
     * @return bit 0 of the container
     */
    public boolean bbBuyBack() {
        return (value & 1L) != 0L;
    }

    /**
     * Reserved 23
     *
     * @return bits 1 through 2 of the container
     */
    public int reserved23() {
        return (int) ((value >>> 1) & 0x3L);
    }

    /**
     * Ce Capped By Esma
     *
     * @return bit 3 of the container
     */
    public boolean ceCappedByEsma() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Reserved 5
     *
     * @return bit 4 of the container
     */
    public boolean reserved5() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Pd Price Discrepancy Historical Average Share Classes
     *
     * @return bit 5 of the container
     */
    public boolean pdPriceDiscrepancyHistoricalAverageShareClasses() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Sm Stressed Market
     *
     * @return bit 6 of the container
     */
    public boolean smStressedMarket() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Ew Market Wide Exceptional Circumstance
     *
     * @return bit 7 of the container
     */
    public boolean ewMarketWideExceptionalCircumstance() {
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
        if (!(other instanceof NoteCodesBitField4Field field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
