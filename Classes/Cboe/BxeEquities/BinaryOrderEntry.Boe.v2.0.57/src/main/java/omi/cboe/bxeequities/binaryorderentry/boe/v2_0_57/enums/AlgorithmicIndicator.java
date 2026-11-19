package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_57.enums;

import java.util.Optional;

/**
 * Defines the AlgorithmicIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AlgorithmicIndicator {

    /**
     * No algorithm was involved (default).
     */
    NO_ALGORITHM_WAS_INVOLVED('N', "No algorithm was involved (default)."),

    /**
     * Algorithm was involved (ALGO).
     */
    ALGORITHM_WAS_INVOLVED('Y', "Algorithm was involved (ALGO).");

    private final char wire;

    private final String description;

    AlgorithmicIndicator(char wire, String description) {
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
    public static Optional<AlgorithmicIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO_ALGORITHM_WAS_INVOLVED);
            case 'Y' -> Optional.of(ALGORITHM_WAS_INVOLVED);
            default -> Optional.empty();
        };
    }
}
