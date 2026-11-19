package omi.nasdaq.nsmequities.level2.itch.v2_0_2026.enums;

import java.util.Optional;

/**
 * Indicates Listing market or listing market tier for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * Nasdaq-Listed Instrument
     */
    NASDAQ_GLOBAL_SELECT_MARKET('Q', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    NASDAQ_GLOBAL_MARKET('G', "Nasdaq-Listed Instrument"),

    /**
     * Nasdaq-Listed Instrument
     */
    NASDAQ_CAPITAL_MARKET('S', "Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    NEW_YORK_STOCK_EXCHANGE('N', "Non-Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    NYSE_AMERICAN('A', "Non-Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    NYSE_ARCA('P', "Non-Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    NYSE_TEXAS('M', "Non-Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    BATS_BZX_EXCHANGE('Z', "Non-Nasdaq-Listed Instrument"),

    /**
     * Non-Nasdaq-Listed Instrument
     */
    INVESTORS_EXCHANGE_LLC('V', "Non-Nasdaq-Listed Instrument"),

    /**
     * Texas Exchange
     */
    TEXAS_EXCHANGE('F', "Texas Exchange"),

    /**
     * Not available
     */
    NOT_AVAILABLE(' ', "Not available");

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
            case 'F' -> Optional.of(TEXAS_EXCHANGE);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
