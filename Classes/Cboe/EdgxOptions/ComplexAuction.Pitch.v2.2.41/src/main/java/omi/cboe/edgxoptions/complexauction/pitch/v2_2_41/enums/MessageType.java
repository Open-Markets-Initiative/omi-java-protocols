package omi.cboe.edgxoptions.complexauction.pitch.v2_2_41.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit."),

    /**
     * A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. This message is unsequenced (sequence = 0) and is sent just prior to every Auction Notification message. Complex Instrument Definition Expanded messages will also be sent in a continuous loop through the day at variable rates as bandwidth allows. The Time offset field should be ignored on Complex Instrument Definition Expanded messages. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions.
     */
    COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE((short) 154, "A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. This message is unsequenced (sequence = 0) and is sent just prior to every Auction Notification message. Complex Instrument Definition Expanded messages will also be sent in a continuous loop through the day at variable rates as bandwidth allows. The Time offset field should be ignored on Complex Instrument Definition Expanded messages. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions."),

    /**
     * A Symbol Mapping message is used to map the 6 character simple instrument multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character simple instrument multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * Auction Notification messages are used to disseminate order details of a complex auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of a complex auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original complex auction, a user modification request to change the complex auction price or increase the original complex auction quantity, a fading of the NBBO or to cancel any remaining complex auction quantity from the original Auction Notification following the complex auction termination. A user request to modify the complex auction price or to increase the original complex auction quantity will result in a cancellation of the complex auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for complex auction quantity decrements.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original complex auction, a user modification request to change the complex auction price or increase the original complex auction quantity, a fading of the NBBO or to cancel any remaining complex auction quantity from the original Auction Notification following the complex auction termination. A user request to modify the complex auction price or to increase the original complex auction quantity will result in a cancellation of the complex auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for complex auction quantity decrements."),

    /**
     * Auction Trade messages are used to disseminate executions resulting from a complex auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "Auction Trade messages are used to disseminate executions resulting from a complex auction."),

    /**
     * Options Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) process for complex instruments. The Options Auction Update messages are sent every five seconds during an opening period. Refer to the Cboe Options Complex Book Process specification for more information.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) process for complex instruments. The Options Auction Update messages are sent every five seconds during an opening period. Refer to the Cboe Options Complex Book Process specification for more information."),

    /**
     * Auction Summary messages are used to disseminate the results of the Opening and Re-Opening process of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of the Opening or Re-Opening process and represents the Cboe opening price. Refer to the Cboe Options Complex Book Process specification for more information.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of the Opening and Re-Opening process of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of the Opening or Re-Opening process and represents the Cboe opening price. Refer to the Cboe Options Complex Book Process specification for more information."),

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
            case 154 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
