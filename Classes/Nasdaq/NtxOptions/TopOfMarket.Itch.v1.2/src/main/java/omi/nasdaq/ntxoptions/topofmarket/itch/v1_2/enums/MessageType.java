package omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * For bandwidth efficiency reasons, the timestamp for a message is divided into two pieces: the seconds portion and sub-seconds portion. The seconds portion of the timestamp appears in the Timestamp Message, any message on the stream following this message has this seconds portion of time until the next timestamp message. The format is as follows:
     */
    TIMESTAMP_MESSAGE('T', "For bandwidth efficiency reasons, the timestamp for a message is divided into two pieces: the seconds portion and sub-seconds portion. The seconds portion of the timestamp appears in the Timestamp Message, any message on the stream following this message has this seconds portion of time until the next timestamp message. The format is as follows:"),

    /**
     * The system event message type is used to signal a market or data feed handler event. The format is as follows:
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event. The format is as follows:"),

    /**
     * At the start of each trading day, the options system disseminates directory messages for all symbols eligible for the auction process in the options system.
     */
    OPTIONS_DIRECTORY_MESSAGE('D', "At the start of each trading day, the options system disseminates directory messages for all symbols eligible for the auction process in the options system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * The options system uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    SECURITY_OPEN_MESSAGE('O', "The options system uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes.
     */
    BEST_BID_AND_ASK_UPDATE_SHORT_FORM_MESSAGE('q', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes."),

    /**
     * This message is the same as the Best Bid AND Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_BID_AND_ASK_UPDATE_LONG_FORM_MESSAGE('Q', "This message is the same as the Best Bid AND Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes.
     */
    BEST_BID_UPDATE_SHORT_FORM_MESSAGE('b', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes.
     */
    BEST_ASK_UPDATE_SHORT_FORM_MESSAGE('a', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security. A change in bid or ask implies a change in price and/or size. The quote will reflect the highest price displayable in the options system for buy orders/quotes and the lowest price displayable in the options system for sell orders/quotes."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_BID_UPDATE_LONG_FORM_MESSAGE('B', "This message is the same as the Best Bid OR Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_ASK_UPDATE_LONG_FORM_MESSAGE('A', "This message is the same as the Best Bid OR Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * The Trade Report message will be used to relay execution system transactions that are reported during the current business day. The options system only reports one-side of a trade execution on the feed and other data feed products.
     */
    TRADE_REPORT_MESSAGE('R', "The Trade Report message will be used to relay execution system transactions that are reported during the current business day. The options system only reports one-side of a trade execution on the feed and other data feed products."),

    /**
     * The following message is used in the event that an options trade transaction is broken on the same business day that it is reported.
     */
    BROKEN_TRADE_REPORT_MESSAGE('X', "The following message is used in the event that an options trade transaction is broken on the same business day that it is reported.");

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
            case 'T' -> Optional.of(TIMESTAMP_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'D' -> Optional.of(OPTIONS_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(SECURITY_OPEN_MESSAGE);
            case 'q' -> Optional.of(BEST_BID_AND_ASK_UPDATE_SHORT_FORM_MESSAGE);
            case 'Q' -> Optional.of(BEST_BID_AND_ASK_UPDATE_LONG_FORM_MESSAGE);
            case 'b' -> Optional.of(BEST_BID_UPDATE_SHORT_FORM_MESSAGE);
            case 'a' -> Optional.of(BEST_ASK_UPDATE_SHORT_FORM_MESSAGE);
            case 'B' -> Optional.of(BEST_BID_UPDATE_LONG_FORM_MESSAGE);
            case 'A' -> Optional.of(BEST_ASK_UPDATE_LONG_FORM_MESSAGE);
            case 'R' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(BROKEN_TRADE_REPORT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
