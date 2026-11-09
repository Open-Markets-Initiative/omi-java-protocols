package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

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
     * This message is sent at the start of every second during periods of active data publication
     */
    TIME_REFERENCE_MESSAGE(2, "This message is sent at the start of every second during periods of active data publication"),

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
    SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery of a Matching Engine or an XDP Publisher, the publisher may send a full state refresh for every symbol affected. This kind of unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * The first message in each packet of refresh messages published over the Refresh multicast channels is of this type.
     */
    REFRESH_HEADER_MESSAGE(35, "The first message in each packet of refresh messages published over the Refresh multicast channels is of this type."),

    /**
     * This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or PILLAR Publisher failover.
     */
    OUTRIGHT_SERIES_INDEX_MAPPING_MESSAGE(50, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or PILLAR Publisher failover."),

    /**
     * This message informs clients of changes in the status of a specific option outright series and complex series
     */
    OPTIONS_STATUS_MESSAGE(51, "This message informs clients of changes in the status of a specific option outright series and complex series"),

    /**
     * An Options quote message is sent when any event results in a new top of book value on either side of the market
     */
    OPTIONS_QUOTE_MESSAGE(340, "An Options quote message is sent when any event results in a new top of book value on either side of the market"),

    /**
     * An Options Trade message is sent when there is an execution on the order book.
     */
    OPTIONS_TRADE_MESSAGE(320, "An Options Trade message is sent when there is an execution on the order book."),

    /**
     * In the event that an earlier trade has been reported in error, an Options Trade Cancel message is sent
     */
    OPTIONS_TRADE_CANCEL_MESSAGE(321, "In the event that an earlier trade has been reported in error, an Options Trade Cancel message is sent"),

    /**
     * In the event that an earlier trade has been reported with one or multiple fields in error
     */
    OPTIONS_TRADE_CORRECTION_MESSAGE(322, "In the event that an earlier trade has been reported with one or multiple fields in error"),

    /**
     * Options Imbalance messages are published once a second during opening and reopening auctions to update price and volume information
     */
    OPTIONS_IMBALANCE_MESSAGE(305, "Options Imbalance messages are published once a second during opening and reopening auctions to update price and volume information"),

    /**
     * The Request for Series RFQ message is published for outright series.
     */
    SERIES_RFQ_MESSAGE(307, "The Request for Series RFQ message is published for outright series."),

    /**
     * The Series Summary message will provide the following trade statistics per series: high, low, open, close and total volume
     */
    OUTRIGHT_SERIES_SUMMARY_MESSAGE(323, "The Series Summary message will provide the following trade statistics per series: high, low, open, close and total volume");

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
            case 2 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 3 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 10 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 11 -> Optional.of(REQUEST_RESPONSE_MESSAGE);
            case 12 -> Optional.of(HEARTBEAT_RESPONSE_MESSAGE);
            case 13 -> Optional.of(SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE);
            case 15 -> Optional.of(REFRESH_REQUEST_MESSAGE);
            case 31 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 32 -> Optional.of(SYMBOL_CLEAR_MESSAGE);
            case 34 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 35 -> Optional.of(REFRESH_HEADER_MESSAGE);
            case 50 -> Optional.of(OUTRIGHT_SERIES_INDEX_MAPPING_MESSAGE);
            case 51 -> Optional.of(OPTIONS_STATUS_MESSAGE);
            case 340 -> Optional.of(OPTIONS_QUOTE_MESSAGE);
            case 320 -> Optional.of(OPTIONS_TRADE_MESSAGE);
            case 321 -> Optional.of(OPTIONS_TRADE_CANCEL_MESSAGE);
            case 322 -> Optional.of(OPTIONS_TRADE_CORRECTION_MESSAGE);
            case 305 -> Optional.of(OPTIONS_IMBALANCE_MESSAGE);
            case 307 -> Optional.of(SERIES_RFQ_MESSAGE);
            case 323 -> Optional.of(OUTRIGHT_SERIES_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
