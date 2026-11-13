package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.enums;

/**
 * Retail Liquidity Indicator identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailLiquidityIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' '),

    /**
     * Buy Interest
     */
    BUY_INTEREST('A'),

    /**
     * Sell Interest
     */
    SELL_INTEREST('B'),

    /**
     * Buy And Sell Interest
     */
    BUY_AND_SELL_INTEREST('C');

    private static final RetailLiquidityIndicator[] BY_WIRE = new RetailLiquidityIndicator[256];

    static {
        for (RetailLiquidityIndicator value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    RetailLiquidityIndicator(char wire) {
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
    public static RetailLiquidityIndicator get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
