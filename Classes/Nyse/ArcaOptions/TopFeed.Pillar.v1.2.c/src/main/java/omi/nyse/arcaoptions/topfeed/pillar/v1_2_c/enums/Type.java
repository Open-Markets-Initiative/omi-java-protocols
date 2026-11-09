package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Order Type of CUBE/Bold/COA
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Type {

    /**
     * Price Improvement
     */
    PRICE_IMPROVEMENT('P', "Price Improvement"),

    /**
     * Facilitation
     */
    FACILITATION('F', "Facilitation"),

    /**
     * Solicitation
     */
    SOLICITATION('S', "Solicitation"),

    /**
     * Bold
     */
    BOLD('B', "Bold"),

    /**
     * Coa
     */
    COA('C', "Coa");

    private final char wire;

    private final String description;

    Type(char wire, String description) {
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
    public static Optional<Type> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRICE_IMPROVEMENT);
            case 'F' -> Optional.of(FACILITATION);
            case 'S' -> Optional.of(SOLICITATION);
            case 'B' -> Optional.of(BOLD);
            case 'C' -> Optional.of(COA);
            default -> Optional.empty();
        };
    }
}
