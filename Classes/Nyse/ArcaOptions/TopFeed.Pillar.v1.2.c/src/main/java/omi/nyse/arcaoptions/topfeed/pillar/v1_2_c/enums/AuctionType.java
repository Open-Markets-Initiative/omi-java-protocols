package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * AuctionType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Core Opening Auction
     */
    OPENING('O', "Core Opening Auction"),

    /**
     * Reopening Auction (Halt resume)
     */
    REOPENING('H', "Reopening Auction (Halt resume)");

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
            case 'O' -> Optional.of(OPENING);
            case 'H' -> Optional.of(REOPENING);
            default -> Optional.empty();
        };
    }
}
