package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates the current trading state for the stock.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Halted across all U.S. equity markets / SROs
     */
    HALTED('H', "Halted across all U.S. equity markets / SROs"),

    /**
     * Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)
     */
    PAUSED('P', "Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)"),

    /**
     * Quotation only period for cross-SRO halt or pause
     */
    QUOTATION_ONLY('Q', "Quotation only period for cross-SRO halt or pause"),

    /**
     * Trading on Nasdaq Texas
     */
    TRADING('T', "Trading on Nasdaq Texas");

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
            case 'P' -> Optional.of(PAUSED);
            case 'Q' -> Optional.of(QUOTATION_ONLY);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
