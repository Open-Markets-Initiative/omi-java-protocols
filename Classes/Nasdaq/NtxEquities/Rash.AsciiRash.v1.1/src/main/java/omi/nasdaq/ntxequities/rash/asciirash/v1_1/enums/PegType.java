package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * Peg type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PegType {

    /**
     * Midpoint
     */
    MIDPOINT('M', "Midpoint"),

    /**
     * No Peg
     */
    NO_PEG('N', "No Peg"),

    /**
     * Market
     */
    MARKET('P', "Market"),

    /**
     * Primary
     */
    PRIMARY('R', "Primary");

    private final char wire;

    private final String description;

    PegType(char wire, String description) {
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
    public static Optional<PegType> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(MIDPOINT);
            case 'N' -> Optional.of(NO_PEG);
            case 'P' -> Optional.of(MARKET);
            case 'R' -> Optional.of(PRIMARY);
            default -> Optional.empty();
        };
    }
}
