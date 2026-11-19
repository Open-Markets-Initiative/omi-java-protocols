package omi.eurex.t7.eti.fbe.v15_0.enums;

import java.util.Optional;

/**
 * Defines the CrossMatchInstruction values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossMatchInstruction {

    /**
     * Cancel incoming order
     */
    CANCELAGGRESSIVE((short) 1, "Cancel incoming order"),

    /**
     * Cancel resting order
     */
    CANCELPASSIVE((short) 2, "Cancel resting order"),

    /**
     * Reduce/Cancel both incoming and resting order
     */
    CANCELAGGRESSIVEANDPASSIVE((short) 3, "Reduce/Cancel both incoming and resting order"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    CrossMatchInstruction(short wire, String description) {
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
    public static Optional<CrossMatchInstruction> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CANCELAGGRESSIVE);
            case 2 -> Optional.of(CANCELPASSIVE);
            case 3 -> Optional.of(CANCELAGGRESSIVEANDPASSIVE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
