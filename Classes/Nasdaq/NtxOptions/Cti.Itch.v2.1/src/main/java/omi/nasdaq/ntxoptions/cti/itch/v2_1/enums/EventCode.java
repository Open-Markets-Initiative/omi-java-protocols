package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * Refer to System Event Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages. Always the first message sent in any trading day (after ~4:00am).
     */
    START_OF_MESSAGES('O', "Start of Messages. Always the first message sent in any trading day (after ~4:00am)."),

    /**
     * Start of System Hours. The exchange is ready to start accepting orders (7:00am).
     */
    START_OF_SYSTEM_HOURS('S', "Start of System Hours. The exchange is ready to start accepting orders (7:00am)."),

    /**
     * Start of Currency Opening Process. The options system has started its opening auction process for currency options (7:30:00am).
     */
    START_OF_CURRENCY_OPENING_PROCESS('F', "Start of Currency Opening Process. The options system has started its opening auction process for currency options (7:30:00am)."),

    /**
     * Start of Opening Process. The exchange has started its opening process (9:30:00am).
     */
    START_OF_OPENING_PROCESS('Q', "Start of Opening Process. The exchange has started its opening process (9:30:00am)."),

    /**
     * End of Normal Hours Processing. No new orders or changes to existing orders for options that trade during normal hours (4:00:00pm).
     */
    END_OF_NORMAL_HOURS_PROCESSING('N', "End of Normal Hours Processing. No new orders or changes to existing orders for options that trade during normal hours (4:00:00pm)."),

    /**
     * End of Late Hours Processing. No new orders or changes to existing orders for options that trade during extended hours (4:15:00pm).
     */
    END_OF_LATE_HOURS_PROCESSING('L', "End of Late Hours Processing. No new orders or changes to existing orders for options that trade during extended hours (4:15:00pm)."),

    /**
     * End of System Hours. The system is now closed (~5:30pm).
     */
    END_OF_SYSTEM_HOURS('E', "End of System Hours. The system is now closed (~5:30pm)."),

    /**
     * End of Messages. Always the last message sent in any trading day (~5:35pm).
     */
    END_OF_MESSAGES('C', "End of Messages. Always the last message sent in any trading day (~5:35pm).");

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
            case 'O' -> Optional.of(START_OF_MESSAGES);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'F' -> Optional.of(START_OF_CURRENCY_OPENING_PROCESS);
            case 'Q' -> Optional.of(START_OF_OPENING_PROCESS);
            case 'N' -> Optional.of(END_OF_NORMAL_HOURS_PROCESSING);
            case 'L' -> Optional.of(END_OF_LATE_HOURS_PROCESSING);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
