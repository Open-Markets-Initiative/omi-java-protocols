package omi.box.boxoptions.solamulticast.hsvf.v1_8.fields;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.FieldKind;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Indicates the expiry duration of the Improvement Phase (value is in SSCC)
 *
 * <p>A 4-byte decimal spelled in right-justified ASCII digits, scaled by 10^-2. The bytes re-encode as they arrived.</p>
 */
public final class ImprovementProcessExpiryDurationField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ImprovementProcessExpiryDuration";

    /**
     * The number of implied decimal places the digits are scaled by.
     */
    public static final int SCALE = 2;

    private BigDecimal value;

    /**
     * The characters on the wire, retained so the field re-encodes exactly as it arrived.
     */
    private final byte[] text = " ".repeat(BYTE_LENGTH).getBytes(StandardCharsets.US_ASCII);

    /**
     * Returns the decoded value, scaled by the implied decimal places.
     *
     * @return the decoded value, or null when the field has not decoded or its bytes are not a number
     */
    public BigDecimal value() {
        return value;
    }

    /**
     * Sets the value, spelling its digits right-justified behind zeros, a negative value's sign leading them.
     *
     * @param value the value to encode, or null to clear the field
     * @throws ArithmeticException when the value has more decimal places than the field's scale, or more characters than its width
     */
    public void value(BigDecimal value) {
        BigInteger unscaled = value == null ? BigInteger.ZERO : value.setScale(SCALE).unscaledValue();
        String digits = value == null ? "" : unscaled.abs().toString();
        int sign = unscaled.signum() < 0 ? 1 : 0;
        if (sign + digits.length() > BYTE_LENGTH) {
            throw new ArithmeticException(NAME + " holds " + BYTE_LENGTH + " characters, not " + (sign + digits.length()));
        }
        Arrays.fill(text, value == null ? (byte) ' ' : (byte) '0');
        if (sign == 1) {
            text[0] = (byte) '-';
        }
        byte[] spelled = digits.getBytes(StandardCharsets.US_ASCII);
        System.arraycopy(spelled, 0, text, BYTE_LENGTH - spelled.length, spelled.length);
        this.value = value;
        markSet(value != null);
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

        System.arraycopy(data, offset, text, 0, BYTE_LENGTH);
        String digits = new String(text, StandardCharsets.US_ASCII).strip();
        this.value = digits.matches("-?[0-9]+") ? new BigDecimal(new BigInteger(digits), SCALE) : null;
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        System.arraycopy(text, 0, data, offset, BYTE_LENGTH);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        this.value = null;
        Arrays.fill(text, (byte) ' ');
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append(value == null ? "'" + new String(text, StandardCharsets.US_ASCII) + "'" : value.toPlainString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImprovementProcessExpiryDurationField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Arrays.equals(text, field.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), Arrays.hashCode(text));
    }
}
