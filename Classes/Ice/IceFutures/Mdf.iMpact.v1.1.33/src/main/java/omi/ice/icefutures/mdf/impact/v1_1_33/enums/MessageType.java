package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The market snapshot message is the same for full order depth and price level snapshot channel.
     */
    MARKET_SNAPSHOT_MESSAGE('C', "The market snapshot message is the same for full order depth and price level snapshot channel."),

    /**
     * A trade with IsSystemPricedLeg equal to ‘Y’ should not be used for the last price, High, Low and Open. Also please refer to Appendix B on how to handle market stats for given OffTradeMarketType. This message will not be sent for trades in Endex Spot markets.
     */
    TRADE_MESSAGE('G', "A trade with IsSystemPricedLeg equal to \u2018Y\u2019 should not be used for the last price, High, Low and Open. Also please refer to Appendix B on how to handle market stats for given OffTradeMarketType. This message will not be sent for trades in Endex Spot markets."),

    /**
     * This message will be sent only upon trade in spot markets and it will be rendered on spot market channels.
     */
    SPOT_MARKET_TRADE_MESSAGE('Y', "This message will be sent only upon trade in spot markets and it will be rendered on spot market channels."),

    /**
     * This message is sent when a trade is put under investigation or the investigation is completed. Client can use the market ID and order ID to find and flag the original trade if needed.
     */
    INVESTIGATED_TRADE_MESSAGE('H', "This message is sent when a trade is put under investigation or the investigation is completed. Client can use the market ID and order ID to find and flag the original trade if needed."),

    /**
     * This message is sent when a trade is cancelled.
     */
    CANCELLED_TRADE_MESSAGE('I', "This message is sent when a trade is cancelled."),

    /**
     * This is usually sent after a trade or cancelled trade message.
     */
    MARKET_STATISTICS_MESSAGE('J', "This is usually sent after a trade or cancelled trade message."),

    /**
     * Market State Change Message
     */
    MARKET_STATE_CHANGE_MESSAGE('K', "Market State Change Message"),

    /**
     * System Text Message
     */
    SYSTEM_TEXT_MESSAGE('L', "System Text Message"),

    /**
     * Open Interest Message
     */
    OPEN_INTEREST_MESSAGE('M', "Open Interest Message"),

    /**
     * Open Price Message
     */
    OPEN_PRICE_MESSAGE('N', "Open Price Message"),

    /**
     * Close Price Message
     */
    CLOSE_PRICE_MESSAGE('c', "Close Price Message"),

    /**
     * Settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one.
     */
    SETTLEMENT_PRICE_MESSAGE('O', "Settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one."),

    /**
     * The exchange sends out Marker/Index Prices when there is an update.
     */
    INDEX_PRICES_MESSAGE('z', "The exchange sends out Marker/Index Prices when there is an update."),

    /**
     * The message is streamed to client when market is closed and settlement price is available for the current trading day.
     */
    END_OF_DAY_MARKET_SUMMARY_MESSAGE('u', "The message is streamed to client when market is closed and settlement price is available for the current trading day."),

    /**
     * End of Day Market Summary Message
     */
    MARKET_EVENT_MESSAGE('f', "End of Day Market Summary Message"),

    /**
     * This message contains the estimate of what the opening price could be, based on the orders in the market or previous settlement price.
     */
    PRE_OPEN_PRICE_INDICATOR_MESSAGE('g', "This message contains the estimate of what the opening price could be, based on the orders in the market or previous settlement price."),

    /**
     * This message will be sent out if there is strip date change during the trading session. If client does not care about strip date changes, client should ignore these messages.
     */
    STRIP_INFO_MESSAGE('i', "This message will be sent out if there is strip date change during the trading session. If client does not care about strip date changes, client should ignore these messages."),

    /**
     * Interval Price Limit (IPL) might be enabled for certain markets. IPL check is to prevent sudden movements (in both directions) in the market during a short period of time.
     */
    INTERVAL_PRICE_LIMIT_NOTIFICATION_MESSAGE('V', "Interval Price Limit (IPL) might be enabled for certain markets. IPL check is to prevent sudden movements (in both directions) in the market during a short period of time."),

    /**
     * New Futures Strategy Definition messages will be sent out when new UDS markets for futures are created.
     */
    NEW_FUTURES_STRATEGY_DEFINITION_MESSAGE('9', "New Futures Strategy Definition messages will be sent out when new UDS markets for futures are created."),

    /**
     * New Expiry message will be sent out when a new equity market is created during the day.
     */
    NEW_EXPIRY_MESSAGE('R', "New Expiry message will be sent out when a new equity market is created during the day."),

    /**
     * The Special Field Message is used to send extra information on existing messages.
     */
    SPECIAL_FIELD_MESSAGE('b', "The Special Field Message is used to send extra information on existing messages."),

    /**
     * This message is for orders in snapshot only. It is different from the order message for incremental updates.
     */
    MARKET_SNAPSHOT_ORDER_MESSAGE('D', "This message is for orders in snapshot only. It is different from the order message for incremental updates."),

    /**
     * Client should add the order to book if it is not there already. Otherwise, just overwrite the existing order.
     */
    ADD_OR_MODIFY_ORDER_MESSAGE('E', "Client should add the order to book if it is not there already. Otherwise, just overwrite the existing order."),

    /**
     * Upon receipt of this message, client should remove the order from its local book.
     */
    DELETE_ORDER_MESSAGE('F', "Upon receipt of this message, client should remove the order from its local book."),

    /**
     * This message indicates where a bundle of messages starts or ends.
     */
    MESSAGE_BUNDLE_MARKER('T', "This message indicates where a bundle of messages starts or ends."),

    /**
     * This message supports ICE Benchmark Administration’s (IBA) electronic Gold Auction and it is disseminated when there is a transition of the fixing market.
     */
    FIXING_TRANSITION_MESSAGE('3', "This message supports ICE Benchmark Administration\u2019s (IBA) electronic Gold Auction and it is disseminated when there is a transition of the fixing market."),

    /**
     * This message supports ICE Benchmark Administration’s (IBA) electronic Gold Auction and it is disseminated when there is a transition of the fixing market.
     */
    FIXING_LOCKDOWN_MESSAGE('4', "This message supports ICE Benchmark Administration\u2019s (IBA) electronic Gold Auction and it is disseminated when there is a transition of the fixing market."),

    /**
     * This message supports ICE Benchmark Administration’s (IBA) electronic Gold and Silver Auction and is disseminated at the end of the final auction when the final price is published
     */
    FIXING_INDICATIVE_PRICE_MESSAGE_MESSAGE('0', "This message supports ICE Benchmark Administration\u2019s (IBA) electronic Gold and Silver Auction and is disseminated at the end of the final auction when the final price is published"),

    /**
     * This message is for price level in snapshot only.
     */
    MARKET_SNAPSHOT_PRICE_LEVEL_MESSAGE('m', "This message is for price level in snapshot only."),

    /**
     * Upon receipt of this message, client should add/insert a price level at the specified position in the book for the given market, and push down the price levels that were previously at or below that position.
     */
    ADD_PRICE_LEVEL_MESSAGE('t', "Upon receipt of this message, client should add/insert a price level at the specified position in the book for the given market, and push down the price levels that were previously at or below that position."),

    /**
     * Upon receipt of this message, client should update the price level at the specified position in its book for the given market.
     */
    CHANGE_PRICE_LEVEL_MESSAGE('s', "Upon receipt of this message, client should update the price level at the specified position in its book for the given market."),

    /**
     * Upon receipt of this message, client should remove the price level at the specified position in its book for the given market.
     */
    DELETE_PRICE_LEVEL_MESSAGE('r', "Upon receipt of this message, client should remove the price level at the specified position in its book for the given market."),

    /**
     * New Options Strategy Definition messages will be sent out when new UDS markets for options are created.
     */
    NEW_OPTIONS_STRATEGY_DEFINITION_MESSAGE('U', "New Options Strategy Definition messages will be sent out when new UDS markets for options are created."),

    /**
     * New Options Market Definition messages will be sent out when new options markets are created.
     */
    NEW_OPTIONS_MARKET_DEFINITION_MESSAGE('l', "New Options Market Definition messages will be sent out when new options markets are created."),

    /**
     * Request for Quote Message.
     */
    RFQ_MESSAGE('k', "Request for Quote Message."),

    /**
     * Option Open Interest Message
     */
    OPTION_OPEN_INTEREST_MESSAGE('v', "Option Open Interest Message"),

    /**
     * Option settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one.
     */
    OPTION_SETTLEMENT_PRICE_MESSAGE('w', "Option settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one."),

    /**
     * Option settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one.
     */
    OLD_STYLE_OPTIONS_TRADE_AND_MARKET_STATS_MESSAGE('W', "Option settlement prices could be official or unofficial. For a given market, the exchange usually sends out unofficial price before the official one.");

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
            case 'C' -> Optional.of(MARKET_SNAPSHOT_MESSAGE);
            case 'G' -> Optional.of(TRADE_MESSAGE);
            case 'Y' -> Optional.of(SPOT_MARKET_TRADE_MESSAGE);
            case 'H' -> Optional.of(INVESTIGATED_TRADE_MESSAGE);
            case 'I' -> Optional.of(CANCELLED_TRADE_MESSAGE);
            case 'J' -> Optional.of(MARKET_STATISTICS_MESSAGE);
            case 'K' -> Optional.of(MARKET_STATE_CHANGE_MESSAGE);
            case 'L' -> Optional.of(SYSTEM_TEXT_MESSAGE);
            case 'M' -> Optional.of(OPEN_INTEREST_MESSAGE);
            case 'N' -> Optional.of(OPEN_PRICE_MESSAGE);
            case 'c' -> Optional.of(CLOSE_PRICE_MESSAGE);
            case 'O' -> Optional.of(SETTLEMENT_PRICE_MESSAGE);
            case 'z' -> Optional.of(INDEX_PRICES_MESSAGE);
            case 'u' -> Optional.of(END_OF_DAY_MARKET_SUMMARY_MESSAGE);
            case 'f' -> Optional.of(MARKET_EVENT_MESSAGE);
            case 'g' -> Optional.of(PRE_OPEN_PRICE_INDICATOR_MESSAGE);
            case 'i' -> Optional.of(STRIP_INFO_MESSAGE);
            case 'V' -> Optional.of(INTERVAL_PRICE_LIMIT_NOTIFICATION_MESSAGE);
            case '9' -> Optional.of(NEW_FUTURES_STRATEGY_DEFINITION_MESSAGE);
            case 'R' -> Optional.of(NEW_EXPIRY_MESSAGE);
            case 'b' -> Optional.of(SPECIAL_FIELD_MESSAGE);
            case 'D' -> Optional.of(MARKET_SNAPSHOT_ORDER_MESSAGE);
            case 'E' -> Optional.of(ADD_OR_MODIFY_ORDER_MESSAGE);
            case 'F' -> Optional.of(DELETE_ORDER_MESSAGE);
            case 'T' -> Optional.of(MESSAGE_BUNDLE_MARKER);
            case '3' -> Optional.of(FIXING_TRANSITION_MESSAGE);
            case '4' -> Optional.of(FIXING_LOCKDOWN_MESSAGE);
            case '0' -> Optional.of(FIXING_INDICATIVE_PRICE_MESSAGE_MESSAGE);
            case 'm' -> Optional.of(MARKET_SNAPSHOT_PRICE_LEVEL_MESSAGE);
            case 't' -> Optional.of(ADD_PRICE_LEVEL_MESSAGE);
            case 's' -> Optional.of(CHANGE_PRICE_LEVEL_MESSAGE);
            case 'r' -> Optional.of(DELETE_PRICE_LEVEL_MESSAGE);
            case 'U' -> Optional.of(NEW_OPTIONS_STRATEGY_DEFINITION_MESSAGE);
            case 'l' -> Optional.of(NEW_OPTIONS_MARKET_DEFINITION_MESSAGE);
            case 'k' -> Optional.of(RFQ_MESSAGE);
            case 'v' -> Optional.of(OPTION_OPEN_INTEREST_MESSAGE);
            case 'w' -> Optional.of(OPTION_SETTLEMENT_PRICE_MESSAGE);
            case 'W' -> Optional.of(OLD_STYLE_OPTIONS_TRADE_AND_MARKET_STATS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
