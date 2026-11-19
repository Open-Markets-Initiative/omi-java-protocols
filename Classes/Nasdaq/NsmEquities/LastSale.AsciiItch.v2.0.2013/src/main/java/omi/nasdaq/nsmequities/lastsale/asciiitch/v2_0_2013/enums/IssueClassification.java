package omi.nasdaq.nsmequities.lastsale.asciiitch.v2_0_2013.enums;

import java.util.Optional;

/**
 * Identifies the security class for the issue as assigned by NASDAQ.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IssueClassification {

    /**
     * American Depositary Share
     */
    ADS('A', "American Depositary Share"),

    /**
     * Bond
     */
    BOND('B', "Bond"),

    /**
     * Common Stock
     */
    COMMON('C', "Common Stock"),

    /**
     * Depository Receipt
     */
    DEPOSITORY('F', "Depository Receipt"),

    /**
     * 144A
     */
    SEC_144A('I', "144A"),

    /**
     * Limited Partnership
     */
    LIMITED('L', "Limited Partnership"),

    /**
     * Notes
     */
    NOTES('N', "Notes"),

    /**
     * Ordinary Share
     */
    ORDINARY('O', "Ordinary Share"),

    /**
     * Preferred Stock
     */
    PREFERRED('P', "Preferred Stock"),

    /**
     * Other Securities
     */
    OTHER('Q', "Other Securities"),

    /**
     * Right
     */
    RIGHT('R', "Right"),

    /**
     * Shares of Beneficial Interest
     */
    SHARES('S', "Shares of Beneficial Interest"),

    /**
     * Convertible Debenture
     */
    CONVERTIBLE('T', "Convertible Debenture"),

    /**
     * Unit
     */
    UNIT('U', "Unit"),

    /**
     * Units/Benif Int
     */
    UNITS_BI('V', "Units/Benif Int"),

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
            case 'A' -> Optional.of(ADS);
            case 'B' -> Optional.of(BOND);
            case 'C' -> Optional.of(COMMON);
            case 'F' -> Optional.of(DEPOSITORY);
            case 'I' -> Optional.of(SEC_144A);
            case 'L' -> Optional.of(LIMITED);
            case 'N' -> Optional.of(NOTES);
            case 'O' -> Optional.of(ORDINARY);
            case 'P' -> Optional.of(PREFERRED);
            case 'Q' -> Optional.of(OTHER);
            case 'R' -> Optional.of(RIGHT);
            case 'S' -> Optional.of(SHARES);
            case 'T' -> Optional.of(CONVERTIBLE);
            case 'U' -> Optional.of(UNIT);
            case 'V' -> Optional.of(UNITS_BI);
            case 'W' -> Optional.of(WARRANT);
            default -> Optional.empty();
        };
    }
}
