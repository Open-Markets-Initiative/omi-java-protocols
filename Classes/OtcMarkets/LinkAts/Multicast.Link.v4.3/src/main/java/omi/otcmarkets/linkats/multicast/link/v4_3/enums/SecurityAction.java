package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Security action indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityAction {

    /**
     * Update existing security
     */
    UPDATE((short) 1, "Update existing security"),

    /**
     * Add new security
     */
    ADD((short) 2, "Add new security"),

    /**
     * Delete security
     */
    DELETE((short) 3, "Delete security"),

    /**
     * Spin refresh event
     */
    SPIN((short) 4, "Spin refresh event");

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
