package omi.nasdaq.nsmequities.noiview.asciiitch.v3_0_2013.enums;

import java.util.Optional;

/**
 * Indicates when a firm is not in compliance with NASDAQ continued listing requirements.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

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
     * Suspended
     */
    SUSPENDED('S', "Suspended"),

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
    DEFICIENT_DELINQUENT_AND_BANKRUPT('K', "Deficient Delinquent And Bankrupt"),

    /**
     * Creations Andor Redemptions Suspended For Exchange Traded Product
     */
    CREATIONS_ANDOR_REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCT('C', "Creations Andor Redemptions Suspended For Exchange Traded Product"),

    /**
     * Normal Default Issuer Is Not Deficient Delinquent Or Bankrupt
     */
    NORMAL_DEFAULT_ISSUER_IS_NOT_DEFICIENT_DELINQUENT_OR_BANKRUPT('N', "Normal Default Issuer Is Not Deficient Delinquent Or Bankrupt"),

    /**
     * Firms should refer to SIAC feeds for code if needed.
     */
    NOT_AVAILABLE(' ', "Firms should refer to SIAC feeds for code if needed.");

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
            case 'D' -> Optional.of(DEFICIENT);
            case 'E' -> Optional.of(DELINQUENT);
            case 'Q' -> Optional.of(BANKRUPT);
            case 'S' -> Optional.of(SUSPENDED);
            case 'G' -> Optional.of(DEFICIENT_AND_BANKRUPT);
            case 'H' -> Optional.of(DEFICIENT_AND_DELINQUENT);
            case 'J' -> Optional.of(DELINQUENT_AND_BANKRUPT);
            case 'K' -> Optional.of(DEFICIENT_DELINQUENT_AND_BANKRUPT);
            case 'C' -> Optional.of(CREATIONS_ANDOR_REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCT);
            case 'N' -> Optional.of(NORMAL_DEFAULT_ISSUER_IS_NOT_DEFICIENT_DELINQUENT_OR_BANKRUPT);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
