package omi.jnx.jnxequities.pts.itch.v1_7.enums;

import java.util.Optional;

/**
 * Current trading state.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Suspended
     */
    SUSPENDED('V', "Suspended");

    private final char wire;

    private final String description;

    TradingState(char wire, String description) {
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
    public static Optional<TradingState> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TRADING);
            case 'V' -> Optional.of(SUSPENDED);
            default -> Optional.empty();
        };
    }
}
