package omi.cboe.cxjequities.multicastdepthofbook.spin.v1_0_6.enums;

import java.util.Optional;

/**
 * Trading status of the session for the symbol.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Halted In Pre Open
     */
    HALTED_IN_PRE_OPEN('h', "Halted In Pre Open");

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
            case 'C' -> Optional.of(CLOSED);
            case 'T' -> Optional.of(TRADING);
            case 'H' -> Optional.of(HALTED);
            case 'h' -> Optional.of(HALTED_IN_PRE_OPEN);
            default -> Optional.empty();
        };
    }
}
