package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Category 2: Reason for Trade-Through Exemption / Other Reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughExemptReason {

    /**
     * No Reason
     */
    NO_REASON(' ', "No Reason"),

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

    TradeThroughExemptReason(char wire, String description) {
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
    public static Optional<TradeThroughExemptReason> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_REASON);
            case 'F' -> Optional.of(INTERMARKET_SWEEP_ORDER);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_TRADE);
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
