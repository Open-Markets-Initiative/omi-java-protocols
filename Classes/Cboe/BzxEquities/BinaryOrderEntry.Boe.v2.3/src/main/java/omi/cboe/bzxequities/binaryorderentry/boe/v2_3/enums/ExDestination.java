package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Defines the ExDestination values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

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
     * Miax Pearl
     */
    MIAX_PEARL('H', "Miax Pearl"),

    /**
     * Investors Exchange
     */
    INVESTORS_EXCHANGE('I', "Investors Exchange"),

    /**
     * Edga
     */
    EDGA('J', "Edga"),

    /**
     * Edgx
     */
    EDGX('K', "Edgx"),

    /**
     * Long Term Stock Exchange
     */
    LONG_TERM_STOCK_EXCHANGE('L', "Long Term Stock Exchange"),

    /**
     * Chx
     */
    CHX('M', "Chx"),

    /**
     * Nyse
     */
    NYSE('N', "Nyse"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Memx
     */
    MEMX('U', "Memx"),

    /**
     * Nasdaq Psx
     */
    NASDAQ_PSX('X', "Nasdaq Psx"),

    /**
     * Byx
     */
    BYX('Y', "Byx");

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
            case 'B' -> Optional.of(NASDAQ_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'H' -> Optional.of(MIAX_PEARL);
            case 'I' -> Optional.of(INVESTORS_EXCHANGE);
            case 'J' -> Optional.of(EDGA);
            case 'K' -> Optional.of(EDGX);
            case 'L' -> Optional.of(LONG_TERM_STOCK_EXCHANGE);
            case 'M' -> Optional.of(CHX);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'U' -> Optional.of(MEMX);
            case 'X' -> Optional.of(NASDAQ_PSX);
            case 'Y' -> Optional.of(BYX);
            default -> Optional.empty();
        };
    }
}
