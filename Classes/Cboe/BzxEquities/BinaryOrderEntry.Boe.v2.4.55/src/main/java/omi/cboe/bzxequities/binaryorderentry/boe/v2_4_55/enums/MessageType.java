package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Defines the MessageType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Login Request message must be sent as the first message upon connection. A number of repeating parameter groups are sent at the end of the message.
     */
    LOGIN_REQUEST_MESSAGE((short) 55, "A Login Request message must be sent as the first message upon connection. A number of repeating parameter groups are sent at the end of the message."),

    /**
     * To end the session, the Member should send a Logout Request message. Cboe will finish sending any queued data and finally respond with a Logout message and close the connection.
     */
    LOGOUT_REQUEST_MESSAGE((short) 2, "To end the session, the Member should send a Logout Request message. Cboe will finish sending any queued data and finally respond with a Logout message and close the connection."),

    /**
     * Client Heartbeat messages are sent from Member to Cboe if no other data has been sent in that direction for one second.
     */
    CLIENT_HEARTBEAT_MESSAGE((short) 3, "Client Heartbeat messages are sent from Member to Cboe if no other data has been sent in that direction for one second."),

    /**
     * A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to A. On a failed login, LoginResponseStatus will be set to a value other than A, and LoginResponseText will be set to an appropriate failure description.
     */
    LOGIN_RESPONSE_MESSAGE((short) 36, "A Login Response message is sent in response to a Login Request message. On a successful login, the LoginResponseStatus will be set to A. On a failed login, LoginResponseStatus will be set to a value other than A, and LoginResponseText will be set to an appropriate failure description."),

    /**
     * A Logout message is usually sent in response to a Logout Request message. Any queued data is transmitted, a Logout message is sent, and Cboe will close the connection. A Logout may also be sent if the Member violates the protocol specification (e.g., by moving backwards in sequence number).
     */
    LOGOUT_MESSAGE((short) 8, "A Logout message is usually sent in response to a Logout Request message. Any queued data is transmitted, a Logout message is sent, and Cboe will close the connection. A Logout may also be sent if the Member violates the protocol specification (e.g., by moving backwards in sequence number)."),

    /**
     * Server Heartbeat messages are sent from Cboe to Member if no other data has been sent in that direction for one second.
     */
    SERVER_HEARTBEAT_MESSAGE((short) 9, "Server Heartbeat messages are sent from Cboe to Member if no other data has been sent in that direction for one second."),

    /**
     * Cboe will send a Replay Complete message when replay is finished. If there are no messages to replay, a Replay Complete message will be sent immediately after a Login Response message.
     */
    REPLAY_COMPLETE_MESSAGE((short) 19, "Cboe will send a Replay Complete message when replay is finished. If there are no messages to replay, a Replay Complete message will be sent immediately after a Login Response message."),

    /**
     * A New Order message consists of a number of required fields followed by a number of optional fields. The optional fields used are specified by setting bits in the NewOrderBitfields. Fields must be appended at the end of the message, starting with the lowest order enabled bit in the first bit field first.
     */
    NEW_ORDER_MESSAGE((short) 56, "A New Order message consists of a number of required fields followed by a number of optional fields. The optional fields used are specified by setting bits in the NewOrderBitfields. Fields must be appended at the end of the message, starting with the lowest order enabled bit in the first bit field first."),

    /**
     * Request to cancel an order.
     */
    CANCEL_ORDER_MESSAGE((short) 57, "Request to cancel an order."),

    /**
     * Request to modify an order. The order attributes to be modified are selected using NumberOfModifyBitfields and some number of bitfields to follow.
     */
    MODIFY_ORDER_MESSAGE((short) 58, "Request to modify an order. The order attributes to be modified are selected using NumberOfModifyBitfields and some number of bitfields to follow."),

    /**
     * Request to cancel a group of orders across all of the firm's sessions. Purge Orders messages are only accepted on dedicated BOE Purge Ports.
     */
    PURGE_ORDERS_MESSAGE((short) 71, "Request to cancel a group of orders across all of the firm's sessions. Purge Orders messages are only accepted on dedicated BOE Purge Ports."),

    /**
     * Order Acknowledgment messages are sent in response to a New Order message. The message corresponds to a FIX Execution Report with ExecType (150) = 0 (New).
     */
    ORDER_ACKNOWLEDGMENT_MESSAGE((short) 37, "Order Acknowledgment messages are sent in response to a New Order message. The message corresponds to a FIX Execution Report with ExecType (150) = 0 (New)."),

    /**
     * Order Rejected messages are sent in response to a New Order message which must be rejected. This message corresponds to a FIX Execution Report with ExecType (150) = 8 (Rejected). Order Rejected messages are unsequenced.
     */
    ORDER_REJECTED_MESSAGE((short) 38, "Order Rejected messages are sent in response to a New Order message which must be rejected. This message corresponds to a FIX Execution Report with ExecType (150) = 8 (Rejected). Order Rejected messages are unsequenced."),

    /**
     * Order Modified messages are sent in response to a Modify Request to indicate that the order has been successfully modified.
     */
    ORDER_MODIFIED_MESSAGE((short) 39, "Order Modified messages are sent in response to a Modify Request to indicate that the order has been successfully modified."),

    /**
     * Order Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason without an explicit Modify Order message request having been sent.
     */
    ORDER_RESTATED_MESSAGE((short) 40, "Order Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason without an explicit Modify Order message request having been sent."),

    /**
     * User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified. User Modify Rejected messages are unsequenced.
     */
    USER_MODIFY_REJECTED_MESSAGE((short) 41, "User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified. User Modify Rejected messages are unsequenced."),

    /**
     * An order has been cancelled.
     */
    ORDER_CANCELLED_MESSAGE((short) 42, "An order has been cancelled."),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur. Cancel Rejected messages are unsequenced.
     */
    CANCEL_REJECTED_MESSAGE((short) 43, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur. Cancel Rejected messages are unsequenced."),

    /**
     * An Order Execution message is sent for each fill on an order. Rather than returning a monetary value indicating the rebate or charge for an execution, the FeeCode is an indication of a fee classification corresponding to an item on the venue's fee schedule.
     */
    ORDER_EXECUTION_MESSAGE((short) 44, "An Order Execution message is sent for each fill on an order. Rather than returning a monetary value indicating the rebate or charge for an execution, the FeeCode is an indication of a fee classification corresponding to an item on the venue's fee schedule."),

    /**
     * Used to relay a trade which has been cancelled (busted) or corrected (price change only). The CorrectedPrice field will be set to 0 for cancelled trades and to the new trade price for corrected trades. Trade Cancel or Correct messages can be sent for same day as well as previous day trades.
     */
    TRADE_CANCEL_OR_CORRECT_MESSAGE((short) 45, "Used to relay a trade which has been cancelled (busted) or corrected (price change only). The CorrectedPrice field will be set to 0 for cancelled trades and to the new trade price for corrected trades. Trade Cancel or Correct messages can be sent for same day as well as previous day trades."),

    /**
     * A Mass Cancel Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting a mass cancellation has completed canceling all individual orders. This message type only appears on dedicated BOE Purge Ports.
     */
    MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE((short) 54, "A Mass Cancel Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting a mass cancellation has completed canceling all individual orders. This message type only appears on dedicated BOE Purge Ports."),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur. Purge Rejected messages are unsequenced. This message type only appears on dedicated BOE Purge Ports.
     */
    PURGE_REJECTED_MESSAGE((short) 72, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur. Purge Rejected messages are unsequenced. This message type only appears on dedicated BOE Purge Ports.");

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
            case 71 -> Optional.of(PURGE_ORDERS_MESSAGE);
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
