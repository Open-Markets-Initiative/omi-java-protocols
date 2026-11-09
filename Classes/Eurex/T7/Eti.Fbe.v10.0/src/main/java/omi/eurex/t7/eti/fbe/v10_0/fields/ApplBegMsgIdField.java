package omi.eurex.t7.eti.fbe.v10_0.fields;

import java.util.Arrays;
import java.util.Objects;
import omi.eurex.t7.eti.fbe.v10_0.types.ByteOps;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.FieldKind;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Appl Beg Msg Id
 *
 * <p>An opaque 16-byte field carried as raw bytes.</p>
 */
public final class ApplBegMsgIdField extends Field {

    /**
     * This field's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 16;

    /**
     * This field's declared name.
     */
    public static final String NAME = "ApplBegMsgId";

    private byte[] value = new byte[BYTE_LENGTH];

    /**
     * Returns a copy of this field's bytes.
     *
     * @return the bytes, zero when the field holds no value
     */
    public byte[] value() {
        return value.clone();
    }

    /**
     * Sets the bytes to encode, copying them.
     *
     * @param value the bytes to encode
     * @throws IllegalArgumentException when they are not this field's width
     */
    public void value(byte[] value) {
        if (value.length != BYTE_LENGTH) {
            throw new IllegalArgumentException(NAME + " is " + BYTE_LENGTH + " bytes, not " + value.length);
        }
        System.arraycopy(value, 0, this.value, 0, BYTE_LENGTH);
        markSet(true);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public FieldKind kind() {
        return FieldKind.STRUCT;
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

        System.arraycopy(data, offset, value, 0, BYTE_LENGTH);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        System.arraycopy(value, 0, data, offset, BYTE_LENGTH);
        return offset + BYTE_LENGTH;
    }

    @Override
    public void reset() {
        super.reset();
        Arrays.fill(value, (byte) 0);
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(NAME).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        builder.append(ByteOps.hex(value, 0, BYTE_LENGTH));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplBegMsgIdField field)) {
            return false;
        }
        return hasValue() == field.hasValue() && Arrays.equals(value, field.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasValue(), Arrays.hashCode(value));
    }
}
