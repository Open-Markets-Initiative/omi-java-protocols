package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.enums;

import java.util.Optional;

/**
 * Current state of short sale restriction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleRestriction {

    /**
     * Short Sale Restriction Is In Effect
     */
    SHORT_SALE_RESTRICTION_IS_IN_EFFECT('Y', "Short Sale Restriction Is In Effect"),

    /**
     * Short Sale Restriction Is Not In Effect
     */
    SHORT_SALE_RESTRICTION_IS_NOT_IN_EFFECT('N', "Short Sale Restriction Is Not In Effect");

    private final char wire;

    private final String description;

    ShortSaleRestriction(char wire, String description) {
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
    public static Optional<ShortSaleRestriction> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(SHORT_SALE_RESTRICTION_IS_IN_EFFECT);
            case 'N' -> Optional.of(SHORT_SALE_RESTRICTION_IS_NOT_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
