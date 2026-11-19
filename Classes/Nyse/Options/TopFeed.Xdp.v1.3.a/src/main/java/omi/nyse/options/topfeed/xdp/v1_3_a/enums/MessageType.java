package omi.nyse.options.topfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Outright Quote message provides the price and aggregated volume for the best bid and best offer. Volumes aggregate quote and order interest. The message also indicates aggregated Customer volumes within the overall volumes.
     */
    OUTRIGHT_QUOTE_MESSAGE(401, "The Outright Quote message provides the price and aggregated volume for the best bid and best offer. Volumes aggregate quote and order interest. The message also indicates aggregated Customer volumes within the overall volumes."),

    /**
     * The Outright Trade message is used to publish all Last Sales for outright symbols.
     */
    OUTRIGHT_TRADE_MESSAGE(407, "The Outright Trade message is used to publish all Last Sales for outright symbols."),

    /**
     * The Trade Cancel message is used to cancel or bust a trade.
     */
    OUTRIGHT_TRADE_CANCEL_MESSAGE(409, "The Trade Cancel message is used to cancel or bust a trade."),

    /**
     * The Trade Correction message is used to correct a trade.
     */
    OUTRIGHT_TRADE_CORRECTION_MESSAGE(411, "The Trade Correction message is used to correct a trade."),

    /**
     * The Outright Imbalance message is sent during the Pre-opening phase or a symbol Halt to provide indicative opening price and net imbalance of all orders at that price which are orders eligible for next Auction.
     */
    OUTRIGHT_IMBALANCE_MESSAGE(413, "The Outright Imbalance message is sent during the Pre-opening phase or a symbol Halt to provide indicative opening price and net imbalance of all orders at that price which are orders eligible for next Auction."),

    /**
     * The Outright Crossing RFQ (Request for Quote) message is sent out in the event of an auction on an outright order.
     */
    OUTRIGHT_CROSSING_RFQ_MESSAGE(415, "The Outright Crossing RFQ (Request for Quote) message is sent out in the event of an auction on an outright order."),

    /**
     * The Outright BOLD RFQ (Request for Quote) message notifies clients of a special exposure order (a BOLD order) available for execution on a first-come first-served basis.
     */
    OUTRIGHT_BOLD_RFQ_MESSAGE(471, "The Outright BOLD RFQ (Request for Quote) message notifies clients of a special exposure order (a BOLD order) available for execution on a first-come first-served basis."),

    /**
     * The Outright summary message provides trading highlights of the day. It is sent out once at the end of the trading day as soon as a symbol closes.
     */
    OUTRIGHT_SUMMARY_MESSAGE(417, "The Outright summary message provides trading highlights of the day. It is sent out once at the end of the trading day as soon as a symbol closes."),

    /**
     * The Underlying Status message is used to inform the subscribers of changes in the status of an Underlying symbol.
     */
    UNDERLYING_STATUS_MESSAGE(419, "The Underlying Status message is used to inform the subscribers of changes in the status of an Underlying symbol."),

    /**
     * The Series Status message is used to inform the subscribers of changes in symbol status of an outright symbol.
     */
    OUTRIGHT_SERIES_STATUS_MESSAGE(421, "The Series Status message is used to inform the subscribers of changes in symbol status of an outright symbol."),

    /**
     * The Refresh Quote message is sent in the event no quote messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_OUTRIGHT_QUOTE_MESSAGE(501, "The Refresh Quote message is sent in the event no quote messages are published for the symbol for 2 consecutive minutes."),

    /**
     * The Refresh Outright Trade message is sent in the event no Outright Trade messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_OUTRIGHT_TRADE_MESSAGE(507, "The Refresh Outright Trade message is sent in the event no Outright Trade messages are published for the symbol for 2 consecutive minutes."),

    /**
     * The Refresh Outright Imbalance message is sent in the event no Outright Imbalance messages are published for the symbol for 2 consecutive minutes during Pre-opening or a symbol Halt.
     */
    REFRESH_OUTRIGHT_IMBALANCE_MESSAGE(509, "The Refresh Outright Imbalance message is sent in the event no Outright Imbalance messages are published for the symbol for 2 consecutive minutes during Pre-opening or a symbol Halt."),

    /**
     * On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.
     */
    UNDERLYING_INDEX_MAPPING_MESSAGE(435, "On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all."),

    /**
     * On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.
     */
    SERIES_INDEX_MAPPING_MESSAGE(437, "On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all."),

    /**
     * In all multicast channels, a Stream ID Message is sent immediately after each packet header to uniquely identify the source or Stream ID of the data in the packet.
     */
    STREAM_ID_MESSAGE(455, "In all multicast channels, a Stream ID Message is sent immediately after each packet header to uniquely identify the source or Stream ID of the data in the packet."),

    /**
     * This message is sent to reset the Message Sequence Number at start of day, or in response to failures.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "This message is sent to reset the Message Sequence Number at start of day, or in response to failures.");

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
            case 401 -> Optional.of(OUTRIGHT_QUOTE_MESSAGE);
            case 407 -> Optional.of(OUTRIGHT_TRADE_MESSAGE);
            case 409 -> Optional.of(OUTRIGHT_TRADE_CANCEL_MESSAGE);
            case 411 -> Optional.of(OUTRIGHT_TRADE_CORRECTION_MESSAGE);
            case 413 -> Optional.of(OUTRIGHT_IMBALANCE_MESSAGE);
            case 415 -> Optional.of(OUTRIGHT_CROSSING_RFQ_MESSAGE);
            case 471 -> Optional.of(OUTRIGHT_BOLD_RFQ_MESSAGE);
            case 417 -> Optional.of(OUTRIGHT_SUMMARY_MESSAGE);
            case 419 -> Optional.of(UNDERLYING_STATUS_MESSAGE);
            case 421 -> Optional.of(OUTRIGHT_SERIES_STATUS_MESSAGE);
            case 501 -> Optional.of(REFRESH_OUTRIGHT_QUOTE_MESSAGE);
            case 507 -> Optional.of(REFRESH_OUTRIGHT_TRADE_MESSAGE);
            case 509 -> Optional.of(REFRESH_OUTRIGHT_IMBALANCE_MESSAGE);
            case 435 -> Optional.of(UNDERLYING_INDEX_MAPPING_MESSAGE);
            case 437 -> Optional.of(SERIES_INDEX_MAPPING_MESSAGE);
            case 455 -> Optional.of(STREAM_ID_MESSAGE);
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}
