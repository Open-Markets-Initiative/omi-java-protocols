package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Time in Force
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Regular Hours Only
     */
    REGULAR_HOURS_ONLY('R', "Regular Hours Only"),

    /**
     * Immediate Or Cancel
     */
    IMMEDIATE_OR_CANCEL('I', "Immediate Or Cancel");

    private final char wire;

    private final String description;

    TimeInForce(char wire, String description) {
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
    public static Optional<TimeInForce> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REGULAR_HOURS_ONLY);
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL);
            default -> Optional.empty();
        };
    }
}
