package omi.zerocopy.iex.iexequities.tops.iextp.v1_56.types;

/**
 * A decoded message, read through the flyweight its decoder wrapped.
 */
public interface Message {

    /**
     * Gets the message's name.
     *
     * @return its name in the specification
     */
    String name();

    /**
     * Gets the fixed length of the message.
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
