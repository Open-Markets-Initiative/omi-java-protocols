package omi.cme.globex.mdp3.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Last Security update action on Incremental feed, 'D' or 'M' is used when a mid-week deletion or modification (i.e. extension) occurs
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityUpdateAction {

    /**
     * Add
     */
    ADD('A', "Add"),

    /**
     * Delete
     */
    DELETE('D', "Delete"),

    /**
     * Modify
     */
    MODIFY('M', "Modify");

    private final char wire;

    private final String description;

    SecurityUpdateAction(char wire, String description) {
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
    public static Optional<SecurityUpdateAction> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'D' -> Optional.of(DELETE);
            case 'M' -> Optional.of(MODIFY);
            default -> Optional.empty();
        };
    }
}
