package omi.tadawul.saudiexchange.basic.itch.v1_9.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Number of seconds since midnight of the start of the trading day.
     */
    TIMESTAMP_SECONDS_MESSAGE('T', "Number of seconds since midnight of the start of the trading day."),

    /**
     * Trading system event has been triggered.
     */
    SYSTEM_EVENT_MESSAGE('S', "Trading system event has been triggered."),

    /**
     * Price tick table for one or more Orderbooks.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Price tick table for one or more Orderbooks."),

    /**
     * Quantity tick table for one or more Orderbooks.
     */
    QUANTITY_TICK_SIZE_MESSAGE('M', "Quantity tick table for one or more Orderbooks."),

    /**
     * Reference data for an Orderbook.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Reference data for an Orderbook."),

    /**
     * Suspension/unsuspension of an Orderbook.
     */
    ORDERBOOK_TRADING_ACTION_MESSAGE('H', "Suspension/unsuspension of an Orderbook."),

    /**
     * A trade has occurred.
     */
    TRADE_MESSAGE('P', "A trade has occurred."),

    /**
     * The top-of-book has changed for an Orderbook.
     */
    BEST_BID_OFFER_MESSAGE('Q', "The top-of-book has changed for an Orderbook."),

    /**
     * A reference/close/settlement price has changed for a book.
     */
    ORDERBOOK_PRICE_MESSAGE('X', "A reference/close/settlement price has changed for a book."),

    /**
     * Provides a member of an Index.
     */
    INDEX_MEMBER_DIRECTORY_MESSAGE('Y', "Provides a member of an Index."),

    /**
     * The value of an Index has been updated.
     */
    INDEX_VALUE_MESSAGE('Z', "The value of an Index has been updated.");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TIMESTAMP_SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'M' -> Optional.of(QUANTITY_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(ORDERBOOK_TRADING_ACTION_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Q' -> Optional.of(BEST_BID_OFFER_MESSAGE);
            case 'X' -> Optional.of(ORDERBOOK_PRICE_MESSAGE);
            case 'Y' -> Optional.of(INDEX_MEMBER_DIRECTORY_MESSAGE);
            case 'Z' -> Optional.of(INDEX_VALUE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
