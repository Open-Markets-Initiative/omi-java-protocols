package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the RefApplId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RefApplId {

    /**
     * Trade Enhancement Data
     */
    TRADE_ENHANCEMENT((short) 0, "Trade Enhancement Data"),

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
     * Risk Admin
     */
    RISK_ADMIN((short) 8, "Risk Admin"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RefApplId(short wire, String description) {
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
    public static Optional<RefApplId> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(TRADE_ENHANCEMENT);
            case 1 -> Optional.of(TRADE);
            case 2 -> Optional.of(NEWS);
            case 3 -> Optional.of(SERVICEAVAILABILITY);
            case 4 -> Optional.of(SESSIONDATA);
            case 5 -> Optional.of(LISTENERDATA);
            case 6 -> Optional.of(RISK_CONTROL);
            case 8 -> Optional.of(RISK_ADMIN);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
