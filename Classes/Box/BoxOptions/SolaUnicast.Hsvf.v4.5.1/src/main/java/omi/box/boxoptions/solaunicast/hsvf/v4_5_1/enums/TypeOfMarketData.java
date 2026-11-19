package omi.box.boxoptions.solaunicast.hsvf.v4_5_1.enums;

import java.util.Optional;

/**
 * Market Data Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TypeOfMarketData {

    /**
     * Market Depth Messages On The Top 5 Bidsasks For The Type Of Trading Instruments Chosen
     */
    MARKET_DEPTH_MESSAGES_ON_THE_TOP_5_BIDSASKS_FOR_THE_TYPE_OF_TRADING_INSTRUMENTS_CHOSEN('Y', "Market Depth Messages On The Top 5 Bidsasks For The Type Of Trading Instruments Chosen"),

    /**
     * The Best Bidask Message
     */
    BEST('N', "The Best Bidask Message"),

    /**
     * Trade Messages Without Quotes Or Market Depth Messages
     */
    TRADE('T', "Trade Messages Without Quotes Or Market Depth Messages"),

    /**
     * Price Improvement And Exposed Order Messages
     */
    PRICE_IMPROVEMENT_AND_EXPOSED_ORDER_MESSAGES('P', "Price Improvement And Exposed Order Messages"),

    /**
     * Market Depth Messages On The Top 5 And The Calculated Implied Best Limit
     */
    MARKET_DEPTH_MESSAGES_ON_THE_TOP_5_AND_THE_CALCULATED_IMPLIED_BEST_LIMIT('I', "Market Depth Messages On The Top 5 And The Calculated Implied Best Limit"),

    /**
     * Quote Message On The First Level And The Calculated Implied Best Limit
     */
    QUOTE_MESSAGE_ON_THE_FIRST_LEVEL_AND_THE_CALCULATED_IMPLIED_BEST_LIMIT('G', "Quote Message On The First Level And The Calculated Implied Best Limit");

    private final char wire;

    private final String description;

    TypeOfMarketData(char wire, String description) {
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
    public static Optional<TypeOfMarketData> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(MARKET_DEPTH_MESSAGES_ON_THE_TOP_5_BIDSASKS_FOR_THE_TYPE_OF_TRADING_INSTRUMENTS_CHOSEN);
            case 'N' -> Optional.of(BEST);
            case 'T' -> Optional.of(TRADE);
            case 'P' -> Optional.of(PRICE_IMPROVEMENT_AND_EXPOSED_ORDER_MESSAGES);
            case 'I' -> Optional.of(MARKET_DEPTH_MESSAGES_ON_THE_TOP_5_AND_THE_CALCULATED_IMPLIED_BEST_LIMIT);
            case 'G' -> Optional.of(QUOTE_MESSAGE_ON_THE_FIRST_LEVEL_AND_THE_CALCULATED_IMPLIED_BEST_LIMIT);
            default -> Optional.empty();
        };
    }
}
