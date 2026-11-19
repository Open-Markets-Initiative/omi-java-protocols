package omi.nyse.nyseequities.bqt.xdp.v2_1_a.enums;

import java.util.Optional;

/**
 * SRO Required Detail
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition4 {

    /**
     * N/A
     */
    NA(' ', "N/A"),

    /**
     * Regular Sale
     */
    REGULAR_SALE('@', "Regular Sale"),

    /**
     * Average Price Trade
     */
    AVERAGE_PRICE_TRADE('B', "Average Price Trade"),

    /**
     * Automatic Execution
     */
    AUTOMATIC_EXECUTION('E', "Automatic Execution"),

    /**
     * Price Variation Trade
     */
    PRICE_VARIATION_TRADE('H', "Price Variation Trade"),

    /**
     * Odd Lot Trade
     */
    ODD_LOT_TRADE('I', "Odd Lot Trade"),

    /**
     * Rule 127 (NYSE only) or Rule 155 (NYSE American Only)
     */
    RULE_127_NYSE_ONLY_OR_RULE_155_NYSE_AMERICAN_ONLY('K', "Rule 127 (NYSE only) or Rule 155 (NYSE American Only)"),

    /**
     * Official Closing Price
     */
    OFFICIAL_CLOSING_PRICE('M', "Official Closing Price"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Official Open Price
     */
    OFFICIAL_OPEN_PRICE('Q', "Official Open Price"),

    /**
     * Stock-Option Trade
     */
    STOCK_OPTION_TRADE('V', "Stock-Option Trade"),

    /**
     * Cross Trade
     */
    CROSS_TRADE('X', "Cross Trade");

    private final char wire;

    private final String description;

    TradeCondition4(char wire, String description) {
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
    public static Optional<TradeCondition4> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA);
            case '@' -> Optional.of(REGULAR_SALE);
            case 'B' -> Optional.of(AVERAGE_PRICE_TRADE);
            case 'E' -> Optional.of(AUTOMATIC_EXECUTION);
            case 'H' -> Optional.of(PRICE_VARIATION_TRADE);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'K' -> Optional.of(RULE_127_NYSE_ONLY_OR_RULE_155_NYSE_AMERICAN_ONLY);
            case 'M' -> Optional.of(OFFICIAL_CLOSING_PRICE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(OFFICIAL_OPEN_PRICE);
            case 'V' -> Optional.of(STOCK_OPTION_TRADE);
            case 'X' -> Optional.of(CROSS_TRADE);
            default -> Optional.empty();
        };
    }
}
