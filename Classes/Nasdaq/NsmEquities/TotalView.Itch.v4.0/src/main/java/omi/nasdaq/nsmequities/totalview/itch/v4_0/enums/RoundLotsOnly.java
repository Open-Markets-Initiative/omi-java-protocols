package omi.nasdaq.nsmequities.totalview.itch.v4_0.enums;

import java.util.Optional;

/**
 * Indicates if NASDAQ system limits order entry for issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoundLotsOnly {

    /**
     * Only round lots are accepted in this stock
     */
    ROUND_LOTS_ONLY('Y', "Only round lots are accepted in this stock"),

    /**
     * Odd/mixed lots are allowed
     */
    ODD_MIXED_LOTS_ALLOWED('N', "Odd/mixed lots are allowed");

    private final char wire;

    private final String description;

    RoundLotsOnly(char wire, String description) {
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
    public static Optional<RoundLotsOnly> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ROUND_LOTS_ONLY);
            case 'N' -> Optional.of(ODD_MIXED_LOTS_ALLOWED);
            default -> Optional.empty();
        };
    }
}
