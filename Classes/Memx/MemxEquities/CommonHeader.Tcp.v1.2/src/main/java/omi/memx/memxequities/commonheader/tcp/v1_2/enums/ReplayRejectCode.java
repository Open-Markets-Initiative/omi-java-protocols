package omi.memx.memxequities.commonheader.tcp.v1_2.enums;

import java.util.Optional;

/**
 * The code for the rejection type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReplayRejectCode {

    /**
     * Stream requests are not allowed by this server. Must use replay requests to receive data
     */
    REPLAY_REQUESTS_ARE_NOT_ALLOWED('R', "Stream requests are not allowed by this server. Must use replay requests to receive data"),

    /**
     * Replay all requests are not allowed by this server
     */
    REPLAY_ALL_REQUESTS_ARE_NOT_ALLOWED('A', "Replay all requests are not allowed by this server"),

    /**
     * The session ID on the request is not the active session
     */
    NOT_THE_ACTIVE_SESSION('P', "The session ID on the request is not the active session"),

    /**
     * Start sequence number out of range
     */
    SEQUENCE_NUMBER_OUT_OF_RANGE('S', "Start sequence number out of range");

    private final char wire;

    private final String description;

    ReplayRejectCode(char wire, String description) {
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
    public static Optional<ReplayRejectCode> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REPLAY_REQUESTS_ARE_NOT_ALLOWED);
            case 'A' -> Optional.of(REPLAY_ALL_REQUESTS_ARE_NOT_ALLOWED);
            case 'P' -> Optional.of(NOT_THE_ACTIVE_SESSION);
            case 'S' -> Optional.of(SEQUENCE_NUMBER_OUT_OF_RANGE);
            default -> Optional.empty();
        };
    }
}
