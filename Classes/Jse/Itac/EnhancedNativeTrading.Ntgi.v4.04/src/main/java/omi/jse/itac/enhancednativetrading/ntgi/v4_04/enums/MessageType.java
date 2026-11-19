package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Type of message rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Allows the client to login to the server.
     */
    LOGON_MESSAGE('A', "Allows the client to login to the server."),

    /**
     * Used by the server to accept or reject a login request.
     */
    LOGON_RESPONSE_MESSAGE('B', "Used by the server to accept or reject a login request."),

    /**
     * Used by the client or server to terminate a session.
     */
    LOGOUT_MESSAGE('5', "Used by the client or server to terminate a session."),

    /**
     * Used by the client and server to exercise the communication line during periods of inactivity.
     */
    HEARTBEAT_MESSAGE('0', "Used by the client and server to exercise the communication line during periods of inactivity."),

    /**
     * Used by the server to reject a message that does not comply with the specifications.
     */
    REJECT_MESSAGE('3', "Used by the server to reject a message that does not comply with the specifications."),

    /**
     * Used by the client to recover missed messages through the Recovery Channel.
     */
    MISSED_MESSAGE_REQUEST_MESSAGE('M', "Used by the client to recover missed messages through the Recovery Channel."),

    /**
     * Used by the server to accept or reject a request for missed messages.
     */
    MISSED_MESSAGE_REQUEST_ACK_MESSAGE('N', "Used by the server to accept or reject a request for missed messages."),

    /**
     * Used by the server to indicate that the transmission of missed messages is complete.
     */
    TRANSMISSION_COMPLETE_MESSAGE('P', "Used by the server to indicate that the transmission of missed messages is complete."),

    /**
     * Disseminated in the recovery channel to indicate the status of a partition.
     */
    SYSTEM_STATUS_MESSAGE('n', "Disseminated in the recovery channel to indicate the status of a partition."),

    /**
     * Allows the client to submit a new order.
     */
    NEW_ORDER_MESSAGE('D', "Allows the client to submit a new order."),

    /**
     * Allows the client to cancel an Open or Parked order.
     */
    ORDER_CANCEL_REQUEST_MESSAGE('F', "Allows the client to cancel an Open or Parked order."),

    /**
     * Allows the client to mass cancel orders.
     */
    ORDER_MASS_CANCEL_REQUEST_MESSAGE('q', "Allows the client to mass cancel orders."),

    /**
     * Allows the client to modify an Open or Parked order.
     */
    ORDER_CANCEL_REPLACE_REQUEST_MESSAGE('G', "Allows the client to modify an Open or Parked order."),

    /**
     * Allows the client to request an instrument creation intra-day.
     */
    SECURITY_DEFINITION_REQUEST_MESSAGE('O', "Allows the client to request an instrument creation intra-day."),

    /**
     * Indicates the status of an order.
     */
    EXECUTION_REPORT_MESSAGE('8', "Indicates the status of an order."),

    /**
     * Indicates that an order cancel or cancel replace request has been rejected.
     */
    ORDER_CANCEL_REJECT_MESSAGE('9', "Indicates that an order cancel or cancel replace request has been rejected."),

    /**
     * Indicates the outcome of an order mass cancel request.
     */
    ORDER_MASS_CANCEL_REPORT_MESSAGE('r', "Indicates the outcome of an order mass cancel request."),

    /**
     * Indicates that a Security Definition Request has been accepted or rejected.
     */
    SECURITY_DEFINITION_RESPONSE_MESSAGE('R', "Indicates that a Security Definition Request has been accepted or rejected."),

    /**
     * Carries a market operations announcement.
     */
    NEWS_MESSAGE('Z', "Carries a market operations announcement."),

    /**
     * Indicates that an application message could not be processed.
     */
    BUSINESS_REJECT_MESSAGE('j', "Indicates that an application message could not be processed.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(LOGON_MESSAGE);
            case 'B' -> Optional.of(LOGON_RESPONSE_MESSAGE);
            case '5' -> Optional.of(LOGOUT_MESSAGE);
            case '0' -> Optional.of(HEARTBEAT_MESSAGE);
            case '3' -> Optional.of(REJECT_MESSAGE);
            case 'M' -> Optional.of(MISSED_MESSAGE_REQUEST_MESSAGE);
            case 'N' -> Optional.of(MISSED_MESSAGE_REQUEST_ACK_MESSAGE);
            case 'P' -> Optional.of(TRANSMISSION_COMPLETE_MESSAGE);
            case 'n' -> Optional.of(SYSTEM_STATUS_MESSAGE);
            case 'D' -> Optional.of(NEW_ORDER_MESSAGE);
            case 'F' -> Optional.of(ORDER_CANCEL_REQUEST_MESSAGE);
            case 'q' -> Optional.of(ORDER_MASS_CANCEL_REQUEST_MESSAGE);
            case 'G' -> Optional.of(ORDER_CANCEL_REPLACE_REQUEST_MESSAGE);
            case 'O' -> Optional.of(SECURITY_DEFINITION_REQUEST_MESSAGE);
            case '8' -> Optional.of(EXECUTION_REPORT_MESSAGE);
            case '9' -> Optional.of(ORDER_CANCEL_REJECT_MESSAGE);
            case 'r' -> Optional.of(ORDER_MASS_CANCEL_REPORT_MESSAGE);
            case 'R' -> Optional.of(SECURITY_DEFINITION_RESPONSE_MESSAGE);
            case 'Z' -> Optional.of(NEWS_MESSAGE);
            case 'j' -> Optional.of(BUSINESS_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
