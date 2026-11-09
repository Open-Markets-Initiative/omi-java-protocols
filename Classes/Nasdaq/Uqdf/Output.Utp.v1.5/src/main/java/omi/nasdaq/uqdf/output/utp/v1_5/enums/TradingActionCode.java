package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Trading Action Code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingActionCode {

    /**
     * Trading Halt
     */
    TRADING_HALT('H', "Trading Halt"),

    /**
     * Quotation Resumption, including after EMA
     */
    QUOTATION_RESUMPTION_INCLUDING_AFTER_EMA('Q', "Quotation Resumption, including after EMA"),

    /**
     * Trading Resumption
     */
    TRADING_RESUMPTION('T', "Trading Resumption"),

    /**
     * Volatility Trading Pause
     */
    VOLATILITY_TRADING_PAUSE('P', "Volatility Trading Pause");

    private final char wire;

    private final String description;

    TradingActionCode(char wire, String description) {
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
    public static Optional<TradingActionCode> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(TRADING_HALT);
            case 'Q' -> Optional.of(QUOTATION_RESUMPTION_INCLUDING_AFTER_EMA);
            case 'T' -> Optional.of(TRADING_RESUMPTION);
            case 'P' -> Optional.of(VOLATILITY_TRADING_PAUSE);
            default -> Optional.empty();
        };
    }
}
