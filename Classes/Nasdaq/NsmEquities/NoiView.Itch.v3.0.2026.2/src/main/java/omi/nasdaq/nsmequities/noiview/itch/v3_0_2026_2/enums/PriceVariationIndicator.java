package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026_2.enums;

import java.util.Optional;

/**
 * Deviation percentage of Near Indicative Clearing Price to Current Reference Price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceVariationIndicator {

    /**
     * Less Than 1%
     */
    LESS_THAN_1('L', "Less Than 1%"),

    /**
     * One To One Point Nine Nine Percent
     */
    ONE_TO_ONE_POINT_NINE_NINE_PERCENT('1', "One To One Point Nine Nine Percent"),

    /**
     * Two To Two Point Nine Nine Percent
     */
    TWO_TO_TWO_POINT_NINE_NINE_PERCENT('2', "Two To Two Point Nine Nine Percent"),

    /**
     * Three To Three Point Nine Nine Percent
     */
    THREE_TO_THREE_POINT_NINE_NINE_PERCENT('3', "Three To Three Point Nine Nine Percent"),

    /**
     * Four To Four Point Nine Nine Percent
     */
    FOUR_TO_FOUR_POINT_NINE_NINE_PERCENT('4', "Four To Four Point Nine Nine Percent"),

    /**
     * Five To Five Point Nine Nine Percent
     */
    FIVE_TO_FIVE_POINT_NINE_NINE_PERCENT('5', "Five To Five Point Nine Nine Percent"),

    /**
     * Six To Six Point Nine Nine Percent
     */
    SIX_TO_SIX_POINT_NINE_NINE_PERCENT('6', "Six To Six Point Nine Nine Percent"),

    /**
     * Seven To Seven Point Nine Nine Percent
     */
    SEVEN_TO_SEVEN_POINT_NINE_NINE_PERCENT('7', "Seven To Seven Point Nine Nine Percent"),

    /**
     * Eight To Eight Point Nine Nine Percent
     */
    EIGHT_TO_EIGHT_POINT_NINE_NINE_PERCENT('8', "Eight To Eight Point Nine Nine Percent"),

    /**
     * Nine To Nine Point Nine Nine Percent
     */
    NINE_TO_NINE_POINT_NINE_NINE_PERCENT('9', "Nine To Nine Point Nine Nine Percent"),

    /**
     * Ten To Nineteen Point Nine Nine Percent
     */
    TEN_TO_NINETEEN_POINT_NINE_NINE_PERCENT('A', "Ten To Nineteen Point Nine Nine Percent"),

    /**
     * Twenty To Twenty Nine Point Nine Nine Percent
     */
    TWENTY_TO_TWENTY_NINE_POINT_NINE_NINE_PERCENT('B', "Twenty To Twenty Nine Point Nine Nine Percent"),

    /**
     * Thirty Percent Or Greater
     */
    THIRTY_PERCENT_OR_GREATER('C', "Thirty Percent Or Greater"),

    /**
     * Cannot Be Calculated
     */
    CANNOT_BE_CALCULATED(' ', "Cannot Be Calculated");

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
            case ' ' -> Optional.of(CANNOT_BE_CALCULATED);
            default -> Optional.empty();
        };
    }
}
