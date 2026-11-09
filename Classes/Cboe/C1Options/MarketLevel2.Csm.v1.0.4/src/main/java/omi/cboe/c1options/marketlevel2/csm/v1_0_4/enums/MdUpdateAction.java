package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * Indicates how book structure changed. See table: 24 – MD UpdateActions
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdUpdateAction {

    /**
     * Insert (New level)
     */
    INSERT((short) 0, "Insert (New level)"),

    /**
     * Change (volume change of existing price)
     */
    CHANGE((short) 1, "Change (volume change of existing price)"),

    /**
     * Delete
     */
    DELETE((short) 2, "Delete"),

    /**
     * Overlay (price and volume change of existing level)
     */
    OVERLAY((short) 5, "Overlay (price and volume change of existing level)");

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
            case 0 -> Optional.of(INSERT);
            case 1 -> Optional.of(CHANGE);
            case 2 -> Optional.of(DELETE);
            case 5 -> Optional.of(OVERLAY);
            default -> Optional.empty();
        };
    }
}
