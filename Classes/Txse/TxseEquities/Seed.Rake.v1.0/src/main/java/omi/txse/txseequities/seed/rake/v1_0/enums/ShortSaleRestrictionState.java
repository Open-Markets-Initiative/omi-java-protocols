package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum ShortSaleRestrictionState.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ShortSaleRestrictionState {

    /**
     * No short sale restriction in effect (CTA: Space, UTP: 0).
     */
    NONE((byte) 0, "No short sale restriction in effect (CTA: Space, UTP: 0)."),

    /**
     * Restriction activated intra-day (CTA: A, UTP: 1).
     */
    ACTIVATED((byte) 1, "Restriction activated intra-day (CTA: A, UTP: 1)."),

    /**
     * Restriction carried over from previous trading day (CTA: C, UTP: 2).
     */
    CONTINUED((byte) 2, "Restriction carried over from previous trading day (CTA: C, UTP: 2)."),

    /**
     * Restriction deactivated intra-day (CTA: D).
     */
    DEACTIVATED((byte) 3, "Restriction deactivated intra-day (CTA: D)."),

    /**
     * Restriction in effect, status unchanged from previous close (CTA: E).
     */
    IN_EFFECT((byte) 4, "Restriction in effect, status unchanged from previous close (CTA: E).");

    private final byte wire;

    private final String description;

    ShortSaleRestrictionState(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ShortSaleRestrictionState> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(ACTIVATED);
            case 2 -> Optional.of(CONTINUED);
            case 3 -> Optional.of(DEACTIVATED);
            case 4 -> Optional.of(IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
