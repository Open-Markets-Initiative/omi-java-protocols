package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Issue Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IssueType {

    /**
     * American Depository Receipt
     */
    AMERICAN_DEPOSITORY_RECEIPT('A', "American Depository Receipt"),

    /**
     * Bond
     */
    BOND('B', "Bond"),

    /**
     * Common Stock
     */
    COMMON_STOCK('C', "Common Stock"),

    /**
     * Depository Receipt
     */
    DEPOSITORY_RECEIPT('F', "Depository Receipt"),

    /**
     * Rule144A
     */
    RULE_144A('I', "Rule144A"),

    /**
     * Limited Partnership
     */
    LIMITED_PARTNERSHIP('L', "Limited Partnership"),

    /**
     * Note
     */
    NOTE('N', "Note"),

    /**
     * Ordinary Shares
     */
    ORDINARY_SHARES('O', "Ordinary Shares"),

    /**
     * Preferred Stock
     */
    PREFERRED_STOCK('P', "Preferred Stock"),

    /**
     * Other Securities
     */
    OTHER_SECURITIES('Q', "Other Securities"),

    /**
     * Rights
     */
    RIGHTS('R', "Rights"),

    /**
     * Shares of Beneficial Interest
     */
    SHARES_OF_BENEFICIAL_INTEREST('S', "Shares of Beneficial Interest"),

    /**
     * Convertible Debenture
     */
    CONVERTIBLE_DEBENTURE('T', "Convertible Debenture"),

    /**
     * Unit
     */
    UNIT('U', "Unit"),

    /**
     * Units of Beneficial Interest
     */
    UNITS_OF_BENEFICIAL_INTEREST('V', "Units of Beneficial Interest"),

    /**
     * Warrant
     */
    WARRANT('W', "Warrant");

    private final char wire;

    private final String description;

    IssueType(char wire, String description) {
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
    public static Optional<IssueType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMERICAN_DEPOSITORY_RECEIPT);
            case 'B' -> Optional.of(BOND);
            case 'C' -> Optional.of(COMMON_STOCK);
            case 'F' -> Optional.of(DEPOSITORY_RECEIPT);
            case 'I' -> Optional.of(RULE_144A);
            case 'L' -> Optional.of(LIMITED_PARTNERSHIP);
            case 'N' -> Optional.of(NOTE);
            case 'O' -> Optional.of(ORDINARY_SHARES);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'Q' -> Optional.of(OTHER_SECURITIES);
            case 'R' -> Optional.of(RIGHTS);
            case 'S' -> Optional.of(SHARES_OF_BENEFICIAL_INTEREST);
            case 'T' -> Optional.of(CONVERTIBLE_DEBENTURE);
            case 'U' -> Optional.of(UNIT);
            case 'V' -> Optional.of(UNITS_OF_BENEFICIAL_INTEREST);
            case 'W' -> Optional.of(WARRANT);
            default -> Optional.empty();
        };
    }
}
