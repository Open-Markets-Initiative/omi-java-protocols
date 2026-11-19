package omi.nyse.nyseequities.bqt.xdp.v1_7_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This message is sent to reset the Message Sequence Number at start of day, or in response to failures.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "This message is sent to reset the Message Sequence Number at start of day, or in response to failures."),

    /**
     * This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or XDP Publisher failover. It provides referential data for a single specified symbol.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(3, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or XDP Publisher failover. It provides referential data for a single specified symbol."),

    /**
     * Clients who have experienced a sequence number gap and need a retransmission of the missed messages should send a Retransmission Request message via TCP to the Request Controller. A Request Response message will be sent over the TCP connection back to the client, and if the request was valid, the requested message(s) will be re-published over the relevant Retransmission multicast channel.
     */
    RETRANSMISSION_REQUEST_MESSAGE(10, "Clients who have experienced a sequence number gap and need a retransmission of the missed messages should send a Retransmission Request message via TCP to the Request Controller. A Request Response message will be sent over the TCP connection back to the client, and if the request was valid, the requested message(s) will be re-published over the relevant Retransmission multicast channel."),

    /**
     * This message will be sent immediately via TCP/IP in response to the client’s request for retransmission, refresh or Symbol Mapping messages.
     */
    REQUEST_RESPONSE_MESSAGE(11, "This message will be sent immediately via TCP/IP in response to the client\u2019s request for retransmission, refresh or Symbol Mapping messages."),

    /**
     * Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds. If no timely client response is received, the connection will be closed.
     */
    HEARTBEAT_RESPONSE_MESSAGE(12, "Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds. If no timely client response is received, the connection will be closed."),

    /**
     * This message is sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel.
     */
    SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE(13, "This message is sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel."),

    /**
     * Clients who have experienced a failure and need a refresh of the state of one or all symbols in a specific channel should send a Retransmission Request message via TCP to the Request Controller. A Request Response message will be sent over the TCP connection back to the client, and if the request was valid, the requested message(s) will be published over the relevant Refresh multicast channel.
     */
    REFRESH_REQUEST_MESSAGE(15, "Clients who have experienced a failure and need a refresh of the state of one or all symbols in a specific channel should send a Retransmission Request message via TCP to the Request Controller. A Request Response message will be sent over the TCP connection back to the client, and if the request was valid, the requested message(s) will be published over the relevant Refresh multicast channel."),

    /**
     * This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission.
     */
    MESSAGE_UNAVAILABLE_MESSAGE(31, "This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission."),

    /**
     * In case of a failure and recovery of a Matching Engine or an XDP Publisher, the publisher may send a full state refresh for every symbol affected. This kind of unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh.
     */
    CONSOLIDATED_SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery of a Matching Engine or an XDP Publisher, the publisher may send a full state refresh for every symbol affected. This kind of unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh."),

    /**
     * This message is sent on both the BBO feed and the Trades feed from the Arca market only.
     */
    CONSOLIDATED_TRADING_SESSION_CHANGE_MESSAGE(33, "This message is sent on both the BBO feed and the Trades feed from the Arca market only."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    CONSOLIDATED_SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * The first message in each packet of refresh messages published over the Refresh multicast channels is of this type.
     */
    REFRESH_HEADER_MESSAGE(35, "The first message in each packet of refresh messages published over the Refresh multicast channels is of this type."),

    /**
     * This message is sent when an event causes a change in one or both sides of the BBO.
     */
    BQT_MESSAGE(142, "This message is sent when an event causes a change in one or both sides of the BBO."),

    /**
     * This message is sent when an event causes a change in only one side of a BBO.
     */
    CONSOLIDATED_SINGLE_SIDED_QUOTE_MESSAGE(143, "This message is sent when an event causes a change in only one side of a BBO."),

    /**
     * The Trade messages provided on the Trades feed are the same Trade messages provided to the Cta. All Trades are passed through and marked with the originating Market ID.
     */
    CONSOLIDATED_TRADE_MESSAGE(220, "The Trade messages provided on the Trades feed are the same Trade messages provided to the Cta. All Trades are passed through and marked with the originating Market ID."),

    /**
     * This message is sent when a trade is cancelled
     */
    CONSOLIDATED_TRADE_CANCEL_MESSAGE(221, "This message is sent when a trade is cancelled"),

    /**
     * This message is sent when a trade is corrected
     */
    CONSOLIDATED_TRADE_CORRECTION_MESSAGE(222, "This message is sent when a trade is corrected"),

    /**
     * The stock summary message is sent every 1 minute regardless of whether there is a change to a particular value or not. In the event that there is no volume on the stock, the stock summary message will not be disseminated.
     */
    CONSOLIDATED_STOCK_SUMMARY_MESSAGE(229, "The stock summary message is sent every 1 minute regardless of whether there is a change to a particular value or not. In the event that there is no volume on the stock, the stock summary message will not be disseminated."),

    /**
     * Published on consolidated volume channels
     */
    CONSOLIDATED_VOLUME_MESSAGE(240, "Published on consolidated volume channels");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 3 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 10 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 11 -> Optional.of(REQUEST_RESPONSE_MESSAGE);
            case 12 -> Optional.of(HEARTBEAT_RESPONSE_MESSAGE);
            case 13 -> Optional.of(SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE);
            case 15 -> Optional.of(REFRESH_REQUEST_MESSAGE);
            case 31 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 32 -> Optional.of(CONSOLIDATED_SYMBOL_CLEAR_MESSAGE);
            case 33 -> Optional.of(CONSOLIDATED_TRADING_SESSION_CHANGE_MESSAGE);
            case 34 -> Optional.of(CONSOLIDATED_SECURITY_STATUS_MESSAGE);
            case 35 -> Optional.of(REFRESH_HEADER_MESSAGE);
            case 142 -> Optional.of(BQT_MESSAGE);
            case 143 -> Optional.of(CONSOLIDATED_SINGLE_SIDED_QUOTE_MESSAGE);
            case 220 -> Optional.of(CONSOLIDATED_TRADE_MESSAGE);
            case 221 -> Optional.of(CONSOLIDATED_TRADE_CANCEL_MESSAGE);
            case 222 -> Optional.of(CONSOLIDATED_TRADE_CORRECTION_MESSAGE);
            case 229 -> Optional.of(CONSOLIDATED_STOCK_SUMMARY_MESSAGE);
            case 240 -> Optional.of(CONSOLIDATED_VOLUME_MESSAGE);
            default -> Optional.empty();
        };
    }
}
