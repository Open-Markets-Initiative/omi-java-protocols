package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * The reason for Trade Through Exemptions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond2 {

    /**
     * Na
     */
    NA(' ', "Na"),

    /**
     * Intermarket Sweep Order
     */
    INTERMARKET_SWEEP_ORDER('F', "Intermarket Sweep Order"),

    /**
     * Market Center Opening Trade Arca American And Nyse Only
     */
    MARKET_CENTER_OPENING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY('O', "Market Center Opening Trade Arca American And Nyse Only"),

    /**
     * Reopening Trade Arca American And Nyse Only
     */
    REOPENING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY('5', "Reopening Trade Arca American And Nyse Only"),

    /**
     * Market Center Closing Trade Arca American And Nyse Only
     */
    MARKET_CENTER_CLOSING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY('6', "Market Center Closing Trade Arca American And Nyse Only"),

    /**
     * Qualified Contingent Trade Texas Only
     */
    QUALIFIED_CONTINGENT_TRADE_TEXAS_ONLY('7', "Qualified Contingent Trade Texas Only");

    private final char wire;

    private final String description;

    TradeCond2(char wire, String description) {
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
    public static Optional<TradeCond2> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA);
            case 'F' -> Optional.of(INTERMARKET_SWEEP_ORDER);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY);
            case '5' -> Optional.of(REOPENING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE_ARCA_AMERICAN_AND_NYSE_ONLY);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE_TEXAS_ONLY);
            default -> Optional.empty();
        };
    }
}
