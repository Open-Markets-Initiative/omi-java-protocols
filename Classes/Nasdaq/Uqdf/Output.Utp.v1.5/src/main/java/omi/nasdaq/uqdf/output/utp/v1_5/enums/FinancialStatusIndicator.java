package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Financial Status Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Creations and or Redemptions Suspended for Exchange Traded Product
     */
    CREATIONS_AND_OR_REDEMPTIONS_SUSPENDED('C', "Creations and or Redemptions Suspended for Exchange Traded Product"),

    /**
     * Deficient Issuer Failed to Meet NASDAQ Continued Listing Requirements
     */
    DEFICIENT('D', "Deficient Issuer Failed to Meet NASDAQ Continued Listing Requirements"),

    /**
     * Issuer Missed Regulatory Filing Deadline
     */
    DELINQUENT('E', "Issuer Missed Regulatory Filing Deadline"),

    /**
     * Issuer Has Filed for Bankruptcy
     */
    BANKRUPT('Q', "Issuer Has Filed for Bankruptcy"),

    /**
     * Issuer Is NOT Deficient, Delinquent, or Bankrupt.
     */
    NORMAL('N', "Issuer Is NOT Deficient, Delinquent, or Bankrupt."),

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
    DEFICIENT_DELINQUENT_AND_BANKRUPT('K', "Deficient, Delinquent, and Bankrupt");

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
            case 'C' -> Optional.of(CREATIONS_AND_OR_REDEMPTIONS_SUSPENDED);
            case 'D' -> Optional.of(DEFICIENT);
            case 'E' -> Optional.of(DELINQUENT);
            case 'Q' -> Optional.of(BANKRUPT);
            case 'N' -> Optional.of(NORMAL);
            case 'G' -> Optional.of(DEFICIENT_AND_BANKRUPT);
            case 'H' -> Optional.of(DEFICIENT_AND_DELINQUENT);
            case 'J' -> Optional.of(DELINQUENT_AND_BANKRUPT);
            case 'K' -> Optional.of(DEFICIENT_DELINQUENT_AND_BANKRUPT);
            default -> Optional.empty();
        };
    }
}
