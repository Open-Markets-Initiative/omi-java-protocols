package omi.cboe.edgxoptions.multicasttop.spin.v1_2_54.enums;

import java.util.Optional;

/**
 * H = Halted, L = Curb Trading (C1 Only), Q = Quote-Only, R = Opening Rotation, T = RTH Trading.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Curb Trading
     */
    CURB_TRADING('L', "Curb Trading"),

    /**
     * Quote Only
     */
    QUOTE_ONLY('Q', "Quote Only"),

    /**
     * Opening Rotation
     */
    OPENING_ROTATION('R', "Opening Rotation"),

    /**
     * Rth Trading
     */
    RTH_TRADING('T', "Rth Trading");

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
            case 'H' -> Optional.of(HALTED);
            case 'L' -> Optional.of(CURB_TRADING);
            case 'Q' -> Optional.of(QUOTE_ONLY);
            case 'R' -> Optional.of(OPENING_ROTATION);
            case 'T' -> Optional.of(RTH_TRADING);
            default -> Optional.empty();
        };
    }
}
