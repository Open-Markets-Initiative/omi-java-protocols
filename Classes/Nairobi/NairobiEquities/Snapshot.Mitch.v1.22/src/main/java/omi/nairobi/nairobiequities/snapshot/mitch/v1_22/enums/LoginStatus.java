package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Status of the login request. The document names this field Status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginStatus {

    /**
     * Login Accepted
     */
    LOGIN_ACCEPTED('A', "Login Accepted"),

    /**
     * Comp Id Inactive Locked
     */
    COMP_ID_INACTIVE_LOCKED('a', "Comp Id Inactive Locked"),

    /**
     * Login Limit Reached
     */
    LOGIN_LIMIT_REACHED('b', "Login Limit Reached"),

    /**
     * Service Unavailable
     */
    SERVICE_UNAVAILABLE('c', "Service Unavailable"),

    /**
     * Concurrent Limit Reached
     */
    CONCURRENT_LIMIT_REACHED('d', "Concurrent Limit Reached"),

    /**
     * Failed Other
     */
    FAILED_OTHER('e', "Failed Other");

    private final char wire;

    private final String description;

    LoginStatus(char wire, String description) {
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
    public static Optional<LoginStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(LOGIN_ACCEPTED);
            case 'a' -> Optional.of(COMP_ID_INACTIVE_LOCKED);
            case 'b' -> Optional.of(LOGIN_LIMIT_REACHED);
            case 'c' -> Optional.of(SERVICE_UNAVAILABLE);
            case 'd' -> Optional.of(CONCURRENT_LIMIT_REACHED);
            case 'e' -> Optional.of(FAILED_OTHER);
            default -> Optional.empty();
        };
    }
}
