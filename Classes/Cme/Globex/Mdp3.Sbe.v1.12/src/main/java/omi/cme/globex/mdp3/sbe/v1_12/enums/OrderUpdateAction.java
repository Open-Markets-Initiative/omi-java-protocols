package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Order book update action to be applied to the order referenced by OrderID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderUpdateAction {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * Update
     */
    UPDATE((short) 1, "Update"),

    /**
     * Delete
     */
    DELETE((short) 2, "Delete");

    private final short wire;

    private final String description;

    OrderUpdateAction(short wire, String description) {
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
    public static Optional<OrderUpdateAction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(UPDATE);
            case 2 -> Optional.of(DELETE);
            default -> Optional.empty();
        };
    }
}
