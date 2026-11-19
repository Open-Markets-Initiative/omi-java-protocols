package omi.otcmarkets.overnight.depthofbook.link.v1_0.enums;

import java.util.Optional;

/**
 * Security trading status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Active.
     */
    ACTIVE('A', "Active."),

    /**
     * Quote Only.
     */
    QUOTE_ONLY('Q', "Quote Only."),

    /**
     * Suspended.
     */
    SUSPENDED('S', "Suspended."),

    /**
     * Halted.
     */
    HALTED('H', "Halted."),

    /**
     * Internal Halt.
     */
    INTERNAL_HALT('I', "Internal Halt."),

    /**
     * Revoked.
     */
    REVOKED('R', "Revoked."),

    /**
     * Deleted.
     */
    DELETED('D', "Deleted."),

    /**
     * Removed from IDQS.
     */
    REMOVED_FROM_IDQS('X', "Removed from IDQS.");

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
            case 'X' -> Optional.of(REMOVED_FROM_IDQS);
            default -> Optional.empty();
        };
    }
}
