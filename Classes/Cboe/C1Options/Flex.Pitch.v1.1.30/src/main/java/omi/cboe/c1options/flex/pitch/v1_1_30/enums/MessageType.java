package omi.cboe.c1options.flex.pitch.v1_1_30.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed."),

    /**
     * A Time message is immediately generated and sent when there is a FLEX event for a given clock second.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a FLEX event for a given clock second."),

    /**
     * A FLEX Instrument Definition message represents an instrument that is available to place orders.
     */
    FLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 156, "A FLEX Instrument Definition message represents an instrument that is available to place orders."),

    /**
     * A Complex FLEX Instrument Definition message represents a complex instrument that is available to place orders.
     */
    COMPLEX_FLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 155, "A Complex FLEX Instrument Definition message represents a complex instrument that is available to place orders."),

    /**
     * Auction Notification messages are used to disseminate order details of a FLEX Auction.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of a FLEX Auction."),

    /**
     * DAC Auction Notification messages are used to disseminate order details of a DAC FLEX Auction.
     */
    DAC_AUCTION_NOTIFICATION_MESSAGE((short) 221, "DAC Auction Notification messages are used to disseminate order details of a DAC FLEX Auction."),

    /**
     * Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message."),

    /**
     * Auction Trade messages are used to disseminate executions resulting from an auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "Auction Trade messages are used to disseminate executions resulting from an auction."),

    /**
     * The Trade message provides information about executions of FLEX orders on the Cboe Options trading floor.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of FLEX orders on the Cboe Options trading floor."),

    /**
     * The Trade (short) message provides information about executions of FLEX orders on the Cboe Options trading floor.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade (short) message provides information about executions of FLEX orders on the Cboe Options trading floor."),

    /**
     * The DAC Trade message provides information about executions of Delta Adjusted at Close (DAC) FLEX orders on the Cboe Options trading floor.
     */
    DAC_TRADE_MESSAGE((short) 54, "The DAC Trade message provides information about executions of Delta Adjusted at Close (DAC) FLEX orders on the Cboe Options trading floor."),

    /**
     * The Trade Break message is sent whenever a FLEX options execution on Cboe is broken.
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever a FLEX options execution on Cboe is broken."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying."),

    /**
     * The Trading Status message is used to indicate the current trading status of a FLEX options instrument.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a FLEX options instrument."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 156 -> Optional.of(FLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 155 -> Optional.of(COMPLEX_FLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 221 -> Optional.of(DAC_AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 42 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 54 -> Optional.of(DAC_TRADE_MESSAGE);
            case 44 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
