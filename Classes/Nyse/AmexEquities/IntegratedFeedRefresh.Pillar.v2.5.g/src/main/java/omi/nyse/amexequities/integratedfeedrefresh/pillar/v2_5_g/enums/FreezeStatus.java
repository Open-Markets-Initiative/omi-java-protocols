package omi.nyse.amexequities.integratedfeedrefresh.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Indicates an Imbalance Freeze for the auction.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FreezeStatus {

    /**
     * Imbalance Freeze Not In Effect
     */
    IMBALANCE_FREEZE_NOT_IN_EFFECT((short) 0, "Imbalance Freeze Not In Effect"),

    /**
     * Imbalance Freeze Is In Effect
     */
    IMBALANCE_FREEZE_IS_IN_EFFECT((short) 1, "Imbalance Freeze Is In Effect");

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
            case 0 -> Optional.of(IMBALANCE_FREEZE_NOT_IN_EFFECT);
            case 1 -> Optional.of(IMBALANCE_FREEZE_IS_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
