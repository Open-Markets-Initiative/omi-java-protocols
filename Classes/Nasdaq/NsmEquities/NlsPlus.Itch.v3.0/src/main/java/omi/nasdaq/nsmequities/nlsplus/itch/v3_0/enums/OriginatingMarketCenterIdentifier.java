package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Denotes the Nasdaq market system that generated the trade report message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginatingMarketCenterIdentifier {

    /**
     * The Nasdaq Stock Market
     */
    NASDAQ('Q', "The Nasdaq Stock Market"),

    /**
     * Nasdaq/FINRA Trade Reporting Facility (TRF) Carteret
     */
    TRF_CARTERET('L', "Nasdaq/FINRA Trade Reporting Facility (TRF) Carteret"),

    /**
     * Nasdaq/FINRA Trade Reporting Facility (TRF) Chicago
     */
    TRF_CHICAGO('2', "Nasdaq/FINRA Trade Reporting Facility (TRF) Chicago"),

    /**
     * Nasdaq BX
     */
    BX('B', "Nasdaq BX"),

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
            case 'Q' -> Optional.of(NASDAQ);
            case 'L' -> Optional.of(TRF_CARTERET);
            case '2' -> Optional.of(TRF_CHICAGO);
            case 'B' -> Optional.of(BX);
            case 'X' -> Optional.of(PSX);
            default -> Optional.empty();
        };
    }
}
