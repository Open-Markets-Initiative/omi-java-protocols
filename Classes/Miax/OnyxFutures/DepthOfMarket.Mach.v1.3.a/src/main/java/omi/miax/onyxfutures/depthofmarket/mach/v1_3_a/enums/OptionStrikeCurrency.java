package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Defines the OptionStrikeCurrency values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionStrikeCurrency {

    /**
     * Us Dollar
     */
    US_DOLLAR('U', "Us Dollar"),

    /**
     * Na When
     */
    NA_WHEN('N', "Na When");

    private final char wire;

    private final String description;

    OptionStrikeCurrency(char wire, String description) {
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
    public static Optional<OptionStrikeCurrency> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(US_DOLLAR);
            case 'N' -> Optional.of(NA_WHEN);
            default -> Optional.empty();
        };
    }
}
