package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums;

/**
 * Trading status identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Trading Halted Across All Us Equity Markets
     */
    TRADING_HALTED_ACROSS_ALL_US_EQUITY_MARKETS('H'),

    /**
     * Trading Halt Released Into An Order Acceptance Period On Iex
     */
    TRADING_HALT_RELEASED_INTO_AN_ORDER_ACCEPTANCE_PERIOD_ON_IEX('O'),

    /**
     * Trading Paused And Order Acceptance Period On Iex
     */
    TRADING_PAUSED_AND_ORDER_ACCEPTANCE_PERIOD_ON_IEX('P'),

    /**
     * Trading On Iex
     */
    TRADING_ON_IEX('T');

    private static final TradingStatus[] BY_WIRE = new TradingStatus[256];

    static {
        for (TradingStatus value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    TradingStatus(char wire) {
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
    public static TradingStatus get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
