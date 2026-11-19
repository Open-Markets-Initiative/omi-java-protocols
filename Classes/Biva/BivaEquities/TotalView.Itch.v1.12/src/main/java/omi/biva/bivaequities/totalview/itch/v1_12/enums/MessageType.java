package omi.biva.bivaequities.totalview.itch.v1_12.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Itch timestamp, number of seconds since midnight of the system start
     */
    TIME_STAMP_SECONDS_MESSAGE('T', "Itch timestamp, number of seconds since midnight of the system start"),

    /**
     * System event message
     */
    SYSTEM_EVENT_MESSAGE('S', "System event message"),

    /**
     * Orderbook price tick table
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Orderbook price tick table"),

    /**
     * Orderbook quantity tick table
     */
    QUANTITY_TICK_SIZE_MESSAGE('M', "Orderbook quantity tick table"),

    /**
     * Orderbook directory
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook directory"),

    /**
     * Participant directory
     */
    PARTICIPANT_DIRECTORY_MESSAGE('F', "Participant directory"),

    /**
     * Trading action message
     */
    ORDERBOOK_TRADING_ACTION_MESSAGE('H', "Trading action message"),

    /**
     * Orderbook reference price message
     */
    ORDERBOOK_REFERENCE_PRICE_MESSAGE('X', "Orderbook reference price message"),

    /**
     * Add order message
     */
    ADD_ORDER_MESSAGE('A', "Add order message"),

    /**
     * Order executed
     */
    ORDER_EXECUTED_MESSAGE('E', "Order executed"),

    /**
     * Order executed with price
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Order executed with price"),

    /**
     * Trade message
     */
    TRADE_MESSAGE('P', "Trade message"),

    /**
     * Busted trade message
     */
    BROKEN_TRADE_MESSAGE('B', "Busted trade message"),

    /**
     * Delete order
     */
    ORDER_DELETE_MESSAGE('D', "Delete order"),

    /**
     * Updated order
     */
    ORDER_REPLACE_MESSAGE('U', "Updated order"),

    /**
     * Indicative price quantity message
     */
    INDICATIVE_PRICE_QUANTITY_MESSAGE('I', "Indicative price quantity message");

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
            case 'T' -> Optional.of(TIME_STAMP_SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'M' -> Optional.of(QUANTITY_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'F' -> Optional.of(PARTICIPANT_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(ORDERBOOK_TRADING_ACTION_MESSAGE);
            case 'X' -> Optional.of(ORDERBOOK_REFERENCE_PRICE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'I' -> Optional.of(INDICATIVE_PRICE_QUANTITY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
