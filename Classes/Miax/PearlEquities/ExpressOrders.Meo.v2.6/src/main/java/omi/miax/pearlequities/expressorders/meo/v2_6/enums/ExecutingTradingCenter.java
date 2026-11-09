package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Exchange at which trade was executed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutingTradingCenter {

    /**
     * Nyse American
     */
    NYSE_AMERICAN('A', "Nyse American"),

    /**
     * Nasdaq Bx
     */
    NASDAQ_BX('B', "Nasdaq Bx"),

    /**
     * Nyse National
     */
    NYSE_NATIONAL('C', "Nyse National"),

    /**
     * Miax Pearl Equities
     */
    MIAX_PEARL_EQUITIES('H', "Miax Pearl Equities"),

    /**
     * Nasdaq Ise
     */
    NASDAQ_ISE('I', "Nasdaq Ise"),

    /**
     * Cboe Edga Exchange
     */
    CBOE_EDGA_EXCHANGE('J', "Cboe Edga Exchange"),

    /**
     * Cboe Edgx Exchange
     */
    CBOE_EDGX_EXCHANGE('K', "Cboe Edgx Exchange"),

    /**
     * Long Term Stock Exchange
     */
    LONG_TERM_STOCK_EXCHANGE('L', "Long Term Stock Exchange"),

    /**
     * Nyse Chicago
     */
    NYSE_CHICAGO('M', "Nyse Chicago"),

    /**
     * New York Stock Exchange
     */
    NEW_YORK_STOCK_EXCHANGE('N', "New York Stock Exchange"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Members Exchange
     */
    MEMBERS_EXCHANGE('U', "Members Exchange"),

    /**
     * Investors Exchange
     */
    INVESTORS_EXCHANGE('V', "Investors Exchange"),

    /**
     * Nasdaq Phlx
     */
    NASDAQ_PHLX('X', "Nasdaq Phlx"),

    /**
     * Cboe Byx Exchange
     */
    CBOE_BYX_EXCHANGE('Y', "Cboe Byx Exchange"),

    /**
     * Cboe Bzx Exchange
     */
    CBOE_BZX_EXCHANGE('Z', "Cboe Bzx Exchange");

    private final char wire;

    private final String description;

    ExecutingTradingCenter(char wire, String description) {
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
    public static Optional<ExecutingTradingCenter> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'H' -> Optional.of(MIAX_PEARL_EQUITIES);
            case 'I' -> Optional.of(NASDAQ_ISE);
            case 'J' -> Optional.of(CBOE_EDGA_EXCHANGE);
            case 'K' -> Optional.of(CBOE_EDGX_EXCHANGE);
            case 'L' -> Optional.of(LONG_TERM_STOCK_EXCHANGE);
            case 'M' -> Optional.of(NYSE_CHICAGO);
            case 'N' -> Optional.of(NEW_YORK_STOCK_EXCHANGE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'U' -> Optional.of(MEMBERS_EXCHANGE);
            case 'V' -> Optional.of(INVESTORS_EXCHANGE);
            case 'X' -> Optional.of(NASDAQ_PHLX);
            case 'Y' -> Optional.of(CBOE_BYX_EXCHANGE);
            case 'Z' -> Optional.of(CBOE_BZX_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
