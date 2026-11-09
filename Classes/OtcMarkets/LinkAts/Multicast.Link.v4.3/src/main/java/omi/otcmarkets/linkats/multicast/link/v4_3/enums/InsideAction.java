package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Inside action indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InsideAction {

    /**
     * Add inside quote
     */
    ADD((short) 2, "Add inside quote"),

    /**
     * Delete inside quote
     */
    DELETE((short) 3, "Delete inside quote"),

    /**
     * Spin refresh
     */
    SPIN((short) 4, "Spin refresh");

    private final short wire;

    private final String description;

    InsideAction(short wire, String description) {
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
    public static Optional<InsideAction> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(ADD);
            case 3 -> Optional.of(DELETE);
            case 4 -> Optional.of(SPIN);
            default -> Optional.empty();
        };
    }
}
