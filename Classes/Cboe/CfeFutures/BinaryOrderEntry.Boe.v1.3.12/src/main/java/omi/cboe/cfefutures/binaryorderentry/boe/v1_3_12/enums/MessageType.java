package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

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
     * Quote Update Message.
     */
    QUOTE_UPDATE_MESSAGE((short) 112, "Quote Update Message."),

    /**
     * Purge Orders Message.
     */
    PURGE_ORDERS_MESSAGE((short) 71, "Purge Orders Message."),

    /**
     * Reset Risk Message.
     */
    RESET_RISK_MESSAGE((short) 86, "Reset Risk Message."),

    /**
     * Order Acknowledgment Message.
     */
    ORDER_ACKNOWLEDGMENT_MESSAGE((short) 37, "Order Acknowledgment Message."),

    /**
     * Quote Update Acknowledgment Message.
     */
    QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE((short) 113, "Quote Update Acknowledgment Message."),

    /**
     * Order Rejected Message.
     */
    ORDER_REJECTED_MESSAGE((short) 38, "Order Rejected Message."),

    /**
     * Quote Update Rejected Message.
     */
    QUOTE_UPDATE_REJECTED_MESSAGE((short) 120, "Quote Update Rejected Message."),

    /**
     * Order Modified Message.
     */
    ORDER_MODIFIED_MESSAGE((short) 39, "Order Modified Message."),

    /**
     * Quote Restated Message.
     */
    QUOTE_RESTATED_MESSAGE((short) 114, "Quote Restated Message."),

    /**
     * User Modify Rejected Message.
     */
    USER_MODIFY_REJECTED_MESSAGE((short) 41, "User Modify Rejected Message."),

    /**
     * Order Cancelled Message.
     */
    ORDER_CANCELLED_MESSAGE((short) 42, "Order Cancelled Message."),

    /**
     * Quote Cancelled Message.
     */
    QUOTE_CANCELLED_MESSAGE((short) 115, "Quote Cancelled Message."),

    /**
     * Cancel Rejected Message.
     */
    CANCEL_REJECTED_MESSAGE((short) 43, "Cancel Rejected Message."),

    /**
     * Order Execution Message.
     */
    ORDER_EXECUTION_MESSAGE((short) 44, "Order Execution Message."),

    /**
     * Quote Execution Message.
     */
    QUOTE_EXECUTION_MESSAGE((short) 116, "Quote Execution Message."),

    /**
     * Trade Cancel or Correct Message.
     */
    TRADE_CANCEL_OR_CORRECT_MESSAGE((short) 45, "Trade Cancel or Correct Message."),

    /**
     * Purge Rejected Message.
     */
    PURGE_REJECTED_MESSAGE((short) 72, "Purge Rejected Message."),

    /**
     * Reset Risk Acknowledgment Message.
     */
    RESET_RISK_ACKNOWLEDGMENT_MESSAGE((short) 87, "Reset Risk Acknowledgment Message."),

    /**
     * Mass Cancel Acknowledgment Message.
     */
    MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE((short) 54, "Mass Cancel Acknowledgment Message."),

    /**
     * TAS Restatement (New Order Message) Message.
     */
    TAS_RESTATEMENT_NEW_ORDER_MESSAGE_MESSAGE((short) 73, "TAS Restatement (New Order Message) Message."),

    /**
     * Variance Restatement (New Order Message) Message.
     */
    VARIANCE_RESTATEMENT_NEW_ORDER_MESSAGE_MESSAGE((short) 74, "Variance Restatement (New Order Message) Message."),

    /**
     * TAS Quote Restatement Message.
     */
    TAS_QUOTE_RESTATEMENT_MESSAGE((short) 117, "TAS Quote Restatement Message."),

    /**
     * Variance Quote Restatement Message.
     */
    VARIANCE_QUOTE_RESTATEMENT_MESSAGE((short) 118, "Variance Quote Restatement Message.");

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
            case 112 -> Optional.of(QUOTE_UPDATE_MESSAGE);
            case 71 -> Optional.of(PURGE_ORDERS_MESSAGE);
            case 86 -> Optional.of(RESET_RISK_MESSAGE);
            case 37 -> Optional.of(ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 113 -> Optional.of(QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE);
            case 38 -> Optional.of(ORDER_REJECTED_MESSAGE);
            case 120 -> Optional.of(QUOTE_UPDATE_REJECTED_MESSAGE);
            case 39 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 114 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 41 -> Optional.of(USER_MODIFY_REJECTED_MESSAGE);
            case 42 -> Optional.of(ORDER_CANCELLED_MESSAGE);
            case 115 -> Optional.of(QUOTE_CANCELLED_MESSAGE);
            case 43 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 44 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 116 -> Optional.of(QUOTE_EXECUTION_MESSAGE);
            case 45 -> Optional.of(TRADE_CANCEL_OR_CORRECT_MESSAGE);
            case 72 -> Optional.of(PURGE_REJECTED_MESSAGE);
            case 87 -> Optional.of(RESET_RISK_ACKNOWLEDGMENT_MESSAGE);
            case 54 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE);
            case 73 -> Optional.of(TAS_RESTATEMENT_NEW_ORDER_MESSAGE_MESSAGE);
            case 74 -> Optional.of(VARIANCE_RESTATEMENT_NEW_ORDER_MESSAGE_MESSAGE);
            case 117 -> Optional.of(TAS_QUOTE_RESTATEMENT_MESSAGE);
            case 118 -> Optional.of(VARIANCE_QUOTE_RESTATEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
