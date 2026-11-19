package omi.nyse.arcaequities.arcabook.xdp.v1_9_a.enums;

import java.util.Optional;

/**
 * Auction type. For the NYSE / NYSE MKT, the opening imbalance will have an "M" Auction Type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Open 4 Am Arca Only
     */
    OPEN_4_AM_ARCA_ONLY('O', "Open 4 Am Arca Only"),

    /**
     * Market 930 Am
     */
    MARKET_930_AM('M', "Market 930 Am"),

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Closing
     */
    CLOSING('C', "Closing"),

    /**
     * Regulatory Imbalance
     */
    REGULATORY_IMBALANCE('R', "Regulatory Imbalance");

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
            case 'O' -> Optional.of(OPEN_4_AM_ARCA_ONLY);
            case 'M' -> Optional.of(MARKET_930_AM);
            case 'H' -> Optional.of(HALT);
            case 'C' -> Optional.of(CLOSING);
            case 'R' -> Optional.of(REGULATORY_IMBALANCE);
            default -> Optional.empty();
        };
    }
}
