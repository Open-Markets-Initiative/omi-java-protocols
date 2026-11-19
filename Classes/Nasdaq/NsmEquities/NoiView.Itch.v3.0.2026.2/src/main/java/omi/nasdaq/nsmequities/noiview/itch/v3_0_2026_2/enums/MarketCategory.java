package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026_2.enums;

import java.util.Optional;

/**
 * Listing market or listing market tier for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * Nasdaq Global Select Market Sm
     */
    NASDAQ_GLOBAL_SELECT_MARKET_SM('Q', "Nasdaq Global Select Market Sm"),

    /**
     * Nasdaq Global Market Sm
     */
    NASDAQ_GLOBAL_MARKET_SM('G', "Nasdaq Global Market Sm"),

    /**
     * Nasdaq Capital Market
     */
    NASDAQ_CAPITAL_MARKET('S', "Nasdaq Capital Market"),

    /**
     * New York Stock Exchange Nyse
     */
    NEW_YORK_STOCK_EXCHANGE_NYSE('N', "New York Stock Exchange Nyse"),

    /**
     * Nyse American
     */
    NYSE_AMERICAN('A', "Nyse American"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca"),

    /**
     * Nyse Texas
     */
    NYSE_TEXAS('M', "Nyse Texas"),

    /**
     * Bats Z Exchange
     */
    BATS_Z_EXCHANGE('Z', "Bats Z Exchange"),

    /**
     * Investors Exchange Llc
     */
    INVESTORS_EXCHANGE_LLC('V', "Investors Exchange Llc"),

    /**
     * Texas Exchange
     */
    TEXAS_EXCHANGE('F', "Texas Exchange"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    MarketCategory(char wire, String description) {
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
    public static Optional<MarketCategory> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(NASDAQ_GLOBAL_SELECT_MARKET_SM);
            case 'G' -> Optional.of(NASDAQ_GLOBAL_MARKET_SM);
            case 'S' -> Optional.of(NASDAQ_CAPITAL_MARKET);
            case 'N' -> Optional.of(NEW_YORK_STOCK_EXCHANGE_NYSE);
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'Z' -> Optional.of(BATS_Z_EXCHANGE);
            case 'V' -> Optional.of(INVESTORS_EXCHANGE_LLC);
            case 'F' -> Optional.of(TEXAS_EXCHANGE);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
