package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Reason {

    /**
     * Success
     */
    SUCCESS((short) 0, "Success"),

    /**
     * SessionLevelReject
     */
    SESSION_LEVEL_REJECT((short) 1, "SessionLevelReject"),

    /**
     * LogoutRequested
     */
    LOGOUT_REQUESTED((short) 2, "LogoutRequested"),

    /**
     * Unknown
     */
    UNKNOWN((short) 3, "Unknown"),

    /**
     * InvalidLogonId
     */
    INVALID_LOGON_ID((short) 4, "InvalidLogonId"),

    /**
     * InvalidToken
     */
    INVALID_TOKEN((short) 5, "InvalidToken"),

    /**
     * AlreadyLoggedIn
     */
    ALREADY_LOGGED_IN((short) 6, "AlreadyLoggedIn"),

    /**
     * LoginTimeout
     */
    LOGIN_TIMEOUT((short) 7, "LoginTimeout"),

    /**
     * InvalidPacketLength
     */
    INVALID_PACKET_LENGTH((short) 8, "InvalidPacketLength"),

    /**
     * InvalidMessage
     */
    INVALID_MESSAGE((short) 9, "InvalidMessage"),

    /**
     * JoinRevoked
     */
    JOIN_REVOKED((short) 10, "JoinRevoked"),

    /**
     * HeartbeatTimeout
     */
    HEARTBEAT_TIMEOUT((short) 11, "HeartbeatTimeout"),

    /**
     * MessageOutOfSequence
     */
    MESSAGE_OUT_OF_SEQUENCE((short) 12, "MessageOutOfSequence"),

    /**
     * InvalidSubsessionId
     */
    INVALID_SUBSESSION_ID((short) 13, "InvalidSubsessionId"),

    /**
     * SubsessionNotJoined
     */
    SUBSESSION_NOT_JOINED((short) 14, "SubsessionNotJoined"),

    /**
     * DenialOfService
     */
    DENIAL_OF_SERVICE((short) 15, "DenialOfService"),

    /**
     * InvalidArgument
     */
    INVALID_ARGUMENT((short) 16, "InvalidArgument"),

    /**
     * AlreadyJoined
     */
    ALREADY_JOINED((short) 17, "AlreadyJoined");

    private final short wire;

    private final String description;

    Reason(short wire, String description) {
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
    public static Optional<Reason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SUCCESS);
            case 1 -> Optional.of(SESSION_LEVEL_REJECT);
            case 2 -> Optional.of(LOGOUT_REQUESTED);
            case 3 -> Optional.of(UNKNOWN);
            case 4 -> Optional.of(INVALID_LOGON_ID);
            case 5 -> Optional.of(INVALID_TOKEN);
            case 6 -> Optional.of(ALREADY_LOGGED_IN);
            case 7 -> Optional.of(LOGIN_TIMEOUT);
            case 8 -> Optional.of(INVALID_PACKET_LENGTH);
            case 9 -> Optional.of(INVALID_MESSAGE);
            case 10 -> Optional.of(JOIN_REVOKED);
            case 11 -> Optional.of(HEARTBEAT_TIMEOUT);
            case 12 -> Optional.of(MESSAGE_OUT_OF_SEQUENCE);
            case 13 -> Optional.of(INVALID_SUBSESSION_ID);
            case 14 -> Optional.of(SUBSESSION_NOT_JOINED);
            case 15 -> Optional.of(DENIAL_OF_SERVICE);
            case 16 -> Optional.of(INVALID_ARGUMENT);
            case 17 -> Optional.of(ALREADY_JOINED);
            default -> Optional.empty();
        };
    }
}
