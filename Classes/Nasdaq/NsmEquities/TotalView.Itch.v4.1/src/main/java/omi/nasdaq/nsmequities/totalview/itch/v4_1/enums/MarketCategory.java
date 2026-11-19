package omi.nasdaq.nsmequities.totalview.itch.v4_1.enums;

import java.util.Optional;

/**
 * Indicates Listing market or listing market tier for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * New York Stock Exchange
     */
    NYSE('N', "New York Stock Exchange"),

    /**
     * New York Stock Exchange Amex
     */
    AMEX('A', "New York Stock Exchange Amex"),

    /**
     * New York Stock Exchange Arca
     */
    ARCA('P', "New York Stock Exchange Arca"),

    /**
     * Nasdaq Global Select Market
     */
    NASDAQ_GSM('Q', "Nasdaq Global Select Market"),

    /**
     * Nasdaq Global Market
     */
    NASDAQ_GM('G', "Nasdaq Global Market"),

    /**
     * Nasdaq Capital Market
     */
    NASDAQ_CM('S', "Nasdaq Capital Market"),

    /**
     * BATS BZX Exchange
     */
    BATS('Z', "BATS BZX Exchange");

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
            case 'N' -> Optional.of(NYSE);
            case 'A' -> Optional.of(AMEX);
            case 'P' -> Optional.of(ARCA);
            case 'Q' -> Optional.of(NASDAQ_GSM);
            case 'G' -> Optional.of(NASDAQ_GM);
            case 'S' -> Optional.of(NASDAQ_CM);
            case 'Z' -> Optional.of(BATS);
            default -> Optional.empty();
        };
    }
}
