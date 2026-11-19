package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Status of the recovery request.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RecoveryStatus {

    /**
     * Request Accepted
     */
    REQUEST_ACCEPTED('A', "Request Accepted"),

    /**
     * Out Of Range
     */
    OUT_OF_RANGE('O', "Out Of Range"),

    /**
     * Invalid Group Or Instrument
     */
    INVALID_GROUP_OR_INSTRUMENT('a', "Invalid Group Or Instrument"),

    /**
     * Request Limit Reached
     */
    REQUEST_LIMIT_REACHED('b', "Request Limit Reached"),

    /**
     * Concurrent Limit Reached
     */
    CONCURRENT_LIMIT_REACHED('c', "Concurrent Limit Reached"),

    /**
     * Invalid Recovery Type Or Request Level
     */
    INVALID_RECOVERY_TYPE_OR_REQUEST_LEVEL('d', "Invalid Recovery Type Or Request Level"),

    /**
     * Failed Other
     */
    FAILED_OTHER('e', "Failed Other");

    private final char wire;

    private final String description;

    RecoveryStatus(char wire, String description) {
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
    public static Optional<RecoveryStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(REQUEST_ACCEPTED);
            case 'O' -> Optional.of(OUT_OF_RANGE);
            case 'a' -> Optional.of(INVALID_GROUP_OR_INSTRUMENT);
            case 'b' -> Optional.of(REQUEST_LIMIT_REACHED);
            case 'c' -> Optional.of(CONCURRENT_LIMIT_REACHED);
            case 'd' -> Optional.of(INVALID_RECOVERY_TYPE_OR_REQUEST_LEVEL);
            case 'e' -> Optional.of(FAILED_OTHER);
            default -> Optional.empty();
        };
    }
}
