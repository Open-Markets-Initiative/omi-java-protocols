package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * The reason the order was rejected. Refer to reason codes enum
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectedReason {

    /**
     * Order Not Allowed At This Time
     */
    ORDER_NOT_ALLOWED_AT_THIS_TIME('R', "Order Not Allowed At This Time"),

    /**
     * Invalid Order Type Eg Bad Time In Force
     */
    INVALID_ORDER_TYPE_EG_BAD_TIME_IN_FORCE('Y', "Invalid Order Type Eg Bad Time In Force"),

    /**
     * Invalid Account
     */
    INVALID_ACCOUNT('a', "Invalid Account"),

    /**
     * Invalid Csd Account
     */
    INVALID_CSD_ACCOUNT('c', "Invalid Csd Account"),

    /**
     * Orderbook Is Not Tradeable
     */
    ORDERBOOK_IS_NOT_TRADEABLE('H', "Orderbook Is Not Tradeable"),

    /**
     * Invalid Orderbook Identifier
     */
    INVALID_ORDERBOOK_IDENTIFIER('S', "Invalid Orderbook Identifier"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('N', "Invalid Minimum Quantity"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY('Z', "Invalid Quantity"),

    /**
     * Flow Control Throttled
     */
    FLOW_CONTROL_THROTTLED('F', "Flow Control Throttled"),

    /**
     * Invalid Self Match Prevention Id
     */
    INVALID_SELF_MATCH_PREVENTION_ID('s', "Invalid Self Match Prevention Id"),

    /**
     * Market Maker Restriction
     */
    MARKET_MAKER_RESTRICTION('M', "Market Maker Restriction"),

    /**
     * Unknown
     */
    UNKNOWN('W', "Unknown");

    private final char wire;

    private final String description;

    RejectedReason(char wire, String description) {
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
    public static Optional<RejectedReason> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'Y' -> Optional.of(INVALID_ORDER_TYPE_EG_BAD_TIME_IN_FORCE);
            case 'a' -> Optional.of(INVALID_ACCOUNT);
            case 'c' -> Optional.of(INVALID_CSD_ACCOUNT);
            case 'H' -> Optional.of(ORDERBOOK_IS_NOT_TRADEABLE);
            case 'S' -> Optional.of(INVALID_ORDERBOOK_IDENTIFIER);
            case 'N' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'Z' -> Optional.of(INVALID_QUANTITY);
            case 'F' -> Optional.of(FLOW_CONTROL_THROTTLED);
            case 's' -> Optional.of(INVALID_SELF_MATCH_PREVENTION_ID);
            case 'M' -> Optional.of(MARKET_MAKER_RESTRICTION);
            case 'W' -> Optional.of(UNKNOWN);
            default -> Optional.empty();
        };
    }
}
