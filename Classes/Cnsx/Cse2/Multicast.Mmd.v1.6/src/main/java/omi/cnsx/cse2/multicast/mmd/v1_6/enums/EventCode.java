package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Event Code (see System Event Codes).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start Of Messages The First Message Is Sent
     */
    START_OF_MESSAGES_THE_FIRST_MESSAGE_IS_SENT('O', "Start Of Messages The First Message Is Sent"),

    /**
     * Start Of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start Of System Hours"),

    /**
     * Trading Halted Orders Can Be Cancelled But No New Orders Can Be Entered
     */
    TRADING_HALTED_ORDERS_CAN_BE_CANCELLED_BUT_NO_NEW_ORDERS_CAN_BE_ENTERED('H', "Trading Halted Orders Can Be Cancelled But No New Orders Can Be Entered"),

    /**
     * Start Of Market Hours The Pre Open Auction Is Concluded And Continuous Trading Begins
     */
    START_OF_MARKET_HOURS_THE_PRE_OPEN_AUCTION_IS_CONCLUDED_AND_CONTINUOUS_TRADING_BEGINS('Q', "Start Of Market Hours The Pre Open Auction Is Concluded And Continuous Trading Begins"),

    /**
     * End Of Market Hours Indicates The End Of Continuous Trading
     */
    END_OF_MARKET_HOURS_INDICATES_THE_END_OF_CONTINUOUS_TRADING('M', "End Of Market Hours Indicates The End Of Continuous Trading"),

    /**
     * End Of System Hours Indicates The Exchange Is Closed
     */
    END_OF_SYSTEM_HOURS_INDICATES_THE_EXCHANGE_IS_CLOSED('E', "End Of System Hours Indicates The Exchange Is Closed"),

    /**
     * End Of Messages The Last Message Sent
     */
    END_OF_MESSAGES_THE_LAST_MESSAGE_SENT('C', "End Of Messages The Last Message Sent"),

    /**
     * Failover Event
     */
    FAILOVER_EVENT('Z', "Failover Event");

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
            case 'O' -> Optional.of(START_OF_MESSAGES_THE_FIRST_MESSAGE_IS_SENT);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'H' -> Optional.of(TRADING_HALTED_ORDERS_CAN_BE_CANCELLED_BUT_NO_NEW_ORDERS_CAN_BE_ENTERED);
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS_THE_PRE_OPEN_AUCTION_IS_CONCLUDED_AND_CONTINUOUS_TRADING_BEGINS);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS_INDICATES_THE_END_OF_CONTINUOUS_TRADING);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS_INDICATES_THE_EXCHANGE_IS_CLOSED);
            case 'C' -> Optional.of(END_OF_MESSAGES_THE_LAST_MESSAGE_SENT);
            case 'Z' -> Optional.of(FAILOVER_EVENT);
            default -> Optional.empty();
        };
    }
}
