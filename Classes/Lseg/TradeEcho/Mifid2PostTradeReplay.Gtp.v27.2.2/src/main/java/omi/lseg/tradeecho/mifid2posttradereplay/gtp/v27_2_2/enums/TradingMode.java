package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Trading mode in which the transaction was executed.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingMode {

    /**
     * Undefined Auction
     */
    UNDEFINED_AUCTION('1', "Undefined Auction"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('2', "Continuous Trading"),

    /**
     * At Market Close Trading
     */
    AT_MARKET_CLOSE_TRADING('3', "At Market Close Trading"),

    /**
     * Out Of Main Session Trading
     */
    OUT_OF_MAIN_SESSION_TRADING('4', "Out Of Main Session Trading"),

    /**
     * Trade Reporting On Exchange
     */
    TRADE_REPORTING_ON_EXCHANGE('5', "Trade Reporting On Exchange"),

    /**
     * Trade Reporting Off Exchange
     */
    TRADE_REPORTING_OFF_EXCHANGE('6', "Trade Reporting Off Exchange"),

    /**
     * Trade Reporting Systemic Internaliser
     */
    TRADE_REPORTING_SYSTEMIC_INTERNALISER('7', "Trade Reporting Systemic Internaliser"),

    /**
     * Scheduled Opening Auction
     */
    SCHEDULED_OPENING_AUCTION('O', "Scheduled Opening Auction"),

    /**
     * Scheduled Closing Auction
     */
    SCHEDULED_CLOSING_AUCTION('K', "Scheduled Closing Auction"),

    /**
     * Scheduled Intraday Auction
     */
    SCHEDULED_INTRADAY_AUCTION('I', "Scheduled Intraday Auction"),

    /**
     * Unscheduled Auction
     */
    UNSCHEDULED_AUCTION('U', "Unscheduled Auction");

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
            case '1' -> Optional.of(UNDEFINED_AUCTION);
            case '2' -> Optional.of(CONTINUOUS_TRADING);
            case '3' -> Optional.of(AT_MARKET_CLOSE_TRADING);
            case '4' -> Optional.of(OUT_OF_MAIN_SESSION_TRADING);
            case '5' -> Optional.of(TRADE_REPORTING_ON_EXCHANGE);
            case '6' -> Optional.of(TRADE_REPORTING_OFF_EXCHANGE);
            case '7' -> Optional.of(TRADE_REPORTING_SYSTEMIC_INTERNALISER);
            case 'O' -> Optional.of(SCHEDULED_OPENING_AUCTION);
            case 'K' -> Optional.of(SCHEDULED_CLOSING_AUCTION);
            case 'I' -> Optional.of(SCHEDULED_INTRADAY_AUCTION);
            case 'U' -> Optional.of(UNSCHEDULED_AUCTION);
            default -> Optional.empty();
        };
    }
}
