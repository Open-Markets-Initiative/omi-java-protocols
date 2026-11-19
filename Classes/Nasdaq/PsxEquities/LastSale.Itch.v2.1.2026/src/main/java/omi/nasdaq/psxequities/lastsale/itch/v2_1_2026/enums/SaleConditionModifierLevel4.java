package omi.nasdaq.psxequities.lastsale.itch.v2_1_2026.enums;

import java.util.Optional;

/**
 * Sale Condition Modifier Level 4 value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionModifierLevel4 {

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
     * PSX Official Close Price – for PSX-listed securities only
     */
    PSX_OFFICIAL_CLOSE_PRICE('M', "PSX Official Close Price \u2013 for PSX-listed securities only"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * PSX Official Opening Price – for PSX-listed securities only
     */
    PSX_OFFICIAL_OPENING_PRICE('Q', "PSX Official Opening Price \u2013 for PSX-listed securities only"),

    /**
     * Split Trade
     */
    SPLIT_TRADE('S', "Split Trade"),

    /**
     * Weighted Average Price
     */
    WEIGHTED_AVERAGE_PRICE('W', "Weighted Average Price"),

    /**
     * Cross Trade – For PSX-listed securities only
     */
    CROSS_TRADE('X', "Cross Trade \u2013 For PSX-listed securities only"),

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

    SaleConditionModifierLevel4(char wire, String description) {
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
    public static Optional<SaleConditionModifierLevel4> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACQUISITION);
            case 'B' -> Optional.of(BUNCHED);
            case 'D' -> Optional.of(DISTRIBUTION);
            case 'H' -> Optional.of(PRICE_VARIATION_TRANSACTION);
            case 'M' -> Optional.of(PSX_OFFICIAL_CLOSE_PRICE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(PSX_OFFICIAL_OPENING_PRICE);
            case 'S' -> Optional.of(SPLIT_TRADE);
            case 'W' -> Optional.of(WEIGHTED_AVERAGE_PRICE);
            case 'X' -> Optional.of(CROSS_TRADE);
            case 'o' -> Optional.of(ODD_LOT_EXECUTION);
            case 'x' -> Optional.of(ODD_LOT_CROSS_EXECUTION);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
