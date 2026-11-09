package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Reason order was reduced or canceled
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderCanceledReason {

    /**
     * User Requested Cancel
     */
    USER_REQUESTED_CANCEL('U', "User Requested Cancel"),

    /**
     * User Logged Off
     */
    USER_LOGGED_OFF('L', "User Logged Off"),

    /**
     * Canceled By Supervisory Terminal
     */
    CANCELED_BY_SUPERVISORY_TERMINAL('S', "Canceled By Supervisory Terminal"),

    /**
     * Immediate Order Remaining Quantity Canceled
     */
    IMMEDIATE_ORDER_REMAINING_QUANTITY_CANCELED('I', "Immediate Order Remaining Quantity Canceled"),

    /**
     * Order Expired During Matching
     */
    ORDER_EXPIRED_DURING_MATCHING('M', "Order Expired During Matching"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY('Z', "Invalid Quantity"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('N', "Invalid Minimum Quantity"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('Y', "Invalid Order Type"),

    /**
     * Invalid Display Type
     */
    INVALID_DISPLAY_TYPE('D', "Invalid Display Type"),

    /**
     * Exceeded Order Value Limit
     */
    EXCEEDED_ORDER_VALUE_LIMIT('V', "Exceeded Order Value Limit"),

    /**
     * Short Sell Order Restriction
     */
    SHORT_SELL_ORDER_RESTRICTION('i', "Short Sell Order Restriction"),

    /**
     * Order Not Allowed At This Time
     */
    ORDER_NOT_ALLOWED_AT_THIS_TIME('R', "Order Not Allowed At This Time"),

    /**
     * Flow Control Throttled
     */
    FLOW_CONTROL_THROTTLED('F', "Flow Control Throttled"),

    /**
     * Margin Order Canceled Due To Margin Restriction
     */
    MARGIN_ORDER_CANCELED_DUE_TO_MARGIN_RESTRICTION('G', "Margin Order Canceled Due To Margin Restriction"),

    /**
     * Other
     */
    OTHER('O', "Other");

    private final char wire;

    private final String description;

    OrderCanceledReason(char wire, String description) {
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
    public static Optional<OrderCanceledReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED_CANCEL);
            case 'L' -> Optional.of(USER_LOGGED_OFF);
            case 'S' -> Optional.of(CANCELED_BY_SUPERVISORY_TERMINAL);
            case 'I' -> Optional.of(IMMEDIATE_ORDER_REMAINING_QUANTITY_CANCELED);
            case 'M' -> Optional.of(ORDER_EXPIRED_DURING_MATCHING);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'Z' -> Optional.of(INVALID_QUANTITY);
            case 'N' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'Y' -> Optional.of(INVALID_ORDER_TYPE);
            case 'D' -> Optional.of(INVALID_DISPLAY_TYPE);
            case 'V' -> Optional.of(EXCEEDED_ORDER_VALUE_LIMIT);
            case 'i' -> Optional.of(SHORT_SELL_ORDER_RESTRICTION);
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'F' -> Optional.of(FLOW_CONTROL_THROTTLED);
            case 'G' -> Optional.of(MARGIN_ORDER_CANCELED_DUE_TO_MARGIN_RESTRICTION);
            case 'O' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
