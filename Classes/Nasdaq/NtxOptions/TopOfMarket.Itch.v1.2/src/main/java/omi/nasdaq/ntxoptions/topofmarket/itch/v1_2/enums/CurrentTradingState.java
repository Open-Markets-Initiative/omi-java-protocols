package omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the options security in the options market. The allowable values are:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt in effect
     */
    HALT('H', "Halt in effect"),

    /**
     * Trading on BX
     */
    TRADING('T', "Trading on BX");

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
            default -> Optional.empty();
        };
    }
}
