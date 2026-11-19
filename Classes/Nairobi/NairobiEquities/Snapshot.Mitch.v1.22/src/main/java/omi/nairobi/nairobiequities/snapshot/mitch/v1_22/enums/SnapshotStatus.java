package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Status of the snapshot request. The document names this field Status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SnapshotStatus {

    /**
     * Request Accepted
     */
    REQUEST_ACCEPTED('A', "Request Accepted"),

    /**
     * Out Of Range
     */
    OUT_OF_RANGE('O', "Out Of Range"),

    /**
     * Snapshot Unavailable
     */
    SNAPSHOT_UNAVAILABLE('U', "Snapshot Unavailable"),

    /**
     * Segment Symbol Or Sub Book Invalid Or Not Specified
     */
    SEGMENT_SYMBOL_OR_SUB_BOOK_INVALID_OR_NOT_SPECIFIED('a', "Segment Symbol Or Sub Book Invalid Or Not Specified"),

    /**
     * Request Limit Reached
     */
    REQUEST_LIMIT_REACHED('b', "Request Limit Reached"),

    /**
     * Concurrent Limit Reached
     */
    CONCURRENT_LIMIT_REACHED('c', "Concurrent Limit Reached"),

    /**
     * Unsupported Message Type
     */
    UNSUPPORTED_MESSAGE_TYPE('d', "Unsupported Message Type"),

    /**
     * Failed Other
     */
    FAILED_OTHER('e', "Failed Other");

    private final char wire;

    private final String description;

    SnapshotStatus(char wire, String description) {
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
    public static Optional<SnapshotStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(REQUEST_ACCEPTED);
            case 'O' -> Optional.of(OUT_OF_RANGE);
            case 'U' -> Optional.of(SNAPSHOT_UNAVAILABLE);
            case 'a' -> Optional.of(SEGMENT_SYMBOL_OR_SUB_BOOK_INVALID_OR_NOT_SPECIFIED);
            case 'b' -> Optional.of(REQUEST_LIMIT_REACHED);
            case 'c' -> Optional.of(CONCURRENT_LIMIT_REACHED);
            case 'd' -> Optional.of(UNSUPPORTED_MESSAGE_TYPE);
            case 'e' -> Optional.of(FAILED_OTHER);
            default -> Optional.empty();
        };
    }
}
