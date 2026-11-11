package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the CrossTradeFlag values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossTradeFlag {

    /**
     * None (to override port setting as necessary)
     */
    NONE('0', "None (to override port setting as necessary)"),

    /**
     * Periodic Auction Only
     */
    PERIODIC_AUCTION_ONLY('1', "Periodic Auction Only"),

    /**
     * Periodic Auction Eligible
     */
    PERIODIC_AUCTION_ELIGIBLE('2', "Periodic Auction Eligible");

    private final char wire;

    private final String description;

    CrossTradeFlag(char wire, String description) {
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
    public static Optional<CrossTradeFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NONE);
            case '1' -> Optional.of(PERIODIC_AUCTION_ONLY);
            case '2' -> Optional.of(PERIODIC_AUCTION_ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
