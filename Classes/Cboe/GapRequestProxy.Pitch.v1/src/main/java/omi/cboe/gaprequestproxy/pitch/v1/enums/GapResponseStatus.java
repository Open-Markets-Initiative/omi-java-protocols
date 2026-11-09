package omi.cboe.gaprequestproxy.pitch.v1.enums;

import java.util.Optional;

/**
 * Accepted or reason for reject. All non-'A' status codes should be interpreted as a reject.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum GapResponseStatus {

    /**
     * Accepted
     */
    ACCEPTED('A', "Accepted"),

    /**
     * Out Of Range Ahead Of Sequence Or Too Far Behind
     */
    OUT_OF_RANGE_AHEAD_OF_SEQUENCE_OR_TOO_FAR_BEHIND('O', "Out Of Range Ahead Of Sequence Or Too Far Behind"),

    /**
     * Daily Gap Request Allocation Exhausted
     */
    DAILY_GAP_REQUEST_ALLOCATION_EXHAUSTED('D', "Daily Gap Request Allocation Exhausted"),

    /**
     * Minute Gap Request Allocation Exhausted
     */
    MINUTE_GAP_REQUEST_ALLOCATION_EXHAUSTED('M', "Minute Gap Request Allocation Exhausted"),

    /**
     * Second Gap Request Allocation Exhausted
     */
    SECOND_GAP_REQUEST_ALLOCATION_EXHAUSTED('S', "Second Gap Request Allocation Exhausted"),

    /**
     * Count Request Limit For One Gap Request Exceeded
     */
    COUNT_REQUEST_LIMIT_FOR_ONE_GAP_REQUEST_EXCEEDED('C', "Count Request Limit For One Gap Request Exceeded"),

    /**
     * Invalid Unit Specified In Request
     */
    INVALID_UNIT_SPECIFIED_IN_REQUEST('I', "Invalid Unit Specified In Request"),

    /**
     * Unit Is Currently Unavailable
     */
    UNIT_IS_CURRENTLY_UNAVAILABLE('U', "Unit Is Currently Unavailable");

    private final char wire;

    private final String description;

    GapResponseStatus(char wire, String description) {
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
    public static Optional<GapResponseStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED);
            case 'O' -> Optional.of(OUT_OF_RANGE_AHEAD_OF_SEQUENCE_OR_TOO_FAR_BEHIND);
            case 'D' -> Optional.of(DAILY_GAP_REQUEST_ALLOCATION_EXHAUSTED);
            case 'M' -> Optional.of(MINUTE_GAP_REQUEST_ALLOCATION_EXHAUSTED);
            case 'S' -> Optional.of(SECOND_GAP_REQUEST_ALLOCATION_EXHAUSTED);
            case 'C' -> Optional.of(COUNT_REQUEST_LIMIT_FOR_ONE_GAP_REQUEST_EXCEEDED);
            case 'I' -> Optional.of(INVALID_UNIT_SPECIFIED_IN_REQUEST);
            case 'U' -> Optional.of(UNIT_IS_CURRENTLY_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
