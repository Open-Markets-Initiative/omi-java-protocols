package omi.lseg.turquoise.replay.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Used by the client to log in to the replay or recovery channel.
     */
    LOGIN_REQUEST_MESSAGE((short) 1, "Used by the client to log in to the replay or recovery channel."),

    /**
     * Used by the client to request a retransmission of messages on the replay channel.
     */
    REPLAY_REQUEST_MESSAGE((short) 3, "Used by the client to request a retransmission of messages on the replay channel."),

    /**
     * Used by the server to accept or reject a login request to the replay or recovery channel.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Used by the server to accept or reject a login request to the replay or recovery channel."),

    /**
     * Used by the server to respond to a retransmission request on the replay channel.
     */
    REPLAY_RESPONSE_MESSAGE((short) 4, "Used by the server to respond to a retransmission request on the replay channel."),

    /**
     * Used by the server to indicate the successful completion of servicing a message replay or a recovery request.
     */
    REPLAY_AND_RECOVERY_COMPLETE_MESSAGE((short) 131, "Used by the server to indicate the successful completion of servicing a message replay or a recovery request."),

    /**
     * Sent to indicate the start and end of the day.
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Sent to indicate the start and end of the day."),

    /**
     * Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels"),

    /**
     * Used to communicate scheduled and unscheduled session changes
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Used to communicate scheduled and unscheduled session changes"),

    /**
     * Sent to instruct recipients to add a new displayable order to the retrospective order book
     */
    ADD_ORDER_INCREMENTAL_MESSAGE((short) 70, "Sent to instruct recipients to add a new displayable order to the retrospective order book"),

    /**
     * Sent to instruct recipients to update an order's price and/or size on the retrospective order book
     */
    ORDER_MODIFY_MESSAGE((short) 85, "Sent to instruct recipients to update an order's price and/or size on the retrospective order book"),

    /**
     * Sent to instruct recipients to delete an order from the retrospective order book
     */
    ORDER_DELETE_MESSAGE((short) 68, "Sent to instruct recipients to delete an order from the retrospective order book"),

    /**
     * Used to update the level 1 service following any change to the consolidated Best Bid and Offer
     */
    TOP_OF_BOOK_MESSAGE((short) 105, "Used to update the level 1 service following any change to the consolidated Best Bid and Offer"),

    /**
     * Sent to instruct recipients to remove all orders from the order book for the specified instrument
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all orders from the order book for the specified instrument"),

    /**
     * Sent to indicate trades executed on supported markets
     */
    TRADE_MESSAGE((short) 80, "Sent to indicate trades executed on supported markets"),

    /**
     * Sent to indicate a cross trade execution
     */
    TRADE_CROSS_MESSAGE((short) 113, "Sent to indicate a cross trade execution"),

    /**
     * Contains a set of statistics that are updated frequently, usually as a result of executions
     */
    STATISTICS_MESSAGE((short) 119, "Contains a set of statistics that are updated frequently, usually as a result of executions"),

    /**
     * Contains a set of statistics that are not updated frequently
     */
    STATISTICS_UPDATE_MESSAGE((short) 106, "Contains a set of statistics that are not updated frequently"),

    /**
     * Sent to represent different types of MiFID compliant trades published by markets
     */
    MIFID_II_TRADE_MESSAGE((short) 81, "Sent to represent different types of MiFID compliant trades published by markets"),

    /**
     * Sent to indicate a MiFID compliant cross trade
     */
    MI_FID_II_TRADE_CROSS_MESSAGE((short) 86, "Sent to indicate a MiFID compliant cross trade"),

    /**
     * Trade Summary message is used to disseminate results of multi and single fill trade events
     */
    TRADE_SUMMARY_MESSAGE((short) 87, "Trade Summary message is used to disseminate results of multi and single fill trade events"),

    /**
     * Used to disseminate additional statistics including order book activity statistics
     */
    ANALYTICS_MESSAGE((short) 97, "Used to disseminate additional statistics including order book activity statistics");

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
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 3 -> Optional.of(REPLAY_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 4 -> Optional.of(REPLAY_RESPONSE_MESSAGE);
            case 131 -> Optional.of(REPLAY_AND_RECOVERY_COMPLETE_MESSAGE);
            case 83 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 112 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 72 -> Optional.of(INSTRUMENT_STATUS_MESSAGE);
            case 70 -> Optional.of(ADD_ORDER_INCREMENTAL_MESSAGE);
            case 85 -> Optional.of(ORDER_MODIFY_MESSAGE);
            case 68 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 105 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 121 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 80 -> Optional.of(TRADE_MESSAGE);
            case 113 -> Optional.of(TRADE_CROSS_MESSAGE);
            case 119 -> Optional.of(STATISTICS_MESSAGE);
            case 106 -> Optional.of(STATISTICS_UPDATE_MESSAGE);
            case 81 -> Optional.of(MIFID_II_TRADE_MESSAGE);
            case 86 -> Optional.of(MI_FID_II_TRADE_CROSS_MESSAGE);
            case 87 -> Optional.of(TRADE_SUMMARY_MESSAGE);
            case 97 -> Optional.of(ANALYTICS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
