package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_29.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionNotificationType {

    /**
     * Aim
     */
    AIM('B', "Aim"),

    /**
     * Solicitation Auction Mechanism
     */
    SOLICITATION_AUCTION_MECHANISM('S', "Solicitation Auction Mechanism"),

    /**
     * Step Up Mechanism
     */
    STEP_UP_MECHANISM('T', "Step Up Mechanism"),

    /**
     * Sum All Or None
     */
    SUM_ALL_OR_NONE('A', "Sum All Or None");

    private final char wire;

    private final String description;

    AuctionNotificationType(char wire, String description) {
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
    public static Optional<AuctionNotificationType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(AIM);
            case 'S' -> Optional.of(SOLICITATION_AUCTION_MECHANISM);
            case 'T' -> Optional.of(STEP_UP_MECHANISM);
            case 'A' -> Optional.of(SUM_ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
