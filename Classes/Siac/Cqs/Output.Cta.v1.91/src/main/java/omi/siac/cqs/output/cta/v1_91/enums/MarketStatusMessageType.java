package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Market Status message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketStatusMessageType {

    /**
     * Market Wide Circuit Breaker Decline Level Status Message
     */
    MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS_MESSAGE('K', "Market Wide Circuit Breaker Decline Level Status Message"),

    /**
     * Market Wide Circuit Breaker Status Message
     */
    MARKET_WIDE_CIRCUIT_BREAKER_STATUS_MESSAGE('L', "Market Wide Circuit Breaker Status Message");

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
            case 'K' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS_MESSAGE);
            case 'L' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
