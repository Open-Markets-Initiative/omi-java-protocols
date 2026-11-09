package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * A ‘seconds’ Nanoseconds is issued every second and any message thereafter will be stamped with the number of nanoseconds past the last Time message received as a time reference point
     */
    SECONDS_MESSAGE('T', "A \u2018seconds\u2019 Nanoseconds is issued every second and any message thereafter will be stamped with the number of nanoseconds past the last Time message received as a time reference point"),

    /**
     * This message will be sent as the last message for a Business Trade Date to signal no further messages will be disseminated for that date.
     */
    END_OF_BUSINESS_TRADE_DATE_MESSAGE('S', "This message will be sent as the last message for a Business Trade Date to signal no further messages will be disseminated for that date."),

    /**
     * The Future Symbol Directory message describes futures contract
     */
    FUTURE_SYMBOL_DIRECTORY_MESSAGE('f', "The Future Symbol Directory message describes futures contract"),

    /**
     * The Options Symbol Directory message describes options and warrants contracts.
     */
    OPTIONS_SYMBOL_DIRECTORY_MESSAGE('h', "The Options Symbol Directory message describes options and warrants contracts."),

    /**
     * The Combination Symbol Directory is a specialised reference data message used for defining combinations with up to 6 legs. It represents both standard combinations defined by ASX and user defined combinations created by participants
     */
    COMBINATION_SYMBOL_DIRECTORY_MESSAGE('M', "The Combination Symbol Directory is a specialised reference data message used for defining combinations with up to 6 legs. It represents both standard combinations defined by ASX and user defined combinations created by participants"),

    /**
     * The Bundles Symbol Directory is a specialised reference data message used for defining combinations with legs greater than 6, specifically Bundle products with legs of 8, 12, 16 or 20 legs
     */
    BUNDLES_SYMBOL_DIRECTORY('m', "The Bundles Symbol Directory is a specialised reference data message used for defining combinations with legs greater than 6, specifically Bundle products with legs of 8, 12, 16 or 20 legs"),

    /**
     * This message indicates the current session state of a contract to the market
     */
    ORDER_BOOK_STATE_MESSAGE('O', "This message indicates the current session state of a contract to the market"),

    /**
     * An Order Added message indicates a new order or a restated order that has been accepted by the matching engine and added to the order book
     */
    ADD_ORDER_MESSAGE('A', "An Order Added message indicates a new order or a restated order that has been accepted by the matching engine and added to the order book"),

    /**
     * An Order Volume Cancelled message is sent when an order is modified as a result of partial cancellation of volume
     */
    ORDER_VOLUME_CANCELLED_MESSAGE('X', "An Order Volume Cancelled message is sent when an order is modified as a result of partial cancellation of volume"),

    /**
     * This message is sent whenever an order in the book is cancelled by the owner, expired, cancelled by the exchange, purged or volume cancelled
     */
    ORDER_DELETED_MESSAGE('D', "This message is sent whenever an order in the book is cancelled by the owner, expired, cancelled by the exchange, purged or volume cancelled"),

    /**
     * This message is sent whenever a resting order of the book is executed in whole or in part and the counterparty to the trade is an aggressive order
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever a resting order of the book is executed in whole or in part and the counterparty to the trade is an aggressive order"),

    /**
     * This message is sent when orders are executed in the auction at the open of the market
     */
    AUCTION_ORDER_EXECUTED_MESSAGE('C', "This message is sent when orders are executed in the auction at the open of the market"),

    /**
     * This message is sent whenever a resting order is matched with an open leg of a resting combination order in whole or in part
     */
    COMBINATION_ORDER_EXECUTED_MESSAGE('e', "This message is sent whenever a resting order is matched with an open leg of a resting combination order in whole or in part"),

    /**
     * This message is a similar format to the Order Added message, except the nature of this order is it has an implied price, implied volume and a priority that is derived from two or more “real” orders deriving the implied price
     */
    IMPLIED_ORDER_ADDED_MESSAGE('j', "This message is a similar format to the Order Added message, except the nature of this order is it has an implied price, implied volume and a priority that is derived from two or more \u201Creal\u201D orders deriving the implied price"),

    /**
     * This message notifies the subscriber that an existing implied order is to be replaced when the implied price, volume or priority has changed due to a price or volume movement of “real” orders for a side of a single Tradeable Instrument Id
     */
    IMPLIED_ORDER_REPLACED_MESSAGE('l', "This message notifies the subscriber that an existing implied order is to be replaced when the implied price, volume or priority has changed due to a price or volume movement of \u201Creal\u201D orders for a side of a single Tradeable Instrument Id"),

    /**
     * This message is sent whenever the implied pricing or volume has changed due to price or volume movement of “real” orders for a side of a single contract number. When received, any implied volume is no longer accessible so the “implied” order of the indicated side must be removed from the book
     */
    IMPLIED_ORDER_DELETED_MESSAGE('k', "This message is sent whenever the implied pricing or volume has changed due to price or volume movement of \u201Creal\u201D orders for a side of a single contract number. When received, any implied volume is no longer accessible so the \u201Cimplied\u201D order of the indicated side must be removed from the book"),

    /**
     * The Trade Message is designed to provide details for executions in combination order books. Trade Executed messages are reported in the same sequence as order execution messages are reported
     */
    TRADE_EXECUTED_MESSAGE('P', "The Trade Message is designed to provide details for executions in combination order books. Trade Executed messages are reported in the same sequence as order execution messages are reported"),

    /**
     * The Combination Trade Executed Message is designed to provide details for executions where one or both orders are resting from a different order book id from the order book id of the trade
     */
    COMBINATION_TRADE_EXECUTED_MESSAGE('p', "The Combination Trade Executed Message is designed to provide details for executions where one or both orders are resting from a different order book id from the order book id of the trade"),

    /**
     * This message is sent whenever a trade is cancelled by ASX
     */
    TRADE_CANCELLATION_MESSAGE('B', "This message is sent whenever a trade is cancelled by ASX"),

    /**
     * This message is disseminated in response to changes in the equilibrium price for an order book during a pre-open period
     */
    EQUILIBRIUM_PRICE_MESSAGE('Z', "This message is disseminated in response to changes in the equilibrium price for an order book during a pre-open period"),

    /**
     * Market trade price adjustments are sent resulting from modifications of Open, High, Low, Last and volume statistics due to market operations, prior to the instrument moving to the next session within the trade date, or at the close of instrument
     */
    OPEN_HIGH_LOW_LAST_TRADE_ADJUSTMENT_MESSAGE('t', "Market trade price adjustments are sent resulting from modifications of Open, High, Low, Last and volume statistics due to market operations, prior to the instrument moving to the next session within the trade date, or at the close of instrument"),

    /**
     * This message disseminates the final settlement price of a future or option contracts order book for the trade date it pertains to
     */
    MARKET_SETTLEMENT_MESSAGE('Y', "This message disseminates the final settlement price of a future or option contracts order book for the trade date it pertains to"),

    /**
     * This message disseminates free text information describing ad-hoc market events
     */
    TEXT_MESSAGE('x', "This message disseminates free text information describing ad-hoc market events"),

    /**
     * This message is disseminated for anonymous Request for Quotes (RFQs) from the market
     */
    REQUEST_FOR_QUOTE_MESSAGE('q', "This message is disseminated for anonymous Request for Quotes (RFQs) from the market"),

    /**
     * This message disseminates price band information to the market advising the setting, zeroing or adjusting of the Extreme Trade Range price, the Anomalous Order Threshold price and the associated ranges for a contract that requires Market Integrity Rules enforcement
     */
    ANOMALOUS_ORDER_THRESHOLD_PUBLISH_MESSAGE('W', "This message disseminates price band information to the market advising the setting, zeroing or adjusting of the Extreme Trade Range price, the Anomalous Order Threshold price and the associated ranges for a contract that requires Market Integrity Rules enforcement"),

    /**
     * This message disseminates Volume and Open Interest (VOI) information for each trade date
     */
    VOLUME_AND_OPEN_INTEREST_MESSAGE('V', "This message disseminates Volume and Open Interest (VOI) information for each trade date");

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
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'S' -> Optional.of(END_OF_BUSINESS_TRADE_DATE_MESSAGE);
            case 'f' -> Optional.of(FUTURE_SYMBOL_DIRECTORY_MESSAGE);
            case 'h' -> Optional.of(OPTIONS_SYMBOL_DIRECTORY_MESSAGE);
            case 'M' -> Optional.of(COMBINATION_SYMBOL_DIRECTORY_MESSAGE);
            case 'm' -> Optional.of(BUNDLES_SYMBOL_DIRECTORY);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'X' -> Optional.of(ORDER_VOLUME_CANCELLED_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETED_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(AUCTION_ORDER_EXECUTED_MESSAGE);
            case 'e' -> Optional.of(COMBINATION_ORDER_EXECUTED_MESSAGE);
            case 'j' -> Optional.of(IMPLIED_ORDER_ADDED_MESSAGE);
            case 'l' -> Optional.of(IMPLIED_ORDER_REPLACED_MESSAGE);
            case 'k' -> Optional.of(IMPLIED_ORDER_DELETED_MESSAGE);
            case 'P' -> Optional.of(TRADE_EXECUTED_MESSAGE);
            case 'p' -> Optional.of(COMBINATION_TRADE_EXECUTED_MESSAGE);
            case 'B' -> Optional.of(TRADE_CANCELLATION_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_MESSAGE);
            case 't' -> Optional.of(OPEN_HIGH_LOW_LAST_TRADE_ADJUSTMENT_MESSAGE);
            case 'Y' -> Optional.of(MARKET_SETTLEMENT_MESSAGE);
            case 'x' -> Optional.of(TEXT_MESSAGE);
            case 'q' -> Optional.of(REQUEST_FOR_QUOTE_MESSAGE);
            case 'W' -> Optional.of(ANOMALOUS_ORDER_THRESHOLD_PUBLISH_MESSAGE);
            case 'V' -> Optional.of(VOLUME_AND_OPEN_INTEREST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
