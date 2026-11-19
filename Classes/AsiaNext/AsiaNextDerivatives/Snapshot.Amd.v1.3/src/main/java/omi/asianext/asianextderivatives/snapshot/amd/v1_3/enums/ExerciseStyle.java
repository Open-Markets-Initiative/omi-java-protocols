package omi.asianext.asianextderivatives.snapshot.amd.v1_3.enums;

import java.util.Optional;

/**
 * The exercise style of the contract
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExerciseStyle {

    /**
     * American
     */
    AMERICAN((short) 1, "American"),

    /**
     * European
     */
    EUROPEAN((short) 2, "European"),

    /**
     * Asian
     */
    ASIAN((short) 3, "Asian"),

    /**
     * Bermudan
     */
    BERMUDAN((short) 4, "Bermudan");

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
            case 1 -> Optional.of(AMERICAN);
            case 2 -> Optional.of(EUROPEAN);
            case 3 -> Optional.of(ASIAN);
            case 4 -> Optional.of(BERMUDAN);
            default -> Optional.empty();
        };
    }
}
