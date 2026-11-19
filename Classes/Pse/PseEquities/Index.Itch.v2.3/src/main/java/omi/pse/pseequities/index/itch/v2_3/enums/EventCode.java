package omi.pse.pseequities.index.itch.v2_3.enums;

import java.util.Optional;

/**
 * Event Code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages. This is the first message sent.
     */
    START_OF_MESSAGES('O', "Start of Messages. This is the first message sent."),

    /**
     * Start of System Hours. The Pre-Open Session commences.
     */
    START_OF_SYSTEM_HOURS('S', "Start of System Hours. The Pre-Open Session commences."),

    /**
     * Pre-Open No Cancellation period.
     */
    PRE_OPEN_NO_CANCELLATION_PERIOD('R', "Pre-Open No Cancellation period."),

    /**
     * Start of Market Hours. The Pre-Open uncross occurs, and continuous trading begins.
     */
    START_OF_MARKET_HOURS('Q', "Start of Market Hours. The Pre-Open uncross occurs, and continuous trading begins."),

    /**
     * The scheduled Break in trading begins.
     */
    SCHEDULED_BREAK_BEGINS('A', "The scheduled Break in trading begins."),

    /**
     * The scheduled Break in trading ends.
     */
    SCHEDULED_BREAK_ENDS('B', "The scheduled Break in trading ends."),

    /**
     * Pre-Close commences.
     */
    PRE_CLOSE_COMMENCES('L', "Pre-Close commences."),

    /**
     * Pre-Close No Cancellation period.
     */
    PRE_CLOSE_NO_CANCELLATION_PERIOD('J', "Pre-Close No Cancellation period."),

    /**
     * Trading At Last. The Closing Auction uncross occurs, and traders can then enter limit orders for execution at the determined closing price.
     */
    TRADING_AT_LAST('P', "Trading At Last. The Closing Auction uncross occurs, and traders can then enter limit orders for execution at the determined closing price."),

    /**
     * End Of Market Hours.
     */
    END_OF_MARKET_HOURS('M', "End Of Market Hours."),

    /**
     * End Of Trading. It indicates that the Exchange is closed.
     */
    END_OF_TRADING('E', "End Of Trading. It indicates that the Exchange is closed."),

    /**
     * End of System Messages. Last message sent.
     */
    END_OF_SYSTEM_MESSAGES('C', "End of System Messages. Last message sent.");

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
            case 'R' -> Optional.of(PRE_OPEN_NO_CANCELLATION_PERIOD);
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS);
            case 'A' -> Optional.of(SCHEDULED_BREAK_BEGINS);
            case 'B' -> Optional.of(SCHEDULED_BREAK_ENDS);
            case 'L' -> Optional.of(PRE_CLOSE_COMMENCES);
            case 'J' -> Optional.of(PRE_CLOSE_NO_CANCELLATION_PERIOD);
            case 'P' -> Optional.of(TRADING_AT_LAST);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_TRADING);
            case 'C' -> Optional.of(END_OF_SYSTEM_MESSAGES);
            default -> Optional.empty();
        };
    }
}
