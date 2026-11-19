package omi.pse.pseequities.totalview.itch.v2_3.enums;

import java.util.Optional;

/**
 * Refer to reason in table below.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Reason {

    /**
     * Normal Trading
     */
    NORMAL_TRADING('N', "Normal Trading"),

    /**
     * Suspended By Market Control
     */
    SUSPENDED_BY_MARKET_CONTROL('S', "Suspended By Market Control"),

    /**
     * Frozen due to circuit breaker (dynamic limit)
     */
    FROZEN_DUE_TO_CIRCUIT_BREAKER('F', "Frozen due to circuit breaker (dynamic limit)"),

    /**
     * Halted (intraday auction)
     */
    HALTED('H', "Halted (intraday auction)");

    private final char wire;

    private final String description;

    Reason(char wire, String description) {
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
    public static Optional<Reason> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL_TRADING);
            case 'S' -> Optional.of(SUSPENDED_BY_MARKET_CONTROL);
            case 'F' -> Optional.of(FROZEN_DUE_TO_CIRCUIT_BREAKER);
            case 'H' -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
