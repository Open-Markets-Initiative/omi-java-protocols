package omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.FieldKind;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Ask Price for the future contract For Implied, it represents the best (1st limit) indicative implied ask price
 *
 * <p>A 7-digit whole number spelled in right-justified ASCII digits. The bytes re-encode as they arrived.</p>
 */
public final class RawAskPriceFuturesDepthNumericField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This field's declared name.
     */
    public static final String NAME = "RawAskPriceFuturesDepthNumeric";

    /**
     * The character the digits are right-justified behind.
     */
    public static final byte FILL = (byte) '0';

    private Long value;

    /**
     * The characters on the wire, retained so the field re-encodes exactly as it arrived.
     */
    private final byte[] text = " ".repeat(BYTE_LENGTH).getBytes(StandardCharsets.US_ASCII);

    /**
     * Returns the number the digits spell.
     *
     * @return the decoded value, or null when the field has not decoded or its bytes are not digits
     */
    public Long value() {
        return value;
    }

    /**
     * Sets the value, spelling its digits right-justified behind the fill.
     *
     * @param value the value to encode, or null to clear the field
     * @throws IllegalArgumentException when the value is negative, as digits are unsigned
     * @throws ArithmeticException when the value has more digits than the field's width
     */
    public void value(Long value) {
        if (value != null && value < 0) {
            throw new IllegalArgumentException(NAME + " holds digits only, not " + value);
        }
        String digits = value == null ? "" : value.toString();
        if (digits.length() > BYTE_LENGTH) {
            throw new ArithmeticException(NAME + " holds " + BYTE_LENGTH + " digits, not " + digits.length());
        }
        Arrays.fill(text, value == null ? (byte) ' ' : FILL);
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
        return FieldKind.UNSIGNED_INTEGER;
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
        this.value = digits.matches("[0-9]+") ? Long.valueOf(digits) : null;
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

        builder.append(value == null ? "'" + new String(text, StandardCharsets.US_ASCII) + "'" : value.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawAskPriceFuturesDepthNumericField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Arrays.equals(text, field.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), Arrays.hashCode(text));
    }
}
