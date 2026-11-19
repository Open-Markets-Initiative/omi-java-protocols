package omi.nasdaq.phlxoptions.topofmarket.itch.v3_4.enums;

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
    TIMESTAMP_MESSAGE('T', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

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
    SECURITY_OPEN_CLOSED_MESSAGE('O', "The options system uses this administrative message to indicate when an option has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution."),

    /**
     * Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected security.
     */
    SHORT_BEST_BID_AND_ASK_UPDATE_MESSAGE('q', "Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected security."),

    /**
     * This message is the same as the Best Bid AND Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the prices having 4 implied decimal places.
     */
    LONG_BEST_BID_AND_ASK_UPDATE_MESSAGE('Q', "This message is the same as the Best Bid AND Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the prices having 4 implied decimal places."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security.
     */
    SHORT_BEST_ASK_UPDATE_MESSAGE('a', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security.
     */
    SHORT_BEST_BID_UPDATE_MESSAGE('b', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this feed for the affected security."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    LONG_BEST_ASK_UPDATE_MESSAGE('A', "This message is the same as the Best Bid OR Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    LONG_BEST_BID_UPDATE_MESSAGE('B', "This message is the same as the Best Bid OR Ask Update Message \u2013 Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * The Trade Report message will be used to relay execution system transactions that are reported during the current business day. The options system only reports one-side of a trade execution on the feed and other data feed products.
     */
    TRADE_REPORT_MESSAGE('R', "The Trade Report message will be used to relay execution system transactions that are reported during the current business day. The options system only reports one-side of a trade execution on the feed and other data feed products."),

    /**
     * The following message is used in the event that an options trade transaction is broken on the same business day that it is reported.
     */
    BROKEN_TRADE_REPORT_MESSAGE('X', "The following message is used in the event that an options trade transaction is broken on the same business day that it is reported."),

    /**
     * The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete. The firms can then use this sequence number to resume on the real time Mold channel. Only for SoupBINTCP.
     */
    END_OF_REPLAY_SEQUENCE_MESSAGE('M', "The End of replay Sequence message reflects the sequence number at the time replay of existing messages is complete. The firms can then use this sequence number to resume on the real time Mold channel. Only for SoupBINTCP.");

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
            case 'T' -> Optional.of(TIMESTAMP_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'D' -> Optional.of(OPTIONS_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'O' -> Optional.of(SECURITY_OPEN_CLOSED_MESSAGE);
            case 'q' -> Optional.of(SHORT_BEST_BID_AND_ASK_UPDATE_MESSAGE);
            case 'Q' -> Optional.of(LONG_BEST_BID_AND_ASK_UPDATE_MESSAGE);
            case 'a' -> Optional.of(SHORT_BEST_ASK_UPDATE_MESSAGE);
            case 'b' -> Optional.of(SHORT_BEST_BID_UPDATE_MESSAGE);
            case 'A' -> Optional.of(LONG_BEST_ASK_UPDATE_MESSAGE);
            case 'B' -> Optional.of(LONG_BEST_BID_UPDATE_MESSAGE);
            case 'R' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(BROKEN_TRADE_REPORT_MESSAGE);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
