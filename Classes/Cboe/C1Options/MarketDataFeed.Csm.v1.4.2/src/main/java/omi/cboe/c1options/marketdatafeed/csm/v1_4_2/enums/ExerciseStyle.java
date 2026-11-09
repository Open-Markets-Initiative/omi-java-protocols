package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.enums;

import java.util.Optional;

/**
 * Defines the ExerciseStyle values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExerciseStyle {

    /**
     * American
     */
    AMERICAN((short) 0, "American"),

    /**
     * European
     */
    EUROPEAN((short) 1, "European");

    private final short wire;

    private final String description;

    ExerciseStyle(short wire, String description) {
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
    public static Optional<ExerciseStyle> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(AMERICAN);
            case 1 -> Optional.of(EUROPEAN);
            default -> Optional.empty();
        };
    }
}
