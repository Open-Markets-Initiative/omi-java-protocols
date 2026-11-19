package omi.nasdaq.phlxoptions.spreaddepthofmarket.itch.v2_1.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * A Complex Strategy Directory Message containing the strategy definition will be sent whenever a complex order is added in the system.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('s', "A Complex Strategy Directory Message containing the strategy definition will be sent whenever a complex order is added in the system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * A Complex Add Order Message indicates that a new order has been accepted and was added to the displayable book.
     */
    ADD_ORDER_SHORT_FORM_MESSAGE('r', "A Complex Add Order Message indicates that a new order has been accepted and was added to the displayable book."),

    /**
     * A Complex Add Order Message indicates that a new order has been accepted and was added to the displayable book. Long form.
     */
    ADD_ORDER_LONG_FORM_MESSAGE('o', "A Complex Add Order Message indicates that a new order has been accepted and was added to the displayable book. Long form."),

    /**
     * This message is sent whenever a Side order is executed in whole or in part.
     */
    SINGLE_SIDE_EXECUTED_MESSAGE('t', "This message is sent whenever a Side order is executed in whole or in part."),

    /**
     * This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price.
     */
    SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE('T', "This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price."),

    /**
     * This message is sent whenever an order on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number.
     */
    SINGLE_SIDE_REPLACE_SHORT_FORM_MESSAGE('i', "This message is sent whenever an order on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number."),

    /**
     * This message is sent whenever an order on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. Long form.
     */
    SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE('I', "This message is sent whenever an order on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. Long form."),

    /**
     * The message is sent when an order is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    SINGLE_SIDE_DELETE_MESSAGE('D', "The message is sent when an order is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This message is sent whenever an order is being updated for price and (or) contracts. The reference number associated with the order is unchanged.
     */
    SINGLE_SIDE_UPDATE_MESSAGE('P', "This message is sent whenever an order is being updated for price and (or) contracts. The reference number associated with the order is unchanged."),

    /**
     * This Options Trade Message is designed to provide execution details for normal match events involving non-display able order types.
     */
    COMPLEX_STRATEGY_TRADE_MESSAGE('q', "This Options Trade Message is designed to provide execution details for normal match events involving non-display able order types."),

    /**
     * This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
     */
    COMPLEX_STRATEGY_AUCTION_MESSAGE('a', "This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction."),

    /**
     * The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete.
     */
    END_OF_REPLAY_SEQUENCE_MESSAGE('M', "The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete.");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 's' -> Optional.of(COMPLEX_STRATEGY_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STRATEGY_TRADING_ACTION_MESSAGE);
            case 'r' -> Optional.of(ADD_ORDER_SHORT_FORM_MESSAGE);
            case 'o' -> Optional.of(ADD_ORDER_LONG_FORM_MESSAGE);
            case 't' -> Optional.of(SINGLE_SIDE_EXECUTED_MESSAGE);
            case 'T' -> Optional.of(SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE);
            case 'i' -> Optional.of(SINGLE_SIDE_REPLACE_SHORT_FORM_MESSAGE);
            case 'I' -> Optional.of(SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE);
            case 'D' -> Optional.of(SINGLE_SIDE_DELETE_MESSAGE);
            case 'P' -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 'q' -> Optional.of(COMPLEX_STRATEGY_TRADE_MESSAGE);
            case 'a' -> Optional.of(COMPLEX_STRATEGY_AUCTION_MESSAGE);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
