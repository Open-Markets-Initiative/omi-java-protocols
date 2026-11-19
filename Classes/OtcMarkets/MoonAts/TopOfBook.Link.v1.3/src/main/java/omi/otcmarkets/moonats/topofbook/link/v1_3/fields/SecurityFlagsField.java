package omi.otcmarkets.moonats.topofbook.link.v1_3.fields;

import java.util.Objects;
import omi.otcmarkets.moonats.topofbook.link.v1_3.types.ByteOps;
import omi.otcmarkets.moonats.topofbook.link.v1_3.types.Field;
import omi.otcmarkets.moonats.topofbook.link.v1_3.types.FieldKind;
import omi.otcmarkets.moonats.topofbook.link.v1_3.types.PrintOptions;

/**
 * This flag notes security level attributes and is only included in the Security Message.
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class SecurityFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SecurityFlags";

    /**
     * Whether the container is stored least significant byte first.
     *
     * <p>A bitfield container carries an endianness trait only when the model states one; absent that, the bitfield convention of least significant byte first applies.</p>
     */
    public static final boolean LITTLE_ENDIAN = false;

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
     * 15c2-11 "PiggyBack" exempt security status flag.
     *
     * @return bit 0 of the container
     */
    public boolean piggybackFlag() {
        return (value & 1L) != 0L;
    }

    /**
     * Indicates whether a Caveat Emptor warning has been applied to the security.
     *
     * @return bit 1 of the container
     */
    public boolean caveatFlag() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * "144A QIB Only" in the PDF. Indicates that the security may only be purchased or sold by Qualified Institutional Buyers (QIBs) or agents acting on behalf of QIBs.
     *
     * @return bit 2 of the container
     */
    public boolean qibOnly144A() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Indicates if a security may only be quoted Unsolicited.
     *
     * @return bit 3 of the container
     */
    public boolean unsolicitedOnlyFlag() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Indicates if security participates in the OTC Link Closing Cross Auction.
     *
     * @return bit 4 of the container
     */
    public boolean closingCrossAuction() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Reserved.
     *
     * @return bits 5 through 15 of the container
     */
    public int reserved() {
        return (int) ((value >>> 5) & 0x7FFL);
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
        if (!(other instanceof SecurityFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
