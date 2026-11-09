package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Type of Security used by Pillar-powered markets.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * Adr
     */
    ADR('A', "Adr"),

    /**
     * Common Stock
     */
    COMMON_STOCK('C', "Common Stock"),

    /**
     * Debentures
     */
    DEBENTURES('D', "Debentures"),

    /**
     * Etf
     */
    ETF('E', "Etf"),

    /**
     * Foreign
     */
    FOREIGN('F', "Foreign"),

    /**
     * Us Depositary Shares
     */
    US_DEPOSITARY_SHARES('H', "Us Depositary Shares"),

    /**
     * Units
     */
    UNITS('I', "Units"),

    /**
     * Index Linked Notes
     */
    INDEX_LINKED_NOTES('L', "Index Linked Notes"),

    /**
     * Miscliquid Trust
     */
    MISCLIQUID_TRUST('M', "Miscliquid Trust"),

    /**
     * Ordinary Shares
     */
    ORDINARY_SHARES('O', "Ordinary Shares"),

    /**
     * Preferred Stock
     */
    PREFERRED_STOCK('P', "Preferred Stock"),

    /**
     * Rights
     */
    RIGHTS('R', "Rights"),

    /**
     * Shares Of Beneficiary Interest
     */
    SHARES_OF_BENEFICIARY_INTEREST('S', "Shares Of Beneficiary Interest"),

    /**
     * Test
     */
    TEST('T', "Test"),

    /**
     * Closed End Fund
     */
    CLOSED_END_FUND('U', "Closed End Fund"),

    /**
     * Warrant
     */
    WARRANT('W', "Warrant");

    private final char wire;

    private final String description;

    SecurityType(char wire, String description) {
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
    public static Optional<SecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADR);
            case 'C' -> Optional.of(COMMON_STOCK);
            case 'D' -> Optional.of(DEBENTURES);
            case 'E' -> Optional.of(ETF);
            case 'F' -> Optional.of(FOREIGN);
            case 'H' -> Optional.of(US_DEPOSITARY_SHARES);
            case 'I' -> Optional.of(UNITS);
            case 'L' -> Optional.of(INDEX_LINKED_NOTES);
            case 'M' -> Optional.of(MISCLIQUID_TRUST);
            case 'O' -> Optional.of(ORDINARY_SHARES);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'R' -> Optional.of(RIGHTS);
            case 'S' -> Optional.of(SHARES_OF_BENEFICIARY_INTEREST);
            case 'T' -> Optional.of(TEST);
            case 'U' -> Optional.of(CLOSED_END_FUND);
            case 'W' -> Optional.of(WARRANT);
            default -> Optional.empty();
        };
    }
}
