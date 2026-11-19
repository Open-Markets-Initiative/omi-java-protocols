package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.enums;

import java.util.Optional;

/**
 * Trading halt status indicator.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HaltStatus {

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Quote Only
     */
    QUOTE_ONLY('Q', "Quote Only"),

    /**
     * Opening Rotation
     */
    OPENING_ROTATION('R', "Opening Rotation"),

    /**
     * Trading
     */
    TRADING('T', "Trading");

    private final char wire;

    private final String description;

    HaltStatus(char wire, String description) {
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
    public static Optional<HaltStatus> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED);
            case 'Q' -> Optional.of(QUOTE_ONLY);
            case 'R' -> Optional.of(OPENING_ROTATION);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
