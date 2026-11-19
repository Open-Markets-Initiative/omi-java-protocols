package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * systemEvent
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemEvent {

    /**
     * StartOfMessages
     */
    START_OF_MESSAGES('O', "StartOfMessages"),

    /**
     * StartOfSystemHours
     */
    START_OF_SYSTEM_HOURS('S', "StartOfSystemHours"),

    /**
     * StartOfRegularMarketHoursITCH
     */
    START_OF_REGULAR_MARKET_HOURS_ITCH('Q', "StartOfRegularMarketHoursITCH"),

    /**
     * StartOfRegularMarketHoursIEX
     */
    START_OF_REGULAR_MARKET_HOURS_IEX('R', "StartOfRegularMarketHoursIEX"),

    /**
     * EndOfRegularMarketHours
     */
    END_OF_REGULAR_MARKET_HOURS('M', "EndOfRegularMarketHours"),

    /**
     * EndOfSystemHours
     */
    END_OF_SYSTEM_HOURS('E', "EndOfSystemHours"),

    /**
     * EndOfMessages
     */
    END_OF_MESSAGES('C', "EndOfMessages");

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
            case 'Q' -> Optional.of(START_OF_REGULAR_MARKET_HOURS_ITCH);
            case 'R' -> Optional.of(START_OF_REGULAR_MARKET_HOURS_IEX);
            case 'M' -> Optional.of(END_OF_REGULAR_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
