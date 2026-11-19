package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.enums;

import java.util.Optional;

/**
 * Specify the order classification
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderClassification {

    /**
     * Non Low Latency Trading Auto
     */
    NON_LOW_LATENCY_TRADING_AUTO('1', "Non Low Latency Trading Auto"),

    /**
     * Non Low Latency Trading Manual
     */
    NON_LOW_LATENCY_TRADING_MANUAL('2', "Non Low Latency Trading Manual"),

    /**
     * Market Making Strategy
     */
    MARKET_MAKING_STRATEGY('3', "Market Making Strategy"),

    /**
     * Arbitrage Strategy
     */
    ARBITRAGE_STRATEGY('4', "Arbitrage Strategy"),

    /**
     * Directional Strategy
     */
    DIRECTIONAL_STRATEGY('5', "Directional Strategy"),

    /**
     * Other Strategy
     */
    OTHER_STRATEGY('6', "Other Strategy"),

    /**
     * NULL (0x00), not specified
     */
    NOT_SPECIFIED('0', "NULL (0x00), not specified");

    private final char wire;

    private final String description;

    OrderClassification(char wire, String description) {
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
    public static Optional<OrderClassification> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(NON_LOW_LATENCY_TRADING_AUTO);
            case '2' -> Optional.of(NON_LOW_LATENCY_TRADING_MANUAL);
            case '3' -> Optional.of(MARKET_MAKING_STRATEGY);
            case '4' -> Optional.of(ARBITRAGE_STRATEGY);
            case '5' -> Optional.of(DIRECTIONAL_STRATEGY);
            case '6' -> Optional.of(OTHER_STRATEGY);
            case '0' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
