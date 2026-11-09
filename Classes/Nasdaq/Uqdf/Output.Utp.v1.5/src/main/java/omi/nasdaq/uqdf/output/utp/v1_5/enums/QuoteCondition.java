package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Quote Condition
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Manual Ask automated Bid
     */
    MANUAL_ASK_AUTOMATED_BID('A', "Manual Ask automated Bid"),

    /**
     * Manual Bid automated Ask
     */
    MANUAL_BID_AUTOMATED_ASK('B', "Manual Bid automated Ask"),

    /**
     * Fast trading
     */
    FAST_TRADING('F', "Fast trading"),

    /**
     * Manual Bid and Ask
     */
    MANUAL_BID_AND_ASK('H', "Manual Bid and Ask"),

    /**
     * Order imbalance
     */
    ORDER_IMBALANCE('I', "Order imbalance"),

    /**
     * Closed quote
     */
    CLOSED_QUOTE('L', "Closed quote"),

    /**
     * Non firm quote
     */
    NON_FIRM_QUOTE('N', "Non firm quote"),

    /**
     * Opening quote automated
     */
    OPENING_QUOTE_AUTOMATED('O', "Opening quote automated"),

    /**
     * Regular two sided open quote automated
     */
    REGULAR_TWO_SIDED_OPEN_QUOTE_AUTOMATED('R', "Regular two sided open quote automated"),

    /**
     * Manual Bid and Ask non firm
     */
    MANUAL_BID_AND_ASK_NON_FIRM('U', "Manual Bid and Ask non firm"),

    /**
     * Order influx
     */
    ORDER_INFLUX('X', "Order influx"),

    /**
     * Automated bid, no offer or automated offer, no bid
     */
    AUTOMATED_BID_NO_OFFER_OR_AUTOMATED_OFFER_NO_BID('Y', "Automated bid, no offer or automated offer, no bid"),

    /**
     * No open no resume
     */
    NO_OPEN_NO_RESUME('Z', "No open no resume"),

    /**
     * Intraday Auction
     */
    INTRADAY_AUCTION('4', "Intraday Auction");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(MANUAL_ASK_AUTOMATED_BID);
            case 'B' -> Optional.of(MANUAL_BID_AUTOMATED_ASK);
            case 'F' -> Optional.of(FAST_TRADING);
            case 'H' -> Optional.of(MANUAL_BID_AND_ASK);
            case 'I' -> Optional.of(ORDER_IMBALANCE);
            case 'L' -> Optional.of(CLOSED_QUOTE);
            case 'N' -> Optional.of(NON_FIRM_QUOTE);
            case 'O' -> Optional.of(OPENING_QUOTE_AUTOMATED);
            case 'R' -> Optional.of(REGULAR_TWO_SIDED_OPEN_QUOTE_AUTOMATED);
            case 'U' -> Optional.of(MANUAL_BID_AND_ASK_NON_FIRM);
            case 'X' -> Optional.of(ORDER_INFLUX);
            case 'Y' -> Optional.of(AUTOMATED_BID_NO_OFFER_OR_AUTOMATED_OFFER_NO_BID);
            case 'Z' -> Optional.of(NO_OPEN_NO_RESUME);
            case '4' -> Optional.of(INTRADAY_AUCTION);
            default -> Optional.empty();
        };
    }
}
