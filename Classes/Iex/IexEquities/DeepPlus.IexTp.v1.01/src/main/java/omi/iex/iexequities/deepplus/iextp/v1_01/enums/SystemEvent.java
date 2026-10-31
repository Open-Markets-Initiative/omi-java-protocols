package omi.iex.iexequities.deepplus.iextp.v1_01.enums;

import java.util.Optional;

/**
 * System event identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemEvent {

    /**
     * Outside Of Heartbeat Messages On The Lower Level Protocol The Start Of Day Message Is The First Message Sent In Any Trading Session
     */
    START_OF_MESSAGES('O', "Outside Of Heartbeat Messages On The Lower Level Protocol The Start Of Day Message Is The First Message Sent In Any Trading Session"),

    /**
     * This Message Indicates That Iex Is Open And Ready To Start Accepting Orders
     */
    START_OF_SYSTEM_HOURS('S', "This Message Indicates That Iex Is Open And Ready To Start Accepting Orders"),

    /**
     * This Message Indicates That Day And Gtx Orders As Well As Market Orders And Pegged Orders Are Available For Execution On Iex
     */
    START_OF_REGULAR_MARKET_HOURS('R', "This Message Indicates That Day And Gtx Orders As Well As Market Orders And Pegged Orders Are Available For Execution On Iex"),

    /**
     * This Message Indicates That Day Orders Market Orders And Pegged Orders Are No Longer Accepted By Iex
     */
    END_OF_REGULAR_MARKET_HOURS('M', "This Message Indicates That Day Orders Market Orders And Pegged Orders Are No Longer Accepted By Iex"),

    /**
     * This Message Indicates That Iex Is Now Closed And Will Not Accept Any New Orders During This Trading Session
     */
    END_OF_SYSTEM_HOURS('E', "This Message Indicates That Iex Is Now Closed And Will Not Accept Any New Orders During This Trading Session"),

    /**
     * This Is Always The Last Message Sent In Any Trading Session
     */
    END_OF_MESSAGES('C', "This Is Always The Last Message Sent In Any Trading Session");

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
            case 'R' -> Optional.of(START_OF_REGULAR_MARKET_HOURS);
            case 'M' -> Optional.of(END_OF_REGULAR_MARKET_HOURS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            default -> Optional.empty();
        };
    }
}
