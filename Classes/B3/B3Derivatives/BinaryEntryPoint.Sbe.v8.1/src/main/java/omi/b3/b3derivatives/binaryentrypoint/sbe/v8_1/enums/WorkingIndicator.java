package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * workingIndicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum WorkingIndicator {

    /**
     * false, N, 0
     */
    FALSE_VALUE((short) 0, "false, N, 0"),

    /**
     * true, Y, 1
     */
    TRUE_VALUE((short) 1, "true, Y, 1");

    private final short wire;

    private final String description;

    WorkingIndicator(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<WorkingIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE_VALUE);
            case 1 -> Optional.of(TRUE_VALUE);
            default -> Optional.empty();
        };
    }
}
