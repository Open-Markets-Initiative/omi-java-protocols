package omi.cboe.bzxequities.multicastdepthofbook.spin.v2_20_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the Grp.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the Grp."),

    /**
     * The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * Spin Image Available message
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "Spin Image Available message"),

    /**
     * Spin Request message
     */
    SPIN_REQUEST_MESSAGE((short) 129, "Spin Request message"),

    /**
     * Spin Response message
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "Spin Response message"),

    /**
     * Spin Finished message
     */
    SPIN_FINISHED_MESSAGE((short) 131, "Spin Finished message"),

    /**
     * Time message
     */
    TIME_MESSAGE((short) 32, "Time message"),

    /**
     * Unit Clear message
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Unit Clear message"),

    /**
     * Add Order message (long)
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "Add Order message (long)"),

    /**
     * Add Order message (short)
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "Add Order message (short)"),

    /**
     * Add Order message (expanded)
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "Add Order message (expanded)"),

    /**
     * Order Executed message
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed message"),

    /**
     * Order Executed at Price/Size
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size"),

    /**
     * Reduce Size message (long)
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size message (long)"),

    /**
     * Reduce Size message (short)
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size message (short)"),

    /**
     * Modify Order message (long)
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "Modify Order message (long)"),

    /**
     * Modify Order message (short)
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "Modify Order message (short)"),

    /**
     * Delete Order message
     */
    DELETE_ORDER_MESSAGE((short) 41, "Delete Order message"),

    /**
     * Trade message (long)
     */
    TRADE_LONG_MESSAGE((short) 42, "Trade message (long)"),

    /**
     * Trade message (short)
     */
    TRADE_SHORT_MESSAGE((short) 43, "Trade message (short)"),

    /**
     * Trade message (long)
     */
    TRADE_EXPANDED_MESSAGE((short) 48, "Trade message (long)"),

    /**
     * Trade Break message
     */
    TRADE_BREAK_MESSAGE((short) 44, "Trade Break message"),

    /**
     * End of Session message
     */
    END_OF_SESSION_MESSAGE((short) 45, "End of Session message"),

    /**
     * Symbol Mapping message
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "Symbol Mapping message"),

    /**
     * Trading Status message
     */
    TRADING_STATUS_MESSAGE((short) 49, "Trading Status message"),

    /**
     * Auction Update message
     */
    AUCTION_UPDATE_MESSAGE((short) 149, "Auction Update message"),

    /**
     * Auction Summary message
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary message"),

    /**
     * Retail Price Improvement message
     */
    RETAIL_PRICE_IMPROVEMENT_MESSAGE((short) 152, "Retail Price Improvement message");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGIN_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 128 -> Optional.of(SPIN_IMAGE_AVAILABLE_MESSAGE);
            case 129 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 130 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SPIN_FINISHED_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 33 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 42 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 48 -> Optional.of(TRADE_EXPANDED_MESSAGE);
            case 44 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 149 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 152 -> Optional.of(RETAIL_PRICE_IMPROVEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
