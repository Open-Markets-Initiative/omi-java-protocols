package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.enums;

import java.util.Optional;

/**
 * Refer to System Event Codes below
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages. This is always the first message sent in any trading day.
     */
    START_OF_MESSAGES('O', "Start of Messages. This is always the first message sent in any trading day."),

    /**
     * Start of System Hours. This message indicates that NASDAQ is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "Start of System Hours. This message indicates that NASDAQ is open and ready to start accepting orders."),

    /**
     * Start of Opening Process. This message is intended to indicate that NASDAQ has started its opening auction process.
     */
    START_OF_OPENING_PROCESS('Q', "Start of Opening Process. This message is intended to indicate that NASDAQ has started its opening auction process."),

    /**
     * End of Normal Hours Processing - This message is intended to indicate that NASDAQ will no longer accept any new orders or changes to existing orders for options that trade during normal trading hours.
     */
    END_OF_NORMAL_HOURS_PROCESSING('N', "End of Normal Hours Processing - This message is intended to indicate that NASDAQ will no longer accept any new orders or changes to existing orders for options that trade during normal trading hours."),

    /**
     * End of Late Hours Processing - This message is intended to indicate that NASDAQ will no longer accept any new orders or changes to existing orders for options that trade during extended hours.
     */
    END_OF_LATE_HOURS_PROCESSING('L', "End of Late Hours Processing - This message is intended to indicate that NASDAQ will no longer accept any new orders or changes to existing orders for options that trade during extended hours."),

    /**
     * End of System Hours. This message indicates that NASDAQ options system is now closed.
     */
    END_OF_SYSTEM_HOURS('E', "End of System Hours. This message indicates that NASDAQ options system is now closed."),

    /**
     * End of Messages. This is always the last message sent in any trading day.
     */
    END_OF_MESSAGES('C', "End of Messages. This is always the last message sent in any trading day.");

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
            case 'Q' -> Optional.of(START_OF_OPENING_PROCESS);
            case 'N' -> Optional.of(END_OF_NORMAL_HOURS_PROCESSING);
            case 'L' -> Optional.of(END_OF_LATE_HOURS_PROCESSING);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
