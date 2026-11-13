package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.enums;

/**
 * Price type identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Iex Official Opening Price
     */
    IEX_OFFICIAL_OPENING_PRICE('Q'),

    /**
     * Iex Official Closing Price
     */
    IEX_OFFICIAL_CLOSING_PRICE('M');

    private static final PriceType[] BY_WIRE = new PriceType[256];

    static {
        for (PriceType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    PriceType(char wire) {
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
    public static PriceType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
