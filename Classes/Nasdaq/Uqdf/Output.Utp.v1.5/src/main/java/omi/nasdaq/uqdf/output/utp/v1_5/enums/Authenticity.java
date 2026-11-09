package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Authenticity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Authenticity {

    /**
     * Production
     */
    PRODUCTION('P', "Production"),

    /**
     * Test
     */
    TEST('T', "Test"),

    /**
     * Demo
     */
    DEMO('D', "Demo"),

    /**
     * Deleted
     */
    DELETED('X', "Deleted");

    private final char wire;

    private final String description;

    Authenticity(char wire, String description) {
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
    public static Optional<Authenticity> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRODUCTION);
            case 'T' -> Optional.of(TEST);
            case 'D' -> Optional.of(DEMO);
            case 'X' -> Optional.of(DELETED);
            default -> Optional.empty();
        };
    }
}
