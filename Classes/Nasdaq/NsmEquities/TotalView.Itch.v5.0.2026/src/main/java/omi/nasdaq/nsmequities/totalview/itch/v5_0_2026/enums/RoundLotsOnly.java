package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.enums;

import java.util.Optional;

/**
 * Indicates if Nasdaq system limits order entry for issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoundLotsOnly {

    /**
     * Nasdaq system only accepts round lot orders for this security
     */
    YES('Y', "Nasdaq system only accepts round lot orders for this security"),

    /**
     * Nasdaq system does not have any order size restrictions for this security
     */
    NO('N', "Nasdaq system does not have any order size restrictions for this security");

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
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
