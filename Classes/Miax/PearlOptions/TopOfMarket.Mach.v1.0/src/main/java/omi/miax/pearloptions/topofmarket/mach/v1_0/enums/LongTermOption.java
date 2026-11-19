package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * Defines the LongTermOption values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LongTermOption {

    /**
     * Far Month Expiration As Defined By Pearl Rules
     */
    FAR_MONTH('Y', "Far Month Expiration As Defined By Pearl Rules"),

    /**
     * Near Month Expiration As Defined By Pearl Rules
     */
    NEAR_MONTH('N', "Near Month Expiration As Defined By Pearl Rules");

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
            case 'Y' -> Optional.of(FAR_MONTH);
            case 'N' -> Optional.of(NEAR_MONTH);
            default -> Optional.empty();
        };
    }
}
