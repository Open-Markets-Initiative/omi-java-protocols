package omi.cboe.edgxoptions.multicastdepthofbook.spin.v2_41_66.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP."),

    /**
     * The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available."),

    /**
     * The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book. See Options Specific Symbol Processing for more complete details regarding Sequence specification as well as buffering requirements.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book. See Options Specific Symbol Processing for more complete details regarding Sequence specification as well as buffering requirements."),

    /**
     * The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent."),

    /**
     * The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the member's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the member's copy of the book to make it current."),

    /**
     * The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings and Complex Instrument Definitions. Refer to Options Specific Symbol Processing for more complete details regarding Sequence specification as well as buffering requirements.
     */
    INSTRUMENT_DEFINITION_REQUEST_MESSAGE((short) 132, "The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings and Complex Instrument Definitions. Refer to Options Specific Symbol Processing for more complete details regarding Sequence specification as well as buffering requirements."),

    /**
     * The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent.
     */
    INSTRUMENT_DEFINITION_RESPONSE_MESSAGE((short) 133, "The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent."),

    /**
     * The Instrument Definition Finished message is sent to indicate that all Symbol Mapping and Complex Instrument Definition messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected.
     */
    INSTRUMENT_DEFINITION_FINISHED_MESSAGE((short) 134, "The Instrument Definition Finished message is sent to indicate that all Symbol Mapping and Complex Instrument Definition messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected."),

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. The Time field is the number of seconds relative to midnight Eastern Time.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit. The Time field is the number of seconds relative to midnight Eastern Time."),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header. This message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over."),

    /**
     * The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block.
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block."),

    /**
     * The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed.
     */
    TRANSACTION_END_MESSAGE((short) 189, "The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. The Expanded variant accommodates larger symbol sizes possible through the ISRA plan and includes additional attribution fields.
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "An Add Order message represents a newly accepted visible order on the Cboe book. The Expanded variant accommodates larger symbol sizes possible through the ISRA plan and includes additional attribution fields."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution will always be at the displayed price of the resting order.
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution will always be at the displayed price of the resting order."),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Short variant is used when the canceled quantity can be represented by an unsigned 16-bit integer.
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Short variant is used when the canceled quantity can be represented by an unsigned 16-bit integer."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short variant is used when the price can be represented by a Binary Short Price and the quantity by an unsigned 16-bit integer."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Expanded variant accommodates larger symbol sizes possible through the ISRA plan.
     */
    TRADE_EXPANDED_MESSAGE((short) 48, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Expanded variant accommodates larger symbol sizes possible through the ISRA plan."),

    /**
     * The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare, but can occur in the event of an erroneous execution.
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare, but can occur in the event of an erroneous execution."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down for the trading day. This message is used as the signal that processing for the day is complete.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down for the trading day. This message is used as the signal that processing for the day is complete."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced and are sent continuously through the day at variable rates as bandwidth allows.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * The Trading Status message is used to indicate the current trading status of an options contract. A Trading Status message will be sent whenever a security's trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session. The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for GTH-eligible Products (C1 only).
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of an options contract. A Trading Status message will be sent whenever a security's trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session. The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for GTH-eligible Products (C1 only)."),

    /**
     * The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis.
     */
    WIDTH_UPDATE_MESSAGE((short) 210, "The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis."),

    /**
     * Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction, including Opening and Re-Opening on the Cboe Options Exchange.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction, including Opening and Re-Opening on the Cboe Options Exchange."),

    /**
     * C1 and EDGX Options Only. Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "C1 and EDGX Options Only. Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * C1 and EDGX Options Only. Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "C1 and EDGX Options Only. Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message."),

    /**
     * C1 and EDGX Options Only. Auction Trade messages are used to disseminate executions resulting from an options auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "C1 and EDGX Options Only. Auction Trade messages are used to disseminate executions resulting from an options auction."),

    /**
     * C1 Only. The SOQ Strike Range Update message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date.
     */
    SOQ_STRIKE_RANGE_UPDATE_MESSAGE((short) 157, "C1 Only. The SOQ Strike Range Update message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date."),

    /**
     * C1 Only. The Constituent Symbol Mapping message is used to communicate which options series are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).
     */
    CONSTITUENT_SYMBOL_MAPPING_MESSAGE((short) 158, "C1 Only. The Constituent Symbol Mapping message is used to communicate which options series are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ).");

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
            case 1 -> Optional.of(LOGIN_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 128 -> Optional.of(SPIN_IMAGE_AVAILABLE_MESSAGE);
            case 129 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 130 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SPIN_FINISHED_MESSAGE);
            case 132 -> Optional.of(INSTRUMENT_DEFINITION_REQUEST_MESSAGE);
            case 133 -> Optional.of(INSTRUMENT_DEFINITION_RESPONSE_MESSAGE);
            case 134 -> Optional.of(INSTRUMENT_DEFINITION_FINISHED_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 33 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 42 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 48 -> Optional.of(TRADE_EXPANDED_MESSAGE);
            case 44 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 210 -> Optional.of(WIDTH_UPDATE_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 157 -> Optional.of(SOQ_STRIKE_RANGE_UPDATE_MESSAGE);
            case 158 -> Optional.of(CONSTITUENT_SYMBOL_MAPPING_MESSAGE);
            default -> Optional.empty();
        };
    }
}
