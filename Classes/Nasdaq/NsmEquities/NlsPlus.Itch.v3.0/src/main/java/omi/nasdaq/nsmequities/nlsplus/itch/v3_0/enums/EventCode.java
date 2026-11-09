package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Denotes the Nls Plus type of system event for which the message is being generated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Denotes that the Nls Plus system has started its daily transmission schedule.
     */
    START_OF_TRANSMISSIONS('O', "Denotes that the Nls Plus system has started its daily transmission schedule."),

    /**
     * This message indicates that Nasdaq is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "This message indicates that Nasdaq is open and ready to start accepting orders."),

    /**
     * Denotes the start of the regular US market session.
     */
    START_OF_MARKET_HOURS('Q', "Denotes the start of the regular US market session."),

    /**
     * Denotes the end of the regular US session.
     */
    END_OF_MARKET_HOURS('M', "Denotes the end of the regular US session."),

    /**
     * Indicates that Nasdaq is now closed and will not accept any new orders today.
     */
    END_OF_SYSTEM_HOURS('E', "Indicates that Nasdaq is now closed and will not accept any new orders today."),

    /**
     * Denotes that the Nls Plus system has ended its daily transmission schedule.
     */
    END_OF_TRANSMISSIONS('C', "Denotes that the Nls Plus system has ended its daily transmission schedule.");

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
            case 'O' -> Optional.of(START_OF_TRANSMISSIONS);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_TRANSMISSIONS);
            default -> Optional.empty();
        };
    }
}
