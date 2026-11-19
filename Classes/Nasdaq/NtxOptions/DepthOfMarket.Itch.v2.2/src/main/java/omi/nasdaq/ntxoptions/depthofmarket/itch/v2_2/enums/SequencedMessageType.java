package omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.enums;

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
     * Derivative Directory Message for active options symbols.
     */
    DERIVATIVE_DIRECTORY_MESSAGE('R', "Derivative Directory Message for active options symbols."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an option.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an option."),

    /**
     * An Add Order Short Form Message indicates a new order or new quote accepted by the system.
     */
    ADD_ORDER_SHORT_FORM_MESSAGE('a', "An Add Order Short Form Message indicates a new order or new quote accepted by the system."),

    /**
     * An Add Order Long Form Message indicates a new order or new quote accepted by the system.
     */
    ADD_ORDER_LONG_FORM_MESSAGE('A', "An Add Order Long Form Message indicates a new order or new quote accepted by the system."),

    /**
     * An Add Quote Short Form Message indicates a new two-sided quote accepted by the system.
     */
    ADD_QUOTE_SHORT_FORM_MESSAGE('j', "An Add Quote Short Form Message indicates a new two-sided quote accepted by the system."),

    /**
     * An Add Quote Long Form Message indicates a new two-sided quote accepted by the system.
     */
    ADD_QUOTE_LONG_FORM_MESSAGE('J', "An Add Quote Long Form Message indicates a new two-sided quote accepted by the system."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order on the book is replaced.
     */
    ORDER_REPLACE_SHORT_FORM_MESSAGE('u', "This message is sent whenever an order on the book is replaced."),

    /**
     * This message is sent whenever an order on the book is replaced.
     */
    ORDER_REPLACE_LONG_FORM_MESSAGE('U', "This message is sent whenever an order on the book is replaced."),

    /**
     * This message is sent whenever an order on the book is being deleted.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being deleted."),

    /**
     * This message is sent whenever an order is being updated for price and (or) contracts.
     */
    ORDER_CHANGE_MESSAGE('G', "This message is sent whenever an order is being updated for price and (or) contracts."),

    /**
     * This message is sent whenever a quote on the book is replaced.
     */
    QUOTE_REPLACE_SHORT_FORM_MESSAGE('k', "This message is sent whenever a quote on the book is replaced."),

    /**
     * This message is sent whenever a quote on the book is replaced.
     */
    QUOTE_REPLACE_LONG_FORM_MESSAGE('K', "This message is sent whenever a quote on the book is replaced."),

    /**
     * This message is sent whenever a quote on the book is being deleted.
     */
    QUOTE_DELETE_MESSAGE('Y', "This message is sent whenever a quote on the book is being deleted."),

    /**
     * The Trade Message is designed to provide execution details for the normal different types of trades.
     */
    TRADE_MESSAGE('Q', "The Trade Message is designed to provide execution details for the normal different types of trades."),

    /**
     * This message is used to announce opening and re-opening auctions.
     */
    NET_ORDER_IMBALANCE_MESSAGE('I', "This message is used to announce opening and re-opening auctions."),

    /**
     * The End of Replay Sequence message reflects the sequence number at the time replay of existing messages is complete.
     */
    END_OF_REPLAY_SEQUENCE_MESSAGE('M', "The End of Replay Sequence message reflects the sequence number at the time replay of existing messages is complete.");

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
            case 'R' -> Optional.of(DERIVATIVE_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'a' -> Optional.of(ADD_ORDER_SHORT_FORM_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_LONG_FORM_MESSAGE);
            case 'j' -> Optional.of(ADD_QUOTE_SHORT_FORM_MESSAGE);
            case 'J' -> Optional.of(ADD_QUOTE_LONG_FORM_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'u' -> Optional.of(ORDER_REPLACE_SHORT_FORM_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_LONG_FORM_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'G' -> Optional.of(ORDER_CHANGE_MESSAGE);
            case 'k' -> Optional.of(QUOTE_REPLACE_SHORT_FORM_MESSAGE);
            case 'K' -> Optional.of(QUOTE_REPLACE_LONG_FORM_MESSAGE);
            case 'Y' -> Optional.of(QUOTE_DELETE_MESSAGE);
            case 'Q' -> Optional.of(TRADE_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_MESSAGE);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
