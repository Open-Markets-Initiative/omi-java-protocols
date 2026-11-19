package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Trading session that applies to the instrument.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Regular Trading
     */
    REGULAR_TRADING('T', "Regular Trading"),

    /**
     * Opening Auction Call
     */
    OPENING_AUCTION_CALL('a', "Opening Auction Call"),

    /**
     * Post Close
     */
    POST_CLOSE('b', "Post Close"),

    /**
     * Market Close
     */
    MARKET_CLOSE('c', "Market Close"),

    /**
     * Closing Auction Call
     */
    CLOSING_AUCTION_CALL('d', "Closing Auction Call"),

    /**
     * Re Opening Auction Call
     */
    RE_OPENING_AUCTION_CALL('e', "Re Opening Auction Call"),

    /**
     * Pause
     */
    PAUSE('l', "Pause"),

    /**
     * Order Entry
     */
    ORDER_ENTRY('n', "Order Entry"),

    /**
     * Auction Initiation
     */
    AUCTION_INITIATION('p', "Auction Initiation"),

    /**
     * Start Of Auction Call
     */
    START_OF_AUCTION_CALL('q', "Start Of Auction Call"),

    /**
     * End Of Auction Call
     */
    END_OF_AUCTION_CALL('r', "End Of Auction Call"),

    /**
     * Start Of Aon Order Entry
     */
    START_OF_AON_ORDER_ENTRY('s', "Start Of Aon Order Entry"),

    /**
     * End Of Aon Order Entry
     */
    END_OF_AON_ORDER_ENTRY('t', "End Of Aon Order Entry"),

    /**
     * Closing Price Cross
     */
    CLOSING_PRICE_CROSS('u', "Closing Price Cross"),

    /**
     * Reserved For Backward Compatibility
     */
    RESERVED_FOR_BACKWARD_COMPATIBILITY('v', "Reserved For Backward Compatibility"),

    /**
     * No Active Session
     */
    NO_ACTIVE_SESSION('w', "No Active Session"),

    /**
     * End Of Post Close
     */
    END_OF_POST_CLOSE('x', "End Of Post Close"),

    /**
     * Pre Trading
     */
    PRE_TRADING('y', "Pre Trading"),

    /**
     * Closing Price Publication
     */
    CLOSING_PRICE_PUBLICATION('z', "Closing Price Publication"),

    /**
     * Intraday Auction Call
     */
    INTRADAY_AUCTION_CALL('o', "Intraday Auction Call"),

    /**
     * Auction Execution
     */
    AUCTION_EXECUTION('0', "Auction Execution");

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
            case 'T' -> Optional.of(REGULAR_TRADING);
            case 'a' -> Optional.of(OPENING_AUCTION_CALL);
            case 'b' -> Optional.of(POST_CLOSE);
            case 'c' -> Optional.of(MARKET_CLOSE);
            case 'd' -> Optional.of(CLOSING_AUCTION_CALL);
            case 'e' -> Optional.of(RE_OPENING_AUCTION_CALL);
            case 'l' -> Optional.of(PAUSE);
            case 'n' -> Optional.of(ORDER_ENTRY);
            case 'p' -> Optional.of(AUCTION_INITIATION);
            case 'q' -> Optional.of(START_OF_AUCTION_CALL);
            case 'r' -> Optional.of(END_OF_AUCTION_CALL);
            case 's' -> Optional.of(START_OF_AON_ORDER_ENTRY);
            case 't' -> Optional.of(END_OF_AON_ORDER_ENTRY);
            case 'u' -> Optional.of(CLOSING_PRICE_CROSS);
            case 'v' -> Optional.of(RESERVED_FOR_BACKWARD_COMPATIBILITY);
            case 'w' -> Optional.of(NO_ACTIVE_SESSION);
            case 'x' -> Optional.of(END_OF_POST_CLOSE);
            case 'y' -> Optional.of(PRE_TRADING);
            case 'z' -> Optional.of(CLOSING_PRICE_PUBLICATION);
            case 'o' -> Optional.of(INTRADAY_AUCTION_CALL);
            case '0' -> Optional.of(AUCTION_EXECUTION);
            default -> Optional.empty();
        };
    }
}
