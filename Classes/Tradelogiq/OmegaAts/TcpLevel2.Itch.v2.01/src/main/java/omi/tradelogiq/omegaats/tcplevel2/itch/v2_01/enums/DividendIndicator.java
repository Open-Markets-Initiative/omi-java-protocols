package omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Dividend frequency of the security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DividendIndicator {

    /**
     * Annual
     */
    ANNUAL('A', "Annual"),

    /**
     * Semi Annual
     */
    SEMI_ANNUAL('S', "Semi Annual"),

    /**
     * Quarterly
     */
    QUARTERLY('Q', "Quarterly"),

    /**
     * Monthly
     */
    MONTHLY('M', "Monthly");

    private final char wire;

    private final String description;

    DividendIndicator(char wire, String description) {
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
    public static Optional<DividendIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ANNUAL);
            case 'S' -> Optional.of(SEMI_ANNUAL);
            case 'Q' -> Optional.of(QUARTERLY);
            case 'M' -> Optional.of(MONTHLY);
            default -> Optional.empty();
        };
    }
}
