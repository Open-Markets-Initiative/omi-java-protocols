package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Outcome of the missed message transmission
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransmissionStatus {

    /**
     * All Messages Transmitted
     */
    ALL_MESSAGES_TRANSMITTED((short) 0, "All Messages Transmitted"),

    /**
     * Message Limit Reached
     */
    MESSAGE_LIMIT_REACHED((short) 1, "Message Limit Reached"),

    /**
     * Service Unavailable
     */
    SERVICE_UNAVAILABLE((short) 3, "Service Unavailable");

    private final short wire;

    private final String description;

    TransmissionStatus(short wire, String description) {
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
    public static Optional<TransmissionStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALL_MESSAGES_TRANSMITTED);
            case 1 -> Optional.of(MESSAGE_LIMIT_REACHED);
            case 3 -> Optional.of(SERVICE_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
