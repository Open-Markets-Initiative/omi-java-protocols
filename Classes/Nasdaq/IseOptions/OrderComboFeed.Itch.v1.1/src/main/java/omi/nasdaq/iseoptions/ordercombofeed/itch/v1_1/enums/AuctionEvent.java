package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * ‘S’ = Start ‘U’ = Auction Update ‘E’ = End of Auction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionEvent {

    /**
     * Start
     */
    START('S', "Start"),

    /**
     * Auction Update
     */
    AUCTION_UPDATE('U', "Auction Update"),

    /**
     * End of Auction
     */
    END_OF_AUCTION('E', "End of Auction");

    private final char wire;

    private final String description;

    AuctionEvent(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<AuctionEvent> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(START);
            case 'U' -> Optional.of(AUCTION_UPDATE);
            case 'E' -> Optional.of(END_OF_AUCTION);
            default -> Optional.empty();
        };
    }
}
