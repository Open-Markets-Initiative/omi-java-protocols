package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_7.enums;

import java.util.Optional;

/**
 * T = Trading R = Off-Book Reporting C = Closed S = Suspension N = No Reference Price V = Volatility Interruption O = Opening Auction E = Closing Auction H = Halt M = Market Order Imbalance Extension P = Price Monitoring Extension
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

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
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Market Order Imbalance Extension
     */
    MARKET_ORDER_IMBALANCE_EXTENSION('M', "Market Order Imbalance Extension"),

    /**
     * Price Monitoring Extension
     */
    PRICE_MONITORING_EXTENSION('P', "Price Monitoring Extension");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TRADING);
            case 'R' -> Optional.of(OFF_BOOK_REPORTING);
            case 'C' -> Optional.of(CLOSED);
            case 'S' -> Optional.of(SUSPENSION);
            case 'N' -> Optional.of(NO_REFERENCE_PRICE);
            case 'V' -> Optional.of(VOLATILITY_INTERRUPTION);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'E' -> Optional.of(CLOSING_AUCTION);
            case 'H' -> Optional.of(HALT);
            case 'M' -> Optional.of(MARKET_ORDER_IMBALANCE_EXTENSION);
            case 'P' -> Optional.of(PRICE_MONITORING_EXTENSION);
            default -> Optional.empty();
        };
    }
}
