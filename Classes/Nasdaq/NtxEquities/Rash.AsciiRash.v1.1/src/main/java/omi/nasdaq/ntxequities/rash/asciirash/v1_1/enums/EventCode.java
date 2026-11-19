package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * See System Event Codes.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Day. This is always the first message each day. It indicates that the system is open and ready to start accepting orders.
     */
    START_OF_DAY('S', "Start of Day. This is always the first message each day. It indicates that the system is open and ready to start accepting orders."),

    /**
     * End of Day. This indicates that the system is now closed and will not accept any new orders in this session. There will not be any more executions during this session, however, it is still possible to receive Broken Trade messages and Canceled Order Messages.
     */
    END_OF_DAY('E', "End of Day. This indicates that the system is now closed and will not accept any new orders in this session. There will not be any more executions during this session, however, it is still possible to receive Broken Trade messages and Canceled Order Messages.");

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
