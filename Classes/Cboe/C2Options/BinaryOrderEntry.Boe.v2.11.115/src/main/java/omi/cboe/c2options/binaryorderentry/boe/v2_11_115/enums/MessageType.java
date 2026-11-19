package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.enums;

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
     * New Order Cross Message.
     */
    NEW_ORDER_CROSS_MESSAGE((short) 65, "New Order Cross Message."),

    /**
     * New Complex Order Message.
     */
    NEW_COMPLEX_ORDER_MESSAGE((short) 75, "New Complex Order Message."),

    /**
     * New Order Cross Multileg Message.
     */
    NEW_ORDER_CROSS_MULTILEG_MESSAGE((short) 90, "New Order Cross Multileg Message."),

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
    QUOTE_UPDATE_MESSAGE((short) 85, "Quote Update Message."),

    /**
     * Quote Update (Short) Message.
     */
    QUOTE_UPDATE_SHORT_MESSAGE((short) 89, "Quote Update (Short) Message."),

    /**
     * Complex Quote Update Message.
     */
    COMPLEX_QUOTE_UPDATE_MESSAGE((short) 132, "Complex Quote Update Message."),

    /**
     * Complex Quote Update (Short) Message.
     */
    COMPLEX_QUOTE_UPDATE_SHORT_MESSAGE((short) 134, "Complex Quote Update (Short) Message."),

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
     * Add Floor Trade Message.
     */
    ADD_FLOOR_TRADE_MESSAGE((short) 92, "Add Floor Trade Message."),

    /**
     * Floor Trade Confirmation Message.
     */
    FLOOR_TRADE_CONFIRMATION_MESSAGE((short) 91, "Floor Trade Confirmation Message."),

    /**
     * Delete Floor Trade Message.
     */
    DELETE_FLOOR_TRADE_MESSAGE((short) 93, "Delete Floor Trade Message."),

    /**
     * Order Acknowledgment Message.
     */
    ORDER_ACKNOWLEDGMENT_MESSAGE((short) 37, "Order Acknowledgment Message."),

    /**
     * Cross Order Acknowledgment Message.
     */
    CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE((short) 67, "Cross Order Acknowledgment Message."),

    /**
     * Quote Update Acknowledgment Message.
     */
    QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE((short) 81, "Quote Update Acknowledgment Message."),

    /**
     * Order Rejected Message.
     */
    ORDER_REJECTED_MESSAGE((short) 38, "Order Rejected Message."),

    /**
     * Cross Order Rejected Message.
     */
    CROSS_ORDER_REJECTED_MESSAGE((short) 68, "Cross Order Rejected Message."),

    /**
     * Quote Update Rejected Message.
     */
    QUOTE_UPDATE_REJECTED_MESSAGE((short) 88, "Quote Update Rejected Message."),

    /**
     * Order Modified Message.
     */
    ORDER_MODIFIED_MESSAGE((short) 39, "Order Modified Message."),

    /**
     * Order Restated Message.
     */
    ORDER_RESTATED_MESSAGE((short) 40, "Order Restated Message."),

    /**
     * Quote Restated Message.
     */
    QUOTE_RESTATED_MESSAGE((short) 82, "Quote Restated Message."),

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
    QUOTE_CANCELLED_MESSAGE((short) 83, "Quote Cancelled Message."),

    /**
     * Cross Order Cancelled Message.
     */
    CROSS_ORDER_CANCELLED_MESSAGE((short) 70, "Cross Order Cancelled Message."),

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
    QUOTE_EXECUTION_MESSAGE((short) 84, "Quote Execution Message."),

    /**
     * Complex Quote Execution Message.
     */
    COMPLEX_QUOTE_EXECUTION_MESSAGE((short) 135, "Complex Quote Execution Message."),

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
     * Purge Notification Message.
     */
    PURGE_NOTIFICATION_MESSAGE((short) 99, "Purge Notification Message."),

    /**
     * Complex Instrument Accepted Message.
     */
    COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE((short) 77, "Complex Instrument Accepted Message."),

    /**
     * Complex Instrument Rejected Message.
     */
    COMPLEX_INSTRUMENT_REJECTED_MESSAGE((short) 78, "Complex Instrument Rejected Message."),

    /**
     * Floor Trade Notification Message.
     */
    FLOOR_TRADE_NOTIFICATION_MESSAGE((short) 98, "Floor Trade Notification Message."),

    /**
     * Add Floor Trade Rejected Message.
     */
    ADD_FLOOR_TRADE_REJECTED_MESSAGE((short) 95, "Add Floor Trade Rejected Message."),

    /**
     * Floor Trade Confirmation Rejected Message.
     */
    FLOOR_TRADE_CONFIRMATION_REJECTED_MESSAGE((short) 94, "Floor Trade Confirmation Rejected Message."),

    /**
     * Delete Floor Trade Rejected Message.
     */
    DELETE_FLOOR_TRADE_REJECTED_MESSAGE((short) 96, "Delete Floor Trade Rejected Message."),

    /**
     * Delete Floor Trade Acknowledgement Message.
     */
    DELETE_FLOOR_TRADE_ACKNOWLEDGEMENT_MESSAGE((short) 97, "Delete Floor Trade Acknowledgement Message.");

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
            case 65 -> Optional.of(NEW_ORDER_CROSS_MESSAGE);
            case 75 -> Optional.of(NEW_COMPLEX_ORDER_MESSAGE);
            case 90 -> Optional.of(NEW_ORDER_CROSS_MULTILEG_MESSAGE);
            case 57 -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 85 -> Optional.of(QUOTE_UPDATE_MESSAGE);
            case 89 -> Optional.of(QUOTE_UPDATE_SHORT_MESSAGE);
            case 132 -> Optional.of(COMPLEX_QUOTE_UPDATE_MESSAGE);
            case 134 -> Optional.of(COMPLEX_QUOTE_UPDATE_SHORT_MESSAGE);
            case 71 -> Optional.of(PURGE_ORDERS_MESSAGE);
            case 86 -> Optional.of(RESET_RISK_MESSAGE);
            case 76 -> Optional.of(NEW_COMPLEX_INSTRUMENT_MESSAGE);
            case 92 -> Optional.of(ADD_FLOOR_TRADE_MESSAGE);
            case 91 -> Optional.of(FLOOR_TRADE_CONFIRMATION_MESSAGE);
            case 93 -> Optional.of(DELETE_FLOOR_TRADE_MESSAGE);
            case 37 -> Optional.of(ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 67 -> Optional.of(CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 81 -> Optional.of(QUOTE_UPDATE_ACKNOWLEDGMENT_MESSAGE);
            case 38 -> Optional.of(ORDER_REJECTED_MESSAGE);
            case 68 -> Optional.of(CROSS_ORDER_REJECTED_MESSAGE);
            case 88 -> Optional.of(QUOTE_UPDATE_REJECTED_MESSAGE);
            case 39 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 40 -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 82 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 41 -> Optional.of(USER_MODIFY_REJECTED_MESSAGE);
            case 42 -> Optional.of(ORDER_CANCELLED_MESSAGE);
            case 83 -> Optional.of(QUOTE_CANCELLED_MESSAGE);
            case 70 -> Optional.of(CROSS_ORDER_CANCELLED_MESSAGE);
            case 43 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 44 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 84 -> Optional.of(QUOTE_EXECUTION_MESSAGE);
            case 135 -> Optional.of(COMPLEX_QUOTE_EXECUTION_MESSAGE);
            case 45 -> Optional.of(TRADE_CANCEL_OR_CORRECT_MESSAGE);
            case 72 -> Optional.of(PURGE_REJECTED_MESSAGE);
            case 87 -> Optional.of(RESET_RISK_ACKNOWLEDGMENT_MESSAGE);
            case 54 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE);
            case 99 -> Optional.of(PURGE_NOTIFICATION_MESSAGE);
            case 77 -> Optional.of(COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE);
            case 78 -> Optional.of(COMPLEX_INSTRUMENT_REJECTED_MESSAGE);
            case 98 -> Optional.of(FLOOR_TRADE_NOTIFICATION_MESSAGE);
            case 95 -> Optional.of(ADD_FLOOR_TRADE_REJECTED_MESSAGE);
            case 94 -> Optional.of(FLOOR_TRADE_CONFIRMATION_REJECTED_MESSAGE);
            case 96 -> Optional.of(DELETE_FLOOR_TRADE_REJECTED_MESSAGE);
            case 97 -> Optional.of(DELETE_FLOOR_TRADE_ACKNOWLEDGEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
