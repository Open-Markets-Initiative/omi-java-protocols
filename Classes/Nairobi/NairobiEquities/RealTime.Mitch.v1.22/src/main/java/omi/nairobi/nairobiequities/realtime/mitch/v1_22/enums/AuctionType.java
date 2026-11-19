package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Type of auction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Re Opening Auction
     */
    RE_OPENING_AUCTION('A', "Re Opening Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Intra Day Auction
     */
    INTRA_DAY_AUCTION('K', "Intra Day Auction"),

    /**
     * Not An Auction Trade
     */
    NOT_AN_AUCTION_TRADE(' ', "Not An Auction Trade");

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
            case 'A' -> Optional.of(RE_OPENING_AUCTION);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'K' -> Optional.of(INTRA_DAY_AUCTION);
            case ' ' -> Optional.of(NOT_AN_AUCTION_TRADE);
            default -> Optional.empty();
        };
    }
}
