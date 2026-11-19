package omi.cnsx.cse2.retransmission.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginStatus {

    /**
     * Always "Y". An invalid user id or password is signalled by the exchange closing the socket after 5 seconds without sending a login response
     */
    LOGIN_ACCEPTED('Y', "Always \"Y\". An invalid user id or password is signalled by the exchange closing the socket after 5 seconds without sending a login response");

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
        return wire == 'Y' ? Optional.of(LOGIN_ACCEPTED) : Optional.empty();
    }
}
