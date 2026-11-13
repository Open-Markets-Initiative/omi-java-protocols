package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.enums;

/**
 * Auction type identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O'),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C'),

    /**
     * Ipo Auction
     */
    IPO_AUCTION('I'),

    /**
     * Halt Auction
     */
    HALT_AUCTION('H'),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION('V');

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
