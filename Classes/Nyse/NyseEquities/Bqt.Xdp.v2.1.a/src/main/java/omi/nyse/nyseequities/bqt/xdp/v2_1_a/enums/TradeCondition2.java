package omi.nyse.nyseequities.bqt.xdp.v2_1_a.enums;

import java.util.Optional;

/**
 * The reason for Trade Through Exemptions
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition2 {

    /**
     * N/A
     */
    NA(' ', "N/A"),

    /**
     * Intermarket Sweep Order
     */
    INTERMARKET_SWEEP_ORDER('F', "Intermarket Sweep Order"),

    /**
     * Market Center Opening Trade
     */
    MARKET_CENTER_OPENING_TRADE('O', "Market Center Opening Trade"),

    /**
     * Derivatively Priced
     */
    DERIVATIVELY_PRICED('4', "Derivatively Priced"),

    /**
     * Market Center Reopening Trade
     */
    MARKET_CENTER_REOPENING_TRADE('5', "Market Center Reopening Trade"),

    /**
     * Market Center Closing Trade
     */
    MARKET_CENTER_CLOSING_TRADE('6', "Market Center Closing Trade"),

    /**
     * Corrected Last Sale Price
     */
    CORRECTED_LAST_SALE_PRICE('9', "Corrected Last Sale Price");

    private final char wire;

    private final String description;

    TradeCondition2(char wire, String description) {
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
    public static Optional<TradeCondition2> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA);
            case 'F' -> Optional.of(INTERMARKET_SWEEP_ORDER);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
            case '4' -> Optional.of(DERIVATIVELY_PRICED);
            case '5' -> Optional.of(MARKET_CENTER_REOPENING_TRADE);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE);
            case '9' -> Optional.of(CORRECTED_LAST_SALE_PRICE);
            default -> Optional.empty();
        };
    }
}
