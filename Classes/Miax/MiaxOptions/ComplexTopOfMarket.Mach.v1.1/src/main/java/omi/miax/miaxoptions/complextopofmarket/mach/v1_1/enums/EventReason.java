package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Values: “A” = This event resulted from automatic/market driven event “M” = MIAX manually initiated this event
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventReason {

    /**
     * This Event Resulted From Automaticmarket Driven Event
     */
    AUTOMATIC('A', "This Event Resulted From Automaticmarket Driven Event"),

    /**
     * Miax Manually Initiated This Event
     */
    MANUAL('M', "Miax Manually Initiated This Event");

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
            case 'A' -> Optional.of(AUTOMATIC);
            case 'M' -> Optional.of(MANUAL);
            default -> Optional.empty();
        };
    }
}
