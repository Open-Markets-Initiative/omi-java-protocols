package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the options security in the Options Market. The allowable values are:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt in effect
     */
    HALT('H', "Halt in effect"),

    /**
     * Trading on PHLX ®
     */
    TRADING('T', "Trading on PHLX \u00AE"),

    /**
     * Buy Side Trading Suspended/Exhausted –i.e. Buy orders are not executable and Buy side book is non Firm.
     */
    BUY_SIDE_TRADING_SUSPENDED_EXHAUSTED('B', "Buy Side Trading Suspended/Exhausted \u2013i.e. Buy orders are not executable and Buy side book is non Firm."),

    /**
     * Sell Side Trading Suspended/Exhausted –i.e. Sell orders are not executable and Sell side book is non Firm.
     */
    SELL_SIDE_TRADING_SUSPENDED_EXHAUSTED('S', "Sell Side Trading Suspended/Exhausted \u2013i.e. Sell orders are not executable and Sell side book is non Firm.");

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
            case 'B' -> Optional.of(BUY_SIDE_TRADING_SUSPENDED_EXHAUSTED);
            case 'S' -> Optional.of(SELL_SIDE_TRADING_SUSPENDED_EXHAUSTED);
            default -> Optional.empty();
        };
    }
}
