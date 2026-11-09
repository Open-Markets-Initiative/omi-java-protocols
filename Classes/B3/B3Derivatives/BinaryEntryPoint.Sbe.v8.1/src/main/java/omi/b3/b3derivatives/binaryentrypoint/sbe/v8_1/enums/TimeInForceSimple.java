package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * timeInForce
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForceSimple {

    /**
     * DAY
     */
    DAY('0', "DAY"),

    /**
     * IMMEDIATE_OR_CANCEL
     */
    IMMEDIATE_OR_CANCEL('3', "IMMEDIATE_OR_CANCEL"),

    /**
     * FILL_OR_KILL
     */
    FILL_OR_KILL('4', "FILL_OR_KILL");

    private final char wire;

    private final String description;

    TimeInForceSimple(char wire, String description) {
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
    public static Optional<TimeInForceSimple> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DAY);
            case '3' -> Optional.of(IMMEDIATE_OR_CANCEL);
            case '4' -> Optional.of(FILL_OR_KILL);
            default -> Optional.empty();
        };
    }
}
