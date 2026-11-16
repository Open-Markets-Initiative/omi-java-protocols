package omi.zerocopyflyweight.iex.iexequities.deep.iextp.v1_08.types;

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
