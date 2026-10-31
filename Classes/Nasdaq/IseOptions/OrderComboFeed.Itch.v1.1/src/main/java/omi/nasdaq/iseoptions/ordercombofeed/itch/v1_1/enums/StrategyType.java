package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * StrategyType value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StrategyType {

    /**
     * Vertical Spread
     */
    VERTICAL_SPREAD('V', "Vertical Spread"),

    /**
     * Time Spread
     */
    TIME_SPREAD('T', "Time Spread"),

    /**
     * Diagonal Spread
     */
    DIAGONAL_SPREAD('D', "Diagonal Spread"),

    /**
     * Straddle
     */
    STRADDLE('S', "Straddle"),

    /**
     * Strangle
     */
    STRANGLE('G', "Strangle"),

    /**
     * Combo
     */
    COMBO('C', "Combo"),

    /**
     * Risk Reversal
     */
    RISK_REVERSAL('R', "Risk Reversal"),

    /**
     * Ratio Spread
     */
    RATIO_SPREAD('A', "Ratio Spread"),

    /**
     * Custom
     */
    CUSTOM('U', "Custom");

    private final char wire;

    private final String description;

    StrategyType(char wire, String description) {
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
    public static Optional<StrategyType> fromWire(char wire) {
        return switch (wire) {
            case 'V' -> Optional.of(VERTICAL_SPREAD);
            case 'T' -> Optional.of(TIME_SPREAD);
            case 'D' -> Optional.of(DIAGONAL_SPREAD);
            case 'S' -> Optional.of(STRADDLE);
            case 'G' -> Optional.of(STRANGLE);
            case 'C' -> Optional.of(COMBO);
            case 'R' -> Optional.of(RISK_REVERSAL);
            case 'A' -> Optional.of(RATIO_SPREAD);
            case 'U' -> Optional.of(CUSTOM);
            default -> Optional.empty();
        };
    }
}
