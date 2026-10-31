package omi.iex.iexequities.tops.iextp.v1_64.enums;

import java.util.Optional;

/**
 * Detail of the Reg. SHO short sale price test restriction status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Detail {

    /**
     * No Price Test In Place
     */
    NO_PRICE_TEST_IN_PLACE(' ', "No Price Test In Place"),

    /**
     * Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In The Security
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_IN_EFFECT_DUE_TO_AN_INTRADAY_PRICE_DROP_IN_THE_SECURITY('A', "Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In The Security"),

    /**
     * Short Sale Price Test Restriction Remains In Effect From Prior Day
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_REMAINS_IN_EFFECT_FROM_PRIOR_DAY('C', "Short Sale Price Test Restriction Remains In Effect From Prior Day"),

    /**
     * Short Sale Price Test Restriction Deactivated
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_DEACTIVATED('D', "Short Sale Price Test Restriction Deactivated"),

    /**
     * Detail Not Available
     */
    DETAIL_NOT_AVAILABLE('N', "Detail Not Available");

    private final char wire;

    private final String description;

    Detail(char wire, String description) {
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
    public static Optional<Detail> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_PRICE_TEST_IN_PLACE);
            case 'A' -> Optional.of(SHORT_SALE_PRICE_TEST_RESTRICTION_IN_EFFECT_DUE_TO_AN_INTRADAY_PRICE_DROP_IN_THE_SECURITY);
            case 'C' -> Optional.of(SHORT_SALE_PRICE_TEST_RESTRICTION_REMAINS_IN_EFFECT_FROM_PRIOR_DAY);
            case 'D' -> Optional.of(SHORT_SALE_PRICE_TEST_RESTRICTION_DEACTIVATED);
            case 'N' -> Optional.of(DETAIL_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
