package omi.nasdaq.nsmequities.aggregated.itch.v2_0.enums;

import java.util.Optional;

/**
 * Indicates if the security is eligible to be released for trading
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenEligibilityStatus {

    /**
     * Not eligible to be released for trading
     */
    NOT_ELIGIBLE('N', "Not eligible to be released for trading"),

    /**
     * Eligible to be released for trading
     */
    ELIGIBLE('Y', "Eligible to be released for trading");

    private final char wire;

    private final String description;

    OpenEligibilityStatus(char wire, String description) {
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
    public static Optional<OpenEligibilityStatus> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_ELIGIBLE);
            case 'Y' -> Optional.of(ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
