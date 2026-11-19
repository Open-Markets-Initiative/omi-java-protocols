package omi.nasdaq.nsmequities.drop.asciidrop.v2_3.enums;

import java.util.Optional;

/**
 * BBO weighting indicator.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BboWeightingIndicator {

    /**
     * 0 = 0-0.2%
     */
    ZERO_TO_POINT_TWO_PERCENT('0', "0 = 0-0.2%"),

    /**
     * 1 = 0.2%-1%
     */
    POINT_TWO_TO_ONE_PERCENT('1', "1 = 0.2%-1%"),

    /**
     * 2 = 1%-2%
     */
    ONE_TO_TWO_PERCENT('2', "2 = 1%-2%"),

    /**
     * 3 = greater than 2%
     */
    GREATER_THAN_TWO_PERCENT('3', "3 = greater than 2%");

    private final char wire;

    private final String description;

    BboWeightingIndicator(char wire, String description) {
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
    public static Optional<BboWeightingIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(ZERO_TO_POINT_TWO_PERCENT);
            case '1' -> Optional.of(POINT_TWO_TO_ONE_PERCENT);
            case '2' -> Optional.of(ONE_TO_TWO_PERCENT);
            case '3' -> Optional.of(GREATER_THAN_TWO_PERCENT);
            default -> Optional.empty();
        };
    }
}
