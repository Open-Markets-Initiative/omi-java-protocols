package omi.nasdaq.nsmequities.totalview.asciiitch.v3_1.enums;

import java.util.Optional;

/**
 * Indicates the current trading state for the stock.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Halted or paused across all U.S. equity markets / SROs
     */
    HALTED_OR_PAUSED_ALL_MARKETS('H', "Halted or paused across all U.S. equity markets / SROs"),

    /**
     * Halted or paused on NASDAQ only
     */
    HALTED_OR_PAUSED_NASDAQ_ONLY('V', "Halted or paused on NASDAQ only"),

    /**
     * Quotation only period for cross-SRO halt or pause
     */
    QUOTATION_ONLY_CROSS_SRO('Q', "Quotation only period for cross-SRO halt or pause"),

    /**
     * Quotation only period for NASDAQ only halt or pause
     */
    QUOTATION_ONLY_NASDAQ_ONLY('R', "Quotation only period for NASDAQ only halt or pause"),

    /**
     * Trading on NASDAQ
     */
    TRADING('T', "Trading on NASDAQ");

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
            case 'H' -> Optional.of(HALTED_OR_PAUSED_ALL_MARKETS);
            case 'V' -> Optional.of(HALTED_OR_PAUSED_NASDAQ_ONLY);
            case 'Q' -> Optional.of(QUOTATION_ONLY_CROSS_SRO);
            case 'R' -> Optional.of(QUOTATION_ONLY_NASDAQ_ONLY);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
