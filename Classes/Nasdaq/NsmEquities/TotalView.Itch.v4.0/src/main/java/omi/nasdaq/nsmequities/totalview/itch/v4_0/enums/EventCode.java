package omi.nasdaq.nsmequities.totalview.itch.v4_0.enums;

import java.util.Optional;

/**
 * See System Event Codes.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Outside of time stamp messages, the start of day message is the first message sent in any trading day.
     */
    START_OF_MESSAGES('O', "Outside of time stamp messages, the start of day message is the first message sent in any trading day."),

    /**
     * This message indicates that NASDAQ is open and ready to start accepting orders.
     */
    START_OF_SYSTEM_HOURS('S', "This message indicates that NASDAQ is open and ready to start accepting orders."),

    /**
     * This message is intended to indicate that Market Hours orders are available for execution.
     */
    START_OF_MARKET_HOURS('Q', "This message is intended to indicate that Market Hours orders are available for execution."),

    /**
     * This message is intended to indicate that Market Hours orders are no longer available for execution.
     */
    END_OF_MARKET_HOURS('M', "This message is intended to indicate that Market Hours orders are no longer available for execution."),

    /**
     * It indicates that NASDAQ is now closed and will not accept any new orders today. It is still possible to receive Broken Trade messages and Order Delete messages after the End of Day.
     */
    END_OF_SYSTEM_HOURS('E', "It indicates that NASDAQ is now closed and will not accept any new orders today. It is still possible to receive Broken Trade messages and Order Delete messages after the End of Day."),

    /**
     * This is always the last message sent in any trading day.
     */
    END_OF_MESSAGES('C', "This is always the last message sent in any trading day."),

    /**
     * This message is sent to inform NASDAQ market participants that the EMC is in effect. No trading is allowed during the EMC.
     */
    EMERGENCY_MARKET_CONDITION_HALT('A', "This message is sent to inform NASDAQ market participants that the EMC is in effect. No trading is allowed during the EMC."),

    /**
     * This message is sent to inform NASDAQ market participants that the EMC quotation only period is in effect.
     */
    EMERGENCY_MARKET_CONDITION_QUOTE_ONLY_PERIOD('R', "This message is sent to inform NASDAQ market participants that the EMC quotation only period is in effect."),

    /**
     * This message is sent to inform NASDAQ market participants that EMC is no longer in effect.
     */
    EMERGENCY_MARKET_CONDITION_RESUMPTION('B', "This message is sent to inform NASDAQ market participants that EMC is no longer in effect.");

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
            case 'A' -> Optional.of(EMERGENCY_MARKET_CONDITION_HALT);
            case 'R' -> Optional.of(EMERGENCY_MARKET_CONDITION_QUOTE_ONLY_PERIOD);
            case 'B' -> Optional.of(EMERGENCY_MARKET_CONDITION_RESUMPTION);
            default -> Optional.empty();
        };
    }
}
