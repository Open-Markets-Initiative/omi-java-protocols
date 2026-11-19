package omi.aix.aixmarket.geniuminet.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * This message is sent every second for which at least one message is being generated.
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one message is being generated."),

    /**
     * Order book directory messages are disseminated for all active securities, including halted securities, in the AIX Trading system.
     */
    ORDER_BOOK_DIRECTORY_MESSAGE('R', "Order book directory messages are disseminated for all active securities, including halted securities, in the AIX Trading system."),

    /**
     * This message contains information on a tick size for a price range.
     */
    TICK_SIZE_TABLE_ENTRY_MESSAGE('L', "This message contains information on a tick size for a price range."),

    /**
     * A Short Sell Status Message indicates the short sell rules of an order book.
     */
    SHORT_SELL_STATUS_MESSAGE('V', "A Short Sell Status Message indicates the short sell rules of an order book."),

    /**
     * The Order book state message relays information on state changes.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "The Order book state message relays information on state changes."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the AIX Trading system and was added to the displayable book.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that a new order has been accepted by the AIX Trading system and was added to the displayable book."),

    /**
     * The end of snapshot message returns the current ITCH sequence number to be used when connecting to the ITCH feed.
     */
    END_OF_SNAPSHOT_MESSAGE('G', "The end of snapshot message returns the current ITCH sequence number to be used when connecting to the ITCH feed.");

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
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'G' -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
