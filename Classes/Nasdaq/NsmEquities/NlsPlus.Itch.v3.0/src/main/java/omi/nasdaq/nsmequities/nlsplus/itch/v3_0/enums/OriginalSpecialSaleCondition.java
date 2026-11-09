package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Used for special sale condition codes. This field is case sensitive
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginalSpecialSaleCondition {

    /**
     * Acquisition
     */
    ACQUISITION('A', "Acquisition"),

    /**
     * Bunched
     */
    BUNCHED('B', "Bunched"),

    /**
     * Distribution
     */
    DISTRIBUTION('D', "Distribution"),

    /**
     * Price Variation Transaction
     */
    PRICE_VARIATION_TRANSACTION('H', "Price Variation Transaction"),

    /**
     * Nasdaq Official Close Price (NOCP)
     */
    NASDAQ_OFFICIAL_CLOSE_PRICE('M', "Nasdaq Official Close Price (NOCP)"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Nasdaq Official Opening Price (NOOP)
     */
    NASDAQ_OFFICIAL_OPENING_PRICE('Q', "Nasdaq Official Opening Price (NOOP)"),

    /**
     * Split Trade
     */
    SPLIT_TRADE('S', "Split Trade"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('V', "Contingent Trade"),

    /**
     * Average Price Trade. Nls Plus uses this code for all Average Price Trades regardless of listing market
     */
    AVERAGE_PRICE_TRADE('W', "Average Price Trade. Nls Plus uses this code for all Average Price Trades regardless of listing market"),

    /**
     * Cross Trade
     */
    CROSS_TRADE('X', "Cross Trade"),

    /**
     * Odd lot execution
     */
    ODD_LOT_EXECUTION('o', "Odd lot execution"),

    /**
     * Odd Lot Cross execution
     */
    ODD_LOT_CROSS_EXECUTION('x', "Odd Lot Cross execution"),

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable");

    private final char wire;

    private final String description;

    OriginalSpecialSaleCondition(char wire, String description) {
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
    public static Optional<OriginalSpecialSaleCondition> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACQUISITION);
            case 'B' -> Optional.of(BUNCHED);
            case 'D' -> Optional.of(DISTRIBUTION);
            case 'H' -> Optional.of(PRICE_VARIATION_TRANSACTION);
            case 'M' -> Optional.of(NASDAQ_OFFICIAL_CLOSE_PRICE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(NASDAQ_OFFICIAL_OPENING_PRICE);
            case 'S' -> Optional.of(SPLIT_TRADE);
            case 'V' -> Optional.of(CONTINGENT_TRADE);
            case 'W' -> Optional.of(AVERAGE_PRICE_TRADE);
            case 'X' -> Optional.of(CROSS_TRADE);
            case 'o' -> Optional.of(ODD_LOT_EXECUTION);
            case 'x' -> Optional.of(ODD_LOT_CROSS_EXECUTION);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
