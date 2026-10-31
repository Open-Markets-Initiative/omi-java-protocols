package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

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
     * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('R', "Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent."),

    /**
     * ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H', "ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market."),

    /**
     * The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    STRATEGY_OPEN_CLOSED_MESSAGE('O', "The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine. In all such cases the order size to be displayed is as reported by the matching engine
     */
    COMPLEX_STRATEGY_ORDER_ON_BOOK_MESSAGE('L', "An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine. In all such cases the order size to be displayed is as reported by the matching engine"),

    /**
     * This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
     */
    COMPLEX_STRATEGY_AUCTION_MESSAGE('J', "This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.");

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
            case 'R' -> Optional.of(COMPLEX_STRATEGY_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STRATEGY_TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(STRATEGY_OPEN_CLOSED_MESSAGE);
            case 'L' -> Optional.of(COMPLEX_STRATEGY_ORDER_ON_BOOK_MESSAGE);
            case 'J' -> Optional.of(COMPLEX_STRATEGY_AUCTION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
