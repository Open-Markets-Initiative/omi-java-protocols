package omi.odx.odxsecuritytoken.pts.itch.v1_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Reflects the number of seconds past midnight.
     */
    SECONDS_MESSAGE('T', "Reflects the number of seconds past midnight."),

    /**
     * System Event Messages signal data feed, system and market events.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal data feed, system and market events."),

    /**
     * The Price Tick Size Message is used to communicate tick size information for a given price range.
     */
    PRICE_TICK_SIZE_MESSAGE('L', "The Price Tick Size Message is used to communicate tick size information for a given price range."),

    /**
     * The Orderbook Directory Message is used to disseminate orderbook information for all active orderbooks.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "The Orderbook Directory Message is used to disseminate orderbook information for all active orderbooks."),

    /**
     * The Trading State Message is used to indicate the current trading state of an orderbook.
     */
    TRADING_STATE_MESSAGE('H', "The Trading State Message is used to indicate the current trading state of an orderbook."),

    /**
     * An Order Added Message is generated each time a new order is accepted by the ODX PTS execution system.
     */
    ORDER_ADDED_MESSAGE('A', "An Order Added Message is generated each time a new order is accepted by the ODX PTS execution system."),

    /**
     * An Order Executed with Price Message is sent whenever an order on the book is executed in whole or in part with a specific trade price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "An Order Executed with Price Message is sent whenever an order on the book is executed in whole or in part with a specific trade price."),

    /**
     * An Order Deleted Message is sent whenever an order on the book is cancelled.
     */
    ORDER_DELETED_MESSAGE('D', "An Order Deleted Message is sent whenever an order on the book is cancelled."),

    /**
     * An Order Replaced Message is sent whenever an order on the book is replaced.
     */
    ORDER_REPLACED_MESSAGE('U', "An Order Replaced Message is sent whenever an order on the book is replaced."),

    /**
     * The Order Book State Message is used to communicate the state of an orderbook.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "The Order Book State Message is used to communicate the state of an orderbook."),

    /**
     * The Equilibrium Price Update Message is used to communicate the equilibrium price of an orderbook during an auction period.
     */
    EQUILIBRIUM_PRICE_UPDATE_MESSAGE('Z', "The Equilibrium Price Update Message is used to communicate the equilibrium price of an orderbook during an auction period.");

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
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(PRICE_TICK_SIZE_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_STATE_MESSAGE);
            case 'A' -> Optional.of(ORDER_ADDED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
