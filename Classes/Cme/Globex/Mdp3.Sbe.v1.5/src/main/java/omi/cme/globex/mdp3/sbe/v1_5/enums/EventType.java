package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Code to represent the type of event
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventType {

    /**
     * Activation
     */
    ACTIVATION((short) 5, "Activation"),

    /**
     * Last Eligible Trade Date
     */
    LAST_ELIGIBLE_TRADE_DATE((short) 7, "Last Eligible Trade Date");

    private final short wire;

    private final String description;

    EventType(short wire, String description) {
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
    public static Optional<EventType> fromWire(short wire) {
        return switch (wire) {
            case 5 -> Optional.of(ACTIVATION);
            case 7 -> Optional.of(LAST_ELIGIBLE_TRADE_DATE);
            default -> Optional.empty();
        };
    }
}
