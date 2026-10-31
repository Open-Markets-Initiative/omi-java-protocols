package omi.iex.iexequities.deep.iextp.v1_08.enums;

import java.util.Optional;

/**
 * Identifies event processing by the System
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventFlags {

    /**
     * Order Book Is Processing An Event
     */
    ORDER_BOOK_IS_PROCESSING_AN_EVENT((short) 0, "Order Book Is Processing An Event"),

    /**
     * Event Processing Complete
     */
    EVENT_PROCESSING_COMPLETE((short) 1, "Event Processing Complete");

    private final short wire;

    private final String description;

    EventFlags(short wire, String description) {
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
    public static Optional<EventFlags> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ORDER_BOOK_IS_PROCESSING_AN_EVENT);
            case 1 -> Optional.of(EVENT_PROCESSING_COMPLETE);
            default -> Optional.empty();
        };
    }
}
