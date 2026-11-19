package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields;

import java.util.Objects;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.ByteOps;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.FieldKind;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * ImbalanceCondition bit set
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class ImbalanceConditionField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ImbalanceCondition";

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
     * Unused ImbalanceCondition 0
     *
     * @return bit 0 of the container
     */
    public boolean unusedImbalanceCondition0() {
        return (value & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 1
     *
     * @return bit 1 of the container
     */
    public boolean unusedImbalanceCondition1() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 2
     *
     * @return bit 2 of the container
     */
    public boolean unusedImbalanceCondition2() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 3
     *
     * @return bit 3 of the container
     */
    public boolean unusedImbalanceCondition3() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 4
     *
     * @return bit 4 of the container
     */
    public boolean unusedImbalanceCondition4() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 5
     *
     * @return bit 5 of the container
     */
    public boolean unusedImbalanceCondition5() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 6
     *
     * @return bit 6 of the container
     */
    public boolean unusedImbalanceCondition6() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Unused ImbalanceCondition 7
     *
     * @return bit 7 of the container
     */
    public boolean unusedImbalanceCondition7() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * ImbalanceMoreBuyers
     *
     * @return bit 8 of the container
     */
    public boolean imbalanceMoreBuyers() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * ImbalanceMoreSellers
     *
     * @return bit 9 of the container
     */
    public boolean imbalanceMoreSellers() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * 6 reserved bits
     *
     * @return bits 10 through 15 of the container
     */
    public int reserved() {
        return (int) ((value >>> 10) & 0x3FL);
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
        if (!(other instanceof ImbalanceConditionField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
