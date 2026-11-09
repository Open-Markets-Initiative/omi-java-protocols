package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * Type of Security used by Arca, National and American
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * ADR
     */
    ADR('A', "ADR"),

    /**
     * COMMON STOCK
     */
    COMMON_STOCK('C', "COMMON STOCK"),

    /**
     * DEBENTURES
     */
    DEBENTURES('D', "DEBENTURES"),

    /**
     * ETF
     */
    ETF('E', "ETF"),

    /**
     * FOREIGN
     */
    FOREIGN('F', "FOREIGN"),

    /**
     * US DEPOSITARY SHARES
     */
    US_DEPOSITARY_SHARES('H', "US DEPOSITARY SHARES"),

    /**
     * UNITS
     */
    UNITS('I', "UNITS"),

    /**
     * INDEX LINKED NOTES
     */
    INDEX_LINKED_NOTES('L', "INDEX LINKED NOTES"),

    /**
     * MISC/LIQUID TRUST
     */
    MISCLIQUID_TRUST('M', "MISC/LIQUID TRUST"),

    /**
     * ORDINARY SHARES
     */
    ORDINARY_SHARES('O', "ORDINARY SHARES"),

    /**
     * PREFERRED STOCK
     */
    PREFERRED_STOCK('P', "PREFERRED STOCK"),

    /**
     * RIGHTS
     */
    RIGHTS('R', "RIGHTS"),

    /**
     * SHARES OF BENEFICIARY INTEREST
     */
    SHARES_OF_BENEFICIARY_INTEREST('S', "SHARES OF BENEFICIARY INTEREST"),

    /**
     * TEST
     */
    TEST('T', "TEST"),

    /**
     * Closed End Fund
     */
    CLOSED_END_FUND('U', "Closed End Fund"),

    /**
     * WARRANT
     */
    WARRANT('W', "WARRANT");

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
