package omi.bist.borsaistanbul.geniuminet.glimpse.v2_7.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Sent every second for which at least one message is being generated. Contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time.
     */
    SECONDS_MESSAGE('T', "Sent every second for which at least one message is being generated. Contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time."),

    /**
     * Order book directory messages are disseminated for all active securities, including halted securities, in the Genium INET Trading system.
     */
    ORDER_BOOK_DIRECTORY('R', "Order book directory messages are disseminated for all active securities, including halted securities, in the Genium INET Trading system."),

    /**
     * A specialized directory message used when Combination order books are traded at the marketplace. It represents both standard combinations defined by the exchange, and tailor-made combinations created by members.
     */
    COMBINATION_ORDER_BOOK_LEG('M', "A specialized directory message used when Combination order books are traded at the marketplace. It represents both standard combinations defined by the exchange, and tailor-made combinations created by members."),

    /**
     * Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table.
     */
    TICK_SIZE_TABLE_ENTRY('L', "Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table."),

    /**
     * Indicates the short sell rules of an order book. Sent for order books which might have short sell allowing prior to the start of system. If an order book is absent from this message, clients should assume that the order book has no short selling rules at the start-of-day reference data messages.
     */
    SHORT_SELL_STATUS('V', "Indicates the short sell rules of an order book. Sent for order books which might have short sell allowing prior to the start of system. If an order book is absent from this message, clients should assume that the order book has no short selling rules at the start-of-day reference data messages."),

    /**
     * Relays information on order book state changes.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "Relays information on order book state changes."),

    /**
     * Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders. The message includes an Order ID that is unique per order book and side.
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION('A', "Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders. The message includes an Order ID that is unique per order book and side."),

    /**
     * Note: not applicable for BIST markets. Would be generated for attributed orders and quotations entered into the Genium INET Trading system.
     */
    ADD_ORDER_WITH_MPID_ATTRIBUTION('F', "Note: not applicable for BIST markets. Would be generated for attributed orders and quotations entered into the Genium INET Trading system."),

    /**
     * Returns the current ITCH sequence number to be used when connecting to the ITCH feed. To maintain a real-time order display, firms should begin to process real-time Genium INET ITCH messages beginning with the sequence number stated in this snapshot message. After transmission, the user will be logged out immediately by the system.
     */
    END_OF_SNAPSHOT_MESSAGE('G', "Returns the current ITCH sequence number to be used when connecting to the ITCH feed. To maintain a real-time order display, firms should begin to process real-time Genium INET ITCH messages beginning with the sequence number stated in this snapshot message. After transmission, the user will be logged out immediately by the system.");

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
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY);
            case 'M' -> Optional.of(COMBINATION_ORDER_BOOK_LEG);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY);
            case 'V' -> Optional.of(SHORT_SELL_STATUS);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID_ATTRIBUTION);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID_ATTRIBUTION);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
