package omi.jpx.nseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the lot size unit flag.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LotSizeUnitFlag {

    /**
     * All the decimal places are valid.
     */
    TO_THE_FOURTH_DECIMAL_PLACE('0', "All the decimal places are valid."),

    /**
     * The fourth decimal place is always zero.
     */
    TO_THE_THIRD_DECIMAL_PLACE('1', "The fourth decimal place is always zero."),

    /**
     * The third and fourth decimal places are always zero.
     */
    TO_THE_SECOND_DECIMAL_PLACE('2', "The third and fourth decimal places are always zero."),

    /**
     * The second, third and fourth decimal places are always zero.
     */
    TO_THE_FIRST_DECIMAL_PLACE('3', "The second, third and fourth decimal places are always zero."),

    /**
     * All the decimal places are zero.
     */
    NO_DECIMAL_PLACES('4', "All the decimal places are zero."),

    /**
     * Spaces are set if the numerical part are set to spaces.
     */
    NO_NUMERICAL_VALUE(' ', "Spaces are set if the numerical part are set to spaces.");

    private final char wire;

    private final String description;

    LotSizeUnitFlag(char wire, String description) {
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
    public static Optional<LotSizeUnitFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(TO_THE_FOURTH_DECIMAL_PLACE);
            case '1' -> Optional.of(TO_THE_THIRD_DECIMAL_PLACE);
            case '2' -> Optional.of(TO_THE_SECOND_DECIMAL_PLACE);
            case '3' -> Optional.of(TO_THE_FIRST_DECIMAL_PLACE);
            case '4' -> Optional.of(NO_DECIMAL_PLACES);
            case ' ' -> Optional.of(NO_NUMERICAL_VALUE);
            default -> Optional.empty();
        };
    }
}
