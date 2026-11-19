package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Instructs feed recipients to clear all orders for the Cboe Canada order book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Instructs feed recipients to clear all orders for the Cboe Canada order book in the unit specified in the Sequenced Unit Header. Distributed in rare recovery events such as a data center fail-over."),

    /**
     * Disseminates information for each symbol. A separate Trading Status message indicates the status of each symbol. If no Trading Status message is received for a symbol, it is assumed to be Suspended.
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 96, "Disseminates information for each symbol. A separate Trading Status message indicates the status of each symbol. If no Trading Status message is received for a symbol, it is assumed to be Suspended."),

    /**
     * Indicates the current trading status of a security on the Cboe Canada NEO system. Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended).
     */
    TRADING_STATUS_MESSAGE((short) 97, "Indicates the current trading status of a security on the Cboe Canada NEO system. Sequenced Trading Status messages are sent upon system startup for all active securities with Trading Status = S (suspended)."),

    /**
     * Represents a newly accepted order on Cboe Canada NEO. It includes a unique Order Id assigned by Cboe Canada NEO to the order.
     */
    ADD_ORDER_MESSAGE((short) 98, "Represents a newly accepted order on Cboe Canada NEO. It includes a unique Order Id assigned by Cboe Canada NEO to the order."),

    /**
     * Sent when a visible order on Cboe Canada NEO is partially reduced. Orders that are reduced in size do not lose priority.
     */
    REDUCE_SIZE_MESSAGE((short) 99, "Sent when a visible order on Cboe Canada NEO is partially reduced. Orders that are reduced in size do not lose priority."),

    /**
     * Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 100, "Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Modify Order messages appearing to be no ops will still lose priority.
     */
    MODIFY_ORDER_MESSAGE((short) 101, "Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Modify Order messages appearing to be no ops will still lose priority."),

    /**
     * Sent when a visible order on Cboe Canada NEO is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 102, "Sent when a visible order on Cboe Canada NEO is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Provides information about executions of orders not displayed on any Cboe Canada trading book. Trade messages may also provide information about displayed orders that are traded at a price other than their displayed price. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRADE_MESSAGE((short) 103, "Provides information about executions of orders not displayed on any Cboe Canada trading book. Trade messages may also provide information about displayed orders that are traded at a price other than their displayed price. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * Sent whenever an execution on Cboe Canada NEO is cancelled. Applications that simply build a Cboe Canada NEO book can ignore Trade Break messages.
     */
    TRADE_BREAK_MESSAGE((short) 104, "Sent whenever an execution on Cboe Canada NEO is cancelled. Applications that simply build a Cboe Canada NEO book can ignore Trade Break messages."),

    /**
     * Sent whenever an execution on Cboe Canada NEO is corrected. Applications that simply build a Cboe Canada NEO book can ignore Trade Correction messages.
     */
    TRADE_CORRECTION_MESSAGE((short) 105, "Sent whenever an execution on Cboe Canada NEO is corrected. Applications that simply build a Cboe Canada NEO book can ignore Trade Correction messages."),

    /**
     * Disseminates price and size information and Composite Market bid and offer prices during Opening Call, Closing Call, and reopening call (halt). Auction Update messages are sent during an auction period, unless in a delayed closing.
     */
    AUCTION_UPDATE_MESSAGE((short) 107, "Disseminates price and size information and Composite Market bid and offer prices during Opening Call, Closing Call, and reopening call (halt). Auction Update messages are sent during an auction period, unless in a delayed closing."),

    /**
     * Disseminates the results of an Opening Call, Closing Call, or reopening call (Halt) on Cboe Canada NEO. An Auction Summary message for each Cboe Canada Listed Security is sent at the conclusion of its Opening Call and represents the Cboe official Opening Price (or Closing Price).
     */
    AUCTION_SUMMARY_MESSAGE((short) 108, "Disseminates the results of an Opening Call, Closing Call, or reopening call (Halt) on Cboe Canada NEO. An Auction Summary message for each Cboe Canada Listed Security is sent at the conclusion of its Opening Call and represents the Cboe official Opening Price (or Closing Price)."),

    /**
     * Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.");

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
            case 96 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 97 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 98 -> Optional.of(ADD_ORDER_MESSAGE);
            case 99 -> Optional.of(REDUCE_SIZE_MESSAGE);
            case 100 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 101 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 102 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 103 -> Optional.of(TRADE_MESSAGE);
            case 104 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 105 -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 107 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 108 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
