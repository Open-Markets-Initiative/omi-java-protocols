package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.enums;

import java.util.Optional;

/**
 * Denotes which System Event is used to trigger the option closing process.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionsClosingType {

    /**
     * Normal Hours
     */
    NORMAL('N', "Normal Hours"),

    /**
     * Late Hours
     */
    LATE('L', "Late Hours"),

    /**
     * WCO Early Closing at 12:00 Noon.
     */
    WCO_EARLY_CLOSING('W', "WCO Early Closing at 12:00 Noon.");

    private final char wire;

    private final String description;

    OptionsClosingType(char wire, String description) {
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
    public static Optional<OptionsClosingType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'L' -> Optional.of(LATE);
            case 'W' -> Optional.of(WCO_EARLY_CLOSING);
            default -> Optional.empty();
        };
    }
}
