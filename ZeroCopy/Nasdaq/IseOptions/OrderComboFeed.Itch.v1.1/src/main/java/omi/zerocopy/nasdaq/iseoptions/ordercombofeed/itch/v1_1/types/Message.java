package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types;

/**
 * A decoded message, a view of its bytes.
 */
public interface Message {

    /**
     * Gets the message's name.
     *
     * @return its name in the specification
     */
    String name();

    /**
     * Gets the length of the message, which a repeating group's count makes vary.
     *
     * @return its length in bytes
     */
    int byteLength();

    /**
     * Appends the message's fields, allocating nothing beyond what the builder grows by.
     *
     * @param builder where the fields are appended
     * @return the builder
     */
    StringBuilder dump(StringBuilder builder);
}
