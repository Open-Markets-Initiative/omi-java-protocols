package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Accepted, or the reason for the rejection. A=Login Accepted N=Not authorized (invalid username/password) D=Session is disabled B=Session in use S=Invalid session Q=Sequence ahead in Login message I=Invalid unit given in Login message F=Invalid return bit field in Login message M=Invalid Login Request message structure
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginResponseStatus {

    /**
     * Login Accepted
     */
    LOGIN_ACCEPTED('A', "Login Accepted"),

    /**
     * Not authorized (invalid username/password)
     */
    NOT_AUTHORIZED('N', "Not authorized (invalid username/password)"),

    /**
     * Session is disabled
     */
    SESSION_IS_DISABLED('D', "Session is disabled"),

    /**
     * Session in use
     */
    SESSION_IN_USE('B', "Session in use"),

    /**
     * Invalid session
     */
    INVALID_SESSION('S', "Invalid session"),

    /**
     * Sequence ahead in Login message
     */
    SEQUENCE_AHEAD_IN_LOGIN_MESSAGE('Q', "Sequence ahead in Login message"),

    /**
     * Invalid unit given in Login message
     */
    INVALID_UNIT_GIVEN_IN_LOGIN_MESSAGE('I', "Invalid unit given in Login message"),

    /**
     * Invalid return bit field in Login message
     */
    INVALID_RETURN_BIT_FIELD_IN_LOGIN_MESSAGE('F', "Invalid return bit field in Login message"),

    /**
     * Invalid Login Request message structure
     */
    INVALID_LOGIN_REQUEST_MESSAGE_STRUCTURE('M', "Invalid Login Request message structure");

    private final char wire;

    private final String description;

    LoginResponseStatus(char wire, String description) {
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
    public static Optional<LoginResponseStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(LOGIN_ACCEPTED);
            case 'N' -> Optional.of(NOT_AUTHORIZED);
            case 'D' -> Optional.of(SESSION_IS_DISABLED);
            case 'B' -> Optional.of(SESSION_IN_USE);
            case 'S' -> Optional.of(INVALID_SESSION);
            case 'Q' -> Optional.of(SEQUENCE_AHEAD_IN_LOGIN_MESSAGE);
            case 'I' -> Optional.of(INVALID_UNIT_GIVEN_IN_LOGIN_MESSAGE);
            case 'F' -> Optional.of(INVALID_RETURN_BIT_FIELD_IN_LOGIN_MESSAGE);
            case 'M' -> Optional.of(INVALID_LOGIN_REQUEST_MESSAGE_STRUCTURE);
            default -> Optional.empty();
        };
    }
}
