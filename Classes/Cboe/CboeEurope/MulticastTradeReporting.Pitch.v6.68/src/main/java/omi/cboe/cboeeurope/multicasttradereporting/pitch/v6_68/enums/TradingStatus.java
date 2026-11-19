package omi.cboe.cboeeurope.multicasttradereporting.pitch.v6_68.enums;

import java.util.Optional;

/**
 * Trading Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Off Book Reporting
     */
    OFF_BOOK_REPORTING('R', "Off Book Reporting"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Suspension
     */
    SUSPENSION('S', "Suspension"),

    /**
     * No Reference Price
     */
    NO_REFERENCE_PRICE('N', "No Reference Price"),

    /**
     * Volatility Interruption
     */
    VOLATILITY_INTERRUPTION('V', "Volatility Interruption"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('E', "Closing Auction"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Market Order Imbalance Extension
     */
    MARKET_ORDER_IMBALANCE_EXTENSION('M', "Market Order Imbalance Extension"),

    /**
     * Price Monitoring Extension
     */
    PRICE_MONITORING_EXTENSION('P', "Price Monitoring Extension"),

    /**
     * Cboe Closing Cross
     */
    CBOE_CLOSING_CROSS('U', "Cboe Closing Cross"),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION('I', "Volatility Auction"),

    /**
     * Halt Auction
     */
    HALT_AUCTION('Y', "Halt Auction");

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
            case 'T' -> Optional.of(TRADING);
            case 'R' -> Optional.of(OFF_BOOK_REPORTING);
            case 'C' -> Optional.of(CLOSED);
            case 'S' -> Optional.of(SUSPENSION);
            case 'N' -> Optional.of(NO_REFERENCE_PRICE);
            case 'V' -> Optional.of(VOLATILITY_INTERRUPTION);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'E' -> Optional.of(CLOSING_AUCTION);
            case 'H' -> Optional.of(HALTED);
            case 'M' -> Optional.of(MARKET_ORDER_IMBALANCE_EXTENSION);
            case 'P' -> Optional.of(PRICE_MONITORING_EXTENSION);
            case 'U' -> Optional.of(CBOE_CLOSING_CROSS);
            case 'I' -> Optional.of(VOLATILITY_AUCTION);
            case 'Y' -> Optional.of(HALT_AUCTION);
            default -> Optional.empty();
        };
    }
}
