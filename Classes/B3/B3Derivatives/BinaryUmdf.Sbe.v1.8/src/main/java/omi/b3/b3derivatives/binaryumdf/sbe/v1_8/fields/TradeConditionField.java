package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields;

import java.util.Objects;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.ByteOps;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.FieldKind;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * TradeCondition bit set
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class TradeConditionField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradeCondition";

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
     * OpeningPrice
     *
     * @return bit 0 of the container
     */
    public boolean openingPrice() {
        return (value & 1L) != 0L;
    }

    /**
     * Crossed
     *
     * @return bit 1 of the container
     */
    public boolean crossed() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * LastTradeAtTheSamePrice
     *
     * @return bit 2 of the container
     */
    public boolean lastTradeAtTheSamePrice() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * OutOfSequence
     *
     * @return bit 3 of the container
     */
    public boolean outOfSequence() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 4
     *
     * @return bit 4 of the container
     */
    public boolean unusedTradeCondition4() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 5
     *
     * @return bit 5 of the container
     */
    public boolean unusedTradeCondition5() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * TradeOnBehalf
     *
     * @return bit 6 of the container
     */
    public boolean tradeOnBehalf() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 7
     *
     * @return bit 7 of the container
     */
    public boolean unusedTradeCondition7() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 8
     *
     * @return bit 8 of the container
     */
    public boolean unusedTradeCondition8() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 9
     *
     * @return bit 9 of the container
     */
    public boolean unusedTradeCondition9() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 10
     *
     * @return bit 10 of the container
     */
    public boolean unusedTradeCondition10() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 11
     *
     * @return bit 11 of the container
     */
    public boolean unusedTradeCondition11() {
        return ((value >>> 11) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 12
     *
     * @return bit 12 of the container
     */
    public boolean unusedTradeCondition12() {
        return ((value >>> 12) & 1L) != 0L;
    }

    /**
     * RegularTrade
     *
     * @return bit 13 of the container
     */
    public boolean regularTrade() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * BlockTrade
     *
     * @return bit 14 of the container
     */
    public boolean blockTrade() {
        return ((value >>> 14) & 1L) != 0L;
    }

    /**
     * Unused TradeCondition 15
     *
     * @return bit 15 of the container
     */
    public boolean unusedTradeCondition15() {
        return ((value >>> 15) & 1L) != 0L;
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
        if (!(other instanceof TradeConditionField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
