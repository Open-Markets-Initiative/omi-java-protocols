package omi.iex.iexequities.tops.iextp.v1_66.enums;

import java.util.Optional;

/**
 * Indicates which Limit Up-Limit Down price band calculation parameter is to be used
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LuldTier {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Tier 1 Nms Stock
     */
    TIER_1_NMS_STOCK((short) 1, "Tier 1 Nms Stock"),

    /**
     * Tier 2 Nms Stock
     */
    TIER_2_NMS_STOCK((short) 2, "Tier 2 Nms Stock");

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
