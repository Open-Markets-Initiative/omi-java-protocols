package omi.asx.asxderivatives.t24.itch.v1_13.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The server will, on each packet multicast, transmit this message for every second for which at least one application message is generated
     */
    TIME_MESSAGE('T', "The server will, on each packet multicast, transmit this message for every second for which at least one application message is generated"),

    /**
     * The system event message is used to signal a market or trading period event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message is used to signal a market or trading period event."),

    /**
     * As each product moves to the new Trade Date, ASX Trade24 will disseminate the future symbol messages defining the available futures, CFDs and Share Future contracts for each instrument. The action of disseminating this message will automatically imply the contract is in a “Pending” session state.
     */
    FUTURE_SYMBOL_DIRECTORY_MESSAGE('f', "As each product moves to the new Trade Date, ASX Trade24 will disseminate the future symbol messages defining the available futures, CFDs and Share Future contracts for each instrument. The action of disseminating this message will automatically imply the contract is in a \u201CPending\u201D session state."),

    /**
     * As each product moves to the new Trade Date, ASX Trade24 will disseminate the spread symbol messages defining the available calendar spread and inter-spread contracts. For contracts that are inter-spreads, the underlying legs are in the same Trade Date.
     */
    SPREAD_SYMBOL_DIRECTORY_MESSAGE('g', "As each product moves to the new Trade Date, ASX Trade24 will disseminate the spread symbol messages defining the available calendar spread and inter-spread contracts. For contracts that are inter-spreads, the underlying legs are in the same Trade Date."),

    /**
     * As each product moves to the new Trade Date, ASX Trade24 will disseminate the option symbol messages defining all the available options contracts. For Single Session Options only, the exchange can activate or de-activate option symbols during the course of trading by issuing Order Book State messages for affected option contracts. If an option symbol is not active (Activated field is ‘N’) or is de-activated (Trading Status is “I”), reference to that option contract should be removed from the list of actively traded contracts. If an option symbol is active (Activated field is ‘Y’) or is activated (Trading Status is “A”), reference to that option contract should be added to the list of actively traded contracts.
     */
    OPTION_SYMBOL_DIRECTORY_MESSAGE('h', "As each product moves to the new Trade Date, ASX Trade24 will disseminate the option symbol messages defining all the available options contracts. For Single Session Options only, the exchange can activate or de-activate option symbols during the course of trading by issuing Order Book State messages for affected option contracts. If an option symbol is not active (Activated field is \u2018N\u2019) or is de-activated (Trading Status is \u201CI\u201D), reference to that option contract should be removed from the list of actively traded contracts. If an option symbol is active (Activated field is \u2018Y\u2019) or is activated (Trading Status is \u201CA\u201D), reference to that option contract should be added to the list of actively traded contracts."),

    /**
     * ASX Trade24 uses this message to indicate the current session state of a contract to the market.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "ASX Trade24 uses this message to indicate the current session state of a contract to the market."),

    /**
     * An Order Added message indicates a new order has been accepted by the ASX Trade24 system and was added to the order book. All orders in ASX Trade24 are anonymous and one “Add” type is supported for “real” orders that are not custom market orders. The message is referenced by an Order Number assigned by ASX Trade24 and is unique for the life of the order.
     */
    ORDER_ADDED_MESSAGE('A', "An Order Added message indicates a new order has been accepted by the ASX Trade24 system and was added to the order book. All orders in ASX Trade24 are anonymous and one \u201CAdd\u201D type is supported for \u201Creal\u201D orders that are not custom market orders. The message is referenced by an Order Number assigned by ASX Trade24 and is unique for the life of the order."),

    /**
     * This message is sent whenever an order in the book has been modified for price or volume where the priority changes. Even though the side and contract number cannot be changed, these fields are included in the message to provide fast look-up.
     */
    ORDER_REPLACED_MESSAGE('U', "This message is sent whenever an order in the book has been modified for price or volume where the priority changes. Even though the side and contract number cannot be changed, these fields are included in the message to provide fast look-up."),

    /**
     * This message is sent whenever an order in the book is modified as a result of a partial cancellation of volume. The difference between this message and the Order Replaced is an Order Replaced will always show a change of order book priority in regards to the order’s position in the queue. An Order Volume Cancelled message is not sent when an order has partially traded.
     */
    ORDER_VOLUME_CANCELLED_MESSAGE('X', "This message is sent whenever an order in the book is modified as a result of a partial cancellation of volume. The difference between this message and the Order Replaced is an Order Replaced will always show a change of order book priority in regards to the order\u2019s position in the queue. An Order Volume Cancelled message is not sent when an order has partially traded."),

    /**
     * This message is sent whenever an order in the book is cancelled by the owner, expired, cancelled by the exchange, purged or volume cancelled. All remaining volume is no longer accessible so the order must be removed from the book.
     */
    ORDER_DELETED_MESSAGE('D', "This message is sent whenever an order in the book is cancelled by the owner, expired, cancelled by the exchange, purged or volume cancelled. All remaining volume is no longer accessible so the order must be removed from the book."),

    /**
     * This message is the same format as the Order Added message, except the nature of this order is it has an implied price, implied volume and a priority that is derived from two or more spreadable “real” orders.
     */
    IMPLIED_ORDER_ADDED_MESSAGE('j', "This message is the same format as the Order Added message, except the nature of this order is it has an implied price, implied volume and a priority that is derived from two or more spreadable \u201Creal\u201D orders."),

    /**
     * This message is the same format as the Order Replaced message, except this replacement refers to an implied order and is sent whenever the implied pricing or volume has changed due to a price or volume movement of “real” orders for a side of a single contract number.
     */
    IMPLIED_ORDER_REPLACED_MESSAGE('l', "This message is the same format as the Order Replaced message, except this replacement refers to an implied order and is sent whenever the implied pricing or volume has changed due to a price or volume movement of \u201Creal\u201D orders for a side of a single contract number."),

    /**
     * This message is the same format as the Order Deleted message, except this deletion refers to an implied order. When received, any implied volume is no longer accessible so the “implied” order of the indicated side must be removed from the book.
     */
    IMPLIED_ORDER_DELETED_MESSAGE('k', "This message is the same format as the Order Deleted message, except this deletion refers to an implied order. When received, any implied volume is no longer accessible so the \u201Cimplied\u201D order of the indicated side must be removed from the book."),

    /**
     * Any resting Custom Market Order that trades will be reported using the Custom Market Executed or Custom Market Trade message.
     */
    CUSTOM_MARKET_ORDER_ADDED_MESSAGE('m', "Any resting Custom Market Order that trades will be reported using the Custom Market Executed or Custom Market Trade message."),

    /**
     * This message is sent whenever an order in the custom market book has been modified for volume. Custom market order modification messages always include the Order Number of the Custom Market Order Added to which the update applies. To determine the current display volume for an order, subscribers must replace the original volume stated in the Custom Market Order Added message with the quantity stated in the Custom Market Order Replaced message of the same order number.
     */
    CUSTOM_MARKET_ORDER_REPLACED_MESSAGE('n', "This message is sent whenever an order in the custom market book has been modified for volume. Custom market order modification messages always include the Order Number of the Custom Market Order Added to which the update applies. To determine the current display volume for an order, subscribers must replace the original volume stated in the Custom Market Order Added message with the quantity stated in the Custom Market Order Replaced message of the same order number."),

    /**
     * This message is sent whenever an order in the custom market book is cancelled by the owner, expired, cancelled by the exchange or purged. All remaining volume is no longer accessible so the order must be removed from the book. A Custom Market Order Deleted message is not sent when an order has traded out.
     */
    CUSTOM_MARKET_ORDER_DELETED_MESSAGE('r', "This message is sent whenever an order in the custom market book is cancelled by the owner, expired, cancelled by the exchange or purged. All remaining volume is no longer accessible so the order must be removed from the book. A Custom Market Order Deleted message is not sent when an order has traded out."),

    /**
     * This message is sent whenever a resting order of the book is executed in whole or in part where the price and contract number of the order and trade are the same. It is possible to receive several Order Executed messages for the same order reference number if that order is executed in several parts.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever a resting order of the book is executed in whole or in part where the price and contract number of the order and trade are the same. It is possible to receive several Order Executed messages for the same order reference number if that order is executed in several parts."),

    /**
     * This message is sent whenever two resting orders of the same contract are executed. This can occur in two circumstances: During levelling in whole or in part at a price that could be different from one or both resting order prices.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever two resting orders of the same contract are executed. This can occur in two circumstances: During levelling in whole or in part at a price that could be different from one or both resting order prices."),

    /**
     * This message is sent whenever the open leg of a resting spread order is traded in whole or in part where the price and the contract number will be different than the traded contract number. It is possible to receive several Spread Executed messages for the same order number if that order is executed in several parts.
     */
    SPREAD_EXECUTED_MESSAGE('e', "This message is sent whenever the open leg of a resting spread order is traded in whole or in part where the price and the contract number will be different than the traded contract number. It is possible to receive several Spread Executed messages for the same order number if that order is executed in several parts."),

    /**
     * This message is sent whenever two resting orders of different contracts are executed in whole or in part at a price different from the initial display price(s) such as sweeping or spreading orders. Since the execution price is different than the display price of the original Add Order, a trade price field is included within the execution message.
     */
    TRADE_SPREAD_EXECUTION_CHAIN_MESSAGE('P', "This message is sent whenever two resting orders of different contracts are executed in whole or in part at a price different from the initial display price(s) such as sweeping or spreading orders. Since the execution price is different than the display price of the original Add Order, a trade price field is included within the execution message."),

    /**
     * This message is sent whenever the open leg of a resting custom market order is traded in whole or in part.
     */
    CUSTOM_MARKET_EXECUTED_MESSAGE('u', "This message is sent whenever the open leg of a resting custom market order is traded in whole or in part."),

    /**
     * This message is sent whenever a resting custom market order is matched with a resting non-custom market order executed in whole or in part at a price that could be different from the initial display price(s) such as spreading orders. Since the execution price could be different than the display price of the original Order Added, a trade price field is included within the execution message.
     */
    CUSTOM_MARKET_TRADE_MESSAGE('p', "This message is sent whenever a resting custom market order is matched with a resting non-custom market order executed in whole or in part at a price that could be different from the initial display price(s) such as spreading orders. Since the execution price could be different than the display price of the original Order Added, a trade price field is included within the execution message."),

    /**
     * This message is sent whenever a trade is cancelled by exchange operations. This message does not affect any resting orders and is more for Information purposes. Adjustments to the Open, High, Low, Last will be performed as separate action using the Open, High, Low, Last Trade Adjustment message.
     */
    TRADE_CANCELLATION_MESSAGE('B', "This message is sent whenever a trade is cancelled by exchange operations. This message does not affect any resting orders and is more for Information purposes. Adjustments to the Open, High, Low, Last will be performed as separate action using the Open, High, Low, Last Trade Adjustment message."),

    /**
     * ASX Trade24 disseminates equilibrium prices during a price discovery period. As orders are added, modified, cancelled or deleted a message will be reported informing the market the potential opening price.
     */
    EQUILIBRIUM_PRICE_AUCTION_INFO_MESSAGE('Z', "ASX Trade24 disseminates equilibrium prices during a price discovery period. As orders are added, modified, cancelled or deleted a message will be reported informing the market the potential opening price."),

    /**
     * ASX Trade24 disseminates market trade price adjustments where the exchange operator modifies the open, high, low, last, last volume, total traded volume or total number of trades (usually due to a trade cancellation) or the product resets the open, high, low, last, last volume when it moves to the next session within the trade date. Each price is re-distributed with the Market Updates bitwise flags indicating which fields have been adjusted. This message is also issued during a snapshot download to enable the requestor to generate an up-to-date market image without having to regenerate from previous trades and market trade adjustment messages.
     */
    OPEN_HIGH_LOW_LAST_TRADE_ADJUSTMENT_MESSAGE('t', "ASX Trade24 disseminates market trade price adjustments where the exchange operator modifies the open, high, low, last, last volume, total traded volume or total number of trades (usually due to a trade cancellation) or the product resets the open, high, low, last, last volume when it moves to the next session within the trade date. Each price is re-distributed with the Market Updates bitwise flags indicating which fields have been adjusted. This message is also issued during a snapshot download to enable the requestor to generate an up-to-date market image without having to regenerate from previous trades and market trade adjustment messages."),

    /**
     * ASX Trade24 disseminates settlement prices for all future and option contracts in two instalments, an interim and then a final. When the contract moves to the next trade date, the Future Symbol Directory or Option Symbol Directory message will reflect the final settlement price reported from the previous trade date in the prior day settlement field.
     */
    MARKET_SETTLEMENT_MESSAGE('Y', "ASX Trade24 disseminates settlement prices for all future and option contracts in two instalments, an interim and then a final. When the contract moves to the next trade date, the Future Symbol Directory or Option Symbol Directory message will reflect the final settlement price reported from the previous trade date in the prior day settlement field."),

    /**
     * ASX Trade24 disseminates text messages to inform the market of ad hoc events.
     */
    AD_HOC_TEXT_MESSAGE('x', "ASX Trade24 disseminates text messages to inform the market of ad hoc events."),

    /**
     * ASX Trade24 disseminates anonymous non-custom RFQs from the market.
     */
    REQUEST_FOR_QUOTE_MESSAGE('q', "ASX Trade24 disseminates anonymous non-custom RFQs from the market."),

    /**
     * ASX Trade24 reports this message to inform the market of setting, zeroing or adjusting the Extreme Trade Range price (ETR), the Anomalous Order Threshold price (AOT) and the associated ranges for a contract that requires Market Integrity Rules enforcement.
     */
    ANOMALOUS_ORDER_THRESHOLD_PUBLISH_MESSAGE('W', "ASX Trade24 reports this message to inform the market of setting, zeroing or adjusting the Extreme Trade Range price (ETR), the Anomalous Order Threshold price (AOT) and the associated ranges for a contract that requires Market Integrity Rules enforcement."),

    /**
     * ASX Trade24 disseminates volume and open interest information for each trade date. The VOI Trade Date indicates the trade date to which the information applies.
     */
    VOLUME_AND_OPEN_INTEREST_MESSAGE('V', "ASX Trade24 disseminates volume and open interest information for each trade date. The VOI Trade Date indicates the trade date to which the information applies.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TIME_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'f' -> Optional.of(FUTURE_SYMBOL_DIRECTORY_MESSAGE);
            case 'g' -> Optional.of(SPREAD_SYMBOL_DIRECTORY_MESSAGE);
            case 'h' -> Optional.of(OPTION_SYMBOL_DIRECTORY_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ORDER_ADDED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 'X' -> Optional.of(ORDER_VOLUME_CANCELLED_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETED_MESSAGE);
            case 'j' -> Optional.of(IMPLIED_ORDER_ADDED_MESSAGE);
            case 'l' -> Optional.of(IMPLIED_ORDER_REPLACED_MESSAGE);
            case 'k' -> Optional.of(IMPLIED_ORDER_DELETED_MESSAGE);
            case 'm' -> Optional.of(CUSTOM_MARKET_ORDER_ADDED_MESSAGE);
            case 'n' -> Optional.of(CUSTOM_MARKET_ORDER_REPLACED_MESSAGE);
            case 'r' -> Optional.of(CUSTOM_MARKET_ORDER_DELETED_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'e' -> Optional.of(SPREAD_EXECUTED_MESSAGE);
            case 'P' -> Optional.of(TRADE_SPREAD_EXECUTION_CHAIN_MESSAGE);
            case 'u' -> Optional.of(CUSTOM_MARKET_EXECUTED_MESSAGE);
            case 'p' -> Optional.of(CUSTOM_MARKET_TRADE_MESSAGE);
            case 'B' -> Optional.of(TRADE_CANCELLATION_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_AUCTION_INFO_MESSAGE);
            case 't' -> Optional.of(OPEN_HIGH_LOW_LAST_TRADE_ADJUSTMENT_MESSAGE);
            case 'Y' -> Optional.of(MARKET_SETTLEMENT_MESSAGE);
            case 'x' -> Optional.of(AD_HOC_TEXT_MESSAGE);
            case 'q' -> Optional.of(REQUEST_FOR_QUOTE_MESSAGE);
            case 'W' -> Optional.of(ANOMALOUS_ORDER_THRESHOLD_PUBLISH_MESSAGE);
            case 'V' -> Optional.of(VOLUME_AND_OPEN_INTEREST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
