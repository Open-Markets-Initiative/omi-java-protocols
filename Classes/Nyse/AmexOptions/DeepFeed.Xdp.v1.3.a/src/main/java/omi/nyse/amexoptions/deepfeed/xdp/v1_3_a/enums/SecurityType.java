package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * Type of Security
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
     * AMERICAN DEPOSITORY SHARES
     */
    AMERICAN_DEPOSITORY_SHARES('H', "AMERICAN DEPOSITORY SHARES"),

    /**
     * UNITS
     */
    UNITS_I('I', "UNITS"),

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
     * UNITS
     */
    UNITS_U('U', "UNITS"),

    /**
     * WARRANT
     */
    WARRANT('W', "WARRANT"),

    /**
     * INDEX
     */
    INDEX('X', "INDEX");

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
            case 'H' -> Optional.of(AMERICAN_DEPOSITORY_SHARES);
            case 'I' -> Optional.of(UNITS_I);
            case 'M' -> Optional.of(MISCLIQUID_TRUST);
            case 'O' -> Optional.of(ORDINARY_SHARES);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'R' -> Optional.of(RIGHTS);
            case 'S' -> Optional.of(SHARES_OF_BENEFICIARY_INTEREST);
            case 'T' -> Optional.of(TEST);
            case 'U' -> Optional.of(UNITS_U);
            case 'W' -> Optional.of(WARRANT);
            case 'X' -> Optional.of(INDEX);
            default -> Optional.empty();
        };
    }
}
