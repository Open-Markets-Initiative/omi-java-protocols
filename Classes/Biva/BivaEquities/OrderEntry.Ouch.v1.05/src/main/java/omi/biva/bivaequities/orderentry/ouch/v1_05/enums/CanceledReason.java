package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * Reason the order was cancelled
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CanceledReason {

    /**
     * User Requested Cancel
     */
    USER_REQUESTED_CANCEL('U', "User Requested Cancel"),

    /**
     * Immediate Order Expired
     */
    IMMEDIATE_ORDER_EXPIRED('I', "Immediate Order Expired"),

    /**
     * Timeout Session Or Day Order Expired
     */
    TIMEOUT_SESSION_OR_DAY_ORDER_EXPIRED('T', "Timeout Session Or Day Order Expired"),

    /**
     * Supervisory
     */
    SUPERVISORY('S', "Supervisory"),

    /**
     * User Logged Off
     */
    USER_LOGGED_OFF('L', "User Logged Off"),

    /**
     * Invalid Quantity Or Quantity Exceeds Maximum Limit
     */
    INVALID_QUANTITY_OR_QUANTITY_EXCEEDS_MAXIMUM_LIMIT('Z', "Invalid Quantity Or Quantity Exceeds Maximum Limit"),

    /**
     * Order Not Allowed At This Time
     */
    ORDER_NOT_ALLOWED_AT_THIS_TIME('R', "Order Not Allowed At This Time"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('N', "Invalid Minimum Quantity"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('Y', "Invalid Order Type"),

    /**
     * Flow Control In Place For User
     */
    FLOW_CONTROL_IN_PLACE_FOR_USER('F', "Flow Control In Place For User"),

    /**
     * Unknown
     */
    UNKNOWN('W', "Unknown");

    private final char wire;

    private final String description;

    CanceledReason(char wire, String description) {
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
    public static Optional<CanceledReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED_CANCEL);
            case 'I' -> Optional.of(IMMEDIATE_ORDER_EXPIRED);
            case 'T' -> Optional.of(TIMEOUT_SESSION_OR_DAY_ORDER_EXPIRED);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'L' -> Optional.of(USER_LOGGED_OFF);
            case 'Z' -> Optional.of(INVALID_QUANTITY_OR_QUANTITY_EXCEEDS_MAXIMUM_LIMIT);
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'N' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'Y' -> Optional.of(INVALID_ORDER_TYPE);
            case 'F' -> Optional.of(FLOW_CONTROL_IN_PLACE_FOR_USER);
            case 'W' -> Optional.of(UNKNOWN);
            default -> Optional.empty();
        };
    }
}
