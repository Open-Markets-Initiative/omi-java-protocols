package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the EquityTradeVenue values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityTradeVenue {

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
     * Investors Exchange
     */
    INVESTORS_EXCHANGE('I', "Investors Exchange"),

    /**
     * Cboe EDGA Exchange
     */
    CBOE_EDGA_EXCHANGE('J', "Cboe EDGA Exchange"),

    /**
     * Cboe EDGX Exchange
     */
    CBOE_EDGX_EXCHANGE('K', "Cboe EDGX Exchange"),

    /**
     * CHX
     */
    CHX('M', "CHX"),

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
     * Nasdaq PSX
     */
    NASDAQ_PSX('X', "Nasdaq PSX"),

    /**
     * Cboe BYX Exchange
     */
    CBOE_BYX_EXCHANGE('Y', "Cboe BYX Exchange"),

    /**
     * Cboe BZX Exchange
     */
    CBOE_BZX_EXCHANGE('Z', "Cboe BZX Exchange");

    private final char wire;

    private final String description;

    EquityTradeVenue(char wire, String description) {
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
    public static Optional<EquityTradeVenue> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_TEXAS);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'I' -> Optional.of(INVESTORS_EXCHANGE);
            case 'J' -> Optional.of(CBOE_EDGA_EXCHANGE);
            case 'K' -> Optional.of(CBOE_EDGX_EXCHANGE);
            case 'M' -> Optional.of(CHX);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'X' -> Optional.of(NASDAQ_PSX);
            case 'Y' -> Optional.of(CBOE_BYX_EXCHANGE);
            case 'Z' -> Optional.of(CBOE_BZX_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
