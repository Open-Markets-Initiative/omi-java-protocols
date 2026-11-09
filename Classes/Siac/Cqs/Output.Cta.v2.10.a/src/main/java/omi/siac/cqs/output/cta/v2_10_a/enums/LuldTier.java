package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the Limit Up Limit Down tier of the security symbol
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldTier {

    /**
     * Luld Not Applicable
     */
    LULD_NOT_APPLICABLE('0', "Luld Not Applicable"),

    /**
     * Luld Tier 1 Security
     */
    LULD_TIER_1_SECURITY('1', "Luld Tier 1 Security"),

    /**
     * Luld Tier 2 Security
     */
    LULD_TIER_2_SECURITY('2', "Luld Tier 2 Security");

    private final char wire;

    private final String description;

    LuldTier(char wire, String description) {
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
    public static Optional<LuldTier> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(LULD_NOT_APPLICABLE);
            case '1' -> Optional.of(LULD_TIER_1_SECURITY);
            case '2' -> Optional.of(LULD_TIER_2_SECURITY);
            default -> Optional.empty();
        };
    }
}
