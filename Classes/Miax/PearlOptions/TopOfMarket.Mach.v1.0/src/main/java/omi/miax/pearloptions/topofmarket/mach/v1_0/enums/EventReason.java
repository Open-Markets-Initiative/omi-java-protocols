package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * Defines the EventReason values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventReason {

    /**
     * This Event Resulted From Automaticmarket Driven Event
     */
    RESULTED_FROM_AUTOMATICMARKET_DRIVEN_EVENT('A', "This Event Resulted From Automaticmarket Driven Event"),

    /**
     * Pearl Manually Initiated This Event
     */
    MANUALLY_INITIATED('M', "Pearl Manually Initiated This Event");

    private final char wire;

    private final String description;

    EventReason(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<EventReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(RESULTED_FROM_AUTOMATICMARKET_DRIVEN_EVENT);
            case 'M' -> Optional.of(MANUALLY_INITIATED);
            default -> Optional.empty();
        };
    }
}
