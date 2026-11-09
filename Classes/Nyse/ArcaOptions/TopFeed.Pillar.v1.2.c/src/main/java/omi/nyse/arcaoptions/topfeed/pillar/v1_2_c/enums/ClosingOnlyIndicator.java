package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Closing Only Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingOnlyIndicator {

    /**
     * Standard Series
     */
    STANDARD_SERIES('0', "Standard Series"),

    /**
     * Call
     */
    CALL('1', "Call");

    private final char wire;

    private final String description;

    ClosingOnlyIndicator(char wire, String description) {
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
    public static Optional<ClosingOnlyIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(STANDARD_SERIES);
            case '1' -> Optional.of(CALL);
            default -> Optional.empty();
        };
    }
}
