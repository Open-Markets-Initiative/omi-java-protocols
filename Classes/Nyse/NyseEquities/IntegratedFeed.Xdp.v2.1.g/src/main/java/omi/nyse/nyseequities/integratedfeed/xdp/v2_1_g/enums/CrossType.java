package omi.nyse.nyseequities.integratedfeed.xdp.v2_1_g.enums;

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
    EARLY_OPENING('E', "Market Center Early Opening Auction"),

    /**
     * Market Center Opening Auction
     */
    OPENING('O', "Market Center Opening Auction"),

    /**
     * Market Center Reopening Auction
     */
    REOPENING('5', "Market Center Reopening Auction"),

    /**
     * Market Center Closing Auction
     */
    CLOSING('6', "Market Center Closing Auction");

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
            case 'E' -> Optional.of(EARLY_OPENING);
            case 'O' -> Optional.of(OPENING);
            case '5' -> Optional.of(REOPENING);
            case '6' -> Optional.of(CLOSING);
            default -> Optional.empty();
        };
    }
}
