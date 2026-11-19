package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.enums;

import java.util.Optional;

/**
 * Market status indicator.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketStatus {

    /**
     * Normal
     */
    NORMAL('N', "Normal"),

    /**
     * Excluded From Symbol Summary Updates
     */
    EXCLUDED_FROM_SYMBOL_SUMMARY_UPDATES('E', "Excluded From Symbol Summary Updates"),

    /**
     * Incomplete
     */
    INCOMPLETE('I', "Incomplete");

    private final char wire;

    private final String description;

    MarketStatus(char wire, String description) {
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
    public static Optional<MarketStatus> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'E' -> Optional.of(EXCLUDED_FROM_SYMBOL_SUMMARY_UPDATES);
            case 'I' -> Optional.of(INCOMPLETE);
            default -> Optional.empty();
        };
    }
}
