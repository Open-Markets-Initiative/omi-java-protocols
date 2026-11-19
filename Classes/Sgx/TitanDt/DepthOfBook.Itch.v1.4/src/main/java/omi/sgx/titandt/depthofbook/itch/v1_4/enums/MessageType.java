package omi.sgx.titandt.depthofbook.itch.v1_4.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Sent every second for which at least one Itch message is generated
     */
    SECONDS_MESSAGE('T', "Sent every second for which at least one Itch message is generated"),

    /**
     * Disseminated at the start of each trading day for all active instruments
     */
    ORDER_BOOK_DIRECTORY_MESSAGE('R', "Disseminated at the start of each trading day for all active instruments"),

    /**
     * Specialized directory message used when Combination Order Books are traded
     */
    COMBINATION_ORDER_BOOK_DIRECTORY_MESSAGE('M', "Specialized directory message used when Combination Order Books are traded"),

    /**
     * Contains information on a tick size for a price range
     */
    TICK_SIZE_TABLE_ENTRY_MESSAGE('L', "Contains information on a tick size for a price range"),

    /**
     * Signals a market or data feed handler event
     */
    SYSTEM_EVENT_MESSAGE('S', "Signals a market or data feed handler event"),

    /**
     * Relays information on state changes
     */
    ORDER_BOOK_STATE_MESSAGE('O', "Relays information on state changes"),

    /**
     * A new order has been accepted and added to the displayable book
     */
    ADD_ORDER_MESSAGE('A', "A new order has been accepted and added to the displayable book"),

    /**
     * Sent whenever an order on the book is executed in whole or in part
     */
    ORDER_EXECUTED_MESSAGE('E', "Sent whenever an order on the book is executed in whole or in part"),

    /**
     * Sent when an order executes at a price different than the initial display price
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Sent when an order executes at a price different than the initial display price"),

    /**
     * Sent whenever an order on the book has been replaced
     */
    ORDER_REPLACE_MESSAGE('U', "Sent whenever an order on the book has been replaced"),

    /**
     * Sent whenever an order on the book is being deleted
     */
    ORDER_DELETE_MESSAGE('D', "Sent whenever an order on the book is being deleted"),

    /**
     * Provides execution details for match events involving non displayable order types
     */
    TRADE_MESSAGE('P', "Provides execution details for match events involving non displayable order types"),

    /**
     * Provides the changes in equilibrium price during auctions
     */
    EQUILIBRIUM_PRICE_UPDATE_MESSAGE('Z', "Provides the changes in equilibrium price during auctions");

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
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY_MESSAGE);
            case 'M' -> Optional.of(COMBINATION_ORDER_BOOK_DIRECTORY_MESSAGE);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
