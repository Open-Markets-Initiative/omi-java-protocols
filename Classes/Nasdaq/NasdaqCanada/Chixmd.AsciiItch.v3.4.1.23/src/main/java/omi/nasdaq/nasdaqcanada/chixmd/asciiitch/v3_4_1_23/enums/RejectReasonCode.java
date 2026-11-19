package omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.enums;

import java.util.Optional;

/**
 * Login Reject Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReasonCode {

    /**
     * Invalid username/password
     */
    INVALID_USERNAME_OR_PASSWORD('A', "Invalid username/password"),

    /**
     * Invalid session
     */
    INVALID_SESSION('S', "Invalid session");

    private final char wire;

    private final String description;

    RejectReasonCode(char wire, String description) {
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
    public static Optional<RejectReasonCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(INVALID_USERNAME_OR_PASSWORD);
            case 'S' -> Optional.of(INVALID_SESSION);
            default -> Optional.empty();
        };
    }
}
