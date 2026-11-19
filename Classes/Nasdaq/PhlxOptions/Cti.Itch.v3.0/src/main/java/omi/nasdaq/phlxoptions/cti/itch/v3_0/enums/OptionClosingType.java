package omi.nasdaq.phlxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * N = Normal hours, L = Late hours, W = WCO Early Closing at 12:00 Noon (PHLX only), E = Extended Close (ETH edition)
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
    LATE_HOURS('L', "Late hours"),

    /**
     * WCO Early Closing at 12:00 Noon (PHLX Only)
     */
    WCO_EARLY_CLOSING('W', "WCO Early Closing at 12:00 Noon (PHLX Only)");

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
            case 'W' -> Optional.of(WCO_EARLY_CLOSING);
            default -> Optional.empty();
        };
    }
}
