package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt in effect across all US equity exchanges
     */
    HALTED('H', "Halt in effect across all US equity exchanges"),

    /**
     * Paused across all US equity markets and Sros, Nasdaq listed securities only
     */
    PAUSED('P', "Paused across all US equity markets and Sros, Nasdaq listed securities only"),

    /**
     * Quote only period in effect across all US equity exchanges
     */
    QUOTATION_ONLY('Q', "Quote only period in effect across all US equity exchanges"),

    /**
     * Trading on the Nasdaq market
     */
    TRADING('T', "Trading on the Nasdaq market");

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
            case 'H' -> Optional.of(HALTED);
            case 'P' -> Optional.of(PAUSED);
            case 'Q' -> Optional.of(QUOTATION_ONLY);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
