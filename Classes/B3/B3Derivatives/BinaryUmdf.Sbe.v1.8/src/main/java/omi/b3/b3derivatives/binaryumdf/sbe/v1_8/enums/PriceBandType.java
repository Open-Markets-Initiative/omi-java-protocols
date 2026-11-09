package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * priceBandType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceBandType {

    /**
     * Hard Limit.
     */
    HARD_LIMIT((short) 1, "Hard Limit."),

    /**
     * Auction Limits.
     */
    AUCTION_LIMITS((short) 2, "Auction Limits."),

    /**
     * Rejection Band.
     */
    REJECTION_BAND((short) 3, "Rejection Band."),

    /**
     * Static Limits.
     */
    STATIC_LIMITS((short) 4, "Static Limits."),

    /**
     * priceBandType
     */
    NO_VALUE((short) 255, "priceBandType");

    private final short wire;

    private final String description;

    PriceBandType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<PriceBandType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HARD_LIMIT);
            case 2 -> Optional.of(AUCTION_LIMITS);
            case 3 -> Optional.of(REJECTION_BAND);
            case 4 -> Optional.of(STATIC_LIMITS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
