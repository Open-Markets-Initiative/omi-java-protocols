package omi.siac.opra.output.obi.v6_3_a.enums;

import java.util.Optional;

/**
 * Indicates the expiration month and identifies the option as a Call or a Put.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpirationMonth {

    /**
     * January
     */
    CALL_OPTIONS_JANUARY('A', "January"),

    /**
     * February
     */
    CALL_OPTIONS_FEBRUARY('B', "February"),

    /**
     * March
     */
    CALL_OPTIONS_MARCH('C', "March"),

    /**
     * April
     */
    CALL_OPTIONS_APRIL('D', "April"),

    /**
     * May
     */
    CALL_OPTIONS_MAY('E', "May"),

    /**
     * June
     */
    CALL_OPTIONS_JUNE('F', "June"),

    /**
     * July
     */
    CALL_OPTIONS_JULY('G', "July"),

    /**
     * August
     */
    CALL_OPTIONS_AUGUST('H', "August"),

    /**
     * September
     */
    CALL_OPTIONS_SEPTEMBER('I', "September"),

    /**
     * October
     */
    CALL_OPTIONS_OCTOBER('J', "October"),

    /**
     * November
     */
    CALL_OPTIONS_NOVEMBER('K', "November"),

    /**
     * December
     */
    CALL_OPTIONS_DECEMBER('L', "December"),

    /**
     * January
     */
    PUT_OPTIONS_JANUARY('M', "January"),

    /**
     * February
     */
    PUT_OPTIONS_FEBRUARY('N', "February"),

    /**
     * March
     */
    PUT_OPTIONS_MARCH('O', "March"),

    /**
     * April
     */
    PUT_OPTIONS_APRIL('P', "April"),

    /**
     * May
     */
    PUT_OPTIONS_MAY('Q', "May"),

    /**
     * June
     */
    PUT_OPTIONS_JUNE('R', "June"),

    /**
     * July
     */
    PUT_OPTIONS_JULY('S', "July"),

    /**
     * August
     */
    PUT_OPTIONS_AUGUST('T', "August"),

    /**
     * September
     */
    PUT_OPTIONS_SEPTEMBER('U', "September"),

    /**
     * October
     */
    PUT_OPTIONS_OCTOBER('V', "October"),

    /**
     * November
     */
    PUT_OPTIONS_NOVEMBER('W', "November"),

    /**
     * December
     */
    PUT_OPTIONS_DECEMBER('X', "December");

    private final char wire;

    private final String description;

    ExpirationMonth(char wire, String description) {
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
    public static Optional<ExpirationMonth> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(CALL_OPTIONS_JANUARY);
            case 'B' -> Optional.of(CALL_OPTIONS_FEBRUARY);
            case 'C' -> Optional.of(CALL_OPTIONS_MARCH);
            case 'D' -> Optional.of(CALL_OPTIONS_APRIL);
            case 'E' -> Optional.of(CALL_OPTIONS_MAY);
            case 'F' -> Optional.of(CALL_OPTIONS_JUNE);
            case 'G' -> Optional.of(CALL_OPTIONS_JULY);
            case 'H' -> Optional.of(CALL_OPTIONS_AUGUST);
            case 'I' -> Optional.of(CALL_OPTIONS_SEPTEMBER);
            case 'J' -> Optional.of(CALL_OPTIONS_OCTOBER);
            case 'K' -> Optional.of(CALL_OPTIONS_NOVEMBER);
            case 'L' -> Optional.of(CALL_OPTIONS_DECEMBER);
            case 'M' -> Optional.of(PUT_OPTIONS_JANUARY);
            case 'N' -> Optional.of(PUT_OPTIONS_FEBRUARY);
            case 'O' -> Optional.of(PUT_OPTIONS_MARCH);
            case 'P' -> Optional.of(PUT_OPTIONS_APRIL);
            case 'Q' -> Optional.of(PUT_OPTIONS_MAY);
            case 'R' -> Optional.of(PUT_OPTIONS_JUNE);
            case 'S' -> Optional.of(PUT_OPTIONS_JULY);
            case 'T' -> Optional.of(PUT_OPTIONS_AUGUST);
            case 'U' -> Optional.of(PUT_OPTIONS_SEPTEMBER);
            case 'V' -> Optional.of(PUT_OPTIONS_OCTOBER);
            case 'W' -> Optional.of(PUT_OPTIONS_NOVEMBER);
            case 'X' -> Optional.of(PUT_OPTIONS_DECEMBER);
            default -> Optional.empty();
        };
    }
}
