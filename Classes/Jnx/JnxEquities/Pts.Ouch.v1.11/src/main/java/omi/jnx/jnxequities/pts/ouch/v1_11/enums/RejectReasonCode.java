package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Login Reject Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReasonCode {

    /**
     * The Login Request Packet's username and password combination was invalid
     */
    NOT_AUTHORIZED('A', "The Login Request Packet's username and password combination was invalid"),

    /**
     * The Login Request Packet's requested session was invalid or not available
     */
    SESSION_NOT_AVAILABLE('S', "The Login Request Packet's requested session was invalid or not available");

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
            case 'A' -> Optional.of(NOT_AUTHORIZED);
            case 'S' -> Optional.of(SESSION_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
