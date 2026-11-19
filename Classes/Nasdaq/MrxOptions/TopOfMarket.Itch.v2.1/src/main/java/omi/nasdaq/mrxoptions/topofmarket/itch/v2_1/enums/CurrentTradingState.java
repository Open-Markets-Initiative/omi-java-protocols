package omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the options security in the options market.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Buy Side Suspended
     */
    BUY_SIDE_SUSPENDED('B', "Buy Side Suspended"),

    /**
     * Sell-Side Suspended
     */
    SELL_SIDE_SUSPENDED('S', "Sell-Side Suspended"),

    /**
     * Halt in Effect
     */
    HALT_IN_EFFECT('H', "Halt in Effect"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('T', "Continuous Trading"),

    /**
     * Pre-Open
     */
    PRE_OPEN('I', "Pre-Open"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Re-Opening
     */
    RE_OPENING('R', "Re-Opening"),

    /**
     * Closed
     */
    CLOSED('X', "Closed");

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
            case 'B' -> Optional.of(BUY_SIDE_SUSPENDED);
            case 'S' -> Optional.of(SELL_SIDE_SUSPENDED);
            case 'H' -> Optional.of(HALT_IN_EFFECT);
            case 'T' -> Optional.of(CONTINUOUS_TRADING);
            case 'I' -> Optional.of(PRE_OPEN);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'R' -> Optional.of(RE_OPENING);
            case 'X' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
