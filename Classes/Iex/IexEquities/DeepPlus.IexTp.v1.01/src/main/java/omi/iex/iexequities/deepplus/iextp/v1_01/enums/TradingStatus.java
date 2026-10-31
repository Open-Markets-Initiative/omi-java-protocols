package omi.iex.iexequities.deepplus.iextp.v1_01.enums;

import java.util.Optional;

/**
 * Trading status identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Trading Halted Across All Us Equity Markets
     */
    TRADING_HALTED_ACROSS_ALL_US_EQUITY_MARKETS('H', "Trading Halted Across All Us Equity Markets"),

    /**
     * Trading Halt Released Into An Order Acceptance Period On Iex
     */
    TRADING_HALT_RELEASED_INTO_AN_ORDER_ACCEPTANCE_PERIOD_ON_IEX('O', "Trading Halt Released Into An Order Acceptance Period On Iex"),

    /**
     * Trading Paused And Order Acceptance Period On Iex
     */
    TRADING_PAUSED_AND_ORDER_ACCEPTANCE_PERIOD_ON_IEX('P', "Trading Paused And Order Acceptance Period On Iex"),

    /**
     * Trading On Iex
     */
    TRADING_ON_IEX('T', "Trading On Iex");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(TRADING_HALTED_ACROSS_ALL_US_EQUITY_MARKETS);
            case 'O' -> Optional.of(TRADING_HALT_RELEASED_INTO_AN_ORDER_ACCEPTANCE_PERIOD_ON_IEX);
            case 'P' -> Optional.of(TRADING_PAUSED_AND_ORDER_ACCEPTANCE_PERIOD_ON_IEX);
            case 'T' -> Optional.of(TRADING_ON_IEX);
            default -> Optional.empty();
        };
    }
}
