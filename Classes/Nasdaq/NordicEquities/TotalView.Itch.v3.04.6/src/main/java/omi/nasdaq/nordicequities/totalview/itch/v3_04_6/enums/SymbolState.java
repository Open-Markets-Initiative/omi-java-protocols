package omi.nasdaq.nordicequities.totalview.itch.v3_04_6.enums;

import java.util.Optional;

/**
 * Trading state of the order book
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SymbolState {

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Pre Open
     */
    PRE_OPEN('P', "Pre Open"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('T', "Continuous Trading"),

    /**
     * Scheduled Intraday Auction
     */
    SCHEDULED_INTRADAY_AUCTION('I', "Scheduled Intraday Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('L', "Closing Auction"),

    /**
     * Post Trade
     */
    POST_TRADE('S', "Post Trade"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Auction Period
     */
    AUCTION_PERIOD('Q', "Auction Period"),

    /**
     * Trading At Closing Price
     */
    TRADING_AT_CLOSING_PRICE('A', "Trading At Closing Price");

    private final char wire;

    private final String description;

    SymbolState(char wire, String description) {
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
    public static Optional<SymbolState> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSED);
            case 'P' -> Optional.of(PRE_OPEN);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'T' -> Optional.of(CONTINUOUS_TRADING);
            case 'I' -> Optional.of(SCHEDULED_INTRADAY_AUCTION);
            case 'L' -> Optional.of(CLOSING_AUCTION);
            case 'S' -> Optional.of(POST_TRADE);
            case 'H' -> Optional.of(HALTED);
            case 'Q' -> Optional.of(AUCTION_PERIOD);
            case 'A' -> Optional.of(TRADING_AT_CLOSING_PRICE);
            default -> Optional.empty();
        };
    }
}
