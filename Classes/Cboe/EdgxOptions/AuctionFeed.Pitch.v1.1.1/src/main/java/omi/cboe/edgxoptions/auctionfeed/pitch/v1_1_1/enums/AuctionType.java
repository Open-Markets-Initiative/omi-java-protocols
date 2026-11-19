package omi.cboe.edgxoptions.auctionfeed.pitch.v1_1_1.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Bats Auction Mechanism
     */
    BATS_AUCTION_MECHANISM('B', "Bats Auction Mechanism"),

    /**
     * Step Up Mechanism
     */
    STEP_UP_MECHANISM('T', "Step Up Mechanism");

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
            case 'B' -> Optional.of(BATS_AUCTION_MECHANISM);
            case 'T' -> Optional.of(STEP_UP_MECHANISM);
            default -> Optional.empty();
        };
    }
}
