package omi.cme.globex.mdp3.sbe.v1_5.fields;

import java.util.Objects;
import omi.cme.globex.mdp3.sbe.v1_5.types.ByteOps;
import omi.cme.globex.mdp3.sbe.v1_5.types.Field;
import omi.cme.globex.mdp3.sbe.v1_5.types.FieldKind;
import omi.cme.globex.mdp3.sbe.v1_5.types.PrintOptions;

/**
 * MatchEventIndicator bit set
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class MatchEventIndicatorField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "MatchEventIndicator";

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
     * LastTradeMsg
     *
     * @return bit 0 of the container
     */
    public boolean lastTradeMsg() {
        return (value & 1L) != 0L;
    }

    /**
     * LastVolumeMsg
     *
     * @return bit 1 of the container
     */
    public boolean lastVolumeMsg() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * LastQuoteMsg
     *
     * @return bit 2 of the container
     */
    public boolean lastQuoteMsg() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * LastStatsMsg
     *
     * @return bit 3 of the container
     */
    public boolean lastStatsMsg() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * LastImpliedMsg
     *
     * @return bit 4 of the container
     */
    public boolean lastImpliedMsg() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * RecoveryMsg
     *
     * @return bit 5 of the container
     */
    public boolean recoveryMsg() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Reserved
     *
     * @return bit 6 of the container
     */
    public boolean reserved() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * EndOfEvent
     *
     * @return bit 7 of the container
     */
    public boolean endOfEvent() {
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
        if (!(other instanceof MatchEventIndicatorField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
