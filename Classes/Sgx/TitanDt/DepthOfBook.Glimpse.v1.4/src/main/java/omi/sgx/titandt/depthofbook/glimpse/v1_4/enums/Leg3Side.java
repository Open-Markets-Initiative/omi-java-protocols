package omi.sgx.titandt.depthofbook.glimpse.v1_4.enums;

import java.util.Optional;

/**
 * Leg side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Leg3Side {

    /**
     * As Defined
     */
    AS_DEFINED('B', "As Defined"),

    /**
     * Opposite
     */
    OPPOSITE('C', "Opposite");

    private final char wire;

    private final String description;

    Leg3Side(char wire, String description) {
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
    public static Optional<Leg3Side> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(AS_DEFINED);
            case 'C' -> Optional.of(OPPOSITE);
            default -> Optional.empty();
        };
    }
}
