package omi.nasdaq.nordicequities.totalview.itch.v3_04_5.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Signals a market or data feed handler event
     */
    SYSTEM_EVENT_MESSAGE('S', "Signals a market or data feed handler event"),

    /**
     * Indicates the current trading status of a security
     */
    ORDER_BOOK_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of a security"),

    /**
     * Disseminated for all active order books at the start of each trading day
     */
    ORDER_BOOK_DIRECTORY_MESSAGE('R', "Disseminated for all active order books at the start of each trading day"),

    /**
     * An order added to the book without Mpid attribution
     */
    ADD_ORDER_MESSAGE('A', "An order added to the book without Mpid attribution"),

    /**
     * An order added to the book with Mpid attribution
     */
    ADD_ORDER_MPID_ATTRIBUTION_MESSAGE('F', "An order added to the book with Mpid attribution"),

    /**
     * Sent whenever an order on the book is executed in whole or in part
     */
    ORDER_EXECUTED_MESSAGE('E', "Sent whenever an order on the book is executed in whole or in part"),

    /**
     * An order executed at a price different to its display price
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "An order executed at a price different to its display price"),

    /**
     * An order on the book modified by a partial cancellation
     */
    ORDER_CANCEL_MESSAGE('X', "An order on the book modified by a partial cancellation"),

    /**
     * An order on the book being cancelled in full
     */
    ORDER_DELETE_MESSAGE('D', "An order on the book being cancelled in full"),

    /**
     * An order book is flushed and all orders removed
     */
    ORDER_BOOK_FLUSH_MESSAGE('Y', "An order book is flushed and all orders removed"),

    /**
     * An order on the book has been cancel replaced
     */
    ORDER_REPLACE_MESSAGE('U', "An order on the book has been cancel replaced"),

    /**
     * Execution details for a match involving non displayable order types
     */
    TRADE_MESSAGE('P', "Execution details for a match involving non displayable order types"),

    /**
     * The cross process has completed for a specific security
     */
    CROSS_TRADE_MESSAGE('Q', "The cross process has completed for a specific security"),

    /**
     * An execution has been broken and cannot be reinstated
     */
    BROKEN_TRADE_MESSAGE('B', "An execution has been broken and cannot be reinstated"),

    /**
     * Net order imbalance indicator disseminated during a cross auction
     */
    NOII_MESSAGE('I', "Net order imbalance indicator disseminated during a cross auction"),

    /**
     * Auction on demand order imbalance indicator
     */
    MOII_MESSAGE('J', "Auction on demand order imbalance indicator"),

    /**
     * Summary information disseminated before the individual trades
     */
    EXECUTION_SUMMARY_MESSAGE('K', "Summary information disseminated before the individual trades");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'H' -> Optional.of(ORDER_BOOK_TRADING_ACTION_MESSAGE);
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_MPID_ATTRIBUTION_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'Y' -> Optional.of(ORDER_BOOK_FLUSH_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'I' -> Optional.of(NOII_MESSAGE);
            case 'J' -> Optional.of(MOII_MESSAGE);
            case 'K' -> Optional.of(EXECUTION_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
