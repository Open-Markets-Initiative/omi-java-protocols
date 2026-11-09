package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.fields;

import java.util.Objects;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.ByteOps;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.Field;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.FieldKind;
import omi.miax.pearlequities.depthofmarket.mach.v1_3_d.types.PrintOptions;

/**
 * Trade flags. Bit 0 indicates SIP reportability; bit 1 indicates Retail Trade participation; bits 2-7 are reserved.
 *
 * <p>A 1-byte packed bitfield; each accessor masks its own bit range out of the container.</p>
 */
public final class TradeFlagsField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradeFlags";

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
     * 0 - Not reportable to the SIP; 1 - Reportable to the SIP.
     *
     * @return bit 0 of the container
     */
    public boolean sipReporting() {
        return (value & 1L) != 0L;
    }

    /**
     * 0 - Neither side is Retail; 1 - At least one side is Retail.
     *
     * @return bit 1 of the container
     */
    public boolean retailTradeIndicator() {
        return ((value >>> 1) & 1L) != 0L;
    }

    /**
     * Reserved for future use.
     *
     * @return bits 2 through 7 of the container
     */
    public int reserved() {
        return (int) ((value >>> 2) & 0x3FL);
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
        if (!(other instanceof TradeFlagsField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && value == field.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), value);
    }
}
