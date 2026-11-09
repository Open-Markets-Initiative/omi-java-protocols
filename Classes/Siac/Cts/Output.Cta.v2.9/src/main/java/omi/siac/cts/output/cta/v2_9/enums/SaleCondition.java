package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Denotes the sale condition associated with a trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleCondition {

    /**
     * Regular Sale
     */
    REGULAR_SALE(' ', "Regular Sale"),

    /**
     * Average Price Trade
     */
    AVERAGE_PRICE_TRADE('B', "Average Price Trade"),

    /**
     * Cash Trade
     */
    CASH_TRADE('C', "Cash Trade"),

    /**
     * Automatic Execution
     */
    AUTOMATIC_EXECUTION('E', "Automatic Execution"),

    /**
     * Intermarket Sweep Order
     */
    INTERMARKET_SWEEP_ORDER('F', "Intermarket Sweep Order"),

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
     * Sold Last
     */
    SOLD_LAST('L', "Sold Last"),

    /**
     * Market Center Official Close
     */
    MARKET_CENTER_OFFICIAL_CLOSE('M', "Market Center Official Close"),

    /**
     * Next Day Trade
     */
    NEXT_DAY_TRADE('N', "Next Day Trade"),

    /**
     * Market Center Opening Trade
     */
    MARKET_CENTER_OPENING_TRADE('O', "Market Center Opening Trade"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Market Center Official Open
     */
    MARKET_CENTER_OFFICIAL_OPEN('Q', "Market Center Official Open"),

    /**
     * Seller
     */
    SELLER('R', "Seller"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Sold
     */
    EXTENDED_HOURS_SOLD('U', "Extended Hours Sold"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('V', "Contingent Trade"),

    /**
     * Cross Trade
     */
    CROSS_TRADE('X', "Cross Trade"),

    /**
     * Sold
     */
    SOLD('Z', "Sold"),

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
     * Qualified Contingent Trade
     */
    QUALIFIED_CONTINGENT_TRADE('7', "Qualified Contingent Trade"),

    /**
     * Reserved
     */
    RESERVED('8', "Reserved"),

    /**
     * Corrected Consolidated Close Price As Per Listing Market
     */
    CORRECTED_CONSOLIDATED_CLOSE_PRICE_AS_PER_LISTING_MARKET('9', "Corrected Consolidated Close Price As Per Listing Market");

    private final char wire;

    private final String description;

    SaleCondition(char wire, String description) {
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
    public static Optional<SaleCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_SALE);
            case 'B' -> Optional.of(AVERAGE_PRICE_TRADE);
            case 'C' -> Optional.of(CASH_TRADE);
            case 'E' -> Optional.of(AUTOMATIC_EXECUTION);
            case 'F' -> Optional.of(INTERMARKET_SWEEP_ORDER);
            case 'H' -> Optional.of(PRICE_VARIATION_TRADE);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'K' -> Optional.of(RULE_127_OR_155);
            case 'L' -> Optional.of(SOLD_LAST);
            case 'M' -> Optional.of(MARKET_CENTER_OFFICIAL_CLOSE);
            case 'N' -> Optional.of(NEXT_DAY_TRADE);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(MARKET_CENTER_OFFICIAL_OPEN);
            case 'R' -> Optional.of(SELLER);
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_SOLD);
            case 'V' -> Optional.of(CONTINGENT_TRADE);
            case 'X' -> Optional.of(CROSS_TRADE);
            case 'Z' -> Optional.of(SOLD);
            case '4' -> Optional.of(DERIVATIVELY_PRICED);
            case '5' -> Optional.of(MARKET_CENTER_REOPENING_TRADE);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE);
            case '8' -> Optional.of(RESERVED);
            case '9' -> Optional.of(CORRECTED_CONSOLIDATED_CLOSE_PRICE_AS_PER_LISTING_MARKET);
            default -> Optional.empty();
        };
    }
}
