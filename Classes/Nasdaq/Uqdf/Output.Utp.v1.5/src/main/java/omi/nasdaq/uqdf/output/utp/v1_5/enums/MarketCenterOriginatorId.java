package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Market Center Originator ID
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCenterOriginatorId {

    /**
     * Cboe BYX
     */
    BYX('Y', "Cboe BYX"),

    /**
     * Cboe BZX
     */
    BZX('Z', "Cboe BZX"),

    /**
     * Cboe EDGA
     */
    EDGA('J', "Cboe EDGA"),

    /**
     * Cboe EDGX
     */
    EDGX('K', "Cboe EDGX"),

    /**
     * Cboe
     */
    CBOE('W', "Cboe"),

    /**
     * Nasdaq Bx
     */
    BX('B', "Nasdaq Bx"),

    /**
     * Nasdaq Phlx
     */
    PHLX('X', "Nasdaq Phlx"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Nasdaq ISE
     */
    ISE('I', "Nasdaq ISE"),

    /**
     * New York Stock Exchange
     */
    NYSE('N', "New York Stock Exchange"),

    /**
     * NYSE Arca
     */
    ARCA('P', "NYSE Arca"),

    /**
     * NYSE American
     */
    AMERICAN('A', "NYSE American"),

    /**
     * NYSE National
     */
    NATIONAL('C', "NYSE National"),

    /**
     * NYSE Chicago
     */
    CHICAGO('M', "NYSE Chicago"),

    /**
     * Financial Industry Regulatory Authority
     */
    FINRA('D', "Financial Industry Regulatory Authority"),

    /**
     * Investors Exchange
     */
    IEX('V', "Investors Exchange"),

    /**
     * Long Term Stock Exchange
     */
    LTSE('L', "Long Term Stock Exchange"),

    /**
     * MIAX Pearl
     */
    PEARL('H', "MIAX Pearl"),

    /**
     * MEMX
     */
    MEMX('U', "MEMX"),

    /**
     * Market Independent
     */
    MARKET_INDEPENDENT('E', "Market Independent");

    private final char wire;

    private final String description;

    MarketCenterOriginatorId(char wire, String description) {
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
    public static Optional<MarketCenterOriginatorId> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(BYX);
            case 'Z' -> Optional.of(BZX);
            case 'J' -> Optional.of(EDGA);
            case 'K' -> Optional.of(EDGX);
            case 'W' -> Optional.of(CBOE);
            case 'B' -> Optional.of(BX);
            case 'X' -> Optional.of(PHLX);
            case 'Q' -> Optional.of(NASDAQ);
            case 'I' -> Optional.of(ISE);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(ARCA);
            case 'A' -> Optional.of(AMERICAN);
            case 'C' -> Optional.of(NATIONAL);
            case 'M' -> Optional.of(CHICAGO);
            case 'D' -> Optional.of(FINRA);
            case 'V' -> Optional.of(IEX);
            case 'L' -> Optional.of(LTSE);
            case 'H' -> Optional.of(PEARL);
            case 'U' -> Optional.of(MEMX);
            case 'E' -> Optional.of(MARKET_INDEPENDENT);
            default -> Optional.empty();
        };
    }
}
