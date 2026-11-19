package omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * Better-priced responses will be matched by the Contra side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AutoMatch {

    /**
     * Disabled Default
     */
    DISABLED_DEFAULT('0', "Disabled Default"),

    /**
     * Market
     */
    MARKET('1', "Market"),

    /**
     * Limit
     */
    LIMIT('2', "Limit");

    private final char wire;

    private final String description;

    AutoMatch(char wire, String description) {
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
    public static Optional<AutoMatch> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DISABLED_DEFAULT);
            case '1' -> Optional.of(MARKET);
            case '2' -> Optional.of(LIMIT);
            default -> Optional.empty();
        };
    }
}
