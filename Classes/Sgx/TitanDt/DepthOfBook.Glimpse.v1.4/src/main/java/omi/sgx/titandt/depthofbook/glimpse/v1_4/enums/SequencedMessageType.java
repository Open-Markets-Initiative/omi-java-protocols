package omi.sgx.titandt.depthofbook.glimpse.v1_4.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

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
     * Relays information on state changes
     */
    ORDER_BOOK_STATE_MESSAGE('O', "Relays information on state changes"),

    /**
     * A new order has been accepted and added to the displayable book
     */
    ADD_ORDER_MESSAGE('A', "A new order has been accepted and added to the displayable book"),

    /**
     * Returns the Itch sequence number to be used when connecting to the Itch feed
     */
    END_OF_SNAPSHOT_MESSAGE('G', "Returns the Itch sequence number to be used when connecting to the Itch feed");

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
            case 'M' -> Optional.of(COMBINATION_ORDER_BOOK_DIRECTORY_MESSAGE);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
