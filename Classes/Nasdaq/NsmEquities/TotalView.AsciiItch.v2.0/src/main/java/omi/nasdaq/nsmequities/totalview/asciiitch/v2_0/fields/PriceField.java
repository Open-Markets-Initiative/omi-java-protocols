package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.fields;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.types.Field;
import omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.types.FieldKind;
import omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.types.PrintOptions;

/**
 * The limit price of the order.
 *
 * <p>A 10-byte decimal spelled in right-justified ASCII digits, scaled by 10^-4. The bytes re-encode as they arrived.</p>
 */
public final class PriceField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 10;

    /**
     * This field's declared name.
     */
    public static final String NAME = "Price";

    /**
     * The number of implied decimal places the digits are scaled by.
     */
    public static final int SCALE = 4;

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
     * Sets the value, spelling its digits right-justified.
     *
     * @param value the value to encode, or null to clear the field
     * @throws ArithmeticException when the value has more decimal places than the field's scale, or more digits than its width
     */
    public void value(BigDecimal value) {
        String digits = value == null ? "" : value.setScale(SCALE).unscaledValue().toString();
        if (digits.length() > BYTE_LENGTH) {
            throw new ArithmeticException(NAME + " holds " + BYTE_LENGTH + " characters, not " + digits.length());
        }
        Arrays.fill(text, (byte) ' ');
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
        if (!(other instanceof PriceField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Arrays.equals(text, field.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), Arrays.hashCode(text));
    }
}
