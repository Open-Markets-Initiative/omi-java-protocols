package omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.enums;

import java.util.Optional;

/**
 * Indicates the order capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DepthOrderCapacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * Nasdaq registered Market Maker
     */
    NASDAQ_REGISTERED_MARKET_MAKER('M', "Nasdaq registered Market Maker"),

    /**
     * Broker Dealer Order
     */
    BROKER_DEALER_ORDER('B', "Broker Dealer Order"),

    /**
     * Professional Order
     */
    PROFESSIONAL_ORDER('P', "Professional Order"),

    /**
     * Other exchange registered market maker
     */
    OTHER_EXCHANGE_REGISTERED_MARKET_MAKER('O', "Other exchange registered market maker"),

    /**
     * JBO (Joint Back Office, Only PHLX)
     */
    JBO_JOINT_BACK_OFFICE_ONLY_PHLX('J', "JBO (Joint Back Office, Only PHLX)");

    private final char wire;

    private final String description;

    DepthOrderCapacity(char wire, String description) {
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
    public static Optional<DepthOrderCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'F' -> Optional.of(FIRM);
            case 'M' -> Optional.of(NASDAQ_REGISTERED_MARKET_MAKER);
            case 'B' -> Optional.of(BROKER_DEALER_ORDER);
            case 'P' -> Optional.of(PROFESSIONAL_ORDER);
            case 'O' -> Optional.of(OTHER_EXCHANGE_REGISTERED_MARKET_MAKER);
            case 'J' -> Optional.of(JBO_JOINT_BACK_OFFICE_ONLY_PHLX);
            default -> Optional.empty();
        };
    }
}
