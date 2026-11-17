package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.enums;

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
    ACTIVATED('A'),

    /**
     * Short Sale Price Test Restriction Remains In Effect From Prior Day
     */
    CONTINUED('C'),

    /**
     * Short Sale Price Test Restriction Deactivated
     */
    DEACTIVATED('D'),

    /**
     * Not Available
     */
    NOT_AVAILABLE('N');

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
