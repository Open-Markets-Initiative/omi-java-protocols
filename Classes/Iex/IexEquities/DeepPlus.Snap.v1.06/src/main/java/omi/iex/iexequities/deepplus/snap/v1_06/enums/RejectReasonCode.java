package omi.iex.iexequities.deepplus.snap.v1_06.enums;

import java.util.Optional;

/**
 * Reason the Snapshot Request was rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReasonCode {

    /**
     * The Authentication Token was not valid
     */
    AUTHENTICATION_FAILURE('A', "The Authentication Token was not valid"),

    /**
     * Incorrect Channel Id in the Snapshot Request
     */
    INCORRECT_CHANNEL_ID('C', "Incorrect Channel Id in the Snapshot Request"),

    /**
     * A Snapshot Request is already active on this connection
     */
    SNAPSHOT_REQUEST_ALREADY_ACTIVE('E', "A Snapshot Request is already active on this connection"),

    /**
     * The per channel daily Snapshot Request quota has been exceeded
     */
    QUOTA_EXCEEDED('Q', "The per channel daily Snapshot Request quota has been exceeded"),

    /**
     * No snapshot at or above the requested Minimum Sequence Number is available
     */
    SNAPSHOT_NOT_YET_AVAILABLE('R', "No snapshot at or above the requested Minimum Sequence Number is available"),

    /**
     * Incorrect Session Id in the Snapshot Request
     */
    INCORRECT_SESSION_ID('S', "Incorrect Session Id in the Snapshot Request"),

    /**
     * The message was not recognized by the server
     */
    UNKNOWN_MESSAGE('U', "The message was not recognized by the server");

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
            case 'A' -> Optional.of(AUTHENTICATION_FAILURE);
            case 'C' -> Optional.of(INCORRECT_CHANNEL_ID);
            case 'E' -> Optional.of(SNAPSHOT_REQUEST_ALREADY_ACTIVE);
            case 'Q' -> Optional.of(QUOTA_EXCEEDED);
            case 'R' -> Optional.of(SNAPSHOT_NOT_YET_AVAILABLE);
            case 'S' -> Optional.of(INCORRECT_SESSION_ID);
            case 'U' -> Optional.of(UNKNOWN_MESSAGE);
            default -> Optional.empty();
        };
    }
}
