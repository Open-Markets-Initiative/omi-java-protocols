package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the ExDestination values.
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
     * Box
     */
    BOX('K', "Box"),

    /**
     * Nasdaq
     */
    NASDAQ('N', "Nasdaq"),

    /**
     * Nasdaq Bx
     */
    NASDAQ_BX('S', "Nasdaq Bx"),

    /**
     * Nyse American
     */
    NYSE_AMERICAN('U', "Nyse American"),

    /**
     * C 1
     */
    C1('W', "C 1"),

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
    NASDAQ_GEMX('g', "Nasdaq Gemx");

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
            case 'K' -> Optional.of(BOX);
            case 'N' -> Optional.of(NASDAQ);
            case 'S' -> Optional.of(NASDAQ_BX);
            case 'U' -> Optional.of(NYSE_AMERICAN);
            case 'W' -> Optional.of(C1);
            case 'X' -> Optional.of(NASDAQ_PHLX);
            case 'Z' -> Optional.of(BZX_OPTIONS);
            case 'g' -> Optional.of(NASDAQ_GEMX);
            default -> Optional.empty();
        };
    }
}
