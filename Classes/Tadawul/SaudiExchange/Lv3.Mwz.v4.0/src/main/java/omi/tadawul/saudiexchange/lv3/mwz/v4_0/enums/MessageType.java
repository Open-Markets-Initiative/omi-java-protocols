package omi.tadawul.saudiexchange.lv3.mwz.v4_0.enums;

import java.util.Optional;

/**
 * Which message follows, as trader's ipc::MessageType numbers it
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The publisher is going: one byte, its meaning not stated
     */
    DISCONNECT_MESSAGE(1, "The publisher is going: one byte, its meaning not stated"),

    /**
     * An orderbook halted or resumed
     */
    TRADING_ACTION_MESSAGE(38, "An orderbook halted or resumed"),

    /**
     * An order added to the book
     */
    ADD_ORDER_MESSAGE(39, "An order added to the book"),

    /**
     * An order taken out of the book
     */
    DELETE_ORDER_MESSAGE(40, "An order taken out of the book"),

    /**
     * An order replaced by another
     */
    REPLACE_ORDER_MESSAGE(41, "An order replaced by another"),

    /**
     * Quantity executed from a resting order at its own price
     */
    EXECUTED_ORDER_MESSAGE(42, "Quantity executed from a resting order at its own price"),

    /**
     * Quantity executed from a resting order at another price
     */
    EXECUTED_ORDER_WITH_PRICE_MESSAGE(43, "Quantity executed from a resting order at another price"),

    /**
     * A trade not against a shown order
     */
    TRADE_MESSAGE(44, "A trade not against a shown order"),

    /**
     * A venue system event
     */
    SYSTEM_EVENT_MESSAGE(45, "A venue system event"),

    /**
     * What an auction would cross at now
     */
    INDICATIVE_PRICE_OR_QUANTITY_MESSAGE(46, "What an auction would cross at now");

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
            case 1 -> Optional.of(DISCONNECT_MESSAGE);
            case 38 -> Optional.of(TRADING_ACTION_MESSAGE);
            case 39 -> Optional.of(ADD_ORDER_MESSAGE);
            case 40 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 41 -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 42 -> Optional.of(EXECUTED_ORDER_MESSAGE);
            case 43 -> Optional.of(EXECUTED_ORDER_WITH_PRICE_MESSAGE);
            case 44 -> Optional.of(TRADE_MESSAGE);
            case 45 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 46 -> Optional.of(INDICATIVE_PRICE_OR_QUANTITY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
