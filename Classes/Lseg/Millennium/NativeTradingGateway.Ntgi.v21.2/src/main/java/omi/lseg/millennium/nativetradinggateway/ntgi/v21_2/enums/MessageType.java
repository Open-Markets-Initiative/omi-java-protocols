package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Type of message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Allows the client and server to establish a session.
     */
    LOGON_MESSAGE('A', "Allows the client and server to establish a session."),

    /**
     * Allows the server to acknowledge a client's Logon.
     */
    LOGON_REPLY_MESSAGE('B', "Allows the server to acknowledge a client's Logon."),

    /**
     * Allows the client and server to terminate a session.
     */
    LOGOUT_MESSAGE('5', "Allows the client and server to terminate a session."),

    /**
     * Allows the client and server to exercise the communication line during periods of inactivity and verify that the interfaces at each end are available.
     */
    HEARTBEAT_MESSAGE('0', "Allows the client and server to exercise the communication line during periods of inactivity and verify that the interfaces at each end are available."),

    /**
     * Used to reject a message that does not comply with the Native Trading Gateway messaging protocol.
     */
    REJECT_MESSAGE('3', "Used to reject a message that does not comply with the Native Trading Gateway messaging protocol."),

    /**
     * Indicates service non availability of a partition, disseminated on the recovery and realtime channels.
     */
    SYSTEM_STATUS_MESSAGE('n', "Indicates service non availability of a partition, disseminated on the recovery and realtime channels."),

    /**
     * Allows the client to submit a new order.
     */
    NEW_ORDER_MESSAGE('D', "Allows the client to submit a new order."),

    /**
     * Allows the client to submit and update a quote.
     */
    NEW_QUOTE_MESSAGE('S', "Allows the client to submit and update a quote."),

    /**
     * Allows the client to cancel or replace a live order.
     */
    ORDER_CANCEL_REPLACE_REQUEST_MESSAGE('G', "Allows the client to cancel or replace a live order."),

    /**
     * Allows the client to cancel a live order.
     */
    ORDER_CANCEL_REQUEST_MESSAGE('F', "Allows the client to cancel a live order."),

    /**
     * Allows the client to mass cancel live orders, optionally scoped to an instrument or a segment.
     */
    ORDER_MASS_CANCEL_REQUEST_MESSAGE('q', "Allows the client to mass cancel live orders, optionally scoped to an instrument or a segment."),

    /**
     * Indicates order accepted, rejected, executed, expired, cancelled, cancel/replaced, restated or suspended, or a trade cancel.
     */
    EXECUTION_REPORT_MESSAGE('8', "Indicates order accepted, rejected, executed, expired, cancelled, cancel/replaced, restated or suspended, or a trade cancel."),

    /**
     * Indicates that an order cancel request or order cancel/replace request has been rejected.
     */
    ORDER_CANCEL_REJECT_MESSAGE('9', "Indicates that an order cancel request or order cancel/replace request has been rejected."),

    /**
     * Indicates that a mass order cancel request was accepted or rejected.
     */
    ORDER_MASS_CANCEL_REPORT_MESSAGE('r', "Indicates that a mass order cancel request was accepted or rejected."),

    /**
     * Carries a Request For Quote. Sent by the Requester to submit an RFQ, and by the server to deliver it to the Market Maker.
     */
    QUOTE_REQUEST_MESSAGE('a', "Carries a Request For Quote. Sent by the Requester to submit an RFQ, and by the server to deliver it to the Market Maker."),

    /**
     * Allows the server to communicate the status of the RFQ to the Requester.
     */
    QUOTE_STATUS_REPORT_MESSAGE('c', "Allows the server to communicate the status of the RFQ to the Requester."),

    /**
     * Rejects an RFQ. Sent by the Market Maker to reject, and by the server to reject or to relay a Market Maker rejection.
     */
    QUOTE_REQUEST_REJECT_MESSAGE('b', "Rejects an RFQ. Sent by the Market Maker to reject, and by the server to reject or to relay a Market Maker rejection."),

    /**
     * Carries an RFQ Quote. Sent by the Market Maker to accept an RFQ, and by the server to deliver the quote to the Requester.
     */
    RFQ_QUOTE_MESSAGE('d', "Carries an RFQ Quote. Sent by the Market Maker to accept an RFQ, and by the server to deliver the quote to the Requester."),

    /**
     * Allows the server to acknowledge a new or modified RFQ Quote to the Market Maker.
     */
    QUOTE_ACK_MESSAGE('e', "Allows the server to acknowledge a new or modified RFQ Quote to the Market Maker."),

    /**
     * Carries an RFQ response. Sent by the Requester to execute or cancel an RFQ Quote, and by the server to report quote and RFQ status.
     */
    QUOTE_RESPONSE_MESSAGE('f', "Carries an RFQ response. Sent by the Requester to execute or cancel an RFQ Quote, and by the server to report quote and RFQ status."),

    /**
     * Allows the system to notify the Requester and the Market Maker about a trade or the status of the quote.
     */
    RFQ_EXECUTION_REPORT_MESSAGE('g', "Allows the system to notify the Requester and the Market Maker about a trade or the status of the quote."),

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
            case 'B' -> Optional.of(LOGON_REPLY_MESSAGE);
            case '5' -> Optional.of(LOGOUT_MESSAGE);
            case '0' -> Optional.of(HEARTBEAT_MESSAGE);
            case '3' -> Optional.of(REJECT_MESSAGE);
            case 'n' -> Optional.of(SYSTEM_STATUS_MESSAGE);
            case 'D' -> Optional.of(NEW_ORDER_MESSAGE);
            case 'S' -> Optional.of(NEW_QUOTE_MESSAGE);
            case 'G' -> Optional.of(ORDER_CANCEL_REPLACE_REQUEST_MESSAGE);
            case 'F' -> Optional.of(ORDER_CANCEL_REQUEST_MESSAGE);
            case 'q' -> Optional.of(ORDER_MASS_CANCEL_REQUEST_MESSAGE);
            case '8' -> Optional.of(EXECUTION_REPORT_MESSAGE);
            case '9' -> Optional.of(ORDER_CANCEL_REJECT_MESSAGE);
            case 'r' -> Optional.of(ORDER_MASS_CANCEL_REPORT_MESSAGE);
            case 'a' -> Optional.of(QUOTE_REQUEST_MESSAGE);
            case 'c' -> Optional.of(QUOTE_STATUS_REPORT_MESSAGE);
            case 'b' -> Optional.of(QUOTE_REQUEST_REJECT_MESSAGE);
            case 'd' -> Optional.of(RFQ_QUOTE_MESSAGE);
            case 'e' -> Optional.of(QUOTE_ACK_MESSAGE);
            case 'f' -> Optional.of(QUOTE_RESPONSE_MESSAGE);
            case 'g' -> Optional.of(RFQ_EXECUTION_REPORT_MESSAGE);
            case 'j' -> Optional.of(BUSINESS_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
