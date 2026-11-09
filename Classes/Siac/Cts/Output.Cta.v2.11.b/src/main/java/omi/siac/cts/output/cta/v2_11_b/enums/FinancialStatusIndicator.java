package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the financial status of the security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinancialStatusIndicator {

    /**
     * Financial Status Not Applicable
     */
    FINANCIAL_STATUS_NOT_APPLICABLE('0', "Financial Status Not Applicable"),

    /**
     * Bankrupt
     */
    BANKRUPT('1', "Bankrupt"),

    /**
     * Below Continuing Listing Standards
     */
    BELOW_CONTINUING_LISTING_STANDARDS('2', "Below Continuing Listing Standards"),

    /**
     * Bankrupt Below Continuing Listing Standards
     */
    BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS('3', "Bankrupt Below Continuing Listing Standards"),

    /**
     * Late Filing
     */
    LATE_FILING('4', "Late Filing"),

    /**
     * Bankrupt Late Filing
     */
    BANKRUPT_LATE_FILING('5', "Bankrupt Late Filing"),

    /**
     * Below Continuing Listing Standards Late Filing
     */
    BELOW_CONTINUING_LISTING_STANDARDS_LATE_FILING('6', "Below Continuing Listing Standards Late Filing"),

    /**
     * Bankrupt Below Continuing Listing Standards Late Filing
     */
    BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS_LATE_FILING('7', "Bankrupt Below Continuing Listing Standards Late Filing"),

    /**
     * Creations Suspended For Exchange Traded Products
     */
    CREATIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCTS('8', "Creations Suspended For Exchange Traded Products"),

    /**
     * Redemptions Suspended For Exchange Traded Products
     */
    REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCTS('9', "Redemptions Suspended For Exchange Traded Products"),

    /**
     * Liquidation For Exchange Traded Products
     */
    LIQUIDATION_FOR_EXCHANGE_TRADED_PRODUCTS('A', "Liquidation For Exchange Traded Products");

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
            case '0' -> Optional.of(FINANCIAL_STATUS_NOT_APPLICABLE);
            case '1' -> Optional.of(BANKRUPT);
            case '2' -> Optional.of(BELOW_CONTINUING_LISTING_STANDARDS);
            case '3' -> Optional.of(BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS);
            case '4' -> Optional.of(LATE_FILING);
            case '5' -> Optional.of(BANKRUPT_LATE_FILING);
            case '6' -> Optional.of(BELOW_CONTINUING_LISTING_STANDARDS_LATE_FILING);
            case '7' -> Optional.of(BANKRUPT_BELOW_CONTINUING_LISTING_STANDARDS_LATE_FILING);
            case '8' -> Optional.of(CREATIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCTS);
            case '9' -> Optional.of(REDEMPTIONS_SUSPENDED_FOR_EXCHANGE_TRADED_PRODUCTS);
            case 'A' -> Optional.of(LIQUIDATION_FOR_EXCHANGE_TRADED_PRODUCTS);
            default -> Optional.empty();
        };
    }
}
