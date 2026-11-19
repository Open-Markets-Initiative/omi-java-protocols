package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_7.enums;

import java.util.Optional;

/**
 * Indicates whether the price on this update is outside the BATS EBBO collar: O = Outside tolerance I = Inside tolerance - = Not specified
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OutsideTolerance {

    /**
     * Outside Tolerance
     */
    OUTSIDE_TOLERANCE('O', "Outside Tolerance"),

    /**
     * Inside Tolerance
     */
    INSIDE_TOLERANCE('I', "Inside Tolerance"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    OutsideTolerance(char wire, String description) {
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
    public static Optional<OutsideTolerance> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OUTSIDE_TOLERANCE);
            case 'I' -> Optional.of(INSIDE_TOLERANCE);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
