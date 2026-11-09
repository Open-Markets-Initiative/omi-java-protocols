package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Identifies the financial status of the security.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('0', "Not Applicable"),

    /**
     * Bankrupt
     */
    BANKRUPT('1', "Bankrupt"),

    /**
     * Below Continuing Listing Standards
     */
    BELOW_CONTINUING_LISTING_STANDARDS('2', "Below Continuing Listing Standards"),

    /**
     * Bankrupt And Below Continuing Listing Standards
     */
    BANKRUPT_AND_BELOW_CONTINUING_LISTING_STANDARDS('3', "Bankrupt And Below Continuing Listing Standards"),

    /**
     * Late Filing
     */
    LATE_FILING('4', "Late Filing"),

    /**
     * Bankrupt And Late Filing
     */
    BANKRUPT_AND_LATE_FILING('5', "Bankrupt And Late Filing"),

    /**
     * Below Continuing Listing Standards And Late Filing
     */
    BELOW_CONTINUING_LISTING_STANDARDS_AND_LATE_FILING('6', "Below Continuing Listing Standards And Late Filing"),

    /**
     * Bankrupt Below Continuing Listing Standards And Late Filing
     */
    BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS_AND_LATE_FILING('7', "Bankrupt Below Continuing Listing Standards And Late Filing"),

    /**
     * Creations Suspended
     */
    CREATIONS_SUSPENDED('8', "Creations Suspended"),

    /**
     * Redemptions Suspended
     */
    REDEMPTIONS_SUSPENDED('9', "Redemptions Suspended"),

    /**
     * Liquidation
     */
    LIQUIDATION('A', "Liquidation");

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
            case '0' -> Optional.of(NOT_APPLICABLE);
            case '1' -> Optional.of(BANKRUPT);
            case '2' -> Optional.of(BELOW_CONTINUING_LISTING_STANDARDS);
            case '3' -> Optional.of(BANKRUPT_AND_BELOW_CONTINUING_LISTING_STANDARDS);
            case '4' -> Optional.of(LATE_FILING);
            case '5' -> Optional.of(BANKRUPT_AND_LATE_FILING);
            case '6' -> Optional.of(BELOW_CONTINUING_LISTING_STANDARDS_AND_LATE_FILING);
            case '7' -> Optional.of(BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS_AND_LATE_FILING);
            case '8' -> Optional.of(CREATIONS_SUSPENDED);
            case '9' -> Optional.of(REDEMPTIONS_SUSPENDED);
            case 'A' -> Optional.of(LIQUIDATION);
            default -> Optional.empty();
        };
    }
}
