package omi.cboe.bzxequities.multicastdepthofbook.spin.v2_20_4.enums;

import java.util.Optional;

/**
 * Accepted or reason for reject
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginResponseStatus {

    /**
     * Login Accepted
     */
    LOGIN_ACCEPTED('A', "Login Accepted"),

    /**
     * Not Authorized Invalid Username Password
     */
    NOT_AUTHORIZED_INVALID_USERNAME_PASSWORD('N', "Not Authorized Invalid Username Password"),

    /**
     * Session In Use
     */
    SESSION_IN_USE('B', "Session In Use"),

    /**
     * Invalid Session
     */
    INVALID_SESSION('S', "Invalid Session");

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
            case 'N' -> Optional.of(NOT_AUTHORIZED_INVALID_USERNAME_PASSWORD);
            case 'B' -> Optional.of(SESSION_IN_USE);
            case 'S' -> Optional.of(INVALID_SESSION);
            default -> Optional.empty();
        };
    }
}
