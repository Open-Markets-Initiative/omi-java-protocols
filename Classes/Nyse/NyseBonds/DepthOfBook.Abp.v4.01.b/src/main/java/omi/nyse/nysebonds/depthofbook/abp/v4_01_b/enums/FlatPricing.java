package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * Whether flat pricing or interest pricing is in effect.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FlatPricing {

    /**
     * Flat Pricing Is In Effect
     */
    FLAT_PRICING_IS_IN_EFFECT('F', "Flat Pricing Is In Effect");

    private final char wire;

    private final String description;

    FlatPricing(char wire, String description) {
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
    public static Optional<FlatPricing> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(FLAT_PRICING_IS_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
