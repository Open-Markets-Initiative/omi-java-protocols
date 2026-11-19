package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the options security in the BX Options Market. The allowable values are:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt in effect
     */
    HALT('H', "Halt in effect"),

    /**
     * Trading on BX
     */
    TRADING('T', "Trading on BX"),

    /**
     * Buy Side Trading Suspended –i.e. Buy orders are not executable)
     */
    BUY_SIDE_TRADING_SUSPENDED('B', "Buy Side Trading Suspended \u2013i.e. Buy orders are not executable)"),

    /**
     * Sell Side Trading Suspended –i.e. Sell orders are not executable)
     */
    SELL_SIDE_TRADING_SUSPENDED('S', "Sell Side Trading Suspended \u2013i.e. Sell orders are not executable)"),

    /**
     * Open for auto execution
     */
    OPEN('Y', "Open for auto execution"),

    /**
     * Closed for auto execution
     */
    CLOSED('N', "Closed for auto execution");

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
            case 'Y' -> Optional.of(OPEN);
            case 'N' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
