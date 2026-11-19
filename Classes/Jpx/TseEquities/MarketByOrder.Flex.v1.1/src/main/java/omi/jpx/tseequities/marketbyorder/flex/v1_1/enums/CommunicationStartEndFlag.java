package omi.jpx.tseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * Indicates the start or end of communication
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CommunicationStartEndFlag {

    /**
     * Health Check Control
     */
    HEALTH_CHECK_CONTROL((short) 0, "Health Check Control"),

    /**
     * Communication Start
     */
    COMMUNICATION_START((short) 1, "Communication Start"),

    /**
     * Communication End
     */
    COMMUNICATION_END((short) 2, "Communication End");

    private final short wire;

    private final String description;

    CommunicationStartEndFlag(short wire, String description) {
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
    public static Optional<CommunicationStartEndFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(HEALTH_CHECK_CONTROL);
            case 1 -> Optional.of(COMMUNICATION_START);
            case 2 -> Optional.of(COMMUNICATION_END);
            default -> Optional.empty();
        };
    }
}
