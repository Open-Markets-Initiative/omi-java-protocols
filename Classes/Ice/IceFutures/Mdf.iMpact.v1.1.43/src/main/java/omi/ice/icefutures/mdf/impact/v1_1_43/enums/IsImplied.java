package omi.ice.icefutures.mdf.impact.v1_1_43.enums;

import java.util.Optional;

/**
 * Indicate if this is an implied order or not
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IsImplied {

    /**
     * Implied
     */
    YES('Y', "Implied"),

    /**
     * Not Implied
     */
    NO('N', "Not Implied");

    private final char wire;

    private final String description;

    IsImplied(char wire, String description) {
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
    public static Optional<IsImplied> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
