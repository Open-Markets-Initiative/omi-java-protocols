package omi.nasdaq.psxequities.bbo.itch.v2_1_2017.enums;

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
    HALTED_OR_PAUSED_ON_NASDAQ_AND_ALL_UTP_PARTICIPANTS('H', "Halted/Paused on Nasdaq and all UTP participants"),

    /**
     * Quotation only period for cross-SRO halt or pause
     */
    QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE('Q', "Quotation only period for cross-SRO halt or pause"),

    /**
     * Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)
     */
    PAUSED_ACROSS_ALL_US_EQUITY_MARKETS('P', "Paused across all U.S. equity markets / SROs (Nasdaq-listed securities only)"),

    /**
     * Trading on PSX
     */
    TRADING_ON_PSX('T', "Trading on PSX");

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
            case 'H' -> Optional.of(HALTED_OR_PAUSED_ON_NASDAQ_AND_ALL_UTP_PARTICIPANTS);
            case 'Q' -> Optional.of(QUOTATION_ONLY_PERIOD_FOR_CROSS_SRO_HALT_OR_PAUSE);
            case 'P' -> Optional.of(PAUSED_ACROSS_ALL_US_EQUITY_MARKETS);
            case 'T' -> Optional.of(TRADING_ON_PSX);
            default -> Optional.empty();
        };
    }
}
