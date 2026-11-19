package omi.lseg.millennium.level2recovery.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Trading Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Active
     */
    ACTIVE(' ', "Active"),

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Regular Trading Start Of Trade Reporting
     */
    REGULAR_TRADING_START_OF_TRADE_REPORTING('T', "Regular Trading Start Of Trade Reporting"),

    /**
     * Opening First Auction Call
     */
    OPENING_FIRST_AUCTION_CALL('a', "Opening First Auction Call"),

    /**
     * Post Close
     */
    POST_CLOSE('b', "Post Close"),

    /**
     * Market Close System Shutdown
     */
    MARKET_CLOSE_SYSTEM_SHUTDOWN('c', "Market Close System Shutdown"),

    /**
     * Closing Auction Call
     */
    CLOSING_AUCTION_CALL('d', "Closing Auction Call"),

    /**
     * Aesp Auction Call
     */
    AESP_AUCTION_CALL('e', "Aesp Auction Call"),

    /**
     * Resume Auction Call
     */
    RESUME_AUCTION_CALL('f', "Resume Auction Call"),

    /**
     * Pause
     */
    PAUSE('l', "Pause"),

    /**
     * Pre Mandatory
     */
    PRE_MANDATORY('m', "Pre Mandatory"),

    /**
     * Mandatory
     */
    MANDATORY('n', "Mandatory"),

    /**
     * Post Mandatory
     */
    POST_MANDATORY('o', "Post Mandatory"),

    /**
     * Edsp Auction Call
     */
    EDSP_AUCTION_CALL('q', "Edsp Auction Call"),

    /**
     * Periodic Auction Call
     */
    PERIODIC_AUCTION_CALL('r', "Periodic Auction Call"),

    /**
     * End Trade Reporting
     */
    END_TRADE_REPORTING('t', "End Trade Reporting"),

    /**
     * No Active Session
     */
    NO_ACTIVE_SESSION('w', "No Active Session"),

    /**
     * End Of Post Close
     */
    END_OF_POST_CLOSE('x', "End Of Post Close"),

    /**
     * Closing Price Crossing
     */
    CLOSING_PRICE_CROSSING('u', "Closing Price Crossing"),

    /**
     * Scheduled Level 1 Only Auction
     */
    SCHEDULED_LEVEL_1_ONLY_AUCTION('G', "Scheduled Level 1 Only Auction");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(ACTIVE);
            case 'H' -> Optional.of(HALT);
            case 'T' -> Optional.of(REGULAR_TRADING_START_OF_TRADE_REPORTING);
            case 'a' -> Optional.of(OPENING_FIRST_AUCTION_CALL);
            case 'b' -> Optional.of(POST_CLOSE);
            case 'c' -> Optional.of(MARKET_CLOSE_SYSTEM_SHUTDOWN);
            case 'd' -> Optional.of(CLOSING_AUCTION_CALL);
            case 'e' -> Optional.of(AESP_AUCTION_CALL);
            case 'f' -> Optional.of(RESUME_AUCTION_CALL);
            case 'l' -> Optional.of(PAUSE);
            case 'm' -> Optional.of(PRE_MANDATORY);
            case 'n' -> Optional.of(MANDATORY);
            case 'o' -> Optional.of(POST_MANDATORY);
            case 'q' -> Optional.of(EDSP_AUCTION_CALL);
            case 'r' -> Optional.of(PERIODIC_AUCTION_CALL);
            case 't' -> Optional.of(END_TRADE_REPORTING);
            case 'w' -> Optional.of(NO_ACTIVE_SESSION);
            case 'x' -> Optional.of(END_OF_POST_CLOSE);
            case 'u' -> Optional.of(CLOSING_PRICE_CROSSING);
            case 'G' -> Optional.of(SCHEDULED_LEVEL_1_ONLY_AUCTION);
            default -> Optional.empty();
        };
    }
}
