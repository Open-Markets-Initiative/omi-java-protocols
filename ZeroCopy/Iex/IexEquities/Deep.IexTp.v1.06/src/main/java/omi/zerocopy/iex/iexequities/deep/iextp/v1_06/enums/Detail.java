package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums;

/**
 * Detail of the Reg. SHO short sale price test restriction status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Detail {

    /**
     * No Price Test In Place
     */
    NO_PRICE_TEST_IN_PLACE(' '),

    /**
     * Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In The Security
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_IN_EFFECT_DUE_TO_AN_INTRADAY_PRICE_DROP_IN_THE_SECURITY('A'),

    /**
     * Short Sale Price Test Restriction Remains In Effect From Prior Day
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_REMAINS_IN_EFFECT_FROM_PRIOR_DAY('C'),

    /**
     * Short Sale Price Test Restriction Deactivated
     */
    SHORT_SALE_PRICE_TEST_RESTRICTION_DEACTIVATED('D'),

    /**
     * Detail Not Available
     */
    DETAIL_NOT_AVAILABLE('N');

    private static final Detail[] BY_WIRE = new Detail[256];

    static {
        for (Detail value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    Detail(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static Detail get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
