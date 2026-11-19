package omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * This message is sent every second for which at least one message is being generated. The message contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one message is being generated. The message contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time"),

    /**
     * At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities, in the Genium INET Trading system. Intra-day transmissions of this message may occur when new order books are added to the system; updates to existing order books may also be represented by intra-day Order book Directory messages
     */
    ORDER_BOOK_DIRECTORY('R', "At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities, in the Genium INET Trading system. Intra-day transmissions of this message may occur when new order books are added to the system; updates to existing order books may also be represented by intra-day Order book Directory messages"),

    /**
     * Specialized directory message used when Combination order books are traded in the marketplace. It represents both standard combinations defined by the exchange and tailor-made combinations created by members. Intra-day transmissions may occur when new combination order books are added, typically for tailor-made combinations
     */
    COMBINATION_ORDER_BOOK_DIRECTORY('M', "Specialized directory message used when Combination order books are traded in the marketplace. It represents both standard combinations defined by the exchange and tailor-made combinations created by members. Intra-day transmissions may occur when new combination order books are added, typically for tailor-made combinations"),

    /**
     * Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table. The number of decimals in prices are given by the Order Book Directory message for this order book
     */
    TICK_SIZE_TABLE_ENTRY('L', "Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table. The number of decimals in prices are given by the Order Book Directory message for this order book"),

    /**
     * The Order book state message relays information on state changes
     */
    ORDER_BOOK_STATE_MESSAGE('O', "The Order book state message relays information on state changes"),

    /**
     * Add Order Message. Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION('A', "Add Order Message. Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders"),

    /**
     * Add Order Message. Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for attributed orders and quotations
     */
    ADD_ORDER_MPID_ATTRIBUTION('F', "Add Order Message. Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for attributed orders and quotations"),

    /**
     * Returns the current ITCH sequence number to be used when connecting to the ITCH feed. To maintain a real-time order display, firms should begin to process real-time Genium INET ITCH messages beginning with the sequence number stated in this snapshot message + 1
     */
    END_OF_SNAPSHOT_MESSAGE('G', "Returns the current ITCH sequence number to be used when connecting to the ITCH feed. To maintain a real-time order display, firms should begin to process real-time Genium INET ITCH messages beginning with the sequence number stated in this snapshot message + 1");

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
            case 'M' -> Optional.of(COMBINATION_ORDER_BOOK_DIRECTORY);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID_ATTRIBUTION);
            case 'F' -> Optional.of(ADD_ORDER_MPID_ATTRIBUTION);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
