package omi.lseg.lse.level1replay.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Current Trading status of the Instrument. Populated only when the message is sent at the end of individual order book snapshots during a trading session.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Halt Matching Partition Suspended
     */
    HALT_MATCHING_PARTITION_SUSPENDED('J', "Halt Matching Partition Suspended"),

    /**
     * Halt System Suspended
     */
    HALT_SYSTEM_SUSPENDED('K', "Halt System Suspended"),

    /**
     * Regular Trading Start Trade Reporting
     */
    REGULAR_TRADING_START_TRADE_REPORTING('T', "Regular Trading Start Trade Reporting"),

    /**
     * Halt Regulatory
     */
    HALT_REGULATORY('P', "Halt Regulatory"),

    /**
     * End Trade Reporting
     */
    END_TRADE_REPORTING('t', "End Trade Reporting"),

    /**
     * Opening Auction Call
     */
    OPENING_AUCTION_CALL('a', "Opening Auction Call"),

    /**
     * Post Close
     */
    POST_CLOSE('b', "Post Close"),

    /**
     * Closed
     */
    CLOSED('c', "Closed"),

    /**
     * Closing Auction Call
     */
    CLOSING_AUCTION_CALL('d', "Closing Auction Call"),

    /**
     * Aesp Auction Call
     */
    AESP_AUCTION_CALL('e', "Aesp Auction Call"),

    /**
     * Resume Auction
     */
    RESUME_AUCTION('f', "Resume Auction"),

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
     * Inactive
     */
    INACTIVE('1', "Inactive"),

    /**
     * Suspended
     */
    SUSPENDED('2', "Suspended"),

    /**
     * No Active Session
     */
    NO_ACTIVE_SESSION('w', "No Active Session"),

    /**
     * End Of Post Close
     */
    END_OF_POST_CLOSE('x', "End Of Post Close"),

    /**
     * Closing Price Crossing Session
     */
    CLOSING_PRICE_CROSSING_SESSION('u', "Closing Price Crossing Session");

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
            case 'H' -> Optional.of(HALT);
            case 'J' -> Optional.of(HALT_MATCHING_PARTITION_SUSPENDED);
            case 'K' -> Optional.of(HALT_SYSTEM_SUSPENDED);
            case 'T' -> Optional.of(REGULAR_TRADING_START_TRADE_REPORTING);
            case 'P' -> Optional.of(HALT_REGULATORY);
            case 't' -> Optional.of(END_TRADE_REPORTING);
            case 'a' -> Optional.of(OPENING_AUCTION_CALL);
            case 'b' -> Optional.of(POST_CLOSE);
            case 'c' -> Optional.of(CLOSED);
            case 'd' -> Optional.of(CLOSING_AUCTION_CALL);
            case 'e' -> Optional.of(AESP_AUCTION_CALL);
            case 'f' -> Optional.of(RESUME_AUCTION);
            case 'm' -> Optional.of(PRE_MANDATORY);
            case 'n' -> Optional.of(MANDATORY);
            case 'o' -> Optional.of(POST_MANDATORY);
            case 'q' -> Optional.of(EDSP_AUCTION_CALL);
            case 'r' -> Optional.of(PERIODIC_AUCTION_CALL);
            case '1' -> Optional.of(INACTIVE);
            case '2' -> Optional.of(SUSPENDED);
            case 'w' -> Optional.of(NO_ACTIVE_SESSION);
            case 'x' -> Optional.of(END_OF_POST_CLOSE);
            case 'u' -> Optional.of(CLOSING_PRICE_CROSSING_SESSION);
            default -> Optional.empty();
        };
    }
}
