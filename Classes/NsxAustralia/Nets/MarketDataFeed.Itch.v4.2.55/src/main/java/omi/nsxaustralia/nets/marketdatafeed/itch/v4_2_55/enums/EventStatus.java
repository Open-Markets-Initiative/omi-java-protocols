package omi.nsxaustralia.nets.marketdatafeed.itch.v4_2_55.enums;

import java.util.Optional;

/**
 * Current status of the event.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventStatus {

    /**
     * Scheduled
     */
    SCHEDULED('S', "Scheduled"),

    /**
     * Canceled
     */
    CANCELED('C', "Canceled"),

    /**
     * Triggered
     */
    TRIGGERED('T', "Triggered");

    private final char wire;

    private final String description;

    EventStatus(char wire, String description) {
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
    public static Optional<EventStatus> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SCHEDULED);
            case 'C' -> Optional.of(CANCELED);
            case 'T' -> Optional.of(TRIGGERED);
            default -> Optional.empty();
        };
    }
}
