package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

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
     * For high-volume feeds, this message is sent at the start of every second during periods of active data publication. The client can concatenate the SourceTime field with the SourceTimeNS field in subsequent market data messages to get full 8-byte Matching Engine event timestamps.
     */
    SOURCE_TIME_REFERENCE_MESSAGE(2, "For high-volume feeds, this message is sent at the start of every second during periods of active data publication. The client can concatenate the SourceTime field with the SourceTimeNS field in subsequent market data messages to get full 8-byte Matching Engine event timestamps."),

    /**
     * This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(3, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol."),

    /**
     * In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh.
     */
    SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * Clients who have experienced a sequence number gap and need a retransmission of the missed messages should send a Retransmission Request message via TCP to the Request Controller.
     */
    RETRANSMISSION_REQUEST_MESSAGE(10, "Clients who have experienced a sequence number gap and need a retransmission of the missed messages should send a Retransmission Request message via TCP to the Request Controller."),

    /**
     * This message is sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel.
     */
    SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE(13, "This message is sent by clients via TCP/IP requesting the Symbol Index Mapping messages for one or all symbols in a specified channel."),

    /**
     * Clients who have experienced a failure and need a refresh of the state of one or all symbols in a specific channel should send a Refresh Request message via TCP to the Request Controller.
     */
    REFRESH_REQUEST_MESSAGE(15, "Clients who have experienced a failure and need a refresh of the state of one or all symbols in a specific channel should send a Refresh Request message via TCP to the Request Controller."),

    /**
     * This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission.
     */
    MESSAGE_UNAVAILABLE_MESSAGE(31, "This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission."),

    /**
     * The first message in each packet of refresh messages published over the Refresh multicast channels is of this type.
     */
    REFRESH_HEADER_MESSAGE(35, "The first message in each packet of refresh messages published over the Refresh multicast channels is of this type."),

    /**
     * This message will be sent immediately via TCP/IP in response to the client's request for retransmission, refresh or Symbol Mapping messages.
     */
    REQUEST_RESPONSE_MESSAGE(11, "This message will be sent immediately via TCP/IP in response to the client's request for retransmission, refresh or Symbol Mapping messages."),

    /**
     * Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds. If no timely client response is received, the connection will be closed.
     */
    HEARTBEAT_RESPONSE_MESSAGE(12, "Clients who remain connected to the Retransmission Server intraday must respond to a Heartbeat with a Heartbeat Response message within 5 seconds. If no timely client response is received, the connection will be closed."),

    /**
     * A Trade message is sent when there is an execution on the order book.
     */
    TRADE_MESSAGE(220, "A Trade message is sent when there is an execution on the order book."),

    /**
     * In the event that an earlier trade has been reported in error, a Trade Cancel message is sent.
     */
    TRADE_CANCEL_MESSAGE(221, "In the event that an earlier trade has been reported in error, a Trade Cancel message is sent."),

    /**
     * In the event that an earlier trade has been reported with one or multiple fields in error, a Trade Correction message is sent.
     */
    TRADE_CORRECTION_MESSAGE(222, "In the event that an earlier trade has been reported with one or multiple fields in error, a Trade Correction message is sent."),

    /**
     * The stock summary message is sent every 1 minute on a separate channel from the main trades feed.
     */
    STOCK_SUMMARY_MESSAGE(223, "The stock summary message is sent every 1 minute on a separate channel from the main trades feed."),

    /**
     * TRF Fractional Trade Message. New message effective 1/12/26.
     */
    TRF_FRACTIONAL_TRADE_MESSAGE(210, "TRF Fractional Trade Message. New message effective 1/12/26."),

    /**
     * TRF Trade Cancel Message. Same structure as Trade Cancel Message (221).
     */
    TRF_TRADE_CANCEL_MESSAGE(216, "TRF Trade Cancel Message. Same structure as Trade Cancel Message (221)."),

    /**
     * TRF Fractional Trade Correction Message. New message effective 1/12/26.
     */
    TRF_FRACTIONAL_TRADE_CORRECTION_MESSAGE(212, "TRF Fractional Trade Correction Message. New message effective 1/12/26."),

    /**
     * If a TRF participant firm fails to report a trade on the day in which it occurs, the firm may report the trade on a subsequent day by publishing a Prior Day Trade message. New message effective 1/12/26.
     */
    TRF_FRACTIONAL_PRIOR_DAY_TRADE_MESSAGE(213, "If a TRF participant firm fails to report a trade on the day in which it occurs, the firm may report the trade on a subsequent day by publishing a Prior Day Trade message. New message effective 1/12/26."),

    /**
     * If a TRF participant firm discovers that it has reported a trade with an inaccurate price or volume on a previous day, the firm may correct the trade on a subsequent day by publishing a Prior Day Trade Cancel message, followed by a Prior Day Trade. New message effective 1/12/26.
     */
    TRF_FRACTIONAL_PRIOR_DAY_TRADE_CANCEL_MESSAGE(214, "If a TRF participant firm discovers that it has reported a trade with an inaccurate price or volume on a previous day, the firm may correct the trade on a subsequent day by publishing a Prior Day Trade Cancel message, followed by a Prior Day Trade. New message effective 1/12/26.");

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
            case 10 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 13 -> Optional.of(SYMBOL_INDEX_MAPPING_REQUEST_MESSAGE);
            case 15 -> Optional.of(REFRESH_REQUEST_MESSAGE);
            case 31 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 35 -> Optional.of(REFRESH_HEADER_MESSAGE);
            case 11 -> Optional.of(REQUEST_RESPONSE_MESSAGE);
            case 12 -> Optional.of(HEARTBEAT_RESPONSE_MESSAGE);
            case 220 -> Optional.of(TRADE_MESSAGE);
            case 221 -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 222 -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 223 -> Optional.of(STOCK_SUMMARY_MESSAGE);
            case 210 -> Optional.of(TRF_FRACTIONAL_TRADE_MESSAGE);
            case 216 -> Optional.of(TRF_TRADE_CANCEL_MESSAGE);
            case 212 -> Optional.of(TRF_FRACTIONAL_TRADE_CORRECTION_MESSAGE);
            case 213 -> Optional.of(TRF_FRACTIONAL_PRIOR_DAY_TRADE_MESSAGE);
            case 214 -> Optional.of(TRF_FRACTIONAL_PRIOR_DAY_TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
