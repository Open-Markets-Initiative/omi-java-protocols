package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Type of auction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Call
     */
    OPENING_CALL('O', "Opening Call"),

    /**
     * Closing Call
     */
    CLOSING_CALL('C', "Closing Call"),

    /**
     * Halt Auction Reopening Call
     */
    HALT_AUCTION_REOPENING_CALL('H', "Halt Auction Reopening Call");

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
            case 'O' -> Optional.of(OPENING_CALL);
            case 'C' -> Optional.of(CLOSING_CALL);
            case 'H' -> Optional.of(HALT_AUCTION_REOPENING_CALL);
            default -> Optional.empty();
        };
    }
}
