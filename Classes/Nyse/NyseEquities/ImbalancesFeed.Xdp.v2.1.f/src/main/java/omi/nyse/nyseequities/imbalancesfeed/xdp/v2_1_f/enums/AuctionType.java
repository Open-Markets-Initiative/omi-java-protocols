package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_1_f.enums;

import java.util.Optional;

/**
 * Type of auction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Early Opening Auction (non-NYSE only)
     */
    EARLY_OPENING('O', "Early Opening Auction (non-NYSE only)"),

    /**
     * Core Opening Auction
     */
    CORE_OPENING('M', "Core Opening Auction"),

    /**
     * Reopening Auction (Halt resume)
     */
    REOPENING('H', "Reopening Auction (Halt resume)"),

    /**
     * Closing Auction
     */
    CLOSING('C', "Closing Auction"),

    /**
     * Regulatory Imbalance (NYSE only)
     */
    REGULATORY_IMBALANCE('R', "Regulatory Imbalance (NYSE only)");

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
            case 'O' -> Optional.of(EARLY_OPENING);
            case 'M' -> Optional.of(CORE_OPENING);
            case 'H' -> Optional.of(REOPENING);
            case 'C' -> Optional.of(CLOSING);
            case 'R' -> Optional.of(REGULATORY_IMBALANCE);
            default -> Optional.empty();
        };
    }
}
