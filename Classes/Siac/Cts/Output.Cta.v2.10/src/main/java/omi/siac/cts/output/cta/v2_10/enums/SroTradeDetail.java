package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Category 4: SRO Trade Detail
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SroTradeDetail {

    /**
     * No Sro Required Trade Detail
     */
    NO_SRO_REQUIRED_TRADE_DETAIL(' ', "No Sro Required Trade Detail"),

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
     * Rule 127 Or 155
     */
    RULE_127_OR_155('K', "Rule 127 Or 155"),

    /**
     * Market Center Official Close
     */
    MARKET_CENTER_OFFICIAL_CLOSE('M', "Market Center Official Close"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Market Center Official Open
     */
    MARKET_CENTER_OFFICIAL_OPEN('Q', "Market Center Official Open"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('V', "Contingent Trade"),

    /**
     * Cross / Periodic Auction Trade
     */
    CROSS_TRADE('X', "Cross / Periodic Auction Trade");

    private final char wire;

    private final String description;

    SroTradeDetail(char wire, String description) {
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
    public static Optional<SroTradeDetail> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_SRO_REQUIRED_TRADE_DETAIL);
            case 'B' -> Optional.of(AVERAGE_PRICE_TRADE);
            case 'E' -> Optional.of(AUTOMATIC_EXECUTION);
            case 'H' -> Optional.of(PRICE_VARIATION_TRADE);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'K' -> Optional.of(RULE_127_OR_155);
            case 'M' -> Optional.of(MARKET_CENTER_OFFICIAL_CLOSE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(MARKET_CENTER_OFFICIAL_OPEN);
            case 'V' -> Optional.of(CONTINGENT_TRADE);
            case 'X' -> Optional.of(CROSS_TRADE);
            default -> Optional.empty();
        };
    }
}
