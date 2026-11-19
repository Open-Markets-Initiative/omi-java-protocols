package omi.cboe.matchnow.multicasttrades.pitch.v1_0_13.enums;

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
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Trading Suspended
     */
    TRADING_SUSPENDED('S', "Trading Suspended"),

    /**
     * Trading
     */
    TRADING('T', "Trading");

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
            case 'H' -> Optional.of(HALTED);
            case 'S' -> Optional.of(TRADING_SUSPENDED);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
