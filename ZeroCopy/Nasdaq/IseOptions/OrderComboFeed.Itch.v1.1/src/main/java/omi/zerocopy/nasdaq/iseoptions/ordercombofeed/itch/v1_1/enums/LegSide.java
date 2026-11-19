package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Indicates the side of the leg
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSide {

    /**
     * Buy
     */
    BUY('B'),

    /**
     * Sell
     */
    SELL('S');

    private static final LegSide[] BY_WIRE = new LegSide[256];

    static {
        for (LegSide value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    LegSide(char wire) {
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
    public static LegSide get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
