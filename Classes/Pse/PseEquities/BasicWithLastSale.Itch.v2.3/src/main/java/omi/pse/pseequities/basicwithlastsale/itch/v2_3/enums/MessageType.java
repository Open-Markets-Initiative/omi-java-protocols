package omi.pse.pseequities.basicwithlastsale.itch.v2_3.enums;

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
     * Trade Message.
     */
    TRADE_MESSAGE('P', "Trade Message."),

    /**
     * Trade (with Broker ID) Message.
     */
    TRADE_WITH_BROKER_ID_MESSAGE('p', "Trade (with Broker ID) Message."),

    /**
     * BBO Quotation Message.
     */
    BBO_QUOTATION_MESSAGE('O', "BBO Quotation Message.");

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
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'p' -> Optional.of(TRADE_WITH_BROKER_ID_MESSAGE);
            case 'O' -> Optional.of(BBO_QUOTATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
