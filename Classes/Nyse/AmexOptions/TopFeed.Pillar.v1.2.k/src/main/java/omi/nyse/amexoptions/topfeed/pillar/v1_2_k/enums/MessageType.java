package omi.nyse.amexoptions.topfeed.pillar.v1_2_k.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Sent to reset the Message Sequence Number at start of day, or in response to failure recoveries.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "Sent to reset the Message Sequence Number at start of day, or in response to failure recoveries."),

    /**
     * Sent at the start of every second during periods of active data publication.
     */
    SOURCE_TIME_REFERENCE_MESSAGE(2, "Sent at the start of every second during periods of active data publication."),

    /**
     * Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified symbol or underlying symbol.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(3, "Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified symbol or underlying symbol."),

    /**
     * In case of a failure and recovery, the publisher may send a full state refresh for every symbol or series affected, preceded by a Symbol Clear message.
     */
    SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery, the publisher may send a full state refresh for every symbol or series affected, preceded by a Symbol Clear message."),

    /**
     * Informs clients of changes in the status of a specific security or underlying symbol, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "Informs clients of changes in the status of a specific security or underlying symbol, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified options outright series.
     */
    OUTRIGHT_SERIES_INDEX_MAPPING_MESSAGE(50, "Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified options outright series."),

    /**
     * Informs clients of changes in the status of a specific option outright series and complex series, such as Trading Halts.
     */
    OPTIONS_STATUS_MESSAGE(51, "Informs clients of changes in the status of a specific option outright series and complex series, such as Trading Halts."),

    /**
     * Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified options complex series.
     */
    COMPLEX_SERIES_INDEX_MAPPING_MESSAGE(60, "Published over the real-time data channels at system startup or in the context of a refresh sequence. Provides referential data for a single specified options complex series."),

    /**
     * Sent by clients via TCP/IP to request retransmission of missed messages.
     */
    RETRANSMISSION_REQUEST_MESSAGE(10, "Sent by clients via TCP/IP to request retransmission of missed messages."),

    /**
     * The first message in each packet of refresh messages published over the Refresh multicast channels.
     */
    REFRESH_HEADER_MESSAGE(35, "The first message in each packet of refresh messages published over the Refresh multicast channels."),

    /**
     * Sent by clients via TCP/IP to request a refresh of the state of one or all symbols in a specific channel.
     */
    REFRESH_REQUEST_MESSAGE(15, "Sent by clients via TCP/IP to request a refresh of the state of one or all symbols in a specific channel."),

    /**
     * Sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel.
     */
    SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE(13, "Sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel."),

    /**
     * Sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages.
     */
    MESSAGE_UNAVAILABLE_MESSAGE(31, "Sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages."),

    /**
     * Sent immediately via TCP/IP in response to the client's request for retransmission, refresh or Symbol Mapping messages.
     */
    REQUEST_RESPONSE_MESSAGE(11, "Sent immediately via TCP/IP in response to the client's request for retransmission, refresh or Symbol Mapping messages."),

    /**
     * Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds.
     */
    HEARTBEAT_RESPONSE_MESSAGE(12, "Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds."),

    /**
     * An Options quote message is sent when any event results in a new top of book value on either side of the market.
     */
    OPTIONS_QUOTE_MESSAGE(340, "An Options quote message is sent when any event results in a new top of book value on either side of the market."),

    /**
     * An Options Trade message is sent when there is an execution on the order book.
     */
    OPTIONS_TRADE_MESSAGE(320, "An Options Trade message is sent when there is an execution on the order book."),

    /**
     * In the event that an earlier trade has been reported in error, an Options Trade Cancel message is sent.
     */
    OPTIONS_TRADE_CANCEL_MESSAGE(321, "In the event that an earlier trade has been reported in error, an Options Trade Cancel message is sent."),

    /**
     * In the event that an earlier trade has been reported with one or multiple fields in error, an Options Trade Correction message is sent.
     */
    OPTIONS_TRADE_CORRECTION_MESSAGE(322, "In the event that an earlier trade has been reported with one or multiple fields in error, an Options Trade Correction message is sent."),

    /**
     * Options Imbalance messages are published every 5 seconds during opening and reopening auctions to update price and volume information.
     */
    OPTIONS_IMBALANCE_MESSAGE(305, "Options Imbalance messages are published every 5 seconds during opening and reopening auctions to update price and volume information."),

    /**
     * The Request for Series RFQ message is published for outright series. It is generated by the matching engine to solicit interest in an auction or order.
     */
    SERIES_RFQ_MESSAGE(307, "The Request for Series RFQ message is published for outright series. It is generated by the matching engine to solicit interest in an auction or order."),

    /**
     * The outright series summary message is sent every 60 seconds, on a separate multicast channel from the main feed.
     */
    OUTRIGHT_SERIES_SUMMARY_MESSAGE(323, "The outright series summary message is sent every 60 seconds, on a separate multicast channel from the main feed.");

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
            case 2 -> Optional.of(SOURCE_TIME_REFERENCE_MESSAGE);
            case 3 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 32 -> Optional.of(SYMBOL_CLEAR_MESSAGE);
            case 34 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 50 -> Optional.of(OUTRIGHT_SERIES_INDEX_MAPPING_MESSAGE);
            case 51 -> Optional.of(OPTIONS_STATUS_MESSAGE);
            case 60 -> Optional.of(COMPLEX_SERIES_INDEX_MAPPING_MESSAGE);
            case 10 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 35 -> Optional.of(REFRESH_HEADER_MESSAGE);
            case 15 -> Optional.of(REFRESH_REQUEST_MESSAGE);
            case 13 -> Optional.of(SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE);
            case 31 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 11 -> Optional.of(REQUEST_RESPONSE_MESSAGE);
            case 12 -> Optional.of(HEARTBEAT_RESPONSE_MESSAGE);
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
