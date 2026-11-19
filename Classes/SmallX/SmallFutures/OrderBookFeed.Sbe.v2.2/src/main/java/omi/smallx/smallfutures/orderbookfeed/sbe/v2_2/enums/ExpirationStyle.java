package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Expiration style
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpirationStyle {

    /**
     * Standard (third Friday of each month)
     */
    STANDARD('S', "Standard (third Friday of each month)"),

    /**
     * DAILY
     */
    DAILY('D', "DAILY"),

    /**
     * WEEKLY
     */
    WEEKLY('W', "WEEKLY"),

    /**
     * Quarterly
     */
    QUATERLY('Q', "Quarterly");

    private final char wire;

    private final String description;

    ExpirationStyle(char wire, String description) {
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
    public static Optional<ExpirationStyle> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(STANDARD);
            case 'D' -> Optional.of(DAILY);
            case 'W' -> Optional.of(WEEKLY);
            case 'Q' -> Optional.of(QUATERLY);
            default -> Optional.empty();
        };
    }
}
