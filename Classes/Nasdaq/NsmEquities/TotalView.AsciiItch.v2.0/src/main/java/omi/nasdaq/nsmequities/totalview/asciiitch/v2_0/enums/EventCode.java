package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.enums;

import java.util.Optional;

/**
 * See System Event Codes.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * This is always the first message sent in any trading day. It indicates that NASDAQ is open and ready to start accepting orders.
     */
    START_OF_DAY('S', "This is always the first message sent in any trading day. It indicates that NASDAQ is open and ready to start accepting orders."),

    /**
     * It indicates that NASDAQ is now closed and will not accept any new orders today. All orders that remain open in this session are now dead and can be purged from the book. It is still possible to receive Broken Trade Messages and Order Cancel Messages after the End of Day.
     */
    END_OF_DAY('E', "It indicates that NASDAQ is now closed and will not accept any new orders today. All orders that remain open in this session are now dead and can be purged from the book. It is still possible to receive Broken Trade Messages and Order Cancel Messages after the End of Day.");

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
