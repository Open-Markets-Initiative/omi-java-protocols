package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.fields;

import java.util.Objects;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.ByteOps;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.Field;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.FieldKind;
import omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.types.PrintOptions;

/**
 * Bit set of snapshot line message flags
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class SnapshotMessageInstructionsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SnapshotMessageInstructions";

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
     * Unused SnapshotMessageInstructions 0
     *
     * @return bit 0 of the container
     */
    public boolean unusedSnapshotMessageInstructions0() {
        return (value & 1L) != 0L;
    }

    /**
     * Unused SnapshotMessageInstructions 1
     *
     * @return bit 1 of the container
     */
    public boolean unusedSnapshotMessageInstructions1() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Set in the first message of an instrument within a single transaction or snapshot replay
     *
     * @return bit 2 of the container
     */
    public boolean instrumentBegin() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Set in the last message of an instrument within a single transaction or snapshot replay
     *
     * @return bit 3 of the container
     */
    public boolean instrumentEnd() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Set in the first Order Book Incremental or Order Book Snapshot message of an instrument
     *
     * @return bit 4 of the container
     */
    public boolean bookBegin() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Set in the last Order Book Incremental or Order Book Snapshot message of an instrument
     *
     * @return bit 5 of the container
     */
    public boolean bookEnd() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Unused SnapshotMessageInstructions 6
     *
     * @return bit 6 of the container
     */
    public boolean unusedSnapshotMessageInstructions6() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Marks the first message of a single snapshot replay in a line
     *
     * @return bit 7 of the container
     */
    public boolean snapshotBegin() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Marks the last message of a single snapshot replay in a line
     *
     * @return bit 8 of the container
     */
    public boolean snapshotEnd() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * 7 reserved bits
     *
     * @return bits 9 through 15 of the container
     */
    public int reserved() {
        return (int) ((value >>> 9) & 0x7FL);
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
        if (!(other instanceof SnapshotMessageInstructionsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
