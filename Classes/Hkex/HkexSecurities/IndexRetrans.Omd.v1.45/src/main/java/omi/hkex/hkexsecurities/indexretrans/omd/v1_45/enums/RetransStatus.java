package omi.hkex.hkexsecurities.indexretrans.omd.v1_45.enums;

import java.util.Optional;

/**
 * Status of the Retransmission response.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransStatus {

    /**
     * Request Accepted
     */
    REQUEST_ACCEPTED((short) 0, "Request Accepted"),

    /**
     * Unknown Or Unauthorized Channel Id
     */
    UNKNOWN_OR_UNAUTHORIZED_CHANNEL_ID((short) 1, "Unknown Or Unauthorized Channel Id"),

    /**
     * Messages Not Available
     */
    MESSAGES_NOT_AVAILABLE((short) 2, "Messages Not Available"),

    /**
     * Exceeds Maximum Sequence Range
     */
    EXCEEDS_MAXIMUM_SEQUENCE_RANGE((short) 100, "Exceeds Maximum Sequence Range"),

    /**
     * Exceeds Maximum Requests In A Day
     */
    EXCEEDS_MAXIMUM_REQUESTS_IN_A_DAY((short) 101, "Exceeds Maximum Requests In A Day");

    private final short wire;

    private final String description;

    RetransStatus(short wire, String description) {
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
    public static Optional<RetransStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REQUEST_ACCEPTED);
            case 1 -> Optional.of(UNKNOWN_OR_UNAUTHORIZED_CHANNEL_ID);
            case 2 -> Optional.of(MESSAGES_NOT_AVAILABLE);
            case 100 -> Optional.of(EXCEEDS_MAXIMUM_SEQUENCE_RANGE);
            case 101 -> Optional.of(EXCEEDS_MAXIMUM_REQUESTS_IN_A_DAY);
            default -> Optional.empty();
        };
    }
}
