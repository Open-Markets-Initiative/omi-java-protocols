package omi.nasdaq.nsmequities.basicplus.itch.v1_0.enums;

import java.util.Optional;

/**
 * Denotes the type of system event for which the message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Denotes that the Consolidated systems have started the daily transmission schedule
     */
    START_OF_CONSOLIDATED_MARKET_TRANSMISSIONS('O', "Denotes that the Consolidated systems have started the daily transmission schedule"),

    /**
     * The Consolidated Trading Session is open and ready to start accepting orders
     */
    START_OF_SYSTEM_HOURS('S', "The Consolidated Trading Session is open and ready to start accepting orders"),

    /**
     * Denotes the start of the regular US market session
     */
    START_OF_REGULAR_MARKET_HOURS('Q', "Denotes the start of the regular US market session"),

    /**
     * Denotes the end of the regular US session
     */
    END_OF_REGULAR_MARKET_HOURS('M', "Denotes the end of the regular US session"),

    /**
     * The Consolidated Sessions is now closed and will not accept any new orders for the trading day
     */
    END_OF_SYSTEM_HOURS('E', "The Consolidated Sessions is now closed and will not accept any new orders for the trading day"),

    /**
     * Denotes that the consolidated system has ended its daily transmission schedule
     */
    END_OF_TRANSMISSIONS('C', "Denotes that the consolidated system has ended its daily transmission schedule");

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
            case 'O' -> Optional.of(START_OF_CONSOLIDATED_MARKET_TRANSMISSIONS);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'Q' -> Optional.of(START_OF_REGULAR_MARKET_HOURS);
            case 'M' -> Optional.of(END_OF_REGULAR_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_TRANSMISSIONS);
            default -> Optional.empty();
        };
    }
}
