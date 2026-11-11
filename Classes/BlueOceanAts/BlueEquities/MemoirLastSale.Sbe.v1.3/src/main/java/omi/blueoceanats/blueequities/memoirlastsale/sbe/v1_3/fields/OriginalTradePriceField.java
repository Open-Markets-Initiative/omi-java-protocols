package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.ByteOps;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.FieldKind;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.PrintOptions;

/**
 * The original price of the trade being corrected, a signed mantissa scaled by a constant exponent of -6
 *
 * <p>Fixed-point decimal: a raw 8-byte big-endian signed integer scaled by 10^-6.</p>
 */
public final class OriginalTradePriceField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This field's declared name.
     */
    public static final String NAME = "OriginalTradePrice";

    /**
     * Whether the wire value is stored least significant byte first.
     */
    public static final boolean LITTLE_ENDIAN = false;

    /**
     * The number of implied decimal places the wire integer is scaled by.
     */
    public static final int SCALE = 6;

    private BigDecimal value;

    /**
     * The undecoded wire value, retained so the field re-encodes exactly as it arrived.
     */
    private long rawValue;

    /**
     * Returns the decoded value, scaled by the implied decimal places.
     *
     * @return the decoded value, or null when the field has not decoded
     */
    public BigDecimal value() {
        return value;
    }

    /**
     * Sets the value, deriving the wire integer from it.
     *
     * @param value the value to encode
     * @throws ArithmeticException when the value has more decimal places than the field's scale, or does not fit the field's width
     */
    public void value(BigDecimal value) {
        this.value = value;
        this.rawValue = value == null ? 0L : value.setScale(SCALE, RoundingMode.UNNECESSARY).unscaledValue().longValueExact();
        markSet(value != null);
    }

    /**
     * Returns the undecoded wire value.
     *
     * @return the value exactly as it appeared on the wire
     */
    public long rawValue() {
        return rawValue;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.DECIMAL;
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

        this.rawValue = ByteOps.signed(data, offset, BYTE_LENGTH, LITTLE_ENDIAN);
        this.value = BigDecimal.valueOf(rawValue, SCALE);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        ByteOps.put(data, offset, BYTE_LENGTH, rawValue, LITTLE_ENDIAN);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = null;
        this.rawValue = 0L;
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append(value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginalTradePriceField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && rawValue == field.rawValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), rawValue);
    }
}
