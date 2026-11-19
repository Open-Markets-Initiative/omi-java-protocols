package omi.eurex.t7.eti.fbe.v2_5.enums;

import java.util.Optional;

/**
 * Defines the ApplId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ApplId {

    /**
     * Trade
     */
    TRADE((short) 1, "Trade"),

    /**
     * News
     */
    NEWS((short) 2, "News"),

    /**
     * Service Availability
     */
    SERVICEAVAILABILITY((short) 3, "Service Availability"),

    /**
     * Session Data
     */
    SESSIONDATA((short) 4, "Session Data"),

    /**
     * Listener Data
     */
    LISTENERDATA((short) 5, "Listener Data"),

    /**
     * Risk Control
     */
    RISK_CONTROL((short) 6, "Risk Control"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ApplId(short wire, String description) {
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
    public static Optional<ApplId> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADE);
            case 2 -> Optional.of(NEWS);
            case 3 -> Optional.of(SERVICEAVAILABILITY);
            case 4 -> Optional.of(SESSIONDATA);
            case 5 -> Optional.of(LISTENERDATA);
            case 6 -> Optional.of(RISK_CONTROL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
