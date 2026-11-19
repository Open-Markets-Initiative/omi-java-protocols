package omi.nasdaq.nasdaqcanada.chixmmd.glimpse.v1_0.enums;

import java.util.Optional;

/**
 * System event code, see Event Code values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * First message of the day
     */
    START_OF_MESSAGES('O', "First message of the day"),

    /**
     * Start of Nasdaq Canada Trading Session
     */
    START_OF_NASDAQ_CANADA_TRADING_SESSION('S', "Start of Nasdaq Canada Trading Session"),

    /**
     * Start of Primary Market Trading Session
     */
    START_OF_PRIMARY_MARKET_TRADING_SESSION('Q', "Start of Primary Market Trading Session"),

    /**
     * End of Primary Market Trading Session. Indicates that Pegged orders are no longer available for execution.
     */
    END_OF_PRIMARY_MARKET_TRADING_SESSION('M', "End of Primary Market Trading Session. Indicates that Pegged orders are no longer available for execution."),

    /**
     * End of System Hours. Nasdaq Canada is closed and not accepting orders. It is still possible to receive Broken Trade messages and Order Cancel Messages.
     */
    END_OF_SYSTEM_HOURS('E', "End of System Hours. Nasdaq Canada is closed and not accepting orders. It is still possible to receive Broken Trade messages and Order Cancel Messages."),

    /**
     * End of Messages. Last message of the day.
     */
    END_OF_MESSAGES('C', "End of Messages. Last message of the day."),

    /**
     * Trading Halted due to Market-Wide Circuit Breaker
     */
    MARKET_WIDE_CIRCUIT_BREAKER_HALT('W', "Trading Halted due to Market-Wide Circuit Breaker"),

    /**
     * Trading Resumed following Market-Wide Circuit Breaker
     */
    MARKET_WIDE_CIRCUIT_BREAKER_RESUMPTION('R', "Trading Resumed following Market-Wide Circuit Breaker");

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
            case 'S' -> Optional.of(START_OF_NASDAQ_CANADA_TRADING_SESSION);
            case 'Q' -> Optional.of(START_OF_PRIMARY_MARKET_TRADING_SESSION);
            case 'M' -> Optional.of(END_OF_PRIMARY_MARKET_TRADING_SESSION);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            case 'W' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_HALT);
            case 'R' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_RESUMPTION);
            default -> Optional.empty();
        };
    }
}
