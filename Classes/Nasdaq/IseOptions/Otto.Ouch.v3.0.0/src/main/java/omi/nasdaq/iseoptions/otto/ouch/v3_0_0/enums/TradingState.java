package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * H=Halted, T=Trading. At the start of day all instruments are assumed to be Trading unless notified as Halted by this message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Trading
     */
    TRADING('T', "Trading");

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
            case 'H' -> Optional.of(HALTED);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
