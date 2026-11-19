package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.enums;

import java.util.Optional;

/**
 * Whether the cross has been extended
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Extension {

    /**
     * Cross Extension
     */
    CROSS_EXTENSION('E', "Cross Extension");

    private final char wire;

    private final String description;

    Extension(char wire, String description) {
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
    public static Optional<Extension> fromWire(char wire) {
        return wire == 'E' ? Optional.of(CROSS_EXTENSION) : Optional.empty();
    }
}
