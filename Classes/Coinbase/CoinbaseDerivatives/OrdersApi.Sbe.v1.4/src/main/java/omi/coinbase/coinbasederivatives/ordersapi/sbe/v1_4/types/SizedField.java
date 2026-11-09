package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

/**
 * A field whose width is read at runtime rather than fixed by the protocol.
 *
 * <p>It holds a copy of its bytes, so a reused buffer cannot change what encodes. Its record's
 * encode writes any length field from this width.</p>
 */
public final class SizedField extends Field {

    /** This field's declared name. */
    private final String name;

    /** Whether this field carries text rather than raw bytes. */
    private final boolean text;

    /** This field's bytes. */
    private byte[] value = new byte[0];

    /**
     * Creates an empty field.
     *
     * @param name this field's declared name
     * @param text whether it carries text
     */
    public SizedField(String name, boolean text) {
        this.name = name;
        this.text = text;
    }


    @Override
    public String name() {
        return name;
    }


    @Override
    public FieldKind kind() {
        return text ? FieldKind.STRING : FieldKind.STRUCT;
    }


    @Override
    public int byteLength() {
        return value.length;
    }


    @Override
    public boolean parse(byte[] data, int offset) {
        return parse(data, offset, (long) data.length - offset, data.length);
    }


    /**
     * Decodes this field from the bytes a length gives it.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this field's first byte
     * @param length the width to read
     * @param end    the index just past the last byte this field may read
     * @return true when the field decoded; a negative length, or one past the end, is refused
     */
    public boolean parse(byte[] data, int offset, long length, int end) {
        if (offset < 0 || end > data.length || length < 0 || length > end - offset) {
            return false;
        }
        value = Arrays.copyOfRange(data, offset, offset + (int) length);
        markDecoded(data, offset);
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, value.length, data.length);
        System.arraycopy(value, 0, data, offset, value.length);
        return offset + value.length;
    }


    /**
     * Returns a copy of this field's bytes.
     *
     * @return the bytes, empty when the field holds none
     */
    public byte[] value() {
        return value.clone();
    }

    /**
     * Sets the bytes to encode, copying them.
     *
     * @param value the bytes to encode
     */
    public void value(byte[] value) {
        this.value = value.clone();
        markSet(true);
    }

    /**
     * Returns this field's bytes as text.
     *
     * @return the text, one character per byte
     */
    public String text() {
        return new String(value, StandardCharsets.ISO_8859_1);
    }

    @Override
    public void reset() {
        super.reset();
        value = new byte[0];
    }


    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        builder.append(name).append(": ");
        if (!hasValue()) {
            builder.append("<unset>");
            return;
        }

        if (text) {
            builder.append('\'').append(text()).append('\'');
            return;
        }

        builder.append(ByteOps.hex(value, 0, value.length));
    }


    @Override
    public boolean equals(Object other) {
        return other instanceof SizedField field && hasValue() == field.hasValue() && Arrays.equals(value, field.value);
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

}
