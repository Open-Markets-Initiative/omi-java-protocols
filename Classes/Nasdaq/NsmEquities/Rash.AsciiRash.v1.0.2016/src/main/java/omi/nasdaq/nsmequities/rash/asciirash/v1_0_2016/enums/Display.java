package omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.enums;

import java.util.Optional;

/**
 * Display instruction; see the Display values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Display {

    /**
     * Anonymous-Price to Comply
     */
    ANONYMOUS_PRICE_TO_COMPLY('Y', "Anonymous-Price to Comply"),

    /**
     * Non-Displayed
     */
    NON_DISPLAYED('N', "Non-Displayed"),

    /**
     * Attributable-Price to Display
     */
    ATTRIBUTABLE_PRICE_TO_DISPLAY('A', "Attributable-Price to Display"),

    /**
     * Imbalance Only
     */
    IMBALANCE_ONLY('I', "Imbalance Only"),

    /**
     * Post-Only
     */
    POST_ONLY('P', "Post-Only"),

    /**
     * Mid-Point Peg Post Only
     */
    MID_POINT_PEG_POST_ONLY('W', "Mid-Point Peg Post Only"),

    /**
     * Post-Only and Attributable - Price to Display
     */
    POST_ONLY_AND_ATTRIBUTABLE_PRICE_TO_DISPLAY('L', "Post-Only and Attributable - Price to Display"),

    /**
     * Retail Order Type 1
     */
    RETAIL_ORDER_TYPE_1('O', "Retail Order Type 1"),

    /**
     * Retail Order Type 2
     */
    RETAIL_ORDER_TYPE_2('T', "Retail Order Type 2"),

    /**
     * Retail Price Improvement Order
     */
    RETAIL_PRICE_IMPROVEMENT_ORDER('Q', "Retail Price Improvement Order"),

    /**
     * Mid-Point Peg
     */
    MID_POINT_PEG('M', "Mid-Point Peg");

    private final char wire;

    private final String description;

    Display(char wire, String description) {
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
    public static Optional<Display> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ANONYMOUS_PRICE_TO_COMPLY);
            case 'N' -> Optional.of(NON_DISPLAYED);
            case 'A' -> Optional.of(ATTRIBUTABLE_PRICE_TO_DISPLAY);
            case 'I' -> Optional.of(IMBALANCE_ONLY);
            case 'P' -> Optional.of(POST_ONLY);
            case 'W' -> Optional.of(MID_POINT_PEG_POST_ONLY);
            case 'L' -> Optional.of(POST_ONLY_AND_ATTRIBUTABLE_PRICE_TO_DISPLAY);
            case 'O' -> Optional.of(RETAIL_ORDER_TYPE_1);
            case 'T' -> Optional.of(RETAIL_ORDER_TYPE_2);
            case 'Q' -> Optional.of(RETAIL_PRICE_IMPROVEMENT_ORDER);
            case 'M' -> Optional.of(MID_POINT_PEG);
            default -> Optional.empty();
        };
    }
}
