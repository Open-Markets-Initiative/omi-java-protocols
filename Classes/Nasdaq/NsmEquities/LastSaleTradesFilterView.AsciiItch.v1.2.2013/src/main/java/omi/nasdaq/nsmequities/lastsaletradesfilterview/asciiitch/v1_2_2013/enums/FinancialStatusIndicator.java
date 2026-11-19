package omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v1_2_2013.enums;

import java.util.Optional;

/**
 * For NASDAQ-listed issues, this field indicates when a firm is not in compliance with NASDAQ continued listing requirements.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Normal (Default): Issuer Is NOT Deficient, Delinquent, or Bankrupt
     */
    NORMAL('N', "Normal (Default): Issuer Is NOT Deficient, Delinquent, or Bankrupt"),

    /**
     * Deficient
     */
    DEFICIENT('D', "Deficient"),

    /**
     * Delinquent
     */
    DELINQUENT('E', "Delinquent"),

    /**
     * Bankrupt
     */
    BANKRUPT('Q', "Bankrupt"),

    /**
     * Deficient and Bankrupt
     */
    DEFICIENT_AND_BANKRUPT('G', "Deficient and Bankrupt"),

    /**
     * Deficient and Delinquent
     */
    DEFICIENT_AND_DELINQUENT('H', "Deficient and Delinquent"),

    /**
     * Delinquent and Bankrupt
     */
    DELINQUENT_AND_BANKRUPT('J', "Delinquent and Bankrupt"),

    /**
     * Deficient, Delinquent, and Bankrupt
     */
    DEFICIENT_DELINQUENT_AND_BANKRUPT('K', "Deficient, Delinquent, and Bankrupt"),

    /**
     * Suspended
     */
    SUSPENDED('S', "Suspended"),

    /**
     * Company is in compliance with NASDAQ listing standards OR Issue is listed on NYSE, NYSE MKT, NYSE Arca, BATS or regional exchange (not NASDAQ)
     */
    IN_COMPLIANCE_OR_NOT_LISTED(' ', "Company is in compliance with NASDAQ listing standards OR Issue is listed on NYSE, NYSE MKT, NYSE Arca, BATS or regional exchange (not NASDAQ)");

    private final char wire;

    private final String description;

    FinancialStatusIndicator(char wire, String description) {
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
    public static Optional<FinancialStatusIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'D' -> Optional.of(DEFICIENT);
            case 'E' -> Optional.of(DELINQUENT);
            case 'Q' -> Optional.of(BANKRUPT);
            case 'G' -> Optional.of(DEFICIENT_AND_BANKRUPT);
            case 'H' -> Optional.of(DEFICIENT_AND_DELINQUENT);
            case 'J' -> Optional.of(DELINQUENT_AND_BANKRUPT);
            case 'K' -> Optional.of(DEFICIENT_DELINQUENT_AND_BANKRUPT);
            case 'S' -> Optional.of(SUSPENDED);
            case ' ' -> Optional.of(IN_COMPLIANCE_OR_NOT_LISTED);
            default -> Optional.empty();
        };
    }
}
