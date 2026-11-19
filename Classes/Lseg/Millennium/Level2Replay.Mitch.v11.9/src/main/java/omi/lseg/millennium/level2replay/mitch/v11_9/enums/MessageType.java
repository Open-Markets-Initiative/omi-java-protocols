package omi.lseg.millennium.level2replay.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Used by the client to log in to the replay channel.
     */
    LOGIN_REQUEST_MESSAGE((short) 1, "Used by the client to log in to the replay channel."),

    /**
     * Used by the server to accept or reject a login request.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Used by the server to accept or reject a login request."),

    /**
     * Used by the client to request the retransmission of messages published on the multicast channel.
     */
    REPLAY_REQUEST_MESSAGE((short) 3, "Used by the client to request the retransmission of messages published on the multicast channel."),

    /**
     * Used by the server to accept or reject a replay request.
     */
    REPLAY_RESPONSE_MESSAGE((short) 4, "Used by the server to accept or reject a replay request."),

    /**
     * Used by the client to log out of the replay channel.
     */
    LOGOUT_REQUEST_MESSAGE((short) 5, "Used by the client to log out of the replay channel."),

    /**
     * Sent by the server for every second for which at least one application message is generated.
     */
    TIME_MESSAGE((short) 84, "Sent by the server for every second for which at least one application message is generated."),

    /**
     * Sent to indicate the start and end of the day.
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Sent to indicate the start and end of the day."),

    /**
     * Used to disseminate information (symbol, segment, ISIN, underlying, etc.) on each instrument
     */
    SYMBOL_DIRECTORY_MESSAGE((short) 82, "Used to disseminate information (symbol, segment, ISIN, underlying, etc.) on each instrument"),

    /**
     * Indicates the trading session (pre-opening, regular trading, etc.) that currently applies to an instrument.
     */
    SYMBOL_STATUS_MESSAGE((short) 72, "Indicates the trading session (pre-opening, regular trading, etc.) that currently applies to an instrument."),

    /**
     * Sent to indicate that an anonymous limit or market order is added to the order book.
     */
    ADD_ORDER_MESSAGE((short) 65, "Sent to indicate that an anonymous limit or market order is added to the order book."),

    /**
     * Indicates that a named order is added to the order book.
     */
    ADD_ATTRIBUTED_ORDER_MESSAGE((short) 70, "Indicates that a named order is added to the order book."),

    /**
     * Sent to indicate that the remainder of a displayed order is cancelled.
     */
    ORDER_DELETED_MESSAGE((short) 68, "Sent to indicate that the remainder of a displayed order is cancelled."),

    /**
     * Indicates that the displayed quantity or price of a displayed order has been updated.
     */
    ORDER_MODIFIED_MESSAGE((short) 85, "Indicates that the displayed quantity or price of a displayed order has been updated."),

    /**
     * Sent to instruct recipients to remove all orders from the order book for the specified instrument.
     */
    ORDER_BOOK_CLEAR_MESSAGE((short) 121, "Sent to instruct recipients to remove all orders from the order book for the specified instrument."),

    /**
     * Indicates that the displayed portion of an order is fully or partially filled at its displayed price.
     */
    ORDER_EXECUTED_MESSAGE((short) 69, "Indicates that the displayed portion of an order is fully or partially filled at its displayed price."),

    /**
     * Sent if a displayed order is fully or partially filled at a price that is different from its displayed price.
     */
    ORDER_EXECUTED_WITH_PRICE_SIZE_MESSAGE((short) 67, "Sent if a displayed order is fully or partially filled at a price that is different from its displayed price."),

    /**
     * Sent if a non-display order is fully or partially filled.
     */
    TRADE_MESSAGE((short) 80, "Sent if a non-display order is fully or partially filled."),

    /**
     * Sent to report details of an auction
     */
    AUCTION_TRADE_MESSAGE((short) 81, "Sent to report details of an auction"),

    /**
     * 9 Used to disseminate the indicative auction price and the tradable quantity and imbalance at this price.
     */
    AUCTION_INFO_MESSAGE((short) 73, "9 Used to disseminate the indicative auction price and the tradable quantity and imbalance at this price."),

    /**
     * Used to disseminate official Opening and Closing prices
     */
    STATISTICS_MESSAGE((short) 119, "Used to disseminate official Opening and Closing prices"),

    /**
     * Used to disseminate top of book changes when the instrument is in a scheduled level 1 only auction.
     */
    TOP_OF_BOOK_MESSAGE((short) 113, "Used to disseminate top of book changes when the instrument is in a scheduled level 1 only auction.");

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
            case 3 -> Optional.of(REPLAY_REQUEST_MESSAGE);
            case 4 -> Optional.of(REPLAY_RESPONSE_MESSAGE);
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
            case 73 -> Optional.of(AUCTION_INFO_MESSAGE);
            case 119 -> Optional.of(STATISTICS_MESSAGE);
            case 113 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
