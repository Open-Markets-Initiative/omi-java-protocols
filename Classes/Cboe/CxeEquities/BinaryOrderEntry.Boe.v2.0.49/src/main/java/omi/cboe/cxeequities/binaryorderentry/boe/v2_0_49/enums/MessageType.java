package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_49.enums;

import java.util.Optional;

/**
 * Return message type for which the bitfields are being specified (e.g., 0x25 for an Order Ac- knowledgment V2 message)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Login Request V2 Message.
     */
    LOGIN_REQUEST_V2_MESSAGE((short) 55, "Login Request V2 Message."),

    /**
     * Logout Request Message.
     */
    LOGOUT_REQUEST_MESSAGE((short) 2, "Logout Request Message."),

    /**
     * Client Heartbeat Message.
     */
    CLIENT_HEARTBEAT_MESSAGE((short) 3, "Client Heartbeat Message."),

    /**
     * Login Response V2 Message.
     */
    LOGIN_RESPONSE_V2_MESSAGE((short) 36, "Login Response V2 Message."),

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
     * New Order V2 Message.
     */
    NEW_ORDER_V2_MESSAGE((short) 56, "New Order V2 Message."),

    /**
     * Cancel Order V2 Message.
     */
    CANCEL_ORDER_V2_MESSAGE((short) 57, "Cancel Order V2 Message."),

    /**
     * Modify Order V2 Message.
     */
    MODIFY_ORDER_V2_MESSAGE((short) 58, "Modify Order V2 Message."),

    /**
     * Purge Orders V2 Message.
     */
    PURGE_ORDERS_V2_MESSAGE((short) 71, "Purge Orders V2 Message."),

    /**
     * Trade Capture Report V2 Message.
     */
    TRADE_CAPTURE_REPORT_V2_MESSAGE((short) 60, "Trade Capture Report V2 Message."),

    /**
     * Order Acknowledgment V2 Message.
     */
    ORDER_ACKNOWLEDGMENT_V2_MESSAGE((short) 37, "Order Acknowledgment V2 Message."),

    /**
     * Order Rejected V2 Message.
     */
    ORDER_REJECTED_V2_MESSAGE((short) 38, "Order Rejected V2 Message."),

    /**
     * Order Modified V2 Message.
     */
    ORDER_MODIFIED_V2_MESSAGE((short) 39, "Order Modified V2 Message."),

    /**
     * Order Restated V2 Message.
     */
    ORDER_RESTATED_V2_MESSAGE((short) 40, "Order Restated V2 Message."),

    /**
     * User Modify Rejected V2 Message.
     */
    USER_MODIFY_REJECTED_V2_MESSAGE((short) 41, "User Modify Rejected V2 Message."),

    /**
     * Order Cancelled V2 Message.
     */
    ORDER_CANCELLED_V2_MESSAGE((short) 42, "Order Cancelled V2 Message."),

    /**
     * Cancel Rejected V2 Message.
     */
    CANCEL_REJECTED_V2_MESSAGE((short) 43, "Cancel Rejected V2 Message."),

    /**
     * Order Execution V2 Message.
     */
    ORDER_EXECUTION_V2_MESSAGE((short) 44, "Order Execution V2 Message."),

    /**
     * Trade Cancel or Correct V2 Message.
     */
    TRADE_CANCEL_OR_CORRECT_V2_MESSAGE((short) 45, "Trade Cancel or Correct V2 Message."),

    /**
     * Purge Rejected V2 Message.
     */
    PURGE_REJECTED_V2_MESSAGE((short) 72, "Purge Rejected V2 Message."),

    /**
     * Mass Cancel Acknowledgment V2 Message.
     */
    MASS_CANCEL_ACKNOWLEDGMENT_V2_MESSAGE((short) 54, "Mass Cancel Acknowledgment V2 Message."),

    /**
     * Trade Capture Report Acknowledgment V2 Message.
     */
    TRADE_CAPTURE_REPORT_ACKNOWLEDGMENT_V2_MESSAGE((short) 48, "Trade Capture Report Acknowledgment V2 Message."),

    /**
     * Trade Capture Report Reject V2 Message.
     */
    TRADE_CAPTURE_REPORT_REJECT_V2_MESSAGE((short) 49, "Trade Capture Report Reject V2 Message."),

    /**
     * Trade Capture Confirm V2 Message.
     */
    TRADE_CAPTURE_CONFIRM_V2_MESSAGE((short) 50, "Trade Capture Confirm V2 Message."),

    /**
     * Trade Capture Report Decline V2 Message.
     */
    TRADE_CAPTURE_REPORT_DECLINE_V2_MESSAGE((short) 51, "Trade Capture Report Decline V2 Message.");

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
            case 55 -> Optional.of(LOGIN_REQUEST_V2_MESSAGE);
            case 2 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 3 -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 36 -> Optional.of(LOGIN_RESPONSE_V2_MESSAGE);
            case 8 -> Optional.of(LOGOUT_MESSAGE);
            case 9 -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 19 -> Optional.of(REPLAY_COMPLETE_MESSAGE);
            case 56 -> Optional.of(NEW_ORDER_V2_MESSAGE);
            case 57 -> Optional.of(CANCEL_ORDER_V2_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_V2_MESSAGE);
            case 71 -> Optional.of(PURGE_ORDERS_V2_MESSAGE);
            case 60 -> Optional.of(TRADE_CAPTURE_REPORT_V2_MESSAGE);
            case 37 -> Optional.of(ORDER_ACKNOWLEDGMENT_V2_MESSAGE);
            case 38 -> Optional.of(ORDER_REJECTED_V2_MESSAGE);
            case 39 -> Optional.of(ORDER_MODIFIED_V2_MESSAGE);
            case 40 -> Optional.of(ORDER_RESTATED_V2_MESSAGE);
            case 41 -> Optional.of(USER_MODIFY_REJECTED_V2_MESSAGE);
            case 42 -> Optional.of(ORDER_CANCELLED_V2_MESSAGE);
            case 43 -> Optional.of(CANCEL_REJECTED_V2_MESSAGE);
            case 44 -> Optional.of(ORDER_EXECUTION_V2_MESSAGE);
            case 45 -> Optional.of(TRADE_CANCEL_OR_CORRECT_V2_MESSAGE);
            case 72 -> Optional.of(PURGE_REJECTED_V2_MESSAGE);
            case 54 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_V2_MESSAGE);
            case 48 -> Optional.of(TRADE_CAPTURE_REPORT_ACKNOWLEDGMENT_V2_MESSAGE);
            case 49 -> Optional.of(TRADE_CAPTURE_REPORT_REJECT_V2_MESSAGE);
            case 50 -> Optional.of(TRADE_CAPTURE_CONFIRM_V2_MESSAGE);
            case 51 -> Optional.of(TRADE_CAPTURE_REPORT_DECLINE_V2_MESSAGE);
            default -> Optional.empty();
        };
    }
}
