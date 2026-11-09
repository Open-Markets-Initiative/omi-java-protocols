package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.enums;

import java.util.Optional;

/**
 * State Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum State {

    /**
     * Inactive
     */
    INACTIVE('I', "Inactive"),

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Disabled
     */
    DISABLED('D', "Disabled"),

    /**
     * Enabled
     */
    ENABLED('E', "Enabled");

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
            case 'I' -> Optional.of(INACTIVE);
            case 'A' -> Optional.of(ACTIVE);
            case 'D' -> Optional.of(DISABLED);
            case 'E' -> Optional.of(ENABLED);
            default -> Optional.empty();
        };
    }
}
