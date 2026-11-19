package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * luldTier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LuldTier {

    /**
     * NotApplicable
     */
    NOT_APPLICABLE((short) 0, "NotApplicable"),

    /**
     * Tier1NmsStock
     */
    TIER_1_NMS_STOCK((short) 1, "Tier1NmsStock"),

    /**
     * Tier2NmsStock
     */
    TIER_2_NMS_STOCK((short) 2, "Tier2NmsStock");

    private final short wire;

    private final String description;

    LuldTier(short wire, String description) {
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
    public static Optional<LuldTier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(TIER_1_NMS_STOCK);
            case 2 -> Optional.of(TIER_2_NMS_STOCK);
            default -> Optional.empty();
        };
    }
}
