package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Listing tier of the security.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ListingTier {

    /**
     * No Tier
     */
    NO_TIER((short) 0, "No Tier"),

    /**
     * Senior Tier
     */
    SENIOR_TIER((short) 1, "Senior Tier"),

    /**
     * Venture Tier
     */
    VENTURE_TIER((short) 2, "Venture Tier");

    private final short wire;

    private final String description;

    ListingTier(short wire, String description) {
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
    public static Optional<ListingTier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_TIER);
            case 1 -> Optional.of(SENIOR_TIER);
            case 2 -> Optional.of(VENTURE_TIER);
            default -> Optional.empty();
        };
    }
}
