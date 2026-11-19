package omi.nasdaq.psxequities.totalview.glimpse.v4_1.enums;

import java.util.Optional;

/**
 * Indicates the trading state for the issue at the time of the GLIMPSE transmission.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingState {

    /**
     * Halted/Paused across all U.S. equity markets
     */
    HALTED_OR_PAUSED_ACROSS_ALL_US_EQUITY_MARKETS('H', "Halted/Paused across all U.S. equity markets"),

    /**
     * Quotation only period for cross-market halt or pause
     */
    QUOTATION_ONLY_PERIOD('Q', "Quotation only period for cross-market halt or pause"),

    /**
     * Trading on PSX
     */
    TRADING_ON_PSX('T', "Trading on PSX");

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
            case 'H' -> Optional.of(HALTED_OR_PAUSED_ACROSS_ALL_US_EQUITY_MARKETS);
            case 'Q' -> Optional.of(QUOTATION_ONLY_PERIOD);
            case 'T' -> Optional.of(TRADING_ON_PSX);
            default -> Optional.empty();
        };
    }
}
