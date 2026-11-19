package omi.tadawul.saudiexchange.totalview.itch.v1_9.enums;

import java.util.Optional;

/**
 * System Event Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * This is the first message sent
     */
    START_OF_MESSAGES('O', "This is the first message sent"),

    /**
     * Start Of System Hours
     */
    START_OF_SYSTEM_HOURS('S', "Start Of System Hours"),

    /**
     * Indicates the Exchange is in continuous trading
     */
    START_OF_MARKET_HOURS('Q', "Indicates the Exchange is in continuous trading"),

    /**
     * End of Trading session
     */
    END_OF_MARKET_HOURS('M', "End of Trading session"),

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
     * It indicates that the Exchange is closed
     */
    END_OF_SYSTEM_HOURS('E', "It indicates that the Exchange is closed"),

    /**
     * Last message sent
     */
    END_OF_MESSAGES('C', "Last message sent"),

    /**
     * Start Of Buy In Session
     */
    START_OF_BUY_IN_SESSION('B', "Start Of Buy In Session"),

    /**
     * Indicates that Market is open for orders to match Buy-in orders
     */
    BUY_IN_CUTOFF('c', "Indicates that Market is open for orders to match Buy-in orders"),

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
     * Sent for an OrderBook that is synchronising back with its group
     */
    REJOIN('I', "Sent for an OrderBook that is synchronising back with its group");

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
            case 'U' -> Optional.of(SCHEDULED_AUCTION_ENDS);
            case 'T' -> Optional.of(TRADE_AT_LAST_SESSION_STARTS);
            case 'E' -> Optional.of(END_OF_SYSTEM_HOURS);
            case 'C' -> Optional.of(END_OF_MESSAGES);
            case 'B' -> Optional.of(START_OF_BUY_IN_SESSION);
            case 'c' -> Optional.of(BUY_IN_CUTOFF);
            case 'b' -> Optional.of(END_OF_BUY_IN_SESSION);
            case 'N' -> Optional.of(START_OF_NEGDEAL_ONLY_SESSION);
            case 'n' -> Optional.of(START_OF_ND_NO_TPLUS_0_SESSION);
            case 'I' -> Optional.of(REJOIN);
            default -> Optional.empty();
        };
    }
}
