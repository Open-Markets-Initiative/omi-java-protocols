package omi.miax.pearloptions.topofmarket.mach.v2_3.enums;

import java.util.Optional;

/**
 * “Y” = Far month expiration, “N” = Near month expiration (as defined by MIAX rules)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LongTermOption {

    /**
     * Far Month Expiration
     */
    FAR_MONTH_EXPIRATION('Y', "Far Month Expiration"),

    /**
     * Near Month Expiration
     */
    NEAR_MONTH_EXPIRATION('N', "Near Month Expiration");

    private final char wire;

    private final String description;

    LongTermOption(char wire, String description) {
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
    public static Optional<LongTermOption> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(FAR_MONTH_EXPIRATION);
            case 'N' -> Optional.of(NEAR_MONTH_EXPIRATION);
            default -> Optional.empty();
        };
    }
}
