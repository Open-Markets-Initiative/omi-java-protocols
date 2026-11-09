package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Option expiry month code Refer to Month Codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpiryMonth {

    /**
     * January Call
     */
    JANUARY_CALL('A', "January Call"),

    /**
     * February Call
     */
    FEBRUARY_CALL('B', "February Call"),

    /**
     * March Call
     */
    MARCH_CALL('C', "March Call"),

    /**
     * April Call
     */
    APRIL_CALL('D', "April Call"),

    /**
     * May Call
     */
    MAY_CALL('E', "May Call"),

    /**
     * June Call
     */
    JUNE_CALL('F', "June Call"),

    /**
     * July Call
     */
    JULY_CALL('G', "July Call"),

    /**
     * August Call
     */
    AUGUST_CALL('H', "August Call"),

    /**
     * September Call
     */
    SEPTEMBER_CALL('I', "September Call"),

    /**
     * October Call
     */
    OCTOBER_CALL('J', "October Call"),

    /**
     * November Call
     */
    NOVEMBER_CALL('K', "November Call"),

    /**
     * December Call
     */
    DECEMBER_CALL('L', "December Call"),

    /**
     * January Put
     */
    JANUARY_PUT('M', "January Put"),

    /**
     * February Put
     */
    FEBRUARY_PUT('N', "February Put"),

    /**
     * March Put
     */
    MARCH_PUT('O', "March Put"),

    /**
     * April Put
     */
    APRIL_PUT('P', "April Put"),

    /**
     * May Put
     */
    MAY_PUT('Q', "May Put"),

    /**
     * June Put
     */
    JUNE_PUT('R', "June Put"),

    /**
     * July Put
     */
    JULY_PUT('S', "July Put"),

    /**
     * August Put
     */
    AUGUST_PUT('T', "August Put"),

    /**
     * September Put
     */
    SEPTEMBER_PUT('U', "September Put"),

    /**
     * October Put
     */
    OCTOBER_PUT('V', "October Put"),

    /**
     * November Put
     */
    NOVEMBER_PUT('W', "November Put"),

    /**
     * December Put
     */
    DECEMBER_PUT('X', "December Put");

    private final char wire;

    private final String description;

    ExpiryMonth(char wire, String description) {
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
    public static Optional<ExpiryMonth> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(JANUARY_CALL);
            case 'B' -> Optional.of(FEBRUARY_CALL);
            case 'C' -> Optional.of(MARCH_CALL);
            case 'D' -> Optional.of(APRIL_CALL);
            case 'E' -> Optional.of(MAY_CALL);
            case 'F' -> Optional.of(JUNE_CALL);
            case 'G' -> Optional.of(JULY_CALL);
            case 'H' -> Optional.of(AUGUST_CALL);
            case 'I' -> Optional.of(SEPTEMBER_CALL);
            case 'J' -> Optional.of(OCTOBER_CALL);
            case 'K' -> Optional.of(NOVEMBER_CALL);
            case 'L' -> Optional.of(DECEMBER_CALL);
            case 'M' -> Optional.of(JANUARY_PUT);
            case 'N' -> Optional.of(FEBRUARY_PUT);
            case 'O' -> Optional.of(MARCH_PUT);
            case 'P' -> Optional.of(APRIL_PUT);
            case 'Q' -> Optional.of(MAY_PUT);
            case 'R' -> Optional.of(JUNE_PUT);
            case 'S' -> Optional.of(JULY_PUT);
            case 'T' -> Optional.of(AUGUST_PUT);
            case 'U' -> Optional.of(SEPTEMBER_PUT);
            case 'V' -> Optional.of(OCTOBER_PUT);
            case 'W' -> Optional.of(NOVEMBER_PUT);
            case 'X' -> Optional.of(DECEMBER_PUT);
            default -> Optional.empty();
        };
    }
}
