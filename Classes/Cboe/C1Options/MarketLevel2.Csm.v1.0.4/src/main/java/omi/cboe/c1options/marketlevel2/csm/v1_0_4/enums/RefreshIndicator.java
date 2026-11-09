package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * Refresh Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RefreshIndicator {

    /**
     * Mandatory refresh by all recipients. Snapshot must be processed.
     */
    MANDATORY_REFRESH('Y', "Mandatory refresh by all recipients. Snapshot must be processed."),

    /**
     * Process if necessary
     */
    PROCESS_IF_NECESSARY('N', "Process if necessary");

    private final char wire;

    private final String description;

    RefreshIndicator(char wire, String description) {
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
    public static Optional<RefreshIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(MANDATORY_REFRESH);
            case 'N' -> Optional.of(PROCESS_IF_NECESSARY);
            default -> Optional.empty();
        };
    }
}
