package omi.lseg.turquoise.level2incremental.gtp.v24_4.enums;

import java.util.Optional;

/**
 * The statistic that is disseminated with this message instance:
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum StatisticType {

    /**
     * Indicative Auction Uncrossing Data
     */
    INDICATIVE_AUCTION_UNCROSSING_DATA(1, "Indicative Auction Uncrossing Data"),

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
    FIFTY_TWO_WEEK_TRADE_LOW_ALL_TRADES(9, "Fifty Two Week Trade Low All Trades");

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
            case 4 -> Optional.of(TRADE_HIGH_ON_BOOK);
            case 5 -> Optional.of(TRADE_LOW_ON_BOOK);
            case 6 -> Optional.of(TRADE_HIGH_ALL_TRADES);
            case 7 -> Optional.of(TRADE_LOW_ALL_TRADES);
            case 8 -> Optional.of(FIFTY_TWO_WEEK_TRADE_HIGH_ALL_TRADES);
            case 9 -> Optional.of(FIFTY_TWO_WEEK_TRADE_LOW_ALL_TRADES);
            default -> Optional.empty();
        };
    }
}
