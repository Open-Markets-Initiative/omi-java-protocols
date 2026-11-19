package omi.lseg.lse.level2mboreplay.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Status of the replay request.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReplayStatus {

    /**
     * Request Accepted
     */
    REQUEST_ACCEPTED('A', "Request Accepted"),

    /**
     * Request Limit Reached
     */
    REQUEST_LIMIT_REACHED('D', "Request Limit Reached"),

    /**
     * Out Of Range
     */
    OUT_OF_RANGE('O', "Out Of Range"),

    /**
     * Replay Unavailable
     */
    REPLAY_UNAVAILABLE('U', "Replay Unavailable"),

    /**
     * Concurrent Limit Reached
     */
    CONCURRENT_LIMIT_REACHED('c', "Concurrent Limit Reached"),

    /**
     * Failed Other
     */
    FAILED_OTHER('e', "Failed Other");

    private final char wire;

    private final String description;

    ReplayStatus(char wire, String description) {
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
    public static Optional<ReplayStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(REQUEST_ACCEPTED);
            case 'D' -> Optional.of(REQUEST_LIMIT_REACHED);
            case 'O' -> Optional.of(OUT_OF_RANGE);
            case 'U' -> Optional.of(REPLAY_UNAVAILABLE);
            case 'c' -> Optional.of(CONCURRENT_LIMIT_REACHED);
            case 'e' -> Optional.of(FAILED_OTHER);
            default -> Optional.empty();
        };
    }
}
