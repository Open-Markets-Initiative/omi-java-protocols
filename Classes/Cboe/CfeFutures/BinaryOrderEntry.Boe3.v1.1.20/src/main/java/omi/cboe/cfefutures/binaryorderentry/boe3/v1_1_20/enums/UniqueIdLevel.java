package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Gtc Order Filter
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UniqueIdLevel {

    /**
     * Do not prevent match at any level
     */
    NONE('N', "Do not prevent match at any level"),

    /**
     * Tph
     */
    TPH('F', "Tph"),

    /**
     * Prevent Match at EFID Level
     */
    EFID('M', "Prevent Match at EFID Level");

    private final char wire;

    private final String description;

    UniqueIdLevel(char wire, String description) {
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
    public static Optional<UniqueIdLevel> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NONE);
            case 'F' -> Optional.of(TPH);
            case 'M' -> Optional.of(EFID);
            default -> Optional.empty();
        };
    }
}
