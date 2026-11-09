package omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * Freeze status code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FreezeStatus {

    /**
     * Imbalance freeze not yet in effect
     */
    NO_IMBALANCE_FREEZE((short) 0, "Imbalance freeze not yet in effect"),

    /**
     * Imbalance freeze is in effect
     */
    IMBALANCE_FREEZE((short) 1, "Imbalance freeze is in effect");

    private final short wire;

    private final String description;

    FreezeStatus(short wire, String description) {
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
    public static Optional<FreezeStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_IMBALANCE_FREEZE);
            case 1 -> Optional.of(IMBALANCE_FREEZE);
            default -> Optional.empty();
        };
    }
}
