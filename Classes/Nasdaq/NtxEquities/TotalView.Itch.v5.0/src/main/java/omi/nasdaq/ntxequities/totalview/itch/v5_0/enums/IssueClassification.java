package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Identifies the security class for the issue as assigned by Nasdaq. See Appendix for allowable values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IssueClassification {

    /**
     * American Depositary Share
     */
    AMERICAN_DEPOSITARY_SHARE('A', "American Depositary Share"),

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
     * Sec 144A
     */
    SEC_144A('I', "Sec 144A"),

    /**
     * Limited Partnership
     */
    LIMITED_PARTNERSHIP('L', "Limited Partnership"),

    /**
     * Notes
     */
    NOTES('N', "Notes"),

    /**
     * Ordinary Share
     */
    ORDINARY_SHARE('O', "Ordinary Share"),

    /**
     * Preferred Stock
     */
    PREFERRED_STOCK('P', "Preferred Stock"),

    /**
     * Other Securities
     */
    OTHER_SECURITIES('Q', "Other Securities"),

    /**
     * Right
     */
    RIGHT('R', "Right"),

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
     * Units/Benif Int
     */
    UNITS_BENIF_INT('V', "Units/Benif Int"),

    /**
     * Warrant
     */
    WARRANT('W', "Warrant");

    private final char wire;

    private final String description;

    IssueClassification(char wire, String description) {
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
    public static Optional<IssueClassification> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMERICAN_DEPOSITARY_SHARE);
            case 'B' -> Optional.of(BOND);
            case 'C' -> Optional.of(COMMON_STOCK);
            case 'F' -> Optional.of(DEPOSITORY_RECEIPT);
            case 'I' -> Optional.of(SEC_144A);
            case 'L' -> Optional.of(LIMITED_PARTNERSHIP);
            case 'N' -> Optional.of(NOTES);
            case 'O' -> Optional.of(ORDINARY_SHARE);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'Q' -> Optional.of(OTHER_SECURITIES);
            case 'R' -> Optional.of(RIGHT);
            case 'S' -> Optional.of(SHARES_OF_BENEFICIAL_INTEREST);
            case 'T' -> Optional.of(CONVERTIBLE_DEBENTURE);
            case 'U' -> Optional.of(UNIT);
            case 'V' -> Optional.of(UNITS_BENIF_INT);
            case 'W' -> Optional.of(WARRANT);
            default -> Optional.empty();
        };
    }
}
