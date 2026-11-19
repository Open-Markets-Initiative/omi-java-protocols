package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_57.enums;

import java.util.Optional;

/**
 * Defines the ExecutionMethod values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutionMethod {

    /**
     * Automated
     */
    AUTOMATED('A', "Automated"),

    /**
     * Manual
     */
    MANUAL('M', "Manual"),

    /**
     * Unspecified (default)
     */
    UNSPECIFIED('U', "Unspecified (default)");

    private final char wire;

    private final String description;

    ExecutionMethod(char wire, String description) {
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
    public static Optional<ExecutionMethod> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTOMATED);
            case 'M' -> Optional.of(MANUAL);
            case 'U' -> Optional.of(UNSPECIFIED);
            default -> Optional.empty();
        };
    }
}
