package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Event Code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages. Outside of time stamp messages, the start of day message is the first message sent in any trading day
     */
    START_OF_MESSAGES('O', "Start of Messages. Outside of time stamp messages, the start of day message is the first message sent in any trading day"),

    /**
     * This message indicates that Nasdaq Texas is open and ready to start accepting orders
     */
    START_OF_SYSTEM_HOURS('S', "This message indicates that Nasdaq Texas is open and ready to start accepting orders"),

    /**
     * This message is intended to indicate that Market Hours orders are available for execution
     */
    START_OF_MARKET_HOURS('Q', "This message is intended to indicate that Market Hours orders are available for execution"),

    /**
     * This message is intended to indicate that Market Hours orders are no longer available for execution
     */
    END_OF_MARKET_HOURS('M', "This message is intended to indicate that Market Hours orders are no longer available for execution"),

    /**
     * It indicates that Nasdaq Texas is now closed and will not accept any new orders today. It is still possible to receive Broken Trade messages and Order Delete messages after the End of Day
     */
    END_OF_SYSTEM_HOURS('E', "It indicates that Nasdaq Texas is now closed and will not accept any new orders today. It is still possible to receive Broken Trade messages and Order Delete messages after the End of Day"),

    /**
     * This is always the last message sent in any trading day.
     */
    END_OF_MESSAGES('C', "This is always the last message sent in any trading day.");

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
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
