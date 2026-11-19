package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Order Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderType {

    /**
     * Market
     */
    MARKET('M'),

    /**
     * Limit
     */
    LIMIT('L');

    private static final OrderType[] BY_WIRE = new OrderType[256];

    static {
        for (OrderType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    OrderType(char wire) {
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
    public static OrderType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
