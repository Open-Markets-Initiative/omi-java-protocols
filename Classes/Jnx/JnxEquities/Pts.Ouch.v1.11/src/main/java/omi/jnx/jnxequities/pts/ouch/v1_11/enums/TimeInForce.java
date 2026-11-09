package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * How long the order remains in effect
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Immediate
     */
    IMMEDIATE(0x0L, "Immediate"),

    /**
     * Day
     */
    DAY(0x1869FL, "Day");

    private final long wire;

    private final String description;

    TimeInForce(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<TimeInForce> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(IMMEDIATE);
        }
        if (wire == 99999L) {
            return Optional.of(DAY);
        }
        return Optional.empty();
    }
}
