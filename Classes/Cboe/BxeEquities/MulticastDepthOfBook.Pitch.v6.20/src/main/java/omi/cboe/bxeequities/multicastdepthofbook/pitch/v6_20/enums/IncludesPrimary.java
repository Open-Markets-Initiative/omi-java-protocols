package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_20.enums;

import java.util.Optional;

/**
 * Indicates whether the Bats EBBO used to collar this update includes the Primary Market quotes: P = Includes Primary N = Excludes Primary - = Not specified
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IncludesPrimary {

    /**
     * Includes Primary
     */
    INCLUDES_PRIMARY('P', "Includes Primary"),

    /**
     * Excludes Primary
     */
    EXCLUDES_PRIMARY('N', "Excludes Primary"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    IncludesPrimary(char wire, String description) {
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
    public static Optional<IncludesPrimary> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(INCLUDES_PRIMARY);
            case 'N' -> Optional.of(EXCLUDES_PRIMARY);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
