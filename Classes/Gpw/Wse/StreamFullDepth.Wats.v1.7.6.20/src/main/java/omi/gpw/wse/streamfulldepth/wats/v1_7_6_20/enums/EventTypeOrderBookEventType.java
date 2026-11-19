package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type/Kind of book event
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EventTypeOrderBookEventType {

    /**
     * Clear order book
     */
    CLEAR((short) 1, "Clear order book"),

    /**
     * Order book resend start (resend will begin shortly)
     */
    RESEND_START((short) 2, "Order book resend start (resend will begin shortly)"),

    /**
     * Order book resend end (resend is done)
     */
    RESEND_END((short) 3, "Order book resend end (resend is done)");

    private final short wire;

    private final String description;

    EventTypeOrderBookEventType(short wire, String description) {
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
    public static Optional<EventTypeOrderBookEventType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CLEAR);
            case 2 -> Optional.of(RESEND_START);
            case 3 -> Optional.of(RESEND_END);
            default -> Optional.empty();
        };
    }
}
