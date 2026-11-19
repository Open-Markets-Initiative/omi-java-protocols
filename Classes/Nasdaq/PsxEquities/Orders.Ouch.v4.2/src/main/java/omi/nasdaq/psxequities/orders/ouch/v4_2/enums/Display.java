package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Display
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Display {

    /**
     * Attributable-Price to Display
     */
    ATTRIBUTABLE_PRICE('A', "Attributable-Price to Display"),

    /**
     * Anonymous-Price to Comply
     */
    ANONYMOUS_PRICE('Y', "Anonymous-Price to Comply"),

    /**
     * Non-Display
     */
    NON_DISPLAY('N', "Non-Display"),

    /**
     * Post-Only
     */
    POST_ONLY('P', "Post-Only"),

    /**
     * Entered as displayed but changed to non-displayed
     */
    CHANGED_TO_NON_DISPLAYED('Z', "Entered as displayed but changed to non-displayed"),

    /**
     * Imbalance-Only (for opening and closing cross only)
     */
    IMBALANCE_ONLY('I', "Imbalance-Only (for opening and closing cross only)"),

    /**
     * Mid-Point Peg
     */
    MID_POINT_M('M', "Mid-Point Peg"),

    /**
     * Mid-Point Peg Post Only
     */
    MID_POINT_W('W', "Mid-Point Peg Post Only");

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
            case 'A' -> Optional.of(ATTRIBUTABLE_PRICE);
            case 'Y' -> Optional.of(ANONYMOUS_PRICE);
            case 'N' -> Optional.of(NON_DISPLAY);
            case 'P' -> Optional.of(POST_ONLY);
            case 'Z' -> Optional.of(CHANGED_TO_NON_DISPLAYED);
            case 'I' -> Optional.of(IMBALANCE_ONLY);
            case 'M' -> Optional.of(MID_POINT_M);
            case 'W' -> Optional.of(MID_POINT_W);
            default -> Optional.empty();
        };
    }
}
