package omi.otcmarkets.linkats.multicast.link.v4_3.fields;

import java.util.Objects;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.ByteOps;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.FieldKind;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Notes security level attributes
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class SecurityFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "SecurityFlags";

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
     * Indicates if the security is quoted on the OTC Bulletin Board interdealer quotation system.
     *
     * @return bit 4 of the container
     */
    public boolean bbQuoted() {
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
