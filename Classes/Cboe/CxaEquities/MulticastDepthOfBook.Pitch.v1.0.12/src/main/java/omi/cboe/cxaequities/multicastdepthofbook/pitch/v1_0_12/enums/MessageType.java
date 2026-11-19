package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Instructs feed recipients to clear all orders for the CXA book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a datacentre fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Instructs feed recipients to clear all orders for the CXA book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a datacentre fail-over."),

    /**
     * Indicates the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security.
     */
    TRADING_STATUS_MESSAGE((short) 59, "Indicates the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security."),

    /**
     * Represents a newly accepted visible or undisclosed order on the CXA book. Includes a day-specific Order Id assigned by CXA to the order.
     */
    ADD_ORDER_MESSAGE((short) 55, "Represents a newly accepted visible or undisclosed order on the CXA book. Includes a day-specific Order Id assigned by CXA to the order."),

    /**
     * Sent when a visible order on the CXA book is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 56, "Sent when a visible order on the CXA book is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Used to update lit orders that have fully or partially executed in an auction. There is one Order Executed at Price message per auction trade, which includes the order IDs of both resting orders matched in the trade. Each message is followed by either a Reduce Size message (if the contra order has partially executed) or a Delete Order message (if the contra order has fully executed).
     */
    ORDER_EXECUTED_AT_PRICE_MESSAGE((short) 88, "Used to update lit orders that have fully or partially executed in an auction. There is one Order Executed at Price message per auction trade, which includes the order IDs of both resting orders matched in the trade. Each message is followed by either a Reduce Size message (if the contra order has partially executed) or a Delete Order message (if the contra order has fully executed)."),

    /**
     * Sent when a visible order on the CXA book is partially reduced.
     */
    REDUCE_SIZE_MESSAGE((short) 57, "Sent when a visible order on the CXA book is partially reduced."),

    /**
     * Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Modify Order messages that appear to be "no ops" (i.e., they do not appear to modify any relevant fields) will still lose priority.
     */
    MODIFY_ORDER_MESSAGE((short) 58, "Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Modify Order messages that appear to be \"no ops\" (i.e., they do not appear to modify any relevant fields) will still lose priority."),

    /**
     * Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 60, "Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * Provides information about executions of non-displayed and undisclosed orders (including auction executions of undisclosed orders), on the CXA book or executions that occur off-exchange and reported to CXA. Trade messages for on-exchange electronic executions are necessary to calculate CXA execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRADE_MESSAGE((short) 61, "Provides information about executions of non-displayed and undisclosed orders (including auction executions of undisclosed orders), on the CXA book or executions that occur off-exchange and reported to CXA. Trade messages for on-exchange electronic executions are necessary to calculate CXA execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * Sent whenever an execution on CXA or off-exchange trade reported to CXA is cancelled. A trade correction is performed by sending a Trade Break message followed by a new Trade message with the corrected size and price. Applications that simply build a CXA book can ignore Trade Break messages.
     */
    TRADE_BREAK_MESSAGE((short) 62, "Sent whenever an execution on CXA or off-exchange trade reported to CXA is cancelled. A trade correction is performed by sending a Trade Break message followed by a new Trade message with the corrected size and price. Applications that simply build a CXA book can ignore Trade Break messages."),

    /**
     * Sent when CXA calculates market values for a specified symbol or when a calculated market value is reported to CXA. The specified symbol may not trade on CXA, but instead could represent index or iNAV values reported to CXA from third parties as indicated by the Value Category field. The index values will be reported on each of the unitised CXA PITCH feeds and are not specific to an individual unit.
     */
    CALCULATED_VALUE_MESSAGE((short) 227, "Sent when CXA calculates market values for a specified symbol or when a calculated market value is reported to CXA. The specified symbol may not trade on CXA, but instead could represent index or iNAV values reported to CXA from third parties as indicated by the Value Category field. The index values will be reported on each of the unitised CXA PITCH feeds and are not specific to an individual unit."),

    /**
     * Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received."),

    /**
     * Sent during Pre-Open and Pre-Close trading states when a symbol has an order update relating to an overlapping order book (where the best bid price is greater than or equal to the best ask price). Includes the potential number of shares and the indicative auction price if the symbol were to undergo an auction now. Only sent if there are updates to the Buy Shares, Sell Shares, or Indicative Price fields.
     */
    AUCTION_UPDATE_MESSAGE((short) 89, "Sent during Pre-Open and Pre-Close trading states when a symbol has an order update relating to an overlapping order book (where the best bid price is greater than or equal to the best ask price). Includes the potential number of shares and the indicative auction price if the symbol were to undergo an auction now. Only sent if there are updates to the Buy Shares, Sell Shares, or Indicative Price fields."),

    /**
     * Sent at the completion of the Auction per symbol and includes the Auction Price and Shares executed. If there is no overlapping order book at the time of the auction, no auction trades will result, but the Auction Summary message will still be disseminated and contain zeroes in the Price and Shares fields.
     */
    AUCTION_SUMMARY_MESSAGE((short) 90, "Sent at the completion of the Auction per symbol and includes the Auction Price and Shares executed. If there is no overlapping order book at the time of the auction, no auction trades will result, but the Auction Summary message will still be disseminated and contain zeroes in the Price and Shares fields.");

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
            case 55 -> Optional.of(ADD_ORDER_MESSAGE);
            case 56 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 88 -> Optional.of(ORDER_EXECUTED_AT_PRICE_MESSAGE);
            case 57 -> Optional.of(REDUCE_SIZE_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 60 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 61 -> Optional.of(TRADE_MESSAGE);
            case 62 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 227 -> Optional.of(CALCULATED_VALUE_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 89 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 90 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
