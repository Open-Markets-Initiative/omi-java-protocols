package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Identifier of exercise style
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExerciseType {

    /**
     * AMER
     */
    AMER((short) 1, "AMER"),

    /**
     * EURO
     */
    EURO((short) 2, "EURO"),

    /**
     * Not applicable
     */
    NA((short) 3, "Not applicable");

    private final short wire;

    private final String description;

    ExerciseType(short wire, String description) {
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
    public static Optional<ExerciseType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(AMER);
            case 2 -> Optional.of(EURO);
            case 3 -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
