package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_66.enums;

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
     * An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order. The Long form is used when the price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    ADD_ORDER_LONG_MESSAGE((short) 33, "An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order. The Long form is used when the price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order. The Short form is used whenever possible.
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "An Add Order message represents a newly accepted visible order on the Cboe book. It includes a day-specific Order Id assigned by Cboe to the order. The Short form is used whenever possible."),

    /**
     * The Expanded version of the Add Order message has been made available to accommodate larger symbol sizes possible through the ISRA plan.
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "The Expanded version of the Add Order message has been made available to accommodate larger symbol sizes possible through the ISRA plan."),

    /**
     * Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed messages are sent when a visible order on the Cboe book is executed in whole or in part. The execution price equals the limit order price found in the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the order should be completely removed from the book.
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size messages are sent when a visible order on the Cboe book is executed in whole or in part at a different price than the limit price on the original Add Order message or the limit order price in the latest Modify Order message referencing the Order Id. If the Remaining Quantity field contains a 0 the order should be completely removed from the book."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Long form is used when the Canceled Quantity cannot be represented by an unsigned 16-bit integer.
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Long form is used when the Canceled Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Short form is used whenever possible.
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size messages are sent when a visible order on the Cboe book is partially reduced. The Short form is used whenever possible."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be "No Ops" (i.e. they do not appear to modify any relevant fields) will still lose priority. The Long form is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. Note that Modify Order messages that appear to be \"No Ops\" (i.e. they do not appear to modify any relevant fields) will still lose priority. The Long form is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. The Short form is used whenever possible.
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "The Modify Order message is sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message. The Short form is used whenever possible."),

    /**
     * The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 41, "The Delete Order message is sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message. An order that is deleted from the book may return to the book later under certain circumstances. Therefore, a Delete Order message does not indicate that a given Order Id will not be sent again on a subsequent Add Order message."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book. No Add Order message is sent for hidden orders, and thus, no modify order messages may be sent when hidden orders are executed. The Long form is used when the price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.
     */
    TRADE_LONG_MESSAGE((short) 42, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. Trade messages are necessary to calculate Cboe execution-based data. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book. No Add Order message is sent for hidden orders, and thus, no modify order messages may be sent when hidden orders are executed. The Long form is used when the price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer."),

    /**
     * The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short form is used whenever possible.
     */
    TRADE_SHORT_MESSAGE((short) 43, "The Trade message provides information about executions of non-displayed orders on the Cboe book and routed executions to other trading centers. The Short form is used whenever possible."),

    /**
     * The Expanded version of the Trade message has been made available to accommodate larger symbol sizes possible through the ISRA plan.
     */
    TRADE_EXPANDED_MESSAGE((short) 48, "The Expanded version of the Trade message has been made available to accommodate larger symbol sizes possible through the ISRA plan."),

    /**
     * The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution-based data. Applications that simply build a Cboe book can ignore Trade Break messages.
     */
    TRADE_BREAK_MESSAGE((short) 44, "The Trade Break message is sent whenever an execution on Cboe is broken. Trade breaks are rare and only affect applications that rely upon Cboe execution-based data. Applications that simply build a Cboe book can ignore Trade Break messages."),

    /**
     * The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "The End of Session message is sent for each unit when the unit shuts down. No more sequenced messages will be delivered for this unit, but heartbeats from the unit may be received."),

    /**
     * The Trading Status message is used to indicate the current trading status of a security. A Trading Status message will be sent whenever a security's trading status changes. Trading Status of S is to be implied at system startup for all symbols. Starting at 6:00 a.m. ET, Cboe will send a Trading Status of A once orders can be accepted for queuing in preparation for the market open. At 7:00 a.m. ET, Cboe will send a Trading Status of T as symbols are open for trading on the Cboe platform. On BZX and EDGX only, Cboe will send a Trading Status of A starting at 2:30 a.m. ET and a Trading Status of T at 4:00 a.m. ET.
     */
    TRADING_STATUS_MESSAGE((short) 49, "The Trading Status message is used to indicate the current trading status of a security. A Trading Status message will be sent whenever a security's trading status changes. Trading Status of S is to be implied at system startup for all symbols. Starting at 6:00 a.m. ET, Cboe will send a Trading Status of A once orders can be accepted for queuing in preparation for the market open. At 7:00 a.m. ET, Cboe will send a Trading Status of T as symbols are open for trading on the Cboe platform. On BZX and EDGX only, Cboe will send a Trading Status of A starting at 2:30 a.m. ET and a Trading Status of T at 4:00 a.m. ET."),

    /**
     * BYX and BZX Equities Only. Auction Update messages are used to disseminate Cboe price and size information during auctions for Cboe listed securities and for Cboe Market Close (CMC) crosses on BZX, and for Periodic Auctions on BYX. Cboe Auction Update messages support the Cboe Opening, Closing, Halt and IPO Auctions on the BZX Exchange. On the BYX Exchange, Auction Update messages will be sent out at a randomized time between the start of an auction period and the end of the auction period minus 1 millisecond to inform participants that a Periodic Auction is taking place.
     */
    AUCTION_UPDATE_MESSAGE((short) 149, "BYX and BZX Equities Only. Auction Update messages are used to disseminate Cboe price and size information during auctions for Cboe listed securities and for Cboe Market Close (CMC) crosses on BZX, and for Periodic Auctions on BYX. Cboe Auction Update messages support the Cboe Opening, Closing, Halt and IPO Auctions on the BZX Exchange. On the BYX Exchange, Auction Update messages will be sent out at a randomized time between the start of an auction period and the end of the auction period minus 1 millisecond to inform participants that a Periodic Auction is taking place."),

    /**
     * BYX Equities, BZX Equities, and Options Only. Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, the results of an Opening or Re-Opening of any options series on C1, and for Periodic Auctions on BYX. An Auction Summary message will be sent for Cboe Market Close (CMC) once the official closing price for each security is available.
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "BYX Equities, BZX Equities, and Options Only. Auction Summary messages are used to disseminate the results of an auction of a Cboe listed security on BZX, the results of an Opening or Re-Opening of any options series on C1, and for Periodic Auctions on BYX. An Auction Summary message will be sent for Cboe Market Close (CMC) once the official closing price for each security is available."),

    /**
     * BYX and (effective 04/10/26) EDGX Only. The Retail Price Improvement message is only available on the BYX and EDGX Exchanges. This message is a Retail Liquidity Indicator (RLI) that includes symbol and side, but not price and size. An RLI will be disseminated when there is a Retail Price Improving (RPI) order present for a symbol on the Exchange order book OR to indicate a RPI order is no longer available. RPI orders offer price improvement in increments of $.001 to Retail Member Organizations. Cboe will disseminate a Retail Price Improvement message when the resting RPI order is priced better than the NBBO.
     */
    RETAIL_PRICE_IMPROVEMENT_MESSAGE((short) 152, "BYX and (effective 04/10/26) EDGX Only. The Retail Price Improvement message is only available on the BYX and EDGX Exchanges. This message is a Retail Liquidity Indicator (RLI) that includes symbol and side, but not price and size. An RLI will be disseminated when there is a Retail Price Improving (RPI) order present for a symbol on the Exchange order book OR to indicate a RPI order is no longer available. RPI orders offer price improvement in increments of $.001 to Retail Member Organizations. Cboe will disseminate a Retail Price Improvement message when the resting RPI order is priced better than the NBBO.");

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
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 149 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            case 152 -> Optional.of(RETAIL_PRICE_IMPROVEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
