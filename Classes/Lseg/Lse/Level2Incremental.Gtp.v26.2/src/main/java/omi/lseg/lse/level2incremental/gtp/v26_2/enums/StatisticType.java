package omi.lseg.lse.level2incremental.gtp.v26_2.enums;

import java.util.Optional;

/**
 * The statistic that is disseminated with this message instance.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum StatisticType {

    /**
     * Indicative Auction Uncrossing Data
     */
    INDICATIVE_AUCTION_UNCROSSING_DATA(1, "Indicative Auction Uncrossing Data"),

    /**
     * Official Opening Price
     */
    OFFICIAL_OPENING_PRICE(2, "Official Opening Price"),

    /**
     * Official Closing Price
     */
    OFFICIAL_CLOSING_PRICE(3, "Official Closing Price"),

    /**
     * Trade High On Book
     */
    TRADE_HIGH_ON_BOOK(4, "Trade High On Book"),

    /**
     * Trade Low On Book
     */
    TRADE_LOW_ON_BOOK(5, "Trade Low On Book"),

    /**
     * Trade High All Trades
     */
    TRADE_HIGH_ALL_TRADES(6, "Trade High All Trades"),

    /**
     * Trade Low All Trades
     */
    TRADE_LOW_ALL_TRADES(7, "Trade Low All Trades"),

    /**
     * Fifty Two Week Trade High All Trades
     */
    FIFTY_TWO_WEEK_TRADE_HIGH_ALL_TRADES(8, "Fifty Two Week Trade High All Trades"),

    /**
     * Fifty Two Week Trade Low All Trades
     */
    FIFTY_TWO_WEEK_TRADE_LOW_ALL_TRADES(9, "Fifty Two Week Trade Low All Trades"),

    /**
     * Best Closing Bid
     */
    BEST_CLOSING_BID(10, "Best Closing Bid"),

    /**
     * Best Closing Ask
     */
    BEST_CLOSING_ASK(11, "Best Closing Ask"),

    /**
     * Static Reference Price
     */
    STATIC_REFERENCE_PRICE(16, "Static Reference Price"),

    /**
     * Dynamic Reference Price
     */
    DYNAMIC_REFERENCE_PRICE(17, "Dynamic Reference Price");

    private final int wire;

    private final String description;

    StatisticType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<StatisticType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(INDICATIVE_AUCTION_UNCROSSING_DATA);
            case 2 -> Optional.of(OFFICIAL_OPENING_PRICE);
            case 3 -> Optional.of(OFFICIAL_CLOSING_PRICE);
            case 4 -> Optional.of(TRADE_HIGH_ON_BOOK);
            case 5 -> Optional.of(TRADE_LOW_ON_BOOK);
            case 6 -> Optional.of(TRADE_HIGH_ALL_TRADES);
            case 7 -> Optional.of(TRADE_LOW_ALL_TRADES);
            case 8 -> Optional.of(FIFTY_TWO_WEEK_TRADE_HIGH_ALL_TRADES);
            case 9 -> Optional.of(FIFTY_TWO_WEEK_TRADE_LOW_ALL_TRADES);
            case 10 -> Optional.of(BEST_CLOSING_BID);
            case 11 -> Optional.of(BEST_CLOSING_ASK);
            case 16 -> Optional.of(STATIC_REFERENCE_PRICE);
            case 17 -> Optional.of(DYNAMIC_REFERENCE_PRICE);
            default -> Optional.empty();
        };
    }
}
