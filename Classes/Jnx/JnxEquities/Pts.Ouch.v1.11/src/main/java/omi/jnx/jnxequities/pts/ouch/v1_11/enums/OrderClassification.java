package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * High-frequency trading order classification
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderClassification {

    /**
     * Non Hft
     */
    NON_HFT('1', "Non Hft"),

    /**
     * Hft Market Making Strategy
     */
    HFT_MARKET_MAKING_STRATEGY('3', "Hft Market Making Strategy"),

    /**
     * Hft Arbitrage Strategy
     */
    HFT_ARBITRAGE_STRATEGY('4', "Hft Arbitrage Strategy"),

    /**
     * Hft Directional Strategy
     */
    HFT_DIRECTIONAL_STRATEGY('5', "Hft Directional Strategy"),

    /**
     * Hft Other Strategy
     */
    HFT_OTHER_STRATEGY('6', "Hft Other Strategy");

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
            case '1' -> Optional.of(NON_HFT);
            case '3' -> Optional.of(HFT_MARKET_MAKING_STRATEGY);
            case '4' -> Optional.of(HFT_ARBITRAGE_STRATEGY);
            case '5' -> Optional.of(HFT_DIRECTIONAL_STRATEGY);
            case '6' -> Optional.of(HFT_OTHER_STRATEGY);
            default -> Optional.empty();
        };
    }
}
