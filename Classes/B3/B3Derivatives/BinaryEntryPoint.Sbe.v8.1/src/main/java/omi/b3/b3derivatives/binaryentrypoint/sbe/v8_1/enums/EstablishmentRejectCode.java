package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * establishmentRejectCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EstablishmentRejectCode {

    /**
     * UNSPECIFIED
     */
    UNSPECIFIED((short) 0, "UNSPECIFIED"),

    /**
     * CREDENTIALS
     */
    CREDENTIALS((short) 1, "CREDENTIALS"),

    /**
     * UNNEGOTIATED
     */
    UNNEGOTIATED((short) 2, "UNNEGOTIATED"),

    /**
     * ALREADY_ESTABLISHED
     */
    ALREADY_ESTABLISHED((short) 3, "ALREADY_ESTABLISHED"),

    /**
     * SESSION_BLOCKED
     */
    SESSION_BLOCKED((short) 4, "SESSION_BLOCKED"),

    /**
     * INVALID_SESSIONID
     */
    INVALID_SESSIONID((short) 5, "INVALID_SESSIONID"),

    /**
     * INVALID_SESSIONVERID
     */
    INVALID_SESSIONVERID((short) 6, "INVALID_SESSIONVERID"),

    /**
     * INVALID_TIMESTAMP
     */
    INVALID_TIMESTAMP((short) 7, "INVALID_TIMESTAMP"),

    /**
     * INVALID_KEEPALIVE_INTERVAL
     */
    INVALID_KEEPALIVE_INTERVAL((short) 8, "INVALID_KEEPALIVE_INTERVAL"),

    /**
     * INVALID_NEXTSEQNO
     */
    INVALID_NEXTSEQNO((short) 9, "INVALID_NEXTSEQNO"),

    /**
     * ESTABLISH_ATTEMPTS_EXCEEDED
     */
    ESTABLISH_ATTEMPTS_EXCEEDED((short) 10, "ESTABLISH_ATTEMPTS_EXCEEDED"),

    /**
     * ESTABLISH_NOT_ALLOWED
     */
    ESTABLISH_NOT_ALLOWED((short) 20, "ESTABLISH_NOT_ALLOWED"),

    /**
     * DUPLICATE_SESSION_CONNECTION
     */
    DUPLICATE_SESSION_CONNECTION((short) 21, "DUPLICATE_SESSION_CONNECTION"),

    /**
     * AUTHENTICATION_IN_PROGRESS
     */
    AUTHENTICATION_IN_PROGRESS((short) 22, "AUTHENTICATION_IN_PROGRESS"),

    /**
     * PROTOCOL_VERSION_NOT_SUPPORTED
     */
    PROTOCOL_VERSION_NOT_SUPPORTED((short) 23, "PROTOCOL_VERSION_NOT_SUPPORTED");

    private final short wire;

    private final String description;

    EstablishmentRejectCode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<EstablishmentRejectCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSPECIFIED);
            case 1 -> Optional.of(CREDENTIALS);
            case 2 -> Optional.of(UNNEGOTIATED);
            case 3 -> Optional.of(ALREADY_ESTABLISHED);
            case 4 -> Optional.of(SESSION_BLOCKED);
            case 5 -> Optional.of(INVALID_SESSIONID);
            case 6 -> Optional.of(INVALID_SESSIONVERID);
            case 7 -> Optional.of(INVALID_TIMESTAMP);
            case 8 -> Optional.of(INVALID_KEEPALIVE_INTERVAL);
            case 9 -> Optional.of(INVALID_NEXTSEQNO);
            case 10 -> Optional.of(ESTABLISH_ATTEMPTS_EXCEEDED);
            case 20 -> Optional.of(ESTABLISH_NOT_ALLOWED);
            case 21 -> Optional.of(DUPLICATE_SESSION_CONNECTION);
            case 22 -> Optional.of(AUTHENTICATION_IN_PROGRESS);
            case 23 -> Optional.of(PROTOCOL_VERSION_NOT_SUPPORTED);
            default -> Optional.empty();
        };
    }
}
