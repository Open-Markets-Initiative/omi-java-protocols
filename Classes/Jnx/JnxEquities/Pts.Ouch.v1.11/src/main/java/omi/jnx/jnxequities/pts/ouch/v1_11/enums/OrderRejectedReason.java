package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Reason the order was rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderRejectedReason {

    /**
     * Trading Halt
     */
    TRADING_HALT('H', "Trading Halt"),

    /**
     * Invalid Order Book Identifier
     */
    INVALID_ORDER_BOOK_IDENTIFIER('S', "Invalid Order Book Identifier"),

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
     * Invalid Margin Specification
     */
    INVALID_MARGIN_SPECIFICATION('G', "Invalid Margin Specification"),

    /**
     * Mpid Not Allowed For This Port
     */
    MPID_NOT_ALLOWED_FOR_THIS_PORT('L', "Mpid Not Allowed For This Port"),

    /**
     * No Permission To Enter Order On Given Board
     */
    NO_PERMISSION_TO_ENTER_ORDER_ON_GIVEN_BOARD('c', "No Permission To Enter Order On Given Board"),

    /**
     * Other
     */
    OTHER('O', "Other");

    private final char wire;

    private final String description;

    OrderRejectedReason(char wire, String description) {
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
    public static Optional<OrderRejectedReason> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(TRADING_HALT);
            case 'S' -> Optional.of(INVALID_ORDER_BOOK_IDENTIFIER);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'Z' -> Optional.of(INVALID_QUANTITY);
            case 'N' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'Y' -> Optional.of(INVALID_ORDER_TYPE);
            case 'D' -> Optional.of(INVALID_DISPLAY_TYPE);
            case 'V' -> Optional.of(EXCEEDED_ORDER_VALUE_LIMIT);
            case 'i' -> Optional.of(SHORT_SELL_ORDER_RESTRICTION);
            case 'R' -> Optional.of(ORDER_NOT_ALLOWED_AT_THIS_TIME);
            case 'F' -> Optional.of(FLOW_CONTROL_THROTTLED);
            case 'G' -> Optional.of(INVALID_MARGIN_SPECIFICATION);
            case 'L' -> Optional.of(MPID_NOT_ALLOWED_FOR_THIS_PORT);
            case 'c' -> Optional.of(NO_PERMISSION_TO_ENTER_ORDER_ON_GIVEN_BOARD);
            case 'O' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
