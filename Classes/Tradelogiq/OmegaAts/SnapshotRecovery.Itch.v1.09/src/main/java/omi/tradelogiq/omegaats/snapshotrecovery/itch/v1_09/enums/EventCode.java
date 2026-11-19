package omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.enums;

import java.util.Optional;

/**
 * Start-Of-Messages opens the spin and End-Of-Messages closes it
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start-Of-Messages event, the first message of the spin
     */
    START_OF_MESSAGES('O', "Start-Of-Messages event, the first message of the spin"),

    /**
     * This message indicates that Tradelogiq is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "This message indicates that Tradelogiq is open and ready to start accepting orders."),

    /**
     * This message is intended to indicate that Market Hours orders are available for execution.
     */
    START_OF_MARKET_HOURS('Q', "This message is intended to indicate that Market Hours orders are available for execution."),

    /**
     * This message is intended to indicate that Market Hours orders are no longer available for execution.
     */
    END_OF_MARKET_HOURS('M', "This message is intended to indicate that Market Hours orders are no longer available for execution."),

    /**
     * It indicates that Tradelogiq is now closed and will not accept any new orders.
     */
    END_OF_SYSTEM_HOURS('E', "It indicates that Tradelogiq is now closed and will not accept any new orders."),

    /**
     * End-Of-Messages event, after which the Reallocation Server disconnects
     */
    END_OF_MESSAGES('C', "End-Of-Messages event, after which the Reallocation Server disconnects"),

    /**
     * Trading Halted due to Market-Wide Circuit Breaker
     */
    TRADING_HALTED('B', "Trading Halted due to Market-Wide Circuit Breaker"),

    /**
     * Trading Resumed following Market-Wide Circuit Breaker
     */
    TRADING_RESUMED('R', "Trading Resumed following Market-Wide Circuit Breaker");

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
            case 'B' -> Optional.of(TRADING_HALTED);
            case 'R' -> Optional.of(TRADING_RESUMED);
            default -> Optional.empty();
        };
    }
}
