package omi.otcmarkets.linkats.multicast.link.v4_3.fields;

import java.util.Objects;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.ByteOps;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.FieldKind;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Notes security level attributes
 *
 * <p>A 2-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class ExtendedSecurityFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 2;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ExtendedSecurityFlags";

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
     * Rule 15c2-11 “Piggyback” exempt security status flag.
     *
     * @return bit 0 of the container
     */
    public boolean piggyback() {
        return (value & 1L) != 0L;
    }

    /**
     * Indicates whether a Caveat Emptor warning has been applied to the security.
     *
     * @return bit 1 of the container
     */
    public boolean caveatEmptorWarning() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Indicates if the security may only be quoted unsolicited for Qualified Institutional Buyers.
     *
     * @return bit 2 of the container
     */
    public boolean qualifiedInstitutionalBuyersOnly() {
        return ((value >>> 2) & 1L) != 0L;
    }

    /**
     * Indicates if the security may only be quoted unsolicited.
     *
     * @return bit 3 of the container
     */
    public boolean unsolicitedOnly() {
        return ((value >>> 3) & 1L) != 0L;
    }

    /**
     * Security is sponsored
     *
     * @return bit 4 of the container
     */
    public boolean sponsoredStatus() {
        return ((value >>> 4) & 1L) != 0L;
    }

    /**
     * Indicates if the security is eligible for OTC Link ECN.
     *
     * @return bit 5 of the container
     */
    public boolean otcLinkEcnEligible() {
        return ((value >>> 5) & 1L) != 0L;
    }

    /**
     * Indicates whether OTC Link messaging is disabled for the security.
     *
     * @return bit 6 of the container
     */
    public boolean otcLinkMessagingDisabled() {
        return ((value >>> 6) & 1L) != 0L;
    }

    /**
     * Indicates if a security is eligible to have their quotes saturated.
     *
     * @return bit 7 of the container
     */
    public boolean saturationEligible() {
        return ((value >>> 7) & 1L) != 0L;
    }

    /**
     * Security is investment grade
     *
     * @return bit 8 of the container
     */
    public boolean investmentGrade() {
        return ((value >>> 8) & 1L) != 0L;
    }

    /**
     * Security is trading flat
     *
     * @return bit 9 of the container
     */
    public boolean tradingFlat() {
        return ((value >>> 9) & 1L) != 0L;
    }

    /**
     * Security is callable
     *
     * @return bit 10 of the container
     */
    public boolean callable() {
        return ((value >>> 10) & 1L) != 0L;
    }

    /**
     * Reserved for future use
     *
     * @return bits 11 through 15 of the container
     */
    public int reserved() {
        return (int) ((value >>> 11) & 0x1FL);
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
        if (!(other instanceof ExtendedSecurityFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
