package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * posTransType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PosTransType {

    /**
     * EXERCISE
     */
    EXERCISE((short) 1, "EXERCISE"),

    /**
     * AUTOMATIC_EXERCISE
     */
    AUTOMATIC_EXERCISE((short) 105, "AUTOMATIC_EXERCISE"),

    /**
     * EXERCISE_NOT_AUTOMATIC
     */
    EXERCISE_NOT_AUTOMATIC((short) 106, "EXERCISE_NOT_AUTOMATIC");

    private final short wire;

    private final String description;

    PosTransType(short wire, String description) {
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
    public static Optional<PosTransType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EXERCISE);
            case 105 -> Optional.of(AUTOMATIC_EXERCISE);
            case 106 -> Optional.of(EXERCISE_NOT_AUTOMATIC);
            default -> Optional.empty();
        };
    }
}
