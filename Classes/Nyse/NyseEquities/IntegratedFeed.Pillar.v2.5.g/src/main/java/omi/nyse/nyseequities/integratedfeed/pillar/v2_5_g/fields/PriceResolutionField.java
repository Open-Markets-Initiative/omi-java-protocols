package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.fields;

import java.util.Objects;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.enums.PriceResolution;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.ByteOps;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.Field;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.FieldKind;
import omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.types.PrintOptions;

/**
 * Minimum price increment: 0 - All Penny, 1 - Penny/Nickel, 5 - Nickel/Dime.
 */
public final class PriceResolutionField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1;

    /**
     * This field's declared name.
     */
    public static final String NAME = "PriceResolution";

    private PriceResolution value;

    /**
     * The undecoded wire value, retained so the field re-encodes exactly as it arrived.
     */
    private short rawValue;

    /**
     * Returns the declared value this field decoded to.
     *
     * @return the decoded value, or null when the field has not decoded or holds an undeclared value
     */
    public PriceResolution value() {
        return value;
    }

    /**
     * Sets the value, deriving the wire encoding from it.
     *
     * @param value the value to encode, or null to clear the field
     */
    public void value(PriceResolution value) {
        this.value = value;
        this.rawValue = value == null ? (short) 0 : value.wire();
        markSet(value != null);
    }

    /**
     * Returns the undecoded wire value.
     *
     * @return the value exactly as it appeared on the wire
     */
    public short rawValue() {
        return rawValue;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.ENUM;
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

        this.rawValue = (short) ByteOps.unsigned(data, offset, BYTE_LENGTH, false);
        this.value = PriceResolution.fromWire(rawValue).orElse(null);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, rawValue, false);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = null;
        this.rawValue = (short) 0;
    }

    /**
     * Returns whether the decoded wire value is one the protocol declares.
     *
     * <p>An undeclared value still decodes: the wire encoding is available from {@link #rawValue()} and re-encodes unchanged.</p>
     *
     * @return true when the value is a declared one
     */
    @Override
    public boolean isRecognized() {
        return hasValue() && value != null;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        if (value == null) {
            builder.append("<undeclared ").append(rawValue).append('>');
        } else {
            builder.append(value.name());
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceResolutionField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && rawValue == field.rawValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), rawValue);
    }
}
