package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Outcome of the missed message request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MissedMessageStatus {

    /**
     * Request Accepted Successful
     */
    REQUEST_ACCEPTED_SUCCESSFUL((short) 0, "Request Accepted Successful"),

    /**
     * Request Limit Reached
     */
    REQUEST_LIMIT_REACHED((short) 1, "Request Limit Reached"),

    /**
     * Invalid Partition Id
     */
    INVALID_PARTITION_ID((short) 2, "Invalid Partition Id"),

    /**
     * Service Unavailable
     */
    SERVICE_UNAVAILABLE((short) 3, "Service Unavailable");

    private final short wire;

    private final String description;

    MissedMessageStatus(short wire, String description) {
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
    public static Optional<MissedMessageStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REQUEST_ACCEPTED_SUCCESSFUL);
            case 1 -> Optional.of(REQUEST_LIMIT_REACHED);
            case 2 -> Optional.of(INVALID_PARTITION_ID);
            case 3 -> Optional.of(SERVICE_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
