package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_64.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second
     */
    EQ_TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second"),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header
     */
    EQ_UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book
     */
    EQ_ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe book"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book
     */
    EQ_ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan.
     */
    EQ_ADD_ORDER_EXPANDED_MESSAGE((short) 47, "An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part
     */
    EQ_ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part"),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id
     */
    EQ_ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id"),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced
     */
    EQ_REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced"),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced
     */
    EQ_REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced"),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    EQ_MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    EQ_MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book
     */
    EQ_DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers
     */
    EQ_TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers
     */
    EQ_TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Expanded version accommodates larger symbol sizes possible through the ISRA plan.
     */
    EQ_TRADE_EXPANDED_MESSAGE((short) 48, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Expanded version accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * The Trade Break message is sent whenever an execution on Cboe is broken
     */
    EQ_TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on Cboe is broken"),

    /**
     * The End of Session message is sent for each unit when the unit shuts down
     */
    EQ_END_OF_SESSION((short) 45, "The End of Session message is sent for each unit when the unit shuts down"),

    /**
     * The Trading Status message is used to indicate the current trading status of a security
     */
    EQ_TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a security"),

    /**
     * Auction Update messages are used to disseminate Cboe price and size information during auctions for Cboe listed securities and for Cboe Market Close crosses on BZX, and for Periodic Auctions on BYX
     */
    EQ_AUCTION_UPDATE_MESSAGE((short) 149, "Auction Update messages are used to disseminate Cboe price and size information during auctions for Cboe listed securities and for Cboe Market Close crosses on BZX, and for Periodic Auctions on BYX"),

    /**
     * Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, and for Periodic Auctions on BYX
     */
    EQ_AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, and for Periodic Auctions on BYX"),

    /**
     * This message is a Retail Liquidity Indicator (RLI) that includes symbol and side, but not price and size. BYX Only.
     */
    EQ_RETAIL_PRICE_IMPROVEMENT_MESSAGE((short) 152, "This message is a Retail Liquidity Indicator (RLI) that includes symbol and side, but not price and size. BYX Only.");

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
            case 32 -> Optional.of(EQ_TIME_MESSAGE);
            case 151 -> Optional.of(EQ_UNIT_CLEAR_MESSAGE);
            case 33 -> Optional.of(EQ_ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(EQ_ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(EQ_ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(EQ_ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(EQ_ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(EQ_REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(EQ_REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(EQ_MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(EQ_MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(EQ_DELETE_ORDER_MESSAGE);
            case 42 -> Optional.of(EQ_TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(EQ_TRADE_SHORT_MESSAGE);
            case 48 -> Optional.of(EQ_TRADE_EXPANDED_MESSAGE);
            case 44 -> Optional.of(EQ_TRADE_BREAK_MESSAGE);
            case 45 -> Optional.of(EQ_END_OF_SESSION);
            case 49 -> Optional.of(EQ_TRADING_STATUS_MESSAGE);
            case 149 -> Optional.of(EQ_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(EQ_AUCTION_SUMMARY_MESSAGE);
            case 152 -> Optional.of(EQ_RETAIL_PRICE_IMPROVEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
