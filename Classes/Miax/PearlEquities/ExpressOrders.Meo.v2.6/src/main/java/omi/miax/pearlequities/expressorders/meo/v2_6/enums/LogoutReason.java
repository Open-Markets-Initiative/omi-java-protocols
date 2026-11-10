package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Logout Request Reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LogoutReason {

    /**
     * Graceful Logout (Done for now)
     */
    GRACEFUL_LOGOUT(' ', "Graceful Logout (Done for now)"),

    /**
     * Bad ESesM Packet
     */
    BAD_PACKET('B', "Bad ESesM Packet"),

    /**
     * Timed out waiting for Login Packet
     */
    TIMED_OUT('L', "Timed out waiting for Login Packet"),

    /**
     * Application terminating connection
     */
    APPLICATION_TERMINATING_CONNECTION('A', "Application terminating connection");

    private final char wire;

    private final String description;

    LogoutReason(char wire, String description) {
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
    public static Optional<LogoutReason> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(GRACEFUL_LOGOUT);
            case 'B' -> Optional.of(BAD_PACKET);
            case 'L' -> Optional.of(TIMED_OUT);
            case 'A' -> Optional.of(APPLICATION_TERMINATING_CONNECTION);
            default -> Optional.empty();
        };
    }
}
