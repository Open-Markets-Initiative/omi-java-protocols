package omi.siac.cts.output.cta.v2_11_b.enums;

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
     * Cash Trade Same Day Clearing
     */
    CASH_TRADE_SAME_DAY_CLEARING('C', "Cash Trade Same Day Clearing"),

    /**
     * Automatic Execution
     */
    AUTOMATIC_EXECUTION('E', "Automatic Execution"),

    /**
     * Inter Market Sweep Order
     */
    INTER_MARKET_SWEEP_ORDER('F', "Inter Market Sweep Order"),

    /**
     * Price Variation Trade
     */
    PRICE_VARIATION_TRADE('H', "Price Variation Trade"),

    /**
     * Odd Lot Trade
     */
    ODD_LOT_TRADE('I', "Odd Lot Trade"),

    /**
     * Rule 127 Nyse Only Or Rule 155 Nyse American Only
     */
    RULE_127_NYSE_ONLY_OR_RULE_155_NYSE_AMERICAN_ONLY('K', "Rule 127 Nyse Only Or Rule 155 Nyse American Only"),

    /**
     * Sold Last Late Reporting
     */
    SOLD_LAST_LATE_REPORTING('L', "Sold Last Late Reporting"),

    /**
     * Market Center Official Close
     */
    MARKET_CENTER_OFFICIAL_CLOSE('M', "Market Center Official Close"),

    /**
     * Reserved
     */
    RESERVED_N('N', "Reserved"),

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
     * Extended Hours Sold Out Of Sequence
     */
    EXTENDED_HOURS_SOLD_OUT_OF_SEQUENCE('U', "Extended Hours Sold Out Of Sequence"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('V', "Contingent Trade"),

    /**
     * Cross Periodic Auction Trade
     */
    CROSS_PERIODIC_AUCTION_TRADE('X', "Cross Periodic Auction Trade"),

    /**
     * Sold Out Of Sequence
     */
    SOLD_OUT_OF_SEQUENCE('Z', "Sold Out Of Sequence"),

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
    RESERVED_8('8', "Reserved"),

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
            case 'C' -> Optional.of(CASH_TRADE_SAME_DAY_CLEARING);
            case 'E' -> Optional.of(AUTOMATIC_EXECUTION);
            case 'F' -> Optional.of(INTER_MARKET_SWEEP_ORDER);
            case 'H' -> Optional.of(PRICE_VARIATION_TRADE);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'K' -> Optional.of(RULE_127_NYSE_ONLY_OR_RULE_155_NYSE_AMERICAN_ONLY);
            case 'L' -> Optional.of(SOLD_LAST_LATE_REPORTING);
            case 'M' -> Optional.of(MARKET_CENTER_OFFICIAL_CLOSE);
            case 'N' -> Optional.of(RESERVED_N);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(MARKET_CENTER_OFFICIAL_OPEN);
            case 'R' -> Optional.of(SELLER);
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_SOLD_OUT_OF_SEQUENCE);
            case 'V' -> Optional.of(CONTINGENT_TRADE);
            case 'X' -> Optional.of(CROSS_PERIODIC_AUCTION_TRADE);
            case 'Z' -> Optional.of(SOLD_OUT_OF_SEQUENCE);
            case '4' -> Optional.of(DERIVATIVELY_PRICED);
            case '5' -> Optional.of(MARKET_CENTER_REOPENING_TRADE);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_TRADE);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE);
            case '8' -> Optional.of(RESERVED_8);
            case '9' -> Optional.of(CORRECTED_CONSOLIDATED_CLOSE_PRICE_AS_PER_LISTING_MARKET);
            default -> Optional.empty();
        };
    }
}
