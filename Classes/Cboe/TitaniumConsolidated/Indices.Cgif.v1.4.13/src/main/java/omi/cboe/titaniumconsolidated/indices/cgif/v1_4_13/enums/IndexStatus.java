package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.enums;

import java.util.Optional;

/**
 * Status of the index value. N = Normal, I = Indicative.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IndexStatus {

    /**
     * Normal
     */
    NORMAL('N', "Normal"),

    /**
     * Indicative
     */
    INDICATIVE('I', "Indicative");

    private final char wire;

    private final String description;

    IndexStatus(char wire, String description) {
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
    public static Optional<IndexStatus> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'I' -> Optional.of(INDICATIVE);
            default -> Optional.empty();
        };
    }
}
