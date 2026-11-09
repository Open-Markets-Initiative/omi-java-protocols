package omi.nyse.nyseequities.integratedfeedrefresh.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Auction type indicator.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Early Opening Auction
     */
    EARLY_OPENING_AUCTION('O', "Early Opening Auction"),

    /**
     * Core Opening Auction
     */
    CORE_OPENING_AUCTION('M', "Core Opening Auction"),

    /**
     * Reopening Auction Halt Resume
     */
    REOPENING_AUCTION_HALT_RESUME('H', "Reopening Auction Halt Resume"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Extreme Closing Imbalance
     */
    EXTREME_CLOSING_IMBALANCE('P', "Extreme Closing Imbalance"),

    /**
     * Significant Closing Imbalance
     */
    SIGNIFICANT_CLOSING_IMBALANCE('R', "Significant Closing Imbalance");

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
            case 'O' -> Optional.of(EARLY_OPENING_AUCTION);
            case 'M' -> Optional.of(CORE_OPENING_AUCTION);
            case 'H' -> Optional.of(REOPENING_AUCTION_HALT_RESUME);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'P' -> Optional.of(EXTREME_CLOSING_IMBALANCE);
            case 'R' -> Optional.of(SIGNIFICANT_CLOSING_IMBALANCE);
            default -> Optional.empty();
        };
    }
}
