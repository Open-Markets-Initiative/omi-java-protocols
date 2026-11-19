package omi.nasdaq.phlxoptions.orders.itch.v1_92.enums;

import java.util.Optional;

/**
 * Defines the state of the strategy
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Action {

    /**
     * Add
     */
    ADD('A', "Add"),

    /**
     * Delete
     */
    DELETE('D', "Delete");

    private final char wire;

    private final String description;

    Action(char wire, String description) {
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
    public static Optional<Action> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'D' -> Optional.of(DELETE);
            default -> Optional.empty();
        };
    }
}
