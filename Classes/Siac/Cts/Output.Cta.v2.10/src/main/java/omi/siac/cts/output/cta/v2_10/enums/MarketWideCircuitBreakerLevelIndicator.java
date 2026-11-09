package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Identifies the daily established drop level value associated with decline Level 1: 7% of Previous Close SP 500 Value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketWideCircuitBreakerLevelIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Level 1 Breached
     */
    LEVEL_1_BREACHED('1', "Level 1 Breached"),

    /**
     * Level 2 Breached
     */
    LEVEL_2_BREACHED('2', "Level 2 Breached"),

    /**
     * Level 3 Breached
     */
    LEVEL_3_BREACHED('3', "Level 3 Breached");

    private final char wire;

    private final String description;

    MarketWideCircuitBreakerLevelIndicator(char wire, String description) {
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
    public static Optional<MarketWideCircuitBreakerLevelIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case '1' -> Optional.of(LEVEL_1_BREACHED);
            case '2' -> Optional.of(LEVEL_2_BREACHED);
            case '3' -> Optional.of(LEVEL_3_BREACHED);
            default -> Optional.empty();
        };
    }
}
