package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.enums;

import java.util.Optional;

/**
 * Origin of the order for direct electronic access reporting
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeaIndicatorValue {

    /**
     * Order Received From A Customer
     */
    ORDER_RECEIVED_FROM_A_CUSTOMER('1', "Order Received From A Customer"),

    /**
     * Order Received From Within The Firm
     */
    ORDER_RECEIVED_FROM_WITHIN_THE_FIRM('2', "Order Received From Within The Firm"),

    /**
     * Order Received From Another Broker Dealer
     */
    ORDER_RECEIVED_FROM_ANOTHER_BROKER_DEALER('3', "Order Received From Another Broker Dealer"),

    /**
     * Order Received From A Customer Or Originated With The Firm
     */
    ORDER_RECEIVED_FROM_A_CUSTOMER_OR_ORIGINATED_WITH_THE_FIRM('4', "Order Received From A Customer Or Originated With The Firm"),

    /**
     * Order Received From A Direct Access Or Sponsored Access Customer
     */
    ORDER_RECEIVED_FROM_A_DIRECT_ACCESS_OR_SPONSORED_ACCESS_CUSTOMER('5', "Order Received From A Direct Access Or Sponsored Access Customer");

    private final char wire;

    private final String description;

    DeaIndicatorValue(char wire, String description) {
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
    public static Optional<DeaIndicatorValue> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ORDER_RECEIVED_FROM_A_CUSTOMER);
            case '2' -> Optional.of(ORDER_RECEIVED_FROM_WITHIN_THE_FIRM);
            case '3' -> Optional.of(ORDER_RECEIVED_FROM_ANOTHER_BROKER_DEALER);
            case '4' -> Optional.of(ORDER_RECEIVED_FROM_A_CUSTOMER_OR_ORIGINATED_WITH_THE_FIRM);
            case '5' -> Optional.of(ORDER_RECEIVED_FROM_A_DIRECT_ACCESS_OR_SPONSORED_ACCESS_CUSTOMER);
            default -> Optional.empty();
        };
    }
}
