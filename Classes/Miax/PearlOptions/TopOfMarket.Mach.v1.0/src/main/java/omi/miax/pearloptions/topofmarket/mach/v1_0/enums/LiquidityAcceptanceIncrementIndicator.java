package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * This is the Minimum Price Variation for Quote/Order acceptance as per PEARL rules
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityAcceptanceIncrementIndicator {

    /**
     * Penny 001
     */
    PENNY_001P('P', "Penny 001"),

    /**
     * Penny 001 Nickel 005
     */
    PENNY_001N('N', "Penny 001 Nickel 005"),

    /**
     * Nickel 005 Dime 010
     */
    NICKEL_005('D', "Nickel 005 Dime 010");

    private final char wire;

    private final String description;

    LiquidityAcceptanceIncrementIndicator(char wire, String description) {
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
    public static Optional<LiquidityAcceptanceIncrementIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PENNY_001P);
            case 'N' -> Optional.of(PENNY_001N);
            case 'D' -> Optional.of(NICKEL_005);
            default -> Optional.empty();
        };
    }
}
