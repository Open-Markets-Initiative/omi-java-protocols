package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * securityTradingEvent
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingEvent {

    /**
     * Change of Trading Session.
     */
    TRADING_SESSION_CHANGE((short) 4, "Change of Trading Session."),

    /**
     * Security Status maintained separately from Group Status.
     */
    SECURITY_STATUS_CHANGE((short) 101, "Security Status maintained separately from Group Status."),

    /**
     * Security Status following Group Status.
     */
    SECURITY_REJOINS_SECURITY_GROUP_STATUS((short) 102, "Security Status following Group Status."),

    /**
     * securityTradingEvent
     */
    NO_VALUE((short) 255, "securityTradingEvent");

    private final short wire;

    private final String description;

    SecurityTradingEvent(short wire, String description) {
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
    public static Optional<SecurityTradingEvent> fromWire(short wire) {
        return switch (wire) {
            case 4 -> Optional.of(TRADING_SESSION_CHANGE);
            case 101 -> Optional.of(SECURITY_STATUS_CHANGE);
            case 102 -> Optional.of(SECURITY_REJOINS_SECURITY_GROUP_STATUS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
