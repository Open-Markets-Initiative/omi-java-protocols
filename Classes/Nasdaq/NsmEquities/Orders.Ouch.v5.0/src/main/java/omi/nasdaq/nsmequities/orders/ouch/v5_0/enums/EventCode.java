package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Event Code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start Of Day, indicating that exchange is open and is ready to accept orders.
     */
    START_OF_DAY('S', "Start Of Day, indicating that exchange is open and is ready to accept orders."),

    /**
     * End Of Day, indicating that the exchange is closed and will no longer accept new orders. Note that it is still possible to receive breaks and cancels after this event.
     */
    END_OF_DAY('E', "End Of Day, indicating that the exchange is closed and will no longer accept new orders. Note that it is still possible to receive breaks and cancels after this event.");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(START_OF_DAY);
            case 'E' -> Optional.of(END_OF_DAY);
            default -> Optional.empty();
        };
    }
}
