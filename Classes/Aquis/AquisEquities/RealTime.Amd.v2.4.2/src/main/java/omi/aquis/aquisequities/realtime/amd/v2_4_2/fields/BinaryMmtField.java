package omi.aquis.aquisequities.realtime.amd.v2_4_2.fields;

import java.util.Objects;
import omi.aquis.aquisequities.realtime.amd.v2_4_2.types.ByteOps;
import omi.aquis.aquisequities.realtime.amd.v2_4_2.types.Field;
import omi.aquis.aquisequities.realtime.amd.v2_4_2.types.FieldKind;
import omi.aquis.aquisequities.realtime.amd.v2_4_2.types.PrintOptions;

/**
 * Binary MMT flags
 *
 * <p>A 4-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class BinaryMmtField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "BinaryMmt";

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
     * Market mechanism
     *
     * @return bits 0 through 2 of the container
     */
    public int marketMechanism() {
        return (int) (value & 0x7L);
    }

    /**
     * Trading mode
     *
     * @return bits 3 through 6 of the container
     */
    public int tradingMode() {
        return (int) ((value >>> 3) & 0xFL);
    }

    /**
     * Transaction category
     *
     * @return bits 7 through 9 of the container
     */
    public int transactionCategory() {
        return (int) ((value >>> 7) & 0x7L);
    }

    /**
     * Negotiation indicator or pre-trade transparency waiver
     *
     * @return bits 10 through 12 of the container
     */
    public int negotiationIndicatorOrPreTradeTransparencyWaiver() {
        return (int) ((value >>> 10) & 0x7L);
    }

    /**
     * Crossing trade
     *
     * @return bit 13 of the container
     */
    public boolean crossingTrade() {
        return ((value >>> 13) & 1L) != 0L;
    }

    /**
     * Modification indicator
     *
     * @return bits 14 through 15 of the container
     */
    public int modificationIndicator() {
        return (int) ((value >>> 14) & 0x3L);
    }

    /**
     * Benchmark or reference price indicator
     *
     * @return bits 16 through 17 of the container
     */
    public int benchmarkReferencePriceIndicator() {
        return (int) ((value >>> 16) & 0x3L);
    }

    /**
     * Dividend
     *
     * @return bit 18 of the container
     */
    public boolean dividend() {
        return ((value >>> 18) & 1L) != 0L;
    }

    /**
     * Off book automation
     *
     * @return bits 19 through 20 of the container
     */
    public int offBookAutomation() {
        return (int) ((value >>> 19) & 0x3L);
    }

    /**
     * Price formation or discovery process
     *
     * @return bits 21 through 23 of the container
     */
    public int priceFormationDiscoveryProcess() {
        return (int) ((value >>> 21) & 0x7L);
    }

    /**
     * Algorithmic indicator
     *
     * @return bit 24 of the container
     */
    public boolean algorithmicIndicator() {
        return ((value >>> 24) & 1L) != 0L;
    }

    /**
     * Publication mode or post-trade deferral
     *
     * @return bits 25 through 27 of the container
     */
    public int publicationModePostTradeDeferral() {
        return (int) ((value >>> 25) & 0x7L);
    }

    /**
     * Deferral type
     *
     * @return bit 28 of the container
     */
    public boolean deferralType() {
        return ((value >>> 28) & 1L) != 0L;
    }

    /**
     * Duplicative indicator
     *
     * @return bit 29 of the container
     */
    public boolean duplicativeIndicator() {
        return ((value >>> 29) & 1L) != 0L;
    }

    /**
     * Spare
     *
     * @return bits 30 through 31 of the container
     */
    public int unused() {
        return (int) ((value >>> 30) & 0x3L);
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
        if (!(other instanceof BinaryMmtField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
