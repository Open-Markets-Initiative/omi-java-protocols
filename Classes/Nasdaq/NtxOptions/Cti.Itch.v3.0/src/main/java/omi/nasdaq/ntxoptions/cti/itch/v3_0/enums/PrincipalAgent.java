package omi.nasdaq.ntxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Capacity for a stock leg: A = Agency Order, P = Principle, R = Riskless Principle, space = Not a stock leg
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PrincipalAgent {

    /**
     * Agency Order
     */
    AGENCY('A', "Agency Order"),

    /**
     * Principle
     */
    PRINCIPAL('P', "Principle"),

    /**
     * Riskless Principle
     */
    RISKLESS_PRINCIPAL('R', "Riskless Principle"),

    /**
     * Not a stock leg
     */
    NOT_A_STOCK_LEG(' ', "Not a stock leg");

    private final char wire;

    private final String description;

    PrincipalAgent(char wire, String description) {
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
    public static Optional<PrincipalAgent> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AGENCY);
            case 'P' -> Optional.of(PRINCIPAL);
            case 'R' -> Optional.of(RISKLESS_PRINCIPAL);
            case ' ' -> Optional.of(NOT_A_STOCK_LEG);
            default -> Optional.empty();
        };
    }
}
