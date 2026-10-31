package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.enums;

import java.util.Optional;

/**
 * Refer to System Event Codes below
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages
     */
    START_OF_MESSAGES('O', "Start of Messages"),

    /**
     * Start of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start of System Hours"),

    /**
     * Start of Opening Process
     */
    START_OF_OPENING_PROCESS('Q', "Start of Opening Process"),

    /**
     * Start of Normal Hours Closing Process
     */
    START_OF_NORMAL_HOURS_CLOSING_PROCESS('N', "Start of Normal Hours Closing Process"),

    /**
     * Start of Late Hours Closing Process
     */
    START_OF_LATE_HOURS_CLOSING_PROCESS('L', "Start of Late Hours Closing Process"),

    /**
     * End of System Hours
     */
    END_OF_SYSTEM_HOURS('E', "End of System Hours"),

    /**
     * End of Messages
     */
    END_OF_MESSAGES('C', "End of Messages"),

    /**
     * End of WCO Early closing
     */
    END_OF_WCO_EARLY_CLOSING('W', "End of WCO Early closing");

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
            case 'N' -> Optional.of(START_OF_NORMAL_HOURS_CLOSING_PROCESS);
            case 'L' -> Optional.of(START_OF_LATE_HOURS_CLOSING_PROCESS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            case 'W' -> Optional.of(END_OF_WCO_EARLY_CLOSING);
            default -> Optional.empty();
        };
    }
}
