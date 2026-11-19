package omi.nyse.arcaoptions.deepfeed.pillar.v1_2_f.enums;

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
    OUTRIGHT_SERIES_INDEX_MAPPING(50, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or PILLAR Publisher failover."),

    /**
     * This message informs clients of changes in the status of a specific option outright series and complex series
     */
    OPTIONS_STATUS_MESSAGE(51, "This message informs clients of changes in the status of a specific option outright series and complex series"),

    /**
     * An Options Add Order message is published when a new visible order has been received and added to the book.
     */
    OPTIONS_ADD_ORDER_MESSAGE(300, "An Options Add Order message is published when a new visible order has been received and added to the book."),

    /**
     * An Options Modify Order message is sent when the price or volume of an order is changed due to an event other than a cancel-replace, or full or partial execution.
     */
    OPTIONS_MODIFY_ORDER_MESSAGE(301, "An Options Modify Order message is sent when the price or volume of an order is changed due to an event other than a cancel-replace, or full or partial execution."),

    /**
     * An Options Modify Order message is sent when the price or volume of an order is changed due to an event other than a cancel-replace, or full or partial execution.
     */
    OPTIONS_DELETE_ORDER_MESSAGE(302, "An Options Modify Order message is sent when the price or volume of an order is changed due to an event other than a cancel-replace, or full or partial execution."),

    /**
     * An Options Order Execution message is sent when an order is partially or fully executed.
     */
    OPTIONS_ORDER_EXECUTION_MESSAGE(303, "An Options Order Execution message is sent when an order is partially or fully executed."),

    /**
     * An Options Replace Order message is published when a cancel/replace order is received.
     */
    OPTIONS_REPLACE_ORDER_MESSAGE(304, "An Options Replace Order message is published when a cancel/replace order is received."),

    /**
     * Options Imbalance messages are published once a second during opening and re-opening auctions to update price and volume information.
     */
    OPTIONS_IMBALANCE_MESSAGE(305, "Options Imbalance messages are published once a second during opening and re-opening auctions to update price and volume information."),

    /**
     * See the Pillar Common Client Specification for details on Time Reference and Symbol/Series Index Mapping messages, and Order ID and Price field formats.
     */
    OPTIONS_ADD_ORDER_REFRESH_MESSAGE(306, "See the Pillar Common Client Specification for details on Time Reference and Symbol/Series Index Mapping messages, and Order ID and Price field formats."),

    /**
     * The Request for outright series RFQ data is published for outright series.
     */
    OPTIONS_SERIES_RFQ_MESSAGE(307, "The Request for outright series RFQ data is published for outright series."),

    /**
     * An Options Non Displayed Trade message is published as a result of a match between two non-displayed orders.
     */
    OPTIONS_NON_DISPLAYED_TRADE_MESSAGE(310, "An Options Non Displayed Trade message is published as a result of a match between two non-displayed orders."),

    /**
     * An Options Cross Trade message is published on completion of a crossing from the opening and re-opening auction, and shows the bulk volume that traded in the auction. The Cross Type field indicates the auction type. Additionally, a non-printable Order Execution or Non-Displayed Trade message will be published for each order that traded.
     */
    OPTIONS_CROSS_TRADE_MESSAGE(311, "An Options Cross Trade message is published on completion of a crossing from the opening and re-opening auction, and shows the bulk volume that traded in the auction. The Cross Type field indicates the auction type. Additionally, a non-printable Order Execution or Non-Displayed Trade message will be published for each order that traded."),

    /**
     * In the event that an earlier trade has been reported in error, an Options Trade Cancel message is published.
     */
    OPTIONS_TRADE_CANCEL_MESSAGE(312, "In the event that an earlier trade has been reported in error, an Options Trade Cancel message is published."),

    /**
     * The outright series summary message is published every 60 seconds, on a separate multicast channel from the main feed.
     */
    OPTIONS_OUTRIGHT_SERIES_SUMMARY_MESSAGE(323, "The outright series summary message is published every 60 seconds, on a separate multicast channel from the main feed.");

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
            case 50 -> Optional.of(OUTRIGHT_SERIES_INDEX_MAPPING);
            case 51 -> Optional.of(OPTIONS_STATUS_MESSAGE);
            case 300 -> Optional.of(OPTIONS_ADD_ORDER_MESSAGE);
            case 301 -> Optional.of(OPTIONS_MODIFY_ORDER_MESSAGE);
            case 302 -> Optional.of(OPTIONS_DELETE_ORDER_MESSAGE);
            case 303 -> Optional.of(OPTIONS_ORDER_EXECUTION_MESSAGE);
            case 304 -> Optional.of(OPTIONS_REPLACE_ORDER_MESSAGE);
            case 305 -> Optional.of(OPTIONS_IMBALANCE_MESSAGE);
            case 306 -> Optional.of(OPTIONS_ADD_ORDER_REFRESH_MESSAGE);
            case 307 -> Optional.of(OPTIONS_SERIES_RFQ_MESSAGE);
            case 310 -> Optional.of(OPTIONS_NON_DISPLAYED_TRADE_MESSAGE);
            case 311 -> Optional.of(OPTIONS_CROSS_TRADE_MESSAGE);
            case 312 -> Optional.of(OPTIONS_TRADE_CANCEL_MESSAGE);
            case 323 -> Optional.of(OPTIONS_OUTRIGHT_SERIES_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
