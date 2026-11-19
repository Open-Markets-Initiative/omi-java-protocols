package omi.tmx.tsx.level1.qrtmd.v2_8.enums;

import java.util.Optional;

/**
 * The product type for a symbol.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ProductType {

    /**
     * Debenture
     */
    DEBENTURE('B', "Debenture"),

    /**
     * Equity
     */
    EQUITY('E', "Equity"),

    /**
     * Mutual Fund
     */
    MUTUAL_FUND('M', "Mutual Fund"),

    /**
     * Etf
     */
    ETF('F', "Etf"),

    /**
     * Us Equity
     */
    US_EQUITY('U', "Us Equity"),

    /**
     * Bond
     */
    BOND('O', "Bond");

    private final char wire;

    private final String description;

    ProductType(char wire, String description) {
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
    public static Optional<ProductType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(DEBENTURE);
            case 'E' -> Optional.of(EQUITY);
            case 'M' -> Optional.of(MUTUAL_FUND);
            case 'F' -> Optional.of(ETF);
            case 'U' -> Optional.of(US_EQUITY);
            case 'O' -> Optional.of(BOND);
            default -> Optional.empty();
        };
    }
}
