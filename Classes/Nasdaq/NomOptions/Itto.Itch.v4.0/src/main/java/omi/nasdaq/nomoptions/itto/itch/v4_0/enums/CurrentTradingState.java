package omi.nasdaq.nomoptions.itto.itch.v4_0.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the options security in the NASDAQ Options Market. The allowable values are:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Buy Side Trading Suspended
     */
    BUY_SIDE_TRADING_SUSPENDED('B', "Buy Side Trading Suspended"),

    /**
     * Sell Side Trading Suspended
     */
    SELL_SIDE_TRADING_SUSPENDED('S', "Sell Side Trading Suspended");

    private final char wire;

    private final String description;

    CurrentTradingState(char wire, String description) {
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
    public static Optional<CurrentTradingState> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALT);
            case 'T' -> Optional.of(TRADING);
            case 'B' -> Optional.of(BUY_SIDE_TRADING_SUSPENDED);
            case 'S' -> Optional.of(SELL_SIDE_TRADING_SUSPENDED);
            default -> Optional.empty();
        };
    }
}
