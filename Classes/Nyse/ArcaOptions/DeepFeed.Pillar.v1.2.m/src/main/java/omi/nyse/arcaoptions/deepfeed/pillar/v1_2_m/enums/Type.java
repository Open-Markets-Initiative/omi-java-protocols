package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_m.enums;

import java.util.Optional;

/**
 * Order Type of CUBE/BOLD/COA
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Type {

    /**
     * Bold Outright Only
     */
    BOLD_OUTRIGHT_ONLY('B', "Bold Outright Only"),

    /**
     * Coa Complex Only
     */
    COA_COMPLEX_ONLY('C', "Coa Complex Only"),

    /**
     * Flex Price Improvement Cube
     */
    FLEX_PRICE_IMPROVEMENT_CUBE('F', "Flex Price Improvement Cube"),

    /**
     * Flex Aon Solicitation Cube
     */
    FLEX_AON_SOLICITATION_CUBE('L', "Flex Aon Solicitation Cube"),

    /**
     * Price Improvement Cube
     */
    PRICE_IMPROVEMENT_CUBE('P', "Price Improvement Cube"),

    /**
     * Aon Solicitation Cube
     */
    AON_SOLICITATION_CUBE('S', "Aon Solicitation Cube");

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
            case 'B' -> Optional.of(BOLD_OUTRIGHT_ONLY);
            case 'C' -> Optional.of(COA_COMPLEX_ONLY);
            case 'F' -> Optional.of(FLEX_PRICE_IMPROVEMENT_CUBE);
            case 'L' -> Optional.of(FLEX_AON_SOLICITATION_CUBE);
            case 'P' -> Optional.of(PRICE_IMPROVEMENT_CUBE);
            case 'S' -> Optional.of(AON_SOLICITATION_CUBE);
            default -> Optional.empty();
        };
    }
}
