package omi.nasdaq.iseoptions.depthofmarket.itch.v2_1.enums;

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
     * Derivative Directory Message for active options symbols.
     */
    DERIVATIVE_DIRECTORY_MESSAGE('m', "Derivative Directory Message for active options symbols."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * An Add Order Message indicates that a new order has been accepted and was added to the displayable book.
     */
    ADD_ORDER_SHORT_FORM_MESSAGE('r', "An Add Order Message indicates that a new order has been accepted and was added to the displayable book."),

    /**
     * An Add Order Message indicates that a new order has been accepted and was added to the displayable book.
     */
    ADD_ORDER_LONG_FORM_MESSAGE('o', "An Add Order Message indicates that a new order has been accepted and was added to the displayable book."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book.
     */
    ADD_QUOTE_SHORT_FORM_MESSAGE('j', "An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book.
     */
    ADD_QUOTE_LONG_FORM_MESSAGE('J', "An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book."),

    /**
     * This message is sent whenever a Side order is executed in whole or in part.
     */
    SINGLE_SIDE_EXECUTED_MESSAGE('e', "This message is sent whenever a Side order is executed in whole or in part."),

    /**
     * This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price.
     */
    SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE('c', "This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced.
     */
    SINGLE_SIDE_REPLACE_SHORT_FORM_MESSAGE('u', "This message is sent whenever an order or one side of a quote on the book is replaced."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced.
     */
    SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE('U', "This message is sent whenever an order or one side of a quote on the book is replaced."),

    /**
     * The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    SINGLE_SIDE_DELETE_MESSAGE('D', "The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts.
     */
    SINGLE_SIDE_UPDATE_MESSAGE('G', "This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts."),

    /**
     * This message is sent whenever a quote on the book is replaced.
     */
    QUOTE_REPLACE_SHORT_FORM_MESSAGE('k', "This message is sent whenever a quote on the book is replaced."),

    /**
     * This message is sent whenever a quote on the book is replaced.
     */
    QUOTE_REPLACE_LONG_FORM_MESSAGE('K', "This message is sent whenever a quote on the book is replaced."),

    /**
     * The message is sent when a single quote is being cancelled.
     */
    QUOTE_DELETE_MESSAGE('Y', "The message is sent when a single quote is being cancelled."),

    /**
     * This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types.
     */
    TRADE_MESSAGE('q', "This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types."),

    /**
     * This message is used to announce opening and re-opening auctions only.
     */
    NET_ORDER_IMBALANCE_MESSAGE('O', "This message is used to announce opening and re-opening auctions only.");

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
            case 'm' -> Optional.of(DERIVATIVE_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'r' -> Optional.of(ADD_ORDER_SHORT_FORM_MESSAGE);
            case 'o' -> Optional.of(ADD_ORDER_LONG_FORM_MESSAGE);
            case 'j' -> Optional.of(ADD_QUOTE_SHORT_FORM_MESSAGE);
            case 'J' -> Optional.of(ADD_QUOTE_LONG_FORM_MESSAGE);
            case 'e' -> Optional.of(SINGLE_SIDE_EXECUTED_MESSAGE);
            case 'c' -> Optional.of(SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'u' -> Optional.of(SINGLE_SIDE_REPLACE_SHORT_FORM_MESSAGE);
            case 'U' -> Optional.of(SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE);
            case 'D' -> Optional.of(SINGLE_SIDE_DELETE_MESSAGE);
            case 'G' -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 'k' -> Optional.of(QUOTE_REPLACE_SHORT_FORM_MESSAGE);
            case 'K' -> Optional.of(QUOTE_REPLACE_LONG_FORM_MESSAGE);
            case 'Y' -> Optional.of(QUOTE_DELETE_MESSAGE);
            case 'q' -> Optional.of(TRADE_MESSAGE);
            case 'O' -> Optional.of(NET_ORDER_IMBALANCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
