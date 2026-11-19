package omi.lseg.turquoise.replay.gtp.v24_4.fields;

import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import omi.lseg.turquoise.replay.gtp.v24_4.types.Field;
import omi.lseg.turquoise.replay.gtp.v24_4.types.FieldKind;
import omi.lseg.turquoise.replay.gtp.v24_4.types.PrintOptions;

/**
 * Date and time when the transaction was executed/agreed upon.
 *
 * <p>A date and time spelled in 27 ASCII characters as YYYY-MM-DDThh:mm:ss.ddddddZ. The bytes re-encode as they arrived.</p>
 */
public final class TradingDateAndTimeField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This field's declared name.
     */
    public static final String NAME = "TradingDateAndTime";

    /**
     * The format the date and time is spelled in.
     */
    public static final String TOKEN = "YYYY-MM-DDThh:mm:ss.ddddddZ";

    /**
     * The character written around the spelled value where the field is wider than its format.
     */
    public static final byte FILL = (byte) ' ';

    private LocalDateTime value;

    /**
     * The characters on the wire, retained so the field re-encodes exactly as it arrived.
     */
    private final byte[] text = " ".repeat(BYTE_LENGTH).getBytes(StandardCharsets.US_ASCII);

    /**
     * Returns the date and time the characters spell.
     *
     * @return the decoded value, or null when the field has not decoded or its characters are not a valid date and time
     */
    public LocalDateTime value() {
        return value;
    }

    /**
     * Sets the date and time, spelling it in the field's format. A finer fraction of a second than the format holds is cut off.
     *
     * @param value the value to encode, or null to clear the field
     * @throws ArithmeticException when a part of the value has more digits than the format holds
     */
    public void value(LocalDateTime value) {
        if (value == null) {
            Arrays.fill(text, (byte) ' ');
            this.value = null;
            markSet(false);
            return;
        }
        byte[] spelled = (digits(value.getYear(), 4) + "-" + digits(value.getMonthValue(), 2) + "-" + digits(value.getDayOfMonth(), 2) + "T" + digits(value.getHour(), 2) + ":" + digits(value.getMinute(), 2) + ":" + digits(value.getSecond(), 2) + "." + digits(value.getNano() / 1000, 6) + "Z").getBytes(StandardCharsets.US_ASCII);
        Arrays.fill(text, FILL);
        System.arraycopy(spelled, 0, text, 0, spelled.length);
        this.value = read(text);
        markSet(true);
    }

    /**
     * Reads the date and time the characters spell.
     *
     * @param text the characters on the wire
     * @return the date and time, or null when the characters are not a valid one
     */
    private static LocalDateTime read(byte[] text) {
        String spelled = new String(text, StandardCharsets.US_ASCII);
        if (!spelled.matches("[0-9][0-9][0-9][0-9][-][0-9][0-9][-][0-9][0-9][T][0-9][0-9][:][0-9][0-9][:][0-9][0-9][.][0-9][0-9][0-9][0-9][0-9][0-9][Z]")) {
            return null;
        }
        try {
            return LocalDateTime.of(part(spelled, 0, 4), part(spelled, 5, 2), part(spelled, 8, 2), part(spelled, 11, 2), part(spelled, 14, 2), part(spelled, 17, 2), part(spelled, 20, 6) * 1000);
        } catch (DateTimeException invalid) {
            return null;
        }
    }

    /**
     * Reads the number a part of the spelled value states.
     *
     * @param spelled the spelled value, its digits checked
     * @param start where the part starts
     * @param digits the digits of the part
     * @return the number
     */
    private static int part(String spelled, int start, int digits) {
        return Integer.parseInt(spelled, start, start + digits, 10);
    }

    /**
     * Spells a part of the value in its digits, zeros before it.
     *
     * @param number the number the part states
     * @param digits the digits of the part
     * @return the digits
     * @throws ArithmeticException when the number is negative or has more digits than the part
     */
    private static String digits(int number, int digits) {
        String spelled = Integer.toString(number);
        if (number < 0 || spelled.length() > digits) {
            throw new ArithmeticException(NAME + " cannot spell " + number + " in " + digits + " digits of " + TOKEN);
        }
        return "0".repeat(digits - spelled.length()) + spelled;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.CLOCK;
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
        this.value = read(text);
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
        if (!(other instanceof TradingDateAndTimeField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Arrays.equals(text, field.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), Arrays.hashCode(text));
    }
}
