package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * N = Normal hours, L = Late hours, W = WCO Early Closing at 12:00 Noon (PHLX Only)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionClosingType {

    /**
     * Normal hours
     */
    NORMAL_HOURS('N', "Normal hours"),

    /**
     * Late hours
     */
    LATE_HOURS('L', "Late hours");

    private final char wire;

    private final String description;

    OptionClosingType(char wire, String description) {
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
    public static Optional<OptionClosingType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL_HOURS);
            case 'L' -> Optional.of(LATE_HOURS);
            default -> Optional.empty();
        };
    }
}
