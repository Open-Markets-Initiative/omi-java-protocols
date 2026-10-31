package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * Order Capacity value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCapacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Customer Professional
     */
    CUSTOMER_PROFESSIONAL('D', "Customer Professional"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * Broker/Dealer - Customer
     */
    BROKER_DEALER_CUSTOMER('B', "Broker/Dealer - Customer"),

    /**
     * Broker/Dealer - Firm
     */
    BROKER_DEALER_FIRM('K', "Broker/Dealer - Firm"),

    /**
     * Proprietary
     */
    PROPRIETARY('E', "Proprietary"),

    /**
     * Away Market Maker
     */
    AWAY_MARKET_MAKER('N', "Away Market Maker"),

    /**
     * Market Maker
     */
    MARKET_MAKER('M', "Market Maker");

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
            case 'C' -> Optional.of(CUSTOMER);
            case 'D' -> Optional.of(CUSTOMER_PROFESSIONAL);
            case 'F' -> Optional.of(FIRM);
            case 'B' -> Optional.of(BROKER_DEALER_CUSTOMER);
            case 'K' -> Optional.of(BROKER_DEALER_FIRM);
            case 'E' -> Optional.of(PROPRIETARY);
            case 'N' -> Optional.of(AWAY_MARKET_MAKER);
            case 'M' -> Optional.of(MARKET_MAKER);
            default -> Optional.empty();
        };
    }
}
