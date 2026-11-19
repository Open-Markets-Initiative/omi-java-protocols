package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.enums;

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
     * New Order Cross Message.
     */
    NEW_ORDER_CROSS_MESSAGE((short) 122, "New Order Cross Message."),

    /**
     * New Complex Order Message.
     */
    NEW_COMPLEX_ORDER_MESSAGE((short) 75, "New Complex Order Message."),

    /**
     * New Order Cross Multileg Message.
     */
    NEW_ORDER_CROSS_MULTILEG_MESSAGE((short) 133, "New Order Cross Multileg Message."),

    /**
     * Cancel Order V2 Message.
     */
    CANCEL_ORDER_V2_MESSAGE((short) 57, "Cancel Order V2 Message."),

    /**
     * Modify Order V2 Message.
     */
    MODIFY_ORDER_V2_MESSAGE((short) 58, "Modify Order V2 Message."),

    /**
     * Quote Update Message.
     */
    QUOTE_UPDATE_MESSAGE((short) 123, "Quote Update Message."),

    /**
     * Purge Orders Message.
     */
    PURGE_ORDERS_MESSAGE((short) 71, "Purge Orders Message."),

    /**
     * Reset Risk Message.
     */
    RESET_RISK_MESSAGE((short) 86, "Reset Risk Message."),

    /**
     * New Complex Instrument Message.
     */
    NEW_COMPLEX_INSTRUMENT_MESSAGE((short) 76, "New Complex Instrument Message."),

    /**
     * Trade Capture Report V2 Message.
     */
    TRADE_CAPTURE_REPORT_V2_MESSAGE((short) 60, "Trade Capture Report V2 Message."),

    /**
     * Order Acknowledgment V2 Message.
     */
    ORDER_ACKNOWLEDGMENT_V2_MESSAGE((short) 37, "Order Acknowledgment V2 Message."),

    /**
     * Cross Order Acknowledgment Message.
     */
    CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE((short) 124, "Cross Order Acknowledgment Message."),

    /**
     * Quote Update Acknowledgment Message.
     */
    QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE((short) 125, "Quote Update Acknowledgment Message."),

    /**
     * Order Rejected V2 Message.
     */
    ORDER_REJECTED_V2_MESSAGE((short) 38, "Order Rejected V2 Message."),

    /**
     * Cross Order Rejected Message.
     */
    CROSS_ORDER_REJECTED_MESSAGE((short) 126, "Cross Order Rejected Message."),

    /**
     * Quote Update Rejected Message.
     */
    QUOTE_UPDATE_REJECTED_MESSAGE((short) 127, "Quote Update Rejected Message."),

    /**
     * Order Modified V2 Message.
     */
    ORDER_MODIFIED_V2_MESSAGE((short) 39, "Order Modified V2 Message."),

    /**
     * Order Restated Message.
     */
    ORDER_RESTATED_MESSAGE((short) 40, "Order Restated Message."),

    /**
     * Quote Restated Message.
     */
    QUOTE_RESTATED_MESSAGE((short) 128, "Quote Restated Message."),

    /**
     * User Modify Rejected V2 Message.
     */
    USER_MODIFY_REJECTED_V2_MESSAGE((short) 41, "User Modify Rejected V2 Message."),

    /**
     * Order Cancelled V2 Message.
     */
    ORDER_CANCELLED_V2_MESSAGE((short) 42, "Order Cancelled V2 Message."),

    /**
     * Quote Cancelled Message.
     */
    QUOTE_CANCELLED_MESSAGE((short) 129, "Quote Cancelled Message."),

    /**
     * Cross Order Cancelled Message.
     */
    CROSS_ORDER_CANCELLED_MESSAGE((short) 130, "Cross Order Cancelled Message."),

    /**
     * Cancel Rejected V2 Message.
     */
    CANCEL_REJECTED_V2_MESSAGE((short) 43, "Cancel Rejected V2 Message."),

    /**
     * Order Execution V2 Message.
     */
    ORDER_EXECUTION_V2_MESSAGE((short) 44, "Order Execution V2 Message."),

    /**
     * Quote Execution Message.
     */
    QUOTE_EXECUTION_MESSAGE((short) 131, "Quote Execution Message."),

    /**
     * Trade Cancel or Correct V2 Message.
     */
    TRADE_CANCEL_OR_CORRECT_V2_MESSAGE((short) 45, "Trade Cancel or Correct V2 Message."),

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
     * Complex Instrument Accepted Message.
     */
    COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE((short) 77, "Complex Instrument Accepted Message."),

    /**
     * Complex Instrument Rejected Message.
     */
    COMPLEX_INSTRUMENT_REJECTED_MESSAGE((short) 78, "Complex Instrument Rejected Message."),

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
            case 122 -> Optional.of(NEW_ORDER_CROSS_MESSAGE);
            case 75 -> Optional.of(NEW_COMPLEX_ORDER_MESSAGE);
            case 133 -> Optional.of(NEW_ORDER_CROSS_MULTILEG_MESSAGE);
            case 57 -> Optional.of(CANCEL_ORDER_V2_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_V2_MESSAGE);
            case 123 -> Optional.of(QUOTE_UPDATE_MESSAGE);
            case 71 -> Optional.of(PURGE_ORDERS_MESSAGE);
            case 86 -> Optional.of(RESET_RISK_MESSAGE);
            case 76 -> Optional.of(NEW_COMPLEX_INSTRUMENT_MESSAGE);
            case 60 -> Optional.of(TRADE_CAPTURE_REPORT_V2_MESSAGE);
            case 37 -> Optional.of(ORDER_ACKNOWLEDGMENT_V2_MESSAGE);
            case 124 -> Optional.of(CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 125 -> Optional.of(QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE);
            case 38 -> Optional.of(ORDER_REJECTED_V2_MESSAGE);
            case 126 -> Optional.of(CROSS_ORDER_REJECTED_MESSAGE);
            case 127 -> Optional.of(QUOTE_UPDATE_REJECTED_MESSAGE);
            case 39 -> Optional.of(ORDER_MODIFIED_V2_MESSAGE);
            case 40 -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 128 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 41 -> Optional.of(USER_MODIFY_REJECTED_V2_MESSAGE);
            case 42 -> Optional.of(ORDER_CANCELLED_V2_MESSAGE);
            case 129 -> Optional.of(QUOTE_CANCELLED_MESSAGE);
            case 130 -> Optional.of(CROSS_ORDER_CANCELLED_MESSAGE);
            case 43 -> Optional.of(CANCEL_REJECTED_V2_MESSAGE);
            case 44 -> Optional.of(ORDER_EXECUTION_V2_MESSAGE);
            case 131 -> Optional.of(QUOTE_EXECUTION_MESSAGE);
            case 45 -> Optional.of(TRADE_CANCEL_OR_CORRECT_V2_MESSAGE);
            case 72 -> Optional.of(PURGE_REJECTED_MESSAGE);
            case 87 -> Optional.of(RESET_RISK_ACKNOWLEDGMENT_MESSAGE);
            case 54 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE);
            case 77 -> Optional.of(COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE);
            case 78 -> Optional.of(COMPLEX_INSTRUMENT_REJECTED_MESSAGE);
            case 48 -> Optional.of(TRADE_CAPTURE_REPORT_ACKNOWLEDGMENT_V2_MESSAGE);
            case 49 -> Optional.of(TRADE_CAPTURE_REPORT_REJECT_V2_MESSAGE);
            case 50 -> Optional.of(TRADE_CAPTURE_CONFIRM_V2_MESSAGE);
            case 51 -> Optional.of(TRADE_CAPTURE_REPORT_DECLINE_V2_MESSAGE);
            default -> Optional.empty();
        };
    }
}
