package omi.siac.opra.output.obi.v6_2.enums;

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
    JANUARY_CALL('A', "January"),

    /**
     * January
     */
    JANUARY_PUT('M', "January"),

    /**
     * February
     */
    FEBRUARY_CALL('B', "February"),

    /**
     * February
     */
    FEBRUARY_PUT('N', "February"),

    /**
     * March
     */
    MARCH_CALL('C', "March"),

    /**
     * March
     */
    MARCH_PUT('O', "March"),

    /**
     * April
     */
    APRIL_CALL('D', "April"),

    /**
     * April
     */
    APRIL_PUT('P', "April"),

    /**
     * May
     */
    MAY_CALL('E', "May"),

    /**
     * May
     */
    MAY_PUT('Q', "May"),

    /**
     * June
     */
    JUNE_CALL('F', "June"),

    /**
     * June
     */
    JUNE_PUT('R', "June"),

    /**
     * July
     */
    JULY_CALL('G', "July"),

    /**
     * July
     */
    JULY_PUT('S', "July"),

    /**
     * August
     */
    AUGUST_CALL('H', "August"),

    /**
     * August
     */
    AUGUST_PUT('T', "August"),

    /**
     * September
     */
    SEPTEMBER_CALL('I', "September"),

    /**
     * September
     */
    SEPTEMBER_PUT('U', "September"),

    /**
     * October
     */
    OCTOBER_CALL('J', "October"),

    /**
     * October
     */
    OCTOBER_PUT('V', "October"),

    /**
     * November
     */
    NOVEMBER_CALL('K', "November"),

    /**
     * November
     */
    NOVEMBER_PUT('W', "November"),

    /**
     * December
     */
    DECEMBER_CALL('L', "December"),

    /**
     * December
     */
    DECEMBER_PUT('X', "December");

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
            case 'A' -> Optional.of(JANUARY_CALL);
            case 'M' -> Optional.of(JANUARY_PUT);
            case 'B' -> Optional.of(FEBRUARY_CALL);
            case 'N' -> Optional.of(FEBRUARY_PUT);
            case 'C' -> Optional.of(MARCH_CALL);
            case 'O' -> Optional.of(MARCH_PUT);
            case 'D' -> Optional.of(APRIL_CALL);
            case 'P' -> Optional.of(APRIL_PUT);
            case 'E' -> Optional.of(MAY_CALL);
            case 'Q' -> Optional.of(MAY_PUT);
            case 'F' -> Optional.of(JUNE_CALL);
            case 'R' -> Optional.of(JUNE_PUT);
            case 'G' -> Optional.of(JULY_CALL);
            case 'S' -> Optional.of(JULY_PUT);
            case 'H' -> Optional.of(AUGUST_CALL);
            case 'T' -> Optional.of(AUGUST_PUT);
            case 'I' -> Optional.of(SEPTEMBER_CALL);
            case 'U' -> Optional.of(SEPTEMBER_PUT);
            case 'J' -> Optional.of(OCTOBER_CALL);
            case 'V' -> Optional.of(OCTOBER_PUT);
            case 'K' -> Optional.of(NOVEMBER_CALL);
            case 'W' -> Optional.of(NOVEMBER_PUT);
            case 'L' -> Optional.of(DECEMBER_CALL);
            case 'X' -> Optional.of(DECEMBER_PUT);
            default -> Optional.empty();
        };
    }
}
