package omi.lseg.turquoise.recovery.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Trading Mode
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingMode {

    /**
     * Unscheduled Auction
     */
    UNSCHEDULED_AUCTION('U', "Unscheduled Auction"),

    /**
     * On Demand Auction
     */
    ON_DEMAND_AUCTION('P', "On Demand Auction"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING('2', "Continuous Trading"),

    /**
     * At Market Close Trading
     */
    AT_MARKET_CLOSE_TRADING('3', "At Market Close Trading");

    private final char wire;

    private final String description;

    TradingMode(char wire, String description) {
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
    public static Optional<TradingMode> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(UNSCHEDULED_AUCTION);
            case 'P' -> Optional.of(ON_DEMAND_AUCTION);
            case '2' -> Optional.of(CONTINUOUS_TRADING);
            case '3' -> Optional.of(AT_MARKET_CLOSE_TRADING);
            default -> Optional.empty();
        };
    }
}
