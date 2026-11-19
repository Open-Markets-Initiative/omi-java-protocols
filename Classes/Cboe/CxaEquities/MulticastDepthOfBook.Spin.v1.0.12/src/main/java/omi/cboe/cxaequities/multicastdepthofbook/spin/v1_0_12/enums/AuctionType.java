package omi.cboe.cxaequities.multicastdepthofbook.spin.v1_0_12.enums;

import java.util.Optional;

/**
 * Auction type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Intraday Auction
     */
    OPENING_INTRADAY_AUCTION('O', "Opening Intraday Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Halt Auction Re Opening
     */
    HALT_AUCTION_RE_OPENING('H', "Halt Auction Re Opening");

    private final char wire;

    private final String description;

    AuctionType(char wire, String description) {
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
    public static Optional<AuctionType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_INTRADAY_AUCTION);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'H' -> Optional.of(HALT_AUCTION_RE_OPENING);
            default -> Optional.empty();
        };
    }
}
