package omi.eurex.t7.xti.fbe.v7_0.enums;

import java.util.Optional;

/**
 * Defines the EventType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventType {

    /**
     * Redemption
     */
    REDEMPTION((short) 26, "Redemption"),

    /**
     * Delisting
     */
    DELISTING((short) 100, "Delisting"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

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
            case 26 -> Optional.of(REDEMPTION);
            case 100 -> Optional.of(DELISTING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
