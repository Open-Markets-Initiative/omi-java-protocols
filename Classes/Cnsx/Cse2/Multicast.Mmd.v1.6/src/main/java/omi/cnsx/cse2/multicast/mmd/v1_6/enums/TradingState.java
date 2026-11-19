package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Current trading state for symbol (see Trading Action).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Normal Trading
     */
    NORMAL_TRADING('N', "Normal Trading"),

    /**
     * Suspend Trading
     */
    SUSPEND_TRADING('V', "Suspend Trading"),

    /**
     * Halt
     */
    HALT('H', "Halt");

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
            case 'N' -> Optional.of(NORMAL_TRADING);
            case 'V' -> Optional.of(SUSPEND_TRADING);
            case 'H' -> Optional.of(HALT);
            default -> Optional.empty();
        };
    }
}
