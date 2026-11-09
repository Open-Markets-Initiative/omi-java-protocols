package omi.nasdaq.nsmequities.totalview.itch.v4_0.enums;

import java.util.Optional;

/**
 * Indicates Listing market or listing market tier for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * CQS (NYSE, Amex or regional exchange)
     */
    CQS('T', "CQS (NYSE, Amex or regional exchange)"),

    /**
     * NASDAQ Global Select Market
     */
    NASDAQ_GLOBAL_SELECT_MARKET('Q', "NASDAQ Global Select Market"),

    /**
     * NASDAQ Global Market
     */
    NASDAQ_GLOBAL_MARKET('G', "NASDAQ Global Market"),

    /**
     * NASDAQ Capital Market
     */
    NASDAQ_CAPITAL_MARKET('S', "NASDAQ Capital Market");

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
            case 'T' -> Optional.of(CQS);
            case 'Q' -> Optional.of(NASDAQ_GLOBAL_SELECT_MARKET);
            case 'G' -> Optional.of(NASDAQ_GLOBAL_MARKET);
            case 'S' -> Optional.of(NASDAQ_CAPITAL_MARKET);
            default -> Optional.empty();
        };
    }
}
