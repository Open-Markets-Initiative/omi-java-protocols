package omi.cboe.cxaequities.multicasttopofbook.pitch.v1_0_10.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Instructs feed recipients to clear all data for the CXA book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a datacentre fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Instructs feed recipients to clear all data for the CXA book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a datacentre fail-over."),

    /**
     * Indicates the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security.
     */
    TRADING_STATUS_MESSAGE((short) 59, "Indicates the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security."),

    /**
     * Provides an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time but will only be done so in a way that can be arbitrated between A/B feeds.
     */
    SINGLE_SIDE_UPDATE_MESSAGE((short) 228, "Provides an updated price and size for a single side of a Symbol. The side is denoted by the Side field. One Single Side Update message may reflect one or more updates to the inside book that were processed at the same time but will only be done so in a way that can be arbitrated between A/B feeds."),

    /**
     * Provides an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time but will only be done so in a way that can be arbitrated between A/B feeds.
     */
    TWO_SIDE_UPDATE_MESSAGE((short) 229, "Provides an updated price and size for both sides of a Symbol. One Two Side Update message may reflect one or more updates to the inside book that were processed at the same time but will only be done so in a way that can be arbitrated between A/B feeds."),

    /**
     * Provides information about executions of orders on the CXA book or executions that occur off-exchange and reported to CXA. TOP Trade messages for on-exchange electronic executions are necessary to calculate CXA execution-based data. TOP Trade messages do not alter the book. A TOP Trade message is also sent whenever an execution or trade report is broken with the Flags field value indicating trade break.
     */
    TOP_TRADE_MESSAGE((short) 230, "Provides information about executions of orders on the CXA book or executions that occur off-exchange and reported to CXA. TOP Trade messages for on-exchange electronic executions are necessary to calculate CXA execution-based data. TOP Trade messages do not alter the book. A TOP Trade message is also sent whenever an execution or trade report is broken with the Flags field value indicating trade break."),

    /**
     * Sent when CXA calculates market values for a specified symbol or when a calculated market value is reported to CXA. The specified symbol may not trade on CXA, but instead could represent index or iNAV values reported to CXA from third parties as indicated by the Value Category field. The index values will be reported on each of the unitised CXA TOP feeds and are not specific to an individual unit. Calculated Value messages will be included in a spin response.
     */
    CALCULATED_VALUE_MESSAGE((short) 227, "Sent when CXA calculates market values for a specified symbol or when a calculated market value is reported to CXA. The specified symbol may not trade on CXA, but instead could represent index or iNAV values reported to CXA from third parties as indicated by the Value Category field. The index values will be reported on each of the unitised CXA TOP feeds and are not specific to an individual unit. Calculated Value messages will be included in a spin response."),

    /**
     * Sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "Sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received."),

    /**
     * Sent during Pre-Open and Pre-Close trading states when a symbol has an order update which relates to an overlapping order book (where the best bid price is greater than or equal to the best ask price). Includes the potential number of shares and the indicative auction price if the symbol were to undergo an auction now. Only sent if there are updates to the Buy Shares, Sell Shares, or Indicative Price fields.
     */
    AUCTION_UPDATE_MESSAGE((short) 149, "Sent during Pre-Open and Pre-Close trading states when a symbol has an order update which relates to an overlapping order book (where the best bid price is greater than or equal to the best ask price). Includes the potential number of shares and the indicative auction price if the symbol were to undergo an auction now. Only sent if there are updates to the Buy Shares, Sell Shares, or Indicative Price fields."),

    /**
     * Sent at the completion of the Auction per symbol and includes the Auction Price and Shares traded. If there is no overlapping order book at the time of the auction, no auction trades will result, however the Auction Summary message will still be disseminated and contain zeroes in the Price and Shares fields.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Sent at the completion of the Auction per symbol and includes the Auction Price and Shares traded. If there is no overlapping order book at the time of the auction, no auction trades will result, however the Auction Summary message will still be disseminated and contain zeroes in the Price and Shares fields.");

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
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 59 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 228 -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 229 -> Optional.of(TWO_SIDE_UPDATE_MESSAGE);
            case 230 -> Optional.of(TOP_TRADE_MESSAGE);
            case 227 -> Optional.of(CALCULATED_VALUE_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 149 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
