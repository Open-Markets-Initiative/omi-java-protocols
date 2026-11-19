package omi.cboe.bzxoptions.complextop.pitch.v1_1_54.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is a Top event for a given clock second. If there is no Top event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a Top event for a given clock second. If there is no Top event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit."),

    /**
     * The Unit Clear message instructs feed recipients to clear all Cboe complex books in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all Cboe complex books in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over."),

    /**
     * A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message. Complex Instrument Definition Expanded messages will be sent in a continuous loop through the day at variable rates as bandwidth allows. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions.
     */
    COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE((short) 154, "A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message. Complex Instrument Definition Expanded messages will be sent in a continuous loop through the day at variable rates as bandwidth allows. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions."),

    /**
     * A Symbol Mapping message is used to map the 6 character simple instrument multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows.
     */
    SYMBOL_MAPPING_MESSAGE((short) 47, "A Symbol Mapping message is used to map the 6 character simple instrument multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Complex Instrument ID. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. The Single Side Update Expanded (Short) message is used whenever possible.
     */
    SINGLE_SIDE_UPDATE_EXPANDED_SHORT_MESSAGE((short) 212, "Single Side Update messages provide an updated price and size for a single side of a Complex Instrument ID. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. The Single Side Update Expanded (Short) message is used whenever possible."),

    /**
     * Single Side Update messages provide an updated price and size for a single side of a Complex Instrument ID. The Single Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    SINGLE_SIDE_UPDATE_EXPANDED_LONG_MESSAGE((short) 213, "Single Side Update messages provide an updated price and size for a single side of a Complex Instrument ID. The Single Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Complex Instrument ID. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. The Two Side Update Expanded (Short) message is used whenever possible.
     */
    TWO_SIDE_UPDATE_EXPANDED_SHORT_MESSAGE((short) 214, "Two Side Update messages provide an updated price and size for both sides of a Complex Instrument ID. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time, but will only be done so in a way that can be arbitrated between A/B feeds. The Two Side Update Expanded (Short) message is used whenever possible."),

    /**
     * Two Side Update messages provide an updated price and size for both sides of a Complex Instrument ID. The Two Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    TWO_SIDE_UPDATE_EXPANDED_LONG_MESSAGE((short) 215, "Two Side Update messages provide an updated price and size for both sides of a Complex Instrument ID. The Two Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * The TOP Trade message provides information about executions of complex orders. TOP Trade messages are necessary to calculate Cboe execution-based data. TOP Trade messages do not alter the complex book. One or more Single Side Update Expanded or Two Side Update Expanded messages will follow a TOP Trade message to reflect the updated complex book. The TOP Trade message sends the trade price, trade quantity, and trade condition of a trade as well as the cumulative volume for the business day.
     */
    TOP_TRADE_MESSAGE((short) 184, "The TOP Trade message provides information about executions of complex orders. TOP Trade messages are necessary to calculate Cboe execution-based data. TOP Trade messages do not alter the complex book. One or more Single Side Update Expanded or Two Side Update Expanded messages will follow a TOP Trade message to reflect the updated complex book. The TOP Trade message sends the trade price, trade quantity, and trade condition of a trade as well as the cumulative volume for the business day."),

    /**
     * Options Auction Update messages are used to disseminate price and size information during Opening and Re-Opening (halt) auctions for complex instruments. The Options Auction Update messages are sent every five seconds during an opening period.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information during Opening and Re-Opening (halt) auctions for complex instruments. The Options Auction Update messages are sent every five seconds during an opening period."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of its Opening or Re-Opening auction and represents the Cboe opening price.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of its Opening or Re-Opening auction and represents the Cboe opening price."),

    /**
     * The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) session.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) session."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.");

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
            case 154 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE);
            case 47 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 212 -> Optional.of(SINGLE_SIDE_UPDATE_EXPANDED_SHORT_MESSAGE);
            case 213 -> Optional.of(SINGLE_SIDE_UPDATE_EXPANDED_LONG_MESSAGE);
            case 214 -> Optional.of(TWO_SIDE_UPDATE_EXPANDED_SHORT_MESSAGE);
            case 215 -> Optional.of(TWO_SIDE_UPDATE_EXPANDED_LONG_MESSAGE);
            case 184 -> Optional.of(TOP_TRADE_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
