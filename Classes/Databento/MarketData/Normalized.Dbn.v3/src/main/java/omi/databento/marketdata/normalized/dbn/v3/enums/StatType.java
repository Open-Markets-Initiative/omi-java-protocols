package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * The type of statistic value contained in the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum StatType {

    /**
     * Opening Price
     */
    OPENING_PRICE(1, "Opening Price"),

    /**
     * Indicative Opening Price
     */
    INDICATIVE_OPENING_PRICE(2, "Indicative Opening Price"),

    /**
     * Settlement Price
     */
    SETTLEMENT_PRICE(3, "Settlement Price"),

    /**
     * Trading Session Low Price
     */
    TRADING_SESSION_LOW_PRICE(4, "Trading Session Low Price"),

    /**
     * Trading Session High Price
     */
    TRADING_SESSION_HIGH_PRICE(5, "Trading Session High Price"),

    /**
     * Cleared Volume
     */
    CLEARED_VOLUME(6, "Cleared Volume"),

    /**
     * Lowest Offer
     */
    LOWEST_OFFER(7, "Lowest Offer"),

    /**
     * Highest Bid
     */
    HIGHEST_BID(8, "Highest Bid"),

    /**
     * Open Interest
     */
    OPEN_INTEREST(9, "Open Interest"),

    /**
     * Fixing Price
     */
    FIXING_PRICE(10, "Fixing Price"),

    /**
     * Close Price
     */
    CLOSE_PRICE(11, "Close Price"),

    /**
     * Net Change
     */
    NET_CHANGE(12, "Net Change"),

    /**
     * Vwap
     */
    VWAP(13, "Vwap"),

    /**
     * Volatility
     */
    VOLATILITY(14, "Volatility"),

    /**
     * Delta
     */
    DELTA(15, "Delta"),

    /**
     * Uncrossing Price
     */
    UNCROSSING_PRICE(16, "Uncrossing Price"),

    /**
     * Upper Price Limit
     */
    UPPER_PRICE_LIMIT(17, "Upper Price Limit"),

    /**
     * Lower Price Limit
     */
    LOWER_PRICE_LIMIT(18, "Lower Price Limit"),

    /**
     * Block Volume
     */
    BLOCK_VOLUME(19, "Block Volume"),

    /**
     * Indicative Close Price
     */
    INDICATIVE_CLOSE_PRICE(20, "Indicative Close Price"),

    /**
     * Mwcb Level1
     */
    MWCB_LEVEL_1(21, "Mwcb Level1"),

    /**
     * Mwcb Level2
     */
    MWCB_LEVEL_2(22, "Mwcb Level2"),

    /**
     * Mwcb Level3
     */
    MWCB_LEVEL_3(23, "Mwcb Level3"),

    /**
     * Auction Collar Reference Price
     */
    AUCTION_COLLAR_REFERENCE_PRICE(24, "Auction Collar Reference Price"),

    /**
     * Auction Collar Upper Price
     */
    AUCTION_COLLAR_UPPER_PRICE(25, "Auction Collar Upper Price"),

    /**
     * Auction Collar Lower Price
     */
    AUCTION_COLLAR_LOWER_PRICE(26, "Auction Collar Lower Price"),

    /**
     * Venue Specific Volume1
     */
    VENUE_SPECIFIC_VOLUME_1(10001, "Venue Specific Volume1"),

    /**
     * Venue Specific Price1
     */
    VENUE_SPECIFIC_PRICE_1(10002, "Venue Specific Price1");

    private final int wire;

    private final String description;

    StatType(int wire, String description) {
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
    public static Optional<StatType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(OPENING_PRICE);
            case 2 -> Optional.of(INDICATIVE_OPENING_PRICE);
            case 3 -> Optional.of(SETTLEMENT_PRICE);
            case 4 -> Optional.of(TRADING_SESSION_LOW_PRICE);
            case 5 -> Optional.of(TRADING_SESSION_HIGH_PRICE);
            case 6 -> Optional.of(CLEARED_VOLUME);
            case 7 -> Optional.of(LOWEST_OFFER);
            case 8 -> Optional.of(HIGHEST_BID);
            case 9 -> Optional.of(OPEN_INTEREST);
            case 10 -> Optional.of(FIXING_PRICE);
            case 11 -> Optional.of(CLOSE_PRICE);
            case 12 -> Optional.of(NET_CHANGE);
            case 13 -> Optional.of(VWAP);
            case 14 -> Optional.of(VOLATILITY);
            case 15 -> Optional.of(DELTA);
            case 16 -> Optional.of(UNCROSSING_PRICE);
            case 17 -> Optional.of(UPPER_PRICE_LIMIT);
            case 18 -> Optional.of(LOWER_PRICE_LIMIT);
            case 19 -> Optional.of(BLOCK_VOLUME);
            case 20 -> Optional.of(INDICATIVE_CLOSE_PRICE);
            case 21 -> Optional.of(MWCB_LEVEL_1);
            case 22 -> Optional.of(MWCB_LEVEL_2);
            case 23 -> Optional.of(MWCB_LEVEL_3);
            case 24 -> Optional.of(AUCTION_COLLAR_REFERENCE_PRICE);
            case 25 -> Optional.of(AUCTION_COLLAR_UPPER_PRICE);
            case 26 -> Optional.of(AUCTION_COLLAR_LOWER_PRICE);
            case 10001 -> Optional.of(VENUE_SPECIFIC_VOLUME_1);
            case 10002 -> Optional.of(VENUE_SPECIFIC_PRICE_1);
            default -> Optional.empty();
        };
    }
}
