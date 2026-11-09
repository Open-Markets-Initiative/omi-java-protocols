package omi.ice.icefutures.mdf.impact.v1_1_33.types;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * The record of a case this library does not declare: the bytes its stated width gives it, kept whole.
 *
 * <p>A branch holds one when its key names no case it knows and the wire states how wide the case is, so a
 * newer sender's case is stepped over and encodes back as it arrived.</p>
 */
public final class RawRecord implements GroupEntry {

    /** This record's declared name. */
    public static final String NAME = "Unknown";

    /** The bytes the record holds. */
    private final SizedField bytes = new SizedField(NAME, false);

    /** The fields of the record: its bytes. */
    private final List<Field> fields = List.of(bytes);

    /**
     * Returns the bytes the record holds.
     *
     * @return the field holding them
     */
    public SizedField bytes() {
        return bytes;
    }

    @Override
    public int byteLength() {
        return bytes.byteLength();
    }


    @Override
    public Optional<byte[]> raw() {
        return bytes.isDecoded() ? Optional.of(bytes.value()) : Optional.empty();
    }


    @Override
    public boolean isDecoded() {
        return bytes.isDecoded();
    }


    @Override
    public boolean isRecognized() {
        return false;
    }


    @Override
    public boolean isValid() {
        return bytes.hasValue();
    }


    @Override
    public Optional<Field> failedAt() {
        return bytes.hasValue() ? Optional.empty() : Optional.of(bytes);
    }


    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }


    /**
     * Decodes every byte up to the end it is given, which the wire states.
     *
     * @param data   the buffer to decode from
     * @param offset the index of the first byte
     * @param end    the index just past the last byte
     * @return true when the bytes were in range
     */
    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        return bytes.parse(data, offset, (long) end - offset, end);
    }


    @Override
    public int encode(byte[] data, int offset) {
        return bytes.encode(data, offset);
    }


    @Override
    public byte[] toBytes() {
        return bytes.value();
    }


    @Override
    public void clear() {
        bytes.reset();
    }


    @Override
    public List<Field> fields() {
        return fields;
    }


    @Override
    public Optional<Field> field(String name) {
        return NAME.equals(name) ? Optional.of(bytes) : Optional.empty();
    }


    @Override
    public List<Field> diffFields(GroupEntry other) {
        return other instanceof RawRecord record && record.bytes.equals(bytes) ? List.of() : fields;
    }


    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }


    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }
        bytes.toFormattedString(builder, options);
    }


    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }


    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof RawRecord record && record.bytes.equals(bytes);
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes.value());
    }

}
