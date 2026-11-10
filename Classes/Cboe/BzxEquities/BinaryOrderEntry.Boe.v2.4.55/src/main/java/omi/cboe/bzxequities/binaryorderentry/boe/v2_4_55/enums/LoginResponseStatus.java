package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Accepted, or the reason for the rejection.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginResponseStatus {

    /**
     * Login Accepted
     */
    LOGIN_ACCEPTED('A', "Login Accepted"),

    /**
     * Not Authorized Invalid Usernamepassword
     */
    NOT_AUTHORIZED_INVALID_USERNAMEPASSWORD('N', "Not Authorized Invalid Usernamepassword"),

    /**
     * Session Is Disabled
     */
    SESSION_IS_DISABLED('D', "Session Is Disabled"),

    /**
     * Session In Use
     */
    SESSION_IN_USE('B', "Session In Use"),

    /**
     * Invalid Session
     */
    INVALID_SESSION('S', "Invalid Session"),

    /**
     * Sequence Ahead In Login Message
     */
    SEQUENCE_AHEAD_IN_LOGIN_MESSAGE('Q', "Sequence Ahead In Login Message"),

    /**
     * Invalid Unit Given In Login Message
     */
    INVALID_UNIT_GIVEN_IN_LOGIN_MESSAGE('I', "Invalid Unit Given In Login Message"),

    /**
     * Invalid Return Bit Field In Login Message
     */
    INVALID_RETURN_BIT_FIELD_IN_LOGIN_MESSAGE('F', "Invalid Return Bit Field In Login Message"),

    /**
     * Invalid Login Request Message Structure
     */
    INVALID_LOGIN_REQUEST_MESSAGE_STRUCTURE('M', "Invalid Login Request Message Structure");

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
            case 'N' -> Optional.of(NOT_AUTHORIZED_INVALID_USERNAMEPASSWORD);
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
