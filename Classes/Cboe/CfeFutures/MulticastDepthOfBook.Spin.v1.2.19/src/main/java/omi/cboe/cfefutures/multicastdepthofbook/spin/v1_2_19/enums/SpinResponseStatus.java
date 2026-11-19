package omi.cboe.cfefutures.multicastdepthofbook.spin.v1_2_19.enums;

import java.util.Optional;

/**
 * Accepted or reason for reject. All non-A status codes should be interpreted as a reject.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SpinResponseStatus {

    /**
     * Accepted
     */
    ACCEPTED('A', "Accepted"),

    /**
     * Out Of Range Sequence Requested Is Greater Than Sequence Available By The Next Spin
     */
    OUT_OF_RANGE_SEQUENCE_REQUESTED_IS_GREATER_THAN_SEQUENCE_AVAILABLE_BY_THE_NEXT_SPIN('O', "Out Of Range Sequence Requested Is Greater Than Sequence Available By The Next Spin"),

    /**
     * Spin Already In Progress Only One Spin Can Be Running At A Time
     */
    SPIN_ALREADY_IN_PROGRESS_ONLY_ONE_SPIN_CAN_BE_RUNNING_AT_A_TIME('S', "Spin Already In Progress Only One Spin Can Be Running At A Time");

    private final char wire;

    private final String description;

    SpinResponseStatus(char wire, String description) {
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
    public static Optional<SpinResponseStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED);
            case 'O' -> Optional.of(OUT_OF_RANGE_SEQUENCE_REQUESTED_IS_GREATER_THAN_SEQUENCE_AVAILABLE_BY_THE_NEXT_SPIN);
            case 'S' -> Optional.of(SPIN_ALREADY_IN_PROGRESS_ONLY_ONE_SPIN_CAN_BE_RUNNING_AT_A_TIME);
            default -> Optional.empty();
        };
    }
}
