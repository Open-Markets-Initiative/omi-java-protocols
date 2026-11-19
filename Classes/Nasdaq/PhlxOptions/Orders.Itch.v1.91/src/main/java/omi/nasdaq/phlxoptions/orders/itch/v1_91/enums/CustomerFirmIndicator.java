package omi.nasdaq.phlxoptions.orders.itch.v1_91.enums;

import java.util.Optional;

/**
 * Indicates whether this is a Customer/Firm
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerFirmIndicator {

    /**
     * Customer Order
     */
    CUSTOMER_ORDER('C', "Customer Order"),

    /**
     * Firm Order
     */
    FIRM_ORDER('F', "Firm Order"),

    /**
     * On-floor Market Maker
     */
    ON_FLOOR_MARKET_MAKER('M', "On-floor Market Maker"),

    /**
     * Broker Dealer Order
     */
    BROKER_DEALER_ORDER('B', "Broker Dealer Order"),

    /**
     * Professional Order
     */
    PROFESSIONAL_ORDER('P', "Professional Order"),

    /**
     * N/A (For Implied Order)
     */
    NA_FOR_IMPLIED_ORDER(' ', "N/A (For Implied Order)");

    private final char wire;

    private final String description;

    CustomerFirmIndicator(char wire, String description) {
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
    public static Optional<CustomerFirmIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER_ORDER);
            case 'F' -> Optional.of(FIRM_ORDER);
            case 'M' -> Optional.of(ON_FLOOR_MARKET_MAKER);
            case 'B' -> Optional.of(BROKER_DEALER_ORDER);
            case 'P' -> Optional.of(PROFESSIONAL_ORDER);
            case ' ' -> Optional.of(NA_FOR_IMPLIED_ORDER);
            default -> Optional.empty();
        };
    }
}
