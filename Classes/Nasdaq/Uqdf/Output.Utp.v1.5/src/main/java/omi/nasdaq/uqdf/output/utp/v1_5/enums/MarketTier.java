package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Market Tier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketTier {

    /**
     * Nasdaq Global Select Market
     */
    NASDAQ_GLOBAL_SELECT_MARKET('Q', "Nasdaq Global Select Market"),

    /**
     * Nasdaq Global Market
     */
    NASDAQ_GLOBAL_MARKET('G', "Nasdaq Global Market"),

    /**
     * Nasdaq Capital Market
     */
    NASDAQ_CAPITAL_MARKET('S', "Nasdaq Capital Market");

    private final char wire;

    private final String description;

    MarketTier(char wire, String description) {
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
    public static Optional<MarketTier> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(NASDAQ_GLOBAL_SELECT_MARKET);
            case 'G' -> Optional.of(NASDAQ_GLOBAL_MARKET);
            case 'S' -> Optional.of(NASDAQ_CAPITAL_MARKET);
            default -> Optional.empty();
        };
    }
}
