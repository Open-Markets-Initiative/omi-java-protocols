package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * This is the Minimum Price Variation as agreed to by the Options industry (penny pilot program) and as published by MIAX
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MiaxBboPostingIncrementIndicator {

    /**
     * Penny
     */
    PENNY('P', "Penny"),

    /**
     * Nickel
     */
    NICKEL('N', "Nickel"),

    /**
     * Dime
     */
    DIME('D', "Dime");

    private final char wire;

    private final String description;

    MiaxBboPostingIncrementIndicator(char wire, String description) {
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
    public static Optional<MiaxBboPostingIncrementIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PENNY);
            case 'N' -> Optional.of(NICKEL);
            case 'D' -> Optional.of(DIME);
            default -> Optional.empty();
        };
    }
}
