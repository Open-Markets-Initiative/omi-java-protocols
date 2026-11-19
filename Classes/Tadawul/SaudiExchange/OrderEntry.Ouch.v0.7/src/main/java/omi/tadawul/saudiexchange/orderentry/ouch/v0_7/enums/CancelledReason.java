package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * Reason the order was cancelled. See enum for Cancel Order, unsolicited and Replace Order response codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelledReason {

    /**
     * User Requested
     */
    USER_REQUESTED('U', "User Requested"),

    /**
     * User Logged Off
     */
    USER_LOGGED_OFF('L', "User Logged Off"),

    /**
     * Supervisory Cancel By Market Control
     */
    SUPERVISORY_CANCEL_BY_MARKET_CONTROL('S', "Supervisory Cancel By Market Control"),

    /**
     * Immediate Order Expired
     */
    IMMEDIATE_ORDER_EXPIRED('I', "Immediate Order Expired"),

    /**
     * Timeout Order Expired
     */
    TIMEOUT_ORDER_EXPIRED('T', "Timeout Order Expired"),

    /**
     * Order Not Allowed At This Time
     */
    ORDER_NOT_ALLOWED_AT_THIS_TIME('R', "Order Not Allowed At This Time"),

    /**
     * Orderbook Is Not Tradeable
     */
    ORDERBOOK_IS_NOT_TRADEABLE('H', "Orderbook Is Not Tradeable"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY('Z', "Invalid Quantity"),

    /**
     * Flow Control
     */
    FLOW_CONTROL('F', "Flow Control"),

    /**
     * No Change In Order
     */
    NO_CHANGE_IN_ORDER('n', "No Change In Order"),

    /**
     * Self Match Prevention
     */
    SELF_MATCH_PREVENTION('C', "Self Match Prevention"),

    /**
     * Unknown Contact Support
     */
    UNKNOWN_CONTACT_SUPPORT('W', "Unknown Contact Support");

    private final char wire;

    private final String description;

    CancelledReason(char wire, String description) {
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
    public static Optional<CancelledReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'L' -> Optional.of(USER_LOGGED_OFF);
            case 'S' -> Optional.of(SUPERVISORY_CANCEL_BY_MARKET_CONTROL);
            case 'I' -> Optional.of(IMMEDIATE_ORDER_EXPIRED);
            case 'T' -> Optional.of(TIMEOUT_ORDER_EXPIRED);
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'H' -> Optional.of(ORDERBOOK_IS_NOT_TRADEABLE);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'Z' -> Optional.of(INVALID_QUANTITY);
            case 'F' -> Optional.of(FLOW_CONTROL);
            case 'n' -> Optional.of(NO_CHANGE_IN_ORDER);
            case 'C' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'W' -> Optional.of(UNKNOWN_CONTACT_SUPPORT);
            default -> Optional.empty();
        };
    }
}
