package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Identifies whether or not a Short Sale Restriction is in effect for a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleRestrictionIndicator {

    /**
     * Not In Effect
     */
    NOT_IN_EFFECT(' ', "Not In Effect"),

    /**
     * Activated
     */
    ACTIVATED('A', "Activated"),

    /**
     * Continued
     */
    CONTINUED('C', "Continued"),

    /**
     * Deactivated
     */
    DEACTIVATED('D', "Deactivated"),

    /**
     * Restriction In Effect
     */
    RESTRICTION_IN_EFFECT('E', "Restriction In Effect");

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
            case ' ' -> Optional.of(NOT_IN_EFFECT);
            case 'A' -> Optional.of(ACTIVATED);
            case 'C' -> Optional.of(CONTINUED);
            case 'D' -> Optional.of(DEACTIVATED);
            case 'E' -> Optional.of(RESTRICTION_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
