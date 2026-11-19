package omi.nasdaq.nsmequities.nlsplus.itch.v5_0.enums;

import java.util.Optional;

/**
 * Denotes the Nasdaq market system that generated the trade report message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginatingMarketCenterIdentifier {

    /**
     * Nasdaq Core session (pre market, regular and post market hours)
     */
    NASDAQ_CORE('Q', "Nasdaq Core session (pre market, regular and post market hours)"),

    /**
     * Nasdaq Extended session (9:00 PM to 4:00 AM ET)
     */
    NASDAQ_EXTENDED('q', "Nasdaq Extended session (9:00 PM to 4:00 AM ET)"),

    /**
     * Nasdaq/FINRA Trade Reporting Facility (TRF) Carteret
     */
    TRF_CARTERET('L', "Nasdaq/FINRA Trade Reporting Facility (TRF) Carteret"),

    /**
     * Nasdaq/FINRA Trade Reporting Facility (TRF) Chicago
     */
    TRF_CHICAGO('2', "Nasdaq/FINRA Trade Reporting Facility (TRF) Chicago"),

    /**
     * Nasdaq Texas
     */
    NASDAQ_TEXAS('B', "Nasdaq Texas"),

    /**
     * Nasdaq PSX
     */
    PSX('X', "Nasdaq PSX");

    private final char wire;

    private final String description;

    OriginatingMarketCenterIdentifier(char wire, String description) {
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
    public static Optional<OriginatingMarketCenterIdentifier> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(NASDAQ_CORE);
            case 'q' -> Optional.of(NASDAQ_EXTENDED);
            case 'L' -> Optional.of(TRF_CARTERET);
            case '2' -> Optional.of(TRF_CHICAGO);
            case 'B' -> Optional.of(NASDAQ_TEXAS);
            case 'X' -> Optional.of(PSX);
            default -> Optional.empty();
        };
    }
}
