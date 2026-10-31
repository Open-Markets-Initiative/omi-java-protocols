package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.enums;

import java.util.Optional;

/**
 * Indicates the absolute value of the percentage of deviation of the Near Indicative Clearing Price to the nearest Current Reference Price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceVariationIndicator {

    /**
     * Less than 1%
     */
    LESS_THAN_1_PERCENT('L', "Less than 1%"),

    /**
     * 1 to 1.99%
     */
    LESS_THAN_2_PERCENT('1', "1 to 1.99%"),

    /**
     * 2 to 2.99%
     */
    LESS_THAN_3_PERCENT('2', "2 to 2.99%"),

    /**
     * 3 to 3.99%
     */
    LESS_THAN_4_PERCENT('3', "3 to 3.99%"),

    /**
     * 4 to 4.99%
     */
    LESS_THAN_5_PERCENT('4', "4 to 4.99%"),

    /**
     * 5 to 5.99%
     */
    LESS_THAN_6_PERCENT('5', "5 to 5.99%"),

    /**
     * 6 to 6.99%
     */
    LESS_THAN_7_PERCENT('6', "6 to 6.99%"),

    /**
     * 7 to 7.99%
     */
    LESS_THAN_8_PERCENT('7', "7 to 7.99%"),

    /**
     * 8 to 8.99%
     */
    LESS_THAN_9_PERCENT('8', "8 to 8.99%"),

    /**
     * 9 to 9.99%
     */
    LESS_THAN_10_PERCENT('9', "9 to 9.99%"),

    /**
     * 10 to 19.99%
     */
    LESS_THAN_20_PERCENT('A', "10 to 19.99%"),

    /**
     * 20 to 29.99%
     */
    LESS_THAN_30_PERCENT('B', "20 to 29.99%"),

    /**
     * 30% or greater
     */
    MORE_THAN_30_PERCENT('C', "30% or greater"),

    /**
     * Cannot be calculated
     */
    NOT_AVAILABLE(' ', "Cannot be calculated");

    private final char wire;

    private final String description;

    PriceVariationIndicator(char wire, String description) {
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
    public static Optional<PriceVariationIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LESS_THAN_1_PERCENT);
            case '1' -> Optional.of(LESS_THAN_2_PERCENT);
            case '2' -> Optional.of(LESS_THAN_3_PERCENT);
            case '3' -> Optional.of(LESS_THAN_4_PERCENT);
            case '4' -> Optional.of(LESS_THAN_5_PERCENT);
            case '5' -> Optional.of(LESS_THAN_6_PERCENT);
            case '6' -> Optional.of(LESS_THAN_7_PERCENT);
            case '7' -> Optional.of(LESS_THAN_8_PERCENT);
            case '8' -> Optional.of(LESS_THAN_9_PERCENT);
            case '9' -> Optional.of(LESS_THAN_10_PERCENT);
            case 'A' -> Optional.of(LESS_THAN_20_PERCENT);
            case 'B' -> Optional.of(LESS_THAN_30_PERCENT);
            case 'C' -> Optional.of(MORE_THAN_30_PERCENT);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
