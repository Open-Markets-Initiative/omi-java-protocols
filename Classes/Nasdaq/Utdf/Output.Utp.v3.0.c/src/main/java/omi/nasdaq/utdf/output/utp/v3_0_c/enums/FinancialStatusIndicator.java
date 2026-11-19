package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Financial Status Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Creations Andor Redemptions Suspended For Exchange Traded Product
     */
    CREATIONS_ANDOR_REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCT('C', "Creations Andor Redemptions Suspended For Exchange Traded Product"),

    /**
     * Deficient Issuer Failed To Meet Nasdaq Continued Listing Requirements
     */
    DEFICIENT_ISSUER_FAILED_TO_MEET_NASDAQ_CONTINUED_LISTING_REQUIREMENTS('D', "Deficient Issuer Failed To Meet Nasdaq Continued Listing Requirements"),

    /**
     * Delinquent Issuer Missed Regulatory Filing Deadline
     */
    DELINQUENT_ISSUER_MISSED_REGULATORY_FILING_DEADLINE('E', "Delinquent Issuer Missed Regulatory Filing Deadline"),

    /**
     * Bankrupt Issuer Has Filed For Bankruptcy
     */
    BANKRUPT_ISSUER_HAS_FILED_FOR_BANKRUPTCY('Q', "Bankrupt Issuer Has Filed For Bankruptcy"),

    /**
     * Normal Default Issuer Is Not Deficient Delinquent Or Bankrupt
     */
    NORMAL_DEFAULT_ISSUER_IS_NOT_DEFICIENT_DELINQUENT_OR_BANKRUPT('N', "Normal Default Issuer Is Not Deficient Delinquent Or Bankrupt"),

    /**
     * Deficient And Bankrupt
     */
    DEFICIENT_AND_BANKRUPT('G', "Deficient And Bankrupt"),

    /**
     * Deficient And Delinquent
     */
    DEFICIENT_AND_DELINQUENT('H', "Deficient And Delinquent"),

    /**
     * Delinquent And Bankrupt
     */
    DELINQUENT_AND_BANKRUPT('J', "Delinquent And Bankrupt"),

    /**
     * Deficient Delinquent And Bankrupt
     */
    DEFICIENT_DELINQUENT_AND_BANKRUPT('K', "Deficient Delinquent And Bankrupt");

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
            case 'C' -> Optional.of(CREATIONS_ANDOR_REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCT);
            case 'D' -> Optional.of(DEFICIENT_ISSUER_FAILED_TO_MEET_NASDAQ_CONTINUED_LISTING_REQUIREMENTS);
            case 'E' -> Optional.of(DELINQUENT_ISSUER_MISSED_REGULATORY_FILING_DEADLINE);
            case 'Q' -> Optional.of(BANKRUPT_ISSUER_HAS_FILED_FOR_BANKRUPTCY);
            case 'N' -> Optional.of(NORMAL_DEFAULT_ISSUER_IS_NOT_DEFICIENT_DELINQUENT_OR_BANKRUPT);
            case 'G' -> Optional.of(DEFICIENT_AND_BANKRUPT);
            case 'H' -> Optional.of(DEFICIENT_AND_DELINQUENT);
            case 'J' -> Optional.of(DELINQUENT_AND_BANKRUPT);
            case 'K' -> Optional.of(DEFICIENT_DELINQUENT_AND_BANKRUPT);
            default -> Optional.empty();
        };
    }
}
