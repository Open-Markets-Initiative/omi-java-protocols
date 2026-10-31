package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halted/Paused on Nasdaq and all UTP participants
     */
    HALTED_PAUSED('H', "Halted/Paused on Nasdaq and all UTP participants"),

    /**
     * Quotation only period for cross-SRO halt or pause
     */
    QUOTATION_ONLY('Q', "Quotation only period for cross-SRO halt or pause"),

    /**
     * Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)
     */
    PAUSED('P', "Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)"),

    /**
     * Trading on Nasdaq Market
     */
    TRADING('T', "Trading on Nasdaq Market");

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
            case 'H' -> Optional.of(HALTED_PAUSED);
            case 'Q' -> Optional.of(QUOTATION_ONLY);
            case 'P' -> Optional.of(PAUSED);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
