package omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_44.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is an Auction event for a given clock second. If there is no Auction event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is an Auction event for a given clock second. If there is no Auction event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit."),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over."),

    /**
     * Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original order, a user modification request to change the price or increase the original order quantity, or a fading of the NBBO. A user request to modify the order price or to increase the original order quantity will result in a cancellation of the auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for order quantity decrements.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original order, a user modification request to change the price or increase the original order quantity, or a fading of the NBBO. A user request to modify the order price or to increase the original order quantity will result in a cancellation of the auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for order quantity decrements."),

    /**
     * Auction Trade messages are used to disseminate executions resulting from an options auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "Auction Trade messages are used to disseminate executions resulting from an options auction."),

    /**
     * Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange. Options Auction Update messages are sent every five seconds during an opening period provided that one of the field values has changed. When no values have changed, a message is sent once every 60 seconds.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange. Options Auction Update messages are sent every five seconds during an opening period provided that one of the field values has changed. When no values have changed, a message is sent once every 60 seconds."),

    /**
     * Auction Summary messages are used to disseminate the results of the Opening and Re-Opening process. An Opening or Re-Opening Auction Summary message for each symbol is sent at the conclusion of the Opening or Re-Opening process and represents the Cboe opening price.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of the Opening and Re-Opening process. An Opening or Re-Opening Auction Summary message for each symbol is sent at the conclusion of the Opening or Re-Opening process and represents the Cboe opening price."),

    /**
     * The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis.
     */
    WIDTH_UPDATE_MESSAGE((short) 210, "The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol. These messages are sent continuously through the day at variable rates as bandwidth allows. Members who consume the Options Auction feed will be able to receive the full list of symbols in approximately 30 minutes.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol. These messages are sent continuously through the day at variable rates as bandwidth allows. Members who consume the Options Auction feed will be able to receive the full list of symbols in approximately 30 minutes."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down. No more auction messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down. No more auction messages will be delivered for this unit, but heartbeats from the unit may be received.");

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
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 210 -> Optional.of(WIDTH_UPDATE_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
