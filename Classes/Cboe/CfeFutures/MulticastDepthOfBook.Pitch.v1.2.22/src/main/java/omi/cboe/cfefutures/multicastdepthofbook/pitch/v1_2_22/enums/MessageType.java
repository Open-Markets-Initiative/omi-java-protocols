package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_2_22.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary.
     */
    TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary."),

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second."),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the CFE book in the unit specified in the Sequenced Unit Header message header.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the CFE book in the unit specified in the Sequenced Unit Header message header."),

    /**
     * The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or an the instrument is created or modified during a trading day.
     */
    FUTURES_INSTRUMENT_DEFINITION_MESSAGE((short) 187, "The Futures Instrument Definition message can be sent as a sequenced message or an un-sequenced message. It is sent as a sequenced message when the system starts up at the beginning of a trading session or an the instrument is created or modified during a trading day."),

    /**
     * The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&amp;P 500 Variance Futures (VA Futures) symbols.
     */
    FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE((short) 250, "The Futures Variance Symbol Mapping message is used to disseminate symbol reference data for S&P 500 Variance Futures (VA Futures) symbols."),

    /**
     * The Price Limits message is sent out at the start of a session for products subject to price limits per the contract specifications.
     */
    PRICE_LIMITS_MESSAGE((short) 190, "The Price Limits message is sent out at the start of a session for products subject to price limits per the contract specifications."),

    /**
     * An Add Order message represents a newly accepted visible order on the CFE book.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the CFE book."),

    /**
     * An Add Order message represents a newly accepted visible order on the CFE book.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the CFE book."),

    /**
     * Order Executed messages are sent when an order on the CFE book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when an order on the CFE book is executed in whole or in part."),

    /**
     * Reduce Size messages are sent when a visible order on the CFE book is partially reduced.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the CFE book is partially reduced."),

    /**
     * Reduce Size messages are sent when a visible order on the CFE book is partially reduced.
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the CFE book is partially reduced."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book."),

    /**
     * The Trade message provides information about executions that occur off of the CFE book (such as ECRP/Block trades). Trade messages are necessary to calculate CFE execution data.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions that occur off of the CFE book (such as ECRP/Block trades). Trade messages are necessary to calculate CFE execution data."),

    /**
     * The Trade message provides information about executions that occur off of the CFE book (such as ECRP/Block trades). Trade messages are necessary to calculate CFE execution data.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions that occur off of the CFE book (such as ECRP/Block trades). Trade messages are necessary to calculate CFE execution data."),

    /**
     * The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block.
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block."),

    /**
     * The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed.
     */
    TRANSACTION_END_MESSAGE((short) 189, "The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed."),

    /**
     * The Trade Break message is sent whenever an execution on CFE is broken.
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on CFE is broken."),

    /**
     * Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products.
     */
    SETTLEMENT_MESSAGE((short) 185, "Settlement messages are used to provide information concerning indicative, approved, or corrected daily and final settlement prices for CFE products."),

    /**
     * The Open Interest message is sent to communicate a symbol's open interest, usually for the prior trading date.
     */
    OPEN_INTEREST_MESSAGE((short) 211, "The Open Interest message is sent to communicate a symbol's open interest, usually for the prior trading date."),

    /**
     * The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol.
     */
    END_OF_DAY_SUMMARY_MESSAGE((short) 186, "The End of Day Summary message is sent immediately after trading ends for a symbol. No more Market Update messages will follow an End of Day Summary message for a particular symbol."),

    /**
     * The Trading Status message is used to indicate the current trading status of a Futures contract.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a Futures contract."),

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
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 187 -> Optional.of(FUTURES_INSTRUMENT_DEFINITION_MESSAGE);
            case 250 -> Optional.of(FUTURES_VARIANCE_SYMBOL_MAPPING_MESSAGE);
            case 190 -> Optional.of(PRICE_LIMITS_MESSAGE);
            case 33 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 35 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 37 -> Optional.of(REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 42 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 44 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 185 -> Optional.of(SETTLEMENT_MESSAGE);
            case 211 -> Optional.of(OPEN_INTEREST_MESSAGE);
            case 186 -> Optional.of(END_OF_DAY_SUMMARY_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
