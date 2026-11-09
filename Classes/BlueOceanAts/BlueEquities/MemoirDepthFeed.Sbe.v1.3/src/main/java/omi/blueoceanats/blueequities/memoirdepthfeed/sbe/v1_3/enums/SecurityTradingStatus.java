package omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The current trading state
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Paused
     */
    PAUSED('P', "Paused"),

    /**
     * Quoting
     */
    QUOTING('Q', "Quoting"),

    /**
     * Trading
     */
    TRADING('T', "Trading");

    private final char wire;

    private final String description;

    SecurityTradingStatus(char wire, String description) {
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
    public static Optional<SecurityTradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED);
            case 'P' -> Optional.of(PAUSED);
            case 'Q' -> Optional.of(QUOTING);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
