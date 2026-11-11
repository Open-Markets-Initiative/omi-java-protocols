package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Return message type for which the bitfields are being specified (e.g., 0x25 for an Order Acknowledgment message).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Login Request Message.
     */
    LOGIN_REQUEST_MESSAGE((short) 55, "Login Request Message."),

    /**
     * Logout Request Message.
     */
    LOGOUT_REQUEST_MESSAGE((short) 2, "Logout Request Message."),

    /**
     * Client Heartbeat Message.
     */
    CLIENT_HEARTBEAT_MESSAGE((short) 3, "Client Heartbeat Message."),

    /**
     * Login Response Message.
     */
    LOGIN_RESPONSE_MESSAGE((short) 36, "Login Response Message."),

    /**
     * Logout Message.
     */
    LOGOUT_MESSAGE((short) 8, "Logout Message."),

    /**
     * Server Heartbeat Message.
     */
    SERVER_HEARTBEAT_MESSAGE((short) 9, "Server Heartbeat Message."),

    /**
     * Replay Complete Message.
     */
    REPLAY_COMPLETE_MESSAGE((short) 19, "Replay Complete Message."),

    /**
     * New Order Message.
     */
    NEW_ORDER_MESSAGE((short) 56, "New Order Message."),

    /**
     * Cancel Order Message.
     */
    CANCEL_ORDER_MESSAGE((short) 57, "Cancel Order Message."),

    /**
     * Modify Order Message.
     */
    MODIFY_ORDER_MESSAGE((short) 58, "Modify Order Message."),

    /**
     * Purge Order Message.
     */
    PURGE_ORDER_MESSAGE((short) 71, "Purge Order Message."),

    /**
     * Order Acknowledgment Message.
     */
    ORDER_ACKNOWLEDGMENT_MESSAGE((short) 37, "Order Acknowledgment Message."),

    /**
     * Order Rejected Message.
     */
    ORDER_REJECTED_MESSAGE((short) 38, "Order Rejected Message."),

    /**
     * Order Modified Message.
     */
    ORDER_MODIFIED_MESSAGE((short) 39, "Order Modified Message."),

    /**
     * Order Restated Message.
     */
    ORDER_RESTATED_MESSAGE((short) 40, "Order Restated Message."),

    /**
     * User Modify Rejected Message.
     */
    USER_MODIFY_REJECTED_MESSAGE((short) 41, "User Modify Rejected Message."),

    /**
     * Order Cancelled Message.
     */
    ORDER_CANCELLED_MESSAGE((short) 42, "Order Cancelled Message."),

    /**
     * Cancel Rejected Message.
     */
    CANCEL_REJECTED_MESSAGE((short) 43, "Cancel Rejected Message."),

    /**
     * Order Execution Message.
     */
    ORDER_EXECUTION_MESSAGE((short) 44, "Order Execution Message."),

    /**
     * Trade Cancel or Correct Message.
     */
    TRADE_CANCEL_OR_CORRECT_MESSAGE((short) 45, "Trade Cancel or Correct Message."),

    /**
     * Mass Cancel Acknowledgment Message.
     */
    MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE((short) 54, "Mass Cancel Acknowledgment Message."),

    /**
     * Purge Rejected Message.
     */
    PURGE_REJECTED_MESSAGE((short) 72, "Purge Rejected Message.");

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
            case 55 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 3 -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 36 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 8 -> Optional.of(LOGOUT_MESSAGE);
            case 9 -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 19 -> Optional.of(REPLAY_COMPLETE_MESSAGE);
            case 56 -> Optional.of(NEW_ORDER_MESSAGE);
            case 57 -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 71 -> Optional.of(PURGE_ORDER_MESSAGE);
            case 37 -> Optional.of(ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 38 -> Optional.of(ORDER_REJECTED_MESSAGE);
            case 39 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 40 -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 41 -> Optional.of(USER_MODIFY_REJECTED_MESSAGE);
            case 42 -> Optional.of(ORDER_CANCELLED_MESSAGE);
            case 43 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 44 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 45 -> Optional.of(TRADE_CANCEL_OR_CORRECT_MESSAGE);
            case 54 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE);
            case 72 -> Optional.of(PURGE_REJECTED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
