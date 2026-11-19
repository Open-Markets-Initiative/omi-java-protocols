package omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Used to specify the designated away venue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

    /**
     * Nyse Arca
     */
    NYSE_ARCA('A', "Nyse Arca"),

    /**
     * Nasdaq Ise
     */
    NASDAQ_ISE('E', "Nasdaq Ise"),

    /**
     * Miax
     */
    MIAX('F', "Miax"),

    /**
     * Miax Pearl
     */
    MIAX_PEARL('P', "Miax Pearl"),

    /**
     * Miax Emerald
     */
    MIAX_EMERALD('D', "Miax Emerald"),

    /**
     * Edgx Options
     */
    EDGX_OPTIONS('G', "Edgx Options"),

    /**
     * C 2
     */
    C2('H', "C 2"),

    /**
     * Iex Options
     */
    IEX_OPTIONS('I', "Iex Options"),

    /**
     * Mx 2 Options
     */
    MX_2_OPTIONS('J', "Mx 2 Options"),

    /**
     * Box
     */
    BOX('K', "Box"),

    /**
     * Memx
     */
    MEMX('M', "Memx"),

    /**
     * Nasdaq
     */
    NASDAQ('N', "Nasdaq"),

    /**
     * Nasdaq Texas
     */
    NASDAQ_TEXAS('S', "Nasdaq Texas"),

    /**
     * Nyse American
     */
    NYSE_AMERICAN('U', "Nyse American"),

    /**
     * Cboe Options C 1
     */
    CBOE_OPTIONS_C1('W', "Cboe Options C 1"),

    /**
     * Nasdaq Phlx
     */
    NASDAQ_PHLX('X', "Nasdaq Phlx"),

    /**
     * Bzx Options
     */
    BZX_OPTIONS('Z', "Bzx Options"),

    /**
     * Nasdaq Gemx
     */
    NASDAQ_GEMX('g', "Nasdaq Gemx"),

    /**
     * Nasdaq Mrx
     */
    NASDAQ_MRX('m', "Nasdaq Mrx"),

    /**
     * Miax Sapphire
     */
    MIAX_SAPPHIRE('w', "Miax Sapphire");

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
            case 'A' -> Optional.of(NYSE_ARCA);
            case 'E' -> Optional.of(NASDAQ_ISE);
            case 'F' -> Optional.of(MIAX);
            case 'P' -> Optional.of(MIAX_PEARL);
            case 'D' -> Optional.of(MIAX_EMERALD);
            case 'G' -> Optional.of(EDGX_OPTIONS);
            case 'H' -> Optional.of(C2);
            case 'I' -> Optional.of(IEX_OPTIONS);
            case 'J' -> Optional.of(MX_2_OPTIONS);
            case 'K' -> Optional.of(BOX);
            case 'M' -> Optional.of(MEMX);
            case 'N' -> Optional.of(NASDAQ);
            case 'S' -> Optional.of(NASDAQ_TEXAS);
            case 'U' -> Optional.of(NYSE_AMERICAN);
            case 'W' -> Optional.of(CBOE_OPTIONS_C1);
            case 'X' -> Optional.of(NASDAQ_PHLX);
            case 'Z' -> Optional.of(BZX_OPTIONS);
            case 'g' -> Optional.of(NASDAQ_GEMX);
            case 'm' -> Optional.of(NASDAQ_MRX);
            case 'w' -> Optional.of(MIAX_SAPPHIRE);
            default -> Optional.empty();
        };
    }
}
