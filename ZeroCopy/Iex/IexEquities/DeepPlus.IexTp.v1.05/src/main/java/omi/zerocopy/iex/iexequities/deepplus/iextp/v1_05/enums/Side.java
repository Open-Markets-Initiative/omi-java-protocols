package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums;

/**
 * Side of order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Buy
     */
    BUY('8'),

    /**
     * Sell
     */
    SELL('5');

    private static final Side[] BY_WIRE = new Side[256];

    static {
        for (Side value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    Side(char wire) {
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
    public static Side get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
