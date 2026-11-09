package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Market Data update action
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdUpdateAction {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * Change
     */
    CHANGE((short) 1, "Change"),

    /**
     * Delete
     */
    DELETE((short) 2, "Delete"),

    /**
     * Delete Thru
     */
    DELETE_THRU((short) 3, "Delete Thru"),

    /**
     * Delete From
     */
    DELETE_FROM((short) 4, "Delete From"),

    /**
     * Overlay
     */
    OVERLAY((short) 5, "Overlay");

    private final short wire;

    private final String description;

    MdUpdateAction(short wire, String description) {
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
    public static Optional<MdUpdateAction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(CHANGE);
            case 2 -> Optional.of(DELETE);
            case 3 -> Optional.of(DELETE_THRU);
            case 4 -> Optional.of(DELETE_FROM);
            case 5 -> Optional.of(OVERLAY);
            default -> Optional.empty();
        };
    }
}
