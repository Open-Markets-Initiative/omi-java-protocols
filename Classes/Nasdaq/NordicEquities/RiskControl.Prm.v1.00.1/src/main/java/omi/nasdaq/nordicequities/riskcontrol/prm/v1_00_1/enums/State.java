package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.enums;

import java.util.Optional;

/**
 * Describes whether the restriction is currently active, previous value kept if ?
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum State {

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Inactive
     */
    INACTIVE('I', "Inactive"),

    /**
     * Previous Value Kept
     */
    PREVIOUS_VALUE_KEPT('?', "Previous Value Kept");

    private final char wire;

    private final String description;

    State(char wire, String description) {
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
    public static Optional<State> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'I' -> Optional.of(INACTIVE);
            case '?' -> Optional.of(PREVIOUS_VALUE_KEPT);
            default -> Optional.empty();
        };
    }
}
