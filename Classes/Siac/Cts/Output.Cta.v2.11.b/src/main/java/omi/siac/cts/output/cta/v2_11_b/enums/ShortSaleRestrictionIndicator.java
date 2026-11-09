package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies whether or not a Short Sale Restriction is in effect for a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleRestrictionIndicator {

    /**
     * Short Sale Restriction Not In Effect
     */
    SHORT_SALE_RESTRICTION_NOT_IN_EFFECT(' ', "Short Sale Restriction Not In Effect"),

    /**
     * Short Sale Restriction Activated
     */
    SHORT_SALE_RESTRICTION_ACTIVATED('A', "Short Sale Restriction Activated"),

    /**
     * Short Sale Restriction Continued
     */
    SHORT_SALE_RESTRICTION_CONTINUED('C', "Short Sale Restriction Continued"),

    /**
     * Short Sale Restriction Deactivated
     */
    SHORT_SALE_RESTRICTION_DEACTIVATED('D', "Short Sale Restriction Deactivated"),

    /**
     * Short Sale Restriction In Effect
     */
    SHORT_SALE_RESTRICTION_IN_EFFECT('E', "Short Sale Restriction In Effect");

    private final char wire;

    private final String description;

    ShortSaleRestrictionIndicator(char wire, String description) {
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
    public static Optional<ShortSaleRestrictionIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SHORT_SALE_RESTRICTION_NOT_IN_EFFECT);
            case 'A' -> Optional.of(SHORT_SALE_RESTRICTION_ACTIVATED);
            case 'C' -> Optional.of(SHORT_SALE_RESTRICTION_CONTINUED);
            case 'D' -> Optional.of(SHORT_SALE_RESTRICTION_DEACTIVATED);
            case 'E' -> Optional.of(SHORT_SALE_RESTRICTION_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
