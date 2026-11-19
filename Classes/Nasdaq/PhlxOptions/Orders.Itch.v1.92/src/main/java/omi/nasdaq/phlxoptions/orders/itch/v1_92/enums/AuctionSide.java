package omi.nasdaq.phlxoptions.orders.itch.v1_92.enums;

import java.util.Optional;

/**
 * Indicates the side of the auction:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionSide {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Solicitation auction
     */
    SOLICITATION_AUCTION('*', "Solicitation auction");

    private final char wire;

    private final String description;

    AuctionSide(char wire, String description) {
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
    public static Optional<AuctionSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case '*' -> Optional.of(SOLICITATION_AUCTION);
            default -> Optional.empty();
        };
    }
}
