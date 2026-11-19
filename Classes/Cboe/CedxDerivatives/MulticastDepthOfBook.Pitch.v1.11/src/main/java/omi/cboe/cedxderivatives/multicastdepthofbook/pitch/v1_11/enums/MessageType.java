package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.enums;

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
     * The Fast Status Message is used to indicate that Cboe Europe now consider the given product to be in a Fast Market
     */
    FAST_STATUS_MESSAGE((short) 226, "The Fast Status Message is used to indicate that Cboe Europe now consider the given product to be in a Fast Market"),

    /**
     * Auction Summary messages are used to disseminate the results of an auction in a Cboe auction eligible security
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction in a Cboe auction eligible security"),

    /**
     * Opening Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) auctions
     */
    OPENING_AUCTION_UPDATE_MESSAGE((short) 209, "Opening Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) auctions"),

    /**
     * Auction Notification messages are used to disseminate order details of an auction
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of an auction"),

    /**
     * Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original order, a user modification request to change the price or increase the original order quantity, or a fading of the NBBO
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancellation of an earlier Auction Notification message as a result of a user cancellation of the original order, a user modification request to change the price or increase the original order quantity, or a fading of the NBBO"),

    /**
     * Auction Trade messages are used to disseminate executions resulting from an options auction
     */
    AUCTION_TRADE_MESSAGE((short) 223, "Auction Trade messages are used to disseminate executions resulting from an options auction"),

    /**
     * An Auction Liquidity Message is sent out for all AIM Auctions to give an indication of the level of response to a given Auction
     */
    AUCTION_LIQUIDITY_MESSAGE((short) 222, "An Auction Liquidity Message is sent out for all AIM Auctions to give an indication of the level of response to a given Auction"),

    /**
     * The Width Update message is used to communicate the opening quote width multiplier
     */
    WIDTH_UPDATE_MESSAGE((short) 210, "The Width Update message is used to communicate the opening quote width multiplier"),

    /**
     * Futures Instrument Definition
     */
    FUTURES_INSTRUMENT_DEFINITION_MESSAGE((short) 218, "Futures Instrument Definition"),

    /**
     * Options Instrument Definition
     */
    OPTIONS_INSTRUMENT_DEFINITION_MESSAGE((short) 219, "Options Instrument Definition"),

    /**
     * A Complex Instrument Definition message represents a complex instrument that is available to place orders
     */
    COMPLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 220, "A Complex Instrument Definition message represents a complex instrument that is available to place orders"),

    /**
     * The Trade Break message is sent whenever an execution is broken
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution is broken"),

    /**
     * Settlement messages are normally sent once per day per instrument after settlement prices have been calculated for all applicable instruments on a given business date
     */
    SETTLEMENT_MESSAGE((short) 185, "Settlement messages are normally sent once per day per instrument after settlement prices have been calculated for all applicable instruments on a given business date"),

    /**
     * The End of Day Summary is sent out right after trading ends for a symbol and contains a summary of trading activity for that symbol for the day
     */
    END_OF_DAY_SUMMARY_MESSAGE((short) 186, "The End of Day Summary is sent out right after trading ends for a symbol and contains a summary of trading activity for that symbol for the day");

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
            case 45 -> Optional.of(END_OF_SESSION);
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 226 -> Optional.of(FAST_STATUS_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 209 -> Optional.of(OPENING_AUCTION_UPDATE_MESSAGE);
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 223 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 222 -> Optional.of(AUCTION_LIQUIDITY_MESSAGE);
            case 210 -> Optional.of(WIDTH_UPDATE_MESSAGE);
            case 218 -> Optional.of(FUTURES_INSTRUMENT_DEFINITION_MESSAGE);
            case 219 -> Optional.of(OPTIONS_INSTRUMENT_DEFINITION_MESSAGE);
            case 220 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 44 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 185 -> Optional.of(SETTLEMENT_MESSAGE);
            case 186 -> Optional.of(END_OF_DAY_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
