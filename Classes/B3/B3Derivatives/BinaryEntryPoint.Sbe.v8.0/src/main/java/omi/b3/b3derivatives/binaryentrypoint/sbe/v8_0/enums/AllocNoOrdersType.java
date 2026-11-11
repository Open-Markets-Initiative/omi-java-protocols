package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * allocNoOrdersType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllocNoOrdersType {

    /**
     * NOT_SPECIFIED
     */
    NOT_SPECIFIED('0', "NOT_SPECIFIED");

    private final char wire;

    private final String description;

    AllocNoOrdersType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<AllocNoOrdersType> fromWire(char wire) {
        return wire == '0' ? Optional.of(NOT_SPECIFIED) : Optional.empty();
    }
}
