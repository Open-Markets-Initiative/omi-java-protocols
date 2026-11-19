package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.enums;

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
     * At the start of each trading day, NASDAQ disseminates options symbol directory messages for all active options symbols in the NASDAQ option system.
     */
    OPTIONS_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ disseminates options symbol directory messages for all active options symbols in the NASDAQ option system."),

    /**
     * After the start of system hours, NASDAQ will use the Trading Action message to relay changes in trading status for an individual option. Messages will be sent when an option is halted, is released for quotation, released for trading, or temporarily suspended for trading on the buy or sell side.
     */
    TRADING_ACTION_MESSAGE('H', "After the start of system hours, NASDAQ will use the Trading Action message to relay changes in trading status for an individual option. Messages will be sent when an option is halted, is released for quotation, released for trading, or temporarily suspended for trading on the buy or sell side."),

    /**
     * NASDAQ plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the NASDAQ Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the NASDAQ Options Market System.
     */
    SECURITY_OPEN_MESSAGE('O', "NASDAQ plans to disseminate the Option Open Message for each option as soon as the opening is completed. Upon receipt of the open state message, firms should be advised that the option denoted in the message is now available for auto execution within the NASDAQ Options Market System. Upon receipt of the closed state message, firms should be advised that the option is no longer eligible for auto-execution within the NASDAQ Options Market System."),

    /**
     * For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    ADD_ORDER_MESSAGE_SHORT_MESSAGE_FORM('a', "For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    ADD_ORDER_MESSAGE_LONG_FORM_MESSAGE('A', "For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    ADD_QUOTE_MESSAGE_SHORT_FORM_MESSAGE('j', "For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * For bandwidth efficiency reasons, this message can be published in either short or long format.
     */
    ADD_QUOTE_MESSAGE_LONG_FORM_MESSAGE('J', "For bandwidth efficiency reasons, this message can be published in either short or long format."),

    /**
     * This message is sent whenever a Side order is executed in whole or in part. It is possible to receive several Single Side Executed Messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed Messages on the same order are cumulative. By combining the executions received separately via two types of Single Side Executed Messages and Trade Messages, it is possible to build a complete view of all non-auction executions that happen on NASDAQ. Auction execution information is available in one bulk print via the Auction Trade Message.
     */
    SINGLE_SIDE_EXECUTED_MESSAGE('E', "This message is sent whenever a Side order is executed in whole or in part. It is possible to receive several Single Side Executed Messages for the same Side order if that Side order is executed in several parts. The multiple Single Side Executed Messages on the same order are cumulative. By combining the executions received separately via two types of Single Side Executed Messages and Trade Messages, it is possible to build a complete view of all non-auction executions that happen on NASDAQ. Auction execution information is available in one bulk print via the Auction Trade Message."),

    /**
     * These executions may be marked as non-printable. If the execution is marked as non-printed, it means that the contracts will be included into a later bulk print (e.g., in the case of auction executions). If a firm is looking to use the ITTO data in time-and-sales displays or volume calculations, NASDAQ recommends that firms ignore messages marked as non-printable to prevent double counting.
     */
    SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE('C', "These executions may be marked as non-printable. If the execution is marked as non-printed, it means that the contracts will be included into a later bulk print (e.g., in the case of auction executions). If a firm is looking to use the ITTO data in time-and-sales displays or volume calculations, NASDAQ recommends that firms ignore messages marked as non-printable to prevent double counting."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM('u', "This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number."),

    /**
     * This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number.
     */
    SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM('U', "This message is sent whenever an order or one side of a quote on the book is replaced. The replacement has a new sequence number and replaces the prior sequence number."),

    /**
     * The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.
     */
    SINGLE_SIDE_DELETE_MESSAGE('D', "The message is sent when an order or a side of a quote is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book."),

    /**
     * This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged.
     */
    SINGLE_SIDE_CHANGE_MESSAGE('G', "This message is sent whenever an order or a side of a quote is being updated for price and (or) contracts. The reference number associated with the order quote is unchanged."),

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
     * This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types. (Note: There is a separate message for NASDAQ Option auction events.)
     */
    OPTIONS_TRADE_MESSAGES_NON_AUCTION('P', "This Options Trade Message is designed to provide execution details for normal match events involving non-displayable order types. (Note: There is a separate message for NASDAQ Option auction events.)"),

    /**
     * This message will also be used to report all executions within a price improvement (PRISM) auction.
     */
    OPTIONS_CROSS_TRADE_MESSAGE('Q', "This message will also be used to report all executions within a price improvement (PRISM) auction."),

    /**
     * The Broken Trade Message is sent whenever an execution on NASDAQ is broken. An execution may be broken if it is found to be “clearly erroneous” pursuant to NASDAQ’s Clearly Erroneous Policy. A trade break is final; once a trade is broken, it cannot be reinstated.
     */
    BROKEN_TRADE_ORDER_EXECUTED_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on NASDAQ is broken. An execution may be broken if it is found to be \u201Cclearly erroneous\u201D pursuant to NASDAQ\u2019s Clearly Erroneous Policy. A trade break is final; once a trade is broken, it cannot be reinstated."),

    /**
     * For the NASDAQ Opening Auction, NASDAQ will begin the dissemination of NOII messages for a put or a call option five minutes prior to the start of opening process event and two minutes prior to the halt resumption (reopening) process event.
     */
    NOII_MESSAGE('I', "For the NASDAQ Opening Auction, NASDAQ will begin the dissemination of NOII messages for a put or a call option five minutes prior to the start of opening process event and two minutes prior to the halt resumption (reopening) process event.");

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
            case 'R' -> Optional.of(OPTIONS_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(SECURITY_OPEN_MESSAGE);
            case 'a' -> Optional.of(ADD_ORDER_MESSAGE_SHORT_MESSAGE_FORM);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE_LONG_FORM_MESSAGE);
            case 'j' -> Optional.of(ADD_QUOTE_MESSAGE_SHORT_FORM_MESSAGE);
            case 'J' -> Optional.of(ADD_QUOTE_MESSAGE_LONG_FORM_MESSAGE);
            case 'E' -> Optional.of(SINGLE_SIDE_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(SINGLE_SIDE_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'u' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_SHORT_FORM);
            case 'U' -> Optional.of(SINGLE_SIDE_REPLACE_MESSAGE_LONG_FORM);
            case 'D' -> Optional.of(SINGLE_SIDE_DELETE_MESSAGE);
            case 'G' -> Optional.of(SINGLE_SIDE_CHANGE_MESSAGE);
            case 'k' -> Optional.of(QUOTE_REPLACE_MESSAGE_SHORT_FORM);
            case 'K' -> Optional.of(QUOTE_REPLACE_MESSAGE_LONG_FORM);
            case 'Y' -> Optional.of(QUOTE_DELETE_MESSAGE);
            case 'P' -> Optional.of(OPTIONS_TRADE_MESSAGES_NON_AUCTION);
            case 'Q' -> Optional.of(OPTIONS_CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_ORDER_EXECUTED_MESSAGE);
            case 'I' -> Optional.of(NOII_MESSAGE);
            default -> Optional.empty();
        };
    }
}
