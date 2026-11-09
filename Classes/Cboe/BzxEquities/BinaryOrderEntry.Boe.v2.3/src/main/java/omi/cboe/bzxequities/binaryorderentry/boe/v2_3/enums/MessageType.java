package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Defines the MessageType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to ‘A’. On a failed login, LoginResponseStatus will be set to a value other than ‘A’, and LoginResponseText will be set to an appropriate failure description.
     */
    LOGIN_REQUEST_MESSAGE((short) 55, "A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to \u2018A\u2019. On a failed login, LoginResponseStatus will be set to a value other than \u2018A\u2019, and LoginResponseText will be set to an appropriate failure description."),

    /**
     * To end the session, the Member should send a Logout Request message. Cboe will finish sending any queued data and finally respond with a Logout message and close the connection.
     */
    LOGOUT_REQUEST_MESSAGE((short) 2, "To end the session, the Member should send a Logout Request message. Cboe will finish sending any queued data and finally respond with a Logout message and close the connection."),

    /**
     * Heartbeat.
     */
    CLIENT_HEARTBEAT_MESSAGE((short) 3, "Heartbeat."),

    /**
     * A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to ‘A’. On a failed login, LoginResponseStatus will be set to a value other than ‘A’, and LoginResponseText will be set to an appropriate failure description.
     */
    LOGIN_RESPONSE_MESSAGE((short) 36, "A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to \u2018A\u2019. On a failed login, LoginResponseStatus will be set to a value other than \u2018A\u2019, and LoginResponseText will be set to an appropriate failure description."),

    /**
     * A Logout is usually sent in response to a Logout Request. Any queued data is transmitted, a Logout is sent, and Cboe will close the connection.
     */
    LOGOUT_MESSAGE((short) 8, "A Logout is usually sent in response to a Logout Request. Any queued data is transmitted, a Logout is sent, and Cboe will close the connection."),

    /**
     * Heartbeat.
     */
    SERVER_HEARTBEAT_MESSAGE((short) 9, "Heartbeat."),

    /**
     * Replay Complete.
     */
    REPLAY_COMPLETE_MESSAGE((short) 19, "Replay Complete."),

    /**
     * A new order message consists of a number of required fields followed by a number of optional fields.
     */
    NEW_ORDER_MESSAGE((short) 56, "A new order message consists of a number of required fields followed by a number of optional fields."),

    /**
     * Request to cancel either a single order or mass cancellation of a group of orders.
     */
    CANCEL_ORDER_MESSAGE((short) 57, "Request to cancel either a single order or mass cancellation of a group of orders."),

    /**
     * Request to modify an order.
     */
    MODIFY_ORDER_MESSAGE((short) 58, "Request to modify an order."),

    /**
     * Request to cancel a group of orders across all the firm’s sessions.
     */
    PURGE_ORDER_MESSAGE((short) 71, "Request to cancel a group of orders across all the firm\u2019s sessions."),

    /**
     * An order has been acknowledged
     */
    ORDER_ACKNOWLEDGMENT_MESSAGE((short) 37, "An order has been acknowledged"),

    /**
     * Order Rejected messages are sent in response to a New Order which must be rejected.
     */
    ORDER_REJECTED_MESSAGE((short) 38, "Order Rejected messages are sent in response to a New Order which must be rejected."),

    /**
     * Order Modified messages are sent in response to a Modify Request to indicate that the order has been successfully modified.
     */
    ORDER_MODIFIED_MESSAGE((short) 39, "Order Modified messages are sent in response to a Modify Request to indicate that the order has been successfully modified."),

    /**
     * Order Restated messages are sent to inform the Member that an order has been asynchronously modified.
     */
    ORDER_RESTATED_MESSAGE((short) 40, "Order Restated messages are sent to inform the Member that an order has been asynchronously modified."),

    /**
     * User Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified.
     */
    USER_MODIFY_REJECTED_MESSAGE((short) 41, "User Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified."),

    /**
     * An order has been cancelled.
     */
    ORDER_CANCELLED_MESSAGE((short) 42, "An order has been cancelled."),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur. Cancel Rejected messages are unsequenced.
     */
    CANCEL_REJECTED_MESSAGE((short) 43, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur. Cancel Rejected messages are unsequenced."),

    /**
     * An Order Execution is sent for each fill on an order.
     */
    ORDER_EXECUTION_MESSAGE((short) 44, "An Order Execution is sent for each fill on an order."),

    /**
     * Used to relay a trade which has been cancelled (busted) or corrected (price or size change only).
     */
    TRADE_CANCEL_OR_CORRECT_MESSAGE((short) 45, "Used to relay a trade which has been cancelled (busted) or corrected (price or size change only)."),

    /**
     * A Mass Cancel Acknowledgment is an unsequenced message sent when a Cancel Order or Purge Orders message requesting a mass cancellation has completed cancelling all individual orders.
     */
    MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE((short) 54, "A Mass Cancel Acknowledgment is an unsequenced message sent when a Cancel Order or Purge Orders message requesting a mass cancellation has completed cancelling all individual orders."),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur.
     */
    PURGE_REJECTED_MESSAGE((short) 72, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur.");

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
