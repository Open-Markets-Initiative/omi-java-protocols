package omi.lseg.millennium.level2replay.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Aesp
     */
    AESP('A', "Aesp"),

    /**
     * Edsp
     */
    EDSP('B', "Edsp"),

    /**
     * Resume Auction
     */
    RESUME_AUCTION('E', "Resume Auction"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('F', "Periodic Auction"),

    /**
     * Scheduled Level 1 Only Auction
     */
    SCHEDULED_LEVEL_1_ONLY_AUCTION('G', "Scheduled Level 1 Only Auction");

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
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'A' -> Optional.of(AESP);
            case 'B' -> Optional.of(EDSP);
            case 'E' -> Optional.of(RESUME_AUCTION);
            case 'F' -> Optional.of(PERIODIC_AUCTION);
            case 'G' -> Optional.of(SCHEDULED_LEVEL_1_ONLY_AUCTION);
            default -> Optional.empty();
        };
    }
}
