package omi.cboe.c1options.auctionfeed.pitch.v1_1_1.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Auction Instruction Mechanism
     */
    AUCTION_INSTRUCTION_MECHANISM('B', "Auction Instruction Mechanism"),

    /**
     * Solicitation Auction Mechanism
     */
    SOLICITATION_AUCTION_MECHANISM('S', "Solicitation Auction Mechanism"),

    /**
     * Step Up Mechanism
     */
    STEP_UP_MECHANISM('T', "Step Up Mechanism"),

    /**
     * All Or None
     */
    ALL_OR_NONE('A', "All Or None");

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
            case 'B' -> Optional.of(AUCTION_INSTRUCTION_MECHANISM);
            case 'S' -> Optional.of(SOLICITATION_AUCTION_MECHANISM);
            case 'T' -> Optional.of(STEP_UP_MECHANISM);
            case 'A' -> Optional.of(ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
