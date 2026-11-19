package omi.nasdaq.nsmequities.aggregated.itch.v2_0_2026.enums;

import java.util.Optional;

/**
 * For Nasdaq-listed issues, indicates when a firm is not in compliance with Nasdaq continued listing requirements
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Nasdaq-Listed Instrument
     */
    DEFICIENT('D', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    DELINQUENT('E', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    BANKRUPT('Q', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    SUSPENDED('S', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    DEFICIENT_AND_BANKRUPT('G', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    DEFICIENT_AND_DELINQUENT('H', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    DELINQUENT_AND_BANKRUPT('J', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    DEFICIENT_DELINQUENT_AND_BANKRUPT('K', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    CREATIONS_ANDOR_REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCT('C', "Nasdaq-Listed Instrument"),

    /**
     * Issuer is not Deficient, Delinquent, or Bankrupt
     */
    NORMAL('N', "Issuer is not Deficient, Delinquent, or Bankrupt"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    NOT_AVAILABLE(' ', "Non-Nasdaq-Listed Instrument");

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
            case 'N' -> Optional.of(NORMAL);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
