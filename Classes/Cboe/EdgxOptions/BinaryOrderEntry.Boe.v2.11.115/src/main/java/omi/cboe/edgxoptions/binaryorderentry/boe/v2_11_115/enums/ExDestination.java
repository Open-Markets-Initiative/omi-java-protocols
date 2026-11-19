package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the ExDestination values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

    /**
     * NYSE ARCA
     */
    NYSE_ARCA('A', "NYSE ARCA"),

    /**
     * Nasdaq ISE
     */
    NASDAQ_ISE('E', "Nasdaq ISE"),

    /**
     * MIAX
     */
    MIAX('F', "MIAX"),

    /**
     * MIAX PEARL
     */
    MIAX_PEARL('P', "MIAX PEARL"),

    /**
     * MIAX Emerald
     */
    MIAX_EMERALD('D', "MIAX Emerald"),

    /**
     * EDGX Options
     */
    EDGX_OPTIONS('G', "EDGX Options"),

    /**
     * C2
     */
    C2('H', "C2"),

    /**
     * IEX Options
     */
    IEX_OPTIONS('I', "IEX Options"),

    /**
     * MX2 Options
     */
    MX_2_OPTIONS('J', "MX2 Options"),

    /**
     * BOX
     */
    BOX('K', "BOX"),

    /**
     * MEMX
     */
    MEMX('M', "MEMX"),

    /**
     * Nasdaq
     */
    NASDAQ('N', "Nasdaq"),

    /**
     * Nasdaq Texas
     */
    NASDAQ_TEXAS('S', "Nasdaq Texas"),

    /**
     * NYSE AMERICAN
     */
    NYSE_AMERICAN('U', "NYSE AMERICAN"),

    /**
     * Cboe Options (C1)
     */
    CBOE_OPTIONS('W', "Cboe Options (C1)"),

    /**
     * Nasdaq PHLX
     */
    NASDAQ_PHLX('X', "Nasdaq PHLX"),

    /**
     * BZX Options
     */
    BZX_OPTIONS('Z', "BZX Options"),

    /**
     * Nasdaq GEMX
     */
    NASDAQ_GEMX('g', "Nasdaq GEMX"),

    /**
     * Nasdaq MRX
     */
    NASDAQ_MRX('m', "Nasdaq MRX"),

    /**
     * MIAX Sapphire
     */
    MIAX_SAPPHIRE('w', "MIAX Sapphire");

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
            case 'W' -> Optional.of(CBOE_OPTIONS);
            case 'X' -> Optional.of(NASDAQ_PHLX);
            case 'Z' -> Optional.of(BZX_OPTIONS);
            case 'g' -> Optional.of(NASDAQ_GEMX);
            case 'm' -> Optional.of(NASDAQ_MRX);
            case 'w' -> Optional.of(MIAX_SAPPHIRE);
            default -> Optional.empty();
        };
    }
}
