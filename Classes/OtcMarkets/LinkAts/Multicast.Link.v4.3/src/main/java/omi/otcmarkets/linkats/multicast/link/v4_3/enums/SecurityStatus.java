package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Security status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Security is active
     */
    ACTIVE('A', "Security is active"),

    /**
     * Quote only
     */
    QUOTE_ONLY('Q', "Quote only"),

    /**
     * Security suspended
     */
    SUSPENDED('S', "Security suspended"),

    /**
     * Security halted
     */
    HALTED('H', "Security halted"),

    /**
     * Internal halt
     */
    INTERNAL_HALT('I', "Internal halt"),

    /**
     * Security revoked
     */
    REVOKED('R', "Security revoked"),

    /**
     * Security deleted
     */
    DELETED('D', "Security deleted");

    private final char wire;

    private final String description;

    SecurityStatus(char wire, String description) {
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
    public static Optional<SecurityStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'Q' -> Optional.of(QUOTE_ONLY);
            case 'S' -> Optional.of(SUSPENDED);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INTERNAL_HALT);
            case 'R' -> Optional.of(REVOKED);
            case 'D' -> Optional.of(DELETED);
            default -> Optional.empty();
        };
    }
}
