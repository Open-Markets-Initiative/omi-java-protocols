package omi.cboe.edgxoptions.complex.pitch.v2_1_61.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. All subsequent time offset fields for the same unit will use the new Time value as the base until another Time message is received for the same unit."),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe complex book in the unit specified in the Sequenced Unit Header. For Equities only, this message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe complex book in the unit specified in the Sequenced Unit Header. For Equities only, this message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over."),

    /**
     * The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block. All PITCH messages corresponding to such an event would be included between a Transaction Begin and Transaction End. Any PITCH Message Type may be included in a transaction block and there is no guarantee that the messages apply to the same price level or even the same Symbol. Transaction Begin messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block. All PITCH messages corresponding to such an event would be included between a Transaction Begin and Transaction End. Any PITCH Message Type may be included in a transaction block and there is no guarantee that the messages apply to the same price level or even the same Symbol. Transaction Begin messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed. Transaction End messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRANSACTION_END_MESSAGE((short) 189, "The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed. Transaction End messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message the first time a Complex Instrument Definition Expanded message is sent for a symbol. These messages will also be sent continuously through the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on an unsequenced Complex Instrument Definition Expanded message. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions, one of which may be an equity leg.
     */
    COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE((short) 154, "A Complex Instrument Definition Expanded message represents a complex instrument that is available to place orders. It is sent as a sequenced message the first time a Complex Instrument Definition Expanded message is sent for a symbol. These messages will also be sent continuously through the day as an unsequenced message (sequence = 0) at variable rates as bandwidth allows. The Time offset field should be ignored on an unsequenced Complex Instrument Definition Expanded message. The Complex Instrument Definition Expanded message will contain two or more repeating groups of leg definitions. There is a limit of 16 leg definitions, one of which may be an equity leg."),

    /**
     * A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe complex book. It includes a day-specific Order Id assigned by Cboe to the complex order.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe complex book. It includes a day-specific Order Id assigned by Cboe to the complex order."),

    /**
     * An Add Order Short message represents a newly accepted visible order on the Cboe complex book whose Price fits in a Binary Signed Short Price and Quantity fits in an unsigned 16-bit integer.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order Short message represents a newly accepted visible order on the Cboe complex book whose Price fits in a Binary Signed Short Price and Quantity fits in an unsigned 16-bit integer."),

    /**
     * An Add Order Expanded message represents a newly accepted visible order on the Cboe complex book and carries additional attribution fields (Participant ID, Customer Indicator, Client ID).
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "An Add Order Expanded message represents a newly accepted visible order on the Cboe complex book and carries additional attribution fields (Participant ID, Customer Indicator, Client ID)."),

    /**
     * Order Executed messages are sent when a visible complex order on the Cboe complex book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible complex order on the Cboe complex book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Order Execution at Price/Size messages are sent when a complex order on the Cboe complex book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the complex order should be completely removed from the complex book. Order Execution at Price/Size messages may also be sent in the event the existing size for Order Id is not equal to Executed Quantity + Remaining Quantity. In this case the complex order should be prioritized the same as a new complex order.
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Execution at Price/Size messages are sent when a complex order on the Cboe complex book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the complex order should be completely removed from the complex book. Order Execution at Price/Size messages may also be sent in the event the existing size for Order Id is not equal to Executed Quantity + Remaining Quantity. In this case the complex order should be prioritized the same as a new complex order."),

    /**
     * Reduce Size messages are sent when a complex order on the Cboe complex book is partially reduced.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a complex order on the Cboe complex book is partially reduced."),

    /**
     * Reduce Size Short messages are sent when a complex order on the Cboe complex book is partially reduced and the canceled quantity fits in an unsigned 16-bit integer.
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size Short messages are sent when a complex order on the Cboe complex book is partially reduced and the canceled quantity fits in an unsigned 16-bit integer."),

    /**
     * The Modify Order message is sent whenever an open complex order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be "no ops" (i.e. they do not appear to modify any relevant fields) will still lose priority.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open complex order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be \"no ops\" (i.e. they do not appear to modify any relevant fields) will still lose priority."),

    /**
     * The Modify Order Short message is sent whenever an open complex order is visibly modified and both the new price and quantity fit in short fields.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order Short message is sent whenever an open complex order is visibly modified and both the new price and quantity fit in short fields."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message."),

    /**
     * The Trade message provides information about executions of complex order auctions on the Cboe complex book. A Trade message can also be sent when an auction executes against a non-displayed order, such as a contra response. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the complex book and can be ignored if messages are being used solely to build a complex book. No Add Order message is sent for complex auction orders, and thus, no order modification messages may be sent when complex auctions are executed. Instead, a Trade message is sent whenever a complex auction is executed in whole or in part.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of complex order auctions on the Cboe complex book. A Trade message can also be sent when an auction executes against a non-displayed order, such as a contra response. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the complex book and can be ignored if messages are being used solely to build a complex book. No Add Order message is sent for complex auction orders, and thus, no order modification messages may be sent when complex auctions are executed. Instead, a Trade message is sent whenever a complex auction is executed in whole or in part."),

    /**
     * The Trade Short message is the short-price/short-quantity variant of the Trade message, used when both the execution price and quantity fit in short fields.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade Short message is the short-price/short-quantity variant of the Trade message, used when both the execution price and quantity fit in short fields."),

    /**
     * Auction Notification messages are used to disseminate order details of a complex auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "Auction Notification messages are used to disseminate order details of a complex auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message as a result of a user cancelation of the original complex auction, a user modification request to change the complex auction price or increase the original complex auction quantity, a fading of the NBBO or to cancel any remaining complex auction quantity from the original Auction Notification following the complex auction termination. A user request to modify the complex auction price or to increase the original complex auction quantity will result in a cancelation of the complex auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for complex auction quantity decrements.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message as a result of a user cancelation of the original complex auction, a user modification request to change the complex auction price or increase the original complex auction quantity, a fading of the NBBO or to cancel any remaining complex auction quantity from the original Auction Notification following the complex auction termination. A user request to modify the complex auction price or to increase the original complex auction quantity will result in a cancelation of the complex auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for complex auction quantity decrements."),

    /**
     * Auction Trade messages are used to disseminate executions resulting from a complex auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "Auction Trade messages are used to disseminate executions resulting from a complex auction."),

    /**
     * The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session (C1 Only). The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for SPX and VIX series (C1 only).
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a complex instrument. A Trading Status message will be sent whenever a complex instrument trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session (C1 Only). The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for SPX and VIX series (C1 only)."),

    /**
     * Options Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) process for complex instruments. The Options Auction Update messages are sent every 5 seconds during an opening period.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Auction Update messages are used to disseminate price and size information during the Opening and Re-Opening (halt) process for complex instruments. The Options Auction Update messages are sent every 5 seconds during an opening period."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of its Opening or Re-Opening auction and represents Cboe opening price.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction of a complex instrument. An Opening or Re-Opening Auction Summary message for each complex instrument is sent at the conclusion of its Opening or Re-Opening auction and represents Cboe opening price."),

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
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 154 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_EXPANDED_MESSAGE);
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
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
            case 173 -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 174 -> Optional.of(AUCTION_CANCEL_MESSAGE);
            case 175 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 209 -> Optional.of(OPTIONS_AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
