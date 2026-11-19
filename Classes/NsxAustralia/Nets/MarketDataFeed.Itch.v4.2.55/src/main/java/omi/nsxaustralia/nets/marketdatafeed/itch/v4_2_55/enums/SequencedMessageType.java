package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * This message is sent to provide the time since Epoch. It should be used in combination with the Timestamp field of individual messages to determine the exact time for each message.
     */
    TIMESTAMP_MESSAGE('T', "This message is sent to provide the time since Epoch. It should be used in combination with the Timestamp field of individual messages to determine the exact time for each message."),

    /**
     * This message will be sent to provide information about events that are scheduled or triggered by the system. Events may occur at Orderbook, Board, Board+Product or System level.
     */
    SYSTEM_EVENT_MESSAGE('S', "This message will be sent to provide information about events that are scheduled or triggered by the system. Events may occur at Orderbook, Board, Board+Product or System level."),

    /**
     * This message provides the price ticks (steps) for the orderbooks in the system. It should be used as a lookup from Orderbook Directory [R] messages.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "This message provides the price ticks (steps) for the orderbooks in the system. It should be used as a lookup from Orderbook Directory [R] messages."),

    /**
     * This message provides the quantity ticks (steps) for the orderbooks in the system. It should be used as a lookup from Orderbook Directory [R] messages.
     */
    QUANTITY_TICK_SIZE_MESSAGE('M', "This message provides the quantity ticks (steps) for the orderbooks in the system. It should be used as a lookup from Orderbook Directory [R] messages."),

    /**
     * Orderbook Directory Messages are transmitted during the reference data spin. Static data messages are sent at the beginning of the feed and contain exchange reference information.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Messages are transmitted during the reference data spin. Static data messages are sent at the beginning of the feed and contain exchange reference information."),

    /**
     * This message indicates the current trading state of an orderbook.
     */
    ORDERBOOK_TRADING_ACTION_MESSAGE('H', "This message indicates the current trading state of an orderbook."),

    /**
     * This message provides dynamic reference values for an orderbook.
     */
    ORDERBOOK_ATTRIBUTE_MESSAGE('X', "This message provides dynamic reference values for an orderbook."),

    /**
     * This message provides reference information about system participants.
     */
    FIRM_DIRECTORY_MESSAGE('F', "This message provides reference information about system participants."),

    /**
     * This message is sent when an order is added to the orderbook.
     */
    ADD_ORDER_MESSAGE('A', "This message is sent when an order is added to the orderbook."),

    /**
     * This message is sent when an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent when an order on the book is executed in whole or in part."),

    /**
     * This message is sent when an order on the book is executed in whole or in part at a negotiated price different from the order price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent when an order on the book is executed in whole or in part at a negotiated price different from the order price."),

    /**
     * This message is sent when a trade is cancelled.
     */
    BROKEN_TRADE_MESSAGE('B', "This message is sent when a trade is cancelled."),

    /**
     * This message indicates when an order has been removed from the orderbook.
     */
    ORDER_DELETE_MESSAGE('D', "This message indicates when an order has been removed from the orderbook."),

    /**
     * This message indicates when an order in the orderbook has been modified.
     */
    ORDER_REPLACE_MESSAGE('U', "This message indicates when an order in the orderbook has been modified."),

    /**
     * This message provides auction information including the theoretical opening price and quantity.
     */
    INDICATIVE_PRICE_QUANTITY_MESSAGE('I', "This message provides auction information including the theoretical opening price and quantity."),

    /**
     * This message is sent to provide information about off-book matching.
     */
    TRADE_MESSAGE('P', "This message is sent to provide information about off-book matching."),

    /**
     * This message disseminates exchange news.
     */
    NEWS_MESSAGE('N', "This message disseminates exchange news."),

    /**
     * This message provides details about index members and their respective weightings within an index.
     */
    INDEX_MEMBER_DIRECTORY_MESSAGE('Y', "This message provides details about index members and their respective weightings within an index."),

    /**
     * This message disseminates index values to market participants.
     */
    INDEX_VALUE_MESSAGE('Z', "This message disseminates index values to market participants.");

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
            case 'T' -> Optional.of(TIMESTAMP_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'M' -> Optional.of(QUANTITY_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(ORDERBOOK_TRADING_ACTION_MESSAGE);
            case 'X' -> Optional.of(ORDERBOOK_ATTRIBUTE_MESSAGE);
            case 'F' -> Optional.of(FIRM_DIRECTORY_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'I' -> Optional.of(INDICATIVE_PRICE_QUANTITY_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'N' -> Optional.of(NEWS_MESSAGE);
            case 'Y' -> Optional.of(INDEX_MEMBER_DIRECTORY_MESSAGE);
            case 'Z' -> Optional.of(INDEX_VALUE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
