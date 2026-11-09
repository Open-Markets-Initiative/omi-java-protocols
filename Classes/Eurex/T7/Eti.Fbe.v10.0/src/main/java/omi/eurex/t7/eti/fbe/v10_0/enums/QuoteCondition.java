package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the QuoteCondition values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Closed
     */
    CLOSED('B', "Closed"),

    /**
     * Suspended
     */
    SUSPENDED('z', "Suspended"),

    /**
     * Expired
     */
    EXPIRED('8', "Expired");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'B' -> Optional.of(CLOSED);
            case 'z' -> Optional.of(SUSPENDED);
            case '8' -> Optional.of(EXPIRED);
            default -> Optional.empty();
        };
    }
}
