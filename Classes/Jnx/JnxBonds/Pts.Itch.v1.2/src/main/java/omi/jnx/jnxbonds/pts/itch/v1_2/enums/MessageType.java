package omi.jnx.jnxbonds.pts.itch.v1_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Number of seconds past midnight that the message was generated; the nanoseconds portion is provided in subsequent messages as the number of nanoseconds since the most recent Timestamp Seconds Message.
     */
    SECONDS_MESSAGE('T', "Number of seconds past midnight that the message was generated; the nanoseconds portion is provided in subsequent messages as the number of nanoseconds since the most recent Timestamp Seconds Message."),

    /**
     * System Event Messages signal data feed, system and market events.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal data feed, system and market events."),

    /**
     * Price Tick Size Messages define a set of price tick size tables.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Price Tick Size Messages define a set of price tick size tables."),

    /**
     * Orderbook Directory Messages provide information about orderbooks available in the Japannext PTS execution system.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Messages provide information about orderbooks available in the Japannext PTS execution system."),

    /**
     * Trading State Message indicates current trading status of an orderbook.
     */
    TRADING_STATE_MESSAGE('H', "Trading State Message indicates current trading status of an orderbook."),

    /**
     * Order Added Message indicates that a new order has been accepted by the Japannext PTS execution system and was added to the displayable book.
     */
    ORDER_ADDED_MESSAGE('A', "Order Added Message indicates that a new order has been accepted by the Japannext PTS execution system and was added to the displayable book."),

    /**
     * Order Executed Message is sent whenever an order in the book is executed in whole or part.
     */
    ORDER_EXECUTED_MESSAGE('E', "Order Executed Message is sent whenever an order in the book is executed in whole or part."),

    /**
     * Order Deleted Message is sent whenever an order in the book has been canceled.
     */
    ORDER_DELETED_MESSAGE('D', "Order Deleted Message is sent whenever an order in the book has been canceled."),

    /**
     * Order Replaced Message is sent whenever an order in the book has been replaced.
     */
    ORDER_REPLACED_MESSAGE('U', "Order Replaced Message is sent whenever an order in the book has been replaced.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_STATE_MESSAGE);
            case 'A' -> Optional.of(ORDER_ADDED_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
