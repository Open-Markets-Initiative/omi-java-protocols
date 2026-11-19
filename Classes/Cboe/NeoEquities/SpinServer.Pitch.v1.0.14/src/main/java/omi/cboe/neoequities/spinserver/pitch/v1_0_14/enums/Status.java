package omi.cboe.neoequities.spinserver.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Accepted or reason for reject.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Accepted Login Accepted
     */
    ACCEPTED_LOGIN_ACCEPTED('A', "Accepted Login Accepted"),

    /**
     * Not Authorized Invalid Username Password
     */
    NOT_AUTHORIZED_INVALID_USERNAME_PASSWORD('N', "Not Authorized Invalid Username Password"),

    /**
     * Session In Use
     */
    SESSION_IN_USE('B', "Session In Use"),

    /**
     * Out Of Range
     */
    OUT_OF_RANGE('O', "Out Of Range"),

    /**
     * Invalid Session Spin Already In Progress
     */
    INVALID_SESSION_SPIN_ALREADY_IN_PROGRESS('S', "Invalid Session Spin Already In Progress");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED_LOGIN_ACCEPTED);
            case 'N' -> Optional.of(NOT_AUTHORIZED_INVALID_USERNAME_PASSWORD);
            case 'B' -> Optional.of(SESSION_IN_USE);
            case 'O' -> Optional.of(OUT_OF_RANGE);
            case 'S' -> Optional.of(INVALID_SESSION_SPIN_ALREADY_IN_PROGRESS);
            default -> Optional.empty();
        };
    }
}
