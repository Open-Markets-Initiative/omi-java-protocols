package omi.pse.pseequities.totalview.itch.v2_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Time Stamp - Seconds Message.
     */
    TIME_STAMP_SECONDS_MESSAGE('T', "Time Stamp - Seconds Message."),

    /**
     * System Event Message.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Message."),

    /**
     * Trading Schedule Message.
     */
    TRADING_SCHEDULE_MESSAGE('s', "Trading Schedule Message."),

    /**
     * Tick Size Table.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "Tick Size Table."),

    /**
     * Tick Size Table.
     */
    QUANTITY_TICK_SIZE_MESSAGE('M', "Tick Size Table."),

    /**
     * Orderbook Directory Message.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Message."),

    /**
     * Orderbook Restrictions Message.
     */
    ORDERBOOK_RESTRICTIONS_MESSAGE('k', "Orderbook Restrictions Message."),

    /**
     * Stock Trading Action Message.
     */
    ORDERBOOK_TRADING_ACTION_MESSAGE('H', "Stock Trading Action Message."),

    /**
     * Add Order Message.
     */
    ADD_ORDER_MESSAGE('A', "Add Order Message."),

    /**
     * Order Executed Message.
     */
    ORDER_EXECUTED_MESSAGE('E', "Order Executed Message."),

    /**
     * Order Executed (with Broker ID) Message.
     */
    ORDER_EXECUTED_WITH_BROKER_ID_MESSAGE('e', "Order Executed (with Broker ID) Message."),

    /**
     * Order Executed with Price Message.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Order Executed with Price Message."),

    /**
     * Order Executed with Price (and Broker ID) Message.
     */
    ORDER_EXECUTED_WITH_PRICE_AND_BROKER_ID_MESSAGE('c', "Order Executed with Price (and Broker ID) Message."),

    /**
     * Broken Trade Message.
     */
    BROKEN_TRADE_MESSAGE('B', "Broken Trade Message."),

    /**
     * Order Delete Message.
     */
    ORDER_DELETE_MESSAGE('D', "Order Delete Message."),

    /**
     * Order Replace Message.
     */
    ORDER_REPLACE_MESSAGE('U', "Order Replace Message."),

    /**
     * Indicative Price/Quantity Message.
     */
    INDICATIVE_PRICE_QUANTITY_MESSAGE('I', "Indicative Price/Quantity Message."),

    /**
     * Trade Message.
     */
    TRADE_MESSAGE('P', "Trade Message."),

    /**
     * Trade (with Broker ID) Message.
     */
    TRADE_WITH_BROKER_ID_MESSAGE('p', "Trade (with Broker ID) Message."),

    /**
     * Foreign Shares Available Message.
     */
    FOREIGN_SHARES_AVAILABLE_MESSAGE('f', "Foreign Shares Available Message.");

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
            case 's' -> Optional.of(TRADING_SCHEDULE_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'M' -> Optional.of(QUANTITY_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'k' -> Optional.of(ORDERBOOK_RESTRICTIONS_MESSAGE);
            case 'H' -> Optional.of(ORDERBOOK_TRADING_ACTION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'e' -> Optional.of(ORDER_EXECUTED_WITH_BROKER_ID_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'c' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_AND_BROKER_ID_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'I' -> Optional.of(INDICATIVE_PRICE_QUANTITY_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'p' -> Optional.of(TRADE_WITH_BROKER_ID_MESSAGE);
            case 'f' -> Optional.of(FOREIGN_SHARES_AVAILABLE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
