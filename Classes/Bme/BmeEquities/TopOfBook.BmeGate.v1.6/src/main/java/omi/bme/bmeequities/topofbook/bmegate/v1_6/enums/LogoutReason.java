package omi.bme.bmeequities.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Logout reason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LogoutReason {

    /**
     * Termination After A Solicited Logout Request
     */
    TERMINATION_AFTER_A_SOLICITED_LOGOUT_REQUEST((short) 0, "Termination After A Solicited Logout Request"),

    /**
     * End Of Session Termination In Recovery Server End Of Recovery Snapshot
     */
    END_OF_SESSION_TERMINATION_IN_RECOVERY_SERVER_END_OF_RECOVERY_SNAPSHOT((short) 1, "End Of Session Termination In Recovery Server End Of Recovery Snapshot"),

    /**
     * Timeout Connection Lost
     */
    TIMEOUT_CONNECTION_LOST((short) 2, "Timeout Connection Lost"),

    /**
     * Lack Of Heartbeat
     */
    LACK_OF_HEARTBEAT((short) 3, "Lack Of Heartbeat"),

    /**
     * Invalid Username Or Password
     */
    INVALID_USERNAME_OR_PASSWORD((short) 16, "Invalid Username Or Password"),

    /**
     * Invalid Expected Sequence Number
     */
    INVALID_EXPECTED_SEQUENCE_NUMBER((short) 17, "Invalid Expected Sequence Number"),

    /**
     * Invalid Protocol Version
     */
    INVALID_PROTOCOL_VERSION((short) 18, "Invalid Protocol Version"),

    /**
     * New Connection From User
     */
    NEW_CONNECTION_FROM_USER((short) 19, "New Connection From User");

    private final short wire;

    private final String description;

    LogoutReason(short wire, String description) {
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
    public static Optional<LogoutReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(TERMINATION_AFTER_A_SOLICITED_LOGOUT_REQUEST);
            case 1 -> Optional.of(END_OF_SESSION_TERMINATION_IN_RECOVERY_SERVER_END_OF_RECOVERY_SNAPSHOT);
            case 2 -> Optional.of(TIMEOUT_CONNECTION_LOST);
            case 3 -> Optional.of(LACK_OF_HEARTBEAT);
            case 16 -> Optional.of(INVALID_USERNAME_OR_PASSWORD);
            case 17 -> Optional.of(INVALID_EXPECTED_SEQUENCE_NUMBER);
            case 18 -> Optional.of(INVALID_PROTOCOL_VERSION);
            case 19 -> Optional.of(NEW_CONNECTION_FROM_USER);
            default -> Optional.empty();
        };
    }
}
