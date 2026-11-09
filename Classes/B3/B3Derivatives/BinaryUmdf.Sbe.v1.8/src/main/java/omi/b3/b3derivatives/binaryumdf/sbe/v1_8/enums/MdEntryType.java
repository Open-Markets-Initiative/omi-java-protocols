package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * mDEntryType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Bid.
     */
    BID('0', "Bid."),

    /**
     * Offer.
     */
    OFFER('1', "Offer."),

    /**
     * Trade or Trade Summary or Last Trade Price.
     */
    TRADE('2', "Trade or Trade Summary or Last Trade Price."),

    /**
     * Index Value.
     */
    INDEX_VALUE('3', "Index Value."),

    /**
     * Opening Price.
     */
    OPENING_PRICE('4', "Opening Price."),

    /**
     * Closing Price.
     */
    CLOSING_PRICE('5', "Closing Price."),

    /**
     * Settlement Price.
     */
    SETTLEMENT_PRICE('6', "Settlement Price."),

    /**
     * Session High Price.
     */
    SESSION_HIGH_PRICE('7', "Session High Price."),

    /**
     * Session Low Price.
     */
    SESSION_LOW_PRICE('8', "Session Low Price."),

    /**
     * Execution Statistics for related Trades.
     */
    EXECUTION_STATISTICS('9', "Execution Statistics for related Trades."),

    /**
     * Imbalance.
     */
    IMBALANCE('A', "Imbalance."),

    /**
     * Trade Volume.
     */
    TRADE_VOLUME('B', "Trade Volume."),

    /**
     * Open Interest.
     */
    OPEN_INTEREST('C', "Open Interest."),

    /**
     * Empty Book.
     */
    EMPTY_BOOK('J', "Empty Book."),

    /**
     * Security Trading State / Phase.
     */
    SECURITY_TRADING_STATE_PHASE('c', "Security Trading State / Phase."),

    /**
     * Price band.
     */
    PRICE_BAND('g', "Price band."),

    /**
     * Quantity band.
     */
    QUANTITY_BAND('h', "Quantity band."),

    /**
     * Composite Underlying Price.
     */
    COMPOSITE_UNDERLYING_PRICE('D', "Composite Underlying Price."),

    /**
     * Execution Summary for related Trades.
     */
    EXECUTION_SUMMARY('s', "Execution Summary for related Trades."),

    /**
     * Volatility price.
     */
    VOLATILITY_PRICE('v', "Volatility price."),

    /**
     * Trade busted by Market Supervision.
     */
    TRADE_BUST('u', "Trade busted by Market Supervision.");

    private final char wire;

    private final String description;

    MdEntryType(char wire, String description) {
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
    public static Optional<MdEntryType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(OFFER);
            case '2' -> Optional.of(TRADE);
            case '3' -> Optional.of(INDEX_VALUE);
            case '4' -> Optional.of(OPENING_PRICE);
            case '5' -> Optional.of(CLOSING_PRICE);
            case '6' -> Optional.of(SETTLEMENT_PRICE);
            case '7' -> Optional.of(SESSION_HIGH_PRICE);
            case '8' -> Optional.of(SESSION_LOW_PRICE);
            case '9' -> Optional.of(EXECUTION_STATISTICS);
            case 'A' -> Optional.of(IMBALANCE);
            case 'B' -> Optional.of(TRADE_VOLUME);
            case 'C' -> Optional.of(OPEN_INTEREST);
            case 'J' -> Optional.of(EMPTY_BOOK);
            case 'c' -> Optional.of(SECURITY_TRADING_STATE_PHASE);
            case 'g' -> Optional.of(PRICE_BAND);
            case 'h' -> Optional.of(QUANTITY_BAND);
            case 'D' -> Optional.of(COMPOSITE_UNDERLYING_PRICE);
            case 's' -> Optional.of(EXECUTION_SUMMARY);
            case 'v' -> Optional.of(VOLATILITY_PRICE);
            case 'u' -> Optional.of(TRADE_BUST);
            default -> Optional.empty();
        };
    }
}
