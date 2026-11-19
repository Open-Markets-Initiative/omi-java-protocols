package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the AutoMatch values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AutoMatch {

    /**
     * Disabled (Default)
     */
    DISABLED('0', "Disabled (Default)"),

    /**
     * Market
     */
    MARKET_1('1', "Market"),

    /**
     * Limit
     */
    LIMIT_2('2', "Limit"),

    /**
     * Market. No starting price adjustments.
     */
    MARKET_3('3', "Market. No starting price adjustments."),

    /**
     * Limit. No starting price adjustments.
     */
    LIMIT_4('4', "Limit. No starting price adjustments.");

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
            case '0' -> Optional.of(DISABLED);
            case '1' -> Optional.of(MARKET_1);
            case '2' -> Optional.of(LIMIT_2);
            case '3' -> Optional.of(MARKET_3);
            case '4' -> Optional.of(LIMIT_4);
            default -> Optional.empty();
        };
    }
}
