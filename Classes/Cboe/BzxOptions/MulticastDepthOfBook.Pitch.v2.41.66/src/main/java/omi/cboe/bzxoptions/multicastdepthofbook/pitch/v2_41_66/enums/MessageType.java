package omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_66.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. The Time field is the number of seconds relative to midnight Eastern Time. All subsequent time offset fields for the same unit will use the new Time message value as the base until another Time message is received for the same unit.
     */
    TIME_MESSAGE((short) 32, "A Time message is immediately generated and sent when there is a PITCH event for a given clock second. If there is no PITCH event for a given clock second, then no Time message is sent for that second. The Time field is the number of seconds relative to midnight Eastern Time. All subsequent time offset fields for the same unit will use the new Time message value as the base until another Time message is received for the same unit."),

    /**
     * The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header message. For Equities only, this message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "The Unit Clear message instructs feed recipients to clear all orders for the Cboe book in the unit specified in the Sequenced Unit Header message. For Equities only, this message will be sent at startup each day. It would also be distributed in certain recovery events such as a data center fail-over."),

    /**
     * Options Only. The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block. All PITCH messages corresponding to such an event would be included between a Transaction Begin message and Transaction End message. It is important to note that transaction blocks are currently used in US Options for symbol state transitions only, but may be expanded to other use cases with notice. Transaction Begin messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "Options Only. The Transaction Begin message indicates any subsequent messages, up to the accompanying Transaction End message, are all part of the same transaction block. All PITCH messages corresponding to such an event would be included between a Transaction Begin message and Transaction End message. It is important to note that transaction blocks are currently used in US Options for symbol state transitions only, but may be expanded to other use cases with notice. Transaction Begin messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * Options Only. The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed. Transaction End messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRANSACTION_END_MESSAGE((short) 189, "Options Only. The Transaction End message indicates that a transaction indicated by a previous Transaction Begin message has completed. Transaction End messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order."),

    /**
     * The expanded version of the Add Order message has been made available to accommodate larger symbol sizes possible through the ISRA plan.
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "The expanded version of the Add Order message has been made available to accommodate larger symbol sizes possible through the ISRA plan."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the order should be completely removed from the book. Order Executed at Price/Size messages may also be sent in cases where the Executed Quantity is greater than the current booked size for Order Id due to Exchange features that allow a portion of an order to be hidden while another portion is displayed.
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the order should be completely removed from the book. Order Executed at Price/Size messages may also be sent in cases where the Executed Quantity is greater than the current booked size for Order Id due to Exchange features that allow a portion of an order to be hidden while another portion is displayed."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced.
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be "No Ops" (i.e. they do not appear to modify any relevant fields) will still lose priority.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be \"No Ops\" (i.e. they do not appear to modify any relevant fields) will still lose priority."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. In options a Trade message can also be sent when an auction executes against a non-displayed order, such as a contra response. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book. The Order ID of a hidden order is obfuscated by default in the Trade message, but may be optionally disseminated for a member's own orders upon request.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. In options a Trade message can also be sent when an auction executes against a non-displayed order, such as a contra response. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book. The Order ID of a hidden order is obfuscated by default in the Trade message, but may be optionally disseminated for a member's own orders upon request."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short variant uses a Binary Short Price and 2-byte Quantity.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short variant uses a Binary Short Price and 2-byte Quantity."),

    /**
     * The expanded version of the Trade message has been made available to accommodate larger symbol sizes possible through the ISRA plan.
     */
    TRADE_EXPANDED_MESSAGE((short) 48, "The expanded version of the Trade message has been made available to accommodate larger symbol sizes possible through the ISRA plan."),

    /**
     * The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution-based data. Applications that simply build a Cboe book can ignore Trade Break messages.
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution-based data. Applications that simply build a Cboe book can ignore Trade Break messages."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received."),

    /**
     * Options Only. A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows. Members who consume the 5 Gig or 8 Gig-Shaped Multicast PITCH feeds will be able to receive the full list of symbols in approximately 5 minutes.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "Options Only. A Symbol Mapping message is used to map the 6 character multicast feed symbol field to an OSI symbol and Underlying. These messages are not sequenced (sequence = 0) and are sent continuously through the day at variable rates as bandwidth allows. Members who consume the 5 Gig or 8 Gig-Shaped Multicast PITCH feeds will be able to receive the full list of symbols in approximately 5 minutes."),

    /**
     * The Trading Status message is used to indicate the current trading status of a security. A Trading Status message will be sent whenever a security's trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session. The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for GTH-eligible Products (C1 Options Only).
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a security. A Trading Status message will be sent whenever a security's trading status changes. The Trading Status field will be used to represent the status of the RTH (9:30 a.m. ET - 4:15 p.m. ET) and Curb sessions. The GTH Trading Status field will be used to represent the status of series that trade during the GTH session. The GTH session runs from 8:15 p.m. to 9:25 a.m. ET for GTH-eligible Products (C1 Options Only)."),

    /**
     * Options Only. The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis. For complete details on the opening collars see the US Options Opening Process Specification.
     */
    WIDTH_UPDATE_MESSAGE((short) 210, "Options Only. The Width Update message is used to communicate opening quote width multiplier. This message will be sent in the event that the exchange decides to change the quote width multiplier on a per underlying basis. For complete details on the opening collars see the US Options Opening Process Specification."),

    /**
     * Options Only. Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange. Options Auction Update messages are sent every five seconds during an opening period provided that one of the field values has changed. When no values have changed, a message is sent once every 60 seconds. Refer to the Cboe Options Opening Process specification for more information.
     */
    OPTIONS_AUCTION_UPDATE_MESSAGE((short) 209, "Options Only. Options Auction Update messages are used to disseminate price and size information and Composite Market bid and offer prices during Opening and Re-Opening (halt) auctions on the Cboe Options Exchange. Options Auction Update messages are sent every five seconds during an opening period provided that one of the field values has changed. When no values have changed, a message is sent once every 60 seconds. Refer to the Cboe Options Opening Process specification for more information."),

    /**
     * Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, the results of an Opening or Re-Opening of any options series on C1, and for Periodic Auctions on BYX. Auction Summary messages are also used in support of Opening and Re-Openings on the Cboe Options Exchange, including those for both GTH and RTH sessions. These messages indicate the price and size executed in such an Opening or Re-Opening.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, the results of an Opening or Re-Opening of any options series on C1, and for Periodic Auctions on BYX. Auction Summary messages are also used in support of Opening and Re-Openings on the Cboe Options Exchange, including those for both GTH and RTH sessions. These messages indicate the price and size executed in such an Opening or Re-Opening."),

    /**
     * C1 and EDGX Options Only. Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period.
     */
    AUCTION_NOTIFICATION_MESSAGE((short) 173, "C1 and EDGX Options Only. Auction Notification messages are used to disseminate order details of an auction. Auctions will be available for a defined period of time known as the exposure period."),

    /**
     * C1 and EDGX Options Only. Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message as a result of a user cancelation of the original order, a user modification request to change the price or increase the original order quantity, a fading of the NBBO or to cancel any remaining order quantity from the original Auction Notification messages following the auction termination. A user request to modify the order price or to increase the original order quantity will result in a cancelation of the auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for order quantity decrements.
     */
    AUCTION_CANCEL_MESSAGE((short) 174, "C1 and EDGX Options Only. Auction Cancel messages are used to disseminate the cancelation of an earlier Auction Notification message as a result of a user cancelation of the original order, a user modification request to change the price or increase the original order quantity, a fading of the NBBO or to cancel any remaining order quantity from the original Auction Notification messages following the auction termination. A user request to modify the order price or to increase the original order quantity will result in a cancelation of the auction followed by a new Auction Notification message. Auction Cancel messages will not be issued for order quantity decrements."),

    /**
     * C1 and EDGX Options Only. Auction Trade messages are used to disseminate executions resulting from an options auction.
     */
    AUCTION_TRADE_MESSAGE((short) 175, "C1 and EDGX Options Only. Auction Trade messages are used to disseminate executions resulting from an options auction."),

    /**
     * C1 Only. The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date. In the event that multiple distinct SOQ calculations occur on the same day, the applicable SOQ is differentiated by the SOQ Identifier field, which is set to the CSMi symbol on which the final settlement SOQ value is disseminated.
     */
    SOQ_STRIKE_RANGE_UPDATE_MESSAGE((short) 157, "C1 Only. The SOQ Strike Range Update message is only available on the C1 Exchange. This message disseminates the minimum and maximum strike prices of the strike price range used to calculate the Special Opening Quote (SOQ) on a Volatility Settlement date. In the event that multiple distinct SOQ calculations occur on the same day, the applicable SOQ is differentiated by the SOQ Identifier field, which is set to the CSMi symbol on which the final settlement SOQ value is disseminated."),

    /**
     * C1 Only. The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series (if any) are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ). The message is identical to the Symbol Mapping message with the addition of the SOQ Identifier field, which is set to the CSMi symbol on which the final settlement SOQ value is disseminated. The Constituent Symbol Mapping message is sent as an unsequenced message with one message sent for each Constituent Series in a continuous loop as bandwidth allows.
     */
    CONSTITUENT_SYMBOL_MAPPING_MESSAGE((short) 158, "C1 Only. The Constituent Symbol Mapping message is only available on the C1 Exchange. This message is used to communicate which options series (if any) are Constituent Series in a Volatility Settlement Special Opening Quote (SOQ). The message is identical to the Symbol Mapping message with the addition of the SOQ Identifier field, which is set to the CSMi symbol on which the final settlement SOQ value is disseminated. The Constituent Symbol Mapping message is sent as an unsequenced message with one message sent for each Constituent Series in a continuous loop as bandwidth allows.");

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
