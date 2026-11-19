package omi.cboe.edgxoptions.multicasttop.pitch.v1_2_64.enums;

import java.util.Optional;

/**
 * C1 Only. H = Halted, Q = Quote-Only, R = Opening Rotation, T = Trading.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum GthTradingStatus {

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

    GthTradingStatus(char wire, String description) {
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
    public static Optional<GthTradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED);
            case 'Q' -> Optional.of(QUOTE_ONLY);
            case 'R' -> Optional.of(OPENING_ROTATION);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
