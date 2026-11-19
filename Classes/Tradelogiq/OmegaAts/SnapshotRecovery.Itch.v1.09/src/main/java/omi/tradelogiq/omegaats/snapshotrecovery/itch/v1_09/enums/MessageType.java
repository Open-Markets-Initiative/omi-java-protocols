package omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The spin consists of a Start-Of-Messages event, Add Order messages and an End-Of-Messages event, after which the Reallocation Server disconnects.
     */
    SYSTEM_EVENT_MESSAGE('S', "The spin consists of a Start-Of-Messages event, Add Order messages and an End-Of-Messages event, after which the Reallocation Server disconnects."),

    /**
     * A Requested Sequence Number of 1 returns the symbol spin, the Instrument Directory messages distributed early in the Tradelogiq start of day.
     */
    STOCK_DIRECTORY_MESSAGE('R', "A Requested Sequence Number of 1 returns the symbol spin, the Instrument Directory messages distributed early in the Tradelogiq start of day."),

    /**
     * The symbol spin carries the Extended Stock Directory of bonds, debentures, rights, notes and warrants alongside the Stock Directory.
     */
    EXTENDED_STOCK_DIRECTORY_MESSAGE('r', "The symbol spin carries the Extended Stock Directory of bonds, debentures, rights, notes and warrants alongside the Stock Directory."),

    /**
     * If sequence 1 is used for the Sequenced Number field the reallocation server will return the symbol spin with the stock trading status messages before returning all open orders seen on the book.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "If sequence 1 is used for the Sequenced Number field the reallocation server will return the symbol spin with the stock trading status messages before returning all open orders seen on the book."),

    /**
     * Only open orders are sent in the spin; the spin will not contain any message for an order which is no longer in the book.
     */
    ADD_ORDER_MESSAGE('A', "Only open orders are sent in the spin; the spin will not contain any message for an order which is no longer in the book.");

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
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'r' -> Optional.of(EXTENDED_STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
