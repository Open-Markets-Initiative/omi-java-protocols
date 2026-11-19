package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026_2.enums;

import java.util.Optional;

/**
 * Current trading state for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halted Across All Us Equity Markets Sr Os
     */
    HALTED_ACROSS_ALL_US_EQUITY_MARKETS_SR_OS('H', "Halted Across All Us Equity Markets Sr Os"),

    /**
     * Nasdaq-listed securities only
     */
    PAUSED_ACROSS_ALL_US_EQUITY_MARKETS_SR_OS('P', "Nasdaq-listed securities only"),

    /**
     * Quotation Only Period For Cross Sro Halt Or Pause
     */
    QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE('Q', "Quotation Only Period For Cross Sro Halt Or Pause"),

    /**
     * Trading On Nasdaq
     */
    TRADING_ON_NASDAQ('T', "Trading On Nasdaq");

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
            case 'H' -> Optional.of(HALTED_ACROSS_ALL_US_EQUITY_MARKETS_SR_OS);
            case 'P' -> Optional.of(PAUSED_ACROSS_ALL_US_EQUITY_MARKETS_SR_OS);
            case 'Q' -> Optional.of(QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE);
            case 'T' -> Optional.of(TRADING_ON_NASDAQ);
            default -> Optional.empty();
        };
    }
}
