package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Defines the TradeType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Outright
     */
    OUTRIGHT('O', "Outright"),

    /**
     * Strategy
     */
    STRATEGY_S('S', "Strategy"),

    /**
     * Strategy
     */
    STRATEGY_M('M', "Strategy"),

    /**
     * Complex
     */
    COMPLEX_C('C', "Complex"),

    /**
     * Complex
     */
    COMPLEX_L('L', "Complex"),

    /**
     * Adjusted Late
     */
    ADJUSTED_LATE('A', "Adjusted Late");

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
            case 'O' -> Optional.of(OUTRIGHT);
            case 'S' -> Optional.of(STRATEGY_S);
            case 'M' -> Optional.of(STRATEGY_M);
            case 'C' -> Optional.of(COMPLEX_C);
            case 'L' -> Optional.of(COMPLEX_L);
            case 'A' -> Optional.of(ADJUSTED_LATE);
            default -> Optional.empty();
        };
    }
}
