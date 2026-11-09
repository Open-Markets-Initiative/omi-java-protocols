package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.enums;

import java.util.Optional;

/**
 * Event Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Event {

    /**
     * Start Of Session
     */
    START_OF_SESSION('O', "Start Of Session"),

    /**
     * Market Accepting Orders
     */
    MARKET_ACCEPTING_ORDERS('S', "Market Accepting Orders"),

    /**
     * Market Open For Trading
     */
    MARKET_OPEN_FOR_TRADING('Q', "Market Open For Trading"),

    /**
     * Market Trading Ended For Day
     */
    MARKET_TRADING_ENDED_FOR_DAY('E', "Market Trading Ended For Day"),

    /**
     * End Of Session
     */
    END_OF_SESSION('C', "End Of Session");

    private final char wire;

    private final String description;

    Event(char wire, String description) {
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
    public static Optional<Event> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(START_OF_SESSION);
            case 'S' -> Optional.of(MARKET_ACCEPTING_ORDERS);
            case 'Q' -> Optional.of(MARKET_OPEN_FOR_TRADING);
            case 'E' -> Optional.of(MARKET_TRADING_ENDED_FOR_DAY);
            case 'C' -> Optional.of(END_OF_SESSION);
            default -> Optional.empty();
        };
    }
}
