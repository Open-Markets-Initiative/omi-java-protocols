package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.enums;

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
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second"),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book
     */
    ADD_ORDER_LONG_MESSAGE((short) 64, "An Add Order message represents a newly accepted visible order on the Cboe book"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan.
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part"),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced"),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Delete Order message is sent whenever an open order is completely canceled. The Order Id refers to the Order Id of the original Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever an open order is completely canceled. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Trade message provides information about executions of complex order auctions on the Cboe complex book.
     */
    TRADE_LONG_MESSAGE((short) 65, "The Trade message provides information about executions of complex order auctions on the Cboe complex book."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers."),

    /**
     * The Trade message provides information about executions of complex order auctions on the Cboe complex book.
     */
    TRADE_EXTENDED_MESSAGE((short) 50, "The Trade message provides information about executions of complex order auctions on the Cboe complex book."),

    /**
     * This message provides details of trades reported to Cboe, but traded on a symbol not currently known to Cboe
     */
    TRADE_UNKNOWN_SYMBOL_MESSAGE((short) 53, "This message provides details of trades reported to Cboe, but traded on a symbol not currently known to Cboe"),

    /**
     * The End of Session message is sent for each unit when the unit shuts down
     */
    END_OF_SESSION((short) 45, "The End of Session message is sent for each unit when the unit shuts down"),

    /**
     * The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block"),

    /**
     * The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed
     */
    TRANSACTION_END_MESSAGE((short) 189, "The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed"),

    /**
     * The Trading Status message is used to indicate the current trading status of a complex instrument.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a complex instrument."),

    /**
     * The Statistics Message is used to disseminate the statistics prices: opening, closing, high, low
     */
    STATISTICS_MESSAGE((short) 52, "The Statistics Message is used to disseminate the statistics prices: opening, closing, high, low"),

    /**
     * Auction Update messages are used to disseminate indicative price and size information during auctions for Cboe auction eligible securities
     */
    AUCTION_UPDATE_MESSAGE((short) 172, "Auction Update messages are used to disseminate indicative price and size information during auctions for Cboe auction eligible securities"),

    /**
     * Auction Summary messages are used to disseminate the results of an auction in a Cboe auction eligible security
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction in a Cboe auction eligible security"),

    /**
     * Index Quote Messages are sent every second
     */
    INDEX_QUOTE_MESSAGE((short) 216, "Index Quote Messages are sent every second"),

    /**
     * Index Quote EDSP Messages are sent at end of day
     */
    INDEX_QUOTE_EDSP_MESSAGE((short) 217, "Index Quote EDSP Messages are sent at end of day");

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
            case 64 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 65 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 50 -> Optional.of(TRADE_EXTENDED_MESSAGE);
            case 53 -> Optional.of(TRADE_UNKNOWN_SYMBOL_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION);
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 52 -> Optional.of(STATISTICS_MESSAGE);
            case 172 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 216 -> Optional.of(INDEX_QUOTE_MESSAGE);
            case 217 -> Optional.of(INDEX_QUOTE_EDSP_MESSAGE);
            default -> Optional.empty();
        };
    }
}
