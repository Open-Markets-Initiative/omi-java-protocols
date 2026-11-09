package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types;

import java.util.List;
import java.util.Optional;

/**
 * A record a message holds: one entry of a repeating group, or a nested group.
 *
 * <p>Implementations are mutable and are not thread-safe.</p>
 */
public interface GroupEntry {

    /**
     * Returns this entry's width on the wire.
     *
     * @return the width in bytes
     */
    int byteLength();

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * @return the entry bytes, or empty when no decode has occurred
     */
    Optional<byte[]> raw();

    /**
     * Returns whether this entry decoded from a buffer without running out of bytes.
     *
     * <p>False for an entry assembled from values rather than read off the wire, which
     * is still {@link #isValid()}. Test this only when the provenance of the bytes
     * matters.</p>
     *
     * @return true when the entry decoded structurally
     */
    boolean isDecoded();

    /**
     * Returns whether every field holds a value the protocol declares.
     *
     * @return true when no field is missing a value or holds an undeclared one
     */
    boolean isRecognized();

    /**
     * Returns whether every field holds a declared value.
     *
     * <p>True for an entry read off the wire and for one assembled from values, so it
     * is the test to make before encoding. It does not ask where the values came
     * from — {@link #isDecoded()} does.</p>
     *
     * @return true when the entry is complete and every value is declared
     */
    boolean isValid();

    /**
     * Returns the first field that failed to decode.
     *
     * @return the failing field, or empty when the last decode succeeded or none was attempted
     */
    Optional<Field> failedAt();

    /**
     * Decodes this entry from a buffer, reusing the existing field instances.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @return true when every field decoded
     */
    boolean parseFrom(byte[] data, int offset);

    /**
     * Decodes this entry from the bytes it is given, reusing the existing field instances. A entry reads what its
     * layout says, whether or not that reaches {@code end}.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @return true when every field decoded
     */
    boolean parseFrom(byte[] data, int offset, int end);

    /**
     * Encodes this entry into a buffer, writing nothing when it does not fit.
     *
     * @param data   the buffer to encode into
     * @param offset the index of this entry's first byte
     * @return the index just past the encoded entry
     * @throws IndexOutOfBoundsException when the entry does not fit at offset
     */
    int encode(byte[] data, int offset);

    /**
     * Encodes this entry into a newly allocated buffer.
     *
     * @return the encoded bytes
     */
    byte[] toBytes();

    /**
     * Resets every field and clears the decoded state.
     */
    void clear();

    /**
     * Returns this entry's fields in wire order.
     *
     * @return the fields, in declaration order
     */
    List<Field> fields();

    /**
     * Returns a field by its declared name.
     *
     * @param name the declared field name
     * @return the field, or empty when this entry declares no such field
     */
    Optional<Field> field(String name);

    /**
     * Returns the fields whose decoded values differ from another entry of the same type.
     *
     * @param other the entry to compare against
     * @return this entry's differing fields, empty when the other is of a different type
     */
    List<Field> diffFields(GroupEntry other);

    /**
     * Returns this entry's formatted representation.
     *
     * @param options the display options
     * @return the formatted text
     */
    String toFormattedString(PrintOptions options);

    /**
     * Appends this entry's formatted representation.
     *
     * @param builder the destination
     * @param options the display options
     */
    void toFormattedString(StringBuilder builder, PrintOptions options);
}
