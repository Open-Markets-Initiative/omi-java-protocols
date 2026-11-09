package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Pillar Status Code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * Request processed successfully
     */
    REQUEST_PROCESSED_SUCCESSFULLY((short) 0, "Request processed successfully"),

    /**
     * Not logged in
     */
    NOT_LOGGED_IN((short) 18, "Not logged in"),

    /**
     * Invalid login details
     */
    INVALID_LOGIN_DETAILS((short) 24, "Invalid login details"),

    /**
     * Already logged in
     */
    ALREADY_LOGGED_IN((short) 27, "Already logged in"),

    /**
     * Heartbeat timeout
     */
    HEARTBEAT_TIMEOUT((short) 28, "Heartbeat timeout"),

    /**
     * Login timed out
     */
    LOGIN_TIMED_OUT((short) 29, "Login timed out"),

    /**
     * Invalid message
     */
    INVALID_MESSAGE((short) 33, "Invalid message"),

    /**
     * No stream permission
     */
    NO_STREAM_PERMISSION((short) 54, "No stream permission"),

    /**
     * Invalid protocol version
     */
    INVALID_PROTOCOL_VERSION((short) 81, "Invalid protocol version"),

    /**
     * Message out of sequence
     */
    MESSAGE_OUT_OF_SEQUENCE((short) 82, "Message out of sequence"),

    /**
     * Invalid stream
     */
    INVALID_STREAM((short) 84, "Invalid stream"),

    /**
     * Stream not open
     */
    STREAM_NOT_OPEN((short) 85, "Stream not open"),

    /**
     * Invalid timestamp
     */
    INVALID_TIMESTAMP((short) 86, "Invalid timestamp"),

    /**
     * Denial of service
     */
    DENIAL_OF_SERVICE((short) 89, "Denial of service"),

    /**
     * Write permission revoked
     */
    WRITE_PERMISSION_REVOKED((short) 90, "Write permission revoked"),

    /**
     * Invalid Multi-message
     */
    INVALID_MULTIMESSAGE((short) 93, "Invalid Multi-message");

    private final short wire;

    private final String description;

    Status(short wire, String description) {
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
    public static Optional<Status> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REQUEST_PROCESSED_SUCCESSFULLY);
            case 18 -> Optional.of(NOT_LOGGED_IN);
            case 24 -> Optional.of(INVALID_LOGIN_DETAILS);
            case 27 -> Optional.of(ALREADY_LOGGED_IN);
            case 28 -> Optional.of(HEARTBEAT_TIMEOUT);
            case 29 -> Optional.of(LOGIN_TIMED_OUT);
            case 33 -> Optional.of(INVALID_MESSAGE);
            case 54 -> Optional.of(NO_STREAM_PERMISSION);
            case 81 -> Optional.of(INVALID_PROTOCOL_VERSION);
            case 82 -> Optional.of(MESSAGE_OUT_OF_SEQUENCE);
            case 84 -> Optional.of(INVALID_STREAM);
            case 85 -> Optional.of(STREAM_NOT_OPEN);
            case 86 -> Optional.of(INVALID_TIMESTAMP);
            case 89 -> Optional.of(DENIAL_OF_SERVICE);
            case 90 -> Optional.of(WRITE_PERMISSION_REVOKED);
            case 93 -> Optional.of(INVALID_MULTIMESSAGE);
            default -> Optional.empty();
        };
    }
}
