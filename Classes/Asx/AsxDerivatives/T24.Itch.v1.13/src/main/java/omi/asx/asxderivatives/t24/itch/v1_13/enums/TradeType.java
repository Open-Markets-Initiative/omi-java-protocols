package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * Trade Type Explanation.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Normal Trade, trade price matches both order prices
     */
    NORMAL('T', "Normal Trade, trade price matches both order prices"),

    /**
     * Crossing Normal Trade, trade price matches both order prices
     */
    CROSSING_NORMAL('t', "Crossing Normal Trade, trade price matches both order prices"),

    /**
     * Sweeping Trade, trade price matches resting order
     */
    SWEEPING('W', "Sweeping Trade, trade price matches resting order"),

    /**
     * Crossing Sweeping Trade, trade price matches resting order
     */
    CROSSING_SWEEPING('w', "Crossing Sweeping Trade, trade price matches resting order"),

    /**
     * Levelling Trade, trade price may be different than price of resting order(s)
     */
    LEVELLING('L', "Levelling Trade, trade price may be different than price of resting order(s)"),

    /**
     * Crossing Levelling Trade, trade price may be different than price of resting order(s)
     */
    CROSSING_LEVELLING('l', "Crossing Levelling Trade, trade price may be different than price of resting order(s)"),

    /**
     * Spread-to-Underlying trade (price is based on the order of the underlying future, relating to intra, inter or custom matching with an outright order)
     */
    SPREAD_TO_UNDERLYING('S', "Spread-to-Underlying trade (price is based on the order of the underlying future, relating to intra, inter or custom matching with an outright order)"),

    /**
     * Crossing Spread-to-Underlying trade (price is based on the order of the underlying future, relating to intra, inter or custom matching with an outright order)
     */
    CROSSING_SPREAD_TO_UNDERLYING('s', "Crossing Spread-to-Underlying trade (price is based on the order of the underlying future, relating to intra, inter or custom matching with an outright order)"),

    /**
     * Intra-Spread-to-Intra-Spread trade (price is based on the near contract’s prior day settlement)
     */
    INTRA_SPREAD('R', "Intra-Spread-to-Intra-Spread trade (price is based on the near contract\u2019s prior day settlement)"),

    /**
     * Crossing Intra-Spread-to-Intra-Spread trade (price is based on the near contract’s prior day settlement)
     */
    CROSSING_INTRA_SPREAD('r', "Crossing Intra-Spread-to-Intra-Spread trade (price is based on the near contract\u2019s prior day settlement)"),

    /**
     * Inter-Spread-to-Inter-Spread trade (price is based on the secondary’s contract’s prior day settlement)
     */
    INTER_SPREAD('Q', "Inter-Spread-to-Inter-Spread trade (price is based on the secondary\u2019s contract\u2019s prior day settlement)"),

    /**
     * Crossing Inter-Spread-to-Inter-Spread trade (price is based on the secondary’s contract’s prior day settlement)
     */
    CROSSING_INTER_SPREAD('q', "Crossing Inter-Spread-to-Inter-Spread trade (price is based on the secondary\u2019s contract\u2019s prior day settlement)"),

    /**
     * Custom-to-Custom trade
     */
    CUSTOM('U', "Custom-to-Custom trade"),

    /**
     * Crossing Custom-to-Custom trade
     */
    CROSSING_CUSTOM('u', "Crossing Custom-to-Custom trade");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(NORMAL);
            case 't' -> Optional.of(CROSSING_NORMAL);
            case 'W' -> Optional.of(SWEEPING);
            case 'w' -> Optional.of(CROSSING_SWEEPING);
            case 'L' -> Optional.of(LEVELLING);
            case 'l' -> Optional.of(CROSSING_LEVELLING);
            case 'S' -> Optional.of(SPREAD_TO_UNDERLYING);
            case 's' -> Optional.of(CROSSING_SPREAD_TO_UNDERLYING);
            case 'R' -> Optional.of(INTRA_SPREAD);
            case 'r' -> Optional.of(CROSSING_INTRA_SPREAD);
            case 'Q' -> Optional.of(INTER_SPREAD);
            case 'q' -> Optional.of(CROSSING_INTER_SPREAD);
            case 'U' -> Optional.of(CUSTOM);
            case 'u' -> Optional.of(CROSSING_CUSTOM);
            default -> Optional.empty();
        };
    }
}
