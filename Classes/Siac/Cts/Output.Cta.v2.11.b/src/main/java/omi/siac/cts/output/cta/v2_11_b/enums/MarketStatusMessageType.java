package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the type of Market Status message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketStatusMessageType {

    /**
     * Market Wide Circuit Breaker Decline Level Status
     */
    MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS('K', "Market Wide Circuit Breaker Decline Level Status"),

    /**
     * Market Wide Circuit Breaker Status
     */
    MARKET_WIDE_CIRCUIT_BREAKER_STATUS('L', "Market Wide Circuit Breaker Status"),

    /**
     * Approximate Adjusted Volume Market Center
     */
    APPROXIMATE_ADJUSTED_VOLUME_MARKET_CENTER('N', "Approximate Adjusted Volume Market Center"),

    /**
     * Fractional Approximate Adjusted Volume Market Center
     */
    FRACTIONAL_APPROXIMATE_ADJUSTED_VOLUME_MARKET_CENTER('V', "Fractional Approximate Adjusted Volume Market Center"),

    /**
     * Approximate Trades And Total Dollar Value
     */
    APPROXIMATE_TRADES_AND_TOTAL_DOLLAR_VALUE('O', "Approximate Trades And Total Dollar Value"),

    /**
     * Crossing Session Summary
     */
    CROSSING_SESSION_SUMMARY('P', "Crossing Session Summary");

    private final char wire;

    private final String description;

    MarketStatusMessageType(char wire, String description) {
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
    public static Optional<MarketStatusMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'K' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS);
            case 'L' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_STATUS);
            case 'N' -> Optional.of(APPROXIMATE_ADJUSTED_VOLUME_MARKET_CENTER);
            case 'V' -> Optional.of(FRACTIONAL_APPROXIMATE_ADJUSTED_VOLUME_MARKET_CENTER);
            case 'O' -> Optional.of(APPROXIMATE_TRADES_AND_TOTAL_DOLLAR_VALUE);
            case 'P' -> Optional.of(CROSSING_SESSION_SUMMARY);
            default -> Optional.empty();
        };
    }
}
