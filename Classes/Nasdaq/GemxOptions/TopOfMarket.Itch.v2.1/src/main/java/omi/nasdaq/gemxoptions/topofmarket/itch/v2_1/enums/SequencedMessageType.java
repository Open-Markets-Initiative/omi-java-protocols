package omi.nasdaq.gemxoptions.topofmarket.itch.v2_1.enums;

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
     * At the start of each trading day, Nasdaq disseminates options symbol directory messages for all active options symbols in the system.
     */
    DERIVATIVE_DIRECTORY_MESSAGE('m', "At the start of each trading day, Nasdaq disseminates options symbol directory messages for all active options symbols in the system."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day.
     */
    BEST_BID_AND_ASK_UPDATE_SHORT_FORM_MESSAGE('q', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day."),

    /**
     * This message is the same as the Best Bid AND Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_BID_AND_ASK_UPDATE_LONG_FORM_MESSAGE('Q', "This message is the same as the Best Bid AND Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this data feed for the affected security.
     */
    BEST_BID_UPDATE_SHORT_FORM_MESSAGE('b', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this data feed for the affected security."),

    /**
     * The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this data feed for the affected security.
     */
    BEST_ASK_UPDATE_SHORT_FORM_MESSAGE('a', "The options system will continuously calculate its best bid and offer position for active options contracts on the options market during the trading day. Whenever the best bid or ask position changes on one side but not the other side, the options system will send its best bid or ask update via this data feed for the affected security."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_BID_UPDATE_LONG_FORM_MESSAGE('B', "This message is the same as the Best Bid OR Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

    /**
     * This message is the same as the Best Bid OR Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.
     */
    BEST_ASK_UPDATE_LONG_FORM_MESSAGE('A', "This message is the same as the Best Bid OR Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places."),

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
            case 'm' -> Optional.of(DERIVATIVE_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'q' -> Optional.of(BEST_BID_AND_ASK_UPDATE_SHORT_FORM_MESSAGE);
            case 'Q' -> Optional.of(BEST_BID_AND_ASK_UPDATE_LONG_FORM_MESSAGE);
            case 'b' -> Optional.of(BEST_BID_UPDATE_SHORT_FORM_MESSAGE);
            case 'a' -> Optional.of(BEST_ASK_UPDATE_SHORT_FORM_MESSAGE);
            case 'B' -> Optional.of(BEST_BID_UPDATE_LONG_FORM_MESSAGE);
            case 'A' -> Optional.of(BEST_ASK_UPDATE_LONG_FORM_MESSAGE);
            case 'M' -> Optional.of(END_OF_REPLAY_SEQUENCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
