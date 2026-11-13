package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums;

/**
 * Side of the unpaired shares at the Reference Price using orders on the Auction Book
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceSide {

    /**
     * Buy
     */
    BUY('B'),

    /**
     * Sell
     */
    SELL('S'),

    /**
     * None
     */
    NONE('N');

    private static final ImbalanceSide[] BY_WIRE = new ImbalanceSide[256];

    static {
        for (ImbalanceSide value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    ImbalanceSide(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static ImbalanceSide get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
