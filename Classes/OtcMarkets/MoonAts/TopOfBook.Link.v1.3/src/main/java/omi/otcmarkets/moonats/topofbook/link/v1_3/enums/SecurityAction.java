package omi.otcmarkets.moonats.topofbook.link.v1_3.enums;

import java.util.Optional;

/**
 * Security action.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityAction {

    /**
     * Update.
     */
    UPDATE((short) 1, "Update."),

    /**
     * Add.
     */
    ADD((short) 2, "Add."),

    /**
     * Delete.
     */
    DELETE((short) 3, "Delete."),

    /**
     * Spin.
     */
    SPIN((short) 4, "Spin.");

    private final short wire;

    private final String description;

    SecurityAction(short wire, String description) {
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
    public static Optional<SecurityAction> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(UPDATE);
            case 2 -> Optional.of(ADD);
            case 3 -> Optional.of(DELETE);
            case 4 -> Optional.of(SPIN);
            default -> Optional.empty();
        };
    }
}
