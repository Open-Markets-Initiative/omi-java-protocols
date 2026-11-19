package omi.aix.aixmarket.geniuminet.itch.v3_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * This message is sent every second for which at least one ITCH message is being generated.
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one ITCH message is being generated."),

    /**
     * At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities, in the AIX Trading system.
     */
    ORDER_BOOK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities, in the AIX Trading system."),

    /**
     * This message contains information on a tick size for a price range.
     */
    TICK_SIZE_TABLE_ENTRY_MESSAGE('L', "This message contains information on a tick size for a price range."),

    /**
     * A Short Sell Status Message indicates the short sell rules of an order book.
     */
    SHORT_SELL_STATUS_MESSAGE('V', "A Short Sell Status Message indicates the short sell rules of an order book."),

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * The Order book state message relays information on state changes.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "The Order book state message relays information on state changes."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the AIX Trading system and was added to the displayable book.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that a new order has been accepted by the AIX Trading system and was added to the displayable book."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent that an order on the book is executed in whole or in part with a price different than the initial display price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent that an order on the book is executed in whole or in part with a price different than the initial display price."),

    /**
     * This message is sent whenever an order on the book is being deleted.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being deleted."),

    /**
     * This message is sent whenever an order book is flushed.
     */
    ORDER_BOOK_FLUSH_MESSAGE('Y', "This message is sent whenever an order book is flushed."),

    /**
     * The Trade Message is designed to provide execution details for normal match events involving non-displayable order types.
     */
    TRADE_MESSAGE('P', "The Trade Message is designed to provide execution details for normal match events involving non-displayable order types."),

    /**
     * This message is used when auctions occur.
     */
    EQUILIBRIUM_PRICE_UPDATE_MESSAGE('Z', "This message is used when auctions occur.");

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
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY_MESSAGE);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY_MESSAGE);
            case 'V' -> Optional.of(SHORT_SELL_STATUS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'Y' -> Optional.of(ORDER_BOOK_FLUSH_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
