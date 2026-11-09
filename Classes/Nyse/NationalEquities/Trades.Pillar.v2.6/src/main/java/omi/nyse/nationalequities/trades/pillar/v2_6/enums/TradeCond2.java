package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

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
     * Market Center Opening Trade
     */
    MARKET_CENTER_OPENING_TRADE('O', "Market Center Opening Trade"),

    /**
     * Derivatively Priced Trf Only
     */
    DERIVATIVELY_PRICED_TRF_ONLY('4', "Derivatively Priced Trf Only"),

    /**
     * Reopening Trade
     */
    REOPENING_TRADE('5', "Reopening Trade"),

    /**
     * Market Center Closing Trade
     */
    MARKET_CENTER_CLOSING_TRADE('6', "Market Center Closing Trade"),

    /**
     * Qualified Contingent Trade Trf Or Texas Only
     */
    QUALIFIED_CONTINGENT_TRADE_TRF_OR_TEXAS_ONLY('7', "Qualified Contingent Trade Trf Or Texas Only"),

    /**
     * Corrected Consolidated Close
     */
    CORRECTED_CONSOLIDATED_CLOSE('9', "Corrected Consolidated Close");

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
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
            case '4' -> Optional.of(DERIVATIVELY_PRICED_TRF_ONLY);
            case '5' -> Optional.of(REOPENING_TRADE);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE_TRF_OR_TEXAS_ONLY);
            case '9' -> Optional.of(CORRECTED_CONSOLIDATED_CLOSE);
            default -> Optional.empty();
        };
    }
}
