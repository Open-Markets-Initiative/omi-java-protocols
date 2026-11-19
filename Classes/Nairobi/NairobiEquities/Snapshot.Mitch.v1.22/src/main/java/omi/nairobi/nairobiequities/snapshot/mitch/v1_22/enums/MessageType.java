package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Used by the client to login to the Replay or Snapshot channel.
     */
    LOGIN_REQUEST_MESSAGE((short) 1, "Used by the client to login to the Replay or Snapshot channel."),

    /**
     * Used by the server to accept or reject a login request to the Replay or Snapshot channel.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Used by the server to accept or reject a login request to the Replay or Snapshot channel."),

    /**
     * Used by the client to request for a snapshot of the current order book on the Snapshot channel.
     */
    SNAPSHOT_REQUEST_MESSAGE((short) 129, "Used by the client to request for a snapshot of the current order book on the Snapshot channel."),

    /**
     * Used by the server to respond to a snapshot request on the Snapshot channel.
     */
    SNAPSHOT_RESPONSE_MESSAGE((short) 130, "Used by the server to respond to a snapshot request on the Snapshot channel."),

    /**
     * Used by the server to indicate that the transmission of an order book snapshot is complete.
     */
    SNAPSHOT_COMPLETE_MESSAGE((short) 131, "Used by the server to indicate that the transmission of an order book snapshot is complete."),

    /**
     * Used by the client to logout of the Replay or Snapshot channel.
     */
    LOGOUT_REQUEST_MESSAGE((short) 5, "Used by the client to logout of the Replay or Snapshot channel."),

    /**
     * Sent by the server for every second for which at least one application message is generated; its time is the reference for the nanosecond offsets of every other application message.
     */
    TIME_MESSAGE((short) 84, "Sent by the server for every second for which at least one application message is generated; its time is the reference for the nanosecond offsets of every other application message."),

    /**
     * Sent to indicate the start and end of the day.
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Sent to indicate the start and end of the day."),

    /**
     * Used to disseminate information (e.g. symbol, segment, ISIN, underlying, etc.) on each instrument.
     */
    SYMBOL_DIRECTORY_MESSAGE((short) 82, "Used to disseminate information (e.g. symbol, segment, ISIN, underlying, etc.) on each instrument."),

    /**
     * Indicates the trading session (e.g. pre-opening, regular trading, etc.) that currently applies to an instrument.
     */
    SYMBOL_STATUS_MESSAGE((short) 72, "Indicates the trading session (e.g. pre-opening, regular trading, etc.) that currently applies to an instrument."),

    /**
     * Sent to indicate that an anonymous limit or market order is added to the order book.
     */
    ADD_ORDER_MESSAGE((short) 65, "Sent to indicate that an anonymous limit or market order is added to the order book."),

    /**
     * Indicates that an attributable limit order is added to the order book. The identity of the submitting firm is included in the message.
     */
    ADD_ATTRIBUTED_ORDER_MESSAGE((short) 70, "Indicates that an attributable limit order is added to the order book. The identity of the submitting firm is included in the message."),

    /**
     * Sent to indicate that the remainder of a displayed order is cancelled.
     */
    ORDER_DELETED_MESSAGE((short) 68, "Sent to indicate that the remainder of a displayed order is cancelled."),

    /**
     * Indicates that the displayed quantity or price of a displayed order has been updated, and whether the order has retained or lost its time priority.
     */
    ORDER_MODIFIED_MESSAGE((short) 85, "Indicates that the displayed quantity or price of a displayed order has been updated, and whether the order has retained or lost its time priority."),

    /**
     * Sent to instruct recipients to remove all orders from the order book for the specified instrument.
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all orders from the order book for the specified instrument."),

    /**
     * Indicates that the displayed portion of an order is fully or partially filled at its displayed price. The executed quantity is included in the message.
     */
    ORDER_EXECUTED_MESSAGE((short) 69, "Indicates that the displayed portion of an order is fully or partially filled at its displayed price. The executed quantity is included in the message."),

    /**
     * Sent if a displayed order is fully or partially filled at a price that is different from its displayed price, with an indication of whether the trade should update time and sales and statistics displays.
     */
    ORDER_EXECUTED_WITH_PRICE_SIZE_MESSAGE((short) 67, "Sent if a displayed order is fully or partially filled at a price that is different from its displayed price, with an indication of whether the trade should update time and sales and statistics displays."),

    /**
     * Sent if the non-displayed portion of an iceberg order or a reserve order is fully or partially filled, or if the negotiated non-disclosed order in the block trade order book is executed.
     */
    TRADE_MESSAGE((short) 80, "Sent if the non-displayed portion of an iceberg order or a reserve order is fully or partially filled, or if the negotiated non-disclosed order in the block trade order book is executed."),

    /**
     * Sent to report details of an auction (e.g. opening, closing, intra-day, etc.).
     */
    AUCTION_TRADE_MESSAGE((short) 81, "Sent to report details of an auction (e.g. opening, closing, intra-day, etc.)."),

    /**
     * Sent to report the details of an off-book trade.
     */
    OFF_BOOK_TRADE_MESSAGE((short) 120, "Sent to report the details of an off-book trade."),

    /**
     * Sent to indicate that a previously reported trade is cancelled.
     */
    TRADE_BREAK_MESSAGE((short) 66, "Sent to indicate that a previously reported trade is cancelled."),

    /**
     * Sent to report the correction of the executed quantity of a trade.
     */
    TRADE_CORRECTION_MESSAGE((short) 96, "Sent to report the correction of the executed quantity of a trade."),

    /**
     * Sent on the Snapshot channel to retransmit the trades published on the Real-Time channel.
     */
    RECOVERY_TRADE_MESSAGE((short) 118, "Sent on the Snapshot channel to retransmit the trades published on the Real-Time channel."),

    /**
     * Indicative auction information for an instrument; the document labels the message type Indicative Auction Info.
     */
    AUCTION_INFO_MESSAGE((short) 73, "Indicative auction information for an instrument; the document labels the message type Indicative Auction Info."),

    /**
     * Sent to disseminate the opening, closing and previous closing prices of an instrument.
     */
    STATISTICS_MESSAGE((short) 119, "Sent to disseminate the opening, closing and previous closing prices of an instrument."),

    /**
     * Sent to disseminate the high, low, VWAP, volume, turnover and other statistics of an instrument for a sub book.
     */
    EXTENDED_STATISTICS_MESSAGE((short) 128, "Sent to disseminate the high, low, VWAP, volume, turnover and other statistics of an instrument for a sub book."),

    /**
     * Sent to disseminate the volume, turnover and trades of a market, sector or instrument type.
     */
    CONSOLIDATED_STATISTICS_MESSAGE((short) 100, "Sent to disseminate the volume, turnover and trades of a market, sector or instrument type."),

    /**
     * Sent to disseminate the value of an index.
     */
    INDEX_MESSAGE((short) 98, "Sent to disseminate the value of an index."),

    /**
     * Sent to disseminate the details of an All or None auction.
     */
    AON_INFO_MESSAGE((short) 101, "Sent to disseminate the details of an All or None auction."),

    /**
     * Sent to disseminate an announcement.
     */
    NEWS_MESSAGE((short) 117, "Sent to disseminate an announcement."),

    /**
     * Communicates the addition of a new price point or a size update to an already published price point.
     */
    UPDATE_PRICE_POINT_MESSAGE((short) 115, "Communicates the addition of a new price point or a size update to an already published price point."),

    /**
     * Communicates the removal of a price point.
     */
    DELETE_PRICE_POINT_MESSAGE((short) 114, "Communicates the removal of a price point."),

    /**
     * Communicates the best price and cumulative visible size of a side of an order book.
     */
    TOP_OF_BOOK_MESSAGE((short) 113, "Communicates the best price and cumulative visible size of a side of an order book.");

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
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 129 -> Optional.of(SNAPSHOT_REQUEST_MESSAGE);
            case 130 -> Optional.of(SNAPSHOT_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SNAPSHOT_COMPLETE_MESSAGE);
            case 5 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 84 -> Optional.of(TIME_MESSAGE);
            case 83 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 82 -> Optional.of(SYMBOL_DIRECTORY_MESSAGE);
            case 72 -> Optional.of(SYMBOL_STATUS_MESSAGE);
            case 65 -> Optional.of(ADD_ORDER_MESSAGE);
            case 70 -> Optional.of(ADD_ATTRIBUTED_ORDER_MESSAGE);
            case 68 -> Optional.of(ORDER_DELETED_MESSAGE);
            case 85 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 121 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 69 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 67 -> Optional.of(ORDER_EXECUTED_WITH_PRICE_SIZE_MESSAGE);
            case 80 -> Optional.of(TRADE_MESSAGE);
            case 81 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 120 -> Optional.of(OFF_BOOK_TRADE_MESSAGE);
            case 66 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 96 -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 118 -> Optional.of(RECOVERY_TRADE_MESSAGE);
            case 73 -> Optional.of(AUCTION_INFO_MESSAGE);
            case 119 -> Optional.of(STATISTICS_MESSAGE);
            case 128 -> Optional.of(EXTENDED_STATISTICS_MESSAGE);
            case 100 -> Optional.of(CONSOLIDATED_STATISTICS_MESSAGE);
            case 98 -> Optional.of(INDEX_MESSAGE);
            case 101 -> Optional.of(AON_INFO_MESSAGE);
            case 117 -> Optional.of(NEWS_MESSAGE);
            case 115 -> Optional.of(UPDATE_PRICE_POINT_MESSAGE);
            case 114 -> Optional.of(DELETE_PRICE_POINT_MESSAGE);
            case 113 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
