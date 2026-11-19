package omi.cme.brokertec.ustreasury.sbe.v10_1.enums;

import java.util.Optional;

/**
 * Indicates the type of Market Data update action
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdUpdateAction {

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
            case 1 -> Optional.of(UPDATE);
            case 2 -> Optional.of(DELETE);
            default -> Optional.empty();
        };
    }
}
