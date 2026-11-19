package omi.tmx.tsx.globalfx.gfx.v1_0.enums;

import java.util.Optional;

/**
 * Whether a reference price is available at this size tier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TierStatus {

    /**
     * Valid reference price
     */
    VALID_REFERENCE_PRICE('R', "Valid reference price"),

    /**
     * Price not available at this size tier
     */
    PRICE_NOT_AVAILABLE('Z', "Price not available at this size tier");

    private final char wire;

    private final String description;

    TierStatus(char wire, String description) {
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
    public static Optional<TierStatus> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(VALID_REFERENCE_PRICE);
            case 'Z' -> Optional.of(PRICE_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
