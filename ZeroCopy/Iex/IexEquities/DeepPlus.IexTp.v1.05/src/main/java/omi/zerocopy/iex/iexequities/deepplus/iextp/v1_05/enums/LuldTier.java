package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums;

/**
 * Indicates which Limit Up-Limit Down price band calculation parameter is to be used
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LuldTier {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0),

    /**
     * Tier 1 Nms Stock
     */
    TIER_1_NMS_STOCK((short) 1),

    /**
     * Tier 2 Nms Stock
     */
    TIER_2_NMS_STOCK((short) 2);

    private static final LuldTier[] BY_WIRE = new LuldTier[256];

    static {
        for (LuldTier value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final short wire;

    LuldTier(short wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public short wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static LuldTier get(short wire) {
        return wire >= 0 && wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
