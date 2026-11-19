package omi.euronext.optiq.dropcopygateway.sbe.v6_67.enums;

import java.util.Optional;

/**
 * eventShortCodeType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventShortCodeType {

    /**
     * Event_EWFSC
     */
    EVENT_EWFSC((short) 1, "Event_EWFSC"),

    /**
     * Event_CISC
     */
    EVENT_CISC((short) 2, "Event_CISC"),

    /**
     * eventShortCodeType
     */
    NO_VALUE((short) 255, "eventShortCodeType");

    private final short wire;

    private final String description;

    EventShortCodeType(short wire, String description) {
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
    public static Optional<EventShortCodeType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EVENT_EWFSC);
            case 2 -> Optional.of(EVENT_CISC);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
