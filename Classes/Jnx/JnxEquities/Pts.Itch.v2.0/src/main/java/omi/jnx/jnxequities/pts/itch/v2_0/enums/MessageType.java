package omi.jnx.jnxequities.pts.itch.v2_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * A Timestamp – Seconds Message is sent for every second in which at least one other message type is sent.
     */
    SECONDS_MESSAGE('T', "A Timestamp \u2013 Seconds Message is sent for every second in which at least one other message type is sent."),

    /**
     * System Event Messages denote data feed, system, and market events.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages denote data feed, system, and market events."),

    /**
     * Price Tick Size Messages define a set of price tick size tables.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Price Tick Size Messages define a set of price tick size tables."),

    /**
     * Orderbook Directory Messages provide information about order books available in the Japannext PTS execution system.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Messages provide information about order books available in the Japannext PTS execution system."),

    /**
     * A Trading State Message indicates the current trading state of an order book.
     */
    TRADING_STATE_MESSAGE('H', "A Trading State Message indicates the current trading state of an order book."),

    /**
     * A Short Selling Price Restriction State Message indicates the current short selling price restriction state of an order book.
     */
    SHORT_SELLING_PRICE_RESTRICTION_STATE_MESSAGE('Y', "A Short Selling Price Restriction State Message indicates the current short selling price restriction state of an order book."),

    /**
     * An Order Added Message is generated for normal orders accepted by the system.
     */
    ORDER_ADDED_MESSAGE_NO_ATTRIBUTES('A', "An Order Added Message is generated for normal orders accepted by the system."),

    /**
     * An Order Added with Attributes Message is generated for orders with market-specific attributes accepted by the system.
     */
    ORDER_ADDED_WITH_ATTRIBUTES_MESSAGE('F', "An Order Added with Attributes Message is generated for orders with market-specific attributes accepted by the system."),

    /**
     * An Order Executed Message is sent whenever an order in the order book is fully or partially executed.
     */
    ORDER_EXECUTED_MESSAGE('E', "An Order Executed Message is sent whenever an order in the order book is fully or partially executed."),

    /**
     * An Order Deleted Message is sent whenever an order in the order book has been canceled.
     */
    ORDER_DELETED_MESSAGE('D', "An Order Deleted Message is sent whenever an order in the order book has been canceled."),

    /**
     * An Order Replaced Message is sent whenever an order in the order book has been replaced.
     */
    ORDER_REPLACED_MESSAGE('U', "An Order Replaced Message is sent whenever an order in the order book has been replaced.");

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
            case 'Y' -> Optional.of(SHORT_SELLING_PRICE_RESTRICTION_STATE_MESSAGE);
            case 'A' -> Optional.of(ORDER_ADDED_MESSAGE_NO_ATTRIBUTES);
            case 'F' -> Optional.of(ORDER_ADDED_WITH_ATTRIBUTES_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
