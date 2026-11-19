package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.enums;

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
    SECONDS_MESSAGE('T', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * The system event message type is used to signal a market or data feed handler event. The format is as follows:
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event. The format is as follows:"),

    /**
     * This message indicates the base reference number to which all the order/quote/trade reference number deltas must be added to obtain the absolute order/quote PHLX reference number.
     */
    BASE_REFERENCE_MESSAGE('L', "This message indicates the base reference number to which all the order/quote/trade reference number deltas must be added to obtain the absolute order/quote PHLX reference number."),

    /**
     * At the start of each trading day, the options system disseminates option symbol directory messages for all active option symbols in the PHLX ® options system.
     */
    OPTION_DIRECTORY_MESSAGE('R', "At the start of each trading day, the options system disseminates option symbol directory messages for all active option symbols in the PHLX \u00AE options system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the PHLX ® Options Market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the PHLX \u00AE Options Market."),

    /**
     * The options system plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the PHLX ® Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the Options Market System.
     */
    SECURITY_OPEN_MESSAGE('O', "The options system plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the PHLX \u00AE Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the Options Market System."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the options system and was added to the displayable book. The message includes a day-unique Order Reference Number used by options system to track the order.
     */
    ADD_ORDER_MESSAGE_SHORT_FORM('a', "An Add Order Message indicates that a new order has been accepted by the options system and was added to the displayable book. The message includes a day-unique Order Reference Number used by options system to track the order."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the options system and was added to the displayable book. The message includes a day-unique Order Reference Number used by options system to track the order.
     */
    ADD_ORDER_MESSAGE_LONG_FORM('A', "An Add Order Message indicates that a new order has been accepted by the options system and was added to the displayable book. The message includes a day-unique Order Reference Number used by options system to track the order."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted by the PHLX ® options system and was added to the displayable book. The message includes a unique Bid/Ask Reference Numbers used by the options system to track the quote.
     */
    ADD_QUOTE_MESSAGE_SHORT_FORM('j', "An Add Quote Message indicates that a new quote has been accepted by the PHLX \u00AE options system and was added to the displayable book. The message includes a unique Bid/Ask Reference Numbers used by the options system to track the quote."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted by the PHLX ® options system and was added to the displayable book. The message includes a unique Bid/Ask Reference Numbers used by the options system to track the quote.
     */
    ADD_QUOTE_MESSAGE_LONG_FORM('J', "An Add Quote Message indicates that a new quote has been accepted by the PHLX \u00AE options system and was added to the displayable book. The message includes a unique Bid/Ask Reference Numbers used by the options system to track the quote."),

    /**
     * This message is sent whenever a Side order is executed in whole or in part. It is possible to receive several Single Side Executed Messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed Messages on the same order are cumulative. By combining the executions received separately via two types of Single Side Executed Messages and Trade Messages, it is possible to build a complete view of all non-auction executions that happen on PHLX ®. Auction execution information is available in one bulk print via the Auction Trade Message.
     */
    SINGLE_SIDE_EXECUTED_MESSAGE('E', "This message is sent whenever a Side order is executed in whole or in part. It is possible to receive several Single Side Executed Messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed Messages on the same order are cumulative. By combining the executions received separately via two types of Single Side Executed Messages and Trade Messages, it is possible to build a complete view of all non-auction executions that happen on PHLX \u00AE. Auction execution information is available in one bulk print via the Auction Trade Message."),

    /**
     * This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add/Replace, the options system includes a price field within this execution message. It is possible to receive multiple Single Side Executed and Single Side Executed with Price messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed messages on the same Side order are cumulative.
     */
    SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an incoming Side order is executed against the book in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add/Replace, the options system includes a price field within this execution message. It is possible to receive multiple Single Side Executed and Single Side Executed with Price messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed messages on the same Side order are cumulative."),

    /**
     * This message is sent whenever an order or a side of a quote on the book is modified as a result of a partial cancellation.
     */
    SINGLE_SIDE_CANCEL_MESSAGE('X', "This message is sent whenever an order or a side of a quote on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever one side of a quote on the book is replaced. The replacement has a new reference number and replaces the prior reference number.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM('u', "This message is sent whenever one side of a quote on the book is replaced. The replacement has a new reference number and replaces the prior reference number."),

    /**
     * This message is sent whenever one side of a quote on the book is replaced. The replacement has a new reference number and replaces the prior reference number.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM('U', "This message is sent whenever one side of a quote on the book is replaced. The replacement has a new reference number and replaces the prior reference number."),

    /**
     * This message is sent whenever an order on the book is replaced. The replacement has a new reference number and replaces the prior reference number.
     */
    ORDER_REPLACE_MESSAGE_SHORT_FORM('v', "This message is sent whenever an order on the book is replaced. The replacement has a new reference number and replaces the prior reference number."),

    /**
     * This message is sent whenever an order on the book is replaced. The replacement has a new reference number and replaces the prior reference number.
     */
    SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE('V', "This message is sent whenever an order on the book is replaced. The replacement has a new reference number and replaces the prior reference number."),

    /**
     * The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    SINGLE_SIDE_DELETE_MESSAGE('D', "The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged.
     */
    SINGLE_SIDE_UPDATE_MESSAGE('G', "This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged."),

    /**
     * This message is sent whenever a quote on the book is replaced. The replaced quote has new reference numbers on both sides.
     */
    QUOTE_REPLACE_SHORT_FORM_MESSAGE('k', "This message is sent whenever a quote on the book is replaced. The replaced quote has new reference numbers on both sides."),

    /**
     * This message is sent whenever a quote on the book is replaced. The replaced quote has new reference numbers on both sides.
     */
    QUOTE_REPLACE_LONG_FORM_MESSAGE('K', "This message is sent whenever a quote on the book is replaced. The replaced quote has new reference numbers on both sides."),

    /**
     * The message is sent when a single quote is being cancelled. All remaining contracts are no longer accessible so the quote should be removed from the book.
     */
    QUOTE_DELETE_MESSAGE('Y', "The message is sent when a single quote is being cancelled. All remaining contracts are no longer accessible so the quote should be removed from the book."),

    /**
     * This message contains a block of Single Side Deletes. Each reference number inside the block represents an order or a side of a quote that is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    BLOCK_DELETE_MESSAGE('Z', "This message contains a block of Single Side Deletes. Each reference number inside the block represents an order or a side of a quote that is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This Options Trade Message is designed to provide execution details for match events involving non-displayable order types and Complex orders. (Note: There is a separate message for Option auction events.)
     */
    NON_AUCTION_OPTIONS_TRADE_MESSAGE('P', "This Options Trade Message is designed to provide execution details for match events involving non-displayable order types and Complex orders. (Note: There is a separate message for Option auction events.)"),

    /**
     * Options Auction Trade message is sent for every option when an auction in that option is completed. The message indicates the bulk volume associated with the auction event.
     */
    OPTIONS_CROSS_TRADE_MESSAGE('Q', "Options Auction Trade message is sent for every option when an auction in that option is completed. The message indicates the bulk volume associated with the auction event."),

    /**
     * The Broken Trade Message is sent whenever an execution on PHLX ® is broken. An execution may be broken if it is found to be “clearly erroneous” pursuant to PHLX ® Clearly Erroneous Policy. A trade break is final; once a trade is broken, it cannot be reinstated.
     */
    BROKEN_TRADE_ORDER_EXECUTION_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on PHLX \u00AE is broken. An execution may be broken if it is found to be \u201Cclearly erroneous\u201D pursuant to PHLX \u00AE Clearly Erroneous Policy. A trade break is final; once a trade is broken, it cannot be reinstated."),

    /**
     * This message is also sent as notification that there is an exposed buy (sell) order available for execution at the National Best Offer (Bid).
     */
    AUCTION_NOTIFICATION_MESSAGE('I', "This message is also sent as notification that there is an exposed buy (sell) order available for execution at the National Best Offer (Bid).");

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
            case 'O' -> Optional.of(SECURITY_OPEN_MESSAGE);
            case 'a' -> Optional.of(ADD_ORDER_MESSAGE_SHORT_FORM);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE_LONG_FORM);
            case 'j' -> Optional.of(ADD_QUOTE_MESSAGE_SHORT_FORM);
            case 'J' -> Optional.of(ADD_QUOTE_MESSAGE_LONG_FORM);
            case 'E' -> Optional.of(SINGLE_SIDE_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(SINGLE_SIDE_CANCEL_MESSAGE);
            case 'u' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM);
            case 'U' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM);
            case 'v' -> Optional.of(ORDER_REPLACE_MESSAGE_SHORT_FORM);
            case 'V' -> Optional.of(SINGLE_SIDE_REPLACE_LONG_FORM_MESSAGE);
            case 'D' -> Optional.of(SINGLE_SIDE_DELETE_MESSAGE);
            case 'G' -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 'k' -> Optional.of(QUOTE_REPLACE_SHORT_FORM_MESSAGE);
            case 'K' -> Optional.of(QUOTE_REPLACE_LONG_FORM_MESSAGE);
            case 'Y' -> Optional.of(QUOTE_DELETE_MESSAGE);
            case 'Z' -> Optional.of(BLOCK_DELETE_MESSAGE);
            case 'P' -> Optional.of(NON_AUCTION_OPTIONS_TRADE_MESSAGE);
            case 'Q' -> Optional.of(OPTIONS_CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_ORDER_EXECUTION_MESSAGE);
            case 'I' -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
