package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the ExDestination values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * Nasdaq Texas
     */
    NASDAQ_TEXAS('B', "Nasdaq Texas"),

    /**
     * NYSE National
     */
    NYSE_NATIONAL('C', "NYSE National"),

    /**
     * Texas Stock Exchange
     */
    TEXAS_STOCK_EXCHANGE('F', "Texas Stock Exchange"),

    /**
     * 24X National Exchange
     */
    N2_4X_NATIONAL_EXCHANGE('G', "24X National Exchange"),

    /**
     * MIAX Pearl
     */
    MIAX_PEARL('H', "MIAX Pearl"),

    /**
     * Investors Exchange
     */
    INVESTORS_EXCHANGE('I', "Investors Exchange"),

    /**
     * EDGA
     */
    EDGA('J', "EDGA"),

    /**
     * EDGX
     */
    EDGX('K', "EDGX"),

    /**
     * Long Term Stock Exchange
     */
    LONG_TERM_STOCK_EXCHANGE('L', "Long Term Stock Exchange"),

    /**
     * NYSE Texas
     */
    NYSE_TEXAS('M', "NYSE Texas"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Intelligent Cross (pending approval)
     */
    INTELLIGENT_CROSS('T', "Intelligent Cross (pending approval)"),

    /**
     * MEMX
     */
    MEMX('U', "MEMX"),

    /**
     * Nasdaq PSX
     */
    NASDAQ_PSX('X', "Nasdaq PSX"),

    /**
     * BYX1
     */
    BYX_1('Y', "BYX1"),

    /**
     * BZX1 1Post to Away option available for ROUT and ROUX only. 2Post to EDGX (for ROUT, ROUX, ROUZ, RDOT).
     */
    BZX_1('Z', "BZX1 1Post to Away option available for ROUT and ROUX only. 2Post to EDGX (for ROUT, ROUX, ROUZ, RDOT).");

    private final char wire;

    private final String description;

    ExDestination(char wire, String description) {
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
    public static Optional<ExDestination> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_TEXAS);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'F' -> Optional.of(TEXAS_STOCK_EXCHANGE);
            case 'G' -> Optional.of(N2_4X_NATIONAL_EXCHANGE);
            case 'H' -> Optional.of(MIAX_PEARL);
            case 'I' -> Optional.of(INVESTORS_EXCHANGE);
            case 'J' -> Optional.of(EDGA);
            case 'K' -> Optional.of(EDGX);
            case 'L' -> Optional.of(LONG_TERM_STOCK_EXCHANGE);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'T' -> Optional.of(INTELLIGENT_CROSS);
            case 'U' -> Optional.of(MEMX);
            case 'X' -> Optional.of(NASDAQ_PSX);
            case 'Y' -> Optional.of(BYX_1);
            case 'Z' -> Optional.of(BZX_1);
            default -> Optional.empty();
        };
    }
}
