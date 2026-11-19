package omi.biva.bivaequities.totalview.itch.v1_12.enums;

import java.util.Optional;

/**
 * Event code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start Of Messages
     */
    START_OF_MESSAGES('O', "Start Of Messages"),

    /**
     * Start Of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start Of System Hours"),

    /**
     * Start Of Market Hours
     */
    START_OF_MARKET_HOURS('Q', "Start Of Market Hours"),

    /**
     * End Of Market Hours
     */
    END_OF_MARKET_HOURS('M', "End Of Market Hours"),

    /**
     * Scheduled Auction Starts
     */
    SCHEDULED_AUCTION_STARTS('V', "Scheduled Auction Starts"),

    /**
     * Scheduled Auction Closes
     */
    SCHEDULED_AUCTION_CLOSES('U', "Scheduled Auction Closes"),

    /**
     * Start Of Post Close Session
     */
    START_OF_POST_CLOSE_SESSION('P', "Start Of Post Close Session"),

    /**
     * End Of Post Close Session
     */
    END_OF_POST_CLOSE_SESSION('T', "End Of Post Close Session"),

    /**
     * End Of System Hours
     */
    END_OF_SYSTEM_HOURS('E', "End Of System Hours"),

    /**
     * End Of Messages
     */
    END_OF_MESSAGES('C', "End Of Messages");

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
            case 'V' -> Optional.of(SCHEDULED_AUCTION_STARTS);
            case 'U' -> Optional.of(SCHEDULED_AUCTION_CLOSES);
            case 'P' -> Optional.of(START_OF_POST_CLOSE_SESSION);
            case 'T' -> Optional.of(END_OF_POST_CLOSE_SESSION);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
