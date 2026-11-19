package omi.nasdaq.phlxoptions.topofmarket.itch.v2_1.enums;

import java.util.Optional;

/**
 * Denotes which System Event is used to determine when trading ceases in this symbol.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingType {

    /**
     * Normal Hours
     */
    NORMAL_HOURS('N', "Normal Hours"),

    /**
     * Late Hours
     */
    LATE_HOURS('L', "Late Hours"),

    /**
     * WCO Early Closing
     */
    WCO_EARLY_CLOSING('W', "WCO Early Closing");

    private final char wire;

    private final String description;

    ClosingType(char wire, String description) {
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
    public static Optional<ClosingType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL_HOURS);
            case 'L' -> Optional.of(LATE_HOURS);
            case 'W' -> Optional.of(WCO_EARLY_CLOSING);
            default -> Optional.empty();
        };
    }
}
