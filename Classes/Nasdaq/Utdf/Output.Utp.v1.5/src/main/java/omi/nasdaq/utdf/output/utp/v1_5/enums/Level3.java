package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Extended Hours or Sold
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Level3 {

    /**
     * Form T
     */
    FORM_T('T', "Form T"),

    /**
     * Sold Last
     */
    SOLD_LAST('L', "Sold Last"),

    /**
     * Sold Out Of Sequence
     */
    SOLD_OUT_OF_SEQUENCE('Z', "Sold Out Of Sequence"),

    /**
     * Extended Trading Hours
     */
    EXTENDED_TRADING_HOURS('U', "Extended Trading Hours"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available"),

    /**
     * Stopped Stock
     */
    STOPPED_STOCK('1', "Stopped Stock"),

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
     * Placeholder Future
     */
    PLACEHOLDER_FUTURE('E', "Placeholder Future"),

    /**
     * Bunched Sold Trade
     */
    BUNCHED_SOLD_TRADE('G', "Bunched Sold Trade"),

    /**
     * Price Variation
     */
    PRICE_VARIATION('H', "Price Variation"),

    /**
     * Odd Lot Trade
     */
    ODD_LOT_TRADE('I', "Odd Lot Trade"),

    /**
     * Rule 155
     */
    RULE_155('K', "Rule 155"),

    /**
     * Market Center Official Close Price
     */
    MARKET_CENTER_OFFICIAL_CLOSE_PRICE('M', "Market Center Official Close Price"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Market Center Official Open Price
     */
    MARKET_CENTER_OFFICIAL_OPEN_PRICE('Q', "Market Center Official Open Price"),

    /**
     * Split Trade
     */
    SPLIT_TRADE('S', "Split Trade"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('V', "Contingent Trade"),

    /**
     * Average Price Trade
     */
    AVERAGE_PRICE_TRADE('W', "Average Price Trade"),

    /**
     * Cross Trade
     */
    CROSS_TRADE('X', "Cross Trade");

    private final char wire;

    private final String description;

    Level3(char wire, String description) {
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
    public static Optional<Level3> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(FORM_T);
            case 'L' -> Optional.of(SOLD_LAST);
            case 'Z' -> Optional.of(SOLD_OUT_OF_SEQUENCE);
            case 'U' -> Optional.of(EXTENDED_TRADING_HOURS);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            case '1' -> Optional.of(STOPPED_STOCK);
            case 'A' -> Optional.of(ACQUISITION);
            case 'B' -> Optional.of(BUNCHED);
            case 'D' -> Optional.of(DISTRIBUTION);
            case 'E' -> Optional.of(PLACEHOLDER_FUTURE);
            case 'G' -> Optional.of(BUNCHED_SOLD_TRADE);
            case 'H' -> Optional.of(PRICE_VARIATION);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'K' -> Optional.of(RULE_155);
            case 'M' -> Optional.of(MARKET_CENTER_OFFICIAL_CLOSE_PRICE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'Q' -> Optional.of(MARKET_CENTER_OFFICIAL_OPEN_PRICE);
            case 'S' -> Optional.of(SPLIT_TRADE);
            case 'V' -> Optional.of(CONTINGENT_TRADE);
            case 'W' -> Optional.of(AVERAGE_PRICE_TRADE);
            case 'X' -> Optional.of(CROSS_TRADE);
            default -> Optional.empty();
        };
    }
}
