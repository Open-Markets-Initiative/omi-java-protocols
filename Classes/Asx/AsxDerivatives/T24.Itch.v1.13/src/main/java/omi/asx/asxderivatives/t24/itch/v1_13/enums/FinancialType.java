package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * Indicates the how to valuate a contract.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialType {

    /**
     * Commodity product
     */
    COMMODITY('C', "Commodity product"),

    /**
     * CFD product
     */
    CFD('D', "CFD product"),

    /**
     * Equity product
     */
    EQUITY('E', "Equity product"),

    /**
     * Government Bond product
     */
    GOVERNMENT_BOND('X', "Government Bond product"),

    /**
     * Bank Bill product
     */
    BANK_BILL('B', "Bank Bill product");

    private final char wire;

    private final String description;

    FinancialType(char wire, String description) {
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
    public static Optional<FinancialType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(COMMODITY);
            case 'D' -> Optional.of(CFD);
            case 'E' -> Optional.of(EQUITY);
            case 'X' -> Optional.of(GOVERNMENT_BOND);
            case 'B' -> Optional.of(BANK_BILL);
            default -> Optional.empty();
        };
    }
}
