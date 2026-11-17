package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * ‘B’ = Bid ‘A’ = Offer (Ask) ‘ ’ (blank) = not set (hidden)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Bid
     */
    BID('B'),

    /**
     * Offer (Ask)
     */
    OFFER_ASK('A'),

    /**
     * Hidden
     */
    HIDDEN(' ');

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
