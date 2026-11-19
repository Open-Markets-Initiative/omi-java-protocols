package omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1_2026.enums;

import java.util.Optional;

/**
 * Order Capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCapacity {

    /**
     * Customer Order
     */
    CUSTOMER_ORDER('C', "Customer Order"),

    /**
     * Firm Order
     */
    FIRM_ORDER('F', "Firm Order"),

    /**
     * Market Maker Order
     */
    MARKET_MAKER_ORDER('M', "Market Maker Order"),

    /**
     * Broker Dealer Order
     */
    BROKER_DEALER_ORDER('B', "Broker Dealer Order"),

    /**
     * Professional Order
     */
    PROFESSIONAL_ORDER('P', "Professional Order"),

    /**
     * Other Exchange Market Maker Order
     */
    OTHER_EXCHANGE_MARKET_MAKER_ORDER('O', "Other Exchange Market Maker Order"),

    /**
     * N/A
     */
    NA(' ', "N/A");

    private final char wire;

    private final String description;

    OrderCapacity(char wire, String description) {
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
    public static Optional<OrderCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER_ORDER);
            case 'F' -> Optional.of(FIRM_ORDER);
            case 'M' -> Optional.of(MARKET_MAKER_ORDER);
            case 'B' -> Optional.of(BROKER_DEALER_ORDER);
            case 'P' -> Optional.of(PROFESSIONAL_ORDER);
            case 'O' -> Optional.of(OTHER_EXCHANGE_MARKET_MAKER_ORDER);
            case ' ' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
