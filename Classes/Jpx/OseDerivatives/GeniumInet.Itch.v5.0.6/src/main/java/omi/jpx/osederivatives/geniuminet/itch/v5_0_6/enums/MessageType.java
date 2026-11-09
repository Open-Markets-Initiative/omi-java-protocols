package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Sent every second for which at least one ITCH message is being generated
     */
    SECONDS_MESSAGE('T', "Sent every second for which at least one ITCH message is being generated"),

    /**
     * Disseminated for all active securities at start of day or intra-day.
     */
    ORDER_BOOK_DIRECTORY('R', "Disseminated for all active securities at start of day or intra-day."),

    /**
     * Mapping between a combination orderbook and its leg orderbooks.
     */
    COMBINATION_ORDERBOOK_LEG('M', "Mapping between a combination orderbook and its leg orderbooks."),

    /**
     * Information on a tick size for a price range.
     */
    TICK_SIZE_TABLE_ENTRY('L', "Information on a tick size for a price range."),

    /**
     * Signals a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "Signals a market or data feed handler event."),

    /**
     * Relays information on state changes.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "Relays information on state changes."),

    /**
     * New order accepted (unattributed).
     */
    ADD_ORDER_NO_MPID('A', "New order accepted (unattributed)."),

    /**
     * New order accepted (attributed).
     */
    ADD_ORDER_WITH_MPID('F', "New order accepted (attributed)."),

    /**
     * Sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "Sent whenever an order on the book is executed in whole or in part."),

    /**
     * Sent when an order is executed at a price different than the initial display price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Sent when an order is executed at a price different than the initial display price."),

    /**
     * Sent whenever an existing order on the book has been modified. Note: Specification says this message is not used, but remains for future reference.
     */
    ORDER_REPLACE_MESSAGE('U', "Sent whenever an existing order on the book has been modified. Note: Specification says this message is not used, but remains for future reference."),

    /**
     * Sent whenever an order on the book is being deleted. There will be no remaining quantity.
     */
    ORDER_DELETE_MESSAGE('D', "Sent whenever an order on the book is being deleted. There will be no remaining quantity."),

    /**
     * Execution details for normal match events involving non-displayable order types or cross trades.
     */
    TRADE_MESSAGE('P', "Execution details for normal match events involving non-displayable order types or cross trades."),

    /**
     * Provides changes in equilibrium price during auctions.
     */
    EQUILIBRIUM_PRICE_UPDATE('Z', "Provides changes in equilibrium price during auctions.");

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
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY);
            case 'M' -> Optional.of(COMBINATION_ORDERBOOK_LEG);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_UPDATE);
            default -> Optional.empty();
        };
    }
}
