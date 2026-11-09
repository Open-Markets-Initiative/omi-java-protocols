package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the ApplUsageQuotes values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ApplUsageQuotes {

    /**
     * Automated
     */
    AUTOMATED('A', "Automated"),

    /**
     * Manual
     */
    MANUAL('M', "Manual"),

    /**
     * Both (Automated and Manual)
     */
    AUTO_SELECT('B', "Both (Automated and Manual)"),

    /**
     * None
     */
    NONE('N', "None");

    private final char wire;

    private final String description;

    ApplUsageQuotes(char wire, String description) {
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
    public static Optional<ApplUsageQuotes> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTOMATED);
            case 'M' -> Optional.of(MANUAL);
            case 'B' -> Optional.of(AUTO_SELECT);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
