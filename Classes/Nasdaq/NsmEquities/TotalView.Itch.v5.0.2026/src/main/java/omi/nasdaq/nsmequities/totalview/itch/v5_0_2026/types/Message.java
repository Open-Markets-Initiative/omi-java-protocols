package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * A parsed protocol message.
 *
 * <p>Implementations are mutable and are reused across parses. They are not
 * thread-safe.</p>
 */
public interface Message {

    /**
     * Returns the character that identifies this message type on the wire.
     *
     * @return the type character, or empty when the protocol declares none
     */
    Optional<Character> type();

    /**
     * Returns this message's fixed width on the wire.
     *
     * @return the width in bytes
     */
    int byteLength();

    /**
     * Returns this message's timestamp.
     *
     * @return the timestamp, or empty when the message carries no timestamp field
     */
    Optional<Instant> timestamp();

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * @return the message bytes, or empty when no decode has occurred
     */
    Optional<byte[]> raw();

    /**
     * Returns whether this message decoded from a buffer without running out of bytes.
     *
     * <p>False for a message assembled from values rather than read off the wire, which
     * is still {@link #isValid()}. Test this only when the provenance of the bytes
     * matters.</p>
     *
     * @return true when the message decoded structurally
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
     * <p>True for a message read off the wire and for one assembled from values, so it
     * is the test to make before encoding. It does not ask where the values came
     * from — {@link #isDecoded()} does.</p>
     *
     * @return true when the message is complete and every value is declared
     */
    boolean isValid();

    /**
     * Returns the first field that failed to decode.
     *
     * @return the failing field, or empty when the last decode succeeded or none was attempted
     */
    Optional<Field> failedAt();

    /**
     * Decodes this message from a buffer, reusing the existing field instances.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this message's first byte
     * @return true when every field decoded
     */
    boolean parseFrom(byte[] data, int offset);

    /**
     * Encodes this message into a buffer, writing nothing when it does not fit.
     *
     * @param data   the buffer to encode into
     * @param offset the index of this message's first byte
     * @return the index just past the encoded message
     * @throws IndexOutOfBoundsException when the message does not fit at offset
     */
    int encode(byte[] data, int offset);

    /**
     * Encodes this message into a newly allocated buffer.
     *
     * @return the encoded bytes
     */
    byte[] toBytes();

    /**
     * Resets every field and clears the decoded state.
     */
    void clear();

    /**
     * Returns this message's fields in wire order.
     *
     * @return the fields, in declaration order
     */
    List<Field> fields();

    /**
     * Returns a field by its declared name.
     *
     * @param name the declared field name
     * @return the field, or empty when this message declares no such field
     */
    Optional<Field> field(String name);

    /**
     * Returns the fields whose decoded values differ from another message of the same type.
     *
     * @param other the message to compare against
     * @return this message's differing fields, empty when the other is of a different type
     */
    List<Field> diffFields(Message other);

    /**
     * Returns this message's formatted representation.
     *
     * @param options the display options
     * @return the formatted text
     */
    String toFormattedString(PrintOptions options);

    /**
     * Appends this message's formatted representation.
     *
     * @param builder the destination
     * @param options the display options
     */
    void toFormattedString(StringBuilder builder, PrintOptions options);
}
