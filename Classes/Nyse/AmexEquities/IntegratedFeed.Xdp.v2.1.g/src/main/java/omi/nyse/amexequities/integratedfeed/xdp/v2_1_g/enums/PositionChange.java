package omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * Currently defaulted to 0.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PositionChange {

    /**
     * Kept position in book
     */
    KEPT((short) 0, "Kept position in book"),

    /**
     * Lost position in book
     */
    LOST((short) 1, "Lost position in book");

    private final short wire;

    private final String description;

    PositionChange(short wire, String description) {
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
    public static Optional<PositionChange> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(KEPT);
            case 1 -> Optional.of(LOST);
            default -> Optional.empty();
        };
    }
}
