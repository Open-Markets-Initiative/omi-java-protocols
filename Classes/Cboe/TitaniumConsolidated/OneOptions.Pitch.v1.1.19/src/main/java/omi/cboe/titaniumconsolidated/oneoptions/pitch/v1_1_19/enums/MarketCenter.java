package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.enums;

import java.util.Optional;

/**
 * Market Center identifier.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCenter {

    /**
     * C 1
     */
    C1('B', "C 1"),

    /**
     * C 2
     */
    C2('W', "C 2"),

    /**
     * Edgx
     */
    EDGX('X', "Edgx"),

    /**
     * Bzx
     */
    BZX('Z', "Bzx");

    private final char wire;

    private final String description;

    MarketCenter(char wire, String description) {
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
    public static Optional<MarketCenter> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(C1);
            case 'W' -> Optional.of(C2);
            case 'X' -> Optional.of(EDGX);
            case 'Z' -> Optional.of(BZX);
            default -> Optional.empty();
        };
    }
}
