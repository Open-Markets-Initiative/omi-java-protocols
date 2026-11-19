package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * Defines the BboWeightIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BboWeightIndicator {

    /**
     * 0-0.2%
     */
    LESS_THAN_POINT_TWO_PERCENT('0', "0-0.2%"),

    /**
     * 0.2%-1%
     */
    LESS_THAN_ONE_PERCENT('1', "0.2%-1%"),

    /**
     * 1%-2%
     */
    LESS_THAN_TWO_PERCENT('2', "1%-2%"),

    /**
     * greater than 2%
     */
    GREATER_THAN_TWO_PERCENT('3', "greater than 2%"),

    /**
     * unspecified
     */
    UNSPECIFIED(' ', "unspecified"),

    /**
     * Sets the QBBO while joining the NBBO
     */
    SETS_THE_QBBO('S', "Sets the QBBO while joining the NBBO"),

    /**
     * Improves the NBBO upon entry
     */
    IMPROVES_THE_NBBO_UPON_ENTRY('N', "Improves the NBBO upon entry");

    private final char wire;

    private final String description;

    BboWeightIndicator(char wire, String description) {
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
    public static Optional<BboWeightIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(LESS_THAN_POINT_TWO_PERCENT);
            case '1' -> Optional.of(LESS_THAN_ONE_PERCENT);
            case '2' -> Optional.of(LESS_THAN_TWO_PERCENT);
            case '3' -> Optional.of(GREATER_THAN_TWO_PERCENT);
            case ' ' -> Optional.of(UNSPECIFIED);
            case 'S' -> Optional.of(SETS_THE_QBBO);
            case 'N' -> Optional.of(IMPROVES_THE_NBBO_UPON_ENTRY);
            default -> Optional.empty();
        };
    }
}
