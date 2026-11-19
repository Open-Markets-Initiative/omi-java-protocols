package omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.enums;

import java.util.Optional;

/**
 * Y = GEF Eligible, N = Not GEF Eligible
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum GefEligible {

    /**
     * GEF Eligible
     */
    GEF_ELIGIBLE('Y', "GEF Eligible"),

    /**
     * Not GEF Eligible
     */
    NOT_GEF_ELIGIBLE('N', "Not GEF Eligible");

    private final char wire;

    private final String description;

    GefEligible(char wire, String description) {
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
    public static Optional<GefEligible> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(GEF_ELIGIBLE);
            case 'N' -> Optional.of(NOT_GEF_ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
