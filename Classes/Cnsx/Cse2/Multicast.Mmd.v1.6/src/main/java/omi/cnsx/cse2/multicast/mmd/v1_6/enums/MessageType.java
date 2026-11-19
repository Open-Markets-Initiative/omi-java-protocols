package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Anchors the feed clock. Every following message states its own time as nanoseconds elapsed since this message.
     */
    TIME_MESSAGE('T', "Anchors the feed clock. Every following message states its own time as nanoseconds elapsed since this message."),

    /**
     * Signals a market or data feed handler event, either for the system as a whole or for one symbol group.
     */
    SYSTEM_EVENT_MESSAGE('S', "Signals a market or data feed handler event, either for the system as a whole or for one symbol group."),

    /**
     * Static properties of a symbol. Sent for every symbol in the morning, and again during the day if a symbol changes.
     */
    SYMBOL_DIRECTORY_MESSAGE('R', "Static properties of a symbol. Sent for every symbol in the morning, and again during the day if a symbol changes."),

    /**
     * Values and rules for a symbol that can be updated intra-day. Sent for every symbol in the morning, and again during the day if a symbol changes.
     */
    SYMBOL_DYNAMICS_MESSAGE('O', "Values and rules for a symbol that can be updated intra-day. Sent for every symbol in the morning, and again during the day if a symbol changes."),

    /**
     * Current trading state for a symbol. A symbol suspended intra-day with "V" is unsuspended with "N".
     */
    TRADING_ACTION_MESSAGE('H', "Current trading state for a symbol. A symbol suspended intra-day with \"V\" is unsuspended with \"N\"."),

    /**
     * A new order added to the displayed book.
     */
    ADD_ORDER_MESSAGE('A', "A new order added to the displayed book."),

    /**
     * An order on the book executed in whole or in part at the price it was displayed at.
     */
    ORDER_EXECUTED_MESSAGE('E', "An order on the book executed in whole or in part at the price it was displayed at."),

    /**
     * An order on the book executed in whole or in part at a price other than the one it was displayed at.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "An order on the book executed in whole or in part at a price other than the one it was displayed at."),

    /**
     * A trade that does not change the displayed book, carrying the full attribution and classification of the execution.
     */
    TRADE_MESSAGE('P', "A trade that does not change the displayed book, carrying the full attribution and classification of the execution."),

    /**
     * A previously transmitted execution that has been broken, naming the match number it cancels.
     */
    BROKEN_TRADE_MESSAGE('B', "A previously transmitted execution that has been broken, naming the match number it cancels."),

    /**
     * An order cancelled and removed from the displayed book.
     */
    ORDER_DELETE_MESSAGE('D', "An order cancelled and removed from the displayed book."),

    /**
     * An order on the book replaced with a new quantity and price, keeping its order number.
     */
    ORDER_REPLACE_MESSAGE('U', "An order on the book replaced with a new quantity and price, keeping its order number."),

    /**
     * The best bid and offer for a symbol with the quantity at each. During an auction with an indicative price set, the indicative price overwrites both sides.
     */
    BEST_BID_OFFER_MESSAGE('Q', "The best bid and offer for a symbol with the quantity at each. During an auction with an indicative price set, the indicative price overwrites both sides."),

    /**
     * The closing price for a symbol.
     */
    CLOSING_PRICE_MESSAGE('F', "The closing price for a symbol."),

    /**
     * Free text bulletin from the exchange.
     */
    GENERAL_MESSAGE('G', "Free text bulletin from the exchange.");

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
            case 'T' -> Optional.of(TIME_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(SYMBOL_DIRECTORY_MESSAGE);
            case 'O' -> Optional.of(SYMBOL_DYNAMICS_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'Q' -> Optional.of(BEST_BID_OFFER_MESSAGE);
            case 'F' -> Optional.of(CLOSING_PRICE_MESSAGE);
            case 'G' -> Optional.of(GENERAL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
