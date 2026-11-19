package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * Market model typology level 2
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingMode {

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Scheduled Intraday Auction
     */
    SCHEDULED_INTRADAY_AUCTION('I', "Scheduled Intraday Auction"),

    /**
     * Unscheduled Auction
     */
    UNSCHEDULED_AUCTION('U', "Unscheduled Auction"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('2', "Continuous Trading"),

    /**
     * At Market Close Trading
     */
    AT_MARKET_CLOSE_TRADING('3', "At Market Close Trading"),

    /**
     * On Demand Auction
     */
    ON_DEMAND_AUCTION('P', "On Demand Auction");

    private final char wire;

    private final String description;

    TradingMode(char wire, String description) {
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
    public static Optional<TradingMode> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'I' -> Optional.of(SCHEDULED_INTRADAY_AUCTION);
            case 'U' -> Optional.of(UNSCHEDULED_AUCTION);
            case '2' -> Optional.of(CONTINUOUS_TRADING);
            case '3' -> Optional.of(AT_MARKET_CLOSE_TRADING);
            case 'P' -> Optional.of(ON_DEMAND_AUCTION);
            default -> Optional.empty();
        };
    }
}
