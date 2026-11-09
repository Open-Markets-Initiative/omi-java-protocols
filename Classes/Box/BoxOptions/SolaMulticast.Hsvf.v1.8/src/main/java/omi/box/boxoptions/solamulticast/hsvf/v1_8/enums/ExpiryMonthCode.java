package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Delivery month for the contract
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExpiryMonthCode {

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
    NOVEMBER_PUT('W', "November Put");

    private final char wire;

    private final String description;

    ExpiryMonthCode(char wire, String description) {
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
    public static Optional<ExpiryMonthCode> fromWire(char wire) {
        return switch (wire) {
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
            default -> Optional.empty();
        };
    }
}
