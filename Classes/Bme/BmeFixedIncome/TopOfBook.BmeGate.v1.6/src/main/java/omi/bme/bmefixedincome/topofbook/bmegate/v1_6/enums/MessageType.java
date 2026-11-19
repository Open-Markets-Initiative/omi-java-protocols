package omi.bme.bmefixedincome.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Message type. Section 3.3 assigns the message code of the equivalent Fix protocol message where there is one, so Logon is 0x41, and gives the rest a hexadecimal value below 0x20 or at or above 0x80
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Logon Response message is used by the Server to accept a new session. In this message the sequence number will always be 0
     */
    LOGON_RESPONSE_MESSAGE((short) 8, "The Logon Response message is used by the Server to accept a new session. In this message the sequence number will always be 0"),

    /**
     * The Logout message is used by the Server to notify the end of a session, whether it is solicited or unsolicited. It may also be the answer to a failed logon attempt (see Logon message)
     */
    LOGOUT_RESPONSE_MESSAGE((short) 11, "The Logout message is used by the Server to notify the end of a session, whether it is solicited or unsolicited. It may also be the answer to a failed logon attempt (see Logon message)"),

    /**
     * The Heartbeat message is used by the Server to indicate that the communication is active. In the Heartbeat message, the SequenceNumber of the previously received message will be repeated
     */
    HEARTBEAT_MESSAGE((short) 48, "The Heartbeat message is used by the Server to indicate that the communication is active. In the Heartbeat message, the SequenceNumber of the previously received message will be repeated"),

    /**
     * Message sent by the server with information about the connectivity between the Server and the central systems. In the Network Status message, the SequenceNumber of the previously received message will be repeated
     */
    NETWORK_STATUS_MESSAGE((short) 10, "Message sent by the server with information about the connectivity between the Server and the central systems. In the Network Status message, the SequenceNumber of the previously received message will be repeated"),

    /**
     * Sent by the server to inform about the session status in each Trading Mode
     */
    TRADING_SESSION_STATUS_MESSAGE((short) 104, "Sent by the server to inform about the session status in each Trading Mode"),

    /**
     * Used by the Server to communicate a Market Surveillance or system-wide text message
     */
    NEWS_MESSAGE((short) 66, "Used by the Server to communicate a Market Surveillance or system-wide text message"),

    /**
     * Message sent by the server for cancelling previously defined securities
     */
    SECURITY_LIST_CANCELLATION_REPORT_MESSAGE((short) 120, "Message sent by the server for cancelling previously defined securities"),

    /**
     * Message sent by the server to inform about closing prices and other statistics
     */
    STATISTICS_MESSAGE((short) 132, "Message sent by the server to inform about closing prices and other statistics"),

    /**
     * Message sent by the server to provide the definition of one security. It shares the same layout as the Security List Update Report message, but with a different Message Type
     */
    SECURITY_LIST_MESSAGE((short) 121, "Message sent by the server to provide the definition of one security. It shares the same layout as the Security List Update Report message, but with a different Message Type"),

    /**
     * Message sent by the server for reporting updates, during the session, to the security definition
     */
    SECURITY_LIST_UPDATE_REPORT_MESSAGE((short) 128, "Message sent by the server for reporting updates, during the session, to the security definition"),

    /**
     * Message sent by the server to inform on the status of one security
     */
    SECURITY_STATUS_MESSAGE((short) 102, "Message sent by the server to inform on the status of one security"),

    /**
     * Used by the server to communicate trade information related to trades resulting from order matching in channels C/D and E/F. It is also used in channels A/B when the trade is the result of order matching at the end of an auction period (where only top-of-book information is shown)
     */
    TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_TOP_OF_BOOK_MESSAGE((short) 16, "Used by the server to communicate trade information related to trades resulting from order matching in channels C/D and E/F. It is also used in channels A/B when the trade is the result of order matching at the end of an auction period (where only top-of-book information is shown)"),

    /**
     * Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. In this message, all fields with the suffix 2 refer to the sell order, and the ones without the suffix refer either to both legs or the buy order
     */
    TRADE_TRADE_AMENDMENT_OR_CANCELLATION_MESSAGE((short) 24, "Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. In this message, all fields with the suffix 2 refer to the sell order, and the ones without the suffix refer either to both legs or the buy order"),

    /**
     * Used by the Server to notify an indication of interest on a specific instrument. This functionality is available in Fixed Income and Derivatives
     */
    INDICATION_OF_INTEREST_MESSAGE((short) 54, "Used by the Server to notify an indication of interest on a specific instrument. This functionality is available in Fixed Income and Derivatives"),

    /**
     * Used by the server to communicate price information about RFQs. The contents of the RFQID field match those of the field IOIID in the corresponding Indication of Interest message
     */
    RFQ_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE((short) 133, "Used by the server to communicate price information about RFQs. The contents of the RFQID field match those of the field IOIID in the corresponding Indication of Interest message"),

    /**
     * Used by the UDP Servers to communicate Top-of-book price information during auctions. When there is an indicative match price, the fields BidPx1 and AskPx1 will have the same value
     */
    TOP_OF_BOOK_MESSAGE((short) 130, "Used by the UDP Servers to communicate Top-of-book price information during auctions. When there is an indicative match price, the fields BidPx1 and AskPx1 will have the same value");

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
            case 8 -> Optional.of(LOGON_RESPONSE_MESSAGE);
            case 11 -> Optional.of(LOGOUT_RESPONSE_MESSAGE);
            case 48 -> Optional.of(HEARTBEAT_MESSAGE);
            case 10 -> Optional.of(NETWORK_STATUS_MESSAGE);
            case 104 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 66 -> Optional.of(NEWS_MESSAGE);
            case 120 -> Optional.of(SECURITY_LIST_CANCELLATION_REPORT_MESSAGE);
            case 132 -> Optional.of(STATISTICS_MESSAGE);
            case 121 -> Optional.of(SECURITY_LIST_MESSAGE);
            case 128 -> Optional.of(SECURITY_LIST_UPDATE_REPORT_MESSAGE);
            case 102 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 16 -> Optional.of(TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_TOP_OF_BOOK_MESSAGE);
            case 24 -> Optional.of(TRADE_TRADE_AMENDMENT_OR_CANCELLATION_MESSAGE);
            case 54 -> Optional.of(INDICATION_OF_INTEREST_MESSAGE);
            case 133 -> Optional.of(RFQ_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE);
            case 130 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
