package omi.bme.meff.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trade type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Cross Trade During Trading Hours
     */
    CROSS_TRADE_DURING_TRADING_HOURS('H', "Cross Trade During Trading Hours"),

    /**
     * Delta
     */
    DELTA('L', "Delta"),

    /**
     * Market
     */
    MARKET('M', "Market"),

    /**
     * Strategy Trades Time Spread Futures And Strategies
     */
    STRATEGY_TRADES_TIME_SPREAD_FUTURES_AND_STRATEGIES('R', "Strategy Trades Time Spread Futures And Strategies"),

    /**
     * Components Of Trade R
     */
    COMPONENTS_OF_TRADE_R('S', "Components Of Trade R"),

    /**
     * Trade Amendment
     */
    TRADE_AMENDMENT('W', "Trade Amendment"),

    /**
     * Countertrade
     */
    COUNTERTRADE('X', "Countertrade"),

    /**
     * Rfq
     */
    RFQ('3', "Rfq"),

    /**
     * Rfq X Rolling
     */
    RFQ_X_ROLLING('4', "Rfq X Rolling"),

    /**
     * Rfq X Rolling During Auction
     */
    RFQ_X_ROLLING_DURING_AUCTION('6', "Rfq X Rolling During Auction"),

    /**
     * Rfq X Rolling Amendment
     */
    RFQ_X_ROLLING_AMENDMENT('8', "Rfq X Rolling Amendment"),

    /**
     * Rfq X Rolling During Auction Amendment
     */
    RFQ_X_ROLLING_DURING_AUCTION_AMENDMENT('9', "Rfq X Rolling During Auction Amendment");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(CROSS_TRADE_DURING_TRADING_HOURS);
            case 'L' -> Optional.of(DELTA);
            case 'M' -> Optional.of(MARKET);
            case 'R' -> Optional.of(STRATEGY_TRADES_TIME_SPREAD_FUTURES_AND_STRATEGIES);
            case 'S' -> Optional.of(COMPONENTS_OF_TRADE_R);
            case 'W' -> Optional.of(TRADE_AMENDMENT);
            case 'X' -> Optional.of(COUNTERTRADE);
            case '3' -> Optional.of(RFQ);
            case '4' -> Optional.of(RFQ_X_ROLLING);
            case '6' -> Optional.of(RFQ_X_ROLLING_DURING_AUCTION);
            case '8' -> Optional.of(RFQ_X_ROLLING_AMENDMENT);
            case '9' -> Optional.of(RFQ_X_ROLLING_DURING_AUCTION_AMENDMENT);
            default -> Optional.empty();
        };
    }
}
