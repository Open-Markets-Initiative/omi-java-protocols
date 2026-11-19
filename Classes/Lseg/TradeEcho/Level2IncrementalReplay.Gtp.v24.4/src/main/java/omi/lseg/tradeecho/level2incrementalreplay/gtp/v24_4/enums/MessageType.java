package omi.lseg.tradeecho.level2incrementalreplay.gtp.v24_4.enums;

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
     * Session transition is advertised via one system event message for all instruments allocated to the same multicast channel
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Session transition is advertised via one system event message for all instruments allocated to the same multicast channel"),

    /**
     * Used to disseminate a common and limited set of data for all configured instrument types (except strategy instruments) on the real time channels
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a common and limited set of data for all configured instrument types (except strategy instruments) on the real time channels"),

    /**
     * A specific instrument be subject to individual status change
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "A specific instrument be subject to individual status change"),

    /**
     * Sent to instruct recipients to delete an order from the retrospective order book
     */
    ORDER_DELETE_MESSAGE((short) 68, "Sent to instruct recipients to delete an order from the retrospective order book"),

    /**
     * Sent to instruct recipients to remove all orders from the order book for the specified instrument
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all orders from the order book for the specified instrument"),

    /**
     * Publishing systematic internaliser quotes
     */
    SYSTEMATIC_INTERNALISER_QUOTES_MESSAGE((short) 71, "Publishing systematic internaliser quotes");

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
            case 68 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 121 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 71 -> Optional.of(SYSTEMATIC_INTERNALISER_QUOTES_MESSAGE);
            default -> Optional.empty();
        };
    }
}
