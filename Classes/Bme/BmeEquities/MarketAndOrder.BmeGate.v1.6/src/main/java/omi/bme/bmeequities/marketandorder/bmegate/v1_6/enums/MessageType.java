package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

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
     * The Logon message is used to start a session by the client application
     */
    LOGON_MESSAGE((short) 65, "The Logon message is used to start a session by the client application"),

    /**
     * The Logout message is used by the client application to request the end of a session
     */
    LOGOUT_MESSAGE((short) 53, "The Logout message is used by the client application to request the end of a session"),

    /**
     * It may be sent by the server to inform about the rejection of an unsupported or syntactically incorrect message. In the Reject message, the SequenceNumber of the previously received message will be repeated
     */
    REJECT_MESSAGE((short) 13, "It may be sent by the server to inform about the rejection of an unsupported or syntactically incorrect message. In the Reject message, the SequenceNumber of the previously received message will be repeated"),

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
     * Message sent by the UDP full-depth server whenever the information about order prices must be reset. In particular, it is sent by the server when the trading mode changes from auction to open market and vice versa
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 129, "Message sent by the UDP full-depth server whenever the information about order prices must be reset. In particular, it is sent by the server when the trading mode changes from auction to open market and vice versa"),

    /**
     * Used by the Server to communicate information about all active visible orders. During a session, any order is uniquely identified by the SecondaryOrderID
     */
    ORDER_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE((short) 3, "Used by the Server to communicate information about all active visible orders. During a session, any order is uniquely identified by the SecondaryOrderID"),

    /**
     * Used by the Server to communicate information about active quotes. In a session, a Quote is univoquely identified by its two orders: SecurityCode and SecondaryOrderID (buy order) and SecondaryOrderID2 (sell order)
     */
    QUOTE_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE((short) 7, "Used by the Server to communicate information about active quotes. In a session, a Quote is univoquely identified by its two orders: SecurityCode and SecondaryOrderID (buy order) and SecondaryOrderID2 (sell order)"),

    /**
     * Used by the Server to communicate information order cancellation. The same message is used in Full-Depth data feeds (for order cancellations of any user), in the Order Entry Server (for cancellations of user orders) and in the Market &amp; Order Server (for order cancellations of any user)
     */
    ORDER_CANCELLATION_MARKET_MEMBER_MESSAGE((short) 1, "Used by the Server to communicate information order cancellation. The same message is used in Full-Depth data feeds (for order cancellations of any user), in the Order Entry Server (for cancellations of user orders) and in the Market & Order Server (for order cancellations of any user)"),

    /**
     * Used by the Server to communicate information about quote cancellation. The same message is used in Full-Depth data feeds (for quote cancellations of any user), in the Order Entry Server (for cancellations of user quotes) and in the Market &amp; Order Server (for quote cancellations of any user)
     */
    QUOTE_CANCELLATION_MARKET_MEMBER_MESSAGE((short) 5, "Used by the Server to communicate information about quote cancellation. The same message is used in Full-Depth data feeds (for quote cancellations of any user), in the Order Entry Server (for cancellations of user quotes) and in the Market & Order Server (for quote cancellations of any user)"),

    /**
     * Used by the server to communicate trade information related to trades resulting from order matching in channels C/D and E/F. It is also used in channels A/B when the trade is the result of order matching at the end of an auction period (where only top-of-book information is shown)
     */
    TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_TOP_OF_BOOK_MESSAGE((short) 16, "Used by the server to communicate trade information related to trades resulting from order matching in channels C/D and E/F. It is also used in channels A/B when the trade is the result of order matching at the end of an auction period (where only top-of-book information is shown)"),

    /**
     * Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. In this message, all fields with the suffix 2 refer to the sell order, and the ones without the suffix refer either to both legs or the buy order
     */
    TRADE_TRADE_AMENDMENT_OR_CANCELLATION_MESSAGE((short) 24, "Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. In this message, all fields with the suffix 2 refer to the sell order, and the ones without the suffix refer either to both legs or the buy order"),

    /**
     * Used by the server to communicate trade information related to trades resulting from order matching. The message also contains the situation in which the relevant orders will remain in the books
     */
    TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_FULL_DEPTH_MESSAGE((short) 17, "Used by the server to communicate trade information related to trades resulting from order matching. The message also contains the situation in which the relevant orders will remain in the books"),

    /**
     * Used by the UDP Servers to communicate Top-of-book price information during auctions. When there is an indicative match price, the fields BidPx1 and AskPx1 will have the same value
     */
    TOP_OF_BOOK_MESSAGE((short) 130, "Used by the UDP Servers to communicate Top-of-book price information during auctions. When there is an indicative match price, the fields BidPx1 and AskPx1 will have the same value"),

    /**
     * Sent by the client to set default attributes for subsequent orders and quotes. Please note that in Fixed Income it is possible to enter orders on behalf of other members (AccountMember), based on the corresponding brokerage permissions
     */
    ORDER_AND_QUOTE_CLIENT_DATA_MESSAGE((short) 111, "Sent by the client to set default attributes for subsequent orders and quotes. Please note that in Fixed Income it is possible to enter orders on behalf of other members (AccountMember), based on the corresponding brokerage permissions"),

    /**
     * Message sent by the client to enter a new order
     */
    SIMPLE_NEW_ORDER_MESSAGE((short) 68, "Message sent by the client to enter a new order"),

    /**
     * Message sent by the client to enter a new order and, at the same time, the values for the Client Data parmeters. Note that no ClientDataID may be assigned
     */
    SIMPLE_NEW_ORDER_WITH_CLIENT_DATA_MESSAGE((short) 69, "Message sent by the client to enter a new order and, at the same time, the values for the Client Data parmeters. Note that no ClientDataID may be assigned"),

    /**
     * Message sent by the client to modify an order. The field OrderID must contain the client reference of the order that is to be modified
     */
    SIMPLE_ORDER_MODIFICATION_MESSAGE((short) 71, "Message sent by the client to modify an order. The field OrderID must contain the client reference of the order that is to be modified"),

    /**
     * Message sent by the client to modify an order. The field OrderID must contain the client reference of the order that is to be modified
     */
    SIMPLE_ORDER_MODIFICATION_WITH_CLIENT_DATA_MESSAGE((short) 72, "Message sent by the client to modify an order. The field OrderID must contain the client reference of the order that is to be modified"),

    /**
     * Message sent by the client to cancel an order. The field OrderID must contain a reference to the order that is to be cancelled
     */
    ORDER_CANCELLATION_REQUEST_MESSAGE((short) 70, "Message sent by the client to cancel an order. The field OrderID must contain a reference to the order that is to be cancelled"),

    /**
     * Message sent by the client application to create a new quote. A new quote by the same user on the same SecurityCode and with the same ClientDataID cancels the previous one
     */
    NEW_QUOTE_MESSAGE((short) 83, "Message sent by the client application to create a new quote. A new quote by the same user on the same SecurityCode and with the same ClientDataID cancels the previous one"),

    /**
     * Message sent by the client to modify a quote. Field ClientDataID is required in RF to identify a quote
     */
    QUOTE_MODIFICATION_REQUEST_MESSAGE((short) 97, "Message sent by the client to modify a quote. Field ClientDataID is required in RF to identify a quote"),

    /**
     * Message sent by the client to cancel a quote
     */
    QUOTE_CANCELLATION_REQUEST_MESSAGE((short) 90, "Message sent by the client to cancel a quote"),

    /**
     * Message sent by the client to request the cancellation of multiple orders and or quotes, based on the specified selection criteria
     */
    MASS_ORDERQUOTE_CANCELLATION_MESSAGE((short) 113, "Message sent by the client to request the cancellation of multiple orders and or quotes, based on the specified selection criteria"),

    /**
     * Sent by the server to confirm an Order and Quote Client Data Parameters message
     */
    ORDER_AND_QUOTE_CLIENT_DATA_PARAMETERS_ACK_NACK_MESSAGE((short) 135, "Sent by the server to confirm an Order and Quote Client Data Parameters message"),

    /**
     * Sent by the server to inform about the order status. Please note that the first fields of this message are the same as the ones for Order Market Pre- Transparency Information (Msg Type = 0x03) (see section 5.4.12)
     */
    SIMPLE_ORDER_STATUS_MESSAGE((short) 2, "Sent by the server to inform about the order status. Please note that the first fields of this message are the same as the ones for Order Market Pre- Transparency Information (Msg Type = 0x03) (see section 5.4.12)"),

    /**
     * Sent by the server to inform about the status of a Quote
     */
    QUOTE_STATUS_MESSAGE((short) 6, "Sent by the server to inform about the status of a Quote"),

    /**
     * Sent by the server to inform about the rejection of a Simple order modification (MsgType = 0x47) or an Order cancellation request (MsgType = 0x46)
     */
    ORDER_CANCEL_REJECT_MESSAGE((short) 57, "Sent by the server to inform about the rejection of a Simple order modification (MsgType = 0x47) or an Order cancellation request (MsgType = 0x46)"),

    /**
     * Message reporting the completion of a valid mass order cancellation request. More than one message may be sent for a single RequestID
     */
    MASS_ORDERQUOTE_CANCELLATION_COMPLETION_MESSAGE((short) 114, "Message reporting the completion of a valid mass order cancellation request. More than one message may be sent for a single RequestID"),

    /**
     * Message reporting the rejection of a mass order cancellation request. More than one message may be sent for a single RequestID
     */
    MASS_ORDERQUOTE_CANCELLATION_REJECT_MESSAGE((short) 115, "Message reporting the rejection of a mass order cancellation request. More than one message may be sent for a single RequestID"),

    /**
     * It may be sent by the server to inform about the rejection of a supported message that is syntactically correct in an unsupported situation
     */
    BUSINESS_MESSAGE_REJECT_MESSAGE((short) 106, "It may be sent by the server to inform about the rejection of a supported message that is syntactically correct in an unsupported situation"),

    /**
     * Sent by the server to inform about a trade where two orders of the user are involved both as Buyer and Seller
     */
    EXECUTION_PRIVATE_INFORMATION_2_LEGS_MESSAGE((short) 23, "Sent by the server to inform about a trade where two orders of the user are involved both as Buyer and Seller"),

    /**
     * Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade as Buyer. It is also sent to inform about the amendment or cancellation of whatever origin trade where the user is involved as Buyer. Shares the same layout as the next message
     */
    TRADE_TRADE_AMENDMENT_OR_CANCELLATION_1_LEG_BUY_PRIVATE_INFORMATION_MESSAGE((short) 26, "Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade as Buyer. It is also sent to inform about the amendment or cancellation of whatever origin trade where the user is involved as Buyer. Shares the same layout as the next message"),

    /**
     * Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade as Seller
     */
    TRADE_TRADE_AMENDMENT_OR_CANCELLATION_1_LEG_SELL_PRIVATE_INFORMATION_MESSAGE((short) 28, "Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade as Seller"),

    /**
     * Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade both as Buyer and Seller
     */
    TRADE_TRADE_AMENDMENT_OR_CANCELLATION_2_LEGS_PRIVATE_INFORMATION_MESSAGE((short) 30, "Sent by the server to inform about a trade produced due to any reason other than order matching, also to inform about trades produced due to order matching in a Dark pool. The user is involved in the trade both as Buyer and Seller"),

    /**
     * Sent by the server to inform about a trade where the user is involved as Buyer. In the order where the member is not involved, only the market information is sent, so that the application can update the books
     */
    EXECUTION_PRIVATE_INFORMATION_1_LEG_BUY_MARKET_ORDER_MESSAGE((short) 19, "Sent by the server to inform about a trade where the user is involved as Buyer. In the order where the member is not involved, only the market information is sent, so that the application can update the books"),

    /**
     * Sent by the server to inform about a trade where the user is involved as Seller. In the order where the member is not involved, only the market information is sent, so that the application can update the books
     */
    EXECUTION_PRIVATE_INFORMATION_1_LEG_SELL_MARKET_ORDER_MESSAGE((short) 21, "Sent by the server to inform about a trade where the user is involved as Seller. In the order where the member is not involved, only the market information is sent, so that the application can update the books");

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
            case 65 -> Optional.of(LOGON_MESSAGE);
            case 53 -> Optional.of(LOGOUT_MESSAGE);
            case 13 -> Optional.of(REJECT_MESSAGE);
            case 104 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 66 -> Optional.of(NEWS_MESSAGE);
            case 120 -> Optional.of(SECURITY_LIST_CANCELLATION_REPORT_MESSAGE);
            case 132 -> Optional.of(STATISTICS_MESSAGE);
            case 121 -> Optional.of(SECURITY_LIST_MESSAGE);
            case 128 -> Optional.of(SECURITY_LIST_UPDATE_REPORT_MESSAGE);
            case 102 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 129 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 3 -> Optional.of(ORDER_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE);
            case 7 -> Optional.of(QUOTE_MARKET_PRE_TRANSPARENCY_INFORMATION_MESSAGE);
            case 1 -> Optional.of(ORDER_CANCELLATION_MARKET_MEMBER_MESSAGE);
            case 5 -> Optional.of(QUOTE_CANCELLATION_MARKET_MEMBER_MESSAGE);
            case 16 -> Optional.of(TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_TOP_OF_BOOK_MESSAGE);
            case 24 -> Optional.of(TRADE_TRADE_AMENDMENT_OR_CANCELLATION_MESSAGE);
            case 17 -> Optional.of(TRADE_MARKET_POST_TRANSPARENCY_INFORMATION_FULL_DEPTH_MESSAGE);
            case 130 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 111 -> Optional.of(ORDER_AND_QUOTE_CLIENT_DATA_MESSAGE);
            case 68 -> Optional.of(SIMPLE_NEW_ORDER_MESSAGE);
            case 69 -> Optional.of(SIMPLE_NEW_ORDER_WITH_CLIENT_DATA_MESSAGE);
            case 71 -> Optional.of(SIMPLE_ORDER_MODIFICATION_MESSAGE);
            case 72 -> Optional.of(SIMPLE_ORDER_MODIFICATION_WITH_CLIENT_DATA_MESSAGE);
            case 70 -> Optional.of(ORDER_CANCELLATION_REQUEST_MESSAGE);
            case 83 -> Optional.of(NEW_QUOTE_MESSAGE);
            case 97 -> Optional.of(QUOTE_MODIFICATION_REQUEST_MESSAGE);
            case 90 -> Optional.of(QUOTE_CANCELLATION_REQUEST_MESSAGE);
            case 113 -> Optional.of(MASS_ORDERQUOTE_CANCELLATION_MESSAGE);
            case 135 -> Optional.of(ORDER_AND_QUOTE_CLIENT_DATA_PARAMETERS_ACK_NACK_MESSAGE);
            case 2 -> Optional.of(SIMPLE_ORDER_STATUS_MESSAGE);
            case 6 -> Optional.of(QUOTE_STATUS_MESSAGE);
            case 57 -> Optional.of(ORDER_CANCEL_REJECT_MESSAGE);
            case 114 -> Optional.of(MASS_ORDERQUOTE_CANCELLATION_COMPLETION_MESSAGE);
            case 115 -> Optional.of(MASS_ORDERQUOTE_CANCELLATION_REJECT_MESSAGE);
            case 106 -> Optional.of(BUSINESS_MESSAGE_REJECT_MESSAGE);
            case 23 -> Optional.of(EXECUTION_PRIVATE_INFORMATION_2_LEGS_MESSAGE);
            case 26 -> Optional.of(TRADE_TRADE_AMENDMENT_OR_CANCELLATION_1_LEG_BUY_PRIVATE_INFORMATION_MESSAGE);
            case 28 -> Optional.of(TRADE_TRADE_AMENDMENT_OR_CANCELLATION_1_LEG_SELL_PRIVATE_INFORMATION_MESSAGE);
            case 30 -> Optional.of(TRADE_TRADE_AMENDMENT_OR_CANCELLATION_2_LEGS_PRIVATE_INFORMATION_MESSAGE);
            case 19 -> Optional.of(EXECUTION_PRIVATE_INFORMATION_1_LEG_BUY_MARKET_ORDER_MESSAGE);
            case 21 -> Optional.of(EXECUTION_PRIVATE_INFORMATION_1_LEG_SELL_MARKET_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
