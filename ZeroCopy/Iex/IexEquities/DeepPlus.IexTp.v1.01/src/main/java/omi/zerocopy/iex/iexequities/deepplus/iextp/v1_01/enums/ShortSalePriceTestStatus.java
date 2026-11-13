package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.enums;

/**
 * Reg. SHO short sale price test restriction status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSalePriceTestStatus {

    /**
     * Not In Effect
     */
    NOT_IN_EFFECT((short) 0),

    /**
     * In Effect
     */
    IN_EFFECT((short) 1);

    private static final ShortSalePriceTestStatus[] BY_WIRE = new ShortSalePriceTestStatus[256];

    static {
        for (ShortSalePriceTestStatus value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final short wire;

    ShortSalePriceTestStatus(short wire) {
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
    public static ShortSalePriceTestStatus get(short wire) {
        return wire >= 0 && wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
