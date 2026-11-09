package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Option symbol month code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SymbolMonth {

    /**
     * January
     */
    JANUARY('F', "January"),

    /**
     * February
     */
    FEBRUARY('G', "February"),

    /**
     * March
     */
    MARCH('H', "March"),

    /**
     * April
     */
    APRIL('J', "April"),

    /**
     * May
     */
    MAY('K', "May"),

    /**
     * June
     */
    JUNE('M', "June"),

    /**
     * July
     */
    JULY('N', "July"),

    /**
     * August
     */
    AUGUST('Q', "August"),

    /**
     * September
     */
    SEPTEMBER('U', "September"),

    /**
     * October
     */
    OCTOBER('V', "October"),

    /**
     * November
     */
    NOVEMBER('X', "November"),

    /**
     * December
     */
    DECEMBER('Z', "December");

    private final char wire;

    private final String description;

    SymbolMonth(char wire, String description) {
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
    public static Optional<SymbolMonth> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(JANUARY);
            case 'G' -> Optional.of(FEBRUARY);
            case 'H' -> Optional.of(MARCH);
            case 'J' -> Optional.of(APRIL);
            case 'K' -> Optional.of(MAY);
            case 'M' -> Optional.of(JUNE);
            case 'N' -> Optional.of(JULY);
            case 'Q' -> Optional.of(AUGUST);
            case 'U' -> Optional.of(SEPTEMBER);
            case 'V' -> Optional.of(OCTOBER);
            case 'X' -> Optional.of(NOVEMBER);
            case 'Z' -> Optional.of(DECEMBER);
            default -> Optional.empty();
        };
    }
}
