package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * This message is sent every second for which at least one BX Depth message is being generated.
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one BX Depth message is being generated."),

    /**
     * The system event message type is used to signal a market or data feed handler event. The format is as follows:
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event. The format is as follows:"),

    /**
     * This message indicates the base reference number to which all the order/quote/trade reference number deltas must be added to obtain the absolute order/quote BX reference number.
     */
    BASE_REFERENCE_MESSAGE('L', "This message indicates the base reference number to which all the order/quote/trade reference number deltas must be added to obtain the absolute order/quote BX reference number."),

    /**
     * At the start of each trading day, BX disseminates options symbol directory messages for all active options symbols in the BX option system.
     */
    OPTION_DIRECTORY_MESSAGE('R', "At the start of each trading day, BX disseminates options symbol directory messages for all active options symbols in the BX option system."),

    /**
     * BX uses this administrative message to indicate the current trading status of an index or equity option within the BX Options Market.
     */
    TRADING_ACTION_MESSAGE('H', "BX uses this administrative message to indicate the current trading status of an index or equity option within the BX Options Market."),

    /**
     * BX plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the BX Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the BX Options Market System.
     */
    OPTION_OPEN_MESSAGE('O', "BX plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the BX Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the BX Options Market System."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the BX Option system and was added to the displayable book. The message includes a day-unique Order Reference Number used by BX to track the order.
     */
    ADD_ORDER_MESSAGE_SHORT_FORM('a', "An Add Order Message indicates that a new order has been accepted by the BX Option system and was added to the displayable book. The message includes a day-unique Order Reference Number used by BX to track the order."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the BX Option system and was added to the displayable book. The message includes a day-unique Order Reference Number used by BX to track the order.
     */
    ADD_ORDER_MESSAGE_LONG_FORM('A', "An Add Order Message indicates that a new order has been accepted by the BX Option system and was added to the displayable book. The message includes a day-unique Order Reference Number used by BX to track the order."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique
     */
    ADD_QUOTE_MESSAGE_SHORT_FORM('j', "An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique"),

    /**
     * An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique
     */
    ADD_QUOTE_MESSAGE_LONG_FORM('J', "An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique"),

    /**
     * A “Side order” represents an order or one side of a quote.
     */
    SINGLE_SIDE_EXECUTED_MESSAGE('E', "A \u201CSide order\u201D represents an order or one side of a quote."),

    /**
     * This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add/Replace, BX includes a price field within this execution message. It is possible to receive multiple Single Side Executed and Single Side Executed with Price messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed messages on the same Side order are cumulative.
     */
    SINGLE_SIDE_ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add/Replace, BX includes a price field within this execution message. It is possible to receive multiple Single Side Executed and Single Side Executed with Price messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed messages on the same Side order are cumulative."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM('u', "This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM('U', "This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number. For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    SINGLE_SIDE_DELETE_MESSAGE('D', "The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged.
     */
    SINGLE_SIDE_UPDATE_MESSAGE('G', "This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged."),

    /**
     * This message is sent whenever a quote on the book is replaced. The replaced quote has new sequence numbers on both sides. These new sequence numbers replace the prior sequence numbers on the quote.
     */
    QUOTE_REPLACE_MESSAGE_SHORT_FORM('k', "This message is sent whenever a quote on the book is replaced. The replaced quote has new sequence numbers on both sides. These new sequence numbers replace the prior sequence numbers on the quote."),

    /**
     * This message is sent whenever a quote on the book is replaced. The replaced quote has new sequence numbers on both sides. These new sequence numbers replace the prior sequence numbers on the quote.
     */
    QUOTE_REPLACE_MESSAGE_LONG_FORM('K', "This message is sent whenever a quote on the book is replaced. The replaced quote has new sequence numbers on both sides. These new sequence numbers replace the prior sequence numbers on the quote."),

    /**
     * The message is sent when a single quote is being cancelled. All remaining contracts are no longer accessible so the quote should be removed from the book.
     */
    QUOTE_DELETE_MESSAGE('Y', "The message is sent when a single quote is being cancelled. All remaining contracts are no longer accessible so the quote should be removed from the book."),

    /**
     * This message contains a block of Single Side Deletes. Each reference number inside the block represents an order or a side of a quote that is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    BLOCK_DELETE_MESSAGE('Z', "This message contains a block of Single Side Deletes. Each reference number inside the block represents an order or a side of a quote that is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types. (Note: There is a separate message for BX Option auction events.)
     */
    NON_AUCTION_OPTIONS_TRADE_MESSAGE('P', "This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types. (Note: There is a separate message for BX Option auction events.)"),

    /**
     * Options Auction Trade message is sent for every option when an auction in that option is completed. The message indicates the bulk volume associated with the auction event.
     */
    OPTIONS_CROSS_TRADE_MESSAGE('Q', "Options Auction Trade message is sent for every option when an auction in that option is completed. The message indicates the bulk volume associated with the auction event."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique
     */
    BROKEN_TRADE_OR_ORDER_EXECUTION_MESSAGE('B', "An Add Quote Message indicates that a new quote has been accepted by the BX Option system and was added to the displayable book. The message includes a unique"),

    /**
     * BX disseminates NOII data at 5-second intervals in the minutes leading up to the BX Opening Auction events. This message is also used for price improvement (PRISM) auctions.
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "BX disseminates NOII data at 5-second intervals in the minutes leading up to the BX Opening Auction events. This message is also used for price improvement (PRISM) auctions.");

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
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'L' -> Optional.of(BASE_REFERENCE_MESSAGE);
            case 'R' -> Optional.of(OPTION_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(OPTION_OPEN_MESSAGE);
            case 'a' -> Optional.of(ADD_ORDER_MESSAGE_SHORT_FORM);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE_LONG_FORM);
            case 'j' -> Optional.of(ADD_QUOTE_MESSAGE_SHORT_FORM);
            case 'J' -> Optional.of(ADD_QUOTE_MESSAGE_LONG_FORM);
            case 'E' -> Optional.of(SINGLE_SIDE_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(SINGLE_SIDE_ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'u' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM);
            case 'U' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM);
            case 'D' -> Optional.of(SINGLE_SIDE_DELETE_MESSAGE);
            case 'G' -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 'k' -> Optional.of(QUOTE_REPLACE_MESSAGE_SHORT_FORM);
            case 'K' -> Optional.of(QUOTE_REPLACE_MESSAGE_LONG_FORM);
            case 'Y' -> Optional.of(QUOTE_DELETE_MESSAGE);
            case 'Z' -> Optional.of(BLOCK_DELETE_MESSAGE);
            case 'P' -> Optional.of(NON_AUCTION_OPTIONS_TRADE_MESSAGE);
            case 'Q' -> Optional.of(OPTIONS_CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_OR_ORDER_EXECUTION_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            default -> Optional.empty();
        };
    }
}
