package omi.nasdaq.iseoptions.orderfeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * At the start of each trading day, the options system disseminates directory messages for all symbols eligible for trading in the options system.
     */
    OPTION_DIRECTORY_MESSAGE('D', "At the start of each trading day, the options system disseminates directory messages for all symbols eligible for trading in the options system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * The options system uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    SECURITY_OPEN_CLOSED_MESSAGE('O', "The options system uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * Nasdaq disseminates Opening Imbalance information at regular intervals in the time leading up to the Nasdaq Opening Auction events.
     */
    OPENING_IMBALANCE_MESSAGE('N', "Nasdaq disseminates Opening Imbalance information at regular intervals in the time leading up to the Nasdaq Opening Auction events."),

    /**
     * An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine.
     */
    ORDER_ON_BOOK_MESSAGE('B', "An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine."),

    /**
     * This message is used to announce auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
     */
    AUCTION_MESSAGE('A', "This message is used to announce auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.");

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
            case 'D' -> Optional.of(OPTION_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(SECURITY_OPEN_CLOSED_MESSAGE);
            case 'N' -> Optional.of(OPENING_IMBALANCE_MESSAGE);
            case 'B' -> Optional.of(ORDER_ON_BOOK_MESSAGE);
            case 'A' -> Optional.of(AUCTION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
