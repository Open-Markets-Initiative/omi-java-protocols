package omi.nasdaq.nsmequities.totalview.asciiitch.v1_0.enums;

import java.util.Optional;

/**
 * See System Event Codes.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * This is always the first message sent in any session. It indicates that the NASDAQ system is open and ready to start accepting orders.
     */
    START_OF_SESSION('S', "This is always the first message sent in any session. It indicates that the NASDAQ system is open and ready to start accepting orders."),

    /**
     * This is always the last message sent in any session. It indicates that the NASDAQ system is now closed and will not generate any new messages in this session. All orders that remain open in this session are now dead and should be purged from the book.
     */
    END_OF_SESSION('E', "This is always the last message sent in any session. It indicates that the NASDAQ system is now closed and will not generate any new messages in this session. All orders that remain open in this session are now dead and should be purged from the book.");

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
            case 'S' -> Optional.of(START_OF_SESSION);
            case 'E' -> Optional.of(END_OF_SESSION);
            default -> Optional.empty();
        };
    }
}
