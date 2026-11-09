package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Top of Strategy Market Quote Conditions
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TopOfMarketQuoteCondition {

    /**
     * Miax Has Halted Trading For This Underlying Symbol
     */
    HALTED('H', "Miax Has Halted Trading For This Underlying Symbol"),

    /**
     * Miax Will Resume Trading Reopen For This Underlying Symbol
     */
    RESUMED('R', "Miax Will Resume Trading Reopen For This Underlying Symbol"),

    /**
     * Miax Will Open Trading For This Underlying Symbol
     */
    OPENED('O', "Miax Will Open Trading For This Underlying Symbol");

    private final char wire;

    private final String description;

    TopOfMarketQuoteCondition(char wire, String description) {
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
    public static Optional<TopOfMarketQuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED);
            case 'R' -> Optional.of(RESUMED);
            case 'O' -> Optional.of(OPENED);
            default -> Optional.empty();
        };
    }
}
