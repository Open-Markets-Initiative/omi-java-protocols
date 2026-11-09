package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * Which auction this imbalance is for.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Market
     */
    MARKET('M', "Market"),

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Closing
     */
    CLOSING('C', "Closing");

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
            case 'O' -> Optional.of(OPEN);
            case 'M' -> Optional.of(MARKET);
            case 'H' -> Optional.of(HALT);
            case 'C' -> Optional.of(CLOSING);
            default -> Optional.empty();
        };
    }
}
