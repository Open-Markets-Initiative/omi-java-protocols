package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_64.enums;

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
    OX_TIME_REFERENCE_MESSAGE((short) 177, "The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary."),

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second
     */
    OX_TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second"),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header
     */
    OX_UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header"),

    /**
     * The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block.
     */
    OX_TRANSACTION_BEGIN_MESSAGE((short) 188, "The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block."),

    /**
     * The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed.
     */
    OX_TRANSACTION_END_MESSAGE((short) 189, "The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book
     */
    OX_ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe book"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book
     */
    OX_ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book"),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan.
     */
    OX_ADD_ORDER_EXPANDED_MESSAGE((short) 47, "An Add Order message represents a newly accepted visible order on the Cboe book. Expanded version accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part
     */
    OX_ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part"),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id
     */
    OX_ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id"),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced
     */
    OX_REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced"),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced
     */
    OX_REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced"),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    OX_MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    OX_MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book
     */
    OX_DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers
     */
    OX_TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers
     */
    OX_TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers"),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Expanded version accommodates larger symbol sizes possible through the ISRA plan.
     */
    OX_TRADE_EXPANDED_MESSAGE((short) 48, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Expanded version accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * The Trade Break message is sent whenever an execution on Cboe is broken
     */
    OX_TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on Cboe is broken"),

    /**
     * The End of Session message is sent for each unit when the unit shuts down
     */
    OX_END_OF_SESSION((short) 45, "The End of Session message is sent for each unit when the unit shuts down"),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced and are sent continuously through the day at variable rates as bandwidth allows.
     */
    OX_SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * The Trading Status message is used to indicate the current trading status of a security
     */
    OX_TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a security"),

    /**
     * The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis.
     */
    OX_WIDTH_UPDATE_MESSAGE((short) 210, "The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis."),

    /**
     * Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange.
     */
    OX_OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction, including Opening and Re-Opening on the Cboe Options Exchange
     */
    OX_AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction, including Opening and Re-Opening on the Cboe Options Exchange"),

    /**
     * Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    OX_AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message.
     */
    OX_AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message."),

    /**
     * Auction Trade messages are used to disseminate executions resulting from an options auction.
     */
    OX_AUCTION_TRADE_MESSAGE((short) 175, "Auction Trade messages are used to disseminate executions resulting from an options auction."),

    /**
     * The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date.
     */
    OX_SOQ_STRIKE_RANGE_UPDATE_MESSAGE((short) 157, "The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date."),

    /**
     * The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).
     */
    OX_CONSTITUENT_SYMBOL_MAPPING_MESSAGE((short) 158, "The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).");

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
            case 177 -> Optional.of(OX_TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(OX_TIME_MESSAGE);
            case 151 -> Optional.of(OX_UNIT_CLEAR_MESSAGE);
            case 188 -> Optional.of(OX_TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(OX_TRANSACTION_END_MESSAGE);
            case 33 -> Optional.of(OX_ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(OX_ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(OX_ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(OX_ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(OX_ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(OX_REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(OX_REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(OX_MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(OX_MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(OX_DELETE_ORDER_MESSAGE);
            case 42 -> Optional.of(OX_TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(OX_TRADE_SHORT_MESSAGE);
            case 48 -> Optional.of(OX_TRADE_EXPANDED_MESSAGE);
            case 44 -> Optional.of(OX_TRADE_BREAK_MESSAGE);
            case 45 -> Optional.of(OX_END_OF_SESSION);
            case 46 -> Optional.of(OX_SYMBOL_MAPPING_MESSAGE);
            case 49 -> Optional.of(OX_TRADING_STATUS_MESSAGE);
            case 210 -> Optional.of(OX_WIDTH_UPDATE_MESSAGE);
            case 209 -> Optional.of(OX_OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(OX_AUCTION_SUMMARY_MESSAGE);
            case 173 -> Optional.of(OX_AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(OX_AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(OX_AUCTION_TRADE_MESSAGE);
            case 157 -> Optional.of(OX_SOQ_STRIKE_RANGE_UPDATE_MESSAGE);
            case 158 -> Optional.of(OX_CONSTITUENT_SYMBOL_MAPPING_MESSAGE);
            default -> Optional.empty();
        };
    }
}
