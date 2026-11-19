package omi.txse.txseequities.bale.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum ExcessAuctionSide. Side with surplus Auction-Only volume.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ExcessAuctionSide {

    /**
     * Buy and sell Auction-Only interest are balanced (equal volume on each side), or no Auction-Only interest is currently in the book.
     */
    EQUAL((byte) 0, "Buy and sell Auction-Only interest are balanced (equal volume on each side), or no Auction-Only interest is currently in the book."),

    /**
     * Buy interest exceeds sell interest.
     */
    BUY((byte) 1, "Buy interest exceeds sell interest."),

    /**
     * Sell interest exceeds buy interest.
     */
    SELL((byte) 2, "Sell interest exceeds buy interest.");

    private final byte wire;

    private final String description;

    ExcessAuctionSide(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ExcessAuctionSide> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(EQUAL);
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
