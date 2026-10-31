package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Indicates Listing market or listing market tier for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * Nasdaq Global Select Market
     */
    NASDAQ_GLOBAL_SELECT_MARKET('Q', "Nasdaq Global Select Market"),

    /**
     * Nasdaq Global Market
     */
    NASDAQ_GLOBAL_MARKET('G', "Nasdaq Global Market"),

    /**
     * Nasdaq Capital Market
     */
    NASDAQ_CAPITAL_MARKET('S', "Nasdaq Capital Market"),

    /**
     * New York Stock Exchange (NYSE)
     */
    NEW_YORK_STOCK_EXCHANGE('N', "New York Stock Exchange (NYSE)"),

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * NYSE Texas
     */
    NYSE_TEXAS('M', "NYSE Texas"),

    /**
     * BATS BZX Exchange
     */
    BATS_BZX_EXCHANGE('Z', "BATS BZX Exchange"),

    /**
     * Investors' Exchange, LLC
     */
    INVESTORS_EXCHANGE_LLC('V', "Investors' Exchange, LLC"),

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
            case 'Q' -> Optional.of(NASDAQ_GLOBAL_SELECT_MARKET);
            case 'G' -> Optional.of(NASDAQ_GLOBAL_MARKET);
            case 'S' -> Optional.of(NASDAQ_CAPITAL_MARKET);
            case 'N' -> Optional.of(NEW_YORK_STOCK_EXCHANGE);
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'Z' -> Optional.of(BATS_BZX_EXCHANGE);
            case 'V' -> Optional.of(INVESTORS_EXCHANGE_LLC);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
