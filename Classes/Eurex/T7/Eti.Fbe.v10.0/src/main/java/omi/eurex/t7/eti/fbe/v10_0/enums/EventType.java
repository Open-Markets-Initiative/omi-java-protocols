package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the EventType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventType {

    /**
     * Swap Start Date
     */
    SWAP_START_DATE((short) 8, "Swap Start Date"),

    /**
     * Swap End Date
     */
    SWAP_END_DATE((short) 9, "Swap End Date"),

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
            case 8 -> Optional.of(SWAP_START_DATE);
            case 9 -> Optional.of(SWAP_END_DATE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
