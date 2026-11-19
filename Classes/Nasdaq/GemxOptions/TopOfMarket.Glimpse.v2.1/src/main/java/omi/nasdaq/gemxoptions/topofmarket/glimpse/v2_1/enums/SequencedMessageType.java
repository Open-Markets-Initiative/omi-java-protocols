package omi.nasdaq.gemxoptions.topofmarket.glimpse.v2_1.enums;

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
    DERIVATIVE_DIRECTORY_MESSAGE('m', "Derivative Directory Message for active options symbols."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * Best Bid AND Ask Update message with 2 byte Price and Size fields.
     */
    BEST_BID_AND_ASK_UPDATE_SHORT_FORM_MESSAGE('q', "Best Bid AND Ask Update message with 2 byte Price and Size fields."),

    /**
     * Best Bid AND Ask Update message with 4 byte Price and Size fields.
     */
    BEST_BID_AND_ASK_UPDATE_LONG_FORM_MESSAGE('Q', "Best Bid AND Ask Update message with 4 byte Price and Size fields."),

    /**
     * Best Bid OR Ask Update message with 2 byte Price and Size fields, bid side.
     */
    BEST_BID_OR_ASK_UPDATE_SHORT_FORM_MESSAGE_B('b', "Best Bid OR Ask Update message with 2 byte Price and Size fields, bid side."),

    /**
     * Best Bid OR Ask Update message with 2 byte Price and Size fields, ask side.
     */
    BEST_BID_OR_ASK_UPDATE_SHORT_FORM_MESSAGE_A('a', "Best Bid OR Ask Update message with 2 byte Price and Size fields, ask side."),

    /**
     * Best Bid OR Ask Update message with 4 byte Price and Size fields, bid side.
     */
    BEST_BID_OR_ASK_UPDATE_LONG_FORM_MESSAGE_B('B', "Best Bid OR Ask Update message with 4 byte Price and Size fields, bid side."),

    /**
     * Best Bid OR Ask Update message with 4 byte Price and Size fields, ask side.
     */
    BEST_BID_OR_ASK_UPDATE_LONG_FORM_MESSAGE_A('A', "Best Bid OR Ask Update message with 4 byte Price and Size fields, ask side."),

    /**
     * The Snapshot message reflects the Top of Market sequence number at the time the GLIMPSE spin was requested.
     */
    SNAPSHOT_MESSAGE('M', "The Snapshot message reflects the Top of Market sequence number at the time the GLIMPSE spin was requested.");

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
            case 'b' -> Optional.of(BEST_BID_OR_ASK_UPDATE_SHORT_FORM_MESSAGE_B);
            case 'a' -> Optional.of(BEST_BID_OR_ASK_UPDATE_SHORT_FORM_MESSAGE_A);
            case 'B' -> Optional.of(BEST_BID_OR_ASK_UPDATE_LONG_FORM_MESSAGE_B);
            case 'A' -> Optional.of(BEST_BID_OR_ASK_UPDATE_LONG_FORM_MESSAGE_A);
            case 'M' -> Optional.of(SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
