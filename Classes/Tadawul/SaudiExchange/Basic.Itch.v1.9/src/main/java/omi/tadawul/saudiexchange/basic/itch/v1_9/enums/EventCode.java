package omi.tadawul.saudiexchange.basic.itch.v1_9.enums;

import java.util.Optional;

/**
 * System Event Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start Of Messages This Is The First Message Sent
     */
    START_OF_MESSAGES_THIS_IS_THE_FIRST_MESSAGE_SENT('O', "Start Of Messages This Is The First Message Sent"),

    /**
     * Start Of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start Of System Hours"),

    /**
     * Start Of Market Hours Trading Session It Indicates The Exchange Is In Continuous Trading
     */
    START_OF_MARKET_HOURS_TRADING_SESSION_IT_INDICATES_THE_EXCHANGE_IS_IN_CONTINUOUS_TRADING('Q', "Start Of Market Hours Trading Session It Indicates The Exchange Is In Continuous Trading"),

    /**
     * End Of Market Hours End Of Trading Session
     */
    END_OF_MARKET_HOURS_END_OF_TRADING_SESSION('M', "End Of Market Hours End Of Trading Session"),

    /**
     * Scheduled Auction Starts
     */
    SCHEDULED_AUCTION_STARTS('V', "Scheduled Auction Starts"),

    /**
     * Scheduled Auction Ends
     */
    SCHEDULED_AUCTION_ENDS('U', "Scheduled Auction Ends"),

    /**
     * Trade At Last Session Starts
     */
    TRADE_AT_LAST_SESSION_STARTS('T', "Trade At Last Session Starts"),

    /**
     * End Of System Hours It Indicates That The Exchange Is Closed
     */
    END_OF_SYSTEM_HOURS_IT_INDICATES_THAT_THE_EXCHANGE_IS_CLOSED('E', "End Of System Hours It Indicates That The Exchange Is Closed"),

    /**
     * End Of Messages Last Message Sent
     */
    END_OF_MESSAGES_LAST_MESSAGE_SENT('C', "End Of Messages Last Message Sent"),

    /**
     * Start Of Buy In Session
     */
    START_OF_BUY_IN_SESSION('B', "Start Of Buy In Session"),

    /**
     * Buy In Cutoff Indicates That Market Is Open For Orders To Match Buy In Orders
     */
    BUY_IN_CUTOFF_INDICATES_THAT_MARKET_IS_OPEN_FOR_ORDERS_TO_MATCH_BUY_IN_ORDERS('c', "Buy In Cutoff Indicates That Market Is Open For Orders To Match Buy In Orders"),

    /**
     * End Of Buy In Session
     */
    END_OF_BUY_IN_SESSION('b', "End Of Buy In Session"),

    /**
     * Start Of Negdeal Only Session
     */
    START_OF_NEGDEAL_ONLY_SESSION('N', "Start Of Negdeal Only Session"),

    /**
     * Start Of Nd No Tplus 0 Session
     */
    START_OF_ND_NO_TPLUS_0_SESSION('n', "Start Of Nd No Tplus 0 Session"),

    /**
     * Rejoin Sent For An Order Book That Is Synchronising Back With Its Group See Section 5.8 For More Information
     */
    REJOIN_SENT_FOR_AN_ORDER_BOOK_THAT_IS_SYNCHRONISING_BACK_WITH_ITS_GROUP_SEE_SECTION_58_FOR_MORE_INFORMATION('I', "Rejoin Sent For An Order Book That Is Synchronising Back With Its Group See Section 5.8 For More Information");

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
            case 'O' -> Optional.of(START_OF_MESSAGES_THIS_IS_THE_FIRST_MESSAGE_SENT);
            case 'S' -> Optional.of(START_OF_SYSTEM_HOURS);
            case 'Q' -> Optional.of(START_OF_MARKET_HOURS_TRADING_SESSION_IT_INDICATES_THE_EXCHANGE_IS_IN_CONTINUOUS_TRADING);
            case 'M' -> Optional.of(END_OF_MARKET_HOURS_END_OF_TRADING_SESSION);
            case 'V' -> Optional.of(SCHEDULED_AUCTION_STARTS);
            case 'U' -> Optional.of(SCHEDULED_AUCTION_ENDS);
            case 'T' -> Optional.of(TRADE_AT_LAST_SESSION_STARTS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS_IT_INDICATES_THAT_THE_EXCHANGE_IS_CLOSED);
            case 'C' -> Optional.of(END_OF_MESSAGES_LAST_MESSAGE_SENT);
            case 'B' -> Optional.of(START_OF_BUY_IN_SESSION);
            case 'c' -> Optional.of(BUY_IN_CUTOFF_INDICATES_THAT_MARKET_IS_OPEN_FOR_ORDERS_TO_MATCH_BUY_IN_ORDERS);
            case 'b' -> Optional.of(END_OF_BUY_IN_SESSION);
            case 'N' -> Optional.of(START_OF_NEGDEAL_ONLY_SESSION);
            case 'n' -> Optional.of(START_OF_ND_NO_TPLUS_0_SESSION);
            case 'I' -> Optional.of(REJOIN_SENT_FOR_AN_ORDER_BOOK_THAT_IS_SYNCHRONISING_BACK_WITH_ITS_GROUP_SEE_SECTION_58_FOR_MORE_INFORMATION);
            default -> Optional.empty();
        };
    }
}
