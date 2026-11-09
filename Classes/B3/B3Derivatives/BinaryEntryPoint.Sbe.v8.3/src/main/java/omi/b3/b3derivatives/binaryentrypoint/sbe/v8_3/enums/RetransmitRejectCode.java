package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * retransmitRejectCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransmitRejectCode {

    /**
     * OUT_OF_RANGE
     */
    OUT_OF_RANGE((short) 0, "OUT_OF_RANGE"),

    /**
     * INVALID_SESSION
     */
    INVALID_SESSION((short) 1, "INVALID_SESSION"),

    /**
     * REQUEST_LIMIT_EXCEEDED
     */
    REQUEST_LIMIT_EXCEEDED((short) 2, "REQUEST_LIMIT_EXCEEDED"),

    /**
     * RETRANSMIT_IN_PROGRESS
     */
    RETRANSMIT_IN_PROGRESS((short) 3, "RETRANSMIT_IN_PROGRESS"),

    /**
     * INVALID_TIMESTAMP
     */
    INVALID_TIMESTAMP((short) 4, "INVALID_TIMESTAMP"),

    /**
     * INVALID_FROMSEQNO
     */
    INVALID_FROMSEQNO((short) 5, "INVALID_FROMSEQNO"),

    /**
     * INVALID_COUNT
     */
    INVALID_COUNT((short) 9, "INVALID_COUNT"),

    /**
     * THROTTLE_REJECT
     */
    THROTTLE_REJECT((short) 10, "THROTTLE_REJECT"),

    /**
     * SYSTEM_BUSY
     */
    SYSTEM_BUSY((short) 11, "SYSTEM_BUSY");

    private final short wire;

    private final String description;

    RetransmitRejectCode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<RetransmitRejectCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(OUT_OF_RANGE);
            case 1 -> Optional.of(INVALID_SESSION);
            case 2 -> Optional.of(REQUEST_LIMIT_EXCEEDED);
            case 3 -> Optional.of(RETRANSMIT_IN_PROGRESS);
            case 4 -> Optional.of(INVALID_TIMESTAMP);
            case 5 -> Optional.of(INVALID_FROMSEQNO);
            case 9 -> Optional.of(INVALID_COUNT);
            case 10 -> Optional.of(THROTTLE_REJECT);
            case 11 -> Optional.of(SYSTEM_BUSY);
            default -> Optional.empty();
        };
    }
}
