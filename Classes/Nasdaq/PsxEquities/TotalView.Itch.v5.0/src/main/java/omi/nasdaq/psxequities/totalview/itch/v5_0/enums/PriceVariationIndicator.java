package omi.nasdaq.psxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * This field indicates the absolute value of the percentage of deviation of the Near Indicative Clearing Price to the nearest Current Reference Price.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceVariationIndicator {

    /**
     * Less than 1%
     */
    LESS_THAN_1('L', "Less than 1%"),

    /**
     * 1 to 1.99%
     */
    ONE_TO_ONE_POINT_NINE_NINE_PERCENT('1', "1 to 1.99%"),

    /**
     * 2 to 2.99%
     */
    TWO_TO_TWO_POINT_NINE_NINE_PERCENT('2', "2 to 2.99%"),

    /**
     * 3 to 3.99%
     */
    THREE_TO_THREE_POINT_NINE_NINE_PERCENT('3', "3 to 3.99%"),

    /**
     * 4 to 4.99%
     */
    FOUR_TO_FOUR_POINT_NINE_NINE_PERCENT('4', "4 to 4.99%"),

    /**
     * 5 to 5.99%
     */
    FIVE_TO_FIVE_POINT_NINE_NINE_PERCENT('5', "5 to 5.99%"),

    /**
     * 6 to 6.99%
     */
    SIX_TO_SIX_POINT_NINE_NINE_PERCENT('6', "6 to 6.99%"),

    /**
     * 7 to 7.99%
     */
    SEVEN_TO_SEVEN_POINT_NINE_NINE_PERCENT('7', "7 to 7.99%"),

    /**
     * 8 to 8.99%
     */
    EIGHT_TO_EIGHT_POINT_NINE_NINE_PERCENT('8', "8 to 8.99%"),

    /**
     * 9 to 9.99%
     */
    NINE_TO_NINE_POINT_NINE_NINE_PERCENT('9', "9 to 9.99%"),

    /**
     * 10 to 19.99%
     */
    TEN_TO_NINETEEN_POINT_NINE_NINE_PERCENT('A', "10 to 19.99%"),

    /**
     * 20 to 29.99%
     */
    TWENTY_TO_TWENTY_NINE_POINT_NINE_NINE_PERCENT('B', "20 to 29.99%"),

    /**
     * 30% or greater
     */
    THIRTY_PERCENT_OR_GREATER('C', "30% or greater"),

    /**
     * Cannot be calculated
     */
    NO_CALCULATION(' ', "Cannot be calculated");

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
            case 'L' -> Optional.of(LESS_THAN_1);
            case '1' -> Optional.of(ONE_TO_ONE_POINT_NINE_NINE_PERCENT);
            case '2' -> Optional.of(TWO_TO_TWO_POINT_NINE_NINE_PERCENT);
            case '3' -> Optional.of(THREE_TO_THREE_POINT_NINE_NINE_PERCENT);
            case '4' -> Optional.of(FOUR_TO_FOUR_POINT_NINE_NINE_PERCENT);
            case '5' -> Optional.of(FIVE_TO_FIVE_POINT_NINE_NINE_PERCENT);
            case '6' -> Optional.of(SIX_TO_SIX_POINT_NINE_NINE_PERCENT);
            case '7' -> Optional.of(SEVEN_TO_SEVEN_POINT_NINE_NINE_PERCENT);
            case '8' -> Optional.of(EIGHT_TO_EIGHT_POINT_NINE_NINE_PERCENT);
            case '9' -> Optional.of(NINE_TO_NINE_POINT_NINE_NINE_PERCENT);
            case 'A' -> Optional.of(TEN_TO_NINETEEN_POINT_NINE_NINE_PERCENT);
            case 'B' -> Optional.of(TWENTY_TO_TWENTY_NINE_POINT_NINE_NINE_PERCENT);
            case 'C' -> Optional.of(THIRTY_PERCENT_OR_GREATER);
            case ' ' -> Optional.of(NO_CALCULATION);
            default -> Optional.empty();
        };
    }
}
