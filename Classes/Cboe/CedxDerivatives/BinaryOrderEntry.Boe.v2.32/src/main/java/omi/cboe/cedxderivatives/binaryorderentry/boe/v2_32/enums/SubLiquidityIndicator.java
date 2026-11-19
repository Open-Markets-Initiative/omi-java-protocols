package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.enums;

import java.util.Optional;

/**
 * Defines the SubLiquidityIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Automated Improvement Mechanism (AIM)
     */
    AUTOMATED_IMPROVEMENT_MECHANISM('b', "Automated Improvement Mechanism (AIM)"),

    /**
     * Qualifying Market Turner order. Only set when BaseLiq- uidityIndicator = A.
     */
    QUALIFYING_MARKET_TURNER_ORDER('U', "Qualifying Market Turner order. Only set when BaseLiq- uidityIndicator = A."),

    /**
     * Aggressive Hold. Order held by speed bump.
     */
    AGGRESSIVE_HOLD('g', "Aggressive Hold. Order held by speed bump.");

    private final char wire;

    private final String description;

    SubLiquidityIndicator(char wire, String description) {
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
    public static Optional<SubLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'b' -> Optional.of(AUTOMATED_IMPROVEMENT_MECHANISM);
            case 'U' -> Optional.of(QUALIFYING_MARKET_TURNER_ORDER);
            case 'g' -> Optional.of(AGGRESSIVE_HOLD);
            default -> Optional.empty();
        };
    }
}
