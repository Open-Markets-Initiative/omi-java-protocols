package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Expiration Month identifying Call or Put.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpirationMonth {

    /**
     * Call January
     */
    CALL_JANUARY('A', "Call January"),

    /**
     * Call February
     */
    CALL_FEBRUARY('B', "Call February"),

    /**
     * Call March
     */
    CALL_MARCH('C', "Call March"),

    /**
     * Call April
     */
    CALL_APRIL('D', "Call April"),

    /**
     * Call May
     */
    CALL_MAY('E', "Call May"),

    /**
     * Call June
     */
    CALL_JUNE('F', "Call June"),

    /**
     * Call July
     */
    CALL_JULY('G', "Call July"),

    /**
     * Call August
     */
    CALL_AUGUST('H', "Call August"),

    /**
     * Call September
     */
    CALL_SEPTEMBER('I', "Call September"),

    /**
     * Call October
     */
    CALL_OCTOBER('J', "Call October"),

    /**
     * Call November
     */
    CALL_NOVEMBER('K', "Call November"),

    /**
     * Call December
     */
    CALL_DECEMBER('L', "Call December"),

    /**
     * Put January
     */
    PUT_JANUARY('M', "Put January"),

    /**
     * Put February
     */
    PUT_FEBRUARY('N', "Put February"),

    /**
     * Put March
     */
    PUT_MARCH('O', "Put March"),

    /**
     * Put April
     */
    PUT_APRIL('P', "Put April"),

    /**
     * Put May
     */
    PUT_MAY('Q', "Put May"),

    /**
     * Put June
     */
    PUT_JUNE('R', "Put June"),

    /**
     * Put July
     */
    PUT_JULY('S', "Put July"),

    /**
     * Put August
     */
    PUT_AUGUST('T', "Put August"),

    /**
     * Put September
     */
    PUT_SEPTEMBER('U', "Put September"),

    /**
     * Put October
     */
    PUT_OCTOBER('V', "Put October"),

    /**
     * Put November
     */
    PUT_NOVEMBER('W', "Put November"),

    /**
     * Put December
     */
    PUT_DECEMBER('X', "Put December");

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
            case 'A' -> Optional.of(CALL_JANUARY);
            case 'B' -> Optional.of(CALL_FEBRUARY);
            case 'C' -> Optional.of(CALL_MARCH);
            case 'D' -> Optional.of(CALL_APRIL);
            case 'E' -> Optional.of(CALL_MAY);
            case 'F' -> Optional.of(CALL_JUNE);
            case 'G' -> Optional.of(CALL_JULY);
            case 'H' -> Optional.of(CALL_AUGUST);
            case 'I' -> Optional.of(CALL_SEPTEMBER);
            case 'J' -> Optional.of(CALL_OCTOBER);
            case 'K' -> Optional.of(CALL_NOVEMBER);
            case 'L' -> Optional.of(CALL_DECEMBER);
            case 'M' -> Optional.of(PUT_JANUARY);
            case 'N' -> Optional.of(PUT_FEBRUARY);
            case 'O' -> Optional.of(PUT_MARCH);
            case 'P' -> Optional.of(PUT_APRIL);
            case 'Q' -> Optional.of(PUT_MAY);
            case 'R' -> Optional.of(PUT_JUNE);
            case 'S' -> Optional.of(PUT_JULY);
            case 'T' -> Optional.of(PUT_AUGUST);
            case 'U' -> Optional.of(PUT_SEPTEMBER);
            case 'V' -> Optional.of(PUT_OCTOBER);
            case 'W' -> Optional.of(PUT_NOVEMBER);
            case 'X' -> Optional.of(PUT_DECEMBER);
            default -> Optional.empty();
        };
    }
}
