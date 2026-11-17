package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * ‘E’ = Exposure ‘C’ = Facilitation ‘S’ = Solicitation ‘P’ = PIM
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Exposure
     */
    EXPOSURE('E'),

    /**
     * Facilitation
     */
    FACILITATION('C'),

    /**
     * Solicitation
     */
    SOLICITATION('S'),

    /**
     * PIM
     */
    PIM('P');

    private static final AuctionType[] BY_WIRE = new AuctionType[256];

    static {
        for (AuctionType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    AuctionType(char wire) {
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
    public static AuctionType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
