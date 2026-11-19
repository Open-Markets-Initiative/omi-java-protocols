package omi.cboe.neoequities.crossingfacility.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * Current trading status code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Accepting
     */
    ACCEPTING('A', "Accepting"),

    /**
     * Halted Full
     */
    HALTED_FULL('F', "Halted Full"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Delayed Closing
     */
    DELAYED_CLOSING('M', "Delayed Closing"),

    /**
     * Pre Close
     */
    PRE_CLOSE('O', "Pre Close"),

    /**
     * Post Close
     */
    POST_CLOSE('P', "Post Close"),

    /**
     * Trading Suspended
     */
    TRADING_SUSPENDED('S', "Trading Suspended"),

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Extended Trading
     */
    EXTENDED_TRADING('X', "Extended Trading");

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
            case 'A' -> Optional.of(ACCEPTING);
            case 'F' -> Optional.of(HALTED_FULL);
            case 'H' -> Optional.of(HALTED);
            case 'M' -> Optional.of(DELAYED_CLOSING);
            case 'O' -> Optional.of(PRE_CLOSE);
            case 'P' -> Optional.of(POST_CLOSE);
            case 'S' -> Optional.of(TRADING_SUSPENDED);
            case 'T' -> Optional.of(TRADING);
            case 'X' -> Optional.of(EXTENDED_TRADING);
            default -> Optional.empty();
        };
    }
}
