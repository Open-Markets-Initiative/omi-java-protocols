package omi.bruceats.bruceequities.depthofbook.itch.v3_3.enums;

import java.util.Optional;

/**
 * Defines the EventCode values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Denotes that TotalViewITCH has started its daily transmission schedule
     */
    START_OF_TRANSMISSION('O', "Denotes that TotalViewITCH has started its daily transmission schedule"),

    /**
     * Denotes that Bruce ATS is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "Denotes that Bruce ATS is open and ready to start accepting orders."),

    /**
     * Denotes the start of Bruce ATS Market Hours and orders are now available for execution.
     */
    START_OF_MARKET_HOURS('Q', "Denotes the start of Bruce ATS Market Hours and orders are now available for execution."),

    /**
     * Denotes the end of Bruce ATS Market Hours and orders are no longer available for execution.
     */
    END_OF_MARKET_HOURS('M', "Denotes the end of Bruce ATS Market Hours and orders are no longer available for execution."),

    /**
     * Denotes that Bruce ATS is now closed and will not accept any new orders.
     */
    END_OF_SYSTEM_HOURS('E', "Denotes that Bruce ATS is now closed and will not accept any new orders."),

    /**
     * Denotes that TotalViewITCH has completed its daily transmission schedule.
     */
    END_OF_TRANSMISSIONS('C', "Denotes that TotalViewITCH has completed its daily transmission schedule.");

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
            case 'O' -> Optional.of(START_OF_TRANSMISSION);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_TRANSMISSIONS);
            default -> Optional.empty();
        };
    }
}
