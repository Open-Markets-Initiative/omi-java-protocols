package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * Reason for the crossing auction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Market Center Early Opening Auction
     */
    MARKET_CENTER_EARLY_OPENING_AUCTION('E', "Market Center Early Opening Auction"),

    /**
     * Market Center Opening Auction
     */
    MARKET_CENTER_OPENING_AUCTION('O', "Market Center Opening Auction"),

    /**
     * Market Center Reopening Auction
     */
    MARKET_CENTER_REOPENING_AUCTION('5', "Market Center Reopening Auction"),

    /**
     * Market Center Closing Auction
     */
    MARKET_CENTER_CLOSING_AUCTION('6', "Market Center Closing Auction");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(MARKET_CENTER_EARLY_OPENING_AUCTION);
            case 'O' -> Optional.of(MARKET_CENTER_OPENING_AUCTION);
            case '5' -> Optional.of(MARKET_CENTER_REOPENING_AUCTION);
            case '6' -> Optional.of(MARKET_CENTER_CLOSING_AUCTION);
            default -> Optional.empty();
        };
    }
}
