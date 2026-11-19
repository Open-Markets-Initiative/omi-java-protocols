package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionEvent {

    /**
     * Start
     */
    START('S'),

    /**
     * Auction Update
     */
    AUCTION_UPDATE('U'),

    /**
     * End of Auction
     */
    END_OF_AUCTION('E');

    private static final AuctionEvent[] BY_WIRE = new AuctionEvent[256];

    static {
        for (AuctionEvent value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    AuctionEvent(char wire) {
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
    public static AuctionEvent get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
