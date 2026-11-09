package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * terminationCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TerminationCode {

    /**
     * UNSPECIFIED
     */
    UNSPECIFIED((short) 0, "UNSPECIFIED"),

    /**
     * FINISHED
     */
    FINISHED((short) 1, "FINISHED"),

    /**
     * UNNEGOTIATED
     */
    UNNEGOTIATED((short) 2, "UNNEGOTIATED"),

    /**
     * NOT_ESTABLISHED
     */
    NOT_ESTABLISHED((short) 3, "NOT_ESTABLISHED"),

    /**
     * SESSION_BLOCKED
     */
    SESSION_BLOCKED((short) 4, "SESSION_BLOCKED"),

    /**
     * NEGOTIATION_IN_PROGRESS
     */
    NEGOTIATION_IN_PROGRESS((short) 5, "NEGOTIATION_IN_PROGRESS"),

    /**
     * ESTABLISH_IN_PROGRESS
     */
    ESTABLISH_IN_PROGRESS((short) 6, "ESTABLISH_IN_PROGRESS"),

    /**
     * KEEPALIVE_INTERVAL_LAPSED
     */
    KEEPALIVE_INTERVAL_LAPSED((short) 10, "KEEPALIVE_INTERVAL_LAPSED"),

    /**
     * INVALID_SESSIONID
     */
    INVALID_SESSIONID((short) 11, "INVALID_SESSIONID"),

    /**
     * INVALID_SESSIONVERID
     */
    INVALID_SESSIONVERID((short) 12, "INVALID_SESSIONVERID"),

    /**
     * INVALID_TIMESTAMP
     */
    INVALID_TIMESTAMP((short) 13, "INVALID_TIMESTAMP"),

    /**
     * INVALID_NEXTSEQNO
     */
    INVALID_NEXTSEQNO((short) 14, "INVALID_NEXTSEQNO"),

    /**
     * UNRECOGNIZED_MESSAGE
     */
    UNRECOGNIZED_MESSAGE((short) 15, "UNRECOGNIZED_MESSAGE"),

    /**
     * INVALID_SOFH
     */
    INVALID_SOFH((short) 16, "INVALID_SOFH"),

    /**
     * DECODING_ERROR
     */
    DECODING_ERROR((short) 17, "DECODING_ERROR"),

    /**
     * TERMINATE_NOT_ALLOWED
     */
    TERMINATE_NOT_ALLOWED((short) 20, "TERMINATE_NOT_ALLOWED"),

    /**
     * TERMINATE_IN_PROGRESS
     */
    TERMINATE_IN_PROGRESS((short) 21, "TERMINATE_IN_PROGRESS"),

    /**
     * PROTOCOL_VERSION_NOT_SUPPORTED
     */
    PROTOCOL_VERSION_NOT_SUPPORTED((short) 23, "PROTOCOL_VERSION_NOT_SUPPORTED"),

    /**
     * BACKUP_TAKEOVER_IN_PROGRESS
     */
    BACKUP_TAKEOVER_IN_PROGRESS((short) 30, "BACKUP_TAKEOVER_IN_PROGRESS");

    private final short wire;

    private final String description;

    TerminationCode(short wire, String description) {
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
    public static Optional<TerminationCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSPECIFIED);
            case 1 -> Optional.of(FINISHED);
            case 2 -> Optional.of(UNNEGOTIATED);
            case 3 -> Optional.of(NOT_ESTABLISHED);
            case 4 -> Optional.of(SESSION_BLOCKED);
            case 5 -> Optional.of(NEGOTIATION_IN_PROGRESS);
            case 6 -> Optional.of(ESTABLISH_IN_PROGRESS);
            case 10 -> Optional.of(KEEPALIVE_INTERVAL_LAPSED);
            case 11 -> Optional.of(INVALID_SESSIONID);
            case 12 -> Optional.of(INVALID_SESSIONVERID);
            case 13 -> Optional.of(INVALID_TIMESTAMP);
            case 14 -> Optional.of(INVALID_NEXTSEQNO);
            case 15 -> Optional.of(UNRECOGNIZED_MESSAGE);
            case 16 -> Optional.of(INVALID_SOFH);
            case 17 -> Optional.of(DECODING_ERROR);
            case 20 -> Optional.of(TERMINATE_NOT_ALLOWED);
            case 21 -> Optional.of(TERMINATE_IN_PROGRESS);
            case 23 -> Optional.of(PROTOCOL_VERSION_NOT_SUPPORTED);
            case 30 -> Optional.of(BACKUP_TAKEOVER_IN_PROGRESS);
            default -> Optional.empty();
        };
    }
}
