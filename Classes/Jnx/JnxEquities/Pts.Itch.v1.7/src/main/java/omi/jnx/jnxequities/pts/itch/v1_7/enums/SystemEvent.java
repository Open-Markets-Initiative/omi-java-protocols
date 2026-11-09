package omi.jnx.jnxequities.pts.itch.v1_7.enums;

import java.util.Optional;

/**
 * Refer to the System Events table below.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemEvent {

    /**
     * Always the first message sent in any trading day excepting Timestamp – Seconds Messages.
     */
    START_OF_MESSAGES('O', "Always the first message sent in any trading day excepting Timestamp \u2013 Seconds Messages."),

    /**
     * Indicates the market is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "Indicates the market is open and ready to start accepting orders."),

    /**
     * Start of trading session.
     */
    START_OF_MARKET_HOURS('Q', "Start of trading session."),

    /**
     * End of trading session.
     */
    END_OF_MARKET_HOURS('M', "End of trading session."),

    /**
     * Indicates the market is closed and will not accept any new orders.
     */
    END_OF_SYSTEM_HOURS('E', "Indicates the market is closed and will not accept any new orders."),

    /**
     * Always the last message sent in any trading day.
     */
    END_OF_MESSAGES('C', "Always the last message sent in any trading day.");

    private final char wire;

    private final String description;

    SystemEvent(char wire, String description) {
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
    public static Optional<SystemEvent> fromWire(char wire) {
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
